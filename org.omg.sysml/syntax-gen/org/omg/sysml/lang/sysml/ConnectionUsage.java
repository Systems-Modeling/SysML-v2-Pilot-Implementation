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

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ConnectionUsage is a Connector that is also a Usage. Nominally, if its type is a ConnectionDefinition, then a ConnectionUsage is a Usage of that ConnectionDefinition, representing a connection between parts of a system. However, other kinds of kernel Associations are also allowed, to permit use of Associations from the Kernel Library (such as the default BinaryLink).</p>
 * 
 * <p>A ConnectionUsage must subset the base ConnectionUsage <code>connections</code> from the Systems model library.</p>
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
public interface ConnectionUsage extends PartUsage, Connector {

	/**
	 * Returns the value of the '<em><b>Connection Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Association}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getAssociation() <em>Association</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Associations that are the types of this ConnectionUsage. Nominally, these are ConnectionDefinitions, but other kinds of Kernel Associations are also allowed, to permit use of Associations from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectionUsage_ConnectionDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedConnection'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Association> getConnectionDefinition();
} // ConnectorUsage
