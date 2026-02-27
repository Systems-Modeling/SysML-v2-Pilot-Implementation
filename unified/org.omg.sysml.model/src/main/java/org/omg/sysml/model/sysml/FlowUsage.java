/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FlowUsage</code> is an <code>ActionUsage</code> that is also a <code>ConnectorAsUsage</code> and a KerML <code>Flow</code>.</p>
 * specializesFromLibrary('Flows::messages')
 * ownedEndFeatures->notEmpty() implies
 *     specializesFromLibrary('Flows::flows')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.FlowUsage#getFlowDefinition <em>Flow Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getFlowUsage()
 * @model
 * @generated
 */
public interface FlowUsage extends ConnectorAsUsage, ActionUsage, Flow {
	/**
	 * Returns the value of the '<em><b>Flow Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Interactions</code> that are the <code>types</code> of this <code>FlowUsage</code>. Nominally, these are <code>FlowDefinitions</code>, but other kinds of Kernel <code>Interactions</code> are also allowed, to permit use of Interactions from the Kernel Model Libraries.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow Definition</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFlowUsage_FlowDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedFlow'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Interaction> getFlowDefinition();

} // FlowUsage
