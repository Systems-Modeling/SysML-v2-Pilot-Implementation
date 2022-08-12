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
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.UseCaseDefinition;
import org.omg.sysml.lang.sysml.UseCaseUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UseCaseUsageImpl#getUseCaseDefinition <em>Use Case Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UseCaseUsageImpl#getIncludedUseCase <em>Included Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseUsageImpl extends CaseUsageImpl implements UseCaseUsage {
	/**
	 * The cached setting delegate for the '{@link #getUseCaseDefinition() <em>Use Case Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaseDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USE_CASE_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USE_CASE_USAGE__USE_CASE_DEFINITION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getIncludedUseCase() <em>Included Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INCLUDED_USE_CASE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.USE_CASE_USAGE__INCLUDED_USE_CASE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.USE_CASE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCaseDefinition getUseCaseDefinition() {
		return (UseCaseDefinition)USE_CASE_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseDefinition basicGetUseCaseDefinition() {
		return (UseCaseDefinition)USE_CASE_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCaseDefinition(UseCaseDefinition newUseCaseDefinition) {
		USE_CASE_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newUseCaseDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseCaseDefinition() {
		return basicGetUseCaseDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<UseCaseUsage> getIncludedUseCase() {
		return (EList<UseCaseUsage>)INCLUDED_USE_CASE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.USE_CASE_USAGE__USE_CASE_DEFINITION:
				if (resolve) return getUseCaseDefinition();
				return basicGetUseCaseDefinition();
			case SysMLPackage.USE_CASE_USAGE__INCLUDED_USE_CASE:
				return getIncludedUseCase();
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
			case SysMLPackage.USE_CASE_USAGE__USE_CASE_DEFINITION:
				setUseCaseDefinition((UseCaseDefinition)newValue);
				return;
			case SysMLPackage.USE_CASE_USAGE__INCLUDED_USE_CASE:
				getIncludedUseCase().clear();
				getIncludedUseCase().addAll((Collection<? extends UseCaseUsage>)newValue);
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
			case SysMLPackage.USE_CASE_USAGE__USE_CASE_DEFINITION:
				setUseCaseDefinition((UseCaseDefinition)null);
				return;
			case SysMLPackage.USE_CASE_USAGE__INCLUDED_USE_CASE:
				getIncludedUseCase().clear();
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
			case SysMLPackage.USE_CASE_USAGE__CASE_DEFINITION:
				return isSetCaseDefinition();
			case SysMLPackage.USE_CASE_USAGE__USE_CASE_DEFINITION:
				return isSetUseCaseDefinition();
			case SysMLPackage.USE_CASE_USAGE__INCLUDED_USE_CASE:
				return INCLUDED_USE_CASE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseDefinition getCaseDefinition() {
		return getUseCaseDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseDefinition basicGetCaseDefinition() {
		return basicGetUseCaseDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseDefinition(CaseDefinition newCaseDefinition) {
		if (newCaseDefinition != null && !(newCaseDefinition instanceof UseCaseDefinition)) {
			throw new IllegalArgumentException("newCaseDefinition must be an instance of UseCaseDefinition");
		}
		setUseCaseDefinition((UseCaseDefinition) newCaseDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaseDefinition() {
  		return false;
	}

} //UseCaseUsageImpl
