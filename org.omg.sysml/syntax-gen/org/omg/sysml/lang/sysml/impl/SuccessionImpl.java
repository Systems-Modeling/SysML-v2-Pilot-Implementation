/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Succession</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionImpl#getTransitionStep <em>Transition Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionImpl#getTriggerStep <em>Trigger Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionImpl#getEffectStep <em>Effect Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionImpl#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccessionImpl extends ConnectorImpl implements Succession {

	public static final String SUCCESSION_SUBSETTING_BASE_DEFAULT = "Occurrences::successions";
	public static final String TRANSITION_LINK_FEATURE = "TransitionPerformances::TransitionPerformance::transitionLink";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUCCESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Step> getTriggerStep() {
		Step transitionStep = getTransitionStep();
		if (transitionStep instanceof TransitionUsage) {
			EList<AcceptActionUsage> triggers = ((TransitionUsageImpl) transitionStep).getTriggerAction();
			int stepCount = triggers.size();
			return new UnmodifiableEList<>(this, SysMLPackage.Literals.SUCCESSION__TRIGGER_STEP, stepCount,
					triggers.toArray(new Step[stepCount]));
		} else {
			return new UnmodifiableEList<>(this, SysMLPackage.Literals.SUCCESSION__TRIGGER_STEP, 0, new Step[0]);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Step> getEffectStep() {
		Step transitionStep = getTransitionStep();
		if (transitionStep instanceof TransitionUsage) {
			EList<ActionUsage> effects = ((TransitionUsageImpl) transitionStep).getEffectAction();
			int effectsCount = effects.size();
			return new UnmodifiableEList<>(this, SysMLPackage.Literals.SUCCESSION__EFFECT_STEP, effectsCount,
					effects.toArray(new Step[effectsCount]));
		} else {
			return new UnmodifiableEList<>(this, SysMLPackage.Literals.SUCCESSION__EFFECT_STEP, 0, new Step[0]);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getGuardExpression() {
		Step transitionStep = getTransitionStep();
		if (transitionStep instanceof TransitionUsage) {
			EList<Expression> guards = ((TransitionUsageImpl) transitionStep).getGuardExpression();
			int guardsCount = guards.size();
			return new UnmodifiableEList<>(this, SysMLPackage.Literals.SUCCESSION__GUARD_EXPRESSION, guardsCount,
					guards.toArray(new Expression[guardsCount]));
		} else {
			return new UnmodifiableEList<>(this, SysMLPackage.Literals.SUCCESSION__GUARD_EXPRESSION, 0,
					new Expression[0]);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getTransitionStep() {
		Step transitionStep = basicGetTransitionStep();
		return transitionStep != null && transitionStep.eIsProxy() ? (Step)eResolveProxy((InternalEObject)transitionStep) : transitionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Step basicGetTransitionStep() {
		Type owningType = getOwningType();
		return owningType instanceof TransitionUsage?
				(Step)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTransitionStep(Step newTransitionStep) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected String getDefaultSupertype() {
		return SUCCESSION_SUBSETTING_BASE_DEFAULT;
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		Type owningType = getOwningType();
		return !(owningType instanceof TransitionUsage)? super.getRelevantFeatures(type):
			   type == owningType? Collections.singletonList(this):
			   Collections.singletonList((Feature)getDefaultType(TRANSITION_LINK_FEATURE));
	}
	
	@Override
	protected List<Type> getGeneralTypes(Type type) {
		Type owningType = getOwningType();
		return owningType instanceof TransitionUsage && type == owningType?
				Collections.singletonList(getDefaultType(TransitionUsageImpl.TRANSITION_USAGE_SUBSETTING_DEFAULT)):
				super.getGeneralTypes(type);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SUCCESSION__TRANSITION_STEP:
				if (resolve) return getTransitionStep();
				return basicGetTransitionStep();
			case SysMLPackage.SUCCESSION__TRIGGER_STEP:
				return getTriggerStep();
			case SysMLPackage.SUCCESSION__EFFECT_STEP:
				return getEffectStep();
			case SysMLPackage.SUCCESSION__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION__TRANSITION_STEP:
				setTransitionStep((Step)newValue);
				return;
			case SysMLPackage.SUCCESSION__TRIGGER_STEP:
				getTriggerStep().clear();
				getTriggerStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.SUCCESSION__EFFECT_STEP:
				getEffectStep().clear();
				getEffectStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.SUCCESSION__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION__TRANSITION_STEP:
				setTransitionStep((Step)null);
				return;
			case SysMLPackage.SUCCESSION__TRIGGER_STEP:
				getTriggerStep().clear();
				return;
			case SysMLPackage.SUCCESSION__EFFECT_STEP:
				getEffectStep().clear();
				return;
			case SysMLPackage.SUCCESSION__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION__TRANSITION_STEP:
				return basicGetTransitionStep() != null;
			case SysMLPackage.SUCCESSION__TRIGGER_STEP:
				return !getTriggerStep().isEmpty();
			case SysMLPackage.SUCCESSION__EFFECT_STEP:
				return !getEffectStep().isEmpty();
			case SysMLPackage.SUCCESSION__GUARD_EXPRESSION:
				return !getGuardExpression().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SuccessionImpl
