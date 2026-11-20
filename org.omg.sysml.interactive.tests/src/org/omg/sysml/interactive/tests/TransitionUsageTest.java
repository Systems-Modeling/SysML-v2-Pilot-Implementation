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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.ElementUtil;

public class TransitionUsageTest extends SysMLInteractiveTest {
	
	private static final String STATE_DEF_1 = """
			state def StateDef_1 {
			    state state1;
			    transition state1 then state2;
			    state state2;
			}
			""";
	
	@Test
	public void testTransitionSource() throws Exception {
		List<Element> elements = process(STATE_DEF_1);
		StateDefinition stateDef = (StateDefinition)elements.get(0);
		List<Element> ownedMembers = stateDef.getOwnedMember();
		StateUsage state1 = (StateUsage) ownedMembers.get(0);
		TransitionUsage transition = (TransitionUsage) ownedMembers.get(1);
		StateUsage state2 = (StateUsage) ownedMembers.get(2);
		
		assertSame("transition.source == state1", state1, transition.getSource());
		assertSame("transition.target == state2", state2, transition.getTarget());
	}
	
	private static final String STATE_DEF_2 = """
			state def StateDef_2 {
			    state state1 {
			        state state1a;
			    }
			    transition state1.state1a then state2;
			    state state2;
			}
			""";
	
	@Test
	public void testTransitionSourceWithFeatureChain() throws Exception {
		List<Element> elements = process(STATE_DEF_2);
		StateDefinition stateDef = (StateDefinition)elements.get(0);
		List<Element> ownedMembers = stateDef.getOwnedMember();
		StateUsage state1 = (StateUsage) ownedMembers.get(0);
		StateUsage state1a = (StateUsage) state1.getOwnedMember().get(0);
		TransitionUsage transition = (TransitionUsage) ownedMembers.get(1);
		StateUsage state2 = (StateUsage) ownedMembers.get(2);
		
		assertArrayEquals("transition.sourceFeature == state1.state1a", 
				new StateUsage[] {state1, state1a}, transition.sourceFeature().getChainingFeature().toArray());
		assertSame("transition.source == state1a", state1a, transition.getSource());
		assertSame("transition.target == state2", state2, transition.getTarget());
	}

	private static final String STATE_DEF_3a = """
			state def StateDef {
			    state state1;
			    then state2;
			    state state2;
			}
			""";
	
	private static final String STATE_DEF_3b = """
			state def StateDef {
			    state state1;
			    state state2;
			    then state2;
			}
			""";
	
	@Test
	public void testTransitionShorthandNotation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		
		// 1. After STATE_DEF_1 is processed, the shorthand transition source should be state1.
		// (In this and all following cases, the transition target should stay state2.)
		
		List<Element> elements = process(instance, STATE_DEF_3a);
		StateDefinition stateDef = (StateDefinition)elements.get(0);
		List<Element> ownedMembers = stateDef.getOwnedMember();
		StateUsage state1 = (StateUsage) ownedMembers.get(0);
		TransitionUsage transition = (TransitionUsage) ownedMembers.get(1);
		StateUsage state2 = (StateUsage) ownedMembers.get(2);
		
		assertSame("1. transition.source == state1", state1, transition.getSource());
		assertSame("1. transition.target == state2", state2, transition.getTarget());
		
		// 2. When the processed transition is moved to the end of StateDef, its source should not change,
		// even if it is transformed again.
		
		ownedMembers.remove(transition);
		ownedMembers.add(transition);
		ElementUtil.clean(transition);
		ElementUtil.transform(transition);
		
		assertSame("2. transition.source == state1", state1, transition.getSource());
		assertSame("2. transition.target == state2", state2, transition.getTarget());
		
		// 3. After STATE_DEF_2 is processed, moving the shorthand transition to the end of StateDef in the model text,
		// the shorthand transition source should be state2.
		
		elements = process(instance, STATE_DEF_3b);
		stateDef = (StateDefinition)elements.get(0);
		ownedMembers = stateDef.getOwnedMember();
		state1 = (StateUsage) ownedMembers.get(0);
		state2 = (StateUsage) ownedMembers.get(1);
		transition = (TransitionUsage) ownedMembers.get(2);
		
		assertSame("3. transition.source == state2", state2, transition.getSource());
		assertSame("3. transition.target == state2", state2, transition.getTarget());		
	}
	
	private static final String STATE_DEF_4 = """
			state def StateDef {
			    state state1;
			    then state2;
			    state state2;
			}
			""";
	
	@Test
	public void testSuccessionInTransitionUsage() throws Exception {
		Resource resource = parse("TransitionUsageSuccession.sysml", STATE_DEF_4);
		List<Element> elements = ((Namespace)resource.getContents().get(0)).getOwnedElement();
		StateDefinition stateDef = (StateDefinition)elements.get(0);
		List<Element> ownedMembers = stateDef.getOwnedMember();
		StateUsage state1 = (StateUsage) ownedMembers.get(0);
		TransitionUsage transition = (TransitionUsage) ownedMembers.get(1);
		StateUsage state2 = (StateUsage) ownedMembers.get(2);
		
		List<Feature> ends = transition.getSuccession().getConnectorEnd();
		assertNull("1. transition.succession.source == null", ConnectorUtil.getRelatedFeatureOfEnd(ends.get(0)));
		assertSame("1. transition.succession.target == state2", state2, ConnectorUtil.getRelatedFeatureOfEnd(ends.get(1)));
		
		ElementUtil.transformAll(resource, false);
		assertSame("2. transition.succession.source == state1", state1, ConnectorUtil.getRelatedFeatureOfEnd(ends.get(0)));
		assertSame("2. transition.succession.target == state2", state2, ConnectorUtil.getRelatedFeatureOfEnd(ends.get(1)));		
	}

}