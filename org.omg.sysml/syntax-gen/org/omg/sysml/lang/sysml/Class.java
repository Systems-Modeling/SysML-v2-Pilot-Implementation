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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object
 * Classifier</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Class</code> is a <code>Classifier</code> of things (in the universe) that can be distinguished without regard to how they are related to other things (via <code>Features</code>). This means multiple things classified by the same <code>Class</code> can be distinguished, even when they are related other things in exactly the same way.</p>
 * 
 * specializesFromLibrary('Occurrences::Occurrence')
 * ownedSpecialization.general->
 *     forAll(not oclIsKindOf(DataType)) and
 * not oclIsKindOf(Association) implies
 *     ownedSpecialization.general->
 *         forAll(not oclIsKindOf(Association))
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
} // Class
