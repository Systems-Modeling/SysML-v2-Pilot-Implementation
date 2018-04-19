/**
 */
package org.omg.sysml.groups;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.ElementGroup#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.groups.ElementGroup#getGroupImport <em>Group Import</em>}</li>
 *   <li>{@link org.omg.sysml.groups.ElementGroup#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link org.omg.sysml.groups.ElementGroup#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.groups.ElementGroup#getGroupMember <em>Group Member</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.groups.GroupsPackage#getElementGroup()
 * @model
 * @generated
 */
public interface ElementGroup extends Element {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see org.omg.sysml.groups.GroupsPackage#getElementGroup_Member()
	 * @model
	 * @generated
	 */
	EList<Element> getMember();

	/**
	 * Returns the value of the '<em><b>Group Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.groups.GroupImport}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.groups.GroupImport#getImportingGroup <em>Importing Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Import</em>' containment reference list.
	 * @see org.omg.sysml.groups.GroupsPackage#getElementGroup_GroupImport()
	 * @see org.omg.sysml.groups.GroupImport#getImportingGroup
	 * @model opposite="importingGroup" containment="true"
	 * @generated
	 */
	EList<GroupImport> getGroupImport();

	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see org.omg.sysml.groups.GroupsPackage#getElementGroup_ImportedMember()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Element> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.core.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see org.omg.sysml.groups.GroupsPackage#getElementGroup_OwnedMember()
	 * @model
	 * @generated
	 */
	EList<Element> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Group Member</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.groups.GroupMembership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.groups.GroupMembership#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Member</em>' containment reference list.
	 * @see org.omg.sysml.groups.GroupsPackage#getElementGroup_GroupMember()
	 * @see org.omg.sysml.groups.GroupMembership#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<GroupMembership> getGroupMember();

} // ElementGroup
