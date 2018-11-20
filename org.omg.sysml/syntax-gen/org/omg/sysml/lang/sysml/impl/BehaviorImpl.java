/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl#getTakesStep <em>Takes Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl#getInvolvesFeature <em>Involves Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends ClassImpl implements Behavior {
	/**
	 * The cached value of the '{@link #getTakesStep() <em>Takes Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakesStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> takesStep;
	/**
	 * The cached value of the '{@link #getInvolvesFeature() <em>Involves Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvesFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> involvesFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getTakesStep() {
		if (takesStep == null) {
			takesStep = new EObjectResolvingEList<Step>(Step.class, this, SysMLPackage.BEHAVIOR__TAKES_STEP);
		}
		return takesStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getInvolvesFeature() {
		if (involvesFeature == null) {
			involvesFeature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.BEHAVIOR__INVOLVES_FEATURE);
		}
		return involvesFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.BEHAVIOR__TAKES_STEP:
				return getTakesStep();
			case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE:
				return getInvolvesFeature();
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
			case SysMLPackage.BEHAVIOR__TAKES_STEP:
				getTakesStep().clear();
				getTakesStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE:
				getInvolvesFeature().clear();
				getInvolvesFeature().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.BEHAVIOR__TAKES_STEP:
				getTakesStep().clear();
				return;
			case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE:
				getInvolvesFeature().clear();
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
			case SysMLPackage.BEHAVIOR__TAKES_STEP:
				return takesStep != null && !takesStep.isEmpty();
			case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE:
				return involvesFeature != null && !involvesFeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorImpl
