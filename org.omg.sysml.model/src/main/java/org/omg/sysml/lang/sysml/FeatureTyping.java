/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Typing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>FeatureTyping</code> is <code>Specialization</code> in which the <code>specific</code> <code>Type</code> is a <code>Feature</code>. This means the set of instances of the (specific) <code>typedFeature</code> is a subset of the set of instances of the (general) <code>type</code>. In the simplest case, the <code>type</code> is a <code>Classifier</code>, whereupon the <code>typedFeature</code> has values that are instances of the <code>Classifier</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureTyping#getOwningFeature <em>Owning Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureTyping#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature <em>Typed Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping()
 * @model
 * @generated
 */
public interface FeatureTyping extends Specialization {
	/**
	 * Returns the value of the '<em><b>Typed Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getSpecific() <em>Specific</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that has a <code>type</code> determined by this <code>FeatureTyping</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typed Feature</em>' reference.
	 * @see #setTypedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping_TypedFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typing'"
	 *        annotation="redefines"
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

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getGeneral() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Type</code> that is being applied by this <code>FeatureTyping</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping_Type()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typingByType'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureTyping#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Owning Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedTyping <em>Owned Typing</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureTyping#getTypedFeature() <em>Typed Feature</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>typedFeature</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureTyping</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Feature</em>' reference.
	 * @see #setOwningFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureTyping_OwningFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedTyping
	 * @model opposite="ownedTyping" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getOwningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureTyping#getOwningFeature <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature</em>' reference.
	 * @see #getOwningFeature()
	 * @generated
	 */
	void setOwningFeature(Feature value);

} // FeatureTyping
