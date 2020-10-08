/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018-2020 Model Driven Solutions, Inc.
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
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.util.ImplicitElementGenerator;
import org.omg.sysml.util.SysMLUtil;

/**
 * This is a utility program for reading one or more KerML source files and writing the corresponding KerML
 * Ecore XMI files. The path for a file or root directory for the KerMNL source is given as the first argument,
 * which is required. The XMI files are written with a ".kermlx" extension in the same directory as the 
 * corresponding source file. Other arguments may be used to specify paths for library directories. Source
 * files are read from these directories, in order to resolve cross-file proxy references, but no corresponding 
 * XMI files are written for them.
 * 
 * @author Ed Seidewitz
 *
 */
public class KerML2XMI extends SysMLUtil {
	
	public static final String KERML_XMI_EXTENSION = "kermlx";
	
	public KerML2XMI() {
		super();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(KERML_XMI_EXTENSION, new XMIResourceFactoryImpl());
		KerMLStandaloneSetup.doSetup();
		this.addExtension(".kerml");
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
		System.out.println("Resolving proxies...");
		EcoreUtil.resolveAll(this.resourceSet);
		Set<Resource> outputResources = new HashSet<Resource>();
		ImplicitElementGenerator generator = new ImplicitElementGenerator();
		for (Object object: this.resourceSet.getResources().toArray()) {
			Resource resource = (Resource)object;
			Resource outputResource = this.createResource(this.getOutputPath(resource.getURI().toFileString()));
			outputResource.getContents().addAll(resource.getContents());
			generator.generateElements(outputResource);
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
	 * extension on the input path with a KerML XMI extension on the output path. However, this behavior can
	 * be overridden in subclasses.
	 * 
	 * @param 	inputPath		the path of a resource that is to be written to a corresponding output resource
	 * @return	the path for the output resource
	 */
	protected String getOutputPath(String inputPath) {
		String outputPath = inputPath;
		int i = outputPath.lastIndexOf('.');
		if (i >= 0) {
			outputPath = inputPath.substring(0, i);
		}
		return outputPath + "." + KERML_XMI_EXTENSION;
	}
	
	/**
	 * The main program reads all the KerML resources rooted in the paths given as arguments and then
	 * writes out KerML XMI files for the resources from the first argument path.
	 * 
	 * @param 	args	the first argument is a path for reading input resources, while other arguments
	 * 					are paths for reading library resources
	 */
	public static void main(String[] args) {
		try {
			KerML2XMI util = new KerML2XMI();
			
			util.read(args);			
			util.write();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
