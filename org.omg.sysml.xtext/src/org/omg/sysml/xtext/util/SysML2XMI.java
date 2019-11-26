/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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

import org.omg.kerml.xtext.util.KerML2XMI;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

/**
 * This is a utility program for reading one or more KerML or SysML source files and writing the corresponding SysML
 * Ecore XMI files. The path for a file or root directory for the Alf source is given as the first argument,
 * which is required. The XMI files are written with a ".sysmlx" extension in the same directory as the 
 * corresponding source file. Other arguments may be used to specify paths for library directories. Source
 * files are read from these directories, in order to resolve cross-file proxy references, but no corresponding 
 * XMI files are written for them.
 * 
 * @author Ed Seidewitz
 *
 */
public class SysML2XMI extends KerML2XMI {
	
	public SysML2XMI() {
		super();
		SysMLStandaloneSetup.doSetup();
		this.addExtension(".sysml");
	}

	/**
	 * The main program reads all the KerML and SySML resources rooted in the paths given as arguments and then
	 * writes out SysML XMI files for the resources from the first argument path.
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
