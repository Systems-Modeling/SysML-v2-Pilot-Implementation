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
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Expression</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Expression is a single computational step within a Function. These can be interpreted as one side of a mathematical equation, a full equation (which can evaluate to true or false), or a software expression (which evaluates to some data type). Expressions can be typed by Functions, which supports parameterization. Expressions return one <code>result</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Expression#getFunction <em>Function</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Expression#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Step {

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getBehavior() <em>Behavior</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Function that types the Expression.</p>
	 * <p>This is the Function that types the Expression.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExpression_Function()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedExpression'"
	 *        annotation="redefines"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Expression#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getParameter() <em>Parameter</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOutput() <em>Output</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExpression_Result()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='computingExpression'"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getResult();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Expression#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Feature value);
} // Expression
