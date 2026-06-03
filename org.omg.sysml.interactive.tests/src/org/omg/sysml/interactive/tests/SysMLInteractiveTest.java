/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
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
		instance.setVerbose(false);
		instance.loadLibrary(getLibraryPath());
		return instance;
	}
	
	public List<Element> process(SysMLInteractive instance, String input) {
		if (instance == null) {
			instance = getSysMLInteractiveInstance();
		}
		SysMLInteractiveResult result = instance.process(input);
		assertTrue("'" + input + "':\n" + result.formatIssues(), result.getIssues().isEmpty());
		Element root = result.getRootElement();
		assertTrue(root instanceof Namespace);
		return ((Namespace)root).getOwnedMember();
	}
	
	public List<Element> process(String input) {
		return process(null, input);
	}
}
