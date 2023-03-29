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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Value
 * Classifier</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>DataType</code> is a <code>Classifier</code> of things (in the universe) that can only be distinguished by how they are related to other things (via Features). This means multiple things classified by the same <code>DataType</code></p>
 * 
 * <ul>
 * 	<li>Cannot be distinguished when they are related to other things in exactly the same way, even when they are intended to be about different things.</li>
 * 	<li>Can be distinguished when they are related to other things in different ways, even when they are intended to be about the same thing.</li>
 * </ul>
 * 
 * specializesFromLibrary('Base::DataValue')
 * ownedSpecialization.general->
 *     forAll(not oclIsKindOf(Class) and 
 *            not oclIsKindOf(Association))
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Classifier {
} // DataType
