/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Instance
 * Creation Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getInstantiatedType <em>Instantiated Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstanceCreationExpression()
 * @model
 * @generated
 */
public interface InstanceCreationExpression extends InvocationExpression {

	/**
	 * Returns the value of the '<em><b>Instantiated Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instantiated Type</em>' reference.
	 * @see #setInstantiatedType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstanceCreationExpression_InstantiatedType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Type getInstantiatedType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getInstantiatedType <em>Instantiated Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Type</em>' reference.
	 * @see #getInstantiatedType()
	 * @generated
	 */
	void setInstantiatedType(Type value);

} // InstanceCreationExpression
