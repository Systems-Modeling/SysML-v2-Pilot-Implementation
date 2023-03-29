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
 * A representation of the model object '<em><b>Enumeration Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>EnumerationDefinition</code> is an <code>AttributeDefinition</code> all of whose instances are given by an explicit list of <code>enumeratedValues</code>. This is realized by requiring that the <code>EnumerationDefinition</code> have <code>isVariation = true</code>, with the <code>enumeratedValues</code> being its <code>variants</code>.</p> 
 * isVariation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.EnumerationDefinition#getEnumeratedValue <em>Enumerated Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEnumerationDefinition()
 * @model
 * @generated
 */
public interface EnumerationDefinition extends AttributeDefinition {
	/**
	 * Returns the value of the '<em><b>Enumerated Value</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.EnumerationUsage}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getVariant() <em>Variant</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>EnumerationUsages</code> of this <code>EnumerationDefinition</code>that have distinct, fixed values. Each <code>enumeratedValue</code> specifies one of the allowed instances of the <code>EnumerationDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumerated Value</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEnumerationDefinition_EnumeratedValue()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningEnumerationDefinition'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<EnumerationUsage> getEnumeratedValue();

} // EnumerationDefinition
