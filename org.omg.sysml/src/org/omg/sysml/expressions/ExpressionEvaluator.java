/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
 * Copyright (c) 2022 Mgnite Inc.
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
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
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
		} else if (expression instanceof ConstraintUsage) {
			return evaluateConstraintUsage((ConstraintUsage) expression, target);
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
        if (referent instanceof Expression) {
            return evaluate((Expression) referent, target);
        } else if (target instanceof Type) {
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
		return function == null? null: function.invoke(expression, target);
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
				filter(
						f->f == feature || FeatureUtil.getRedefinedFeaturesOf(f).contains(feature)).
				findFirst().orElse(null);
		if (typeFeature != null) {
			FeatureValue featureValue = FeatureUtil.getValuationFor(typeFeature);
			if (featureValue != null) {
				Expression value = featureValue.getValue();
				if (value != null) {
					return evaluate(value, type);
				}
			}
			return EvaluationUtil.singletonList(typeFeature);
		} else {
			return EvaluationUtil.singletonList(feature);
		}
	}

    protected EList<Element> evaluateConstraintUsage(ConstraintUsage cu, Element target) {
        Boolean b
            = cu.getFeatureMembership().stream()
            .filter((x) -> { return (x instanceof ResultExpressionMembership)
                              || (x instanceof RequirementConstraintMembership); })
            .map((x) -> {
                Feature f = x.getOwnedMemberFeature();
                if (f instanceof Expression) {
                    // ISSUE: Currently RequirementConstraintCheck does not work properly because it uses allTrue().
                    if ((cu instanceof RequirementUsage)
                        && (x instanceof ResultExpressionMembership)) return true;
                    EList<Element> r = evaluate((Expression) f, target);
                    if (r == null) return null;
                    for (Element e: r) {
                        if (e instanceof LiteralBoolean) {
                            LiteralBoolean lb = (LiteralBoolean) e;
                            if (!lb.isValue()) return false;
                        } else {
                            return null;
                        }
                    }
                    return true;
                } else {
                    return true;
                }
            }).reduce(true, (x, y) -> {
                if (x == null || y == null) return null;
                else return x && y;
            });
        if (b == null) return null;
        return EvaluationUtil.booleanResult(b);
    }
}
