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
 * A representation of the model object '<em><b>Enumeration Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>EnumerationUsage</code> is an <code>AttributeUsage</code> whose <code>attributeDefinition</code> is an <code>EnumerationDefinition</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.EnumerationUsage#getEnumerationDefinition <em>Enumeration Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEnumerationUsage()
 * @model
 * @generated
 */
public interface EnumerationUsage extends AttributeUsage {
	/**
	 * Returns the value of the '<em><b>Enumeration Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.AttributeUsage#getAttributeDefinition() <em>Attribute Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The single EnumerationDefinition that is the type of this EnumerationUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumeration Definition</em>' reference.
	 * @see #setEnumerationDefinition(EnumerationDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEnumerationUsage_EnumerationDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedEnumeration'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EnumerationDefinition getEnumerationDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.EnumerationUsage#getEnumerationDefinition <em>Enumeration Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Definition</em>' reference.
	 * @see #getEnumerationDefinition()
	 * @generated
	 */
	void setEnumerationDefinition(EnumerationDefinition value);

} // EnumerationUsage
