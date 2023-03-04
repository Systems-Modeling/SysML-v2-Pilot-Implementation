/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Chaining</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>FeatureChaining</code> is a <code>Relationship</code> that makes its target <code>Feature</code> one of the <code>chainingFeatures</code> of its owning <code>Feature</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureChaining#getChainingFeature <em>Chaining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureChaining#getFeatureChained <em>Feature Chained</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureChaining()
 * @model
 * @generated
 */
public interface FeatureChaining extends Relationship {
	/**
	 * Returns the value of the '<em><b>Chaining Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> whose values partly determine values of <code>featureChained</code>, as described in <code>Feature::chainingFeature</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chaining Feature</em>' reference.
	 * @see #setChainingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureChaining_ChainingFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='chainedFeatureChaining'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getChainingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureChaining#getChainingFeature <em>Chaining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chaining Feature</em>' reference.
	 * @see #getChainingFeature()
	 * @generated
	 */
	void setChainingFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Feature Chained</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedFeatureChaining <em>Owned Feature Chaining</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> whose values are partly determined by values of the <code>chainingFeature</code>, as described in <code>Feature::chainingFeature</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Chained</em>' reference.
	 * @see #setFeatureChained(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureChaining_FeatureChained()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedFeatureChaining
	 * @model opposite="ownedFeatureChaining" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getFeatureChained();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureChaining#getFeatureChained <em>Feature Chained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Chained</em>' reference.
	 * @see #getFeatureChained()
	 * @generated
	 */
	void setFeatureChained(Feature value);

} // FeatureChaining
