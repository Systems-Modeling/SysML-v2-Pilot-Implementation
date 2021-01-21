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
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Expression</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Expression is a Step that is typed by a Function. An Expression that also has a Function as its <code>featuringType</code> is a computational step within that Function. An Expression always has a single <code>result</code> parameter, which redefines the <code>result</code> parameter of its defining <code>function</code>. This allows Expressions to be interconnected in tree structures, in which inputs to each Expression in the tree are determined as the results of other Expressions in the tree.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Expression#getFunction <em>Function</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Expression#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Expression#isModelLevelEvaluable <em>Is Model Level Evaluable</em>}</li>
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
	 * <p>The Function that types this Expression.</p>
	 * 
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
	 * <!-- begin-model-doc -->
	 * <p>The single parameter of this Expression whose <code>owningFeatureMembership</code> is a ReturnFeatureMembership. The result of an Expression must either be inherited from its <code>function</code> or (directly or indirectly) redefine the <code>result</code> parameter of its <code>function</code>.</p>
	 * 
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Is Model Level Evaluable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this Expression meets the constraints necessary to be evaluated at <em>model level</em>, that is, using metadata within the model.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Model Level Evaluable</em>' attribute.
	 * @see #setIsModelLevelEvaluable(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExpression_IsModelLevelEvaluable()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isModelLevelEvaluable();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Expression#isModelLevelEvaluable <em>Is Model Level Evaluable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Model Level Evaluable</em>' attribute.
	 * @see #isModelLevelEvaluable()
	 * @generated
	 */
	void setIsModelLevelEvaluable(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If this Expression <code>isModelLevelEvaluable</code>, then evaluate it using the <code>target</code> as the context Element for resolving Feature names and testing classification. The result is a collection of Elements, each of which must be a LiteralExpression or an AnnotatingFeature.</p>
	 * <!-- end-model-doc -->
	 * @model unique="false" targetRequired="true" targetOrdered="false"
	 * @generated
	 */
	EList<Element> evaluate(Element target);
} // Expression
