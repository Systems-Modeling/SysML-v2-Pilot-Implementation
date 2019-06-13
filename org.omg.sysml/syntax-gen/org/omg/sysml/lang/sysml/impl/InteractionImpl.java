/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InteractionImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InteractionImpl#getInvolvesFeature <em>Involves Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InteractionImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends AssociationImpl implements Interaction {
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
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getStep() {
		// TODO: implement this method to return the 'Step' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getInvolvesFeature() {
		if (involvesFeature == null) {
			involvesFeature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.INTERACTION__INVOLVES_FEATURE);
		}
		return involvesFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Parameter> getParameter() {
		return new DerivedEObjectEList<Parameter>(
				Parameter.class, this, SysMLPackage.INTERACTION__PARAMETER, 
				new int[]{SysMLPackage.CATEGORY__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INTERACTION__STEP:
				return getStep();
			case SysMLPackage.INTERACTION__INVOLVES_FEATURE:
				return getInvolvesFeature();
			case SysMLPackage.INTERACTION__PARAMETER:
				return getParameter();
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
			case SysMLPackage.INTERACTION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.INTERACTION__INVOLVES_FEATURE:
				getInvolvesFeature().clear();
				getInvolvesFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.INTERACTION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
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
			case SysMLPackage.INTERACTION__STEP:
				getStep().clear();
				return;
			case SysMLPackage.INTERACTION__INVOLVES_FEATURE:
				getInvolvesFeature().clear();
				return;
			case SysMLPackage.INTERACTION__PARAMETER:
				getParameter().clear();
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
			case SysMLPackage.INTERACTION__STEP:
				return !getStep().isEmpty();
			case SysMLPackage.INTERACTION__INVOLVES_FEATURE:
				return involvesFeature != null && !involvesFeature.isEmpty();
			case SysMLPackage.INTERACTION__PARAMETER:
				return !getParameter().isEmpty();
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
				case SysMLPackage.INTERACTION__STEP: return SysMLPackage.BEHAVIOR__STEP;
				case SysMLPackage.INTERACTION__INVOLVES_FEATURE: return SysMLPackage.BEHAVIOR__INVOLVES_FEATURE;
				case SysMLPackage.INTERACTION__PARAMETER: return SysMLPackage.BEHAVIOR__PARAMETER;
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
				case SysMLPackage.BEHAVIOR__STEP: return SysMLPackage.INTERACTION__STEP;
				case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE: return SysMLPackage.INTERACTION__INVOLVES_FEATURE;
				case SysMLPackage.BEHAVIOR__PARAMETER: return SysMLPackage.INTERACTION__PARAMETER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InteractionImpl
