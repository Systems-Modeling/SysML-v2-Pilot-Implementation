/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo.
 * Copyright (c) 2026 Model Driveh Solutions, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 *******************************************************************************/
package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Usage;

public class UsagePostProcessTest extends SysMLInteractiveTest{
	
	public static final String TEST =
			  " package Test {\n"
			+ "	     part p {\n"
			+ "	         attribute a;\n"
			+ "		     part x;\n"
			+ "		     in part y;\n"
			+ "			 variation occurrence z {\n"
			+ "	             variant variation part u {\n"
			+ "                  variant part v;\n"
			+ "              }\n"
			+ "              variant port w;\n"
			+ "		     }\n"
			+ "     }\n"
			+ "	    variation part q {\n"
			+ "	       variant part r;\n"
			+ "     }\n"
			+ "     attribute def B {\n"
			+ "         part p1;\n"
			+ "     }\n"
			+ "     attribute b {\n"
			+ "         part p2;\n"
			+ "     }\n"
			+ " }\n";
	
	/**
	 * Test that Usage postProcess sets the property "composite" to false in appropriate cases.
	 * @throws InvocationTargetException
	 */
	@Test
	public void testSettingCompositeToFalse() throws InvocationTargetException {
		List<Element> elements = process(TEST);
		Namespace test = (Namespace)elements.get(0);
		Usage p = (Usage) test.getOwnedMember().get(0);
		Usage a = (Usage) p.getOwnedMember().get(0);
		Usage x = (Usage) p.getOwnedMember().get(1);
		Usage y = (Usage) p.getOwnedMember().get(2);
		Usage z = (Usage) p.getOwnedMember().get(3);;
		Usage u = (Usage) z.getOwnedMember().get(0);
		Usage v = (Usage) u.getOwnedMember().get(0);;
		Usage w = (Usage) z.getOwnedMember().get(1);
		
		Usage q = (Usage) test.getOwnedMember().get(1);
		Usage r = (Usage) q.getOwnedMember().get(0);
		
		Definition B = (Definition) test.getOwnedMember().get(2);
		Usage p1 = (Usage) B.getOwnedMember().get(0);
		
		Usage b = (Usage) test.getOwnedMember().get(3);
		Usage p2 = (Usage) b.getOwnedMember().get(0);
		
		assertTrue(p.isReference());
		assertTrue(a.isReference());
		assertFalse(x.isReference());
		assertTrue(y.isReference());
		assertFalse(z.isReference());
		assertFalse(u.isReference());
		assertFalse(v.isReference());
		assertTrue(w.isReference());
		assertTrue(q.isReference());
		assertTrue(r.isReference());
		
		assertTrue(p1.isReference());
		assertTrue(b.isReference());
		assertTrue(p2.isReference());
	}
		
}
