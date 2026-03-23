/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Verification Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>RequirementVerificationMembership</code> is a <code>RequirementConstraintMembership </code> used in the objective of a <code>VerificationCase</code> to identify a <code>RequirementUsage</code> that is verified by the <code>VerificationCase</code>.</p>
 * kind = RequirementConstraintKind::requirement
 * owningType.oclIsKindOf(RequirementUsage) and
 * owningType.owningFeatureMembership <> null and
 * owningType.owningFeatureMembership.oclIsKindOf(ObjectiveMembership)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementVerificationMembership#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementVerificationMembership#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementVerificationMembership()
 * @model
 * @generated
 */
public interface RequirementVerificationMembership extends RequirementConstraintMembership {
	/**
	 * Returns the value of the '<em><b>Owned Requirement</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getOwnedConstraint() <em>Owned Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned <code>RequirementUsage</code> that acts as the <code>ownedConstraint</code> for this <code>RequirementVerificationMembership</code>. This will either be the <code>verifiedRequirement</code>, or it will subset the <code>verifiedRequirement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Requirement</em>' reference.
	 * @see #setOwnedRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementVerificationMembership_OwnedRequirement()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementVerificationMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
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

	/**
	 * Returns the value of the '<em><b>Verified Requirement</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getReferencedConstraint() <em>Referenced Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The <code>RequirementUsage</code> that is identified as being verified. It is the <code>referencedConstraint</code> of the <code>RequirementVerificationMembership</code> considered as a <code>RequirementConstraintMembership</code>, which must be a <code>RequirementUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified Requirement</em>' reference.
	 * @see #setVerifiedRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementVerificationMembership_VerifiedRequirement()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementVerification'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
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

} // RequirementVerificationMembership
