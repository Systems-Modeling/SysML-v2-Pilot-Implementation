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
 * <p>An <code>Expression</code> is a <code>Step</code> that is typed by a <code>Function</code>. An <code>Expression</code> that also has a <code>Function</code> as its <code>featuringType</code> is a computational step within that <code>Function</code>. An <code>Expression</code> always has a single <code>result</code> parameter, which redefines the <code>result</code> parameter of its defining <code>function</code>. This allows <code>Expressions</code> to be interconnected in tree structures, in which inputs to each <code>Expression</code> in the tree are determined as the results of other <code>Expression</code> in the tree.</p>
 * 
 * isModelLevelEvaluable = modelLevelEvaluable(Set(Element){})
 * specializesFromLibrary('Performances::evaluations')
 * owningMembership <> null and 
 * owningMembership.oclIsKindOf(FeatureValue) implies
 *     let featureWithValue : Feature = 
 *         owningMembership.oclAsType(FeatureValue).featureWithValue in
 *     featuringType = featureWithValue.featuringType
 * ownedMembership.selectByKind(ResultExpressionMembership)->
 *     forAll(mem | ownedFeature.selectByKind(BindingConnector)->
 *         exists(binding |
 *             binding.relatedFeature->includes(result) and
 *             binding.relatedFeature->includes(mem.ownedResultExpression.result)))
 * result =
 *     let resultParams : Sequence(Feature) =
 *         ownedFeatureMemberships->
 *             selectByKind(ReturnParameterMembership).
 *             ownedParameterMember in
 *     if resultParams->notEmpty() then resultParams->first()
 *     else if function <> null then function.result
 *     else null
 *     endif endif
 * ownedFeatureMembership->
 *     selectByKind(ReturnParameterMembership)->
 *     size() <= 1
 * membership->selectByKind(ResultExpressionMembership)->size() <= 1
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
	 * <p>The <code>Function</code> that types this <code>Expression</code>.</p>
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getParameter() <em>Parameter</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOutput() <em>Output</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><p>An <code>output</code> <code>parameter</code> of the <code>Expression</code> whose value is the result of the <code>Expression</code>. The result of an <code>Expression</code> is either inherited from its <code>function</code> or it is related to the <code>Expression</code> via a <code>ReturnParameterMembership</code>, in which case it redefines the <code>result</code> <code>parameter</code> of its <code>function</code>.</p>
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
	 * <p>Whether this <code>Expression</code> meets the constraints necessary to be evaluated at <em>model level</em>, that is, using metadata within the model.</p>
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
	 * <p>Return whether this <code>Expression</code> is model-level evaluable. The <code>visited</code> parameter is used to track possible circular <code>Feature</code> references made from <code>FeatureReferenceExpressions</code> (see the redefinition of this operation for <code>FeatureReferenceExpression</code>). Such circular references are not allowed in model-level evaluable expressions.</p>
	 * 
	 * <p>An <code>Expression</code> that is not otherwise specialized is model-level evaluable if it has no (non-implied) <code>ownedSpecializations</code> and all its <code>ownedFeatures</code> are either <code>in</code> parameters, the <code>result</code> <code>parameter</code> or a result <code>Expression</code> owned via a <code>ResultExpressionMembership</code>. The <code>parameters</code>  must not have any <code>ownedFeatures</code> or a <code>FeatureValue</code>, and the result <code>Expression</code> must be model-level evaluable.</p>
	 * ownedSpecialization->forAll(isImplied) and 
	 * ownedFeature->forAll(f |
	 *     (directionOf(f) = FeatureDirectionKind::_'in' or f = result) and
	 *         f.ownedFeature->isEmpty() and f.valuation = null or
	 *     f.owningFeatureMembership.oclIsKindOf(ResultExpressionMembership) and
	 *         f.oclAsType(Expression).modelLevelEvaluable(visited)
	 *     
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" visitedMany="true" visitedOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean modelLevelEvaluable(EList<Feature> visited);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If this <code>Expression</code> <code>isModelLevelEvaluable</code>, then evaluate it using the <code>target</code> as the context <code>Element</code> for resolving <code>Feature</code> names and testing classification. The result is a collection of <code>Elements</code>, which, for a fully evaluable <code>Expression</code>, will be a <code>LiteralExpression</code> or a <code>Feature</code> that is not an <code>Expression</code>.</p>
	 * isModelLevelEvaluable
	 * let resultExprs : Sequence(Expression) =
	 *     ownedFeatureMembership->
	 *         selectByKind(ResultExpressionMembership).
	 *         ownedResultExpression in
	 * if resultExpr->isEmpty() then Sequence{}
	 * else resultExprs->first().evaluate(target)
	 * endif
	 * <!-- end-model-doc -->
	 * @model unique="false" targetRequired="true" targetOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Element> evaluate(Element target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Model-level evaluate this <code>Expression</code> with the given <code>target</code>. If the result is a <code>LiteralBoolean</code>, return its <code>value</code>. Otherwise return <code>false</code>.</p>
	 * 
	 * let results: Sequence(Element) = evaluate(target) in
	 *     result->size() = 1 and
	 *     results->first().oclIsKindOf(LiteralBoolean) and 
	 *     results->first().oclAsType(LiteralBoolean).value
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" targetRequired="true" targetOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean checkCondition(Element target);
} // Expression
