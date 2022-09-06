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

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.functions.LibraryFunction;
import org.omg.sysml.expressions.util.EvaluationUtil;
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
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

public class ExpressionEvaluator {
	
	public static final ExpressionEvaluator INSTANCE = new ExpressionEvaluator();

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
		if (target instanceof Type) {
			if (referent != null) {
				if (TypeUtil.conforms(referent, ExpressionUtil.getSelfReferenceFeature(expression))) {
					EList<Element> result = new BasicEList<>();
					result.add(target);
					return result;
				} else if (referent.getOwnedFeatureChaining().isEmpty()){
					return evaluateFeature(referent, (Type)target);
				} else {
					return evaluateFeatureChain(referent.getChainingFeature(), (Type)target);
				}
			}
		}
		return EvaluationUtil.singletonList(referent);
	}
	
	public EList<Element> evaluateInvocation(InvocationExpression expression, Element target) {
		LibraryFunction function = libraryFunctionFactory.getLibraryFunction(expression.getFunction());
		return function == null? null: function.invoke(expression, target, this);
	}
	
	protected EList<Element> evaluateFeatureChain(EList<Feature> chainingFeatures, Type type) {
		List<Feature> subchainingFeatures = chainingFeatures.subList(1, chainingFeatures.size());
		FeatureReferenceExpression featureRefExpr = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
		if (chainingFeatures.size() == 2) {
			NamespaceUtil.addMemberTo(featureRefExpr, chainingFeatures.get(1));
		} else {
			NamespaceUtil.addOwnedMemberTo(featureRefExpr, FeatureUtil.chainFeatures(subchainingFeatures));
		}
		EList<Element> result = new BasicEList<>();
		for (Element value: evaluateFeature(chainingFeatures.get(0), type)) {
			if (value instanceof Feature && !((Feature)value).getOwnedFeatureChaining().isEmpty()) {
				result.add(FeatureUtil.chainFeatures((Feature)value, FeatureUtil.chainFeatures(subchainingFeatures)));
			} else {
				EList<Element> featureValue = featureRefExpr.evaluate(value);
				if (featureValue != null) {
					result.addAll(featureValue);
				}
			}
		}
		return result;
		
	}
	
	protected EList<Element> evaluateFeature(Feature feature, Type type) {
		Feature typeFeature = type.getFeature().stream().
				map(FeatureImpl.class::cast).
				filter(f->f == feature || FeatureUtil.getRedefinedFeaturesOf(f).contains(feature)).
				findFirst().orElse(null);
		if (typeFeature != null) {
			Expression value = FeatureUtil.getValueExpressionFor(typeFeature);
			return value != null? evaluate(value, type): EvaluationUtil.singletonList(typeFeature);
		} else {
			return EvaluationUtil.singletonList(feature);
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
		if (values.size() != 1) {
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
