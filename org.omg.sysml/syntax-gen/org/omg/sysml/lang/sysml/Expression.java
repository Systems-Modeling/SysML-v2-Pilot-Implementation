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
 * isModelLevelEvaluable = modelLevelEvaluable(Set(Element){})
 * specializesFromLibrary("Performances::evaluations")
 * ownedMembership.selectByKind(ResultExpressionMembership)->
 *     forAll(mem | ownedFeature.selectByKind(BindingConnector)->
 *         exists(binding |
 *             binding.relatedFeature->includes(result) and
 *             binding.relatedFeature->includes(mem.ownedResultExpression.result)))
 * owningMembership <> null and 
 * owningMembership.oclIsKindOf(FeatureValue) implies
 *     let featureWithValue : Feature = 
 *         owningMembership.oclAsType(FeatureValue).featureWithValue in
 *     featuringType = featureWithValue.featuringType
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
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedExpression'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p><p>The <code>result</code> parameter of the Expression, derived as the single <code>parameter</code> of the Expression with direction <code>out</code>. The result of an Expression must either be inherited from its <code>function</code> or (directly or indirectly) redefine the <code>result</code> parameter of its <code>function</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExpression_Result()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='computingExpression'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p>Return whether this Expression is model-level evaluable. The <code>visited</code> parameter is used to track possible circular feature references. Such circular references are not allowed in model-level evaluable expressions.</p>
	 * 
	 * <p>An Expression that is not otherwise specialized is model-level evaluable if all of its <code>features</code> are either <code>in</code> parameters, its single <code>resultParameter</code> or a result Expression owned via a ResultExpressionMembership (and possibly its implicit BindingConnector). The <code>parameters</code> parameters must not have and <code>ownedFeatures</code> and the result Expression must be model-level evaluable.</p>
	 * parameters->forAll(
	 *     p | directionOf(p) = FeatureDirectionKind::_'in' and 
	 *     p.valuation = null) and
	 * ownedFeatureMembership->
	 *     select(oclIsKindOf(ResultExpressionMembership))->
	 *     forAll(resultExpression.modelLevelEvaluable(visited))
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" visitedMany="true" visitedOrdered="false"
	 * @generated
	 */
	boolean modelLevelEvaluable(EList<Feature> visited);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If this Expression <code>isModelLevelEvaluable</code>, then evaluate it using the <code>target</code> as the context Element for resolving Feature names and testing classification. The result is a collection of Elements, each of which must be a LiteralExpression or a Feature that is not an Expression.</p>
	 * isModelLevelEvaluable
	 * <!-- end-model-doc -->
	 * @model unique="false" targetRequired="true" targetOrdered="false"
	 * @generated
	 */
	EList<Element> evaluate(Element target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Model-level evaluate this Expression with the given <code>element</code> as its target. If the result is a LiteralBoolean, return its <code>value</code>. Otherwise return <code>false</code>.</p>
	 * 
	 * let results: Sequence(Element) = evaluate(target) in
	 *     result->size() = 1 and
	 *     results->at(1).oclIsKindOf(LiteralBoolean) and 
	 *     results->at(1).oclAsType(LiteralBoolean).value
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" targetRequired="true" targetOrdered="false"
	 * @generated
	 */
	boolean checkCondition(Element target);
} // Expression
