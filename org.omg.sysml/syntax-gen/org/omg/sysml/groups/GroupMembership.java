/**
 */
package org.omg.sysml.groups;

import org.omg.sysml.core.Element;
import org.omg.sysml.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.GroupMembership#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.sysml.groups.GroupMembership#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.groups.GroupMembership#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.groups.GroupsPackage#getGroupMembership()
 * @model
 * @generated
 */
public interface GroupMembership extends Relationship {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.groups.ElementGroup#getGroupMember <em>Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(ElementGroup)
	 * @see org.omg.sysml.groups.GroupsPackage#getGroupMembership_Group()
	 * @see org.omg.sysml.groups.ElementGroup#getGroupMember
	 * @model opposite="groupMember" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ElementGroup getGroup();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.GroupMembership#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ElementGroup value);

	/**
	 * Returns the value of the '<em><b>Member Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Element</em>' reference.
	 * @see #setMemberElement(Element)
	 * @see org.omg.sysml.groups.GroupsPackage#getGroupMembership_MemberElement()
	 * @model ordered="false"
	 * @generated
	 */
	Element getMemberElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.GroupMembership#getMemberElement <em>Member Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Element</em>' reference.
	 * @see #getMemberElement()
	 * @generated
	 */
	void setMemberElement(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Member Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member Element</em>' containment reference.
	 * @see #setOwnedMemberElement(Element)
	 * @see org.omg.sysml.groups.GroupsPackage#getGroupMembership_OwnedMemberElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Element getOwnedMemberElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.GroupMembership#getOwnedMemberElement <em>Owned Member Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Element</em>' containment reference.
	 * @see #getOwnedMemberElement()
	 * @generated
	 */
	void setOwnedMemberElement(Element value);

} // GroupMembership
