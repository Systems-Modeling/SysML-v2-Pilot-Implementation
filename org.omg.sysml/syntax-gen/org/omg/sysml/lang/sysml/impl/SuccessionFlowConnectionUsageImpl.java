/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SuccessionFlowConnectionUsage;
import org.omg.sysml.lang.sysml.SuccessionItemFlow;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Succession Flow Connection Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionFlowConnectionUsageImpl#getTransitionStep <em>Transition Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionFlowConnectionUsageImpl#getTriggerStep <em>Trigger Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionFlowConnectionUsageImpl#getEffectStep <em>Effect Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SuccessionFlowConnectionUsageImpl#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccessionFlowConnectionUsageImpl extends FlowConnectionUsageImpl implements SuccessionFlowConnectionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccessionFlowConnectionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUCCESSION_FLOW_CONNECTION_USAGE;
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
	 * @generated
	 */
	public Step basicGetTransitionStep() {
		// TODO: implement this method to return the 'Transition Step' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitionStep(Step newTransitionStep) {
		// TODO: implement this method to set the 'Transition Step' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getTriggerStep() {
		// TODO: implement this method to return the 'Trigger Step' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getEffectStep() {
		// TODO: implement this method to return the 'Effect Step' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getGuardExpression() {
		// TODO: implement this method to return the 'Guard Expression' reference list
		// Ensure that you remove @generated or mark it @generated NOT
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
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRANSITION_STEP:
				if (resolve) return getTransitionStep();
				return basicGetTransitionStep();
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRIGGER_STEP:
				return getTriggerStep();
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__EFFECT_STEP:
				return getEffectStep();
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRANSITION_STEP:
				setTransitionStep((Step)newValue);
				return;
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRIGGER_STEP:
				getTriggerStep().clear();
				getTriggerStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__EFFECT_STEP:
				getEffectStep().clear();
				getEffectStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRANSITION_STEP:
				setTransitionStep((Step)null);
				return;
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRIGGER_STEP:
				getTriggerStep().clear();
				return;
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__EFFECT_STEP:
				getEffectStep().clear();
				return;
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__GUARD_EXPRESSION:
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
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRANSITION_STEP:
				return basicGetTransitionStep() != null;
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRIGGER_STEP:
				return !getTriggerStep().isEmpty();
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__EFFECT_STEP:
				return !getEffectStep().isEmpty();
			case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__GUARD_EXPRESSION:
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
				case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRANSITION_STEP: return SysMLPackage.SUCCESSION__TRANSITION_STEP;
				case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRIGGER_STEP: return SysMLPackage.SUCCESSION__TRIGGER_STEP;
				case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__EFFECT_STEP: return SysMLPackage.SUCCESSION__EFFECT_STEP;
				case SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__GUARD_EXPRESSION: return SysMLPackage.SUCCESSION__GUARD_EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == SuccessionItemFlow.class) {
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
		if (baseClass == Succession.class) {
			switch (baseFeatureID) {
				case SysMLPackage.SUCCESSION__TRANSITION_STEP: return SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRANSITION_STEP;
				case SysMLPackage.SUCCESSION__TRIGGER_STEP: return SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__TRIGGER_STEP;
				case SysMLPackage.SUCCESSION__EFFECT_STEP: return SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__EFFECT_STEP;
				case SysMLPackage.SUCCESSION__GUARD_EXPRESSION: return SysMLPackage.SUCCESSION_FLOW_CONNECTION_USAGE__GUARD_EXPRESSION;
				default: return -1;
			}
		}
		if (baseClass == SuccessionItemFlow.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SuccessionFlowConnectionUsageImpl
