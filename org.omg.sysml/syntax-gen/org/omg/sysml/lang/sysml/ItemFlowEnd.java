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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item
 * Flow End</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>ItemFlowEnd</code> is a <code>Feature</code> that is one of the <code>connectorEnds</code> giving the <code><em>source</em></code> or <code><em>target</em></code> of an <code>ItemFlow</code>. For <code>ItemFlows</code> typed by <code><em>FlowTransfer</em></code> or its specializations, <code>ItemFlowEnds</code> must have exactly one <code>ownedFeature</code>, which redefines <code><em>Transfer::source::sourceOutput</em></code> or <code><em>Transfer::target::targetInput</em></code> and redefines the corresponding feature of the <code>relatedElement</code> for its end.</p>
 * isEnd
 * ownedFeature->size() = 1
 * owningType <> null and owningType.oclIsKindOf(ItemFlow)
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlowEnd()
 * @model
 * @generated
 */
public interface ItemFlowEnd extends Feature {
} // ItemFlowEnd
