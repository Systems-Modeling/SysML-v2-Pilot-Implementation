/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.IfActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IfActionUsageImpl#getElseAction <em>Else Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IfActionUsageImpl#getThenAction <em>Then Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IfActionUsageImpl#getIfArgument <em>If Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfActionUsageImpl extends ActionUsageImpl implements IfActionUsage {
	/**
	 * The cached setting delegate for the '{@link #getElseAction() <em>Else Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ELSE_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.IF_ACTION_USAGE__ELSE_ACTION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getThenAction() <em>Then Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenAction()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate THEN_ACTION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.IF_ACTION_USAGE__THEN_ACTION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getIfArgument() <em>If Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IF_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.IF_ACTION_USAGE__IF_ARGUMENT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.IF_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getElseAction() {
		return (ActionUsage)ELSE_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetElseAction() {
		return (ActionUsage)ELSE_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElseAction(ActionUsage newElseAction) {
		ELSE_ACTION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newElseAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getThenAction() {
		return (ActionUsage)THEN_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetThenAction() {
		return (ActionUsage)THEN_ACTION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThenAction(ActionUsage newThenAction) {
		THEN_ACTION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newThenAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getIfArgument() {
		return (Expression)IF_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetIfArgument() {
		return (Expression)IF_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfArgument(Expression newIfArgument) {
		IF_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIfArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.IF_ACTION_USAGE__ELSE_ACTION:
				if (resolve) return getElseAction();
				return basicGetElseAction();
			case SysMLPackage.IF_ACTION_USAGE__THEN_ACTION:
				if (resolve) return getThenAction();
				return basicGetThenAction();
			case SysMLPackage.IF_ACTION_USAGE__IF_ARGUMENT:
				if (resolve) return getIfArgument();
				return basicGetIfArgument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.IF_ACTION_USAGE__ELSE_ACTION:
				setElseAction((ActionUsage)newValue);
				return;
			case SysMLPackage.IF_ACTION_USAGE__THEN_ACTION:
				setThenAction((ActionUsage)newValue);
				return;
			case SysMLPackage.IF_ACTION_USAGE__IF_ARGUMENT:
				setIfArgument((Expression)newValue);
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
			case SysMLPackage.IF_ACTION_USAGE__ELSE_ACTION:
				setElseAction((ActionUsage)null);
				return;
			case SysMLPackage.IF_ACTION_USAGE__THEN_ACTION:
				setThenAction((ActionUsage)null);
				return;
			case SysMLPackage.IF_ACTION_USAGE__IF_ARGUMENT:
				setIfArgument((Expression)null);
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
			case SysMLPackage.IF_ACTION_USAGE__ELSE_ACTION:
				return ELSE_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.IF_ACTION_USAGE__THEN_ACTION:
				return THEN_ACTION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.IF_ACTION_USAGE__IF_ARGUMENT:
				return IF_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //IfActionUsageImpl
