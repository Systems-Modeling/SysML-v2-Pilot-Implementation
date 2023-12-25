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
 * '<em><b>Invocation Expression</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>InvocationExpression</code> is an <code>Expression</code> each of whose input <code>parameters</code> are bound to the <code>result</code> of an <code>argument</code> Expression.</p>
 * 
 * not ownedTyping->exists(oclIsKindOf(Behavior)) and
 * not ownedSubsetting.subsettedFeature.type->exists(oclIsKindOf(Behavior)) implies
 *     ownedFeature.selectByKind(BindingConnector)->exists(
 *         relatedFeature->includes(self) and
 *         relatedFeature->includes(result))
 *             
 * TBD
 * ownedFeature->
 *     select(direction = _'in').valuation->
 *     select(v | v <> null).value
 * let features : Set(Feature) = type.feature->asSet() in
 * input->forAll(inp | 
 *     inp.ownedRedefinition.redefinedFeature->
 *         intersection(features)->size() = 1)
 * let features : Set(Feature) = type.feature->asSet() in
 * input->forAll(inp1 | input->forAll(inp2 |
 *     inp1 <> inp2 implies
 *         inp1.ownedRedefinition.redefinedFeature->
 *             intersection(inp2.ownedRedefinition.redefinedFeature)->
 *             intersection(features)->isEmpty()))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.InvocationExpression#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.InvocationExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvocationExpression()
 * @model
 * @generated
 */
public interface InvocationExpression extends Expression {

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>value</code> <code>Expressions</code> of the <code>FeatureValues</code> of the owned input <code>parameters</code> of the <code>InvocationExpression</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvocationExpression_Argument()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invocation'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Expression> getArgument();

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvocationExpression_Operand()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Expression> getOperand();
} // InvocationExpression
