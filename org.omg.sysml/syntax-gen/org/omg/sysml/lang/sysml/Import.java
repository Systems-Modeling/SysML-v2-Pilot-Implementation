/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Import</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.Import#getImportedPackage <em>Imported
 * Package</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.Import#getSelecter
 * <em>Selecter</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.Import#getVisibility
 * <em>Visibility</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.Import#getImportOwningPackage <em>Import
 * Owning Package</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends Relationship {
	/**
	 * Returns the value of the '<em><b>Imported Package</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 * <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget()
	 * <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Imported Package</em>' reference.
	 * @see #setImportedPackage(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_ImportedPackage()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
	 *        body='import'" annotation="subsets"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getImportedPackage();

	/**
	 * Sets the value of the
	 * '{@link org.omg.sysml.lang.sysml.Import#getImportedPackage <em>Imported
	 * Package</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Imported Package</em>' reference.
	 * @see #getImportedPackage()
	 * @generated
	 */
	void setImportedPackage(org.omg.sysml.lang.sysml.Package value);

	/**
	 * Returns the value of the '<em><b>Selecter</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 * <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement()
	 * <em>Owned Related Element</em>}'</li>
	 * <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget()
	 * <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selecter</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Selecter</em>' reference.
	 * @see #setSelecter(Predicate)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_Selecter()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
	 *        body='import'" annotation="subsets"
	 * @generated
	 */
	Predicate getSelecter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getSelecter
	 * <em>Selecter</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Selecter</em>' reference.
	 * @see #getSelecter()
	 * @generated
	 */
	void setSelecter(Predicate value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute. The default
	 * value is <code>"public"</code>. The literals are from the enumeration
	 * {@link org.omg.sysml.lang.sysml.VisibilityKind}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getVisibility
	 * <em>Visibility</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Import Owning Package</b></em>' reference.
	 * It is bidirectional and its opposite is
	 * '{@link org.omg.sysml.lang.sysml.Package#getOwnedImport_comp <em>Owned Import
	 * comp</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 * <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement()
	 * <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 * <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource()
	 * <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Owning Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Import Owning Package</em>' reference.
	 * @see #setImportOwningPackage(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_ImportOwningPackage()
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedImport_comp
	 * @model opposite="ownedImport_comp" required="true" ordered="false"
	 *        annotation="redefines" annotation="subsets"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getImportOwningPackage();

	/**
	 * Sets the value of the
	 * '{@link org.omg.sysml.lang.sysml.Import#getImportOwningPackage <em>Import
	 * Owning Package</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Import Owning Package</em>' reference.
	 * @see #getImportOwningPackage()
	 * @generated
	 */
	void setImportOwningPackage(org.omg.sysml.lang.sysml.Package value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	EList<Membership> importedMembership();

} // Import
