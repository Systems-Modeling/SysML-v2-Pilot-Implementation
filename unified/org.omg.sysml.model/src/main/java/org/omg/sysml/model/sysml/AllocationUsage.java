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
 * A representation of the model object '<em><b>Allocation Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AllocationUsage</code> is a usage of an <code>AllocationDefinition</code> asserting the allocation of the <code>source</code> feature to the <code>target</code> feature.</p>
 * specializesFromLibrary('Allocations::allocations')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.AllocationUsage#getAllocationDefinition <em>Allocation Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getAllocationUsage()
 * @model
 * @generated
 */
public interface AllocationUsage extends ConnectionUsage {
	/**
	 * Returns the value of the '<em><b>Allocation Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.AllocationDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AllocationDefinitions</code> that are the types of this <code>AllocationUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Definition</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getAllocationUsage_AllocationDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAllocation'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AllocationDefinition> getAllocationDefinition();

} // AllocationUsage
