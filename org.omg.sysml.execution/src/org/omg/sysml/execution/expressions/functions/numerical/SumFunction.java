/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2025 Model Driven Solutions, Inc.
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

package org.omg.sysml.execution.expressions.functions.numerical;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.util.EvaluationUtil;

public class SumFunction extends NumericalFunction {

	@Override
	public String getFunctionName() {
		return "sum";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ExpressionEvaluator evaluator) {
		EList<Element> list = evaluator.evaluateArgument(invocation, 0, target);
		if (list == null) {
			return EvaluationUtil.singletonList(invocation);
		} else {
			int intResult = 0;
			Double realResult = null;
			for (Element element: list) {
				if (element instanceof LiteralInteger) {
					int value = ((LiteralInteger)element).getValue();
					if (realResult != null) {
						realResult += value;
					} else {
						intResult += value;
					}
				} else if (element instanceof LiteralRational) {
					if (realResult == null) {
						realResult = (double) intResult;
					}
					realResult += ((LiteralRational)element).getValue();
				} else {
					return EvaluationUtil.singletonList(invocation);
				}
			}
			return realResult == null? 
						EvaluationUtil.integerResult(intResult):
						EvaluationUtil.realResult(realResult);
		}
	}

}
