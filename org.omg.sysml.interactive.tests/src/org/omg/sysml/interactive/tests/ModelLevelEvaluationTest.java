/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2025 Model Driven Solutions, Inc.
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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.EvaluationUtil;
import org.omg.sysml.util.TypeUtil;

public class ModelLevelEvaluationTest extends SysMLInteractiveTest {
	
	protected Expression checkFilterExpression(SysMLInteractive instance, String text) {
		List<Element> members = process(instance, "package test { filter (" + text + ") == null; }");
		assertFalse("'" + text +"': No members", members.isEmpty());
		Element member = members.get(0);
		assertTrue("'" + text + "': No package", member instanceof org.omg.sysml.lang.sysml.Package);
		List<Expression> filterConditions = ((org.omg.sysml.lang.sysml.Package)member).getFilterCondition();
		assertFalse("'" + text + "': No filter conditions", filterConditions.isEmpty());
		Expression filterCondition = filterConditions.get(0);
		assertTrue("'" + text + "': Not operator expression", filterCondition instanceof OperatorExpression);
		List<Expression> operands = ((OperatorExpression)filterCondition).getOperand();
		assertFalse("'" + text + "': No operands", operands.isEmpty());
		return operands.get(0);
	}
	
	protected Expression checkExpression(SysMLInteractive instance, String text) {
		List<Element> members = process(instance, "calc test { " + text + " }");
		assertFalse("'" + text +"': No Members", members.isEmpty());
		Element member = members.get(0);
		assertTrue("'" + text + "': Not an expression", member instanceof Expression);
		Expression resultExpression = 
				(Expression)TypeUtil.getOwnedFeatureByMembershipIn((Expression)member, ResultExpressionMembership.class);
		assertNotNull("'" + text + "': No result expression", resultExpression);
		return resultExpression;
	}
	
	protected Expression checkExpressionIsModelLevelEvaluable(SysMLInteractive instance, String text) {
		Expression expression = checkFilterExpression(instance, text);
		assertTrue("'" + text + "' is not model-level evaluable", expression.isModelLevelEvaluable());
		return expression;
	}

	protected Expression checkExpressionNotModelLevelEvaluable(SysMLInteractive instance, String text) {
		Expression expression = checkExpression(instance, text);
		assertFalse("'" + text + "' is model-level evaluable", expression.isModelLevelEvaluable());
		return expression;
	}
	
	protected List<Element> evaluateExpression(SysMLInteractive instance, Element target, String text) {
		Expression expression = checkExpressionIsModelLevelEvaluable(instance, text);
		return expression.evaluate(target);
	}
	
	protected Element evaluateSingleValue(SysMLInteractive instance, Element target, String text) {
		List<Element> results = evaluateExpression(instance, target, text);
		assertNotNull(results);
		assertTrue(results.size() <= 1);
		return results.isEmpty()? null: results.get(0);
	}
	
	protected boolean evaluateBooleanValue(SysMLInteractive instance, Element target, String text) {
		Element result = evaluateSingleValue(instance, target, text);
		assertTrue(result instanceof LiteralBoolean);
		return ((LiteralBoolean)result).isValue();
	}
	
	protected String evaluateStringValue(SysMLInteractive instance, Element target, String text) {
		Element result = evaluateSingleValue(instance, target, text);
		assertTrue(result instanceof LiteralString);
		return ((LiteralString)result).getValue();
	}
	
	protected int evaluateIntegerValue(SysMLInteractive instance, Element target, String text) {
		Element result = evaluateSingleValue(instance, target, text);
		assertTrue(result instanceof LiteralInteger);
		return ((LiteralInteger)result).getValue();
	}
	
	protected double evaluateRealValue(SysMLInteractive instance, Element target, String text) {
		Element result = evaluateSingleValue(instance, target, text);
		assertTrue(result instanceof LiteralRational);
		return ((LiteralRational)result).getValue();
	}
	
	protected Object[] evaluateListValue(SysMLInteractive instance, Element target, String text) {
		List<Element> results = evaluateExpression(instance, target, text);
		return results.stream().map(EvaluationUtil::valueOf).toArray();
	}
	
	protected MetadataFeature checkAnnotatingFeature(SysMLInteractive instance, String annotationName, String elementName) {
		Element target = instance.resolve(elementName);
		assertTrue(target instanceof Namespace);
		assertTrue(!((Namespace)target).getOwnedMembership().isEmpty());
		
		Element metadataFeature = ((Namespace)target).getOwnedMembership().get(0).getMemberElement();
		assertTrue(metadataFeature instanceof MetadataFeature);		
		assertTrue(annotationName.equals(((MetadataFeature)metadataFeature).getMetaclass().getDeclaredName()));
		
		return (MetadataFeature)metadataFeature;
	}
	
	protected Feature checkMetaclassFeature(SysMLInteractive instance, String elementName) {
		Element target = instance.resolve(elementName);
		assertNotNull(target);
		
		Feature metaclassFeature = ElementUtil.getMetaclassFeatureFor(target);
		assertNotNull(metaclassFeature);
		
		return metaclassFeature;
	}
	
	@Test
	public void testLiteralEvaluation() throws Exception {
		assertEquals(true, evaluateBooleanValue(null, null, "true"));
		assertEquals("test", evaluateStringValue(null, null, "\"test\""));
		assertEquals(1, evaluateIntegerValue(null, null, "1"));
		assertEquals(2.0, evaluateRealValue(null, null, "2.0"), 0.0);
	}

	@Test
	public void testIntegerOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "+1");
		checkExpressionIsModelLevelEvaluable(instance, "-1");
		checkExpressionIsModelLevelEvaluable(instance, "1+2");
		checkExpressionIsModelLevelEvaluable(instance, "1-2");
		checkExpressionIsModelLevelEvaluable(instance, "1*2");
		checkExpressionIsModelLevelEvaluable(instance, "1/2");
		checkExpressionIsModelLevelEvaluable(instance, "1%2");
	}

	@Test
	public void testComparisonOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "1==2");
		checkExpressionIsModelLevelEvaluable(instance, "1!=2");
		checkExpressionIsModelLevelEvaluable(instance, "1<2");
		checkExpressionIsModelLevelEvaluable(instance, "1>2");
		checkExpressionIsModelLevelEvaluable(instance, "1<=2");
		checkExpressionIsModelLevelEvaluable(instance, "1>=2");
	}

	@Test
	public void testBooleanOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "not true");
		checkExpressionIsModelLevelEvaluable(instance, "true & false");
		checkExpressionIsModelLevelEvaluable(instance, "true | false");
		checkExpressionIsModelLevelEvaluable(instance, "true xor false");
		checkExpressionIsModelLevelEvaluable(instance, "true and false");
		checkExpressionIsModelLevelEvaluable(instance, "true or false");
		checkExpressionIsModelLevelEvaluable(instance, "true implies false");
		checkExpressionIsModelLevelEvaluable(instance, "if 1 > 2? true else false");
		checkExpressionIsModelLevelEvaluable(instance, "true ?? false");
	}

	@Test
	public void testListOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "null");
		checkExpressionIsModelLevelEvaluable(instance, "()");
		checkExpressionIsModelLevelEvaluable(instance, "(1, 2, 3)");
		checkExpressionIsModelLevelEvaluable(instance, "1..3");
	}
	
	@Test
	public void testControlOpsModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		checkExpressionIsModelLevelEvaluable(instance, "null.{in x; 1}");
		checkExpressionIsModelLevelEvaluable(instance, "null.?{in x; true}");
		checkExpressionIsModelLevelEvaluable(instance, "ControlFunctions::collect(null, {in x; 1})");
		checkExpressionIsModelLevelEvaluable(instance, "ControlFunctions::select(null, {in x; true})");
	}

	@Test
	public void testNonModelLevelEvaluability() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		
		checkExpressionNotModelLevelEvaluable(instance, "SequenceFunctions::size(null)");
		checkExpressionNotModelLevelEvaluable(instance, "SequenceFunctions::includes(null, 1)");
		checkExpressionNotModelLevelEvaluable(instance, "SequenceFunctions::excludes(null, 1)");
		checkExpressionNotModelLevelEvaluable(instance, "SequenceFunctions::isEmpty(null)");
		checkExpressionNotModelLevelEvaluable(instance, "SequenceFunctions::notEmpty(null)");
		checkExpressionNotModelLevelEvaluable(instance, "StringFunctions::Substring(\"ab\", 1, 1)");
		checkExpressionNotModelLevelEvaluable(instance, "StringFunctions::Length(\"ab\")");
		checkExpressionNotModelLevelEvaluable(instance, "NumericalFunctions::sum(1)");
		checkExpressionNotModelLevelEvaluable(instance, "NumericalFunctions::product(1)");
		
		process(instance, "calc def f{ in x; }");
		checkExpressionNotModelLevelEvaluable(instance, "f(3 + 4)");
	}
	
	@Test
	public void testBooleanEvaluation() throws Exception {
		assertEquals(false, evaluateBooleanValue(null, null, "not true"));
		assertEquals(false, evaluateBooleanValue(null, null, "true & false"));
		assertEquals(true, evaluateBooleanValue(null, null, "true | false"));
		assertEquals(true, evaluateBooleanValue(null, null, "true xor false"));
		assertEquals(false, evaluateBooleanValue(null, null, "true and false"));
		assertEquals(true, evaluateBooleanValue(null, null, "true or false"));
		assertEquals(false, evaluateBooleanValue(null, null, "true implies false"));
		assertEquals(false, evaluateBooleanValue(null, null, "true implies false"));
		assertEquals(false, evaluateBooleanValue(null, null, "if 1 > 2? true else false"));
		assertEquals(true, evaluateBooleanValue(null, null, "true ?? false"));
		assertEquals(false, evaluateBooleanValue(null, null, "null ?? false"));
	}
	
	@Test
	public void testStringEvaluation() throws Exception {
		assertEquals("ab", evaluateStringValue(null, null, "\"a\" + \"b\""));
//		assertEquals("a", evaluateStringValue(null, null, "StringFunctions::Substring(\"ab\", 1, 1)"));
//		assertEquals(2, evaluateIntegerValue(null, null, "StringFunctions::Length(\"ab\")"));
	}
	
	@Test
	public void testIntegerEvaluation() throws Exception {
		assertEquals(2, evaluateIntegerValue(null, null, "+2"));
		assertEquals(-2, evaluateIntegerValue(null, null, "-2"));
		assertEquals(-1, evaluateIntegerValue(null, null, "2 - 3"));
		assertEquals(6, evaluateIntegerValue(null, null, "2 * 3"));
		assertEquals(2, evaluateIntegerValue(null, null, "2 % 3"));		
		assertEquals(2.0/3.0d, evaluateRealValue(null, null, "2 / 3"), 0);
	}
	
	@Test
	public void testRealEvaluation() throws Exception {
		assertEquals(2.0d, evaluateRealValue(null, null, "+2.0"), 0);
		assertEquals(-2.0d, evaluateRealValue(null, null, "-2.0"), 0);
		assertEquals(2.0d + 3.0d, evaluateRealValue(null, null, "2.0 + 3"), 0);
		assertEquals(2.0d - 3.0d, evaluateRealValue(null, null, "2.0 - 3"), 0);
		assertEquals(2.0d * 3.0d, evaluateRealValue(null, null, "2.0 * 3"), 0);
		assertEquals(2.0d/3.0d, evaluateRealValue(null, null, "2.0 / 3"), 0);
		assertEquals(4.0d, evaluateRealValue(null, null, "2.0 ** 2"), 0);
		assertEquals(4.0d, evaluateRealValue(null, null, "2.0 ^ 2"), 0);
	}
	
	@Test
	public void testComparisonEvaluation() throws Exception {
		assertEquals(false, evaluateBooleanValue(null, null, "2 < 2"));
		assertEquals(false, evaluateBooleanValue(null, null, "2 > 2"));
		assertEquals(true, evaluateBooleanValue(null, null, "2 <= 2"));
		assertEquals(true, evaluateBooleanValue(null, null, "2 >= 2"));
		assertEquals(true, evaluateBooleanValue(null, null, "2 == 2"));
		assertEquals(false, evaluateBooleanValue(null, null, "2 != 2"));
		assertEquals(true, evaluateBooleanValue(null, null, "2 === 2"));
		assertEquals(false, evaluateBooleanValue(null, null, "2 !== 2"));

		assertEquals(true, evaluateBooleanValue(null, null, "\"a\" < \"b\""));
		assertEquals(false, evaluateBooleanValue(null, null, "\"a\" > \"b\""));
		assertEquals(true, evaluateBooleanValue(null, null, "\"a\" <= \"b\""));
		assertEquals(false, evaluateBooleanValue(null, null, "\"a\" >= \"b\""));
		assertEquals(false, evaluateBooleanValue(null, null, "\"a\" == \"b\""));
		assertEquals(true, evaluateBooleanValue(null, null, "\"a\" != \"b\""));
		assertEquals(false, evaluateBooleanValue(null, null, "\"a\" === \"b\""));
		assertEquals(true, evaluateBooleanValue(null, null, "\"a\" !== \"b\""));
	}
	
	@Test
	public void testListEvaluation() throws Exception {
		assertArrayEquals(new Object[] {}, evaluateListValue(null, null, "null"));
		assertArrayEquals(new Object[] {}, evaluateListValue(null, null, "()"));
		assertArrayEquals(new Object[] {1, 2, 3}, evaluateListValue(null, null, "(1, 2, 3)"));
		assertArrayEquals(new Object[] {1, 2, 3}, evaluateListValue(null, null, "1..3"));
		assertArrayEquals(new Object[] {-1, 0, 1, 2}, evaluateListValue(null, null, "-1..2"));
		assertArrayEquals(new Object[] {}, evaluateListValue(null, null, "5..3"));
//		assertEquals(3, evaluateIntegerValue(null, null, "SequenceFunctions::size((1, 2, 3))"));
//		assertEquals(true, evaluateBooleanValue(null, null, "SequenceFunctions::includes((1, 2, 3), 1)"));
//		assertEquals(false, evaluateBooleanValue(null, null, "SequenceFunctions::includes((1, 2, 3), 5)"));
//		assertEquals(false, evaluateBooleanValue(null, null, "SequenceFunctions::excludes((1, 2, 3), 1)"));
//		assertEquals(true, evaluateBooleanValue(null, null, "SequenceFunctions::excludes((1, 2, 3), 5)"));
//		assertEquals(true, evaluateBooleanValue(null, null, "SequenceFunctions::isEmpty(null)"));
//		assertEquals(false, evaluateBooleanValue(null, null, "SequenceFunctions::isEmpty(1)"));
//		assertEquals(false, evaluateBooleanValue(null, null, "SequenceFunctions::isEmpty((1,2,3))"));
//		assertEquals(false, evaluateBooleanValue(null, null, "SequenceFunctions::notEmpty(null)"));
//		assertEquals(true, evaluateBooleanValue(null, null, "SequenceFunctions::notEmpty(1)"));
//		assertEquals(true, evaluateBooleanValue(null, null, "SequenceFunctions::notEmpty((1,2,3))"));
	}
	
