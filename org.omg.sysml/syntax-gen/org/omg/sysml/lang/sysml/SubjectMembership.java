/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A SubjectMembership is a ParameterMembership that indicates that its <code>ownedSubjectParameter</code> is the subject Parameter for its <code>owningType</code>. The <code>owningType</code> of a SubjectMembership must be a CaseDefinition, CaseUsage, RequirementDefinition or RequirementUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SubjectMembership#getOwnedSubjectParameter_comp <em>Owned Subject Parameter comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.SubjectMembership#getOwnedSubjectParameter <em>Owned Subject Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubjectMembership()
 * @model
 * @generated
 */
public interface SubjectMembership extends ParameterMembership {
	/**
	 * Returns the value of the '<em><b>Owned Subject Parameter comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter_comp() <em>Owned Member Parameter comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Parameter that is the <code>ownedMemberParameter</code> of this SubjectMembership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subject Parameter comp</em>' containment reference.
	 * @see #setOwnedSubjectParameter_comp(Parameter)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubjectMembership_OwnedSubjectParameter_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningSubjectMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Parameter getOwnedSubjectParameter_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SubjectMembership#getOwnedSubjectParameter_comp <em>Owned Subject Parameter comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Subject Parameter comp</em>' containment reference.
	 * @see #getOwnedSubjectParameter_comp()
	 * @generated
	 */
	void setOwnedSubjectParameter_comp(Parameter value);

	/**
	 * Returns the value of the '<em><b>Owned Subject Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subject Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Subject Parameter</em>' reference.
	 * @see #setOwnedSubjectParameter(Parameter)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubjectMembership_OwnedSubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Parameter getOwnedSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SubjectMembership#getOwnedSubjectParameter <em>Owned Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Subject Parameter</em>' reference.
	 * @see #getOwnedSubjectParameter()
	 * @generated
	 */
	void setOwnedSubjectParameter(Parameter value);

} // SubjectMembership
