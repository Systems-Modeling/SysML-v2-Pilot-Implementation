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
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.ConstraintDefinition;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#isModelLevelEvaluable <em>Is Model Level Evaluable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintDefinitionImpl extends OccurrenceDefinitionImpl implements ConstraintDefinition {
	
	/**
	 * The cached setting delegate for the '{@link #getStep() <em>Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STEP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.BEHAVIOR__STEP).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.BEHAVIOR__PARAMETER).getSettingDelegate();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONSTRAINT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public EList<Feature> getParameter() {
		return (EList<Feature>)PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameter() {
		return !getParameter().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public EList<Step> getStep() {
		return (EList<Step>)STEP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getDirectedFeature() {
		return getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectedFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONSTRAINT_DEFINITION__STEP:
				return getStep();
			case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER:
				return getParameter();
			case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION:
				return getExpression();
			case SysMLPackage.CONSTRAINT_DEFINITION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				return isModelLevelEvaluable();
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
			case SysMLPackage.CONSTRAINT_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__RESULT:
				setResult((Feature)newValue);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				setIsModelLevelEvaluable((Boolean)newValue);
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
			case SysMLPackage.CONSTRAINT_DEFINITION__STEP:
				getStep().clear();
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION:
				getExpression().clear();
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__RESULT:
				setResult((Feature)null);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case SysMLPackage.CONSTRAINT_DEFINITION__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.CONSTRAINT_DEFINITION__STEP:
				return STEP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER:
				return isSetParameter();
			case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION:
				return EXPRESSION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CONSTRAINT_DEFINITION__RESULT:
				return RESULT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				return IS_MODEL_LEVEL_EVALUABLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_DEFINITION__STEP: return SysMLPackage.BEHAVIOR__STEP;
				case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER: return SysMLPackage.BEHAVIOR__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == Function.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION: return SysMLPackage.FUNCTION__EXPRESSION;
				case SysMLPackage.CONSTRAINT_DEFINITION__RESULT: return SysMLPackage.FUNCTION__RESULT;
				case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE: return SysMLPackage.FUNCTION__IS_MODEL_LEVEL_EVALUABLE;
				default: return -1;
			}
		}
		if (baseClass == Predicate.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case SysMLPackage.BEHAVIOR__STEP: return SysMLPackage.CONSTRAINT_DEFINITION__STEP;
				case SysMLPackage.BEHAVIOR__PARAMETER: return SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == Function.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FUNCTION__EXPRESSION: return SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION;
				case SysMLPackage.FUNCTION__RESULT: return SysMLPackage.CONSTRAINT_DEFINITION__RESULT;
				case SysMLPackage.FUNCTION__IS_MODEL_LEVEL_EVALUABLE: return SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE;
				default: return -1;
			}
		}
		if (baseClass == Predicate.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConstraintDefinitionImpl
