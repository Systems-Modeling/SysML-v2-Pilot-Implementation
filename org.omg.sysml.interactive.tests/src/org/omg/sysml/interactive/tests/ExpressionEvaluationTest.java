/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Mgnite, Inc.
 * Copyright (c) 2022, 2023, 2025-2026 Model Driven Solutions, Inc.
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
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;

public class ExpressionEvaluationTest extends SysMLInteractiveTest {

	protected void assertElement(String message, String expected, String actual) {
		message = message == null? "": message + " ";
		assertTrue(message + "expected: " + expected + " actual: " + actual, actual.startsWith(expected));
	}
	
	protected void assertElement(String expected, String actual) {
		assertElement(null, expected, actual);
	}
	
	protected void assertList(String[] expecteds, String actual) {
		String[] actuals = actual.isEmpty()? new String[] {}: actual.split("\n");
		assertEquals("length", expecteds.length, actuals.length);
		for (int i = 0; i < expecteds.length; i++) {
			assertElement("[" + i + "]", expecteds[i], actuals[i]);
		}
	}
	
	public final String evalTest1 =
			"package EvalTest1 {\n"
			+ "	part p1 {\n"
			+ "		attribute a1 = 1;\n"
			+ "		part p11 {\n"
			+ "			attribute a2 = a1 + 1;\n"
			+ "		} \n"
			+ "	}\n"
			+ "	\n"
			+ "	part p11 :> p1 {\n"
			+ "		attribute a2 = a1 + 2;\n"
			+ "		part p12 :> p1.p11;\n"
			+ "	}\n"
			+ "	\n"
			+ "}";
	
