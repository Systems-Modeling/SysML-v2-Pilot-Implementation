/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TransitionFeatureMembership is a FeatureMembership for a trigger, guard or effect of a TransitionUsage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionFeatureMembership#getKind <em>Kind</em>}</li>
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

} // TransitionFeatureMembership
