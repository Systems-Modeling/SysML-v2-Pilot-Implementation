/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PortMembership#getMemberPort <em>Member Port</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortMembership()
 * @model
 * @generated
 */
public interface PortMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Member Port</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getMemberFeature() <em>Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Port</em>' reference.
	 * @see #setMemberPort(PortUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortMembership_MemberPort()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='portMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	PortUsage getMemberPort();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PortMembership#getMemberPort <em>Member Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Port</em>' reference.
	 * @see #getMemberPort()
	 * @generated
	 */
	void setMemberPort(PortUsage value);

} // PortMembership
