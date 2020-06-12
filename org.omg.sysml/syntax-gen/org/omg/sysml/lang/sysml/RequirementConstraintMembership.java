/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Constraint Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A RequirementConstraintMembership is a FeatureMembership for an assumed or required ConstraintUsage of a RequirementDefinition or RequirementUsage. The <code>ownedMemberFeature</cpde> of a RequirementConstraintMembership must be a ConstraintUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getConstraint_comp <em>Constraint comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintMembership()
 * @model
 * @generated
 */
public interface RequirementConstraintMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.RequirementConstraintKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the RequirementConstraintMembership is for an assumed or required ConstraintUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.RequirementConstraintKind
	 * @see #setKind(RequirementConstraintKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintMembership_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RequirementConstraintKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.RequirementConstraintKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(RequirementConstraintKind value);

	/**
	 * Returns the value of the '<em><b>Constraint comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp() <em>Owned Member Feature comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConstraintUsage that is the <tt>ownedMemberFeature</tt> of this RequirementConstraintUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint comp</em>' containment reference.
	 * @see #setConstraint_comp(ConstraintUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintMembership_Constraint_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementConstraintMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	ConstraintUsage getConstraint_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getConstraint_comp <em>Constraint comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint comp</em>' containment reference.
	 * @see #getConstraint_comp()
	 * @generated
	 */
	void setConstraint_comp(ConstraintUsage value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(ConstraintUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintMembership_Constraint()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	ConstraintUsage getConstraint();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ConstraintUsage value);

} // RequirementConstraintMembership
