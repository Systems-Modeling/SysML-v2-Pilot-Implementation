/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Verification Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A RequirementVerificationMembership is a RequirementConstraintMembership used in the objective of a VerificationCase to identify a Requirement that is verified by the VerificationCase.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementVerificationMembership#getOwnedRequirement_comp <em>Owned Requirement comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementVerificationMembership#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementVerificationMembership#getOwnedRequirement <em>Owned Requirement</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementVerificationMembership()
 * @model
 * @generated
 */
public interface RequirementVerificationMembership extends RequirementConstraintMembership {
	/**
	 * Returns the value of the '<em><b>Owned Requirement comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getConstraint_comp() <em>Constraint comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned Requirement that acts as the <code>constraint</code> for this RequirementVerificationMembership. This will either be the <code>verifiedRequirement</code>, or it will subset the <code>verifiedRequirement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Requirement comp</em>' containment reference.
	 * @see #setOwnedRequirement_comp(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementVerificationMembership_OwnedRequirement_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementVerificationMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	RequirementUsage getOwnedRequirement_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementVerificationMembership#getOwnedRequirement_comp <em>Owned Requirement comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Requirement comp</em>' containment reference.
	 * @see #getOwnedRequirement_comp()
	 * @generated
	 */
	void setOwnedRequirement_comp(RequirementUsage value);

	/**
	 * Returns the value of the '<em><b>Verified Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The RequirementUsage that is identified as being verified. This is derived as being the first RequirementUsage subset by the <code>owningRequirement</code>, if there is one, and, otherwise, the <code>owningRequirement</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified Requirement</em>' reference.
	 * @see #setVerifiedRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementVerificationMembership_VerifiedRequirement()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementVerification'"
	 * @generated
	 */
	RequirementUsage getVerifiedRequirement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementVerificationMembership#getVerifiedRequirement <em>Verified Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified Requirement</em>' reference.
	 * @see #getVerifiedRequirement()
	 * @generated
	 */
	void setVerifiedRequirement(RequirementUsage value);

	/**
	 * Returns the value of the '<em><b>Owned Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirement</em>' reference.
	 * @see #setOwnedRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementVerificationMembership_OwnedRequirement()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	RequirementUsage getOwnedRequirement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementVerificationMembership#getOwnedRequirement <em>Owned Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Requirement</em>' reference.
	 * @see #getOwnedRequirement()
	 * @generated
	 */
	void setOwnedRequirement(RequirementUsage value);

} // RequirementVerificationMembership
