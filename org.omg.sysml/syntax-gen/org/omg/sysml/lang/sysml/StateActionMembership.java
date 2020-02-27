/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Action Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StateActionMembership is a FeatureMembership for an entry, do or exit Action in a StateUsage. The memberFeature must be an Action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StateActionMembership#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateActionMembership()
 * @model
 * @generated
 */
public interface StateActionMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.StateActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this is an entry, do or exit Action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.StateActionKind
	 * @see #setKind(StateActionKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateActionMembership_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StateActionKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateActionMembership#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.StateActionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StateActionKind value);

} // StateActionMembership
