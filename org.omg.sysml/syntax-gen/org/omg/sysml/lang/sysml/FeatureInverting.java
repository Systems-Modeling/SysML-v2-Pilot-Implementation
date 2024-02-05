/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Inverting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FeatureInverting</code> is a <code>Relationship</code> between <code>Features</code> asserting that their interpretations (sequences) are the reverse of each other, identified as <code>featureInverted</code> and <code>invertingFeature</code>. For example, a <code>Feature</code> identifying each person&#39;s parents is the inverse of a <code>Feature</code> identifying each person&#39;s children. A person identified as a parent of another will identify that other as one of their children.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureInverting#getFeatureInverted <em>Feature Inverted</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureInverting#getInvertingFeature <em>Inverting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureInverting#getOwningFeature <em>Owning Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureInverting()
 * @model
 * @generated
 */
public interface FeatureInverting extends Relationship {
	/**
	 * Returns the value of the '<em><b>Feature Inverted</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is an inverse of the <code>invertingFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Inverted</em>' reference.
	 * @see #setFeatureInverted(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureInverting_FeatureInverted()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invertingFeatureInverting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getFeatureInverted();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureInverting#getFeatureInverted <em>Feature Inverted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Inverted</em>' reference.
	 * @see #getFeatureInverted()
	 * @generated
	 */
	void setFeatureInverted(Feature value);

	/**
	 * Returns the value of the '<em><b>Inverting Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is an inverse of the <code>invertedFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverting Feature</em>' reference.
	 * @see #setInvertingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureInverting_InvertingFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invertedFeatureInverting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getInvertingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureInverting#getInvertingFeature <em>Inverting Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverting Feature</em>' reference.
	 * @see #getInvertingFeature()
	 * @generated
	 */
	void setInvertingFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owning Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedFeatureInverting <em>Owned Feature Inverting</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureInverting#getFeatureInverted() <em>Feature Inverted</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>featureInverted</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureInverting</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Feature</em>' reference.
	 * @see #setOwningFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureInverting_OwningFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedFeatureInverting
	 * @model opposite="ownedFeatureInverting" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getOwningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureInverting#getOwningFeature <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature</em>' reference.
	 * @see #getOwningFeature()
	 * @generated
	 */
	void setOwningFeature(Feature value);

} // FeatureInverting
