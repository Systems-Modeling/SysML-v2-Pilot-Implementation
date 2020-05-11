/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A StateUsage is an ActionUsage that is nominally the Usage of a StateDefinition. However, non-StateDefinition Behaviors are also allowed as types, to permit use of Behaviors from the Kernel Library.</p>
 * 
 * <p>A StateUsage (other than an ExhibitStateUsage owned by a Part) must subset, directly or indirectly, either the base StateUsage <tt>stateActions</tt> from the Systems model library, if it is not a composite feature, or the StateUsage <tt>substates</tt> inherited from its owner, if it is a composite feature.</p>
 * 
 * <p>A StateUsage may be related to up to three of its <tt>ownedFeatures</tt> by StateBehaviorMembership Relationships, all of different <tt>kinds</tt>, corresponding to the entry, do and exit actions of the StateUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getStateOwningUsage <em>State Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getStateDefinition <em>State Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getStateOwningDefinition <em>State Owning Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage()
 * @model
 * @generated
 */
public interface StateUsage extends ActionUsage {
	/**
	 * Returns the value of the '<em><b>State Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedState <em>Nested State</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionUsage#getActionOwningUsage() <em>Action Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usage in which this StateUsage is nested, if any.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Owning Usage</em>' reference.
	 * @see #setStateOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_StateOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedState
	 * @model opposite="nestedState" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getStateOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateUsage#getStateOwningUsage <em>State Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Owning Usage</em>' reference.
	 * @see #getStateOwningUsage()
	 * @generated
	 */
	void setStateOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>State Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Behavior}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getBehavior() <em>Behavior</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Behaviors that are the types of this StateUsage. Nominally, these would be StateDefinitions, but non-Activity Behaviors are also allowed, to permit use of Behaviors from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_StateDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedState'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Behavior> getStateDefinition();

	/**
	 * Returns the value of the '<em><b>Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsage of this StateUsage to be performed on entry to the state specified by the StateUsage. This is derived as the owned ActionUsage related to the StateDefinition by a StateSubactionMembership  with <tt>kind</tt> = <tt>entry</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Action</em>' reference.
	 * @see #setEntryAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_EntryAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='enteredState'"
	 * @generated
	 */
	ActionUsage getEntryAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateUsage#getEntryAction <em>Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Action</em>' reference.
	 * @see #getEntryAction()
	 * @generated
	 */
	void setEntryAction(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Do Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsage of this StateUsage to be performed while in the state specified by the StateUsage. This is derived as the owned ActionUsage related to the StateDefinition by a StateSubactionMembership  with <tt>kind</tt> = <tt>do</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Action</em>' reference.
	 * @see #setDoAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_DoAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activeState'"
	 * @generated
	 */
	ActionUsage getDoAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateUsage#getDoAction <em>Do Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Action</em>' reference.
	 * @see #getDoAction()
	 * @generated
	 */
	void setDoAction(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Exit Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsage of this StateUsage to be performed on exit from the state specified by the StateUsage. This is derived as the owned ActionUsage related to the StateDefinition by a StateSubactionMembership  with <tt>kind</tt> = <tt>exit</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Action</em>' reference.
	 * @see #setExitAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_ExitAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exitedState'"
	 * @generated
	 */
	ActionUsage getExitAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateUsage#getExitAction <em>Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Action</em>' reference.
	 * @see #getExitAction()
	 * @generated
	 */
	void setExitAction(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>State Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedState <em>Owned State</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition() <em>Owning Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Definition that owns this StateUsage, if any.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Owning Definition</em>' reference.
	 * @see #setStateOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_StateOwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedState
	 * @model opposite="ownedState" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Definition getStateOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateUsage#getStateOwningDefinition <em>State Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Owning Definition</em>' reference.
	 * @see #getStateOwningDefinition()
	 * @generated
	 */
	void setStateOwningDefinition(Definition value);

} // StateUsage
