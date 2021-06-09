/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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

import java.util.Optional;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
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
		if (target instanceof Type) {
			Feature referent = getReferent();
			if (referent != null) {
				if (TypeUtil.conforms(referent, getSelfReferenceFeature())) {
					EList<Element> result = new BasicEList<>();
					result.add(target);
					return result;
				} else {
					Optional<FeatureImpl> feature = ((Type)target).getFeature().stream().
							map(FeatureImpl.class::cast).
							filter(f->FeatureUtil.getRedefinedFeaturesOf(f).contains(referent)).
							findFirst();
					if (feature.isPresent()) {
						FeatureValue featureValue = FeatureUtil.getValuationFor(feature.get());
						if (featureValue != null) {
							Expression value = featureValue.getValue();
							if (value != null) {
								return value.evaluate(target);
							}
						}
					} else if (referent.getFeaturingType().isEmpty()) {
						EList<Element> result = new BasicEList<>();
						result.add(referent);
						return result;
					}
				}
			}
		}
		return new BasicEList<>();
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
