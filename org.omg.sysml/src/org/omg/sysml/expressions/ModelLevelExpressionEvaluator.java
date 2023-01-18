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

package org.omg.sysml.expressions;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.expressions.functions.LibraryFunction;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.MetadataAccessExpression;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class ModelLevelExpressionEvaluator {
	
	public static final ModelLevelExpressionEvaluator INSTANCE = new ModelLevelExpressionEvaluator();

	protected LibraryFunctionFactory libraryFunctionFactory = LibraryFunctionFactory.INSTANCE;
	
	public LibraryFunctionFactory getLibraryFunctionFactory() {
		return libraryFunctionFactory;
	}
	
	public void setLibraryFunctionFactory(LibraryFunctionFactory libraryFunctionFactory) {
		this.libraryFunctionFactory = libraryFunctionFactory;
	}
	
	public EList<Element> evaluate(Expression expression, Element target) {
		if (expression instanceof NullExpression) {
			return evaluateNull((NullExpression)expression, target);
		} else if (expression instanceof LiteralExpression) {
			return evaluateLiteral((LiteralExpression)expression, target);
		} else if (expression instanceof FeatureReferenceExpression) {
			return evaluateFeatureReference((FeatureReferenceExpression)expression, target);
		} else if (expression instanceof MetadataAccessExpression) {
			return evaluateMetadataAccess((MetadataAccessExpression)expression, target);
		} else if (expression instanceof InvocationExpression) {
			return evaluateInvocation((InvocationExpression)expression, target);
		} else {
			return new BasicEList<>();
		}		
	}
	
	public EList<Element> evaluateNull(NullExpression expression, Element target) {
		return EvaluationUtil.nullList();
	}
	
	public EList<Element> evaluateLiteral(LiteralExpression expression, Element target) {
		return EvaluationUtil.singletonList(expression);
	}
	
	public EList<Element> evaluateFeatureReference(FeatureReferenceExpression expression, Element target) {
		Feature referent = expression.getReferent();
		return referent == null? null:
			   evaluateFeature(referent, target instanceof Type? (Type)target: null);
	}
	
	public EList<Element> evaluateMetadataAccess(MetadataAccessExpression expression, Element target) {
		Element referencedElement = expression.getReferencedElement();
		EList<Element> metadataFeatures = new BasicEList<>();
		metadataFeatures.addAll(ElementUtil.getAllMetadataFeaturesOf(referencedElement));
		MetadataFeature metaclassFeature = ElementUtil.getMetaclassFeatureFor(referencedElement);
		if (metaclassFeature != null) {
			metadataFeatures.add(metaclassFeature);
		}
		return metadataFeatures;
	}
	
	public EList<Element> evaluateInvocation(InvocationExpression expression, Element target) {
		LibraryFunction function = libraryFunctionFactory.getLibraryFunction(expression.getFunction());
		return function == null? EvaluationUtil.singletonList(expression): function.invoke(expression, target, this);
	}
	
	public EList<Element> evaluateFeature(Feature feature, Type type) {
		if (type != null && TypeUtil.conforms(feature, ExpressionUtil.getSelfReferenceFeature(feature))) {
			// Evaluate "self" feature. (Note: Must be checked before test for feature chain because "self" has chaining features.)
			return EvaluationUtil.singletonList(EvaluationUtil.getTargetFeatureFor(type));
			
		} else if (!feature.getOwnedFeatureChaining().isEmpty()) {
			// Evaluate feature with a feature chain.
			return evaluateFeatureChain(feature.getChainingFeature(), type);
			
		} else {
			// If "type" has a feature chain, than this represents a nested context, to be searched
			// in reverse from the last to the first chaining feature.
			List<? extends Type> types =
				type instanceof Feature && !((Feature) type).getOwnedFeatureChaining().isEmpty()?
					((Feature)type).getChainingFeature():
					Collections.singletonList(type);
			
			// Find the most specific type with a binding for the feature and evaluate it.	
			for (int i = types.size() - 1; i >= 0; i--) {
				Type t = types.get(i);
				if (t instanceof MetadataFeature && TypeUtil.conforms(feature, EvaluationUtil.getAnnotatedElementFeature((MetadataFeature)t))) {
					// Evaluate "Metaobject::annotatedElement" feature.
					return EvaluationUtil.results(((MetadataFeature)t).getAnnotatedElement());
				} else if (EvaluationUtil.isMetaclassFeature(t)) {
					if (!(feature instanceof Expression)) {
						// Evaluate the feature as a reflective metaclass attribute.
						Element element = ((AnnotatingElement)t).getAnnotatedElement().get(0);
						EStructuralFeature eFeature = element.eClass().getEStructuralFeature(feature.getDeclaredName());
						if (eFeature != null) {
							return EvaluationUtil.results(element.eGet(eFeature, true));
						}
					}
				} else {
					// Evaluate the feature as a regular binding.
					Feature typeFeature = EvaluationUtil.getTypeFeatureFor(feature, t);
					if (typeFeature != null) {
						Expression valueExpression = FeatureUtil.getValueExpressionFor(typeFeature);
						if (valueExpression != null) {
							EList<Element> results = evaluate(valueExpression, type);
							if (results != null) {
								return results;
							}
						}
						return EvaluationUtil.singletonList(typeFeature);
					}
				}
			}
			Expression valueExpression = FeatureUtil.getValueExpressionFor(feature);			
			if (valueExpression != null) {
				EList<Element> results = evaluate(valueExpression, type);
				if (results != null) {
					return results;
				}
			}
			
			// If no value expression is found, or it is unevaluable, return the unevaluated feature.
			return EvaluationUtil.singletonList(feature);
		}
	}
	
	public EList<Element> evaluateFeatureChain(List<Feature> chainingFeatures, Type type) {
		EList<Element> values = evaluateFeature(chainingFeatures.get(0), type);
		if (chainingFeatures.size() == 1) {
			return values;
		} else {
			// Evaluate the chain of features other than the first, on each value from the
			// result of evaluating the first chaining feature.
			List<Feature> subchainingFeatures = chainingFeatures.subList(1, chainingFeatures.size());
			EList<Element> result = new BasicEList<>();
			for (Element value: values) {
				if (!(value instanceof Type)) {
					result.add(FeatureUtil.chainFeatures((Feature)value, FeatureUtil.chainFeatures(subchainingFeatures)));
				} else {
					Type target = value instanceof Feature? 
							FeatureUtil.chainFeatures(EvaluationUtil.getTargetFeatureFor(type), (Feature)value): 
							(Type)value;
					result.addAll(evaluateFeatureChain(subchainingFeatures, target));
				}
			}
			return result;
		}
	}
	
	// Utility methods
	
	public EList<Element> evaluateArgument(InvocationExpression invocation, int i, Element target) {
		EList<Expression> arguments = invocation.getArgument();
		return i >= arguments.size()? new BasicEList<>(): evaluate(arguments.get(i), target);
	}

	public Element argumentValue(InvocationExpression invocation, int i, Element target) {
		EList<Element> argumentValues = evaluateArgument(invocation, i, target);
		return argumentValues == null || argumentValues.size() != 1? null: argumentValues.get(0);
	}

	public EList<Element> expressionValue(InvocationExpression invocation, int i, Element target) {
		Element value = argumentValue(invocation, i, target);
		return value instanceof Expression? evaluate((Expression)value, target): null;
	}

	public Boolean booleanExpressionValue(InvocationExpression invocation, int i, Element target) {
		EList<Element> values = expressionValue(invocation, i, target);
		if (values == null || values.size() != 1) {
			return null;
		} else {
			Element value = values.get(0);
			return value instanceof LiteralBoolean? ((LiteralBoolean)value).isValue(): null;
		}
	}

	public Boolean booleanValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralBoolean? ((LiteralBoolean)argument).isValue(): null;
	}

	public String stringValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralString? ((LiteralString)argument).getValue(): null;
	}

	public Integer integerValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralInteger? ((LiteralInteger)argument).getValue(): null;
	}

	public Double realValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralRational? ((LiteralRational)argument).getValue(): null;
	}

}
