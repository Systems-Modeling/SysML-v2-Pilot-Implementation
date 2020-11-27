/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.StateDefinition;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.StateSubactionMembership;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateDefinitionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateDefinitionImpl#getEntryAction <em>Entry Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateDefinitionImpl#getDoAction <em>Do Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateDefinitionImpl#getExitAction <em>Exit Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateDefinitionImpl extends ActionDefinitionImpl implements StateDefinition {

	public String STATE_DEFINITION_SUPERCLASS_DEFAULT = "States::State";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STATE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Step> getStep() {
		return new DerivedEObjectEList<Step>(Step.class, this, SysMLPackage.STATE_DEFINITION__STEP,
				new int[] { SysMLPackage.TYPE__FEATURE });
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getParameter() {
		EList<Feature> parameters = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.STATE_DEFINITION__PARAMETER);
		parameters.addAll(getAllParameters());
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<StateUsage> getState() {
		return new DerivedEObjectEList<StateUsage>(StateUsage.class, this, SysMLPackage.STATE_DEFINITION__STATE,
				new int[] { SysMLPackage.TYPE__FEATURE });
	}

	public static ActionUsage getStateSubaction(Type owner, StateSubactionKind kind) {
		return owner.getOwnedFeatureMembership().stream().
				filter(mem->(mem instanceof StateSubactionMembership) && ((StateSubactionMembership)mem).getKind() == kind).
				map(mem->((StateSubactionMembership)mem).getAction()).
				filter(action->action != null).
				findAny().orElse(null);
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
		return getStateSubaction(this, StateSubactionKind.ENTRY);
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
		return getStateSubaction(this, StateSubactionKind.DO);
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
		return getStateSubaction(this, StateSubactionKind.EXIT);
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

	@Override
	protected String getDefaultSupertype() {
		return STATE_DEFINITION_SUPERCLASS_DEFAULT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.STATE_DEFINITION__STATE:
				return getState();
			case SysMLPackage.STATE_DEFINITION__ENTRY_ACTION:
				if (resolve) return getEntryAction();
				return basicGetEntryAction();
			case SysMLPackage.STATE_DEFINITION__DO_ACTION:
				if (resolve) return getDoAction();
				return basicGetDoAction();
			case SysMLPackage.STATE_DEFINITION__EXIT_ACTION:
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
			case SysMLPackage.STATE_DEFINITION__STATE:
				getState().clear();
				getState().addAll((Collection<? extends StateUsage>)newValue);
				return;
			case SysMLPackage.STATE_DEFINITION__ENTRY_ACTION:
				setEntryAction((ActionUsage)newValue);
				return;
			case SysMLPackage.STATE_DEFINITION__DO_ACTION:
				setDoAction((ActionUsage)newValue);
				return;
			case SysMLPackage.STATE_DEFINITION__EXIT_ACTION:
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
			case SysMLPackage.STATE_DEFINITION__STATE:
				getState().clear();
				return;
			case SysMLPackage.STATE_DEFINITION__ENTRY_ACTION:
				setEntryAction((ActionUsage)null);
				return;
			case SysMLPackage.STATE_DEFINITION__DO_ACTION:
				setDoAction((ActionUsage)null);
				return;
			case SysMLPackage.STATE_DEFINITION__EXIT_ACTION:
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
			case SysMLPackage.STATE_DEFINITION__STATE:
				return !getState().isEmpty();
			case SysMLPackage.STATE_DEFINITION__ENTRY_ACTION:
				return basicGetEntryAction() != null;
			case SysMLPackage.STATE_DEFINITION__DO_ACTION:
				return basicGetDoAction() != null;
			case SysMLPackage.STATE_DEFINITION__EXIT_ACTION:
				return basicGetExitAction() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateDefinitionImpl
