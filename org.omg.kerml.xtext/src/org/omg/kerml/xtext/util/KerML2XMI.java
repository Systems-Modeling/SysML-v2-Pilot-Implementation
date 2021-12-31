/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018-2021 Model Driven Solutions, Inc.
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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
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
	
	public static final String KERML_EXTENSION = "kerml";
	public static final String KERML_XMI_EXTENSION = "kermlx";
	
	public KerML2XMI() {
		super();
		KerMLStandaloneSetup.doSetup();
		this.addExtension("." + KERML_EXTENSION);
	}
	
	/**
	 * Create an XMIResource for output, using Element identifiers for XMI IDs, and add it to the
	 * resource set.
	 * 
	 * @param 	path			the path to be used for the new resource.
	 * @return	the newly created resource
	 */
	protected XMIResource createOutputResource(String path) {
		final XMIResource resource = new XMIResourceImpl(URI.createFileURI(path)) {
			@Override
			public void attachedHelper(EObject eObject) {
				if (eObject instanceof Element) {
					setID(eObject, ((Element)eObject).getIdentifier());
				}
				super.attachedHelper(eObject);
			}
			
			@Override
			protected XMLSave createXMLSave()
			{
				return new XMLSaveImpl(createXMLHelper()) {
					@Override
					protected boolean shouldSaveFeature(EObject o, EStructuralFeature f)
					{
						return f != SysMLPackage.eINSTANCE.getOperatorExpression_Operand() && 
								super.shouldSaveFeature(o, f);
					}
				};
			}
		};
		
		this.resourceSet.getResources().add(resource);
		return resource;
	}
	
	/**
	 * Write the given resource, logging this to the console.
	 * 
	 * @param 	resource		the resource to be written
	 * @throws 	IOException
	 */
	public void writeResource(final Resource resource) throws IOException {
		println("Writing " + resource.getURI().toFileString() + "...");
		resource.save(null);
	}
	
	/**
	 * Create KerML output resources for all resources that have been read, but only write out those
	 * output resources that correspond to identified input resources, not those that correspond to
	 * library resources. Note that, at the end of this method, all content has been removed from
	 * the originally read resources.
	 * 
	 * @param	isAddImplicitElements	whether to add implicit elements to the output
	 * 
	 * @throws 	IOException
	 */
	public void write(boolean isAddImplicitElements) throws IOException {
		System.out.println("Transforming" + 
				(isAddImplicitElements? " (adding implicit elements)... ": "..."));
		this.transformAll(isAddImplicitElements);
		
		System.out.println("Resolving proxies...");
		this.resolveAllInputResources();
		
		Set<Resource> outputResources = new HashSet<Resource>();
 		for (Object object: this.resourceSet.getResources().toArray()) {
			Resource resource = (Resource)object;
			Resource outputResource = this.createOutputResource(this.getOutputPath(resource.getURI().toFileString()));
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
	 * Run the creation of XMI for the resources given in the main program arguments.
	 *  
	 * @param 	args		the array of main program arguments
	 */
	public void run(String[] args) {
		try {
			boolean isAddImplicitGeneralizations = false;
			
			if (args.length > 0 && "-g".equals(args[0])) {
				isAddImplicitGeneralizations = true;
				args = Arrays.copyOfRange(args, 1, args.length);
			}
			
			this.read(args);			
			this.write(isAddImplicitGeneralizations);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The main program reads all the KerML resources rooted in the paths given as arguments and then
	 * writes out KerML XMI files for the resources from the input-path argument.
	 * 
	 * <p>Usage:
	 * 
	 * <p>Kerml2XMI [-g] input-path [library-path library-path...]
	 * 
	 * <p>where:
	 * 
	 * <li>-g                     specifies that implicit elements should be generated (the default is not to)</li>
	 * <li>input-path             is a path for reading input resources</li>
	 * <li>library-paths          are paths for reading library resources</li>
	 */
	public static void main(String[] args) {
		new KerML2XMI().run(args);
	}

}
