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
 * <p>An AnalysisCaseUsage is a Usage of an AnalysisCaseDefinition.</p>
 * 
 * <p>An AnalysisCaseUsage must subset, directly or indirectly, either the base AnalysisCaseUsage <code>analysisCases</code> from the Systems model library, if it is not owned by an AnalysisCaseDefinition or AnalysisCaseUsage, or the AnalysisCaseUsage <code>subAnalysisCases</code> inherited from its owner, otherwise.</p>
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>features</code> of the AnalysisCaseUsage that are typed as AnalysisActions. Each <code>analysisAction</code> ActionUsage must subset the <code<>analysisSteps</code> ActionUsage of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseUsage_AnalysisAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringAnalysisCase'"
	 *        annotation="subsets"
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
	 * <p>The AnalysisCaseDefinition that is the type of this AnalysisCaseUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Case Definition</em>' reference.
	 * @see #setAnalysisCaseDefinition(AnalysisCaseDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseUsage_AnalysisCaseDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAnalysisCase'"
	 *        annotation="redefines"
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
	 * <p>The Expression used to compute the <code>result</code> of the AnalysisCaseUsage, derived as the Expression own via a ResultExpressionMembership. The <code>resultExpression></code> must redefine directly or indirectly, the <code>resultEvaluation</code> Expression of the base AnalysisCaseDefinition AnalysisCase from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Expression</em>' reference.
	 * @see #setResultExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseUsage_ResultExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='analysisCase'"
	 *        annotation="subsets"
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
