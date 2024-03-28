/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
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
 * <p>A <code>StateUsage</code> is an <code>ActionUsage</code> that is nominally the <code>Usage</code> of a <code>StateDefinition</code>. However, other kinds of kernel <code>Behaviors</code> are also allowed as <code>types</code>, to permit use of <code>Behaviors</code from the Kernel Model Libraries.</p>
 * 
 * <p>A <code>StateUsage</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateSubactionMembership</code> <code>Relationships</code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateUsage</code>.</p>
 * 
 * doAction =
 *     let doMemberships : Sequence(StateSubactionMembership) =
 *         ownedMembership->
 *             selectByKind(StateSubactionMembership)->
 *             select(kind = StateSubactionKind::do) in
 *     if doMemberships->isEmpty() then null
 *     else doMemberships->at(1)
 *     endif
 * entryAction =
 *     let entryMemberships : Sequence(StateSubactionMembership) =
 *         ownedMembership->
 *             selectByKind(StateSubactionMembership)->
 *             select(kind = StateSubactionKind::entry) in
 *     if entryMemberships->isEmpty() then null
 *     else entryMemberships->at(1)
 *     endif
 * isParallel implies
 *     nestedAction.incomingTransition->isEmpty() and
 *     nestedAction.outgoingTransition->isEmpty()
 * isSubstateUsage(true) implies
 *     specializesFromLibrary('States::State::substates')
 * exitAction =
 *     let exitMemberships : Sequence(StateSubactionMembership) =
 *         ownedMembership->
 *             selectByKind(StateSubactionMembership)->
 *             select(kind = StateSubactionKind::exit) in
 *     if exitMemberships->isEmpty() then null
 *     else exitMemberships->at(1)
 *     endif
 * specializesFromLibrary('States::stateActions')
 * ownedMembership->
 *     selectByKind(StateSubactionMembership)->
 *     isUnique(kind)
 * isSubstateUsage(false) implies
 *     specializesFromLibrary('States::State::substates')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getStateDefinition <em>State Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateUsage#isParallel <em>Is Parallel</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage()
 * @model
 * @generated
 */
public interface StateUsage extends ActionUsage {
	/**
	 * Returns the value of the '<em><b>State Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Behavior}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionUsage#getActionDefinition() <em>Action Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Behaviors</code> that are the <code>types</code> of this <code>StateUsage</code>. Nominally, these would be <code>StateDefinitions</code>, but kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_StateDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedState'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Behavior> getStateDefinition();

	/**
	 * Returns the value of the '<em><b>Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Action</em>' reference.
	 * @see #setEntryAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_EntryAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='enteredState'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Action</em>' reference.
	 * @see #setDoAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_DoAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activeState'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p>The <code>ActionUsage</code> of this <code>StateUsage</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateUsage</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Action</em>' reference.
	 * @see #setExitAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_ExitAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exitedState'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * Returns the value of the '<em><b>Is Parallel</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether the <code>nestedStates</code> of this <code>StateUsage</code> are to all be performed in parallel. If true, none of the <code>nestedActions</code> (which include <code>nestedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>nestedState</code> may be performed at a time.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Parallel</em>' attribute.
	 * @see #setIsParallel(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateUsage_IsParallel()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isParallel();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateUsage#isParallel <em>Is Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Parallel</em>' attribute.
	 * @see #isParallel()
	 * @generated
	 */
	void setIsParallel(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check if this <code>StateUsage</code> is composite and has an <code>owningType</code> that is an <code>StateDefinition</code> or <code>StateUsage</code> with the given value of <code>isParallel</code>, but is <em>not</em> an <code>entryAction</code> or <code>exitAction</code>. If so, then it represents a <code><em>StateAction</em></code> that is a <code><em>substate</em></code> or <code><em>exclusiveState</em></code> (for <code>isParallel = false</code>) of another <code><em>StateAction</em></code>.</p>
	 * owningType <> null and
	 * (owningType.oclIsKindOf(StateDefinition) and
	 *     owningType.oclAsType(StateDefinition).isParallel = isParallel or
	 *  owningType.oclIsKindOf(StateUsage) and
	 *     owningType.oclAsType(StateUsage).isParallel = isParallel) and
	 * not owningFeatureMembership.oclIsKindOf(StateSubactionMembership)
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" isParallelDataType="org.omg.sysml.lang.types.Boolean" isParallelRequired="true" isParallelOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isSubstateUsage(boolean isParallel);

} // StateUsage
