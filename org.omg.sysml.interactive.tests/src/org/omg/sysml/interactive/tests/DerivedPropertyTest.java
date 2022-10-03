/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.lang.sysml.Usage;

public class DerivedPropertyTest extends SysMLInteractiveTest {

	@Test
	public void testOwnedUsage() throws Exception {
		List<Element> members = process("part def P { attribute x; item y; part def Q; }");
		assertFalse("No members", members.isEmpty());
		Element member = members.get(0);
		assertTrue("No definition", member instanceof Definition);
		List<Usage> usages = ((Definition)member).getOwnedUsage();
		assertEquals(2, usages.size());
		assertTrue("Not AttributeUsage", usages.get(0) instanceof AttributeUsage);
		assertTrue("Not ItemUsage", usages.get(1) instanceof ItemUsage);
	}
	
	@Test
	public void testPayloadArgument() throws Exception {
		List<Element> members = process("action { accept after 5; }");
		assertFalse("No members", members.isEmpty());
		Element member = members.get(0);
		assertTrue("Not ActionUsage", member instanceof ActionUsage);
		Element action = ((ActionUsage)member).getNestedAction().get(0);
		assertTrue("Not AcceptActionUsage", action instanceof AcceptActionUsage);
		Expression arg = ((AcceptActionUsage)action).getPayloadArgument();
		assertTrue("Not TriggerInvocationExpression", arg instanceof TriggerInvocationExpression);
	}

}
