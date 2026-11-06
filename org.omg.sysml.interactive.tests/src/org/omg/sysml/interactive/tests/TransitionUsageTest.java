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

package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.util.ElementUtil;

public class TransitionUsageTest extends SysMLInteractiveTest {

	
	private static final String STATE_DEF_1 = """
			state def StateDef {
			    state state1;
			    then state2;
			    state state2;
			}
			""";
	
	private static final String STATE_DEF_2 = """
			state def StateDef {
			    state state1;
			    state state2;
			    then state2;
			}
			""";
	
	@Test
	public void testTransitionShorthandNotation() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		
		// 1. After STATE_DEF_1 is processed, the shorthand transition source should be state1.
		// (In this and all following cases, the transition target should stay state2.)
		
		List<Element> elements = process(instance, STATE_DEF_1);
		StateDefinition stateDef = (StateDefinition)elements.get(0);
		List<Element> ownedMembers = stateDef.getOwnedMember();
		StateUsage state1 = (StateUsage) ownedMembers.get(0);
		TransitionUsage transition = (TransitionUsage) ownedMembers.get(1);
		StateUsage state2 = (StateUsage) ownedMembers.get(2);
		
		assertSame("1. transition.source == state1", transition.getSource(), state1);
		assertSame("1. transition.target == state2", transition.getTarget(), state2);
		
		// 2. When the processed transition is moved to the end of StateDef, its source should not change,
		// even if it is transformed again.
		
		ownedMembers.remove(transition);
		ownedMembers.add(transition);
		ElementUtil.transform(transition);
		
		assertSame("2. transition.source == state1", transition.getSource(), state1);
		assertSame("2. transition.target == state2", transition.getTarget(), state2);
		
		// 3. After STATE_DEF_2 is processed, moving the shorthand transition to the end of StateDef in the model text,
		// the shorthand transition source should be state2.
		
		elements = process(instance, STATE_DEF_2);
		stateDef = (StateDefinition)elements.get(0);
		ownedMembers = stateDef.getOwnedMember();
		state1 = (StateUsage) ownedMembers.get(0);
		state2 = (StateUsage) ownedMembers.get(1);
		transition = (TransitionUsage) ownedMembers.get(2);
		
		assertSame("3. transition.source == state2", transition.getSource(), state2);
		assertSame("3. transition.target == state2", transition.getTarget(), state2);		
	}
}
