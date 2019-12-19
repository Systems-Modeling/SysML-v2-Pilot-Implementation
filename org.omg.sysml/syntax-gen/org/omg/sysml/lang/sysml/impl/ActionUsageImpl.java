/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Feature;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionUsageImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionUsageImpl#getActionOwningDefinition <em>Action Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ActionUsageImpl#getActionOwningUsage <em>Action Owning Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionUsageImpl extends UsageImpl implements ActionUsage {
	
	public static final String ACTION_SUBSETTING_BASE_DEFAULT = "Activities::actions";
	public static final String ACTION_SUBSETTING_SUBACTION_DEFAULT = "Activities::Action::subactions";
	
	protected boolean isCheckSubsetting = true;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACTION_USAGE;
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
	 * @generated NOT
	 */
	@Override
	public EList<Behavior> getActivity() {
		EList<Behavior> behaviors = new EObjectEList<Behavior>(Behavior.class, this, SysMLPackage.ACTION_USAGE__ACTIVITY);
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
	public boolean isSetActivity() {
		return !getActivity().isEmpty();
	}

	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return StepImpl.getRelevantFeaturesOf(this);
	}	
	
	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		if (isCheckSubsetting) {
			checkSubsetting();
			isCheckSubsetting = false;
		}
		return getOwnedSubsettingWithComputedRedefinitions(getActionSubsettingDefault());
	}
	
	protected void checkSubsetting() {
		if (isSubperformance()) {
			addSubsetting(ACTION_SUBSETTING_SUBACTION_DEFAULT);
		} 
	}
	
	protected String getActionSubsettingDefault() {
		return isSubperformance()? 
				ACTION_SUBSETTING_SUBACTION_DEFAULT:
				ACTION_SUBSETTING_BASE_DEFAULT;
	}
	
	public boolean isSubperformance() {
		return StepImpl.isPerformanceFeature(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.ACTION_USAGE__ACTIVITY:
				return getActivity();
			case SysMLPackage.ACTION_USAGE__ACTION_OWNING_DEFINITION:
				if (resolve) return getActionOwningDefinition();
				return basicGetActionOwningDefinition();
			case SysMLPackage.ACTION_USAGE__ACTION_OWNING_USAGE:
				if (resolve) return getActionOwningUsage();
				return basicGetActionOwningUsage();
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
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.ACTION_USAGE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.ACTION_USAGE__ACTION_OWNING_DEFINITION:
				setActionOwningDefinition((Definition)newValue);
				return;
			case SysMLPackage.ACTION_USAGE__ACTION_OWNING_USAGE:
				setActionOwningUsage((Usage)newValue);
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
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.ACTION_USAGE__ACTIVITY:
				getActivity().clear();
				return;
			case SysMLPackage.ACTION_USAGE__ACTION_OWNING_DEFINITION:
				setActionOwningDefinition((Definition)null);
				return;
			case SysMLPackage.ACTION_USAGE__ACTION_OWNING_USAGE:
				setActionOwningUsage((Usage)null);
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
			case SysMLPackage.ACTION_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.ACTION_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.ACTION_USAGE__OWNING_DEFINITION:
				return isSetOwningDefinition();
			case SysMLPackage.ACTION_USAGE__OWNING_USAGE:
				return isSetOwningUsage();
			case SysMLPackage.ACTION_USAGE__ACTIVITY:
				return isSetActivity();
			case SysMLPackage.ACTION_USAGE__ACTION_OWNING_DEFINITION:
				return isSetActionOwningDefinition();
			case SysMLPackage.ACTION_USAGE__ACTION_OWNING_USAGE:
				return isSetActionOwningUsage();
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
				case SysMLPackage.ACTION_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
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
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.ACTION_USAGE__BEHAVIOR;
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
		return getActivity();
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
