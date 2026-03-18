/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.xtext.util;

import java.io.IOException;

import org.omg.kerml.xtext.util.KerMLIndexUtil;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class SysMLIndexUtil extends KerMLIndexUtil {

	public SysMLIndexUtil() {
		super();
		SysMLStandaloneSetup.doSetup();
		addExtension(".sysml");
	}
	
	/**
	 * <p>Usage:
	 * 
	 * <p>SysMLIndexUtil input-path output-path
	 * 
	 * <p>where:
	 * 
	 * <ul>
	 * <li>input-path             is a path for reading input resources (file or directory)</li>
	 * <li>output-path            is a path for an output file</li>
	 * </ul>
	 */
	public static void main(String[] args) {
		try {
			new SysMLIndexUtil().writeIndex(args[0], args[1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
