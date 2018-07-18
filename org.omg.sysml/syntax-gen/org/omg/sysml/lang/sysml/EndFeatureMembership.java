/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation <em>Owning Association</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEndFeatureMembership()
 * @model
 * @generated
 */
public interface EndFeatureMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Association#getOwnedEndFeatureMembership <em>Owned End Feature Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Association</em>' reference.
	 * @see #setOwningAssociation(Association)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEndFeatureMembership_OwningAssociation()
	 * @see org.omg.sysml.lang.sysml.Association#getOwnedEndFeatureMembership
	 * @model opposite="ownedEndFeatureMembership" ordered="false"
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation <em>Owning Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

} // EndFeatureMembership
