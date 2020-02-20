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

import org.omg.kerml.xtext.util.KerMLTraversalUtil;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class SysMLTraversalUtil extends KerMLTraversalUtil {

	public SysMLTraversalUtil() {
		super();
		SysMLStandaloneSetup.doSetup();
		this.addExtension(".sysml");
	}
	
	/**
	 * The main program reads the KerML and SysML resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only traversed if they are referenced from an input
	 * or are directly or indirectly related to another Element so referenced.
	 * 
	 * @param 	args	the first argument is a path for reading input resources, while other arguments
	 * 					are paths for reading library resources
	 */
	public static void main(String[] args) {
		new SysMLTraversalUtil().run(args);
	}

}
