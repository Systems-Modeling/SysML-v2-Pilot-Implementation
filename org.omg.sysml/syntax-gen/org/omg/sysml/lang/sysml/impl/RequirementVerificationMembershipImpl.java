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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.RequirementVerificationMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Verification Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementVerificationMembershipImpl#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementVerificationMembershipImpl#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementVerificationMembershipImpl extends RequirementConstraintMembershipImpl implements RequirementVerificationMembership {

	/**
	 * The cached setting delegate for the '{@link #getOwnedRequirement() <em>Owned Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_REQUIREMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getVerifiedRequirement() <em>Verified Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VERIFIED_REQUIREMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementVerificationMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REQUIREMENT_VERIFICATION_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getVerifiedRequirement() {
		return (RequirementUsage)VERIFIED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementUsage basicGetVerifiedRequirement() {
		return (RequirementUsage)VERIFIED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifiedRequirement(RequirementUsage newVerifiedRequirement) {
		VERIFIED_REQUIREMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newVerifiedRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerifiedRequirement() {
		return basicGetVerifiedRequirement() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getOwnedRequirement() {
		return (RequirementUsage)OWNED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementUsage basicGetOwnedRequirement() {
		return (RequirementUsage)OWNED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedRequirement(RequirementUsage newOwnedRequirement) {
		OWNED_REQUIREMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedRequirement);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedRequirement() {
		return basicGetOwnedRequirement() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getOwnedConstraint() {
		return getOwnedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage basicGetOwnedConstraint() {
		return basicGetOwnedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConstraint(ConstraintUsage newOwnedConstraint) {
		if (newOwnedConstraint != null && !(newOwnedConstraint instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newOwnedConstraint must be an instance of RequirementUsage");
		}
		setOwnedRequirement((RequirementUsage) newOwnedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConstraint() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getReferencedConstraint() {
		return getVerifiedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage basicGetReferencedConstraint() {
		return basicGetVerifiedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedConstraint(ConstraintUsage newReferencedConstraint) {
		if (newReferencedConstraint != null && !(newReferencedConstraint instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newReferencedConstraint must be an instance of RequirementUsage");
		}
		setVerifiedRequirement((RequirementUsage) newReferencedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedConstraint() {
  		return false;
	}
	
	// Additional Overrides
	
	@Override
	public RequirementConstraintKind getKind() {
		return RequirementConstraintKind.REQUIREMENT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Consider the "kind" property to never be explicitly "set". 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		return featureID != SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND && eIsSetGen(featureID);
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				if (resolve) return getOwnedRequirement();
				return basicGetOwnedRequirement();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				if (resolve) return getVerifiedRequirement();
				return basicGetVerifiedRequirement();
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
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				setOwnedRequirement((RequirementUsage)newValue);
				return;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				setVerifiedRequirement((RequirementUsage)newValue);
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
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				setOwnedRequirement((RequirementUsage)null);
				return;
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				setVerifiedRequirement((RequirementUsage)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(int featureID) {
		switch (featureID) {
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_CONSTRAINT:
				return isSetOwnedConstraint();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__REFERENCED_CONSTRAINT:
				return isSetReferencedConstraint();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				return isSetOwnedRequirement();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				return isSetVerifiedRequirement();
		}
		return super.eIsSet(featureID);
	}

} //RequirementVerificationMembershipImpl
