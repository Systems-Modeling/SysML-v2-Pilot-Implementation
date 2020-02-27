/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.Succession;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getTriggerAction <em>Trigger Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getEffectAction <em>Effect Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getSuccession <em>Succession</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TransitionUsageImpl#getTransitionOwningUsage <em>Transition Owning Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionUsageImpl extends UsageImpl implements TransitionUsage {
	
	public static final String TRANSITION_USAGE_SUBSETTING_DEFAULT = "States::transitions";
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
	 * @generated NOT
	 */
	@Override
	public EList<Behavior> getBehavior() {
		EList<Behavior> behaviors = new EObjectEList<Behavior>(Behavior.class, this, SysMLPackage.STEP__BEHAVIOR);
		super.getType().stream().
			filter(type->type instanceof Behavior).
			map(type->(Behavior)type).
			forEachOrdered(behaviors::add);
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
		return !getBehavior().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getSource() {
		Step source = basicGetSource();
		return source != null && source.eIsProxy() ? (Step)eResolveProxy((InternalEObject)source) : source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Step basicGetSource() {
		EList<Feature> relatedFeatures = getSuccession().getRelatedFeature();
		if (relatedFeatures.isEmpty()) {
			return null;
		} else {
			Feature source = relatedFeatures.get(0);
			return source instanceof Step? (Step)source: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSource(Step newSource) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getTarget() {
		Step target = basicGetTarget();
		return target != null && target.eIsProxy() ? (Step)eResolveProxy((InternalEObject)target) : target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Step basicGetTarget() {
		EList<Feature> relatedFeatures = getSuccession().getRelatedFeature();
		if (relatedFeatures.size() < 2) {
			return null;
		} else {
			Feature target = relatedFeatures.get(1);
			return target instanceof Step? (Step)target: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTarget(Step newTarget) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getTransitionOwningUsage() {
		Usage transitionOwningUsage = basicGetTransitionOwningUsage();
		return transitionOwningUsage != null && transitionOwningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)transitionOwningUsage) : transitionOwningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetTransitionOwningUsage() {
		return super.basicGetOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTransitionOwningUsage(Usage newTransitionOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> behavior = (EList<Type>)((EList<?>)getBehavior());
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwningUsage() {
		return getTransitionOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetOwningUsage() {
		return basicGetTransitionOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUsage(Usage newOwningUsage) {
		setTransitionOwningUsage(newOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningUsage() {
  		return false;
	}

	@Override
	public EList<Subsetting>  getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(TRANSITION_USAGE_SUBSETTING_DEFAULT);
	}

	public Feature getTransitionFeature(TransitionFeatureKind kind) {
		return getOwnedFeatureMembership().stream().
				filter(mem->(mem instanceof TransitionFeatureMembership) && ((TransitionFeatureMembership)mem).getKind() == kind).
				map(mem->mem.getMemberFeature()).
				filter(f->f != null).
				findAny().orElse(null);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcceptActionUsage getTriggerAction() {
		AcceptActionUsage triggerAction = basicGetTriggerAction();
		return triggerAction != null && triggerAction.eIsProxy() ? (AcceptActionUsage)eResolveProxy((InternalEObject)triggerAction) : triggerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AcceptActionUsage basicGetTriggerAction() {
		Feature feature = getTransitionFeature(TransitionFeatureKind.TRIGGER);
		return feature instanceof AcceptActionUsage? (AcceptActionUsage)feature: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setTriggerAction(AcceptActionUsage newTriggerAction) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getGuardExpression() {
		Expression guardExpression = basicGetGuardExpression();
		return guardExpression != null && guardExpression.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)guardExpression) : guardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetGuardExpression() {
		Feature feature = getTransitionFeature(TransitionFeatureKind.GUARD);
		return feature instanceof Expression? (Expression)feature: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGuardExpression(Expression newGuardExpression) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getEffectAction() {
		ActionUsage effectAction = basicGetEffectAction();
		return effectAction != null && effectAction.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)effectAction) : effectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionUsage basicGetEffectAction() {
		Feature feature = getTransitionFeature(TransitionFeatureKind.EFFECT);
		return feature instanceof ActionUsage? (ActionUsage)feature: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEffectAction(ActionUsage newEffectAction) {
		throw new UnsupportedOperationException();
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
		return (Succession)getOwnedFeature().stream().
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
	public boolean isSetTransitionOwningUsage() {
		return basicGetTransitionOwningUsage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.TRANSITION_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				if (resolve) return getTriggerAction();
				return basicGetTriggerAction();
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				if (resolve) return getGuardExpression();
				return basicGetGuardExpression();
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				if (resolve) return getEffectAction();
				return basicGetEffectAction();
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				if (resolve) return getSuccession();
				return basicGetSuccession();
			case SysMLPackage.TRANSITION_USAGE__TRANSITION_OWNING_USAGE:
				if (resolve) return getTransitionOwningUsage();
				return basicGetTransitionOwningUsage();
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
			case SysMLPackage.TRANSITION_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				setSource((Step)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				setTarget((Step)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				setTriggerAction((AcceptActionUsage)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				setGuardExpression((Expression)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				setEffectAction((ActionUsage)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				setSuccession((Succession)newValue);
				return;
			case SysMLPackage.TRANSITION_USAGE__TRANSITION_OWNING_USAGE:
				setTransitionOwningUsage((Usage)newValue);
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
			case SysMLPackage.TRANSITION_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				setSource((Step)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				setTarget((Step)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				setTriggerAction((AcceptActionUsage)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				setGuardExpression((Expression)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				setEffectAction((ActionUsage)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				setSuccession((Succession)null);
				return;
			case SysMLPackage.TRANSITION_USAGE__TRANSITION_OWNING_USAGE:
				setTransitionOwningUsage((Usage)null);
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
			case SysMLPackage.TRANSITION_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.TRANSITION_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.TRANSITION_USAGE__OWNING_USAGE:
				return isSetOwningUsage();
			case SysMLPackage.TRANSITION_USAGE__SOURCE:
				return basicGetSource() != null;
			case SysMLPackage.TRANSITION_USAGE__TARGET:
				return basicGetTarget() != null;
			case SysMLPackage.TRANSITION_USAGE__TRIGGER_ACTION:
				return basicGetTriggerAction() != null;
			case SysMLPackage.TRANSITION_USAGE__GUARD_EXPRESSION:
				return basicGetGuardExpression() != null;
			case SysMLPackage.TRANSITION_USAGE__EFFECT_ACTION:
				return basicGetEffectAction() != null;
			case SysMLPackage.TRANSITION_USAGE__SUCCESSION:
				return basicGetSuccession() != null;
			case SysMLPackage.TRANSITION_USAGE__TRANSITION_OWNING_USAGE:
				return isSetTransitionOwningUsage();
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
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.TRANSITION_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
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
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.TRANSITION_USAGE__BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TransitionStepImpl
