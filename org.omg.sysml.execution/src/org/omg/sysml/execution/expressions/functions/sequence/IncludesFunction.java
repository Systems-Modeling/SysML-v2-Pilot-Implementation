/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2025 Model Driven Solutions, Inc.
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
package org.omg.sysml.execution.expressions.functions.sequence;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public class IncludesFunction extends SequenceFunction {

	@Override
	public String getFunctionName() {
		return "includes";
	}
	
	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ExpressionEvaluator evaluator) {
		EList<Element> list1 = evaluator.evaluateArgument(invocation, 0, target);
		EList<Element> list2 = evaluator.evaluateArgument(invocation, 1, target);
		return list1 == null || list2 == null? EvaluationUtil.singletonList(invocation):
			list2.isEmpty()? EvaluationUtil.booleanResult(true):
			list1.isEmpty()? EvaluationUtil.booleanResult(false):
			EvaluationUtil.booleanResult(includes(list1, list2));
	}
	
	protected static boolean includes(EList<Element> list1, EList<Element> list2) {
		return list2.stream().allMatch(x->list1.stream().anyMatch(y->EvaluationUtil.equal(x, y)));
	}

}
