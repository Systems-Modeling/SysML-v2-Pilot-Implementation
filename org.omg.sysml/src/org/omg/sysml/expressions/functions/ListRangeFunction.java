/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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

package org.omg.sysml.expressions.functions;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;

public class ListRangeFunction extends DataFunction {

	@Override
	public String getOperatorName() {
		return "'..'";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ModelLevelExpressionEvaluator evaluator) {
		Object x = EvaluationUtil.valueOf(evaluator.argumentValue(invocation, 0, target));
		Object y = EvaluationUtil.valueOf(evaluator.argumentValue(invocation, 1, target));
		if (x instanceof Integer && y instanceof Integer) {
			EList<Element> result = new BasicEList<>();
			for (int i = (Integer)x; i <= (Integer)y; i++) {
				result.add(EvaluationUtil.literalInteger(i));
			}
			return result;
		}
		return EvaluationUtil.singletonList(invocation);
	}
	
}
