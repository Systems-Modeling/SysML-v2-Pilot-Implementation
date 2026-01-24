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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.execution.expressions.functions.trig;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.functions.LibraryFunction;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public abstract class TrigFunction implements LibraryFunction {

	@Override
	public String getPackageName() {
		return "TrigFunctions";
	}
	
	protected abstract EList<Element> realFunction(double x);

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ModelLevelExpressionEvaluator evaluator) {
		Object x = EvaluationUtil.valueOf(evaluator.argumentValue(invocation, 0, target));
		return x instanceof Integer? realFunction((double)(int)x):
			   x instanceof Double? realFunction((double)x):
			   EvaluationUtil.singletonList(invocation);
	}
}
