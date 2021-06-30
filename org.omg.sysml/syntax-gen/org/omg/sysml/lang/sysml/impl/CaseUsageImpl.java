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
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.TypeUtil;

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
		RequirementUsage objectiveRequirement = basicGetObjectiveRequirement();
		return objectiveRequirement != null && objectiveRequirement.eIsProxy() ? (RequirementUsage)eResolveProxy((InternalEObject)objectiveRequirement) : objectiveRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RequirementUsage basicGetObjectiveRequirement() {
		return (RequirementUsage)TypeUtil.getOwnedFeatureByMembershipIn(this, ObjectiveMembership.class);
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
		Usage subjectParameter = basicGetSubjectParameter();
		return subjectParameter != null && subjectParameter.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)subjectParameter) : subjectParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetSubjectParameter() {
		return TypeUtil.basicGetSubjectParameterOf(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSubjectParameter(Usage newSubjectParameter) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartUsage> getActorParameter() {
		// TODO: implement this method to return the 'Actor Parameter' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseDefinition getCaseDefinition() {
		CaseDefinition caseDefinition = basicGetCaseDefinition();
		return caseDefinition != null && caseDefinition.eIsProxy() ? (CaseDefinition)eResolveProxy((InternalEObject)caseDefinition) : caseDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CaseDefinition basicGetCaseDefinition() {
		Function calculationDefinition = super.basicGetCalculationDefinition();
		return calculationDefinition instanceof CaseDefinition? (CaseDefinition)calculationDefinition: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setCaseDefinition(CaseDefinition newCaseDefinition) {
		throw new UnsupportedOperationException();
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
				return basicGetObjectiveRequirement() != null;
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				return isSetCaseDefinition();
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				return basicGetSubjectParameter() != null;
			case SysMLPackage.CASE_USAGE__ACTOR_PARAMETER:
				return !getActorParameter().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseUsageImpl
