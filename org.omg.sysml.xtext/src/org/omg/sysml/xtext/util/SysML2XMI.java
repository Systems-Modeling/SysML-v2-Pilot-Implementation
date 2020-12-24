/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2020 Model Driven Solutions, Inc.
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

package org.omg.sysml.xtext.util;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.omg.kerml.xtext.util.KerML2XMI;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

/**
 * This is a utility program for reading one or more KerML or SysML source files and writing the corresponding 
 * KerML and SysML Ecore XMI files. The path for a file or root directory for the KerML and/or SysML source is 
 * given as the first argument, which is required. The XMI files are written with a ".kermlx" or ".sysmlx" extension, 
 * as appropriate, in the same directory as the corresponding source file. Other arguments may be used to specify 
 * paths for library directories. Source files are read from these directories, in order to resolve cross-file 
 * proxy references, but no corresponding XMI files are written for them.
 * 
 * @author Ed Seidewitz
 *
 */
public class SysML2XMI extends KerML2XMI {
	
	public static final String SYSML_EXTENSION = "sysml";
	public static final String SYSML_XMI_EXTENSION = "sysmlx";
	
	public SysML2XMI() {
		super();
	    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(SYSML_XMI_EXTENSION, new XMIResourceFactoryImpl());
		SysMLStandaloneSetup.doSetup();
		this.addExtension("." + SYSML_EXTENSION);
	}

	/**
	 * Get an output path to be used for the given input path. If the input path indicates a SysML file, then
	 * return an output path that is the same as the input path, but with the extension replaced by the SysML
	 * XMI extension. Otherwise, replace the input extension with the KerML XMI extension.
	 * 
	 * @param 	inputPath		the path of a resource that is to be written to a corresponding output resource
	 * @return	the path for the output resource
	 */
	@Override
	protected String getOutputPath(String inputPath) {
		int i = inputPath.lastIndexOf('.');
		if (i >= 0) {
			String extension = inputPath.substring(i + 1);
			if (SYSML_EXTENSION.equals(extension)) {
				return inputPath.substring(0, i) + "." + SYSML_XMI_EXTENSION;
			}
		}
		return super.getOutputPath(inputPath);
	}
	
	/**
	 * The main program reads all the KerML and SySML resources rooted in the paths given as arguments and then
	 * writes out KerML and SysML XMI files for the resources from the first argument path.
	 * 
	 * @param 	args	the first argument is a path for reading input resources, while other arguments
	 * 					are paths for reading library resources
	 */
	public static void main(String[] args) {
		try {
			SysML2XMI util = new SysML2XMI();
			
			util.read(args);			
			util.write();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
