/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
package org.omg.sysml.execution.expressions.functions.sequence;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.util.EvaluationUtil;

public class IncludingAtFunction extends SequenceFunction {

	@Override
	public String getFunctionName() {
		return "includingAt";
	}
	
	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ModelLevelExpressionEvaluator evaluator) {
		EList<Element> seq = evaluator.evaluateArgument(invocation, 0, target);
		EList<Element> values = evaluator.evaluateArgument(invocation, 1, target);
		Element index = evaluator.argumentValue(invocation, 2, target);
		if (seq == null || values == null || index == null) {
			return EvaluationUtil.singletonList(invocation);
		} else {
			Object indexValue = EvaluationUtil.valueOf(index);
			if (!(indexValue == null || indexValue instanceof Integer)) {
				return EvaluationUtil.singletonList(invocation);
			} else {
				int i = indexValue == null? seq.size(): ((Integer)indexValue) - 1;
				if (i < 0) {
					i = 0;
				}
				EList<Element> result = new BasicEList<>(seq.subList(0, i));
				result.addAll(values);
				result.addAll(seq.subList(i, seq.size()));
				return result;
			}
		}
	}

}
