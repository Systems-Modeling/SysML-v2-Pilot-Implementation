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
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CaseUsageImpl#getObjectiveRequirement <em>Objective Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CaseUsageImpl#getCaseDefinition <em>Case Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CaseUsageImpl#getSubjectParameter <em>Subject Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CaseUsageImpl#getActorParameter <em>Actor Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseUsageImpl extends CalculationUsageImpl implements CaseUsage {

	/**
	 * The cached setting delegate for the '{@link #getObjectiveRequirement() <em>Objective Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveRequirement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OBJECTIVE_REQUIREMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CASE_USAGE__OBJECTIVE_REQUIREMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCaseDefinition() <em>Case Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CASE_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CASE_USAGE__CASE_DEFINITION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSubjectParameter() <em>Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SUBJECT_PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CASE_USAGE__SUBJECT_PARAMETER).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getActorParameter() <em>Actor Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ACTOR_PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CASE_USAGE__ACTOR_PARAMETER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CASE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getObjectiveRequirement() {
		return (RequirementUsage)OBJECTIVE_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementUsage basicGetObjectiveRequirement() {
		return (RequirementUsage)OBJECTIVE_REQUIREMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setObjectiveRequirement(RequirementUsage newObjectiveRequirement) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getSubjectParameter() {
		return (Usage)SUBJECT_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage basicGetSubjectParameter() {
		return (Usage)SUBJECT_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectParameter(Usage newSubjectParameter) {
		SUBJECT_PARAMETER__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSubjectParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getActorParameter() {
		return (EList<PartUsage>)ACTOR_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseDefinition getCaseDefinition() {
		return (CaseDefinition)CASE_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseDefinition basicGetCaseDefinition() {
		return (CaseDefinition)CASE_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseDefinition(CaseDefinition newCaseDefinition) {
		CASE_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newCaseDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaseDefinition() {
		return basicGetCaseDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getCalculationDefinition() {
		return getCaseDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function basicGetCalculationDefinition() {
		return basicGetCaseDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationDefinition(Function newCalculationDefinition) {
		if (newCalculationDefinition != null && !(newCalculationDefinition instanceof CaseDefinition)) {
			throw new IllegalArgumentException("newCalculationDefinition must be an instance of CaseDefinition");
		}
		setCaseDefinition((CaseDefinition) newCalculationDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCalculationDefinition() {
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
			case SysMLPackage.CASE_USAGE__OBJECTIVE_REQUIREMENT:
				if (resolve) return getObjectiveRequirement();
				return basicGetObjectiveRequirement();
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				if (resolve) return getCaseDefinition();
				return basicGetCaseDefinition();
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				if (resolve) return getSubjectParameter();
				return basicGetSubjectParameter();
			case SysMLPackage.CASE_USAGE__ACTOR_PARAMETER:
				return getActorParameter();
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
			case SysMLPackage.CASE_USAGE__OBJECTIVE_REQUIREMENT:
				setObjectiveRequirement((RequirementUsage)newValue);
				return;
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				setCaseDefinition((CaseDefinition)newValue);
				return;
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				setSubjectParameter((Usage)newValue);
				return;
			case SysMLPackage.CASE_USAGE__ACTOR_PARAMETER:
				getActorParameter().clear();
				getActorParameter().addAll((Collection<? extends PartUsage>)newValue);
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
			case SysMLPackage.CASE_USAGE__OBJECTIVE_REQUIREMENT:
				setObjectiveRequirement((RequirementUsage)null);
				return;
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				setCaseDefinition((CaseDefinition)null);
				return;
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				setSubjectParameter((Usage)null);
				return;
			case SysMLPackage.CASE_USAGE__ACTOR_PARAMETER:
				getActorParameter().clear();
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
			case SysMLPackage.CASE_USAGE__CALCULATION_DEFINITION:
				return isSetCalculationDefinition();
			case SysMLPackage.CASE_USAGE__OBJECTIVE_REQUIREMENT:
				return OBJECTIVE_REQUIREMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				return isSetCaseDefinition();
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				return SUBJECT_PARAMETER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CASE_USAGE__ACTOR_PARAMETER:
				return ACTOR_PARAMETER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //CaseUsageImpl
