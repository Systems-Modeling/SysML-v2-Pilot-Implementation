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
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionAsUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Succession As Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionAsUsageImpl#getTransitionStep <em>Transition Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionAsUsageImpl#getTriggerStep <em>Trigger Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionAsUsageImpl#getEffectStep <em>Effect Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionAsUsageImpl#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccessionAsUsageImpl extends ConnectorAsUsageImpl implements SuccessionAsUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessionAsUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUCCESSION_AS_USAGE;
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
		Namespace owner = getOwningNamespace();
		return owner instanceof TransitionUsage?
				(Step)owner: null;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Step> getTriggerStep() {
		EList<Step> triggerSteps = new NonNotifyingEObjectEList<>(Step.class, this, SysMLPackage.SUCCESSION_AS_USAGE__TRIGGER_STEP);
		Step transitionStep = getTransitionStep();
		if (transitionStep instanceof TransitionUsage) {
			EList<AcceptActionUsage> triggers = ((TransitionUsageImpl)transitionStep).getTriggerAction();
			triggerSteps.addAll(triggers);
		}
		return triggerSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Step> getEffectStep() {
		EList<Step> effectSteps = new NonNotifyingEObjectEList<>(Step.class, this, SysMLPackage.SUCCESSION_AS_USAGE__EFFECT_STEP);
		Step transitionStep = getTransitionStep();
		if (transitionStep instanceof TransitionUsage) {
			EList<ActionUsage> effects = ((TransitionUsageImpl)transitionStep).getEffectAction();
			effectSteps.addAll(effects);
		}
		return effectSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getGuardExpression() {
		EList<Expression> guardExpressions = new NonNotifyingEObjectEList<>(Expression.class, this, SysMLPackage.SUCCESSION__GUARD_EXPRESSION);
		Step transitionStep = getTransitionStep();
		if (transitionStep instanceof TransitionUsage) {
			EList<Expression> guards = ((TransitionUsageImpl)transitionStep).getGuardExpression();
			guardExpressions.addAll(guards);
		}
		return guardExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SUCCESSION_AS_USAGE__TRANSITION_STEP:
				if (resolve) return getTransitionStep();
				return basicGetTransitionStep();
			case SysMLPackage.SUCCESSION_AS_USAGE__TRIGGER_STEP:
				return getTriggerStep();
			case SysMLPackage.SUCCESSION_AS_USAGE__EFFECT_STEP:
				return getEffectStep();
			case SysMLPackage.SUCCESSION_AS_USAGE__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION_AS_USAGE__TRANSITION_STEP:
				setTransitionStep((Step)newValue);
				return;
			case SysMLPackage.SUCCESSION_AS_USAGE__TRIGGER_STEP:
				getTriggerStep().clear();
				getTriggerStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.SUCCESSION_AS_USAGE__EFFECT_STEP:
				getEffectStep().clear();
				getEffectStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.SUCCESSION_AS_USAGE__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION_AS_USAGE__TRANSITION_STEP:
				setTransitionStep((Step)null);
				return;
			case SysMLPackage.SUCCESSION_AS_USAGE__TRIGGER_STEP:
				getTriggerStep().clear();
				return;
			case SysMLPackage.SUCCESSION_AS_USAGE__EFFECT_STEP:
				getEffectStep().clear();
				return;
			case SysMLPackage.SUCCESSION_AS_USAGE__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION_AS_USAGE__TRANSITION_STEP:
				return basicGetTransitionStep() != null;
			case SysMLPackage.SUCCESSION_AS_USAGE__TRIGGER_STEP:
				return !getTriggerStep().isEmpty();
			case SysMLPackage.SUCCESSION_AS_USAGE__EFFECT_STEP:
				return !getEffectStep().isEmpty();
			case SysMLPackage.SUCCESSION_AS_USAGE__GUARD_EXPRESSION:
				return !getGuardExpression().isEmpty();
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
				case SysMLPackage.SUCCESSION_AS_USAGE__TRANSITION_STEP: return SysMLPackage.SUCCESSION__TRANSITION_STEP;
				case SysMLPackage.SUCCESSION_AS_USAGE__TRIGGER_STEP: return SysMLPackage.SUCCESSION__TRIGGER_STEP;
				case SysMLPackage.SUCCESSION_AS_USAGE__EFFECT_STEP: return SysMLPackage.SUCCESSION__EFFECT_STEP;
				case SysMLPackage.SUCCESSION_AS_USAGE__GUARD_EXPRESSION: return SysMLPackage.SUCCESSION__GUARD_EXPRESSION;
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
				case SysMLPackage.SUCCESSION__TRANSITION_STEP: return SysMLPackage.SUCCESSION_AS_USAGE__TRANSITION_STEP;
				case SysMLPackage.SUCCESSION__TRIGGER_STEP: return SysMLPackage.SUCCESSION_AS_USAGE__TRIGGER_STEP;
				case SysMLPackage.SUCCESSION__EFFECT_STEP: return SysMLPackage.SUCCESSION_AS_USAGE__EFFECT_STEP;
				case SysMLPackage.SUCCESSION__GUARD_EXPRESSION: return SysMLPackage.SUCCESSION_AS_USAGE__GUARD_EXPRESSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SuccessionAsUsageImpl
