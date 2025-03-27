/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2022 Model Driven Solutions, Inc.
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

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.traversal.facade.impl.ApiElementProcessingFacade;

/**
 * This is a utility for traversing a SysML model graph and saving each Element that is 
 * visited to a repository using the SysML v2 REST API.
 * 
 * @author Ed Seidewitz
 *
 */
public class KerMLRepositorySaveUtil extends KerMLTraversalUtil {
	
	public static final String BASE_PATH_OPTION_LONG_NAME = "base-path-url";
	public static final String LIBRARY_OPTION_LONG_NAME = "library-base-path";
	public static final String BRANCH_OPTION = "Project branch to use. If none given the default branch of the project is used";
	public static final String PROJECT_NAME_OPTION_DESCRIPTION = "project name to upload the model into. If not specified a unique name is generated based on the selected folders and the current timestamp";
	public static final String DERIVED_OPTION_DESCRIPTION = "specifies that derived attributes should be included (the default is not to)";
	public static final String IMPLICIT_GEN_OPTION_DESCRIPTION = "specifies that implicit generalizations should be generated (the default is not to)";
	public static final String VERBOSE_MODE_OPTION_DESCRIPTION = "verbose mode";
	public static final String BASE_PATH_OPTION_DESCRIPTION = "gives the URL for the base path to be used for the API endpoint (if none is given, the default is used)";
	public static final String LIBRARY_OPTION_DESCRIPTION = "gives the base path to used for reading model library resources";
	
	private String basePath = ApiElementProcessingFacade.DEFAULT_BASE_PATH;
	private String libraryPath = null;
	private boolean isAddDerivedElements = false;
	private boolean isAddImplicitElements = false;
	private String projectName;
	private String branchName; 
	private boolean isCommitted = false;
	
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
	 * Return whether the commit succeeded after traversal of the model.
	 * @return
	 */
	public boolean isCommitted() {
		return this.isCommitted;
	}
	
	/**
	 * Process the command line arguments:
	 * <ul>
	 * <li> Set the base path if the "-b" option is present.</li>
	 * <li> Set the library path if the "-l" option is present.</li>
	 * <li> Set flag to add implicit elements if the "-g" option is present.</li>
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
		var libraryPathOption = new Option("l", LIBRARY_OPTION_LONG_NAME, true, LIBRARY_OPTION_DESCRIPTION);
		var basePathOption = new Option("b", BASE_PATH_OPTION_LONG_NAME, true, BASE_PATH_OPTION_DESCRIPTION);
		var isVerboseOption = new Option("v", false, VERBOSE_MODE_OPTION_DESCRIPTION);
		var addImplicitsOption = new Option("g", IMPLICIT_GEN_OPTION_DESCRIPTION);
		var addDerivedOption = new Option("d", DERIVED_OPTION_DESCRIPTION);
		var projectOption = new Option("p", true, PROJECT_NAME_OPTION_DESCRIPTION);
		var branchOption = new Option(null, "branch", true, BRANCH_OPTION);
		
		libraryPathOption.setRequired(true);
		basePathOption.setRequired(true);
		isVerboseOption.setRequired(false);
		addImplicitsOption.setRequired(false);
		addDerivedOption.setRequired(false);
		branchOption.setRequired(false);
		projectOption.setRequired(false);
		
		Options options = new Options()
				.addOption(libraryPathOption)
				.addOption(basePathOption)
				.addOption(isVerboseOption)
				.addOption(addImplicitsOption)
				.addOption(addDerivedOption)
				.addOption(projectOption)
				.addOption(branchOption);
		
		CommandLineParser parser = new DefaultParser(false);
		
		try {
			CommandLine cli = parser.parse(options, args);
			basePath = cli.getOptionValue(basePathOption);
			libraryPath = cli.getOptionValue(libraryPathOption);
			if (!libraryPath.endsWith("/")) {
				libraryPath += "/";
			}
			isAddImplicitElements = cli.hasOption(addImplicitsOption);
			isAddDerivedElements = cli.hasOption(addDerivedOption);
			setVerbose(cli.hasOption(isVerboseOption));
			projectName = cli.getOptionValue(projectOption);
			branchName = cli.getOptionValue(branchOption);
			
			args = cli.getArgs();
			
			if (args.length > 0) {
				args = Arrays.copyOf(args, args.length);
				
				if (this.libraryPath != null) {
					for (int k = 1; k < args.length; k++) {
						args[k] = this.libraryPath + args[k];
					}
				}
				
				return args;
			}
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		
		return null;
	}
	
	/**
	 * Initialize the traversal with an ApiElementProcessingFacade to write to a new repository Project.
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
		
		if (this.projectName == null) {
			this.projectName = Paths.get(args[0]).getFileName().toString();
			int j = this.projectName.indexOf('.');
			if (j >= 0) {
				this.projectName = this.projectName.substring(0, j);
			}
			this.projectName += " " + new Date();
		}
		
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(this.projectName, branchName, this.getBasePath());	
		processingFacade.setTraversal(this.initialize(processingFacade));
		processingFacade.setIsVerbose(this.isVerbose());
		processingFacade.setIsIncludeDerived(this.isAddDerivedElements);
	}
	
	/**
	 * Traverse the model and then commit the change set of ElementVersions so obtained.
	 */
	@Override
	public void process() {
		super.process();
		this.isCommitted = ((ApiElementProcessingFacade)this.traversal.getFacade()).commit(null);
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
					(this.isAddImplicitElements? " (adding implicit generalizations)... ": "..."));
			this.transformAll(this.isAddImplicitElements);
			
			System.out.println("\nBase path is " + this.getBasePath());
			System.out.println();
			
			this.process();
			
			if (isCommitted()) {
				System.out.println("Saved to Project (" + this.getProjectName() + ") " + this.getProjectId());
			} else {
				System.out.println("Failed to save Project (" + this.getProjectName() + ") ");
			}
			System.out.println();
		}
	}

	/**
	 * The main program reads the KerML resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only saved to the repository if they are referenced
	 * from an input resource.
	 * 
	 * <p>Usage:
	 * 
	 * <p>KerMLRepositorySaveUtil [-b base-path-url] [-l library-base-path] [-d] [-g] [-v] input-path [library-path library-path...]
	 * 
	 * <p>where:
	 * 
	 * <ul>
	 * <li>-b base-path-url       gives the URL for the base path to be used for the API endpoint (if none is given, the default is used)</li>
	 * <li>-l library-base-path   gives the base path to used for reading model library resources</li>
	 * <li>-d                     specifies that derived attributes should be included (the default is not to)</li>
	 * <li>-g                     specifies that implicit elements should be generated (the default is not to)</li>
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
