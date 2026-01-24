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
package org.omg.sysml.execution.expressions.functions.control;

import java.util.function.BiFunction;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.EvaluationUtil;

public class MaximizeFunction extends ReduceFunction {
	private static final String MAX_FUNCTION = "DataFunctions::max";

	@Override
	public String getFunctionName() {
		return "maximize";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target,
			ModelLevelExpressionEvaluator evaluator) {
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
						Type maxFunction = SysMLLibraryUtil.getLibraryType(expr, MAX_FUNCTION);
						InvocationExpression maxInvocation = EvaluationUtil.createInvocationOf(maxFunction, result, exprValue.get(0));
						EList<Element> newResult = evaluator.evaluateInvocation(maxInvocation, target);
						return newResult == null || newResult.size() != 1? null: newResult.get(0);
					}
				}			
			});
		}
	}

}
