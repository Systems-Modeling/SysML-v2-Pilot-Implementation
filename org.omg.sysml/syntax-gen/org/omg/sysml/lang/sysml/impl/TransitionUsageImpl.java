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
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.UsageUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getTriggerAction <em>Trigger Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getEffectAction <em>Effect Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getSuccession <em>Succession</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionUsageImpl extends ActionUsageImpl implements TransitionUsage {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TRANSITION_USAGE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getSource() {
		ActionUsage source = basicGetSource();
		return source != null && source.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)source) : source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionUsage basicGetSource() {
		EList<Feature> relatedFeatures = getSuccession().getRelatedFeature();
		if (relatedFeatures.isEmpty()) {
			return null;
		} else {
			Feature source = relatedFeatures.get(0);
			return source instanceof ActionUsage? (ActionUsage)source: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSource(ActionUsage newSource) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getTarget() {
		ActionUsage target = basicGetTarget();
		return target != null && target.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionUsage basicGetTarget() {
		EList<Feature> relatedFeatures = getSuccession().getRelatedFeature();
		if (relatedFeatures.size() < 2) {
			return null;
		} else {
			Feature target = relatedFeatures.get(1);
			return target instanceof ActionUsage? (ActionUsage)target: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTarget(ActionUsage newTarget) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<AcceptActionUsage> getTriggerAction() {
		EList<AcceptActionUsage> triggerActions = 
				new NonNotifyingEObjectEList<>(AcceptActionUsage.class, this, SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION);
		UsageUtil.getTransitionFeaturesOf(this, TransitionFeatureKind.TRIGGER).
			filter(feature->feature instanceof AcceptActionUsage).
			map(feature->(AcceptActionUsage)feature).
			forEachOrdered(triggerActions::add);
		return triggerActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getGuardExpression() {
		EList<Expression> guardExpressions = 
				new NonNotifyingEObjectEList<>(Expression.class, this, SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION);
		UsageUtil.getTransitionFeaturesOf(this, TransitionFeatureKind.GUARD).
			filter(feature->feature instanceof Expression).
			map(feature->(Expression)feature).
			forEachOrdered(guardExpressions::add);
		return guardExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ActionUsage> getEffectAction() {
		EList<ActionUsage> effectActions = 
				new NonNotifyingEObjectEList<>(ActionUsage.class, this, SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION);
		UsageUtil.getTransitionFeaturesOf(this, TransitionFeatureKind.EFFECT).
			filter(feature->feature instanceof ActionUsage).
			map(feature->(ActionUsage)feature).
			forEachOrdered(effectActions::add);
		return effectActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Succession getSuccession() {
		Succession succession = basicGetSuccession();
		return succession != null && succession.eIsProxy() ? (Succession)eResolveProxy((InternalEObject)succession) : succession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Succession basicGetSuccession() {
		return (Succession)getOwnedMember().stream().
				filter(feature->feature instanceof Succession).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSuccession(Succession newSuccession) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				return getTriggerAction();
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				return getGuardExpression();
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				return getEffectAction();
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				if (resolve) return getSuccession();
				return basicGetSuccession();
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
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				setSource((ActionUsage)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				setTarget((ActionUsage)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				getTriggerAction().clear();
				getTriggerAction().addAll((Collection<? extends AcceptActionUsage>)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				getGuardExpression().clear();
				getGuardExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				getEffectAction().clear();
				getEffectAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				setSuccession((Succession)newValue);
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
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				setSource((ActionUsage)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				setTarget((ActionUsage)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				getTriggerAction().clear();
				return;
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				getGuardExpression().clear();
				return;
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				getEffectAction().clear();
				return;
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				setSuccession((Succession)null);
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
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				return basicGetSource() != null;
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				return basicGetTarget() != null;
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				return !getTriggerAction().isEmpty();
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				return !getGuardExpression().isEmpty();
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				return !getEffectAction().isEmpty();
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				return basicGetSuccession() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionStepImpl
