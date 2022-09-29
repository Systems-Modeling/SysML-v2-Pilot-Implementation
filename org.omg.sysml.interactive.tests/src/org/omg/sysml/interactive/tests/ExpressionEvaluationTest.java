/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Mgnite, Inc.
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.omg.sysml.interactive.SysMLInteractive;

public class ExpressionEvaluationTest extends SysMLInteractiveTest {

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
	
	public final String evalTest4 =
			"package EvalTest4 {\n"
			+ "	part p1 {\n"
			+ "	    attribute a1;\n"
			+ "	    attribute a2 default 3;\n"
			+ "	    constraint c11 { return result = a1 < 2; }\n"
			+ "	    constraint c12 { return result = a2 < 5; }\n"
			+ "	}\n"
			+ "	\n"
			+ "	part p2 :> p1 {\n"
			+ "		attribute :>> a1 = 1;\n"
			+ "		attribute :>> a2 = 7;\n"
			+ "	}\n"
			+ "}";
	
	protected void assertElement(String expected, String actual) {
		assertTrue("expected: " + expected + " actual: " + actual, actual.startsWith(expected));
	}
	
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
	@Test
	public void testEvaluation3() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest3);		
		assertElement("AttributeUsage a1", instance.eval("p1.a1", "EvalTest3"));
		assertElement("AttributeUsage a2", instance.eval("p1.a2", "EvalTest3"));
		assertElement("LiteralInteger 11", instance.eval("p11.a1", "EvalTest3"));
		assertElement("LiteralInteger 14", instance.eval("p11.a2", "EvalTest3"));
		assertElement("LiteralInteger 12", instance.eval("p12.a1", "EvalTest3"));
		assertElement("LiteralInteger 15", instance.eval("p12.a2", "EvalTest3"));
	}

	// Tests inherited context with a redefined (bound) outer features.
	@Test
	public void testEvaluation4() throws Exception {
		SysMLInteractive instance = getSysMLInteractiveInstance();
		process(instance, evalTest4);		
		assertElement("AttributeUsage a1", instance.eval("p1.a1", "EvalTest4"));
		assertElement("LiteralInteger 3", instance.eval("p1.a2", "EvalTest4"));
		assertElement("ReferenceUsage result", instance.eval("p1.c11.result", "EvalTest4"));
		assertElement("LiteralBoolean true", instance.eval("p1.c12.result", "EvalTest4"));
		assertElement("LiteralInteger 1", instance.eval("p2.a1", "EvalTest4"));
		assertElement("LiteralInteger 7", instance.eval("p2.a2", "EvalTest4"));
		assertElement("LiteralBoolean true", instance.eval("p2.c11.result", "EvalTest4"));
		assertElement("LiteralBoolean true", instance.eval("p2.c12.result", "EvalTest4"));
	}
}
