/*******************************************************************************
 * SysML 2 Pilot Implementation
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
 * You should have received a copy of the GNU Lesser General Public License
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
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;

public class ProdFunction implements LibraryFunction {

	@Override
	public String getPackageName() {
		return "NumericalFunctions";
	}
	
	@Override
	public String getOperatorName() {
		return "product";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ModelLevelExpressionEvaluator evaluator) {
		EList<Element> list = evaluator.evaluateArgument(invocation, 0, target);
		if (list == null) {
			return EvaluationUtil.singletonList(invocation);
		} else {
			int intResult = 1;
			Double realResult = null;
			for (Element element: list) {
				if (element instanceof LiteralInteger) {
					int value = ((LiteralInteger)element).getValue();
					if (realResult != null) {
						realResult *= value;
					} else {
						intResult *= value;
					}
				} else if (element instanceof LiteralRational) {
					if (realResult == null) {
						realResult = (double) intResult;
					}
					realResult *= ((LiteralRational)element).getValue();
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
