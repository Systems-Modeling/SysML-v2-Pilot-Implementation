/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>LibraryPackage</code> is a <code>Package</code> that is the container for a model library. A <code>LibraryPackage</code> is itself a library <code>Element</code> as are all <code>Elements</code> that are directly or indirectly contained in it.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.LibraryPackage#isStandard <em>Is Standard</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLibraryPackage()
 * @model
 * @generated
 */
public interface LibraryPackage extends org.omg.sysml.lang.sysml.Package {
	/**
	 * Returns the value of the '<em><b>Is Standard</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>LibraryPackage</code> contains a standard library model. This should only be set to true for <code>LibraryPackages</code> in the standard Kernel Model Libraries or in normative model libraries for a language built on KerML.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Standard</em>' attribute.
	 * @see #setIsStandard(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLibraryPackage_IsStandard()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStandard();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.LibraryPackage#isStandard <em>Is Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Standard</em>' attribute.
	 * @see #isStandard()
	 * @generated
	 */
	void setIsStandard(boolean value);

} // LibraryPackage
