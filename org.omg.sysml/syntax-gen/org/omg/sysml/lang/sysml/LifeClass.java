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
 * A representation of the model object '<em><b>Life Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>LifeClass</code> is a <code>Class</code> that specializes both the <code>Class</code> <code><em>Occurrences::Life</em></code> from the Kernel Semantic Library and a single <code>OccurrenceDefinition</code>, and has a multiplicity of 0..1. This constrains the <code>OccurrenceDefinition</code> being specialized to have at most one instance that is a complete <code>Life</code>.</p>
 * 
 * specializesFromLibrary('Occurrences::Life')
 * multiplicity <> null and
 * multiplicity.specializesFromLibrary('Base::zeroOrOne')
 * specializes(individualDefinition)
 * isSufficient
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLifeClass()
 * @model
 * @generated
 */
public interface LifeClass extends org.omg.sysml.lang.sysml.Class {
} // LifeClass
