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
 * A representation of the model object '<em><b>State Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>StateDefinition</code> is the <code>Definition</code> of the </code>Behavior</code> of a system or part of a system in a certain state condition.</p>
 * 
 * <p>A <code>StateDefinition</code> may be related to up to three of its <code>ownedFeatures</code> by <code>StateBehaviorMembership</code> <code>Relationships</code>, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the <code>StateDefinition</code>.</p>
 * specializesFromLibrary('States::StateAction')
 * ownedMembership->
 *     selectByKind(StateSubactionMembership)->
 *     isUnique(kind)
 * state = action->selectByKind(StateUsage)
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
 *     ownedAction.incomingTransition->isEmpty() and
 *     ownedAction.outgoingTransition->isEmpty()
 * exitAction = 
 *     let exitMemberships : Sequence(StateSubactionMembership) =
 *         ownedMembership->
 *             selectByKind(StateSubactionMembership)->
 *             select(kind = StateSubactionKind::exit) in
 *     if exitMemberships->isEmpty() then null
 *     else exitMemberships->at(1)
 *     endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StateDefinition#getState <em>State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateDefinition#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateDefinition#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateDefinition#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.StateDefinition#isParallel <em>Is Parallel</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition()
 * @model
 * @generated
 */
public interface StateDefinition extends ActionDefinition {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.StateUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionDefinition#getAction() <em>Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>StateUsages</code>, which are <code>actions</code> in the <code>StateDefinition</code>, that specify the discrete states in the behavior defined by the <code>StateDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_State()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringStateDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<StateUsage> getState();

	/**
	 * Returns the value of the '<em><b>Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed on entry to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = entry</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Action</em>' reference.
	 * @see #setEntryAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_EntryAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='enteredStateDefinition'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getEntryAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateDefinition#getEntryAction <em>Entry Action</em>}' reference.
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
	 * <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed while in the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = do</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Action</em>' reference.
	 * @see #setDoAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_DoAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activeStateDefintion'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getDoAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateDefinition#getDoAction <em>Do Action</em>}' reference.
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
	 * <p>The <code>ActionUsage</code> of this <code>StateDefinition</code> to be performed on exit to the state defined by the <code>StateDefinition</code>. It is the owned <code>ActionUsage</code> related to the <code>StateDefinition</code> by a <code>StateSubactionMembership</code>  with <code>kind = exit</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Action</em>' reference.
	 * @see #setExitAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_ExitAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exitedStateDefinition'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getExitAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateDefinition#getExitAction <em>Exit Action</em>}' reference.
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
	 * <p>Whether the <code>ownedStates</code> of this <code>StateDefinition</code> are to all be performed in parallel. If true, none of the <code>ownedActions</code> (which includes <code>ownedStates</code>) may have any incoming or outgoing <code>Transitions</code>. If false, only one <code>ownedState</code> may be performed at a time.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Parallel</em>' attribute.
	 * @see #setIsParallel(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_IsParallel()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isParallel();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StateDefinition#isParallel <em>Is Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Parallel</em>' attribute.
	 * @see #isParallel()
	 * @generated
	 */
	void setIsParallel(boolean value);

} // StateDefinition
