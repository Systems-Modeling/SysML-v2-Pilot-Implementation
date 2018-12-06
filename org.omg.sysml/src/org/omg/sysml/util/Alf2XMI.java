/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class Alf2XMI {
	
	protected final ResourceSet resourceSet = new ResourceSetImpl();
	protected EList<EObject> contents;
	
	protected Alf2XMI() {
		@SuppressWarnings("unused")
		SysMLPackage sysml = SysMLPackage.eINSTANCE;
		AlfStandaloneSetup.doSetup();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sysml", new XMIResourceFactoryImpl());
	}
	
	public Resource createResource(final String path) {
		Resource resource = this.resourceSet.createResource(URI.createFileURI(path));
		if (resource == null) {
			throw new RuntimeException("Error creating resource: " + path);
		} else {
			return resource;
		}
	}
	
	public Resource getResource(final String path) {
	    final Resource resource = this.createResource(path);
		if (resource != null) {
			try {
				resource.load(null);
				return resource;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Error opening resource: " + path);
	}
	
	public void read(final String path) {
		Resource resource = this.getResource(path);
		EcoreUtil.resolveAll(resource);
		this.contents = resource.getContents();
	}
	
	public void write(final String path) throws IOException {
		Resource resource = this.createResource(path);
		resource.getContents().addAll(this.contents);
		resource.save(null);
	}
	
	protected String getOutputPath(String inputPath) {
		String outputPath = inputPath;
		if (outputPath.endsWith(".alf")) {
			outputPath = inputPath.substring(0, outputPath.length() - 4);
		}
		return outputPath + ".sysml";
	}
	
	public static void main(String[] args) {
		try {
			Alf2XMI util = new Alf2XMI();
			
			System.out.println("Reading " + args[0] + "...");
			util.read(args[0]);
			
			String outputPath = util.getOutputPath(args[0]);
			System.out.println("Writing " + outputPath + "...");
			util.write(util.getOutputPath(args[0]));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
