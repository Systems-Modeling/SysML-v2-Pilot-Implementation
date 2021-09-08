/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019, 2020 Model Driven Solutions, Inc.
 * Copyright (c) 2021 Twingineer LLC
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 *  Ivan Gomes
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.util;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;

import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.traversal.facade.impl.ApiElementProcessingFacade;

/**
 * This is a utility for traversing a SysML model graph and saving each Element that is 
 * visited to a repository using the SysML v2 REST API.
 * 
 * @author Ed Seidewitz
 *
 */
public class KerMLRepositorySaveUtil extends KerMLTraversalUtil {
	
	private String basePath = ApiElementProcessingFacade.DEFAULT_BASE_PATH;
	private String libraryPath = null;
	private boolean isAddImplicitGeneralizations = false;
	private String projectName;
	
	public KerMLRepositorySaveUtil() {
		super();
		this.setVerbose(false);
	}
	
	/**
	 * Return the identifier for the repository Project to which Elements and Relationships were
	 * saved. (Available after processing.)
	 * 
	 * @return	A string representation of the UUID of the Project in the repository
	 */
	public String getProjectId() {
		return ((ApiElementProcessingFacade)this.traversal.getFacade()).getProjectId();
	}
	
	/**
	 * Return the base path for API access. This is either as set via the command line "-b" option or,
	 * otherwise, is the ApiElementProcessFacade default.
	 * 
	 * @return
	 */
	public String getBasePath() {
		return this.basePath;
	}
	
	/**
	 * Get the library path that was set via command line "-l" option (if any).
	 * 
	 * @return	the optional library path
	 */
	public String getLibraryPath() {
		return this.libraryPath;
	}
	
	/**
	 * Get the project name that was set from the command line argument.
	 * 
	 * @return
	 */
	public String getProjectName() {
		return this.projectName;
	}
	
	/**
	 * Process the command line arguments:
	 * <ul>
	 * <li> Set the base path if the "-b" option is present.</li>
	 * <li> Set the library path if the "-l" option is present.</li>
	 * <li> Set flag to add implicit generalizations if the "-g" option is present.</li>
	 * <li> Set flag for verbose mode if the "-v" option is present.</li>
	 * <li> Return the list of arguments with any options removed and the
	 *      library path (if any) prepended to all arguments other than the
	 *      first.</li>
	 * </ul>
	 * 
	 * @param 	args		the original command line arguments
	 * @return	the arguments without any options and with the library path (if given)
	 *          prepended to arguments for library model files.
	 */
	protected String[] processArgs(String[] args) {
		int n = args.length;
		if (n > 0) {
			int i = 0;
			while(("-b".equals(args[i]) || "-l".equals(args[i]) || "-g".equals(args[i]) || "-v".equals(args[i])) && 
					i + 1 < n) {
				if ("-b".equals(args[i])) {
					this.basePath = args[++i];
				} else if ("-l".equals(args[i])) {
					this.libraryPath = args[++i];
					if (!libraryPath.endsWith("/")) {
						libraryPath += "/";
					}
				} else if ("-g".equals(args[i])) {
					this.isAddImplicitGeneralizations = true;
				} else if ("-v".equals(args[i])) {
					this.isVerbose = true;
				}
				i++;
			}
			if (i < n) {
				args = Arrays.copyOfRange(args, i, n);
				
				if (this.libraryPath != null) {
					for (int k = 1; k < args.length; k++) {
						args[k] = this.libraryPath + args[k];
					}
				}
				
				return args;
			}
		}
		return null;
	}
	
	/**
	 * Initialize the traversal with an ApiProcessingFacade to write to a new repository Project.
	 * Set the project name as the file name from the first argument after any options, stripped 
	 * of its extension, with the current date/time appended.
	 * 
	 * @param 	args		the command line arguments after processing, with options removed
	 */
	protected void initialize(String[] args)  {
		String libraryPath = this.getLibraryPath();
		if (libraryPath != null) {
			SysMLLibraryUtil.setModelLibraryDirectory(libraryPath);
		}
		
		this.projectName = Paths.get(args[0]).getFileName().toString();
		int j = this.projectName.indexOf('.');
		if (j >= 0) {
			this.projectName = this.projectName.substring(0, j);
		}
		this.projectName += " " + new Date();
		
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(this.projectName, this.getBasePath());	
		processingFacade.setTraversal(this.initialize(processingFacade));
		processingFacade.setIsVerbose(this.isVerbose);
	}
	
	/**
	 * Traverse the model and then commit the change set of ElementVersions so obtained.
	 */
	@Override
	public void process() {
		super.process();
		((ApiElementProcessingFacade)this.traversal.getFacade()).commit();
	}
	
	/**
	 * Run the traversal for the given main program arguments.
	 * 
	 * @param 	args		the array of main program arguments
	 */
	public void run(String[] args) {
		args = this.processArgs(args);
		
		if (args != null) {
			
			System.out.println("Saving " + args[0] + "...");
			
			this.initialize(args);				
			this.read(args);
			
			System.out.println("Transforming" + 
					(this.isAddImplicitGeneralizations? " (adding implicit generalizations)... ": "..."));
			ElementUtil.transformAll(this.resourceSet, this.isAddImplicitGeneralizations);
			
			System.out.println("\nBase path is " + this.getBasePath());
			System.out.println();
			
			this.process();
			System.out.println("Saved to Project (" + this.getProjectName() + ") " + this.getProjectId());
			System.out.println();
		}
	}

	/**
	 * The main program reads the KerML resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only saved to the repository if they are referenced
	 * from an input resource or are directly or indirectly related to another Element so referenced.
	 * 
	 * <p>Usage:
	 * 
	 * <p>KerMLRepositorySaveUtil [-b base-path-url] [-l library-base-path] [-g] [-v] input-path [library-path library-path...]
	 * 
	 * <p>where:
	 * 
	 * <ul>
	 * <li>-b base-path-url       gives the URL for the base path to be used for the API endpoint (if none is given, the default is used)</li>
	 * <li>-l library-base-path   gives the base path to used for reading model library resources</li>
	 * <li>-g                     specifies that implicit generalizations should be generated (the default is not to)</li>
	 * <li>-v                     specifies verbose mode (the default is non-verbose)</li>
	 * <li>input-path             is a path for reading input resources</li>
	 * <li>library-paths          are paths for reading library resources, relative to the library-base-path (if one is given)</li>
	 * </ul>
	 * 
	 */
	public static void main(String[] args) {
		try {
			new KerMLRepositorySaveUtil().run(args);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
