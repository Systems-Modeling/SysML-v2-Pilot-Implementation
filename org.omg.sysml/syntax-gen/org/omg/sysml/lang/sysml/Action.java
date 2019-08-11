/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Action#getActionOwningDefinition <em>Action Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Action#getActionOwningUsage <em>Action Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Action#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends Usage, Step {
	/**
	 * Returns the value of the '<em><b>Action Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedAction <em>Owned Action</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition() <em>Owning Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Owning Definition</em>' reference.
	 * @see #setActionOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAction_ActionOwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedAction
	 * @model opposite="ownedAction" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Definition getActionOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Action#getActionOwningDefinition <em>Action Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Owning Definition</em>' reference.
	 * @see #getActionOwningDefinition()
	 * @generated
	 */
	void setActionOwningDefinition(Definition value);

	/**
	 * Returns the value of the '<em><b>Action Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedAction <em>Nested Action</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage() <em>Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Owning Usage</em>' reference.
	 * @see #setActionOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAction_ActionOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedAction
	 * @model opposite="nestedAction" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getActionOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Action#getActionOwningUsage <em>Action Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Owning Usage</em>' reference.
	 * @see #getActionOwningUsage()
	 * @generated
	 */
	void setActionOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getBehavior() <em>Behavior</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Behavior)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAction_Activity()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAction'"
	 *        annotation="redefines"
	 * @generated
	 */
	Behavior getActivity();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Action#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Behavior value);

} // Action
