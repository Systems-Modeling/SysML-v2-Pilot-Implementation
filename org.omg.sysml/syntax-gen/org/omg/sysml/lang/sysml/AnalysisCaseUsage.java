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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Case Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AnalysisCaseUsage</code> is a <code>Usage</code> of an <code>AnalysisCaseDefinition</code>.</p>
 * analysisAction = usage->select(
 *     isComposite and
 *     specializes('AnalysisCases::AnalysisAction'))
 * resultExpression =
 *     let results : OrderedSet(ResultExpressionMembership) =
 *         featureMembersip->
 *             selectByKind(ResultExpressionMembership) in
 *     if results->isEmpty() then null
 *     else results->first().ownedResultExpression
 *     endif
 * specializesFromLibrary('AnalysisCases::analysisCases')
 * isComposite and owningType <> null and
 *     (owningType.oclIsKindOf(AnalysisCaseDefinition) or
 *      owningType.oclIsKindOf(AnalysisCaseUsage)) implies
 *     specializesFromLibrary('AnalysisCases::AnalysisCase::subAnalysisCases')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AnalysisCaseUsage#getAnalysisAction <em>Analysis Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AnalysisCaseUsage#getAnalysisCaseDefinition <em>Analysis Case Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AnalysisCaseUsage#getResultExpression <em>Result Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseUsage()
 * @model
 * @generated
 */
public interface AnalysisCaseUsage extends CaseUsage {
	/**
	 * Returns the value of the '<em><b>Analysis Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The composite <code>usages</code> of the <code>AnalysisCaseUsage</code> that are defined as <code>AnalysisActions</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseUsage_AnalysisAction()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringAnalysisCase'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ActionUsage> getAnalysisAction();

	/**
	 * Returns the value of the '<em><b>Analysis Case Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.CaseUsage#getCaseDefinition() <em>Case Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AnalysisCaseDefinition</code> that is the <code>definition</code> of this <code>AnalysisCaseUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Case Definition</em>' reference.
	 * @see #setAnalysisCaseDefinition(AnalysisCaseDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseUsage_AnalysisCaseDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAnalysisCase'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	AnalysisCaseDefinition getAnalysisCaseDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AnalysisCaseUsage#getAnalysisCaseDefinition <em>Analysis Case Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Case Definition</em>' reference.
	 * @see #getAnalysisCaseDefinition()
	 * @generated
	 */
	void setAnalysisCaseDefinition(AnalysisCaseDefinition value);

	/**
	 * Returns the value of the '<em><b>Result Expression</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An <code>Expression</code> used to compute the <code>result</code> of the <code>AnalysisCaseUsage</code>, owned via a <code>ResultExpressionMembership</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Expression</em>' reference.
	 * @see #setResultExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseUsage_ResultExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='analysisCase'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getResultExpression();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AnalysisCaseUsage#getResultExpression <em>Result Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Expression</em>' reference.
	 * @see #getResultExpression()
	 * @generated
	 */
	void setResultExpression(Expression value);

} // AnalysisCaseUsage
