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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Operator
 * Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperand_comp <em>Operand comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.OperatorExpression#getOperand <em>Operand</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Operand comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.InvocationExpression#getArgument() <em>Argument</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOperatorExpression_Operand_comp()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='operatorExpression'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Expression> getOperand_comp();

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOperatorExpression_Operand()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Expression> getOperand();

} // OperatorExpression
