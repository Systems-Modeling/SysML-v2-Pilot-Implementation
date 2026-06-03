/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022-2026 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.execution.expressions;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.functions.LibraryFunction;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.EvaluationUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

public class ExpressionEvaluator extends ModelLevelExpressionEvaluator {
	
	public static final ExpressionEvaluator INSTANCE = new ExpressionEvaluator();
	
	public ExpressionEvaluator() {
		super();
		setLibraryFunctionFactory(new LibraryFunctionFactory());
	}
	
	@Override
	public EList<Element> evaluateInvocation(InvocationExpression expression, Element target) {
		Function function = expression.getFunction();
		LibraryFunction libraryFunction = libraryFunctionFactory.getLibraryFunction(function);
		if (libraryFunction != null) {
			return libraryFunction.invoke(expression, target, this);
		} else {
			Type type = expression.instantiatedType();
			Expression resultExpression = EvaluationUtil.getResultExpressionFor(type);
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
		
		// Copy instantiatedType from original expression.
		Type instantiatedType = expression.getInstantiatedType();
		NamespaceUtil.addMemberTo(instantiation, instantiatedType);
		
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
				for (Feature redefinedFeature: FeatureUtil.getRedefinedFeaturesWithComputedOf(parameter)) {
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
	
	@Override
	public EList<Element> evaluateFeature(Feature feature, Type type) {
		EList<Element> results = super.evaluateFeature(feature, type);
		Element result = results == null || results.size() != 1? null: results.get(0);
		
		// Treat an unbound input parameter as if it was null.
		return type != null && result instanceof Feature && !(result instanceof Expression) &&
			   FeatureUtil.isInputParameter((Feature)results.get(0), type)? EvaluationUtil.nullList(): results;
	}
	
}
