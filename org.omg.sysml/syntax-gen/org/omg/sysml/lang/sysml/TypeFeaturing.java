/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Featuring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A TypeFeaturing is a Relationship between a Type and a Feature that is featured by that Type. Every instance in the domain of the <code>featureOfType</code> must be classified by the <code>featuringType</code>. This means that sequences that are classified by the <code>featureOfType</code> must have a prefix subsequence that is classified by the <code>featuringType</code>.</p>
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
	 * <p>The Feature that is featured by the <code>featuringType</code>.</p>
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
	 * <p>The Type that features the <code>featureOfType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Featuring Type</em>' reference.
	 * @see #setFeaturingType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTypeFeaturing_FeaturingType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedFeaturing'"
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.TypeFeaturing#getFeatureOfType() <em>Feature Of Type</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that owns this TypeFeaturing (which must also be the <code>featureOfType</code>).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Feature Of Type</em>' reference.
	 * @see #setOwningFeatureOfType(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTypeFeaturing_OwningFeatureOfType()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedTypeFeaturing
	 * @model opposite="ownedTypeFeaturing" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
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
