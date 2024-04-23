/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Subsetting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.CrossSubsetting#getCrossedFeature <em>Crossed Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.CrossSubsetting#getCrossingFeature <em>Crossing Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCrossSubsetting()
 * @model
 * @generated
 */
public interface CrossSubsetting extends Subsetting {
	/**
	 * Returns the value of the '<em><b>Crossed Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature() <em>Subsetted Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crossed Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossed Feature</em>' reference.
	 * @see #setCrossedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCrossSubsetting_CrossedFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='crossSupersetting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getCrossedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CrossSubsetting#getCrossedFeature <em>Crossed Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossed Feature</em>' reference.
	 * @see #getCrossedFeature()
	 * @generated
	 */
	void setCrossedFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Crossing Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedCrossSubsetting <em>Owned Cross Subsetting</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature() <em>Owning Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crossing Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crossing Feature</em>' reference.
	 * @see #setCrossingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCrossSubsetting_CrossingFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedCrossSubsetting
	 * @model opposite="ownedCrossSubsetting" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getCrossingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CrossSubsetting#getCrossingFeature <em>Crossing Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crossing Feature</em>' reference.
	 * @see #getCrossingFeature()
	 * @generated
	 */
	void setCrossingFeature(Feature value);

} // CrossSubsetting
