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
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateUsage;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getExitAction <em>Exit Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getStateOwningDefinition <em>State Owning Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateUsageImpl extends ActionUsageImpl implements StateUsage {

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
	public ActionUsage getEntryAction() {
		ActionUsage entryAction = basicGetEntryAction();
		return entryAction != null && entryAction.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)entryAction) : entryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionUsage basicGetEntryAction() {
		return StateDefinitionImpl.getStateSubaction(this, StateSubactionKind.ENTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEntryAction(ActionUsage newEntryAction) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getDoAction() {
		ActionUsage doAction = basicGetDoAction();
		return doAction != null && doAction.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)doAction) : doAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionUsage basicGetDoAction() {
		return StateDefinitionImpl.getStateSubaction(this, StateSubactionKind.DO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setDoAction(ActionUsage newDoAction) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getExitAction() {
		ActionUsage exitAction = basicGetExitAction();
		return exitAction != null && exitAction.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)exitAction) : exitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionUsage basicGetExitAction() {
		return StateDefinitionImpl.getStateSubaction(this, StateSubactionKind.EXIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setExitAction(ActionUsage newExitAction) {
		throw new UnsupportedOperationException();
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

	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return StepImpl.getRelevantFeaturesOf(this);
	}	
	
	@Override
	protected String getDefaultSupertype() {
		return isSubperformance()? 
				STATE_SUBSETTING_SUBSTATE_DEFAULT:
				STATE_SUBSETTING_BASE_DEFAULT;
	}
	
	public boolean isSubperformance() {
		return StepImpl.isCompositePerformanceFeature(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getActionOwningUsage() {
		return getStateOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetActionOwningUsage() {
		return basicGetStateOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionOwningUsage(Usage newActionOwningUsage) {
		setStateOwningUsage(newActionOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionOwningUsage() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.STATE_USAGE__STATE_OWNING_USAGE:
				if (resolve) return getStateOwningUsage();
				return basicGetStateOwningUsage();
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				return getStateDefinition();
			case SysMLPackage.STATE_USAGE__ENTRY_ACTION:
				if (resolve) return getEntryAction();
				return basicGetEntryAction();
			case SysMLPackage.STATE_USAGE__DO_ACTION:
				if (resolve) return getDoAction();
				return basicGetDoAction();
			case SysMLPackage.STATE_USAGE__EXIT_ACTION:
				if (resolve) return getExitAction();
				return basicGetExitAction();
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
			case SysMLPackage.STATE_USAGE__STATE_OWNING_USAGE:
				setStateOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				getStateDefinition().clear();
				getStateDefinition().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.STATE_USAGE__ENTRY_ACTION:
				setEntryAction((ActionUsage)newValue);
				return;
			case SysMLPackage.STATE_USAGE__DO_ACTION:
				setDoAction((ActionUsage)newValue);
				return;
			case SysMLPackage.STATE_USAGE__EXIT_ACTION:
				setExitAction((ActionUsage)newValue);
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
			case SysMLPackage.STATE_USAGE__STATE_OWNING_USAGE:
				setStateOwningUsage((Usage)null);
				return;
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				getStateDefinition().clear();
				return;
			case SysMLPackage.STATE_USAGE__ENTRY_ACTION:
				setEntryAction((ActionUsage)null);
				return;
			case SysMLPackage.STATE_USAGE__DO_ACTION:
				setDoAction((ActionUsage)null);
				return;
			case SysMLPackage.STATE_USAGE__EXIT_ACTION:
				setExitAction((ActionUsage)null);
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
			case SysMLPackage.STATE_USAGE__ACTION_OWNING_USAGE:
				return isSetActionOwningUsage();
			case SysMLPackage.STATE_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.STATE_USAGE__OWNING_DEFINITION:
				return isSetOwningDefinition();
			case SysMLPackage.STATE_USAGE__STATE_OWNING_USAGE:
				return isSetStateOwningUsage();
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				return isSetStateDefinition();
			case SysMLPackage.STATE_USAGE__ENTRY_ACTION:
				return basicGetEntryAction() != null;
			case SysMLPackage.STATE_USAGE__DO_ACTION:
				return basicGetDoAction() != null;
			case SysMLPackage.STATE_USAGE__EXIT_ACTION:
				return basicGetExitAction() != null;
			case SysMLPackage.STATE_USAGE__STATE_OWNING_DEFINITION:
				return isSetStateOwningDefinition();
		}
		return super.eIsSet(featureID);
	}

} //StateUsageImpl
