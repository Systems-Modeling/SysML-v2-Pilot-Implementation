/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A TransitionFeatureMembership is a FeatureMembership for a trigger, guard or effect of a TransitionUsage. The <tt>ownedMemberFeature</tt> must be a Step. For a trigger, the <tt>ownedMemberFeature</tt> must more specifically be a Transfer, while for a guard it must be an Expression with a result type of Boolean.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getTransitionFeature_comp <em>Transition Feature comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getTransitionFeature <em>Transition Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionFeatureMembership()
 * @model
 * @generated
 */
public interface TransitionFeatureMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.TransitionFeatureKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this TransitionFeatureMembership is for a trigger, guard or effect.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.TransitionFeatureKind
	 * @see #setKind(TransitionFeatureKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionFeatureMembership_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransitionFeatureKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.TransitionFeatureKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TransitionFeatureKind value);

	/**
	 * Returns the value of the '<em><b>Transition Feature comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp() <em>Owned Member Feature comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Step that is the <tt>ownedMemberFeature</tt> of this TransitionFeatureMembership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition Feature comp</em>' containment reference.
	 * @see #setTransitionFeature_comp(Step)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionFeatureMembership_TransitionFeature_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transitionFeatureMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Step getTransitionFeature_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getTransitionFeature_comp <em>Transition Feature comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Feature comp</em>' containment reference.
	 * @see #getTransitionFeature_comp()
	 * @generated
	 */
	void setTransitionFeature_comp(Step value);

	/**
	 * Returns the value of the '<em><b>Transition Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Feature</em>' reference.
	 * @see #setTransitionFeature(Step)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionFeatureMembership_TransitionFeature()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Step getTransitionFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getTransitionFeature <em>Transition Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Feature</em>' reference.
	 * @see #getTransitionFeature()
	 * @generated
	 */
	void setTransitionFeature(Step value);

} // TransitionFeatureMembership
