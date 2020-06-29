/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 *  Zoltan Ujhelyi
 * 
 *****************************************************************************/
package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;

public class GlobalNameRedefinitionTest {

	private final static String SYSML_LIBRARY_PATH_KEY = "libraryPath";
	
	@Test
	public void testRedefinitionShadowing() throws Exception {
		SysMLInteractive instance = SysMLInteractive.createInstance();
		instance.loadLibrary(System.getProperty(SYSML_LIBRARY_PATH_KEY));
		
		SysMLInteractiveResult result1 = instance.eval("y = 1;");
		System.out.println(result1);
		String id1 = result1.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		SysMLInteractiveResult result2 = instance.eval("y = 2;");
		System.out.println(result2);
		String id2 = result2.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		System.out.println(instance.show("y"));
		String resolvedIdentifier = instance.resolve("y").getIdentifier();
		
		assertNotEquals(id1, id2);
		assertEquals(id2, resolvedIdentifier);
	}
	
	@Test
	public void testRedefinitionShadowingMultidigitFiles() throws Exception {
		SysMLInteractive instance = SysMLInteractive.createInstance();
		instance.loadLibrary(System.getProperty(SYSML_LIBRARY_PATH_KEY));
		
		// This is used to ensure later requests will get identifiers 9 and 10
		for (int i=1; i<9; i++) {
			instance.eval("x = 1;");
		}
		
		SysMLInteractiveResult result1 = instance.eval("y = 1;");
		System.out.println(result1);
		String id1 = result1.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		SysMLInteractiveResult result2 = instance.eval("y = 2;");
		System.out.println(result2);
		String id2 = result2.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		System.out.println(instance.show("y"));
		String resolvedIdentifier = instance.resolve("y").getIdentifier();
		
		assertNotEquals(id1, id2);
		assertEquals(id2, resolvedIdentifier);
	}
}
