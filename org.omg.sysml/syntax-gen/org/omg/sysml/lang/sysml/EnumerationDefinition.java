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
 * <p>An EnumerationDefinition is an AttributeDefinition all of whose instances are given by an explicit list of <code>enumeratedValues</code>.</p> 
 * 
 * <p>An EnumerationDefinition must subclass, directly or indirectly, the base EnumerationDefinition EnumerationValue from the Systems model library.</p>
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
	 * <p>A EnumerationUsage of this EnumerationDefinition with a fixed value, distinct from the value of all other <code>enumerationValues</code>, which specifies one of the allowed instances of the EnumerationDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumerated Value</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEnumerationDefinition_EnumeratedValue()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningEnumerationDefinition'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<EnumerationUsage> getEnumeratedValue();

} // EnumerationDefinition
