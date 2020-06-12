/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A CaseDefinition is a CalculationDefinition for a process, often involving collecting evidence or data, relative to a subject, producing a result that meets an objective.</p>
 * 
 * <p>A CaseDefinition must subclass, directly or indirectly, the base CaseDefinition Case from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.CaseDefinition#getObjectiveRequirement <em>Objective Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.CaseDefinition#getSubjectParameter <em>Subject Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseDefinition()
 * @model
 * @generated
 */
public interface CaseDefinition extends CalculationDefinition {
	/**
	 * Returns the value of the '<em><b>Subject Parameter</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getParameter() <em>Parameter</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <p>parameter</p> of this CaseDefinition that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> Parameter of the base CaseDefinition Case from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Parameter</em>' reference.
	 * @see #setSubjectParameter(Parameter)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseDefinition_SubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subjectOwningCaseDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	Parameter getSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CaseDefinition#getSubjectParameter <em>Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Parameter</em>' reference.
	 * @see #getSubjectParameter()
	 * @generated
	 */
	void setSubjectParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Objective Requirement</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <p>ownedFeature</p> of this CaseDefinition that is owned via an ObjectiveMembership, and that must redefine, directly or indirectly, the <code>objective</code> RequirementUsage of the base CaseDefinition Case from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective Requirement</em>' reference.
	 * @see #setObjectiveRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseDefinition_ObjectiveRequirement()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectiveOwningCaseDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	RequirementUsage getObjectiveRequirement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CaseDefinition#getObjectiveRequirement <em>Objective Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Requirement</em>' reference.
	 * @see #getObjectiveRequirement()
	 * @generated
	 */
	void setObjectiveRequirement(RequirementUsage value);

} // CaseDefinition
