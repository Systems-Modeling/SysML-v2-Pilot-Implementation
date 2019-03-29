/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018-2019 Model Driven Solutions, Inc.
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

package org.omg.sysml.util;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * This is a utility program for reading one or more Alf source files and writing the corresponding SysML
 * Ecore XMI files. The path for a file or root directory for the Alf source is given as the first argument,
 * which is required. The XMI files are written with a ".sysml" extension in the same directory as the 
 * corresponding Alf source file. Other arguments may be used to specify paths for library directories. Alf 
 * source is read from these directories, in order to resolve cross-file proxy references, but no corresponding 
 * XMI files are written for them.
 * 
 * @author Ed Seidewitz
 *
 */
public class Alf2XMI extends AlfUtil {
	
	public static final String SYSML_EXTENSION = ".sysml";
	
	public Alf2XMI() {
		super();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(SYSML_EXTENSION, new XMIResourceFactoryImpl());
	}
	
	/**
	 * Write the given resource, logging this to the console.
	 * 
	 * @param 	resource		the resource to be written
	 * @throws 	IOException
	 */
	public void writeResource(final Resource resource) throws IOException {
		System.out.println("Writing " + resource.getURI().toFileString() + "...");
		resource.save(null);
	}
	
	/**
	 * Create SysML output resources for all resources that have been read, but only write out those
	 * output resources that correspond to identified input resources, no those that correspond to
	 * library resources. Note that, at the end of this method, all content has been removed from
	 * the originally read resources.
	 * 
	 * @throws 	IOException
	 */
	public void write() throws IOException {
		Set<Resource> outputResources = new HashSet<Resource>();
		for (Object object: this.resourceSet.getResources().toArray()) {
			Resource resource = (Resource)object;
			Resource outputResource = this.createResource(this.getOutputPath(resource.getURI().toFileString()));
			outputResource.getContents().addAll(resource.getContents());
			if (this.isInputResource(resource)) {
				outputResources.add(outputResource);
			}
		}
		for (Resource resource: outputResources) {
			this.writeResource(resource);
		}
	}
	
	/**
	 * Get an output path to be used for the given input path. By default, this method simply replaces the
	 * Alf extension on the input path with a SysML extension on the output path. However, this behavior can
	 * be overridden in subclasses.
	 * 
	 * @param 	inputPath		the path of a resource that is to be written to a corresponding output resource
	 * @return	the path for the output resource
	 */
	protected String getOutputPath(String inputPath) {
		String outputPath = inputPath;
		if (outputPath.endsWith(ALF_EXTENSION)) {
			outputPath = inputPath.substring(0, outputPath.length() - 4);
		}
		return outputPath + SYSML_EXTENSION;
	}
	
	/**
	 * The main program reads all the Alf resources rooted in the paths given as arguments and then
	 * writes out SysML XMI files for the resources from the first argument path.
	 * 
	 * @param 	args	the first argument is a path for reading input resources, while other arguments
	 * 					are paths for reading library resources
	 */
	public static void main(String[] args) {
		try {
			Alf2XMI util = new Alf2XMI();
			
			util.read(args);			
			util.write();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
