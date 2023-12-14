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
 * A representation of the model object '<em><b>Exhibit State Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>ExhibitStateUsage</code> is a <code>StateUsage</code> that represents the exhibiting of a <code>StateUsage</code>. Unless it is the <code>StateUsage</code> itself, the <code>StateUsage</code> to be exhibited is related to the <code>ExhibitStateUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>. An <code>ExhibitStateUsage</code> is also a <code>PerformActionUsage</code>, with its <code>exhibitedState</code> as the <code>performedAction</code>.</p>
 * 
 * owningType <> null and
 * (owningType.oclIsKindOf(PartDefinition) or
 *  owningType.oclIsKindOf(PartUsage)) implies
 *     specializesFromLibrary('Parts::Part::exhibitedStates')
 * ownedReferenceSubsetting <> null implies
 *     ownedReferenceSubsetting.referencedFeature.oclIsKindOf(StateUsage)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ExhibitStateUsage#getExhibitedState <em>Exhibited State</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExhibitStateUsage()
 * @model
 * @generated
 */
public interface ExhibitStateUsage extends StateUsage, PerformActionUsage {
	/**
	 * Returns the value of the '<em><b>Exhibited State</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.PerformActionUsage#getPerformedAction() <em>Performed Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exhibited State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>StateUsage</code> to be exhibited by the <code>ExhibitStateUsage</code>. It is the <code>performedAction</code> of the <code>ExhibitStateUsage</code> considered as a <code>PerformActionUsage</code>, which must be a <code>StateUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exhibited State</em>' reference.
	 * @see #setExhibitedState(StateUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExhibitStateUsage_ExhibitedState()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exhibitingState'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	StateUsage getExhibitedState();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ExhibitStateUsage#getExhibitedState <em>Exhibited State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exhibited State</em>' reference.
	 * @see #getExhibitedState()
	 * @generated
	 */
	void setExhibitedState(StateUsage value);

} // ExhibitStateUsage
