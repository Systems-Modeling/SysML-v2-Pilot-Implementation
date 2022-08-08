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
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Succession Item Flow</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl#getTransitionStep <em>Transition Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl#getTriggerStep <em>Trigger Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl#getEffectStep <em>Effect Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionItemFlowImpl#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccessionItemFlowImpl extends ItemFlowImpl implements SuccessionItemFlow {

	/**
	 * The cached setting delegate for the '{@link #getTransitionStep() <em>Transition Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionStep()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TRANSITION_STEP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SUCCESSION__TRANSITION_STEP).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getTriggerStep() <em>Trigger Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerStep()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TRIGGER_STEP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SUCCESSION__TRIGGER_STEP).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getEffectStep() <em>Effect Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectStep()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EFFECT_STEP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SUCCESSION__EFFECT_STEP).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getGuardExpression() <em>Guard Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardExpression()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate GUARD_EXPRESSION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SUCCESSION__GUARD_EXPRESSION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessionItemFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUCCESSION_ITEM_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Step> getTriggerStep() {
		return (EList<Step>)TRIGGER_STEP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Step> getEffectStep() {
		return (EList<Step>)EFFECT_STEP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getGuardExpression() {
		return (EList<Expression>)GUARD_EXPRESSION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getTransitionStep() {
		return (Step)TRANSITION_STEP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetTransitionStep() {
		return (Step)TRANSITION_STEP__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionStep(Step newTransitionStep) {
		TRANSITION_STEP__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTransitionStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TRANSITION_STEP:
				if (resolve) return getTransitionStep();
				return basicGetTransitionStep();
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TRIGGER_STEP:
				return getTriggerStep();
			case SysMLPackage.SUCCESSION_ITEM_FLOW__EFFECT_STEP:
				return getEffectStep();
			case SysMLPackage.SUCCESSION_ITEM_FLOW__GUARD_EXPRESSION:
				return getGuardExpression();
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
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TRANSITION_STEP:
				setTransitionStep((Step)newValue);
				return;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TRIGGER_STEP:
				getTriggerStep().clear();
				getTriggerStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__EFFECT_STEP:
				getEffectStep().clear();
				getEffectStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__GUARD_EXPRESSION:
				getGuardExpression().clear();
				getGuardExpression().addAll((Collection<? extends Expression>)newValue);
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
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TRANSITION_STEP:
				setTransitionStep((Step)null);
				return;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TRIGGER_STEP:
				getTriggerStep().clear();
				return;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__EFFECT_STEP:
				getEffectStep().clear();
				return;
			case SysMLPackage.SUCCESSION_ITEM_FLOW__GUARD_EXPRESSION:
				getGuardExpression().clear();
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
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TRANSITION_STEP:
				return TRANSITION_STEP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.SUCCESSION_ITEM_FLOW__TRIGGER_STEP:
				return TRIGGER_STEP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.SUCCESSION_ITEM_FLOW__EFFECT_STEP:
				return EFFECT_STEP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.SUCCESSION_ITEM_FLOW__GUARD_EXPRESSION:
				return GUARD_EXPRESSION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (baseClass == Succession.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.SUCCESSION_ITEM_FLOW__TRANSITION_STEP: return SysMLPackage.SUCCESSION__TRANSITION_STEP;
				case SysMLPackage.SUCCESSION_ITEM_FLOW__TRIGGER_STEP: return SysMLPackage.SUCCESSION__TRIGGER_STEP;
				case SysMLPackage.SUCCESSION_ITEM_FLOW__EFFECT_STEP: return SysMLPackage.SUCCESSION__EFFECT_STEP;
				case SysMLPackage.SUCCESSION_ITEM_FLOW__GUARD_EXPRESSION: return SysMLPackage.SUCCESSION__GUARD_EXPRESSION;
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
		if (baseClass == Succession.class) {
			switch (baseFeatureID) {
				case SysMLPackage.SUCCESSION__TRANSITION_STEP: return SysMLPackage.SUCCESSION_ITEM_FLOW__TRANSITION_STEP;
				case SysMLPackage.SUCCESSION__TRIGGER_STEP: return SysMLPackage.SUCCESSION_ITEM_FLOW__TRIGGER_STEP;
				case SysMLPackage.SUCCESSION__EFFECT_STEP: return SysMLPackage.SUCCESSION_ITEM_FLOW__EFFECT_STEP;
				case SysMLPackage.SUCCESSION__GUARD_EXPRESSION: return SysMLPackage.SUCCESSION_ITEM_FLOW__GUARD_EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // SuccessionItemFlowImpl
