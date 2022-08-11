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
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.CalculationDefinition;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CalculationDefinitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CalculationDefinitionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CalculationDefinitionImpl#isModelLevelEvaluable <em>Is Model Level Evaluable</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CalculationDefinitionImpl#getCalculation <em>Calculation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculationDefinitionImpl extends ActionDefinitionImpl implements CalculationDefinition {

	/**
	 * The cached setting delegate for the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EXPRESSION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FUNCTION__EXPRESSION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RESULT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FUNCTION__RESULT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isModelLevelEvaluable() <em>Is Model Level Evaluable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelLevelEvaluable()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FUNCTION__IS_MODEL_LEVEL_EVALUABLE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCalculation() <em>Calculation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CALCULATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CALCULATION_DEFINITION__CALCULATION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CALCULATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getExpression() {
		return (EList<Expression>)EXPRESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getResult() {
		return (Feature)RESULT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetResult() {
		return (Feature)RESULT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(Feature newResult) {
		RESULT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isModelLevelEvaluable() {
		return (Boolean)IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsModelLevelEvaluable(boolean newIsModelLevelEvaluable) {
		IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsModelLevelEvaluable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CalculationUsage> getCalculation() {
		return (EList<CalculationUsage>)CALCULATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CALCULATION_DEFINITION__EXPRESSION:
				return getExpression();
			case SysMLPackage.CALCULATION_DEFINITION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.CALCULATION_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				return isModelLevelEvaluable();
			case SysMLPackage.CALCULATION_DEFINITION__CALCULATION:
				return getCalculation();
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
			case SysMLPackage.CALCULATION_DEFINITION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.CALCULATION_DEFINITION__RESULT:
				setResult((Feature)newValue);
				return;
			case SysMLPackage.CALCULATION_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				setIsModelLevelEvaluable((Boolean)newValue);
				return;
			case SysMLPackage.CALCULATION_DEFINITION__CALCULATION:
				getCalculation().clear();
				getCalculation().addAll((Collection<? extends CalculationUsage>)newValue);
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
			case SysMLPackage.CALCULATION_DEFINITION__EXPRESSION:
				getExpression().clear();
				return;
			case SysMLPackage.CALCULATION_DEFINITION__RESULT:
				setResult((Feature)null);
				return;
			case SysMLPackage.CALCULATION_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.CALCULATION_DEFINITION__CALCULATION:
				getCalculation().clear();
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
			case SysMLPackage.CALCULATION_DEFINITION__EXPRESSION:
				return EXPRESSION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CALCULATION_DEFINITION__RESULT:
				return RESULT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CALCULATION_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				return IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CALCULATION_DEFINITION__CALCULATION:
				return CALCULATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Function.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CALCULATION_DEFINITION__EXPRESSION: return SysMLPackage.FUNCTION__EXPRESSION;
				case SysMLPackage.CALCULATION_DEFINITION__RESULT: return SysMLPackage.FUNCTION__RESULT;
				case SysMLPackage.CALCULATION_DEFINITION__IS_MODEL_LEVEL_EVALUABLE: return SysMLPackage.FUNCTION__IS_MODEL_LEVEL_EVALUABLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Function.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FUNCTION__EXPRESSION: return SysMLPackage.CALCULATION_DEFINITION__EXPRESSION;
				case SysMLPackage.FUNCTION__RESULT: return SysMLPackage.CALCULATION_DEFINITION__RESULT;
				case SysMLPackage.FUNCTION__IS_MODEL_LEVEL_EVALUABLE: return SysMLPackage.CALCULATION_DEFINITION__IS_MODEL_LEVEL_EVALUABLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CalculationDefinitionImpl
