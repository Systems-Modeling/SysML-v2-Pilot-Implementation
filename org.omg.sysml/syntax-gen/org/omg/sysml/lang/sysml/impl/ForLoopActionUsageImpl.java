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
import org.omg.sysml.lang.sysml.ForLoopActionUsage;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ForLoopActionUsageImpl#getSeqArgument <em>Seq Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ForLoopActionUsageImpl#getLoopVariable <em>Loop Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForLoopActionUsageImpl extends LoopActionUsageImpl implements ForLoopActionUsage {
	/**
	 * The cached setting delegate for the '{@link #getSeqArgument() <em>Seq Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SEQ_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getLoopVariable() <em>Loop Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariable()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate LOOP_VARIABLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForLoopActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FOR_LOOP_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceUsage getLoopVariable() {
		return (ReferenceUsage)LOOP_VARIABLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceUsage basicGetLoopVariable() {
		return (ReferenceUsage)LOOP_VARIABLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopVariable(ReferenceUsage newLoopVariable) {
		LOOP_VARIABLE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newLoopVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSeqArgument() {
		return (Expression)SEQ_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetSeqArgument() {
		return (Expression)SEQ_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeqArgument(Expression newSeqArgument) {
		SEQ_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSeqArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT:
				if (resolve) return getSeqArgument();
				return basicGetSeqArgument();
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE:
				if (resolve) return getLoopVariable();
				return basicGetLoopVariable();
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
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT:
				setSeqArgument((Expression)newValue);
				return;
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE:
				setLoopVariable((ReferenceUsage)newValue);
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
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT:
				setSeqArgument((Expression)null);
				return;
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE:
				setLoopVariable((ReferenceUsage)null);
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
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__SEQ_ARGUMENT:
				return SEQ_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.FOR_LOOP_ACTION_USAGE__LOOP_VARIABLE:
				return LOOP_VARIABLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //ForLoopActionUsageImpl
