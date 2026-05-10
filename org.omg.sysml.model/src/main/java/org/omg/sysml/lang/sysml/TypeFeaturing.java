/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Featuring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>TypeFeaturing</code> is a <code>Featuring</code> <code>Relationship</code> in which the <code>featureOfType</code> is the <code>source</code> and the <code>featuringType</code> is the <code>target</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TypeFeaturing#getFeatureOfType <em>Feature Of Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TypeFeaturing#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TypeFeaturing#getOwningFeatureOfType <em>Owning Feature Of Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTypeFeaturing()
 * @model
 * @generated
 */
public interface TypeFeaturing extends Relationship {
	/**
	 * Returns the value of the '<em><b>Feature Of Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is featured by the <code>featuringType</code>. It is the <code>source</code> of the <code>TypeFeaturing</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Of Type</em>' reference.
	 * @see #setFeatureOfType(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTypeFeaturing_FeatureOfType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeFeaturing'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getFeatureOfType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TypeFeaturing#getFeatureOfType <em>Feature Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Type</em>' reference.
	 * @see #getFeatureOfType()
	 * @generated
	 */
	void setFeatureOfType(Feature value);

	/**
	 * Returns the value of the '<em><b>Featuring Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Type</code> that features the <code>featureOfType</code>. It is the <code>target</code> of the <code>TypeFeaturing</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Featuring Type</em>' reference.
	 * @see #setFeaturingType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTypeFeaturing_FeaturingType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeFeaturingOfType'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getFeaturingType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TypeFeaturing#getFeaturingType <em>Featuring Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuring Type</em>' reference.
	 * @see #getFeaturingType()
	 * @generated
	 */
	void setFeaturingType(Type value);

	/**
	 * Returns the value of the '<em><b>Owning Feature Of Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedTypeFeaturing <em>Owned Type Featuring</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.TypeFeaturing#getFeatureOfType() <em>Feature Of Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>featureOfType</code> that is also the <code>owningRelatedElement</code> of this <code>TypeFeaturing</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Feature Of Type</em>' reference.
	 * @see #setOwningFeatureOfType(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTypeFeaturing_OwningFeatureOfType()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedTypeFeaturing
	 * @model opposite="ownedTypeFeaturing" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getOwningFeatureOfType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TypeFeaturing#getOwningFeatureOfType <em>Owning Feature Of Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature Of Type</em>' reference.
	 * @see #getOwningFeatureOfType()
	 * @generated
	 */
	void setOwningFeatureOfType(Feature value);

} // TypeFeaturing