	@Test
	public void testEvaluation1() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest1);
		assertElement("LiteralInteger 3", instance.eval("p11.a2", "EvalTest1"));
		assertElement("LiteralInteger 2", instance.eval("p11.p11.a2", "EvalTest1"));
		assertElement("LiteralInteger 2", instance.eval("p11.p12.a2", "EvalTest1"));
		assertElement("LiteralInteger 2", instance.eval("p1.p11.a2", "EvalTest1"));
	}
	
	// Tests inheritance and outer scopes.
	public final String evalTest2 =
			"package EvalTest2 {\n"
			+ "	part p1 {\n"
			+ "		attribute a1 = 1;\n"
			+ "	}\n"
			+ "	part p2 {\n"
			+ "		attribute a2 = 2;\n"
			+ "		part p21 :> p1 {\n"
			+ "			attribute a21 = a1 + a2;\n"
			+ "		}	\n"
			+ "	}\n"
			+ "}";

	@Test
	public void testEvaluation2() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest2);
		assertElement("LiteralInteger 1", instance.eval("p1.a1", "EvalTest2"));
		assertElement("LiteralInteger 2", instance.eval("p2.a2", "EvalTest2"));
		assertElement("LiteralInteger 1", instance.eval("p2.p21.a1", "EvalTest2"));
		assertElement("LiteralInteger 3", instance.eval("p2.p21.a21", "EvalTest2"));
	}
	
	// Tests different inheritance contexts.	
	public final String evalTest3 =
			"package EvalTest3 {\n"
			+ "	part p1 {\n"
			+ "		attribute a1;\n"
			+ "		attribute a2 = a1 + 3;\n"
			+ "		\n"
			+ "	}\n"
			+ "	part p11 :> p1 {\n"
			+ "		attribute :>> a1 default 11;\n"
			+ "	}\n"
			+ "	part p12 :> p1 {\n"
			+ "		attribute :>> a1 = 12;\n"
			+ "	}\n"
			+ "}";
	
	@Test
	public void testEvaluation3() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest3);		
		assertElement("AttributeUsage a1", instance.eval("p1.a1", "EvalTest3"));
		assertElement("OperatorExpression +", instance.eval("p1.a2", "EvalTest3"));
		assertElement("LiteralInteger 11", instance.eval("p11.a1", "EvalTest3"));
		assertElement("LiteralInteger 14", instance.eval("p11.a2", "EvalTest3"));
		assertElement("LiteralInteger 12", instance.eval("p12.a1", "EvalTest3"));
		assertElement("LiteralInteger 15", instance.eval("p12.a2", "EvalTest3"));
	}

	// Tests inherited context with redefined (bound) outer features.
	public final String evalTest4 =
			"package EvalTest4 {\n"
			+ "	part p1 {\n"
			+ "	    attribute a1;\n"
			+ "	    attribute a2 default 3;\n"
			+ "	    constraint c11 { a1 < 2 }\n"
			+ "	    constraint c12 { a2 < 5 }\n"
			+ "	}\n"
			+ "	\n"
			+ "	part p2 :> p1 {\n"
			+ "		attribute :>> a1 = 1;\n"
			+ "		attribute :>> a2 = 7;\n"
			+ "	}\n"
			+ "}";
	
	@Test
	public void testEvaluation4() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest4);		
		assertElement("AttributeUsage a1", instance.eval("p1.a1", "EvalTest4"));
		assertElement("LiteralInteger 3", instance.eval("p1.a2", "EvalTest4"));
		assertElement("OperatorExpression <", instance.eval("p1.c11()", "EvalTest4"));
		assertElement("LiteralBoolean true", instance.eval("p1.c12()", "EvalTest4"));
		assertElement("LiteralInteger 1", instance.eval("p2.a1", "EvalTest4"));
		assertElement("LiteralInteger 7", instance.eval("p2.a2", "EvalTest4"));
		assertElement("LiteralBoolean true", instance.eval("p2.c11()", "EvalTest4"));
		assertElement("LiteralBoolean false", instance.eval("p2.c12()", "EvalTest4"));
	}
	
	// Tests functional invocation of constraints.
	public final String evalTest5 =
			"package EvalTest5 {\n"
			+ "	constraint def MaxValue {\n"
			+ "		in max;\n"
			+ "		in value;\n"
			+ "		value <= max\n"
			+ "	}\n"
			+ "	\n"
			+ "	attribute max1 = 3;\n"
			+ "	\n"
			+ "	part p1 {\n"
			+ "		attribute value1 default 2;\n"
			+ "		attribute value2 default 4;\n"
			+ "		\n"
			+ "		constraint c1 : MaxValue {\n"
			+ "			in max = max1;\n"
			+ "			in value = value1;\n"
			+ "		}\n"
			+ "		\n"
			+ "		constraint c2 { MaxValue(max = max1, value = value2) }\n"
			+ "	}\n"
			+ "	\n"
			+ "	part p2 :> p1 {\n"
			+ "		attribute :>> value1 = 4;\n"
			+ "		attribute :>> value2 = 2;\n"
			+ "	}\n"
			+ "}";
	
	@Test
	public void testEvaluation5() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest5);
		assertElement("LiteralBoolean true", instance.eval("p1.c1()", "EvalTest5"));
		assertElement("LiteralBoolean false", instance.eval("p1.c2()", "EvalTest5"));
		assertElement("LiteralBoolean false", instance.eval("p2.c1()", "EvalTest5"));
		assertElement("LiteralBoolean true", instance.eval("p2.c2()", "EvalTest5"));
		assertElement("LiteralBoolean true", instance.eval("MaxValue(max1, p1.value1)", "EvalTest5"));
		assertElement("LiteralBoolean false", instance.eval("MaxValue(max1, p1.value2)", "EvalTest5"));
		assertElement("LiteralBoolean true", instance.eval("MaxValue(max1 * 2, p1.value1 + p1.value2)", "EvalTest5"));
	}
	
	// Tests calc and calc def invocation.
	public final String evalTest6 =
			"package EvalTest6 {\n"
			+ "	calc def A {\n"
			+ "		in x;\n"
			+ "		in y;\n"
			+ "		\n"
			+ "		x + y\n"
			+ "	}\n"
			+ "	\n"
			+ "	part p1 {\n"
			+ "		attribute a default 10;\n"
			+ "\n"
			+ "		calc b {\n"
			+ "			in u;\n"
			+ "			in v;\n"
			+ "			in w;\n"
			+ "			\n"
			+ "			return r = A(u, v * w) + a;\n"
			+ "		}\n"
			+ "		\n"
			+ "		ref z1 = b(1, 2, 3);\n"
			+ "	}\n"
			+ "	\n"
			+ "	part p2 :> p1 {\n"
			+ "		attribute :>> a = 20;\n"
			+ "\n"
			+ "		ref z2 = b(1, 2, 3);\n"
			+ "	}\n"
			+ "}";
	
	@Test
	public void testEvaluation6() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest6);
		assertElement("LiteralInteger 10", instance.eval("p1.a", "EvalTest6"));
		assertElement("LiteralInteger 17", instance.eval("p1.z1", "EvalTest6"));
		assertElement("LiteralInteger 20", instance.eval("p2.a", "EvalTest6"));
		assertElement("LiteralInteger 27", instance.eval("p2.z1", "EvalTest6"));
		assertElement("LiteralInteger 27", instance.eval("p2.z2", "EvalTest6"));
		assertElement("LiteralInteger 17", instance.eval("p1.b(1,2,3)", "EvalTest6"));
		assertElement("LiteralInteger 27", instance.eval("p2.b(1,2,3)", "EvalTest6"));
	}
	
	// Tests recursive invocation and binding of feature references in invocation arguments.
	public final String evalTest7 =
			"package EvalTest7 {\n"
			+ "	calc def Fact {\n"
			+ "		in x;\n"
			+ "		\n"
			+ "		// 'x' in x-1 is evaluated in context of caller,\n"
			+ "		// not in context of the invocation.\n"
			+ "		if x <= 0? 1 else x * Fact(x = x - 1)\n"
			+ "	}\n"
			+ "	\n"
			+ "	part test {\n"
			+ "		attribute fact1 = Fact(1);\n"
			+ "		attribute fact5 = Fact(5);\n"
			+ "	}\n"
			+ "}";
	
	@Test
	public void testEvaluation7() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest7);
		assertElement("LiteralInteger 1", instance.eval("test.fact1", "EvalTest7"));
		assertElement("LiteralInteger 120", instance.eval("test.fact5", "EvalTest7"));
		assertElement("LiteralInteger 6", instance.eval("Fact(3)", "EvalTest7"));
	}
	
	// Tests recursive invocation and binding of feature references in invocation arguments.
	public final String chainTest =
			"package ChainTest {"
			+ "  part def A {\n"
			+ "    attribute z;\n"
			+ " }\n"
			+  "part x {\n"
			+ "    part a = b;\n"
			+ "    part b : A {\n"
			+ "        attribute :>> z default 0;\n"
			+ "    }\n"
			+ " }\n"
			+ " part y :> x {\n"
			+ "    part :>> b {\n"
			+ "        attribute :>> z = 1;\n"
			+ "    }\n"
			+ " }"
			+ "}";
	
	@Test
	public void testChainEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, chainTest);
		assertElement("LiteralInteger 1", instance.eval("y.a.z", "ChainTest"));
	}
	
	// Test index operator functionality.
	public final String indexOperatorTest =
			"package IndexOperatorTest {\n"
			+ "	   private import Collections::*;\n"
			+ "    attribute seq [*] ordered = (\"a\", \"b\", \"c\");\n"
			+ "	   attribute list : List {\n"
			+ "	       :>> elements = (1, 2, 3, 4);\n"
			+ "	   }\n"
			+ "    attribute arr1 : Array {\n"
			+ "        :>> dimensions = (2, 3);\n"
			+ "        :>> elements = (\"a\", \"b\", \"c\",\n"
			+ "                        \"x\", \"y\", \"z\");\n"
			+ "    }\n"
			+ "    attribute arr2 : Array {\n"
			+ "        :>> dimensions = (2, 3, 4);\n"
			+ "        :>> elements = ((111, 112, 113, 114,\n"
			+ "                         121, 122, 123, 124,\n"
			+ "                         131, 132, 133, 134),\n"
			+ "                        (211, 212, 213, 214,\n"
			+ "			                221, 222, 223, 224,\n"
			+ "                         231, 232, 233, 234));\n"
			+ "    }\n"
			+ "}";
	
	@Test
	public void testIndexOperator() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, indexOperatorTest);
		assertElement("LiteralString a", instance.eval("seq#(1)", "IndexOperatorTest"));
		assertElement("LiteralString b", instance.eval("seq#(2)", "IndexOperatorTest"));
		assertElement("LiteralInteger 1", instance.eval("list#(1)", "IndexOperatorTest"));
		assertElement("LiteralInteger 2", instance.eval("list#(2)", "IndexOperatorTest"));
		assertElement("LiteralInteger 3", instance.eval("list#(3)", "IndexOperatorTest"));
		assertElement("LiteralInteger 4", instance.eval("list#(4)", "IndexOperatorTest"));
		assertElement("LiteralString a", instance.eval("arr1#(1,1)", "IndexOperatorTest"));
		assertElement("LiteralString b", instance.eval("arr1#(1,2)", "IndexOperatorTest"));
		assertElement("LiteralString c", instance.eval("arr1#(1,3)", "IndexOperatorTest"));
		assertElement("LiteralString x", instance.eval("arr1#(2,1)", "IndexOperatorTest"));
		assertElement("LiteralString y", instance.eval("arr1#(2,2)", "IndexOperatorTest"));
		assertElement("LiteralString z", instance.eval("arr1#(2,3)", "IndexOperatorTest"));
		assertElement("LiteralInteger 111", instance.eval("arr2#(1,1,1)", "IndexOperatorTest"));
		assertElement("LiteralInteger 123", instance.eval("arr2#(1,2,3)", "IndexOperatorTest"));
		assertElement("LiteralInteger 134", instance.eval("arr2#(1,3,4)", "IndexOperatorTest"));
		assertElement("LiteralInteger 211", instance.eval("arr2#(2,1,1)", "IndexOperatorTest"));
		assertElement("LiteralInteger 232", instance.eval("arr2#(2,3,2)", "IndexOperatorTest"));
		assertElement("LiteralInteger 234", instance.eval("arr2#(2,3,4)", "IndexOperatorTest"));
	}
	
	// Test named-argument invocation.
	public final String invocationTest =
			"package InvocationTest {\n"
			+ "	   calc def Test {"
			+ "        in x;"
			+ "        in y;"
			+ "        x"
			+ "     }"
			+ "}";
	
	@Test
	public void testInvocationEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, invocationTest);
		assertElement("LiteralInteger 1", instance.eval("Test(1, 2)", "InvocationTest"));
		assertElement("LiteralInteger 1", instance.eval("Test(x = 1, y = 2)", "InvocationTest"));
		assertElement("LiteralInteger 1", instance.eval("Test(y = 2, x = 1)", "InvocationTest"));
	}
	
	@Test
	public void testArithmeticEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		assertElement("LiteralInteger 5", instance.eval("2 + 3", null));
		assertElement("LiteralInteger -1", instance.eval("2 - 3", null));
		assertElement("LiteralInteger 6", instance.eval("2 * 3", null));
		assertElement("LiteralRational " + 2.0/3, instance.eval("2.0 / 3", null));
		assertElement("LiteralRational 4.0", instance.eval("2.0 ** 2", null));
		assertElement("LiteralRational 4.0", instance.eval("2.0 ^ 2", null));
	}

	@Test
	public void testListOpsExpression() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		assertList(new String[] {}, instance.eval("null", null));
		assertList(new String[] {}, instance.eval("()", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3"}, instance.eval("(1, 2, 3)", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3"}, instance.eval("1..3", null));
	}
	
	@Test
	public void testSequenceFunctionEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		assertElement("LiteralInteger 3", instance.eval("SequenceFunctions::size((1, 2, 3))", null));
		
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::includes((1, 2, 3), 1)", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::includes((1, 2, 3), 5)", null));
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::includes((1, 2, 3), (1, 3))", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::includes((1, 2, 3), (1, 5))", null));
		
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::includesOnly((1, 2, 3), (3, 2, 1))", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::includesOnly((1, 2, 3), (1, 5))", null));
		
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::excludes((1, 2, 3), 1)", null));
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::excludes((1, 2, 3), 5)", null));
		
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::isEmpty(null)", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::isEmpty(1)", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::isEmpty((1,2,3))", null));
		
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::notEmpty(null)", null));
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::notEmpty(1)", null));
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::notEmpty((1,2,3))", null));
		
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::equals((1, 2, 3), (1, 2, 3))", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::equals((1, 2, 3), (2, 1, 3))", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::equals((1, 2, 3), (1, 5))", null));
		
		assertElement("LiteralBoolean true", instance.eval("SequenceFunctions::same((1, 2, 3), (1, 2, 3))", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::same((1, 2, 3), (2, 1, 3))", null));
		assertElement("LiteralBoolean false", instance.eval("SequenceFunctions::same((1, 2, 3), (1, 5))", null));
		
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3", "LiteralInteger 4"}, instance.eval("SequenceFunctions::including((1, 2, 3), 4)", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3", "LiteralInteger 4", "LiteralInteger 5"}, instance.eval("SequenceFunctions::including((1, 2, 3), (4,5))", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::including((1, 2, 3), ())", null));
		
		assertList(new String[]{"LiteralInteger 4", "LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::includingAt((1, 2, 3), 4, 1)", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 4", "LiteralInteger 5", "LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::includingAt((1, 2, 3), (4,5), 2)", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3", "LiteralInteger 4"}, instance.eval("SequenceFunctions::includingAt((1, 2, 3), 4, *)", null));
		
		assertList(new String[]{"LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::excluding((1, 2, 3), 1)", null));
		assertList(new String[]{"LiteralInteger 2"}, instance.eval("SequenceFunctions::excluding((1, 2, 3), (1,3))", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::excluding((1, 2, 3), ())", null));
		
		assertList(new String[]{"LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::excludingAt((1, 2, 3), 1)", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 4"}, instance.eval("SequenceFunctions::excludingAt((1, 2, 3, 4), 2, 3)", null));
		assertList(new String[]{"LiteralInteger 1"}, instance.eval("SequenceFunctions::excludingAt((1, 2, 3), 2, *)", null));
		
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::subsequence((1, 2, 3), 1)", null));
		assertList(new String[]{"LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::subsequence((1, 2, 3), 2)", null));
		assertList(new String[]{"LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::subsequence((1, 2, 3, 4), 2, 3)", null));
		assertList(new String[]{"LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::subsequence((1, 2, 3), 2, *)", null));
		
		assertList(new String[]{"LiteralInteger 1"}, instance.eval("SequenceFunctions::head((1, 2, 3))", null));
		assertList(new String[]{}, instance.eval("SequenceFunctions::head(())", null));
		assertList(new String[]{"LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::tail((1, 2, 3))", null));
		assertList(new String[]{}, instance.eval("SequenceFunctions::tail(())", null));
		assertList(new String[]{"LiteralInteger 3"}, instance.eval("SequenceFunctions::last((1, 2, 3))", null));
		assertList(new String[]{}, instance.eval("SequenceFunctions::last(())", null));
		
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3"}, instance.eval("SequenceFunctions::union((1, 2, 3), ())", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 2", "LiteralInteger 3", "LiteralInteger 4", "LiteralInteger 5"}, instance.eval("SequenceFunctions::union((1, 2, 3), (4, 5))", null));
		assertList(new String[]{"LiteralInteger 4", "LiteralInteger 5"}, instance.eval("SequenceFunctions::union((), (4, 5))", null));
		
		assertList(new String[]{}, instance.eval("SequenceFunctions::intersection((1, 2, 3), ())", null));
		assertList(new String[]{}, instance.eval("SequenceFunctions::intersection((1, 2, 3), (4, 5))", null));
		assertList(new String[]{"LiteralInteger 1", "LiteralInteger 3"}, instance.eval("SequenceFunctions::intersection((1, 2, 3), (1, 3, 4))", null));
		assertList(new String[]{}, instance.eval("SequenceFunctions::intersection((), (4, 5))", null));
	}
	
	public final String collectionTest =
			"package CollectionTest {\n"
			+ "	   private import Collections::*;\n"
			+ "    attribute empty = new OrderedCollection(elements = null);\n"
			+ "	   attribute collection1 = new OrderedCollection(elements = 1);\n"
			+ "	   attribute collection5 = new OrderedCollection(elements = 5);\n"
			+ "	   attribute collection15 = new OrderedCollection(elements = (1, 5));\n"
			+ "	   attribute collection123 = new OrderedCollection(elements = (1, 2, 3));\n"
			+ "	   attribute collection123a = new OrderedCollection(elements = (1, 2, 3));\n"
			+ "	   attribute collection321 = new OrderedCollection(elements = (3, 2, 1));\n"
			+ "}";
	
	@Test
	public void testCollectionFunctionEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, collectionTest);
		
		assertElement("LiteralInteger 3", instance.eval("CollectionFunctions::size(collection123)", "CollectionTest"));
		
		assertElement("LiteralBoolean true", instance.eval("CollectionFunctions::contains(collection123, 1)", "CollectionTest"));
		assertElement("LiteralBoolean false", instance.eval("CollectionFunctions::contains(collection123, 5)", "CollectionTest"));
		assertElement("LiteralBoolean true", instance.eval("CollectionFunctions::contains(collection123, (1, 3))", "CollectionTest"));
		assertElement("LiteralBoolean false", instance.eval("CollectionFunctions::contains(collection123, (1, 5))", "CollectionTest"));
		
		assertElement("LiteralBoolean true", instance.eval("CollectionFunctions::containsAll(collection123, collection321)", "CollectionTest"));
		assertElement("LiteralBoolean false", instance.eval("CollectionFunctions::containsAll(collection123, collection15)", "CollectionTest"));
		
		assertElement("LiteralBoolean true", instance.eval("CollectionFunctions::isEmpty(empty)", "CollectionTest"));
		assertElement("LiteralBoolean false", instance.eval("CollectionFunctions::isEmpty(collection1)", "CollectionTest"));
		assertElement("LiteralBoolean false", instance.eval("CollectionFunctions::isEmpty(collection123)", "CollectionTest"));
		
		assertElement("LiteralBoolean false", instance.eval("CollectionFunctions::notEmpty(empty)", "CollectionTest"));
		assertElement("LiteralBoolean true", instance.eval("CollectionFunctions::notEmpty(collection1)", "CollectionTest"));
		assertElement("LiteralBoolean true", instance.eval("CollectionFunctions::notEmpty(collection123)", "CollectionTest"));
		
		assertElement("LiteralBoolean true", instance.eval("CollectionFunctions::'=='(collection123, collection123a)", "CollectionTest"));
		assertElement("LiteralBoolean false", instance.eval("CollectionFunctions::'=='(collection123, collection321)", "CollectionTest"));
		assertElement("LiteralBoolean false", instance.eval("CollectionFunctions::'=='(collection123, collection15)", "CollectionTest"));
		
		assertElement("LiteralInteger 2", instance.eval("CollectionFunctions::'#'(collection123, 2)", "CollectionTest"));
		assertList(new String[]{}, instance.eval("CollectionFunctions::'#'(collection123, 4)", "CollectionTest"));
		
		assertList(new String[]{"LiteralInteger 1"}, instance.eval("CollectionFunctions::head(collection123)", "CollectionTest"));
		assertList(new String[]{}, instance.eval("CollectionFunctions::head(empty)", "CollectionTest"));
		assertList(new String[]{"LiteralInteger 2", "LiteralInteger 3"}, instance.eval("CollectionFunctions::tail(collection123)", "CollectionTest"));
		assertList(new String[]{}, instance.eval("CollectionFunctions::tail(empty)", "CollectionTest"));
		assertList(new String[]{"LiteralInteger 3"}, instance.eval("CollectionFunctions::last(collection123)", "CollectionTest"));
		assertList(new String[]{}, instance.eval("CollectionFunctions::last(empty)", "CollectionTest"));
	}
	
	@Test
	public void testNumericalFunctionEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		assertElement("LiteralInteger 6", instance.eval("NumericalFunctions::sum((1,2,3))", null));
		assertElement("LiteralInteger 6", instance.eval("NumericalFunctions::product((1,2,3))", null));
	}
	
	@Test
	public void testControlOpEvaluation() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		assertList(new String[] {"LiteralInteger 2", "LiteralInteger 4", "LiteralInteger 6"}, instance.eval("(1,2,3).{in x : ScalarValues::Integer; x * 2}", null));
		assertList(new String[] {"LiteralInteger 1", "LiteralInteger 2"}, instance.eval("(1,2,3).?{in x : ScalarValues::Integer; x < 3}", null));
		assertList(new String[] {"LiteralInteger 2", "LiteralInteger 4", "LiteralInteger 6"}, instance.eval("(1,2,3)->ControlFunctions::collect{in x : ScalarValues::Integer; x * 2}", null));
		assertList(new String[] {"LiteralInteger 1", "LiteralInteger 2"}, instance.eval("(1,2,3)->ControlFunctions::select{in x : ScalarValues::Integer; x < 3}", null));
	}
}
