/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AnalysisCaseDefinition;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Case Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnalysisCaseDefinitionImpl#getAnalysisAction <em>Analysis Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnalysisCaseDefinitionImpl#getResultExpression <em>Result Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisCaseDefinitionImpl extends CaseDefinitionImpl implements AnalysisCaseDefinition {
	
	/**
	 * The cached setting delegate for the '{@link #getAnalysisAction() <em>Analysis Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ANALYSIS_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getResultExpression() <em>Result Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultExpression()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RESULT_EXPRESSION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisCaseDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANALYSIS_CASE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActionUsage> getAnalysisAction() {
		return (EList<ActionUsage>)ANALYSIS_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getResultExpression() {
		return (Expression)RESULT_EXPRESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetResultExpression() {
		return (Expression)RESULT_EXPRESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultExpression(Expression newResultExpression) {
		RESULT_EXPRESSION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newResultExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION:
				return getAnalysisAction();
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION:
				if (resolve) return getResultExpression();
				return basicGetResultExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION:
				getAnalysisAction().clear();
				getAnalysisAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION:
				setResultExpression((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION:
				getAnalysisAction().clear();
				return;
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION:
				setResultExpression((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__ANALYSIS_ACTION:
				return ANALYSIS_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ANALYSIS_CASE_DEFINITION__RESULT_EXPRESSION:
				return RESULT_EXPRESSION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //AnalysisCaseDefinitionImpl
