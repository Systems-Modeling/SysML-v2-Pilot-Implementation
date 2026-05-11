/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 * Copyright 2021 Twingineer LLC
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
 *  Zoltan Ujhelyi
 *  Ed Seidewitz
 *  Ivan Gomes
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
		
		SysMLInteractiveResult result1 = instance.process("y = 1;");
		System.out.println(result1);
		String id1 = result1.getRootElement().getOwnedElement().get(0).getElementId();
		
		SysMLInteractiveResult result2 = instance.process("y = 2;");
		System.out.println(result2);
		String id2 = result2.getRootElement().getOwnedElement().get(0).getElementId();
		
		System.out.println(instance.show("y"));
		String resolvedIdentifier = instance.resolve("y").getElementId();
		
		assertNotEquals(id1, id2);
		assertEquals(id2, resolvedIdentifier);
	}
	
	@Test
	public void testRedefinitionShadowingMultidigitFiles() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		
		// This is used to ensure later requests will get identifiers 9 and 10
		for (int i=1; i<9; i++) {
			instance.process("x = 1;");
		}
		
		SysMLInteractiveResult result1 = instance.process("y = 1;");
		System.out.println(result1);
		String id1 = result1.getRootElement().getOwnedElement().get(0).getElementId();
		
		SysMLInteractiveResult result2 = instance.process("y = 2;");
		System.out.println(result2);
		String id2 = result2.getRootElement().getOwnedElement().get(0).getElementId();
		
		System.out.println(instance.show("y"));
		String resolvedIdentifier = instance.resolve("y").getElementId();
		
		assertNotEquals(id1, id2);
		assertEquals(id2, resolvedIdentifier);
	}
	
	@Test
	public void testNoShadowingCaseSensitive() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		
		SysMLInteractiveResult result1 = instance.process("y = 1;");
		System.out.println(result1);
		String id1 = result1.getRootElement().getOwnedElement().get(0).getElementId();
		
		SysMLInteractiveResult result2 = instance.process("Y = 2;");
		System.out.println(result2);
		String id2 = result2.getRootElement().getOwnedElement().get(0).getElementId();
		
		System.out.println(instance.show("y"));
		Element resolvedElement1 = instance.resolve("y");
		
		System.out.println(instance.show("Y"));
		Element resolvedElement2 = instance.resolve("Y");
		
		assertNotNull(resolvedElement1);
		assertNotNull(resolvedElement2);
		
		assertNotEquals(id1, id2);
		assertEquals(id1, resolvedElement1.getElementId());
		assertEquals(id2, resolvedElement2.getElementId());
	}
	
}
