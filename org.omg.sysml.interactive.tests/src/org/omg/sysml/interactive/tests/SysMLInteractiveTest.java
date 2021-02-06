/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
*******************************************************************************/

package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;

public abstract class SysMLInteractiveTest {

	private final static String SYSML_LIBRARY_PATH_KEY = "libraryPath";
	
	public String getLibraryPath() {
		return System.getProperty(SYSML_LIBRARY_PATH_KEY);
	}
	
	public SysMLInteractive getSysMLInteractiveInstance() {
		SysMLInteractive instance = SysMLInteractive.getInstance();
		System.out.println("Library path is: " + getLibraryPath());
		instance.loadLibrary(getLibraryPath());
		return instance;
	}
	
	public List<Element> eval(SysMLInteractive instance, String input) {
		if (instance == null) {
			instance = getSysMLInteractiveInstance();
		}
		SysMLInteractiveResult result = instance.eval(input);
		assertTrue("'" + input + "':\n" + result.formatIssues(), result.getIssues().isEmpty());
		Element root = result.getRootElement();
		assertTrue(root instanceof Namespace);
		return ((Namespace)root).getOwnedMember();
	}
	
	public List<Element> eval(String input) {
		return eval(null, input);
	}
}
