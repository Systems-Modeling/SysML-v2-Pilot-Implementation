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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>PerformActionUsage</code> is an <code>ActionUsage</code> that represents the performance of an <code>ActionUsage</code>. Unless it is the <code>PerformActionUsage</code> itself, the <code>ActionUsage</code> to be performed is related to the <code>PerformActionUsage</code> by a <code>ReferenceSubsetting</code> relationship. A <code>PerformActionUsage</code> is also an <code>EventOccurrenceUsage</code>, with its <code>performedAction</code> as the <code>eventOccurrence</code>.</p>
 * ownedReferenceSubsetting <> null implies
 *     ownedReferenceSubsetting.referencedFeature.oclIsKindOf(ActionUsage)
 * owningType <> null and
 * (owningType.oclIsKindOf(PartDefinition) or
 *  owningType.oclIsKindOf(PartUsage)) implies
 *     specializesFromLibrary('Parts::Part::performedActions')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PerformActionUsage#getPerformedAction <em>Performed Action</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPerformActionUsage()
 * @model
 * @generated
 */
public interface PerformActionUsage extends ActionUsage, EventOccurrenceUsage {

	/**
	 * Returns the value of the '<em><b>Performed Action</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.EventOccurrenceUsage#getEventOccurrence() <em>Event Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsage</code> to be performed by this <code>PerformedActionUsage</code>. It is the <code>eventOccurrence</code> of the <code>PerformActionUsage</code> considered as an <code>EventOccurrenceUsage</code>, which must be an <code>ActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Action</em>' reference.
	 * @see #setPerformedAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPerformActionUsage_PerformedAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='performingAction'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getPerformedAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PerformActionUsage#getPerformedAction <em>Performed Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Action</em>' reference.
	 * @see #getPerformedAction()
	 * @generated
	 */
	void setPerformedAction(ActionUsage value);
} // PerformActionUsage
