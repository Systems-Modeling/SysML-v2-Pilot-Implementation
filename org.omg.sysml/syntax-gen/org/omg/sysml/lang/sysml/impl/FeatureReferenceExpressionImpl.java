/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NamespaceUtil;
import org.omg.sysml.util.TypeUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Feature
 * Reference Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureReferenceExpressionImpl#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureReferenceExpressionImpl extends ExpressionImpl implements FeatureReferenceExpression {
	
	public static final String SELF_REFERENCE_FEATURE = "Base::Anything::self";
	
	private Feature selfReferenceFeature = null;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureReferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_REFERENCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getReferent() {
		Feature referent = basicGetReferent();
		return referent != null && referent.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)referent) : referent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Feature basicGetReferent() {
		Element referent = ExpressionUtil.getReferentFor(this);
		return referent instanceof Feature? (Feature)referent:
			   referent == null? getSelfReferenceFeature():
			   null;
	}
	
	protected Feature getSelfReferenceFeature() {
		if (selfReferenceFeature == null) {
			selfReferenceFeature = (Feature)SysMLLibraryUtil.getLibraryType(this, SELF_REFERENCE_FEATURE);
		}
		return selfReferenceFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setReferent(Feature newReferent) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean isModelLevelEvaluable() {
		return true;
	}
	
	@Override
	public EList<Element> evaluate(Element target) {
		Feature referent = getReferent();
		if (target instanceof Type) {
			if (referent != null) {
				if (TypeUtil.conforms(referent, getSelfReferenceFeature())) {
					EList<Element> result = new BasicEList<>();
					result.add(target);
					return result;
				} else if (referent.getOwnedFeatureChaining().isEmpty()){
					return evaluateFeature(referent, (Type)target);
				} else {
					EList<Feature> chainingFeatures = referent.getChainingFeature();
					List<Feature> subchainingFeatures = chainingFeatures.subList(1, chainingFeatures.size());
					FeatureReferenceExpression featureRefExpr = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
					if (chainingFeatures.size() == 2) {
						NamespaceUtil.addMemberTo(featureRefExpr, chainingFeatures.get(1));
					} else {
						NamespaceUtil.addOwnedMemberTo(featureRefExpr, FeatureUtil.chainFeatures(subchainingFeatures));
					}
					EList<Element> result = new BasicEList<>();
					for (Element value: evaluateFeature(chainingFeatures.get(0), (Type)target)) {
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
			}
		}
		EList<Element> result = new BasicEList<>();
		result.add(referent);
		return result;
	}
	
	protected static EList<Element> evaluateFeature(Feature feature, Type type) {
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
					return value.evaluate(type);
				}
			}
			EList<Element> result = new BasicEList<>();
			result.add(typeFeature);
			return result;
		} else {
			EList<Element> result = new BasicEList<>();
			result.add(feature);
			return result;
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
				if (resolve) return getReferent();
				return basicGetReferent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
				setReferent((Feature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
				setReferent((Feature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.FEATURE_REFERENCE_EXPRESSION__REFERENT:
				return basicGetReferent() != null;
		}
		return super.eIsSet(featureID);
	}

} // FeatureReferenceExpressionImpl
