/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addressed Concern Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A FramedConcernMembership is a RequirementConstraintMembership for a framed ConcernUsage of a RequirementDefinition or RequirementUsage. The <code>ownedConstraint</code> of a FramedConcernMembership must be a ConcernUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FramedConcernMembership#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FramedConcernMembership#getReferencedConcern <em>Referenced Concern</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFramedConcernMembership()
 * @model
 * @generated
 */
public interface FramedConcernMembership extends RequirementConstraintMembership {
	/**
	 * Returns the value of the '<em><b>Owned Concern</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getOwnedConstraint() <em>Owned Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConcernUsage that is the <code>ownedConstraint</code> of this AddressedConcernMembership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Concern</em>' reference.
	 * @see #setOwnedConcern(ConcernUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFramedConcernMembership_OwnedConcern()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='framedConstraintMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	ConcernUsage getOwnedConcern();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FramedConcernMembership#getOwnedConcern <em>Owned Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Concern</em>' reference.
	 * @see #getOwnedConcern()
	 * @generated
	 */
	void setOwnedConcern(ConcernUsage value);

	/**
	 * Returns the value of the '<em><b>Referenced Concern</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.RequirementConstraintMembership#getReferencedConstraint() <em>Referenced Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The ConcernUsage that is referenced through this AddressedConcernMembership. This is derived as being the first ConcernUsage subset by the <code>ownedConcern</code>, if there is one, and, otherwise, the <code>ownedConcern</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Concern</em>' reference.
	 * @see #setReferencedConcern(ConcernUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFramedConcernMembership_ReferencedConcern()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencingConcernMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	ConcernUsage getReferencedConcern();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FramedConcernMembership#getReferencedConcern <em>Referenced Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Concern</em>' reference.
	 * @see #getReferencedConcern()
	 * @generated
	 */
	void setReferencedConcern(ConcernUsage value);

} // AddressedConcernMembership
