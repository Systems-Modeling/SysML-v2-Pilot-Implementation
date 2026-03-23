/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Subaction Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>StateSubactionMembership</code> is a <code>FeatureMembership</code> for an entry, do or exit <code>ActionUsage<code> of a <code>StateDefinition</code> or <code>StateUsage</code>.</p>
 * owningType.oclIsKindOf(StateDefinition) or
 * owningType.oclIsKindOf(StateUsage)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getAction <em>Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateSubactionMembership()
 * @model
 * @generated
 */
public interface StateSubactionMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.StateSubactionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>StateSubactionMembership</code> is for an <code>entry<code>, <code>do</code> or <code>exit</code> <code>ActionUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.StateSubactionKind
	 * @see #setKind(StateSubactionKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateSubactionMembership_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StateSubactionKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.StateSubactionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StateSubactionKind value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature() <em>Owned Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsage</code> that is the <code>ownedMemberFeature</code> of this <code>StateSubactionMembership</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateSubactionMembership_Action()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateSubactionMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateSubactionMembership#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionUsage value);

} // StateSubactionMembership
