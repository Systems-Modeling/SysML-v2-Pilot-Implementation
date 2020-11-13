/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A DecisionNode is a ControlNode that makes a selection from its outgoing Successions. All outgoing Successions must be must have a target multiplicity of 0..1 and subset the Feature <code>DecisionAction::outgoingHBLink</code>. A DecisionNode may have at most one incoming Succession.</p>
 * 
 * <p>A DecisionNode must subset, directly or indirectly, the ActionUsage <code>Action::decisions</code>, implying that it is typed by DecisionAction from the Systems model library (or a subtype of it).</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {
} // DecisionNode
