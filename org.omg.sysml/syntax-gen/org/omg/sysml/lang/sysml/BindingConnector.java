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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Binding
 * Connector</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Binding Connector is a binary Connector that requires its <code>relatedFeatures</code> to identify the same things (have the same values). 
 * 
 * <p> A BindingConnector must be directly or indirectly typed by the <em><code>SelfLink</code></em> Association from the <em><code>Links</code</em> library model. Both end multiplicities must be 1..1 when the <code>relatedFeatures</code> have unique values.</p>
 * 
 * specializesFromLibrary("Links::selfLinks")
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getBindingConnector()
 * @model
 * @generated
 */
public interface BindingConnector extends Connector {
} // BindingConnector
