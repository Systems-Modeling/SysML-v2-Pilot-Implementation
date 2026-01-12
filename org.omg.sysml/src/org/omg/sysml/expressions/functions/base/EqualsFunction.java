/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2026 Model Driven Solutions, Inc.
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

package org.omg.sysml.expressions.functions.base;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.EvaluationUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.TypeUtil;

public class EqualsFunction extends BaseFunction {

	@Override
	public String getOperatorName() {
		return "'=='";
	}

	protected boolean isCollection(InvocationExpression invocation, EList<Element> values) {
		Type collectionType = ExpressionUtil.getCollectionDataType(invocation);
		return values != null && values.size() == 1 && values.get(0) instanceof Type && 
			   TypeUtil.specializes((Type)values.get(0), collectionType);
	}
	
	protected boolean compare(EList<Element> x, EList<Element> y) {
		// Note: This allows comparison of arbitrary lists, even though the '==' function args have multiplicity 0..1.
		return EvaluationUtil.equal(x, y);
	}
	
	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target, ModelLevelExpressionEvaluator evaluator) {
		EList<Element> x = evaluator.evaluateArgument(invocation, 0, target);
		EList<Element> y = evaluator.evaluateArgument(invocation, 1, target);
		if (isCollection(invocation, x) && isCollection(invocation, y)) {
			x = EvaluationUtil.getElementsOf((Feature)x.get(0));
			y = EvaluationUtil.getElementsOf((Feature)y.get(0));
		}
		return x == null || y == null? EvaluationUtil.singletonList(invocation): 			
			EvaluationUtil.booleanResult(compare(x, y));
	}

}
