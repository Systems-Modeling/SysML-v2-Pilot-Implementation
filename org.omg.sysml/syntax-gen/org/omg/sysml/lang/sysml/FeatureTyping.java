/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Typing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureTyping#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature <em>Typed Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping()
 * @model
 * @generated
 */
public interface FeatureTyping extends Generalization {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getGeneral() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Category)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping_Type()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typingByCategory'"
	 * @generated
	 */
	Category getType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureTyping#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Category value);

	/**
	 * Returns the value of the '<em><b>Typed Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getTyping <em>Typing</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getSpecific() <em>Specific</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Feature</em>' reference.
	 * @see #setTypedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping_TypedFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getTyping
	 * @model opposite="typing" required="true" ordered="false"
	 * @generated
	 */
	Feature getTypedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature <em>Typed Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Feature</em>' reference.
	 * @see #getTypedFeature()
	 * @generated
	 */
	void setTypedFeature(Feature value);

} // FeatureTyping
