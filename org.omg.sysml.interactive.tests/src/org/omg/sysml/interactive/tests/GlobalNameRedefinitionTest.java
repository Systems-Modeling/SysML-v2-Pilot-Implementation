/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;
import org.omg.sysml.lang.sysml.Element;

public class GlobalNameRedefinitionTest extends SysMLInteractiveTest {

	@Test
	public void testRedefinitionShadowing() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		
		SysMLInteractiveResult result1 = instance.eval("y = 1;");
		System.out.println(result1);
		String id1 = result1.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		SysMLInteractiveResult result2 = instance.eval("y = 2;");
		System.out.println(result2);
		String id2 = result2.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		System.out.println(instance.show("y", null));
		String resolvedIdentifier = instance.resolve("y").getIdentifier();
		
		assertNotEquals(id1, id2);
		assertEquals(id2, resolvedIdentifier);
	}
	
	@Test
	public void testRedefinitionShadowingMultidigitFiles() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		
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
		
		System.out.println(instance.show("y", null));
		String resolvedIdentifier = instance.resolve("y").getIdentifier();
		
		assertNotEquals(id1, id2);
		assertEquals(id2, resolvedIdentifier);
	}
	
	@Test
	public void testNoShadowingCaseSensitive() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		
		SysMLInteractiveResult result1 = instance.eval("y = 1;");
		System.out.println(result1);
		String id1 = result1.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		SysMLInteractiveResult result2 = instance.eval("Y = 2;");
		System.out.println(result2);
		String id2 = result2.getRootElement().getOwnedElement().get(0).getIdentifier();
		
		System.out.println(instance.show("y", null));
		Element resolvedElement1 = instance.resolve("y");
		
		System.out.println(instance.show("Y", null));
		Element resolvedElement2 = instance.resolve("Y");
		
		assertNotNull(resolvedElement1);
		assertNotNull(resolvedElement2);
		
		assertNotEquals(id1, id2);
		assertEquals(id1, resolvedElement1.getIdentifier());
		assertEquals(id2, resolvedElement2.getIdentifier());
	}
	
}
