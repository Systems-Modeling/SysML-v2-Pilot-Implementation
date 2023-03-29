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
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AttributeDefinition</code> is a <code>Definition</code> and a <code>DataType</code> of information about a quality or characteristic of a system or part of a system that has no independent identity other than its value. All <code>features</code> of an <code>AttributeDefinition</code> must be referential (non-composite).</p>
 * 
 * <p>As a <code>DataType</code>, an <code>AttributeDefinition</code> must specialize, directly or indirectly, the base <code>DataType</code> <code><em>Base::DataValue</em></code> from the Kernel Semantic Library.</p>
 * feature->forAll(not isComposite)
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAttributeDefinition()
 * @model
 * @generated
 */
public interface AttributeDefinition extends Definition, DataType {
} // ValueType
