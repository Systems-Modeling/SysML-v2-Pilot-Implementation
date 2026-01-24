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
import org.omg.sysml.expressions.functions.control.ControlFunction;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public class RejectFunction extends ControlFunction {

	@Override
	public String getFunctionName() {
		return "reject";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target,
			ModelLevelExpressionEvaluator evaluator) {
		return collectSelected(invocation, target, evaluator, new BiFunction<>() {
			@Override
			public EList<Element> apply(Element value, EList<Element> exprValue) {
				return exprValue != null && exprValue.size() == 1 && Boolean.FALSE.equals(EvaluationUtil.valueOf(exprValue.get(0)))?
						EvaluationUtil.singletonList(value):
						EvaluationUtil.nullList();
			}			
		});
	}

}
