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
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl#getInvolvesFeature <em>Involves Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.BehaviorImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends ClassImpl implements Behavior {

	public String BEHAVIOR_SUPERCLASS_DEFAULT = "Base::BehaviorOccurrence";
	
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
	 * @generated NOT
	 */
	public EList<Step> getStep() {
		return new DerivedEObjectEList<Step>(Step.class, this, 
				SysMLPackage.BEHAVIOR__STEP, 
				new int[] {SysMLPackage.CATEGORY__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getInvolvesFeature() {
		if (involvesFeature == null) {
			involvesFeature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.BEHAVIOR__INVOLVES_FEATURE);
		}
		return involvesFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Parameter> getParameter() {
		return new DerivedEObjectEList<Parameter>(Parameter.class, this, 
				SysMLPackage.BEHAVIOR__PARAMETER, 
				new int[] {SysMLPackage.CATEGORY__FEATURE});
	}

	/**
	 * If the Behavior has no Superclassings, then create one whose superclass is the appropriate default library class.
	 */
	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(BEHAVIOR_SUPERCLASS_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.BEHAVIOR__STEP:
				return getStep();
			case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE:
				return getInvolvesFeature();
			case SysMLPackage.BEHAVIOR__PARAMETER:
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
			case SysMLPackage.BEHAVIOR__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE:
				getInvolvesFeature().clear();
				getInvolvesFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.BEHAVIOR__PARAMETER:
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
			case SysMLPackage.BEHAVIOR__STEP:
				getStep().clear();
				return;
			case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE:
				getInvolvesFeature().clear();
				return;
			case SysMLPackage.BEHAVIOR__PARAMETER:
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
			case SysMLPackage.BEHAVIOR__STEP:
				return !getStep().isEmpty();
			case SysMLPackage.BEHAVIOR__INVOLVES_FEATURE:
				return involvesFeature != null && !involvesFeature.isEmpty();
			case SysMLPackage.BEHAVIOR__PARAMETER:
				return !getParameter().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorImpl
