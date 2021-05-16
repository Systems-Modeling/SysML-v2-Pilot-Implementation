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

import org.omg.kerml.xtext.util.KerMLRepositorySaveUtil;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class SysMLRepositorySaveUtil extends KerMLRepositorySaveUtil {

	public SysMLRepositorySaveUtil() {
		super();
		SysMLStandaloneSetup.doSetup();
		this.addExtension(".sysml");
	}
	
	/**
	 * The main program reads the KerML and SysML resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only saved to the repository if they are referenced
	 * from an input resource or are directly or indirectly related to another Element so referenced.
	 * 
	 * <p>Usage:
	 * 
	 * <p>SysMLRepositorySaveUtil [-b base-path-url] [-l library-base-path] [-g] input-path [library-path library-path...]
	 * 
	 * <p>where:
	 * 
	 * <ul>
	 * <li>-b base-path-url       gives the URL for the base path to be used for the API endpoint (if none is given, the default is used)</li>
	 * <li>-l library-base-path   gives the base path to used for reading model library resources</li>
	 * <li>-g                     specifies that implicit generalizations should be generated (the default is not to)</li>
	 * <li>input-path             is a path for reading input resources</li>
	 * <li>library-paths          are paths for reading library resources, relative to the library-base-path (if one is given)</li>
	 * </ul>
	 * 
	 */
	public static void main(String[] args) {
		new SysMLRepositorySaveUtil().run(args);
	}

}
