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
 * A representation of the model object '<em><b>Association Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AssociationStructure</code> is an <code>Association</code> that is also a <code>Structure</code>, classifying link objects that are both links and objects. As objects, link objects can be created and destroyed, and their non-end <code>Features</code> can change over time. However, the values of the end <code>Features</code> of a link object are fixed and cannot change over its lifetime.</p>
 * specializesFromLibrary('Objects::LinkObject')
 * endFeature->size() = 2 implies
 *     specializesFromLibrary('Objects::BinaryLinkObject')
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociationStructure()
 * @model
 * @generated
 */
public interface AssociationStructure extends Association, Structure {

} // AssociationStructure
