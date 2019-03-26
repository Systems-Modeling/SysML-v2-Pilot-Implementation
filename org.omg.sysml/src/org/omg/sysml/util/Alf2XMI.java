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

public class Alf2XMI extends AlfUtil {
	
	public Alf2XMI() {
		super();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sysml", new XMIResourceFactoryImpl());
	}
	
	public void writeResource(final Resource resource) throws IOException {
		System.out.println("Writing " + resource.getURI().toFileString() + "...");
		resource.save(null);
	}
	
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
			
			util.read(args);			
			util.write();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
