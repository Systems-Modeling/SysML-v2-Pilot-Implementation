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

package org.omg.sysml.execution.expressions;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class ExpressionEvaluator extends org.omg.sysml.expressions.ExpressionEvaluator {
	
	public static final ExpressionEvaluator INSTANCE = new ExpressionEvaluator();
	
	@Override
	public EList<Element> evaluateInvocation(InvocationExpression expression, Element target) {
		Function function = expression.getFunction();
		if (function != null && function.isModelLevelEvaluable()) {
			return super.evaluateInvocation(expression, target);
		} else {
			Type type = expression.getOwnedTyping().stream().map(FeatureTyping::getType).findFirst().orElse(null);
			target = expression;
			if (type instanceof Feature) {
				EList<FeatureChaining> featureChainings = ((Feature)type).getOwnedFeatureChaining();
				if (!featureChainings.isEmpty()) {
					target = featureChainings.get(0).getChainingFeature();
				}
			}
			Type expressionType = type instanceof Feature? FeatureUtil.getBasicFeatureOf((Feature)type): type;
			Expression resultExpression = ExpressionUtil.getResultExpressionOf(expressionType);
			if (resultExpression == null) {
				Feature resultParameter = TypeUtil.getResultParameterOf(expressionType);
				resultExpression = FeatureUtil.getValueExpressionFor(resultParameter);
			}
			return resultExpression == null? null: evaluate(resultExpression, target);
		}
	}
	
}
