/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Subsetting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>CrossSubsetting</code> is a kind of <code>Subsetting</code> for end <code>Features</code>, as identified by <code>crossingFeature</code>, to subset a chained <code>Feature</code>, identified by <code>crossedFeature.</code> It navigates to instances of the end <code>Feature</code>’s type from instances of other end <code>Feature</code> types on the same <code>owningType</code> (at least two end <code>Features</code> are required for any of them to have a <code>CrossSubsetting</code>).</p>
 * 
 * <p>The <code>crossedFeature</code> of a <code>CrossSubsetting</code> must have a feature chain of exactly two <code>Features</code>. The second <code>Feature</code> in the chain is the <code>crossFeature</code> of the <code>crossingFeature</code> (end <code>Feature</code>), which has the same type as the <code>crossingFeature</code>. When the <code>owningType</code> of the <code>crossingFeature</code> has exactly two end <code>Features</code>, the first <code>Feature</code> in the chain of the <code>crossedFeature</code> is the other end <code>Feature</code>. The <code>crossFeature</code>’s <code>featuringType</code> in this case is the other end <code>Feature</code>. When the <code>owningType</code> has more than two end <code>Features</code>, the first <code>Feature</code> in the chain is a <code>Feature</code> that <code>CrossMultiplies</code> all the other end <code>Features</code>, which is also the <code>featuringType</code> of the <code>crossFeature</code>.</p>
 * 
 * <p>A <code>crossFeature</code> must be owned by its <code>featureCrossing</code> (end <code>Feature</code>) when the <code>featureCrossing</code> <code>owningType</code> has more than two end <code>Features</code>. Otherwise, for exactly two end <code>Features</code>, the <code>crossFeatures</code> of each the ends can instead optionally be inherited by the other end from one of its <code>types</code> or a subsetted <code>Feature</code>.</p>
 * crossingFeature.isEnd and crossingFeature.owningType <> null implies
 *     let endFeatures: Sequence(Feature) = crossingFeature.owningType.endFeature in
 *     let chainingFeatures: Sequence(Feature) = crossedFeature.chainingFeature in
 *     chainingFeatures->size() = 2 and
 *     endFeatures->size() = 2 implies 
 *         chainingFeatures->at(1) = endFeatures->excluding(crossingFeature)->at(1)
 * crossingFeature.isEnd and
 * crossingFeature.owningType<>null and
 * crossingFeature.owningType.endFeature ->size() > 1
 * <!-- end-model-doc -->
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The chained <code>Feature</code> that is cross subset by the <code>crossingFeature</code> of this <code>CrossSubsetting</code>.</p>
	 * 
	 * <!-- end-model-doc -->
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature() <em>Subsetting Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The end <code>Feature</code> that owns this <code>CrossSubsetting</code> relationship and is also its </code>subsettingFeature</code>.</p>
	 * <!-- end-model-doc -->
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
