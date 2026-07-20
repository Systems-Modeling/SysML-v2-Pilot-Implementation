/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/
package org.omg.sysml.execution.expressions.functions.control;

import java.util.function.BiFunction;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.EvaluationUtil;

public class MinimizeFunction extends ReduceFunction {
	private static final String MIN_FUNCTION = "DataFunctions::min";

	@Override
	public String getFunctionName() {
		return "minimize";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target,
			ExpressionEvaluator evaluator) {
		EList<Element> list = evaluator.evaluateArgument(invocation, 0, target);
		Element expr = evaluator.argumentValue(invocation, 1, target);
		if (list == null || !(expr instanceof Expression)) {
			return EvaluationUtil.singletonList(invocation);
		} else if (list.isEmpty()) {
			return EvaluationUtil.nullList();
		} else {
			return reduce(invocation, list, new BiFunction<>() {
				@Override
				public Element apply(Element result, Element value) {
					EList<Element> exprValue = evaluator.evaluateExpression((Expression)expr, target, value);
					if (exprValue == null || exprValue.size() != 1) {
						return null;
					} else if (result == null) {
						return exprValue.get(0);
					} else {
						Type minFunction = SysMLLibraryUtil.getLibraryType(expr, MIN_FUNCTION);
						InvocationExpression minInvocation = EvaluationUtil.createInvocationOf(minFunction, result, exprValue.get(0));
						EList<Element> newResult = evaluator.evaluateInvocation(minInvocation, target);
						return newResult == null || newResult.size() != 1? null: newResult.get(0);
					}
				}			
			});
		}
	}

}
