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
 * <p>An <code>InvocationExpression</code> is an <code>InstantiationExpression</code> whose <code>instantiatedType</code> must be a <code>Behavior</code> or a <code>Feature</code> typed by a single <code>Behavior</code> (such as a <code>Step</code>). Each of the input <code>parameters</code> of the <code>instantiatedType</code> are bound to the <code>result</code> of an <code>argument</code> <code>Expression</code>. If the <code>instantiatedType</code> is a <code>Function</code> or a <code>Feature</code> typed by a <code>Function</code>, then the <code>result</code> of the <code>InvocationExpression</code> is the <code>result</code> of the invoked <code>Function</code>. Otherwise, the <code>result</code> is an instance of the <code>instantiatedType</code> (essentially like a behavioral <code>ConstructorExpression</code>).</p>
 * 
 * not instantiatedType.oclIsKindOf(Function) and
 * not (instantiatedType.oclIsKindOf(Feature) and 
 *      instantiatedType.oclAsType(Feature).type->exists(oclIsKindOf(Function))) implies
 *     ownedFeature.selectByKind(BindingConnector)->exists(
 *         relatedFeature->includes(self) and
 *         relatedFeature->includes(result))
 * TBD
 * instantiatedType.input->collect(inp | 
 *     ownedFeatures->select(redefines(inp)).valuation->
 *     select(v | v <> null).value
 * )
 * let parameters : OrderedSet(Feature) = instantiatedType.input in
 * input->forAll(inp | 
 *     inp.ownedRedefinition.redefinedFeature->
 *         intersection(parameters)->size() = 1)
 * let features : OrderedSet(Feature) = instantiatedType.feature in
 * input->forAll(inp1 | input->forAll(inp2 |
 *     inp1 <> inp2 implies
 *         inp1.ownedRedefinition.redefinedFeature->
 *             intersection(inp2.ownedRedefinition.redefinedFeature)->
 *             intersection(features)->isEmpty()))
 * not instantiatedType.oclIsKindOf(Function) and
 * not (instantiatedType.oclIsKindOf(Feature) and 
 *      instantiatedType.oclAsType(Feature).type->exists(oclIsKindOf(Function))) implies
 *     result.specializes(instantiatedType)
 * specializes(instantiatedType)
 * instantiatedType.oclIsKindOf(Behavior) or
 * instantiatedType.oclIsKindOf(Feature) and
 *     instantiatedType.type->exists(oclIsKindOf(Behavior)) and
 *     instantiatedType.type->size(1)
 * ownedFeature->forAll(f |
 *     f <> result implies 
 *         f.direction = FeatureDirectionKind::_'in')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.InvocationExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvocationExpression()
 * @model
 * @generated
 */
public interface InvocationExpression extends InstantiationExpression {

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
