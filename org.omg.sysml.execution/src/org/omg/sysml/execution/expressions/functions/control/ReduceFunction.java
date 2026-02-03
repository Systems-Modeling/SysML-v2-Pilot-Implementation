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
import org.omg.sysml.expressions.ExpressionEvaluator;
import org.omg.sysml.expressions.functions.control.ControlFunction;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public class ReduceFunction extends ControlFunction {

	@Override
	public String getFunctionName() {
		return "reduce";
	}

	protected EList<Element> reduce(InvocationExpression invocation, EList<Element> list,
			BiFunction<Element, Element, Element> compute) {
		Element result = null;
		for (Element value: list) {
			if (value == null) {
				return EvaluationUtil.singletonList(invocation);
			} else {
				result = compute.apply(result, value);
				if (result == null) {
					return EvaluationUtil.singletonList(invocation);
				}
			}
		}
		return EvaluationUtil.singletonList(result);
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
					if (result == null) {
						return value;
					} else {
						EList<Element> exprValue = evaluator.evaluateExpression((Expression)expr, target, result, value);
						return exprValue == null || exprValue.size() != 1? null: exprValue.get(0);	
					}
				}			
			});
		}
	}

}
