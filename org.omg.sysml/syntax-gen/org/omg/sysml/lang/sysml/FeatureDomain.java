/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureDomain#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureDomain#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureDomain#getEndOfAssociation <em>End Of Association</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureDomain()
 * @model
 * @generated
 */
public interface FeatureDomain extends Relationship {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureDomain_Feature()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureDomain#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(org.omg.sysml.lang.sysml.Class)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureDomain_Domain()
	 * @model ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Class getDomain();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureDomain#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(org.omg.sysml.lang.sysml.Class value);

	/**
	 * Returns the value of the '<em><b>End Of Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Association#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Of Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of Association</em>' reference.
	 * @see #setEndOfAssociation(Association)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureDomain_EndOfAssociation()
	 * @see org.omg.sysml.lang.sysml.Association#getEnd
	 * @model opposite="end" derived="true" ordered="false"
	 * @generated
	 */
	Association getEndOfAssociation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureDomain#getEndOfAssociation <em>End Of Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Association</em>' reference.
	 * @see #getEndOfAssociation()
	 * @generated
	 */
	void setEndOfAssociation(Association value);

} // FeatureDomain
