/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Action;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionImpl#getActionOwningDefinition <em>Action Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionImpl#getActionOwningUsage <em>Action Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends UsageImpl implements Action {
	
	public static final String ACTION_SUBSETTING_BASE_DEFAULT = "Base::performances";
	public static final String ACTION_SUBSETTING_PERFORMANCE_DEFAULT = "Base::Performance::subperformances";
	public static final String ACTION_SUBSETTING_OBJECT_DEFAULT = "Base::Object::enactedPerformances";
	public static final String ACTION_SUBSETTING_TRANSFER_DEFAULT = "Base::Occurrence::incomingTransfers";
	
	protected boolean isCheckSubsetting = true;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getActionOwningDefinition() {
		Definition actionOwningDefinition = basicGetActionOwningDefinition();
		return actionOwningDefinition != null && actionOwningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)actionOwningDefinition) : actionOwningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetActionOwningDefinition() {
		return super.basicGetOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setActionOwningDefinition(Definition newActionOwningDefinition) {
		super.setOwningDefinition(newActionOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionOwningDefinition() {
		return basicGetActionOwningDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getActionOwningUsage() {
		Usage actionOwningUsage = basicGetActionOwningUsage();
		return actionOwningUsage != null && actionOwningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)actionOwningUsage) : actionOwningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetActionOwningUsage() {
		Type owningType = super.basicGetOwningType();
		return owningType instanceof Usage? (Usage)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setActionOwningUsage(Usage newActionOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionOwningUsage() {
		return basicGetActionOwningUsage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Behavior getActivity() {
		Behavior activity = basicGetActivity();
		return activity != null && activity.eIsProxy() ? (Behavior)eResolveProxy((InternalEObject)activity) : activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Behavior basicGetActivity() {
		EList<Type> types = super.getType();
		if (types.isEmpty()) {
			return null;
		} else {
			Type type = types.get(0);
			return type instanceof Behavior? (Behavior)type: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setActivity(Behavior newActivity) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivity() {
		return basicGetActivity() != null;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		if (isCheckSubsetting) {
			if (isSubperformance()) {
				addSubsetting(ACTION_SUBSETTING_PERFORMANCE_DEFAULT);
			} 
			if (isEnactedPerformance()) {
				addSubsetting(ACTION_SUBSETTING_OBJECT_DEFAULT);
			}
			if (isIncomingTransfer()) {
				addSubsetting(ACTION_SUBSETTING_TRANSFER_DEFAULT);
			}
			isCheckSubsetting = false;
		}
		return getOwnedSubsettingWithComputedRedefinitions(
				isSubperformance()? 
					ACTION_SUBSETTING_PERFORMANCE_DEFAULT:
				isEnactedPerformance()?
					ACTION_SUBSETTING_OBJECT_DEFAULT:
				isIncomingTransfer()?
					ACTION_SUBSETTING_TRANSFER_DEFAULT:
					ACTION_SUBSETTING_BASE_DEFAULT);
	}
	
	public boolean isSubperformance() {
		return StepImpl.isPerformanceFeature(this);
	}
	
	public boolean isEnactedPerformance() {
		return StepImpl.isEnactedPerformance(this);
	}
	
	public boolean isIncomingTransfer() {
		return StepImpl.isIncomingTransfer(this);
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ACTION__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.ACTION__ACTION_OWNING_DEFINITION:
				if (resolve) return getActionOwningDefinition();
				return basicGetActionOwningDefinition();
			case SysMLPackage.ACTION__ACTION_OWNING_USAGE:
				if (resolve) return getActionOwningUsage();
				return basicGetActionOwningUsage();
			case SysMLPackage.ACTION__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
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
			case SysMLPackage.ACTION__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.ACTION__ACTION_OWNING_DEFINITION:
				setActionOwningDefinition((Definition)newValue);
				return;
			case SysMLPackage.ACTION__ACTION_OWNING_USAGE:
				setActionOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.ACTION__ACTIVITY:
				setActivity((Behavior)newValue);
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
			case SysMLPackage.ACTION__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.ACTION__ACTION_OWNING_DEFINITION:
				setActionOwningDefinition((Definition)null);
				return;
			case SysMLPackage.ACTION__ACTION_OWNING_USAGE:
				setActionOwningUsage((Usage)null);
				return;
			case SysMLPackage.ACTION__ACTIVITY:
				setActivity((Behavior)null);
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
			case SysMLPackage.ACTION__TYPE:
				return isSetType();
			case SysMLPackage.ACTION__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.ACTION__OWNING_DEFINITION:
				return isSetOwningDefinition();
			case SysMLPackage.ACTION__OWNING_USAGE:
				return isSetOwningUsage();
			case SysMLPackage.ACTION__ACTION_OWNING_DEFINITION:
				return isSetActionOwningDefinition();
			case SysMLPackage.ACTION__ACTION_OWNING_USAGE:
				return isSetActionOwningUsage();
			case SysMLPackage.ACTION__ACTIVITY:
				return isSetActivity();
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
				case SysMLPackage.ACTION__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
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
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.ACTION__BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
	public EList<Behavior> getBehavior() {
		EList<Behavior> behavior = new UniqueEList<Behavior>();
		Behavior activity = getActivity();
		if (activity != null) {
			behavior.add(activity);
		}
		return new UnionEObjectEList<Behavior>(this, SysMLPackage.Literals.STEP__BEHAVIOR, behavior.size(), behavior.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getOwningDefinition() {
		return getActionOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition basicGetOwningDefinition() {
		return basicGetActionOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningDefinition(Definition newOwningDefinition) {
		setActionOwningDefinition(newOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningDefinition() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwningUsage() {
		return getActionOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetOwningUsage() {
		return basicGetActionOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUsage(Usage newOwningUsage) {
		setActionOwningUsage(newOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningUsage() {
  		return false;
	}

} //ActionImpl
