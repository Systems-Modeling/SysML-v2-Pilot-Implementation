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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.ViewUsage;

public class DerivedPropertyAndOperationTest extends SysMLInteractiveTest {

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
		List<Element> members = process("action { accept after 5[SI::s]; }");
		assertFalse("No members", members.isEmpty());
		Element member = members.get(0);
		assertTrue("Not ActionUsage", member instanceof ActionUsage);
		Element action = ((ActionUsage)member).getNestedAction().get(0);
		assertTrue("Not AcceptActionUsage", action instanceof AcceptActionUsage);
		Expression arg = ((AcceptActionUsage)action).getPayloadArgument();
		assertTrue("Not TriggerInvocationExpression", arg instanceof TriggerInvocationExpression);
	}

	public final String test =
			  "	package Test {"
			  + "	package P {\n"
			+ "			public part p1;\n"
			+ "		}\n"
			+ "		\n"
			+ "		view v {\n"
			+ "			expose P::*;\n"
			+ "		}\n"
			+ "	}";
	
	@Test
	public void testViewExpose() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		List<Element> elements = process(instance, test);
		ViewUsage view = (ViewUsage)((Namespace)elements.get(0)).getOwnedMember().get(1);
		List<Element> exposed = view.getExposedElement();
		assertEquals(1, exposed.size());
	}
	
	public final String qualifiedNameTest =
			"package Test {\n"
			+ "    package P {\n"
			+ "        item x;\n"
			+ "        item x;\n"
			+ "    }"
			+ "}";
	
	@Test
	public void testQualifiedName() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(qualifiedNameTest);
		Element root = result.getRootElement();
		List<Element> elements = ((Namespace)root).getOwnedMember();
		Namespace P = (Namespace)((Namespace)elements.get(0)).getOwnedMember().get(0);
		List<Element> P_ownedMembers = P.getOwnedMember();
		assertEquals("Test::P::x", P_ownedMembers.get(0).getQualifiedName());
		assertNull(P_ownedMembers.get(1).getQualifiedName());
	}
	
	public final String pathTest =
			  "// Path of package: TopLevel\n"
			+ "// Path of owning membership: TopLevel/owningMembership\n"
			+ "package TopLevel {\n"
			+ "\n"
			+ "    // Path of classifier: TopLevel::A\n"
			+ "    // Path of owning membership: TopLevel::A/owningMembership\n"
			+ "    part def A;\n"
			+ "\n"
			+ "    // Path of classifier: TopLevel::B\n"
			+ "    // Path of owning membership: TopLevel::B/owningMembership\n"
			+ "    // Path of owned subclassification: TopLevel::B/1\n"
			+ "    part def B specializes A {\n"
			+ "        // Path of owning membership: TopLevel::B/2\n"
			+ "        // Path of feature:  TopLevel::B/2/1\n"
			+ "        ref;\n"
			+ "    }\n"
			+ "\n"
			+ "    // Path of owning membership: TopLevel/3\n"
			+ "    // Path of classifier: TopLevel/3/1\n"
			+ "    part def {\n"
			+ "        // Path of owning membership: TopLevel/3/1/1\n"
			+ "        // Path of feature: TopLevel/3/1/1/1\n"
			+ "        ref f;\n"
			+ "    }\n"
			+ "}";
	
	@Test
	public void testPathOperation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		List<Element> elements = process(instance, pathTest);
		
		Namespace TopLevel = (Namespace)elements.get(0);
		assertEquals("TopLevel", TopLevel.path());
		assertEquals("TopLevel/owningMembership", TopLevel.getOwningMembership().path());
		
		Namespace A = (Namespace)TopLevel.getOwnedMember().get(0);
		assertEquals("TopLevel::A", A.path());
		assertEquals("TopLevel::A/owningMembership", A.getOwningMembership().path());
		
		Namespace B = (Namespace)TopLevel.getOwnedMember().get(1);
		assertEquals("TopLevel::B", B.path());
		assertEquals("TopLevel::B/owningMembership", B.getOwningMembership().path());
		
		Relationship B_1 = B.getOwnedRelationship().get(0);
		assertEquals("TopLevel::B/1", B_1.path());
		
		Relationship B_2 = B.getOwnedRelationship().get(1);
		assertEquals("TopLevel::B/2", B_2.path());
		assertEquals("TopLevel::B/2/1", B_2.getOwnedRelatedElement().get(0).path());
		
		Relationship TopLevel_3 = TopLevel.getOwnedRelationship().get(2);
		assertEquals("TopLevel/3", TopLevel_3.path());
		
		Element TopLevel_3_1 = TopLevel_3.getOwnedRelatedElement().get(0);
		assertEquals("TopLevel/3/1", TopLevel_3_1.path());
		
		Relationship TopLevel_3_1_1 = TopLevel_3_1.getOwnedRelationship().get(0);
		assertEquals("TopLevel/3/1/1", TopLevel_3_1_1.path());
		assertEquals("TopLevel/3/1/1/1", TopLevel_3_1_1.getOwnedRelatedElement().get(0).path());
	}

	public final String directedUsageTest =
			  "package Test {\n"
			+ "    item def I {\n"
			+ "        in x;\n"
			+ "        in y;\n"
			+ "    }"
			+ "    action def A {\n"
			+ "        in x;\n"
			+ "        in y;\n"
			+ "    }"
			+ "    constraint def C {\n"
			+ "        in x;\n"
			+ "        in y;\n"
			+ "    }"
			+ "}";
	
	@Test
	public void testDirectedUsage() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(directedUsageTest);
		Element root = result.getRootElement();
		List<Element> elements = ((Namespace)root).getOwnedMember();
		List<Element> ownedMembers = ((Namespace)elements.get(0)).getOwnedMember();
		List<Feature> directedFeatures = ((Definition)ownedMembers.get(0)).getDirectedFeature();
		List<Usage> directedUsages = ((Definition)ownedMembers.get(0)).getDirectedUsage();
		assertEquals("item def (directedFeatures.size)", 2, directedFeatures.size());
		assertEquals("item def (directedUsages.size)", 2, directedUsages.size());
		assertEquals("item def (directedUsages)", directedFeatures, directedUsages);
		
		// Check that getting directedFeatures and directedUsages work for ActionDefinitions and
		// ConstraintDefinitions, even though they are kinds of Behaviors, and Behavior redefines
		// directedFeature as parameter.
		
		directedFeatures = ((Definition)ownedMembers.get(1)).getDirectedFeature();
		directedUsages = ((Definition)ownedMembers.get(1)).getDirectedUsage();
		assertEquals("action def (directedFeatures.size)", 2, directedFeatures.size());
		assertEquals("action def (directedUsages.size)", 2, directedUsages.size());
		assertEquals("action def (directedUsages)", directedFeatures, directedUsages);
		
		// The ConstraintDefinition "C" has three directedFeatures, including its return parameter,
		// but only the first two are Usages.
		directedFeatures = ((Definition)ownedMembers.get(2)).getDirectedFeature();
		directedUsages = ((Definition)ownedMembers.get(2)).getDirectedUsage();
		assertEquals("constraint def (directedFeatures.size)", 3, directedFeatures.size());
		assertEquals("constraint def (directedUsages.size)", 2, directedUsages.size());
		assertEquals("constraint def (directedUsages)", directedFeatures.subList(0, 2), directedUsages);
	}
	
}
