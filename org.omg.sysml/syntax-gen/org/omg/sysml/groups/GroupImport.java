/**
 */
package org.omg.sysml.groups;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.behaviors.Predicate;

import org.omg.sysml.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.GroupImport#getImportedGroup <em>Imported Group</em>}</li>
 *   <li>{@link org.omg.sysml.groups.GroupImport#getImportingGroup <em>Importing Group</em>}</li>
 *   <li>{@link org.omg.sysml.groups.GroupImport#getSelecter <em>Selecter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.groups.GroupsPackage#getGroupImport()
 * @model
 * @generated
 */
public interface GroupImport extends Element {
	/**
	 * Returns the value of the '<em><b>Imported Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Group</em>' reference.
	 * @see #setImportedGroup(ElementGroup)
	 * @see org.omg.sysml.groups.GroupsPackage#getGroupImport_ImportedGroup()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ElementGroup getImportedGroup();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.GroupImport#getImportedGroup <em>Imported Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Group</em>' reference.
	 * @see #getImportedGroup()
	 * @generated
	 */
	void setImportedGroup(ElementGroup value);

	/**
	 * Returns the value of the '<em><b>Importing Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.groups.ElementGroup#getGroupImport <em>Group Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Group</em>' container reference.
	 * @see #setImportingGroup(ElementGroup)
	 * @see org.omg.sysml.groups.GroupsPackage#getGroupImport_ImportingGroup()
	 * @see org.omg.sysml.groups.ElementGroup#getGroupImport
	 * @model opposite="groupImport" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ElementGroup getImportingGroup();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.GroupImport#getImportingGroup <em>Importing Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Group</em>' container reference.
	 * @see #getImportingGroup()
	 * @generated
	 */
	void setImportingGroup(ElementGroup value);

	/**
	 * Returns the value of the '<em><b>Selecter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selecter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selecter</em>' reference.
	 * @see #setSelecter(Predicate)
	 * @see org.omg.sysml.groups.GroupsPackage#getGroupImport_Selecter()
	 * @model ordered="false"
	 * @generated
	 */
	Predicate getSelecter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.GroupImport#getSelecter <em>Selecter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selecter</em>' reference.
	 * @see #getSelecter()
	 * @generated
	 */
	void setSelecter(Predicate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Element> importedMembers();

} // GroupImport
