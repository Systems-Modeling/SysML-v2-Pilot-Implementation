/**
 */
package org.omg.sysml.groups;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.core.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.groups.NamespaceImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.groups.NamespaceImport#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.groups.NamespaceImport#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.groups.GroupsPackage#getNamespaceImport()
 * @model
 * @generated
 */
public interface NamespaceImport extends GroupImport {
	/**
	 * Returns the value of the '<em><b>Importing Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.groups.Namespace#getNamespaceImport <em>Namespace Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importing Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importing Namespace</em>' reference.
	 * @see #setImportingNamespace(Namespace)
	 * @see org.omg.sysml.groups.GroupsPackage#getNamespaceImport_ImportingNamespace()
	 * @see org.omg.sysml.groups.Namespace#getNamespaceImport
	 * @model opposite="namespaceImport" required="true" ordered="false"
	 * @generated
	 */
	Namespace getImportingNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.NamespaceImport#getImportingNamespace <em>Importing Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importing Namespace</em>' reference.
	 * @see #getImportingNamespace()
	 * @generated
	 */
	void setImportingNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' reference.
	 * @see #setImportedNamespace(Namespace)
	 * @see org.omg.sysml.groups.GroupsPackage#getNamespaceImport_ImportedNamespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Namespace getImportedNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.NamespaceImport#getImportedNamespace <em>Imported Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' reference.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.groups.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.groups.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.omg.sysml.groups.GroupsPackage#getNamespaceImport_Visibility()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.omg.sysml.groups.NamespaceImport#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.groups.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Element> importedMembers();

} // NamespaceImport
