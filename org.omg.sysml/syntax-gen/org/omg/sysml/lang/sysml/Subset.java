/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Subset#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Subset#getSubsettingFeature <em>Subsetting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Subset#getOwningFeature <em>Owning Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubset()
 * @model
 * @generated
 */
public interface Subset extends Relationship {
	/**
	 * Returns the value of the '<em><b>Subsetted Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetted Feature</em>' reference.
	 * @see #setSubsettedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubset_SubsettedFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getSubsettedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subset#getSubsettedFeature <em>Subsetted Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsetted Feature</em>' reference.
	 * @see #getSubsettedFeature()
	 * @generated
	 */
	void setSubsettedFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Subsetting Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetting Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsetting Feature</em>' reference.
	 * @see #setSubsettingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubset_SubsettingFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getSubsettingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subset#getSubsettingFeature <em>Subsetting Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsetting Feature</em>' reference.
	 * @see #getSubsettingFeature()
	 * @generated
	 */
	void setSubsettingFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owning Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubset <em>Owned Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Feature</em>' reference.
	 * @see #setOwningFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubset_OwningFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedSubset
	 * @model opposite="ownedSubset" derived="true" ordered="false"
	 * @generated
	 */
	Feature getOwningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subset#getOwningFeature <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature</em>' reference.
	 * @see #getOwningFeature()
	 * @generated
	 */
	void setOwningFeature(Feature value);

} // Subset
