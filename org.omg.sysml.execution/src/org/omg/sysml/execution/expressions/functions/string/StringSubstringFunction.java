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

package org.omg.sysml.execution.expressions.functions.string;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public class StringSubstringFunction extends StringFunction {

	@Override
	public String getPackageName() {
		return "StringFunctions";
	}

	@Override
	public String getFunctionName() {
		return "Substring";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ExpressionEvaluator evaluator) {
		String x = evaluator.stringValue(invocation, 0, target);
		Integer lower = evaluator.integerValue(invocation, 1, target);
		Integer upper = evaluator.integerValue(invocation, 2, target);
		return x == null || lower == null || upper == null? EvaluationUtil.singletonList(invocation):
			   lower < 1 || upper > x.length() || lower > upper + 1 ? EvaluationUtil.nullList(): 
			   EvaluationUtil.stringResult(x.substring(lower - 1, upper));
	}

}
