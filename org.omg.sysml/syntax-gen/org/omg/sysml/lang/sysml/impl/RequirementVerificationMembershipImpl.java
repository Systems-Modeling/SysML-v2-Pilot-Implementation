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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.RequirementVerificationMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;

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

	private Type subsettingBaseDefault;
	private Type subsettingPartDefault;

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
		RequirementUsage verifiedRequirement = basicGetVerifiedRequirement();
		return verifiedRequirement != null && verifiedRequirement.eIsProxy() ? (RequirementUsage)eResolveProxy((InternalEObject)verifiedRequirement) : verifiedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RequirementUsage basicGetVerifiedRequirement() {
		RequirementUsage ownedRequirement = getOwnedRequirement();
		Type subsettingBaseDefault = getSubsettingBaseDefault(ownedRequirement);
		Type subsettingPartDefault = getSubsettingPartDefault(ownedRequirement);
		return FeatureUtil.getSubsettedFeatureOf(ownedRequirement, RequirementUsage.class, 
				feature->feature == subsettingBaseDefault || feature == subsettingPartDefault);
	}

	protected Type getSubsettingBaseDefault(RequirementUsage requirement) {
		if (subsettingBaseDefault == null) {
			subsettingBaseDefault = SysMLLibraryUtil.getLibraryType(this, 
					ImplicitGeneralizationMap.getDefaultSupertypeFor(requirement.getClass(), "base"));
		}
		return subsettingBaseDefault;
	}

	protected Type getSubsettingPartDefault(RequirementUsage requirement) {
		if (subsettingPartDefault == null) {
			subsettingPartDefault = SysMLLibraryUtil.getLibraryType(this, 
					ImplicitGeneralizationMap.getDefaultSupertypeFor(requirement.getClass(), "subrequirement"));
		}
		return subsettingPartDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setVerifiedRequirement(RequirementUsage newVerifiedRequirement) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getOwnedRequirement() {
		RequirementUsage ownedRequirement = basicGetOwnedRequirement();
		return ownedRequirement != null && ownedRequirement.eIsProxy() ? (RequirementUsage)eResolveProxy((InternalEObject)ownedRequirement) : ownedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RequirementUsage basicGetOwnedRequirement() {
		ConstraintUsage constraint = super.basicGetConstraint();
		return constraint instanceof RequirementUsage? (RequirementUsage)constraint: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedRequirement(RequirementUsage newOwnedRequirement) {
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
	public ConstraintUsage getConstraint() {
		return getOwnedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage basicGetConstraint() {
		return basicGetOwnedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(ConstraintUsage newConstraint) {
		if (newConstraint != null && !(newConstraint instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newConstraint must be an instance of RequirementUsage");
		}
		setOwnedRequirement((RequirementUsage) newConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraint() {
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__CONSTRAINT:
				return isSetConstraint();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__OWNED_REQUIREMENT:
				return isSetOwnedRequirement();
			case SysMLPackage.REQUIREMENT_VERIFICATION_MEMBERSHIP__VERIFIED_REQUIREMENT:
				return basicGetVerifiedRequirement() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementVerificationMembershipImpl
