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
 * A representation of the model object '<em><b>Connector Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ConnectionUsage</code> is a <code>ConnectorAsUsage</code> that is also a <code>PartUsage</code>. Nominally, if its type is a <code>ConnectionDefinition</code>, then a <code>ConnectionUsage</code> is a Usage of that <code>ConnectionDefinition</code>, representing a connection between parts of a system. However, other kinds of kernel <code>AssociationStructures</code> are also allowed, to permit use of <code>AssociationStructures</code> from the Kernel Model Libraries.</p>
 * specializesFromLibrary('Connections::connections')
 * ownedEndFeature->size() = 2 implies
 *     specializesFromLibrary('Connections::binaryConnections')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConnectionUsage#getConnectionDefinition <em>Connection Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectionUsage()
 * @model
 * @generated
 */
public interface ConnectionUsage extends ConnectorAsUsage, PartUsage {

	/**
	 * Returns the value of the '<em><b>Connection Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AssociationStructure}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ItemUsage#getItemDefinition() <em>Item Definition</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getAssociation() <em>Association</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AssociationStructures</code> that are the types of this <code>ConnectionUsage</code>. Nominally, these are , but other kinds of Kernel <code>AssociationStructures</code> are also allowed, to permit use of <code>AssociationStructures</code> from the Kernel Model Libraries</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectionUsage_ConnectionDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedConnection'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<AssociationStructure> getConnectionDefinition();
} // ConnectorUsage
