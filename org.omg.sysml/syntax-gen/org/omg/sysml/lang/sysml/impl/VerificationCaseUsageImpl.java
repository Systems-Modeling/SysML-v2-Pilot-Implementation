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

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Case Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VerificationCaseUsageImpl#getVerificationCaseDefinition <em>Verification Case Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VerificationCaseUsageImpl#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationCaseUsageImpl extends CaseUsageImpl implements VerificationCaseUsage {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationCaseUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VERIFICATION_CASE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationCaseDefinition getVerificationCaseDefinition() {
		VerificationCaseDefinition verificationCaseDefinition = basicGetVerificationCaseDefinition();
		return verificationCaseDefinition != null && verificationCaseDefinition.eIsProxy() ? (VerificationCaseDefinition)eResolveProxy((InternalEObject)verificationCaseDefinition) : verificationCaseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VerificationCaseDefinition basicGetVerificationCaseDefinition() {
		CaseDefinition definition = super.basicGetCaseDefinition();
		return definition instanceof VerificationCaseDefinition? (VerificationCaseDefinition)definition: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setVerificationCaseDefinition(VerificationCaseDefinition newVerificationCaseDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<RequirementUsage> getVerifiedRequirement() {
		EList<RequirementUsage> verifiedRequirements = new NonNotifyingEObjectEList<>(RequirementUsage.class, this, SysMLPackage.VERIFICATION_CASE_DEFINITION__VERIFIED_REQUIREMENT);
		RequirementUsage objective = getObjectiveRequirement();
		if (objective != null) {
			VerificationCaseDefinitionImpl.getVerifiedRequirements(objective).forEachOrdered(verifiedRequirements::add);
		}
		return verifiedRequirements;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFICATION_CASE_DEFINITION:
				if (resolve) return getVerificationCaseDefinition();
				return basicGetVerificationCaseDefinition();
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFIED_REQUIREMENT:
				return getVerifiedRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFICATION_CASE_DEFINITION:
				setVerificationCaseDefinition((VerificationCaseDefinition)newValue);
				return;
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFIED_REQUIREMENT:
				getVerifiedRequirement().clear();
				getVerifiedRequirement().addAll((Collection<? extends RequirementUsage>)newValue);
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
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFICATION_CASE_DEFINITION:
				setVerificationCaseDefinition((VerificationCaseDefinition)null);
				return;
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFIED_REQUIREMENT:
				getVerifiedRequirement().clear();
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
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFICATION_CASE_DEFINITION:
				return basicGetVerificationCaseDefinition() != null;
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFIED_REQUIREMENT:
				return !getVerifiedRequirement().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerificationCaseUsageImpl
