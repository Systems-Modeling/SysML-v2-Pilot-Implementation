/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2023 Model Driven Solutions, Inc.
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

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StateUsageImpl#isParallel <em>Is Parallel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateUsageImpl extends ActionUsageImpl implements StateUsage {

	/**
	 * The cached setting delegate for the '{@link #getStateDefinition() <em>State Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STATE_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STATE_USAGE__STATE_DEFINITION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getEntryAction() <em>Entry Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ENTRY_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STATE_USAGE__ENTRY_ACTION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getDoAction() <em>Do Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DO_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STATE_USAGE__DO_ACTION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getExitAction() <em>Exit Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EXIT_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STATE_USAGE__EXIT_ACTION).getSettingDelegate();
	/**
	 * The default value of the '{@link #isParallel() <em>Is Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARALLEL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isParallel() <em>Is Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallel()
	 * @generated
	 * @ordered
	 */
	protected boolean isParallel = IS_PARALLEL_EDEFAULT;

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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Behavior> getStateDefinition() {
		return (EList<Behavior>)STATE_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
		return (ActionUsage)ENTRY_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetEntryAction() {
		return (ActionUsage)ENTRY_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryAction(ActionUsage newEntryAction) {
		ENTRY_ACTION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newEntryAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getDoAction() {
		return (ActionUsage)DO_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetDoAction() {
		return (ActionUsage)DO_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoAction(ActionUsage newDoAction) {
		DO_ACTION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newDoAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getExitAction() {
		return (ActionUsage)EXIT_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetExitAction() {
		return (ActionUsage)EXIT_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitAction(ActionUsage newExitAction) {
		EXIT_ACTION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newExitAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParallel() {
		return isParallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsParallel(boolean newIsParallel) {
		boolean oldIsParallel = isParallel;
		isParallel = newIsParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.STATE_USAGE__IS_PARALLEL, oldIsParallel, isParallel));
	}
	
	/**
	 * The cached invocation delegate for the '{@link #isSubstateUsage(boolean) <em>Is Substate Usage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstateUsage(boolean)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SUBSTATE_USAGE_BOOLEAN__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.STATE_USAGE___IS_SUBSTATE_USAGE__BOOLEAN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getActionDefinition() {
		return getStateDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionDefinition() {
  		return false;
	}

	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstateUsage(boolean isParallel) {
		try {
			return (Boolean)IS_SUBSTATE_USAGE_BOOLEAN__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{isParallel}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}
	
	//

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
			case SysMLPackage.STATE_USAGE__IS_PARALLEL:
				return isParallel();
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
			case SysMLPackage.STATE_USAGE__IS_PARALLEL:
				setIsParallel((Boolean)newValue);
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
			case SysMLPackage.STATE_USAGE__IS_PARALLEL:
				setIsParallel(IS_PARALLEL_EDEFAULT);
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
			case SysMLPackage.STATE_USAGE__ACTION_DEFINITION:
				return isSetActionDefinition();
			case SysMLPackage.STATE_USAGE__STATE_DEFINITION:
				return isSetStateDefinition();
			case SysMLPackage.STATE_USAGE__ENTRY_ACTION:
				return ENTRY_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.STATE_USAGE__DO_ACTION:
				return DO_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.STATE_USAGE__EXIT_ACTION:
				return EXIT_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.STATE_USAGE__IS_PARALLEL:
				return isParallel != IS_PARALLEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.STATE_USAGE___IS_SUBSTATE_USAGE__BOOLEAN:
				return isSubstateUsage((Boolean)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isParallel: ");
		result.append(isParallel);
		result.append(')');
		return result.toString();
	}

} //StateUsageImpl