// Note: These collect and select expressions are currently not model-level evaluable, because the feature references 
// to parameters of the body expressions are considered non-model-level evaluable (currently per the specification).
//	@Test
//	public void testControlOpEvaluation() throws Exception {
//		assertArrayEquals(new Object[] {2, 4, 6}, evaluateListValue(null, null, "(1,2,3).{in x : ScalarValues::Integer; x * 2}"));
//		assertArrayEquals(new Object[] {1, 2}, evaluateListValue(null, null, "(1,2,3).?{in x : ScalarValues::Integer; x < 3}"));
//		assertArrayEquals(new Object[] {2, 4, 6}, evaluateListValue(null, null, "(1,2,3)->ControlFunctions::collect{in x : ScalarValues::Integer; x * 2}"));
//		assertArrayEquals(new Object[] {1, 2}, evaluateListValue(null, null, "(1,2,3)->ControlFunctions::select{in x : ScalarValues::Integer; x < 3}"));
//	}
	
	@Test
	public void testConstructorEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance,
				"part def P { attribute a; attribute b; } " +
				"part p1 = new P(1, 2); " +
				"part p2 = new P(b = p1.b, a = p1.a);");
		assertEquals(true, evaluateBooleanValue(instance, null, "p1 istype P"));
		assertEquals(1, evaluateIntegerValue(instance, null, "p1.a"));
		assertEquals(2, evaluateIntegerValue(instance, null, "p1.b"));
		assertEquals(true, evaluateBooleanValue(instance, null, "p2 istype P"));
		assertEquals(1, evaluateIntegerValue(instance, null, "p2.a"));
		assertEquals(2, evaluateIntegerValue(instance, null, "p2.b"));
	}
	
	@Test
	public void testFeatureReferenceEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, 
				"metadata def Annotation { attribute a; } " +
		        "attribute x {@Annotation{a = 1;}}");
		
		assertEquals(1, evaluateIntegerValue(instance, 
				checkAnnotatingFeature(instance, "Annotation", "x"), 
				"Annotation::a"));		
	}
	
	@Test
	public void testEnumeratedValueEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, 
				"metadata def Annotation { attribute a; } " +
			    "enum def E { e; }" +
		        "attribute x {@Annotation{a = E::e;}}");
		
		assertEquals(instance.resolve("E::e"), 
				evaluateSingleValue(instance, 
						checkAnnotatingFeature(instance, "Annotation", "x"), 
						"Annotation::a"));		
	}
	
	@Test
	public void testSelfReferenceEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, 
				"metadata def Annotation; " +
		        "attribute x {@Annotation;}");
		
		MetadataFeature feature = checkAnnotatingFeature(instance, "Annotation", "x");
		assertEquals(feature, evaluateSingleValue(instance, feature, "Base::Anything::self"));		
	}
	
	@Test
	public void testIsTypeEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, 
				"metadata def Annotation { attribute a; attribute b; } " +
			    "enum def E { e; }" +
		        "attribute x {@Annotation{a = E::e; b = 2;}}");
		
		MetadataFeature feature = checkAnnotatingFeature(instance, "Annotation", "x");
		assertTrue(evaluateBooleanValue(instance, feature, "Annotation::a istype E"));		
		assertTrue(evaluateBooleanValue(instance, feature, "Annotation::b istype ScalarValues::Integer"));		
	}
	
	@Test
	public void testSelfIsTypeEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, 
				"metadata def Annotation; " +
				"attribute x {@Annotation;}");
		
		assertTrue(evaluateBooleanValue(instance, 
				checkAnnotatingFeature(instance, "Annotation", "x"), 
				"@Annotation"));
	}
	
	@Test
	public void testSelfIsMetaclassEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, "attribute a; part p;");
		
		assertTrue(evaluateBooleanValue(instance, 
				checkMetaclassFeature(instance, "a"), 
				"@SysML::AttributeUsage"));
		assertFalse(evaluateBooleanValue(instance, 
				checkMetaclassFeature(instance, "a"), 
				"@SysML::PartUsage"));
				
		assertTrue(evaluateBooleanValue(instance, 
				checkMetaclassFeature(instance, "p"), 
				"@SysML::PartUsage"));
		assertFalse(evaluateBooleanValue(instance, 
				checkMetaclassFeature(instance, "p"), 
				"@SysML::AttributeUsage"));

		assertTrue(evaluateBooleanValue(instance, 
				checkMetaclassFeature(instance, "p"), 
				"hastype SysML::PartUsage"));
		assertFalse(evaluateBooleanValue(instance, 
				checkMetaclassFeature(instance, "p"), 
				"hastype SysML::ItemUsage"));
	}
	
	@Test
	public void testReflectiveAccess() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, "abstract part def P { attribute x; }");
		
		assertTrue(evaluateBooleanValue(instance, null, "P.metadata#(1) istype SysML::PartDefinition"));
		assertTrue(evaluateBooleanValue(instance, null, "P.metadata @ SysML::PartDefinition"));
		assertTrue(evaluateBooleanValue(instance, null, "P @@ SysML::PartDefinition"));
		assertEquals("P", evaluateStringValue(instance, null, "P.metadata.annotatedElement.name#(1)"));
		assertEquals("P", evaluateStringValue(instance, null, "(P.metadata as KerML::Element).name"));
		assertEquals("P", evaluateStringValue(instance, null, "(P meta KerML::Element).name"));
		assertTrue(evaluateBooleanValue(instance, null, "(P.metadata as SysML::PartDefinition).isAbstract"));
		assertTrue(evaluateBooleanValue(instance, null, "(P meta SysML::PartDefinition).isAbstract"));
		assertEquals("x", evaluateStringValue(instance, null, "(P meta SysML::PartDefinition).ownedAttribute.name"));
		assertEquals("PartDefinition", evaluateStringValue(instance, null, "(SysML::PartDefinition meta KerML::Element).name"));
	}

	@Test
	public void testMetadataAccess() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, "metadata def M1 { attribute a; }" +
						  "metadata def M2;" +
						  "abstract part def P { @M1 { a = 1; } @M2; }");
		
		assertTrue(evaluateBooleanValue(instance, null, "P.metadata#(1) istype M1"));
		assertTrue(evaluateBooleanValue(instance, null, "P.metadata#(2) istype M2"));
		assertTrue(evaluateBooleanValue(instance, null, "P.metadata#(3) istype SysML::PartDefinition"));
		assertTrue(evaluateBooleanValue(instance, null, "P.metadata @ M1"));
		assertTrue(evaluateBooleanValue(instance, null, "P.metadata @ M2"));
		assertTrue(evaluateBooleanValue(instance, null, "P.metadata @ SysML::PartDefinition"));
		assertTrue(evaluateBooleanValue(instance, null, "P @@ M1"));
		assertTrue(evaluateBooleanValue(instance, null, "P @@ M2"));
		assertTrue(evaluateBooleanValue(instance, null, "P @@ SysML::PartDefinition"));
		assertTrue(evaluateBooleanValue(instance, null, "P @@ KerML::Element"));
		assertEquals("P", evaluateStringValue(instance, null, "P.metadata.annotatedElement.name#(1)"));
		assertEquals(1, evaluateIntegerValue(instance, null, "(P.metadata as M1).a"));
		assertEquals(1, evaluateIntegerValue(instance, null, "(P meta M1).a"));
	}

}
