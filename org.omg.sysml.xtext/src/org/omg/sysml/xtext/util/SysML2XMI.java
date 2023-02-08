/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2021 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.URI;
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
		SysMLStandaloneSetup.doSetup();
		this.addExtension("." + SYSML_EXTENSION);
	}

	/**
	 * Get the output extension to be used for the given input URI. If the input path indicates a SysML file,
	 * return the SysML XMI extension. Otherwise, return the KerML XMI extension.
	 * 
	 * @param 	inputUri		the URI of the input resource
	 * @return the extension to be used for the output file of the corresponding output resource
	 */	
	@Override
	protected String getExtension(URI inputUri) {
		return SYSML_EXTENSION.equals(inputUri.fileExtension())?
				SYSML_XMI_EXTENSION: super.getExtension(inputUri);
	}
	
	/**
	 * The main program reads all the KerML and SySML resources rooted in the paths given as arguments and then
	 * writes out KerML and SysML XMI files for the resources from the input-path argument.
	 * 
	 * <p>Usage:
	 * 
	 * <p>SysML2XMI [-g] input-path [library-path library-path...]
	 * 
	 * <p>where:
	 * 
	 * <li>-g                     specifies that implicit generalizations should be generated (the default is not to)</li>
	 * <li>input-path             is a path for reading input resources</li>
	 * <li>library-paths          are paths for reading library resources, relative to the library-base-path (if one is given)</li>
	 */
	public static void main(String[] args) {
		new SysML2XMI().run(args);
	}

}
