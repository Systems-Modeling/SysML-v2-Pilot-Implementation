/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Parameter Membership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ParameterMembership is a FeatureMembership that identifies its <code>memberFeature</code> as a parameter, which is always owned. The default <code>direction</code> for a ParameterMembership is <code>in</code>  (unless it is a ReturnParameterMembership). A ParameterMembership must be owned by a Behavior or a Step.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter_comp <em>Owned Member Parameter comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ParameterMembership#getMemberParameter <em>Member Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter <em>Owned Member Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getParameterMembership()
 * @model
 * @generated
 */
public interface ParameterMembership extends FeatureMembership {

	/**
	 * Returns the value of the '<em><b>Member Parameter</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature() <em>Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Parameter</em>' reference.
	 * @see #setMemberParameter(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getParameterMembership_MemberParameter()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parameterMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getMemberParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ParameterMembership#getMemberParameter <em>Member Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Parameter</em>' reference.
	 * @see #getMemberParameter()
	 * @generated
	 */
	void setMemberParameter(Feature value);

	/**
	 * Returns the value of the '<em><b>Owned Member Parameter comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp() <em>Owned Member Feature comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Parameter comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member Parameter comp</em>' containment reference.
	 * @see #setOwnedMemberParameter_comp(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getParameterMembership_OwnedMemberParameter_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningParameterMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getOwnedMemberParameter_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter_comp <em>Owned Member Parameter comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Parameter comp</em>' containment reference.
	 * @see #getOwnedMemberParameter_comp()
	 * @generated
	 */
	void setOwnedMemberParameter_comp(Feature value);

	/**
	 * Returns the value of the '<em><b>Owned Member Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Parameter</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member Parameter</em>' reference.
	 * @see #setOwnedMemberParameter(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getParameterMembership_OwnedMemberParameter()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Feature getOwnedMemberParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter <em>Owned Member Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Parameter</em>' reference.
	 * @see #getOwnedMemberParameter()
	 * @generated
	 */
	void setOwnedMemberParameter(Feature value);
} // ParameterMembership
