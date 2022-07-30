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

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VerificationCaseDefinition;
import org.omg.sysml.lang.sysml.VerificationCaseUsage;

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
	 * The cached setting delegate for the '{@link #getVerificationCaseDefinition() <em>Verification Case Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationCaseDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VERIFICATION_CASE_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VERIFICATION_CASE_USAGE__VERIFICATION_CASE_DEFINITION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getVerifiedRequirement() <em>Verified Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedRequirement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VERIFIED_REQUIREMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VERIFICATION_CASE_USAGE__VERIFIED_REQUIREMENT).getSettingDelegate();

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
		return (VerificationCaseDefinition)VERIFICATION_CASE_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationCaseDefinition basicGetVerificationCaseDefinition() {
		return (VerificationCaseDefinition)VERIFICATION_CASE_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerificationCaseDefinition(VerificationCaseDefinition newVerificationCaseDefinition) {
		VERIFICATION_CASE_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newVerificationCaseDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<RequirementUsage> getVerifiedRequirement() {
		return (EList<RequirementUsage>)VERIFIED_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
				return VERIFICATION_CASE_DEFINITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.VERIFICATION_CASE_USAGE__VERIFIED_REQUIREMENT:
				return VERIFIED_REQUIREMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //VerificationCaseUsageImpl
