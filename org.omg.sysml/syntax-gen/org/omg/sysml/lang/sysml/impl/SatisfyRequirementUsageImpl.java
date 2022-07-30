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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.AssertConstraintUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Invariant;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satisfy Requirement Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SatisfyRequirementUsageImpl#isNegated <em>Is Negated</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SatisfyRequirementUsageImpl#getSatisfiedRequirement <em>Satisfied Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SatisfyRequirementUsageImpl#getSatisfyingFeature <em>Satisfying Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatisfyRequirementUsageImpl extends RequirementUsageImpl implements SatisfyRequirementUsage {

	/**
	 * The default value of the '{@link #isNegated() <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NEGATED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNegated() <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean isNegated = IS_NEGATED_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getSatisfiedRequirement() <em>Satisfied Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SATISFIED_REQUIREMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSatisfyingFeature() <em>Satisfying Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfyingFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SATISFYING_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfyRequirementUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNegated() {
		return isNegated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNegated(boolean newIsNegated) {
		boolean oldIsNegated = isNegated;
		isNegated = newIsNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED, oldIsNegated, isNegated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getSatisfiedRequirement() {
		return (RequirementUsage)SATISFIED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementUsage basicGetSatisfiedRequirement() {
		return (RequirementUsage)SATISFIED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSatisfiedRequirement(RequirementUsage newSatisfiedRequirement) {
		SATISFIED_REQUIREMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSatisfiedRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSatisfiedRequirement() {
		return basicGetSatisfiedRequirement() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSatisfyingFeature() {
		return (Feature)SATISFYING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSatisfyingFeature() {
		return (Feature)SATISFYING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSatisfyingFeature(Feature newSatisfyingFeature) {
		SATISFYING_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSatisfyingFeature);
	}
	
//	@Override
//	protected Feature getNamingFeature() {
//		return getSatisfiedRequirement();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintUsage getAssertedConstraint() {
		return getSatisfiedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintUsage basicGetAssertedConstraint() {
		return basicGetSatisfiedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertedConstraint(ConstraintUsage newAssertedConstraint) {
		if (newAssertedConstraint != null && !(newAssertedConstraint instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newAssertedConstraint must be an instance of RequirementUsage");
		}
		setSatisfiedRequirement((RequirementUsage) newAssertedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssertedConstraint() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED:
				return isNegated();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT:
				if (resolve) return getAssertedConstraint();
				return basicGetAssertedConstraint();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT:
				if (resolve) return getSatisfiedRequirement();
				return basicGetSatisfiedRequirement();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE:
				if (resolve) return getSatisfyingFeature();
				return basicGetSatisfyingFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED:
				setIsNegated((Boolean)newValue);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT:
				setAssertedConstraint((ConstraintUsage)newValue);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT:
				setSatisfiedRequirement((RequirementUsage)newValue);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE:
				setSatisfyingFeature((Feature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED:
				setIsNegated(IS_NEGATED_EDEFAULT);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT:
				setAssertedConstraint((ConstraintUsage)null);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT:
				setSatisfiedRequirement((RequirementUsage)null);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE:
				setSatisfyingFeature((Feature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED:
				return isNegated != IS_NEGATED_EDEFAULT;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT:
				return isSetAssertedConstraint();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT:
				return isSetSatisfiedRequirement();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE:
				return SATISFYING_FEATURE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Invariant.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED: return SysMLPackage.INVARIANT__IS_NEGATED;
				default: return -1;
			}
		}
		if (baseClass == AssertConstraintUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT: return SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Invariant.class) {
			switch (baseFeatureID) {
				case SysMLPackage.INVARIANT__IS_NEGATED: return SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED;
				default: return -1;
			}
		}
		if (baseClass == AssertConstraintUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT: return SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isNegated: ");
		result.append(isNegated);
		result.append(')');
		return result.toString();
	}

} //SatisfyRequirementUsageImpl
