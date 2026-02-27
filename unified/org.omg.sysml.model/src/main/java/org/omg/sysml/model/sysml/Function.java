/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Function</code> is a <code>Behavior</code> that has an <code>out</code> <code>parameter</code> that is identified as its <code>result</code>. A <code>Function</code> represents the performance of a calculation that produces the values of its <code>result</code> <code>parameter</code>. This calculation may be decomposed into <code>Expressions</code> that are <code>steps</code> of the <code>Function</code>.</p>
 * 
 * featureMembership->
 *     selectByKind(ReturnParameterMembership)->
 *     size() = 1
 * specializesFromLibrary('Performances::Evaluation')
 * ownedMembership.selectByKind(ResultExpressionMembership)->
 *     forAll(mem | ownedFeature.selectByKind(BindingConnector)->
 *         exists(binding |
 *             binding.relatedFeature->includes(result) and
 *             binding.relatedFeature->includes(mem.ownedResultExpression.result)))
 * result =
 *     let resultParams : Sequence(Feature) =
 *         featureMemberships->
 *             selectByKind(ReturnParameterMembership).
 *             ownedMemberParameter in
 *     if resultParams->notEmpty() then resultParams->first()
 *     else null
 *     endif
 * membership->selectByKind(ResultExpressionMembership)->size() <= 1
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.Function#isIsModelLevelEvaluable <em>Is Model Level Evaluable</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Function#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Function#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Behavior {
	/**
	 * Returns the value of the '<em><b>Is Model Level Evaluable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>Function</code> can be used as the <code>function</code> of a model-level evaluable <code>InvocationExpression</code>. Certain <code>Functions</code> from the Kernel Functions Library are considered to have <code>isModelLevelEvaluable = true</code>. For all other <code>Functions</code> it is <code>false</code>.</p>
	 * 
	 * <p><strong>Note:</strong> See the specification of the KerML concrete syntax notation for <code>Expressions</code> for an identification of which library <code>Functions</code> are model-level evaluable.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Model Level Evaluable</em>' attribute.
	 * @see #setIsModelLevelEvaluable(boolean)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFunction_IsModelLevelEvaluable()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isIsModelLevelEvaluable();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Function#isIsModelLevelEvaluable <em>Is Model Level Evaluable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Model Level Evaluable</em>' attribute.
	 * @see #isIsModelLevelEvaluable()
	 * @generated
	 */
	void setIsModelLevelEvaluable(boolean value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expressions</code> that are <code>steps</code> in the calculation of the <code>result</code> of this <code>Function</code>.</p>
	 * 
	 * <p>The set of expressions that represent computational steps or parts of a system of equations within the Function.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFunction_Expression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='computedFunction'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Expression> getExpression();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The object or value that is the result of evaluating the Function.</p>
	 * <p>The <code>result</code> <code>parameter</code> of the <code>Function</code>, which is owned by the <code>Function</code> via a <code>ReturnParameterMembership</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Feature)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFunction_Result()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='computingFunction'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getResult();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Function#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Feature value);

} // Function
