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
 * <p>A StateDefinition is the Definition of the Behavior of a system or part of a system in a certain state condition.</p>
 * 
 * <p>A State Definition must subclass, directly or indirectly, the base StateDefinition StateAction from the Systems model library.</p>
 * 
 * <p>A StateDefinition may be related to up to three of its <cpde>ownedFeatures</cpde> by StateBehaviorMembership Relationships, all of different <code>kinds</code>, corresponding to the entry, do and exit actions of the StateDefinition.</p>
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getStep() <em>Step</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The StateUsages that are the <tt>steps</tt> of the StateDefinition, which specify the discrete states in the Behavior defined by the StateDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_State()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringStateDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<StateUsage> getState();

	/**
	 * Returns the value of the '<em><b>Entry Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsage of this StateDefinition to be performed on entry to the state defined by the StateDefinition. This is derived as the owned ActionUsage related to the StateDefinition by a StateSubactionMembership  with <tt>kind</tt> = <tt>entry</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Action</em>' reference.
	 * @see #setEntryAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_EntryAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='enteredStateDefinition'"
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
	 * <p>The ActionUsage of this StateDefinition to be performed while in the state defined by the StateDefinition. This is derived as the owned ActionUsage related to the StateDefinition by a StateSubactionMembership  with <tt>kind</tt> = <tt>do</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Action</em>' reference.
	 * @see #setDoAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_DoAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activeStateDefintion'"
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
	 * <p>The ActionUsage of this StateDefinition to be performed on exit from the state defined by the StateDefinition. This is derived as the owned ActionUsage related to the StateDefinition by a StateSubactionMembership  with <tt>kind</tt> = <tt>exit</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exit Action</em>' reference.
	 * @see #setExitAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStateDefinition_ExitAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exitedStateDefinition'"
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

} // StateDefinition
