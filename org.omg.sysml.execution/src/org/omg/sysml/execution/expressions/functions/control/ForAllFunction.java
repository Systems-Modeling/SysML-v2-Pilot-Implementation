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

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.functions.control.ControlFunction;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public class ForAllFunction extends ControlFunction {

	@Override
	public String getOperatorName() {
		return "forAll";
	}

	public Boolean forAll(InvocationExpression invocation, Element target,
			ModelLevelExpressionEvaluator evaluator, Boolean test) {
		EList<Element> list = evaluator.evaluateArgument(invocation, 0, target);
		Element expr = evaluator.argumentValue(invocation, 1, target);
		if (list == null || !(expr instanceof Expression)) {
			return null;
		} else {
			for (Element value: list) {
				if (value == null) {
					return null;
				} else {
					EList<Element> exprValue = evaluator.evaluateExpression((Expression)expr, target, value);
					if (exprValue == null || exprValue.size() != 1) {
						return null;
					} else if (!test.equals(EvaluationUtil.valueOf(exprValue.get(0)))) {
						return false;
					}
				}
			}
			return true;
		}
	}
	
	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target,
			ModelLevelExpressionEvaluator evaluator) {
		Boolean result = forAll(invocation, target, evaluator, true);
		return result == null? EvaluationUtil.singletonList(invocation): EvaluationUtil.booleanResult(result);
	}

}
