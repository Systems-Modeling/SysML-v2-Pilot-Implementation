/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
 *  Bjorn Cole
 * 
 *****************************************************************************/
package org.omg.sysml.xtext.util;

import java.util.ArrayList;
import java.util.Arrays;

import org.omg.kerml.xtext.util.KerMLTraversalUtil;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.traversal.facade.impl.DefaultElementProcessingFacadeImpl;
import org.omg.sysml.util.traversal.NestedFeatureTraversal;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.facade.impl.BandedGraphProcessingFacade;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

import org.omg.sysml.lang.sysml.Element;

// TODO: Refactor to push part of this back down to the KerML level

public class SysML2SequenceConstraints extends KerMLTraversalUtil {
	
	public static final String FILE_EXTENSION = "constraints";
	
	private String libraryPath = null;
	private boolean isAddDerivedElements = false;
	private boolean isAddImplicitElements = false;
	private String outputPath = null;

	public SysML2SequenceConstraints() {
		super();
		SysMLStandaloneSetup.doSetup();
		this.addExtension(".sysml");
		this.traversal = new NestedFeatureTraversal();
	}
	
	public void run(String[] args) {
		
		try {
			args = this.processArgs(args);
			/* set up the processor with an element processing facade - in this case the facade will need to 
			support traversing the "banded feature" graph of alternating typing and featuring in the SysML 1 structural
			composition approach */
			this.initialize(args);
			this.read(args); // simple, just read the files
			
			System.out.println("Transforming" + 
					(this.isAddImplicitElements? " (adding implicit elements)... ": "..."));
			this.transformAll(this.isAddImplicitElements);
			
			println("Processing...");
			this.process(); // sends the traversal to go to work
			System.out.println("Done Processing");
			/*for (ArrayList<Element> path : ((NestedFeatureTraversal) this.traversal).reportPaths()) {
				System.out.println("Found path:");
				String pathString = "";
				for (Element ele : path) {
					pathString = pathString + ", " + this.getTraversal().getFacade().descriptionOf(ele);
				}
				System.out.println(pathString);
			}*/
			System.out.println("Found paths:");
			System.out.print(this.getTraversal().describePaths());
			System.out.println("Completed path listing.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * If there is a library path, set the model library directory to it and prepended it to 
	 * all arguments other than the first.  Set the output path to be the  same as the input path, 
	 * but with a JSON file extension. Initialize the traversal with an JsonElementProcessingFacade.
	 * 
	 * @param 	args		the command line arguments after processing, with options removed
	 */
	public void initialize(String[] args)  {
		String libraryPath = this.getLibraryPath();
		if (libraryPath != null) {
			SysMLLibraryUtil.setModelLibraryDirectory(libraryPath);
			for (int k = 1; k < args.length; k++) {
				args[k] = libraryPath + args[k];
			}
		}
		
		// may want to adapt this to save out constraints or individuals
		this.outputPath = args[0];
		if (this.outputPath.endsWith("/")) {
			this.outputPath = this.outputPath.substring(0, this.outputPath.length() - 1);
		} else {
			int j = this.outputPath.indexOf('.');
			if (j >= 0) {
				this.outputPath = this.outputPath.substring(0, j);
			}
		}
		this.outputPath += "." + FILE_EXTENSION;
	}
	
	public NestedFeatureTraversal getTraversal() {
		return ((NestedFeatureTraversal) this.traversal);
	}
	
	/**
	 * Process the command line arguments:
	 * <ul>
	 * <li> Set the library path if the "-l" option is present.</li>
	 * <li> Set flag to add implicit elements if the "-g" option is present.</li>
	 * <li> Set flag for verbose mode if the "-v" option is present.</li>
	 * <li> Return the list of arguments with any options removed.</li>
	 * </ul>
	 * 
	 * @param 	args		the original command line arguments
	 * @return	the arguments without any options.
	 */
	public String[] processArgs(String[] args) {
		int n = args.length;
		if (n > 0) {
			int i = 0;
			while(("-l".equals(args[i]) || "-d".equals(args[i]) || "-g".equals(args[i]) || "-v".equals(args[i])) && 
					i + 1 < n) {
				if ("-l".equals(args[i])) {
					this.libraryPath = args[++i];
					if (!libraryPath.endsWith("/")) {
						libraryPath += "/";
					}
				} else if ("-d".equals(args[i])) {
					this.isAddDerivedElements = true;
				} else if ("-g".equals(args[i])) {
					this.isAddImplicitElements = true;
				} else if ("-v".equals(args[i])) {
					this.isVerbose = true;
				}
				i++;
			}
			if (i < n) {
				args = Arrays.copyOfRange(args, i, n);
				
				return args;
			}
		}
		return null;
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
	 * The main program reads the KerML and SysML resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only included if they are referenced from an input resource.
	 * 
	 * <p>Usage:
	 * 
	 * <p>SysML2SequenceConstraints [-l library-base-path] [-g] input-path [library-path library-path...]
	 * 
	 * <p>where:
	 * 
	 * <ul>
	 * <li>-l library-base-path   gives the base path to used for reading model library resources</li>
	 * <li>-g                     specifies that implicit generalizations should be generated (the default is not to)</li>
	 * <li>input-path             is a path for reading input resources</li>
	 * <li>library-paths          are paths for reading library resources, relative to the library-base-path (if one is given)</li>
	 * </ul>
	 * 
	 */
	public static void main(String[] args) {
		// Pattern where class is basically a light wrapper around a function
		try {
			new SysML2SequenceConstraints().run(args);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
