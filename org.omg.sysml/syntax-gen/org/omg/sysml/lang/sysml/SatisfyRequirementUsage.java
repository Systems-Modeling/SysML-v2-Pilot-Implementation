/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfy Requirement Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A SatisfyRequirementUsage is an AssertConstraintUsage that asserts that a satisfied RequirementUsage is true for a specific satisfyingSubject. The satisfied RequirementUsage is related to the SatisfyRequirementUsage by a Subsetting relationship.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage#getSatisfiedRequirement <em>Satisfied Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage#getSatisfyingFeature <em>Satisfying Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSatisfyRequirementUsage()
 * @model
 * @generated
 */
public interface SatisfyRequirementUsage extends RequirementUsage, AssertConstraintUsage {
	/**
	 * Returns the value of the '<em><b>Satisfied Requirement</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.AssertConstraintUsage#getAssertedConstraint() <em>Asserted Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RequirementUsage that is satisfied by the satisfyingSubject of this SatisfyRequirementUsage. It is the subsetted element of the first owned Subsetting relationship of the SatisfyRequirementUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied Requirement</em>' reference.
	 * @see #setSatisfiedRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSatisfyRequirementUsage_SatisfiedRequirement()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementSatisfaction'"
	 *        annotation="redefines"
	 * @generated
	 */
	RequirementUsage getSatisfiedRequirement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage#getSatisfiedRequirement <em>Satisfied Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied Requirement</em>' reference.
	 * @see #getSatisfiedRequirement()
	 * @generated
	 */
	void setSatisfiedRequirement(RequirementUsage value);

	/**
	 * Returns the value of the '<em><b>Satisfying Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfying Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfying Feature</em>' reference.
	 * @see #setSatisfyingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSatisfyRequirementUsage_SatisfyingFeature()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='satisfiedRequirement'"
	 * @generated
	 */
	Feature getSatisfyingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage#getSatisfyingFeature <em>Satisfying Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfying Feature</em>' reference.
	 * @see #getSatisfyingFeature()
	 * @generated
	 */
	void setSatisfyingFeature(Feature value);

} // SatisfyRequirementUsage
