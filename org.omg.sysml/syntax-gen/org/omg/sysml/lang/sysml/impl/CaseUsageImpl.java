/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CaseUsageImpl#getObjectiveRequirement <em>Objective Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CaseUsageImpl#getSubjectParameter <em>Subject Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CaseUsageImpl#getCaseDefinition <em>Case Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseUsageImpl extends CalculationUsageImpl implements CaseUsage {

	public static final String CASE_SUBSETTING_BASE_DEFAULT = "Cases::cases";
	public static final String CASE_SUBSETTING_SUBCASE_DEFAULT = "Cases::Case::subcases";
	
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
		return (RequirementUsage)getFeatureMembership().stream().
				filter(ObjectiveMembership.class::isInstance).
				map(FeatureMembership::getOwnedMemberFeature).
				findFirst().orElse(null);
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
	public Parameter getSubjectParameter() {
		Parameter subjectParameter = basicGetSubjectParameter();
		return subjectParameter != null && subjectParameter.eIsProxy() ? (Parameter)eResolveProxy((InternalEObject)subjectParameter) : subjectParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Parameter basicGetSubjectParameter() {
		return (Parameter)getFeatureMembership().stream().
				filter(SubjectMembership.class::isInstance).
				map(FeatureMembership::getOwnedMemberFeature).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSubjectParameter(Parameter newSubjectParameter) {
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

	@Override
	protected String getDefaultSupertype() {
		return isSubperformance()? 
					CASE_SUBSETTING_SUBCASE_DEFAULT:
					CASE_SUBSETTING_BASE_DEFAULT;
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
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				if (resolve) return getSubjectParameter();
				return basicGetSubjectParameter();
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				if (resolve) return getCaseDefinition();
				return basicGetCaseDefinition();
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
			case SysMLPackage.CASE_USAGE__OBJECTIVE_REQUIREMENT:
				setObjectiveRequirement((RequirementUsage)newValue);
				return;
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				setSubjectParameter((Parameter)newValue);
				return;
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				setCaseDefinition((CaseDefinition)newValue);
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
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				setSubjectParameter((Parameter)null);
				return;
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				setCaseDefinition((CaseDefinition)null);
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
			case SysMLPackage.CASE_USAGE__SUBJECT_PARAMETER:
				return basicGetSubjectParameter() != null;
			case SysMLPackage.CASE_USAGE__CASE_DEFINITION:
				return isSetCaseDefinition();
		}
		return super.eIsSet(featureID);
	}

} //CaseUsageImpl
