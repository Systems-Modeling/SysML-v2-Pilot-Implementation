/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.traversal.facade.impl.JsonElementProcessingFacade;

/**
 * This is a utility for traversing a model graph and exporting each Element that is 
 * visited to a file using a JSON representation.
 * 
 * @author Ed Seidewitz
 *
 */
public class KerML2JSON extends KerMLTraversalUtil {
	
	public static final String JSON_EXTENSION = "json";
	
	private String libraryPath = null;
	private boolean isAddDerivedElements = false;
	private boolean isAddImplicitElements = false;
	private String outputPath = null;
	
	public KerML2JSON() {
		super();
		this.setVerbose(false);
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
	 * Get the output path.
	 * 
	 * @return	the output path
	 */
	public String getOutputPath() {
		return this.outputPath;
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
					this.setVerbose(true);
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
		
		this.outputPath = args[0];
		if (this.outputPath.endsWith("/")) {
			this.outputPath = this.outputPath.substring(0, this.outputPath.length() - 1);
		} else {
			int j = this.outputPath.indexOf('.');
			if (j >= 0) {
				this.outputPath = this.outputPath.substring(0, j);
			}
		}
		this.outputPath += "." + JSON_EXTENSION;

		JsonElementProcessingFacade processingFacade = new JsonElementProcessingFacade();	
		processingFacade.setTraversal(this.initialize(processingFacade));
		processingFacade.setIsIncludeDerived(this.isAddDerivedElements);
		processingFacade.setIsVerbose(this.isVerbose());
	}
	
	/**
	 * After processing, write the JSON tree to the output file given by the outputPath.
	 * 
	 * @throws IOException
	 */
	public void write() throws IOException {
		Files.newBufferedWriter(Path.of(this.outputPath)).
			append(((JsonElementProcessingFacade)this.traversal.getFacade()).toJson()).
			close();
	}
	
	/**
	 * Run the traversal for the given main program arguments.
	 * 
	 * @param 	args		the array of main program arguments
	 */
	@Override
	public void run(String[] args) {
		args = this.processArgs(args);
		
		if (args != null) {
			
			System.out.println("Saving " + args[0] + "...");
			
			this.initialize(args);				
			this.read(args);
			
			System.out.println("Transforming" + 
					(this.isAddImplicitElements? " (adding implicit elements)... ": "..."));
			this.transformAll(this.isAddImplicitElements);
			
			if (!this.isVerbose()) {
				System.out.print("Processing");
			}
			this.process();
			System.out.println();
			
			System.out.println("Writing " + this.outputPath + "...");
			try {
				this.write();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * The main program reads the KerML resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only included if they are referenced from an input resource.
	 * 
	 * <p>Usage:
	 * 
	 * <p>KerML2JSON [-l library-base-path] [-d] [-g] [-v] input-path [library-path library-path...]
	 * 
	 * <p>where:
	 * 
	 * <ul>
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
			new KerML2JSON().run(args);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
