/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2024 Model Driven Solutions, Inc.
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

package org.omg.sysml.expressions.functions.data;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public abstract class ArithmeticFunction extends DataFunction {
	
	protected EList<Element> unaryIntegerOp(int x) {
		return null;
	}
	
	protected EList<Element> unaryRealOp(double x) {
		return null;
	}

	protected EList<Element> binaryIntegerOp(int x, int y) {
		return null;
	}
	
	protected EList<Element> binaryRealOp(double x, double y) {
		return null;
	}

	protected EList<Element> binaryStringOp(String x, String y) {
		return null;
	}
	
	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ExpressionEvaluator evaluator) {
		Object x = EvaluationUtil.valueOf(evaluator.argumentValue(invocation, 0, target));
		Object y = EvaluationUtil.valueOf(evaluator.argumentValue(invocation, 1, target));
		return EvaluationUtil.numberOfArgs(invocation) == 1?
					x instanceof Integer? unaryIntegerOp((Integer)x):
					x instanceof Double? unaryRealOp((Double)x):
					EvaluationUtil.nullList():
			   x instanceof Integer && y instanceof Integer? binaryIntegerOp((Integer)x, (Integer)y):
			   x instanceof Double && y instanceof Integer? binaryRealOp((Double)x, (Integer)y):
			   x instanceof Integer && y instanceof Double? binaryRealOp((Integer)x, (Double)y):
			   x instanceof Double && y instanceof Double? binaryRealOp((Double)x, (Double)y):
			   x instanceof String && y instanceof String? binaryStringOp((String)x, (String)y):
			   EvaluationUtil.singletonList(invocation);
	}

}
