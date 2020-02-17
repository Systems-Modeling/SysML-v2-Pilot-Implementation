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
 * A StateUsage is a Usage that is also a Step, and, so, is typed by a Behavior. Nominally, if the type is a StateDefinition, a StateUsage is a Usage of that StateDefinition within a system. However, non-StateDefinition Behaviors are also allowed, to permit use of Behaviors from the Kernel Library.
 * 
 * A StateUsage (other than an ExhibitStateUsage owned by a Part) must subset, directly or indirectly, either the base StateUsage "states" from the Systems model library, if it is not a composite feature, or the StateUsage "substates" inherited from its owner, if it is a composite feature.
 * 
 * A StateUsage may have up to three features using StateBehaviorMembership, all of different kinds, corresponding to the entry, do and exit actions of the state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getStateOwningDefinition <em>State Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getStateDefinition <em>State Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getStateOwningUsage <em>State Owning Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage()
 * @model
 * @generated
 */
public interface StateUsage extends Usage, Step {
	/**
	 * Returns the value of the '<em><b>State Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedState <em>Nested State</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage() <em>Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * @return the value of the '<em>State Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_StateDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedState'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Behavior> getStateDefinition();

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
