/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2025, 2026 Model Driven Solutions, Inc.
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
 *******************************************************************************/

package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.interactive.SysMLInteractiveResult;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConnectionDefinition;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EnumerationDefinition;
import org.omg.sysml.lang.sysml.EnumerationUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.TriggerInvocationExpression;
import org.omg.sysml.lang.sysml.Type;
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
		SysMLInteractive instance = createSysMLInteractiveInstance();
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
		SysMLInteractive instance = createSysMLInteractiveInstance();
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
		SysMLInteractive instance = createSysMLInteractiveInstance();
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

	public final String directedUsageTest1 =
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
	public void testDirectedUsage1() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(directedUsageTest1);
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
	public final String directedUsageTest2 =
			  "package Test {\n"
			+ "    item I {\n"
			+ "        in x;\n"
			+ "        in y;\n"
			+ "    }"
			+ "    action A {\n"
			+ "        in x;\n"
			+ "        in y;\n"
			+ "    }"
			+ "    constraint C {\n"
			+ "        in x;\n"
			+ "        in y;\n"
			+ "    }"
			+ "}";
	
	@Test
	public void testDirectedUsage2() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(directedUsageTest2);
		Element root = result.getRootElement();
		List<Element> elements = ((Namespace)root).getOwnedMember();
		List<Element> ownedMembers = ((Namespace)elements.get(0)).getOwnedMember();
		List<Feature> directedFeatures = ((Usage)ownedMembers.get(0)).getDirectedFeature();
		List<Usage> directedUsages = ((Usage)ownedMembers.get(0)).getDirectedUsage();
		assertEquals("item (directedFeatures.size)", 2, directedFeatures.size());
		assertEquals("item (directedUsages.size)", 2, directedUsages.size());
		assertEquals("item (directedUsages)", directedFeatures, directedUsages);
		
		// Check that getting directedFeatures and directedUsages work for ActionUsages and
		// ConstraintUsages, even though they are kinds of Steps, and Step redefines
		// directedFeature as parameter.
		
		directedFeatures = ((Usage)ownedMembers.get(1)).getDirectedFeature();
		directedUsages = ((Usage)ownedMembers.get(1)).getDirectedUsage();
		assertEquals("action (directedFeatures.size)", 2, directedFeatures.size());
		assertEquals("action (directedUsages.size)", 2, directedUsages.size());
		assertEquals("action (directedUsages)", directedFeatures, directedUsages);
		
		// The ConstraintUsage "C" has three directedFeatures, including its return parameter,
		// but only the first two are Usages.
		directedFeatures = ((Usage)ownedMembers.get(2)).getDirectedFeature();
		directedUsages = ((Usage)ownedMembers.get(2)).getDirectedUsage();
		assertEquals("constraint (directedFeatures.size)", 3, directedFeatures.size());
		assertEquals("constraint (directedUsages.size)", 2, directedUsages.size());
		assertEquals("constraint (directedUsages)", directedFeatures.subList(0, 2), directedUsages);
	}
	
	public final String enumeratedValueTest =
			  "package Test {\n"
			+ "    variation item def I {\n"
			+ "        variant item i1;\n"
			+ "        variant item i2;\n"
			+ "    }"
			+ "    enum def A {\n"
			+ "        enum a1;\n"
			+ "        enum a2;\n"
			+ "    }"
			+ "}";
	
	@Test
	public void testEnumeratedValue() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(enumeratedValueTest);
		Element root = result.getRootElement();
		List<Element> elements = ((Namespace)root).getOwnedMember();
		List<Element> ownedMembers = ((Namespace)elements.get(0)).getOwnedMember();
		List<Usage> variants = ((Definition)ownedMembers.get(0)).getVariant();
		assertEquals("item def (variants.size)", 2, variants.size());
		
		// Check that getting variant and enumeratedValue work for EnumerationDefinitions, 
		// even though EnumerationDefinition::enumeratedValue redefines Definition::variant.
		
		variants = ((Definition)ownedMembers.get(1)).getVariant();
		List<EnumerationUsage> enumeratedValues = ((EnumerationDefinition)ownedMembers.get(1)).getEnumeratedValue();
		assertEquals("enum def (variants.size)", 2, variants.size());
		assertEquals("enum def (enumeratedValues.size)", 2, enumeratedValues.size());
		assertEquals("enum def (enumeratedValues)", variants, enumeratedValues);
	}
	
	public final String circularRecursiveImportTest =
			  "package Test {\n"
			+ "    package P1 {\n"
			+ "        public import Test::**;\n"
			+ "        item def X;"
			+ "    }\n"
			+ "    package P2 {\n"
			+ "        public import Test::*::**;\n"
			+ "        item def Y;"
			+ "    }\n"
			+ "}";
	
	@Test
	public void testCircularRecursiveImport() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(circularRecursiveImportTest);
		Element root = result.getRootElement();
		List<Element> elements = ((Namespace)root).getOwnedMember();
		List<Element> ownedMembers = ((Namespace)elements.get(0)).getOwnedMember();
		List<Membership> importedMemberships = ((Namespace)ownedMembers.get(0)).getImportedMembership();
		assertArrayEquals("P1.importedMembers", new String[] {"Test", "P1", "P2", "X", "Y"}, 
				importedMemberships.stream().map(Membership::getMemberElement).map(Element::getName).toArray());
		importedMemberships = ((Namespace)ownedMembers.get(1)).getImportedMembership();
		assertArrayEquals("P2.importedMembers", new String[] {"P1", "P2", "X", "Test", "Y"}, 
				importedMemberships.stream().map(Membership::getMemberElement).map(Element::getName).toArray());
	}
	
	public final String localeTest =
			  "package Test {\n"
			+ "    comment locale \"en_US\" /* doc */\n"
			+ "    doc locale \"en_US\" /* doc */\\n"
			+ "}";
	
	@Test
	public void testLocale() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(localeTest);
		Element root = result.getRootElement();
		List<Element> elements = ((Namespace)root).getOwnedMember();
		List<Element> ownedMembers = ((Namespace)elements.get(0)).getOwnedMember();
		Comment comment = (Comment)ownedMembers.get(0);
		Documentation doc = (Documentation)ownedMembers.get(1);
		assertEquals("comment.locale", "en_US", comment.getLocale());
		assertEquals("doc.locale", "en_US", doc.getLocale());
	}
	
	public final String crossFeatureTest =
			  "package Test {"
			+ "    part def A {"
			+ "        ref b : B;"
			+ "    }"
			+ "    part def B;"
			+ "    connection def C {"
			+ "        end [0..1] ref end1 : A;"
			+ "        end ref end2 : B crosses end1.b;"
			+ "    }"
			+ "}";
	
	@Test
	public void testCrossFeature() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(crossFeatureTest);
		Element root = result.getRootElement();
		Namespace test = (Namespace)((Namespace)root).getOwnedMember().get(0);
		Definition a = (Definition)test.getOwnedMember().get(0);
		Usage a_b = a.getOwnedUsage().get(0);
		ConnectionDefinition c = (ConnectionDefinition)test.getOwnedMember().get(2);
		List<Feature> ends = c.getAssociationEnd();
		Usage end1 = (Usage)ends.get(0);
		Usage end2 = (Usage)ends.get(1);
		Feature ownedCrossFeature = end1.ownedCrossFeature();
		
		assertNotNull("end1 owned cross feature", ownedCrossFeature);
		assertEquals("end1 cross feature", end1.ownedCrossFeature(), end1.getCrossFeature());
		assertEquals("end2 cross feature", a_b, end2.getCrossFeature().getFeatureTarget());
	}
	
	public final String featureMembershipTest =
			  "package Test {\n"
			+ "	   part def A {\n"
			+ "		   attribute f;\n"
			+ "	   }\n"
			+ "	   part def B {\n"
			+ "		   public import A::*;\n"
			+ "        attribute g;\n"
			+ "	   }\n"
			+ "	   part def C :> B;"
			+ "}";
	
	@Test
	public void testFeatureMembership() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(featureMembershipTest);
		Element root = result.getRootElement();
		List<Element> elements = ((Namespace)root).getOwnedMember();
		List<Element> ownedMembers = ((Namespace)elements.get(0)).getOwnedMember();
		Definition A = (Definition)ownedMembers.get(0);
		Definition B = (Definition)ownedMembers.get(1);
		Definition C = (Definition)ownedMembers.get(2);
		assertTrue("A", testFeatureOwningTypes(A));
		assertTrue("B", testFeatureOwningTypes(B));
		assertTrue("C", testFeatureOwningTypes(C));
	}
	
	private boolean testFeatureOwningTypes(Type type) {
		return type.getFeatureMembership().stream().map(FeatureMembership::getOwningType).allMatch(t->type.specializes(t));
	}
	
	public final String namespaceResolveTest =
			  "package Test {\n"
			+ "	   part def A {\n"
			+ "		   attribute f;\n"
			+ "	   }\n"
			+ "	   part def B {\n"
			+ "		   public import A::*;\n"
			+ "        attribute g;\n"
			+ "	   }\n"
			+ "	   part def C :> B;"
			+ "}";
	
	@Test
	public void testNamespaceResolve() throws Exception {
		SysMLInteractive instance = createSysMLInteractiveInstance();
		SysMLInteractiveResult result = instance.process(namespaceResolveTest);
		Element root = result.getRootElement();
		List<Element> elements = ((Namespace)root).getOwnedMember();
		Namespace Test = (Namespace)elements.get(0);
		List<Element> ownedMembers = Test.getOwnedMember();
		Definition A = (Definition)ownedMembers.get(0);
		Definition B = (Definition)ownedMembers.get(1);
		Definition C = (Definition)ownedMembers.get(2);

		Usage f = (Usage)A.getOwnedMember().get(0);		
		Usage g = (Usage)B.getOwnedMember().get(0);
		
		assertNotNull(Test.getOwningMembership());
		assertNotNull(A.getOwningMembership());
		assertNotNull(B.getOwningMembership());
		assertNotNull(C.getOwningMembership());
		assertNotNull(f.getOwningMembership());
		assertNotNull(g.getOwningMembership());
		
		assertSame("A.resolveLocal(g)", null, A.resolveLocal("g"));
		assertSame("A.resolveLocal(f)", f.getOwningMembership(), A.resolveLocal("f"));
		assertSame("A.resolveLocal(A)", A.getOwningMembership(), A.resolveLocal("A"));
		assertSame("A.resolveLocal(B)", B.getOwningMembership(), A.resolveLocal("B"));
		assertSame("A.resolveLocal(C)", C.getOwningMembership(), A.resolveLocal("C"));
		
		assertSame("B.resolveLocal(g)", g.getOwningMembership(), B.resolveLocal("g"));
		assertSame("B.resolveLocal(f)", f.getOwningMembership(), B.resolveLocal("f"));
		
		assertSame("C.resolveLocal(g)", g.getOwningMembership(), C.resolveLocal("g"));
		assertSame("C.resolveLocal(f)", f.getOwningMembership(), C.resolveLocal("f"));
		
		assertSame("Test.resolveGlobal(Test)", Test.getOwningMembership(), Test.resolveGlobal("Test"));
		assertSame("Test.resolveGlobal(A)", null, Test.resolveGlobal("A"));
		assertSame("A.resolveGlobal(Test)", Test.getOwningMembership(), A.resolveGlobal("Test"));
		
		assertSame("A.resolve(f)", f.getOwningMembership(), A.resolve("f"));
		assertSame("A.resolve(B::f)", f.getOwningMembership(), A.resolve("B::f"));
		assertSame("A.resolve(B::g)", g.getOwningMembership(), A.resolve("B::g"));
		assertSame("A.resolve(C::f)", f.getOwningMembership(), A.resolve("C::f"));
		assertSame("A.resolve(C::g)", g.getOwningMembership(), A.resolve("C::g"));
		
		assertSame("Test.resolve(f)", null, Test.resolve("f"));
		assertSame("Test.resolve(A::f)", f.getOwningMembership(), Test.resolve("A::f"));
		assertSame("Test.resolve(B::f)", f.getOwningMembership(), Test.resolve("B::f"));
		assertSame("Test.resolve(B::g)", g.getOwningMembership(), Test.resolve("B::g"));
		assertSame("Test.resolve(C::f)", f.getOwningMembership(), Test.resolve("C::f"));
		assertSame("Test.resolve(C::g)", g.getOwningMembership(), Test.resolve("C::g"));
		
		assertSame("Test.resolve(Test::A::f)", f.getOwningMembership(), Test.resolve("Test::A::f"));
		assertSame("Test.resolve(Test::B::f)", f.getOwningMembership(), Test.resolve("Test::B::f"));
		assertSame("Test.resolve(Test::B::g)", g.getOwningMembership(), Test.resolve("Test::B::g"));
		assertSame("Test.resolve(Test::C::f)", f.getOwningMembership(), Test.resolve("Test::C::f"));
		assertSame("Test.resolve(Test::C::g)", g.getOwningMembership(), Test.resolve("Test::C::g"));
	}
	
}
