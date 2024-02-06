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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Operator
 * Expression</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>OperatorExpression</code> is an <code>InvocationExpression</code> whose <code>function</code> is determined by resolving its <code>operator</code> in the context of one of the standard packages from the Kernel Function Library.</p>
 * let libFunctions : Sequence(Element) = 
 *     Sequence{'BaseFunctions', 'DataFunctions', 'ControlFunctions'}->
 *     collect(ns | resolveGlobal(ns + "::'" + operator + "'").
 *     memberElement) in
 * libFunctions->includes(function)
 *     
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOperatorExpression()
 * @model
 * @generated
 */
public interface OperatorExpression extends InvocationExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOperatorExpression_Operator()
	 * @model dataType="org.omg.sysml.lang.types.String" required="true"
	 *        ordered="false"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // OperatorExpression
