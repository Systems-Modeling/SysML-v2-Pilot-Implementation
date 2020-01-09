/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;

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
	public static final String SUCCESSION_SUBSETTING_OUTGOING_DEFAULT = "ControlPerformances::DecisionPerformance::outgoingHBLink";
	public static final String SUCCESSION_SUBSETTING_INCOMING_DEFAULT = "ControlPerformances::MergePerformance::incomingHBLink";

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
		return new BasicInternalEList<Step>(Step.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Step> getEffectStep() {
		return new BasicInternalEList<Step>(Step.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getGuardExpression() {
		return new BasicInternalEList<Expression>(Expression.class);
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
		return null;
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
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(
//				isDecisionOutgoing()?
//						SUCCESSION_SUBSETTING_OUTGOING_DEFAULT:
//				isMergeIncoming()?
//						SUCCESSION_SUBSETTING_INCOMING_DEFAULT :
						SUCCESSION_SUBSETTING_BASE_DEFAULT);
	}
	
//	public boolean isDecisionOutgoing() {
//		EList<Feature> relatedFeatures = getRelatedFeature();
//		return !relatedFeatures.isEmpty() && ((FeatureImpl)relatedFeatures.get(0)).isDecisionFeature();
//	}
//
//	public boolean isMergeIncoming() {
//		EList<Feature> relatedFeatures = getRelatedFeature();
//		return relatedFeatures.size() > 1 && ((FeatureImpl)relatedFeatures.get(1)).isMergeFeature();
//	}

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
