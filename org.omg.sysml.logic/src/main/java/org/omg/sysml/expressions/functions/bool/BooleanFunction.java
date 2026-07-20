/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022 Model Driven Solutions, Inc.
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

package org.omg.sysml.expressions.functions.bool;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ExpressionEvaluator;
import org.omg.sysml.expressions.functions.LibraryFunction;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public abstract class BooleanFunction implements LibraryFunction {
	
	protected EList<Element> unaryBooleanOp(Boolean x) {
		return null;
	}
	
	protected EList<Element> binaryBooleanOp(Boolean x, Boolean y) {
		return null;
	}
	
	@Override
	public String getPackageName() {
		return "DataFunctions";
	}
	
	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ExpressionEvaluator evaluator) {
		Boolean x_bool = evaluator.booleanValue(invocation, 0, target);
		Boolean y_bool = evaluator.booleanValue(invocation, 1, target);
		EList<Element> results = EvaluationUtil.numberOfArgs(invocation) == 1? unaryBooleanOp(x_bool):
			binaryBooleanOp(x_bool, y_bool);
		return results == null? EvaluationUtil.singletonList(invocation): results;
	}

}
