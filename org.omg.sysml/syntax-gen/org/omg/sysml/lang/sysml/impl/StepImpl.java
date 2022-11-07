/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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

package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StepImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StepImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends FeatureImpl implements Step {
	
	/**
	 * The cached setting delegate for the '{@link #getBehavior() <em>Behavior</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BEHAVIOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STEP__BEHAVIOR).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.STEP__PARAMETER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STEP;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Behavior> getBehavior() {
		return (EList<Behavior>)BEHAVIOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getParameter() {
		return (EList<Feature>)PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameter() {
		return !getParameter().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getDirectedFeature() {
		return getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectedFeature() {
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
			case SysMLPackage.STEP__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.STEP__PARAMETER:
				return getParameter();
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
			case SysMLPackage.STEP__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.STEP__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.STEP__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.STEP__PARAMETER:
				getParameter().clear();
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
			case SysMLPackage.STEP__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.STEP__BEHAVIOR:
				return BEHAVIOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.STEP__PARAMETER:
				return isSetParameter();
		}
		return super.eIsSet(featureID);
	}

} //StepImpl
