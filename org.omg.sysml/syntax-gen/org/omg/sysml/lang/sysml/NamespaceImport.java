/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A NamespaceImport is an Import that imports Memberships from its <code>importedNamespace</code> into the <code>importOwningNamespace</code>. If <code> isRecursive = false</code>, then only the visible Memberships of the <code>importOwningNamespace</code> are imported. If <code> isRecursive = true</code>, then, in addition, Memberships are recursively imported from any <code>ownedMembers</code> of the <code>importedNamespace</code> that are Namespaces.</p>
 * importedElement = importedNamespace
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.NamespaceImport#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespaceImport()
 * @model
 * @generated
 */
public interface NamespaceImport extends Import {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Namespace whose visible Memberships are imported by this NamespaceImport.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' reference.
	 * @see #setImportedNamespace(Namespace)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespaceImport_ImportedNamespace()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='import'"
	 *        annotation="redefines"
	 * @generated
	 */
	Namespace getImportedNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.NamespaceImport#getImportedNamespace <em>Imported Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' reference.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(Namespace value);

} // NamespaceImport
