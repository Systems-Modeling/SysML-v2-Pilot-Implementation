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

package org.omg.sysml.expressions.functions;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;

public abstract class ArithmeticFunction implements LibraryFunction {
	
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
	public String getPackageName() {
		return "DataFunctions";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ModelLevelExpressionEvaluator evaluator) {
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
