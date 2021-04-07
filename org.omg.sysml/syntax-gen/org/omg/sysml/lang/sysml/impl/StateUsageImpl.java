/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getStateDefinition <em>State Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#getExitAction <em>Exit Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateUsageImpl extends ActionUsageImpl implements StateUsage {

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
	 * @generated NOT
	 */
	@Override
	public EList<Behavior> getStateDefinition() {
		EList<Behavior> behaviors = new NonNotifyingEObjectEList<>(Behavior.class, this, SysMLPackage.STATE_USAGE__STATE_DEFINITION);
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
	public EList<Behavior> getBehavior() {
		return getActionDefinition();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
			case SysMLPackage.STATE_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				return isSetStateDefinition();
			case SysMLPackage.STATE_USAGE__ENTRY_ACTION:
				return basicGetEntryAction() != null;
			case SysMLPackage.STATE_USAGE__DO_ACTION:
				return basicGetDoAction() != null;
			case SysMLPackage.STATE_USAGE__EXIT_ACTION:
				return basicGetExitAction() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateUsageImpl
