/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getStateOwningUsage <em>State Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getStateDefinition <em>State Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getStateOwningDefinition <em>State Owning Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateUsageImpl extends UsageImpl implements StateUsage {

	public static final String STATE_SUBSETTING_BASE_DEFAULT = "States::states";
	public static final String STATE_SUBSETTING_SUBSTATE_DEFAULT = "States::State::substates";
	
	protected boolean isCheckSubsetting = true;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STATE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getStateOwningUsage() {
		Usage stateOwningUsage = basicGetStateOwningUsage();
		return stateOwningUsage != null && stateOwningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)stateOwningUsage) : stateOwningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetStateOwningUsage() {
		Type owningType = super.basicGetOwningType();
		return owningType instanceof Usage? (Usage)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setStateOwningUsage(Usage newStateOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStateOwningUsage() {
		return basicGetStateOwningUsage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Behavior> getStateDefinition() {
		EList<Behavior> behaviors = new EObjectEList<Behavior>(Behavior.class, this, SysMLPackage.STATE_USAGE__STATE_DEFINITION);
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
	public boolean isSetStateDefinition() {
		return !getStateDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getStateOwningDefinition() {
		Definition stateOwningDefinition = basicGetStateOwningDefinition();
		return stateOwningDefinition != null && stateOwningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)stateOwningDefinition) : stateOwningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetStateOwningDefinition() {
		return super.basicGetOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setStateOwningDefinition(Definition newStateOwningDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStateOwningDefinition() {
		return basicGetStateOwningDefinition() != null;
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
		return getStateDefinition();
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
	public Usage getOwningUsage() {
		return getStateOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetOwningUsage() {
		return basicGetStateOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUsage(Usage newOwningUsage) {
		setStateOwningUsage(newOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningUsage() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getOwningDefinition() {
		return getStateOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition basicGetOwningDefinition() {
		return basicGetStateOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningDefinition(Definition newOwningDefinition) {
		setStateOwningDefinition(newOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningDefinition() {
  		return false;
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
			addSubsetting(STATE_SUBSETTING_SUBSTATE_DEFAULT);
		} 
	}
	
	protected String getActionSubsettingDefault() {
		return isSubperformance()? 
				STATE_SUBSETTING_SUBSTATE_DEFAULT:
				STATE_SUBSETTING_BASE_DEFAULT;
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
			case SysMLPackage.STATE_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.STATE_USAGE__STATE_OWNING_USAGE:
				if (resolve) return getStateOwningUsage();
				return basicGetStateOwningUsage();
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				return getStateDefinition();
			case SysMLPackage.STATE_USAGE__STATE_OWNING_DEFINITION:
				if (resolve) return getStateOwningDefinition();
				return basicGetStateOwningDefinition();
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
			case SysMLPackage.STATE_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.STATE_USAGE__STATE_OWNING_USAGE:
				setStateOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				getStateDefinition().clear();
				getStateDefinition().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.STATE_USAGE__STATE_OWNING_DEFINITION:
				setStateOwningDefinition((Definition)newValue);
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
			case SysMLPackage.STATE_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.STATE_USAGE__STATE_OWNING_USAGE:
				setStateOwningUsage((Usage)null);
				return;
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				getStateDefinition().clear();
				return;
			case SysMLPackage.STATE_USAGE__STATE_OWNING_DEFINITION:
				setStateOwningDefinition((Definition)null);
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
			case SysMLPackage.STATE_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.STATE_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.STATE_USAGE__OWNING_USAGE:
				return isSetOwningUsage();
			case SysMLPackage.STATE_USAGE__OWNING_DEFINITION:
				return isSetOwningDefinition();
			case SysMLPackage.STATE_USAGE__STATE_OWNING_USAGE:
				return isSetStateOwningUsage();
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				return isSetStateDefinition();
			case SysMLPackage.STATE_USAGE__STATE_OWNING_DEFINITION:
				return isSetStateOwningDefinition();
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
				case SysMLPackage.STATE_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
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
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.STATE_USAGE__BEHAVIOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StateUsageImpl
