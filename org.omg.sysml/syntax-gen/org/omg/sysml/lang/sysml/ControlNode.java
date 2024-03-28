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
 * A representation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ControlNode</code> is an <code>ActionUsage</code> that does not have any inherent behavior but provides constraints on incoming and outgoing <code>Successions</code> that are used to control other <code>Actions</code>. A <code>ControlNode</code> must be a composite owned <code>usage</code> of an <code>ActionDefinition</code> or <code>ActionUsage</code>.</p>
 * 
 * sourceConnector->selectByKind(Succession)->
 *     collect(connectorEnd->at(1).multiplicity)->
 *     forAll(sourceMult | 
 *         multiplicityHasBounds(sourceMult, 1, 1))
 * owningType <> null and 
 * (owningType.oclIsKindOf(ActionDefinition) or
 *  owningType.oclIsKindOf(ActionUsage))
 * targetConnector->selectByKind(Succession)->
 *     collect(connectorEnd->at(2).multiplicity)->
 *     forAll(targetMult | 
 *         multiplicityHasBounds(targetMult, 1, 1))
 * specializesFromLibrary('Action::Action::controls')
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getControlNode()
 * @model abstract="true"
 * @generated
 */
public interface ControlNode extends ActionUsage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check that the given <code>Multiplicity</code> has <code>lowerBound</code> and <code>upperBound</code> expressions that are model-level evaluable to the given <code>lower</code> and <code>upper</code> values.</p>
	 * mult <> null and
	 * if mult.oclIsKindOf(MultiplicityRange) then
	 *     mult.oclAsType(MultiplicityRange).hasBounds(lower, upper)
	 * else
	 *     mult.allSuperTypes()->exists(
	 *         oclisKindOf(MultiplicityRange) and
	 *         oclAsType(MultiplicityRange).hasBounds(lower, upper)
	 * endif
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" multRequired="true" multOrdered="false" lowerDataType="org.omg.sysml.lang.types.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="org.omg.sysml.lang.types.UnlimitedNatural" upperRequired="true" upperOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean multiplicityHasBounds(Multiplicity mult, int lower, int upper);
} // ControlNode
