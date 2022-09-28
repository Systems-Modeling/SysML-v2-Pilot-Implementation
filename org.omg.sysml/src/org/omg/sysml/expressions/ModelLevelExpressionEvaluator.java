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
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NamespaceUtil;
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
		if (target == null || target instanceof Type) {
			if (referent != null) {
				if (TypeUtil.conforms(referent, ExpressionUtil.getSelfReferenceFeature(expression))) {
					EList<Element> result = new BasicEList<>();
					if (target != null) {
						result.add(target);
					}
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
		return function == null? null: function.invoke(expression, target);
	}
	
	public EList<Element> evaluateFeatureChain(EList<Feature> chainingFeatures, Type type) {
		List<Feature> subchainingFeatures = chainingFeatures.subList(1, chainingFeatures.size());
		FeatureReferenceExpression featureRefExpr = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
		if (chainingFeatures.size() == 2) {
			NamespaceUtil.addMemberTo(featureRefExpr, chainingFeatures.get(1));
		} else {
			NamespaceUtil.addOwnedMemberTo(featureRefExpr, FeatureUtil.chainFeatures(subchainingFeatures));
		}
		EList<Element> result = new BasicEList<>();
		for (Element value: evaluateFeature(chainingFeatures.get(0), type)) {
			Element target = value instanceof Feature? FeatureUtil.chainFeatures(getTargetFeature(type), (Feature)value): value;
			EList<Element> featureValue = evaluateFeatureReference(featureRefExpr, target);
			if (featureValue == null) {
				result.add(FeatureUtil.chainFeatures((Feature)value, FeatureUtil.chainFeatures(subchainingFeatures)));
			} else {
				result.addAll(featureValue);
			}
		}
		return result;		
	}
	
	protected Feature getTargetFeature(Element target) {
		Feature targetFeature;
		if (target instanceof Feature) {
			targetFeature = (Feature)target;
		} else if (target instanceof Type) {
				FeatureTyping featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
				featureTyping.setType((Type)target);
				targetFeature = SysMLFactory.eINSTANCE.createFeature();
				targetFeature.getOwnedRelationship().add(featureTyping);
		} else {
			targetFeature = SysMLFactory.eINSTANCE.createFeature();
		}
		return targetFeature;
	}
	
	public EList<Element> evaluateFeature(Feature feature, Type type) {
		if (type instanceof Feature) {
			List<Feature> chainingFeatures = ((Feature)type).getChainingFeature();
			if (!chainingFeatures.isEmpty()) {
				int i = chainingFeatures.size();
				while (i > 0) {
					Expression value = getValueExpression(feature, 
							FeatureUtil.chainFeatures(chainingFeatures.subList(0, i)));
					if (value != null) {
						return evaluate(value, type);
					}
					i--;
				}
				return EvaluationUtil.singletonList(feature);
			}
		}
		Expression value = getValueExpression(feature, type);
		return value == null? EvaluationUtil.singletonList(feature): evaluate(value, type);
	}
	
	protected Expression getValueExpression(Feature feature, Type type) {
		if (type instanceof Feature) {
			type = FeatureUtil.getBasicFeatureOf((Feature)type);
		}
		Feature typeFeature = type == null? feature: 
			type.getFeature().stream().
				filter(f->f == feature || FeatureUtil.getRedefinedFeaturesOf(f).contains(feature)).
				findFirst().orElse(feature);
		return FeatureUtil.getValueExpressionFor(typeFeature);
	}
	
}
