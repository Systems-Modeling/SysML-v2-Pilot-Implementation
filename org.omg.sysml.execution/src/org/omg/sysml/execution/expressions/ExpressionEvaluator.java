/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022-2024 Model Driven Solutions, Inc.
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
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class ExpressionEvaluator extends ModelLevelExpressionEvaluator {
	
	public static final ExpressionEvaluator INSTANCE = new ExpressionEvaluator();
	
	@Override
	public EList<Element> evaluateInvocation(InvocationExpression expression, Element target) {
		Function function = expression.getFunction();
		if (function != null && function.isModelLevelEvaluable()) {
			return super.evaluateInvocation(expression, target);
		} else {
			Type type = expression.instantiatedType();
			Expression resultExpression = null;
			if (type != null) {
				resultExpression = ExpressionUtil.getResultExpressionOf(type);
				if (resultExpression == null) {
					Feature resultParameter = TypeUtil.getResultParameterOf(type);
					if (resultParameter != null) {
						resultExpression = FeatureUtil.getValueExpressionFor(resultParameter);
					}
				}
			}
			if (resultExpression == null) {
				return EvaluationUtil.singletonList(expression);
			} else {
				Feature targetFeature = EvaluationUtil.getTargetFeatureFor(target);
				if (type instanceof Feature) {
					targetFeature = FeatureUtil.chainFeatures(targetFeature, (Feature)type);
				}
				EList<Element> results = evaluate(resultExpression, 
						FeatureUtil.chainFeatures(targetFeature, instantiateInvocation(expression, targetFeature)));
				return results == null? EvaluationUtil.singletonList(resultExpression): results;
			}
		}
	}
	
	protected InvocationExpression instantiateInvocation(InvocationExpression expression, Element target) {
		InvocationExpression instantiation = SysMLFactory.eINSTANCE.createInvocationExpression();
		
		// Copy typing from original expression.
		for (FeatureTyping typing: expression.getOwnedTyping()) {
			FeatureTyping newTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
			newTyping.setType(typing.getType());
			newTyping.setTypedFeature(instantiation);
			instantiation.getOwnedRelationship().add(newTyping);
		}
		
		// Add implicit generalization.
		ElementUtil.transform(instantiation);
		
		// Evaluate value Expressions for parameters on original instantiation.
		for (Feature parameter: TypeUtil.getOwnedParametersOf(expression)) {
			Expression valueExpression = FeatureUtil.getValueExpressionFor(parameter);
			if (valueExpression != null) {
				// Add a new parameter to hold the result of the Expression evaluation.
				Feature newParameter = SysMLFactory.eINSTANCE.createFeature();
				TypeUtil.addOwnedFeatureTo(instantiation, newParameter);
				
				newParameter.setDirection(parameter.getDirection());
				for (Feature redefinedFeature: FeatureUtil.getRedefinedFeaturesWithComputedOf(parameter, null)) {
					Redefinition newRedefinition = SysMLFactory.eINSTANCE.createRedefinition();
					newRedefinition.setRedefinedFeature(redefinedFeature);
					newRedefinition.setRedefiningFeature(newParameter);
					newParameter.getOwnedRelationship().add(newRedefinition);
				}				

				// Evaluate the value expression for the original parameter with the given target,
				// NOT including the bindings in the original invocation expression.
				EList<Element> values = evaluate(valueExpression, target);
				if (values != null) {
					// Set the value expression for the new parameter to an expression representing
					// the evaluated result of the original value expression.
					Expression evaluatedExpression = EvaluationUtil.expressionFor(values, expression);
					if (evaluatedExpression != null) {
						FeatureValue newFeatureValue = SysMLFactory.eINSTANCE.createFeatureValue();
						newFeatureValue.setValue(evaluatedExpression);
						newParameter.getOwnedRelationship().add(newFeatureValue);
					}
				}
			}
		}
		
		return instantiation;
	}
}
