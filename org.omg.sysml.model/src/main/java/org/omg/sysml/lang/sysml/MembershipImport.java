/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membership Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>MembershipImport</code> is an <code>Import</code> that imports its <code>importedMembership</code> into the <code>importOwningNamespace</code>. If <code>isRecursive = true</code> and the <code>memberElement</code> of the <code>importedMembership</code> is a <code>Namespace</code>, then the equivalent of a recursive <code>NamespaceImport</code> is also performed on that <code>Namespace</code>.</p>
 * 
 * importedElement = importedMembership.memberElement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MembershipImport#getImportedMembership <em>Imported Membership</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembershipImport()
 * @model
 * @generated
 */
public interface MembershipImport extends Import {
	/**
	 * Returns the value of the '<em><b>Imported Membership</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Membership</code> to be imported.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Membership</em>' reference.
	 * @see #setImportedMembership(Membership)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembershipImport_ImportedMembership()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='import'"
	 *        annotation="redefines"
	 * @generated
	 */
	Membership getImportedMembership();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MembershipImport#getImportedMembership <em>Imported Membership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Membership</em>' reference.
	 * @see #getImportedMembership()
	 * @generated
	 */
	void setImportedMembership(Membership value);

} // MembershipImport
