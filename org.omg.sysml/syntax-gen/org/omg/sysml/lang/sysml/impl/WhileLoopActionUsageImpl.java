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
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.WhileLoopActionUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.WhileLoopActionUsageImpl#getWhileArgument <em>While Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.WhileLoopActionUsageImpl#getUntilArgument <em>Until Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileLoopActionUsageImpl extends LoopActionUsageImpl implements WhileLoopActionUsage {
	/**
	 * The cached setting delegate for the '{@link #getWhileArgument() <em>While Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhileArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate WHILE_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getUntilArgument() <em>Until Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate UNTIL_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoopActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.WHILE_LOOP_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWhileArgument() {
		return (Expression)WHILE_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetWhileArgument() {
		return (Expression)WHILE_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhileArgument(Expression newWhileArgument) {
		WHILE_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newWhileArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUntilArgument() {
		return (Expression)UNTIL_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetUntilArgument() {
		return (Expression)UNTIL_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUntilArgument(Expression newUntilArgument) {
		UNTIL_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newUntilArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT:
				if (resolve) return getWhileArgument();
				return basicGetWhileArgument();
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT:
				if (resolve) return getUntilArgument();
				return basicGetUntilArgument();
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
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT:
				setWhileArgument((Expression)newValue);
				return;
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT:
				setUntilArgument((Expression)newValue);
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
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT:
				setWhileArgument((Expression)null);
				return;
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT:
				setUntilArgument((Expression)null);
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
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__WHILE_ARGUMENT:
				return WHILE_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.WHILE_LOOP_ACTION_USAGE__UNTIL_ARGUMENT:
				return UNTIL_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //WhileLoopActionUsageImpl
