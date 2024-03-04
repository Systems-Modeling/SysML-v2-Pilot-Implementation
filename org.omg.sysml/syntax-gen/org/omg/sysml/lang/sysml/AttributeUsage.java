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
 * A representation of the model object '<em><b>Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AttributeUsage</code> is a <code>Usage</code> whose type is a <code>DataType</code>. Nominally, if the type is an <code>AttributeDefinition</code>, an <code>AttributeUsage</code> is a usage of a <code>AttributeDefinition</code> to represent the value of some system quality or characteristic. However, other kinds of kernel <code>DataTypes</code> are also allowed, to permit use of <code>DataTypes</code> from the Kernel Model Libraries. An <code>AttributeUsage</code> itself as well as all its nested <code>features</code> must be referential (non-composite).</p>
 * 
 * <p>An <code>AttributeUsage</code> must specialize, directly or indirectly, the base <code>Feature</code> <code><em>Base::dataValues</em></code> from the Kernel Semantic Library.</p>
 * isReference
 * feature->forAll(not isComposite)
 * specializesFromLibrary('Base::dataValues')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AttributeUsage#getAttributeDefinition <em>Attribute Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAttributeUsage()
 * @model
 * @generated
 */
public interface AttributeUsage extends Usage {
	/**
	 * Returns the value of the '<em><b>Attribute Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.DataType}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getDefinition() <em>Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>DataTypes</code> that are the types of this <code>AttributeUsage</code>. Nominally, these are <code>AttributeDefinitions</code>, but other kinds of kernel <code>DataTypes</code> are also allowed, to permit use of <code>DataTypes</code> from the Kernel Model Libraries.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAttributeUsage_AttributeDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAttribute'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<DataType> getAttributeDefinition();

} // ValueProperty
