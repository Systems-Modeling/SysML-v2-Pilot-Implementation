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
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ViewpointDefinition;
import org.omg.sysml.lang.sysml.ViewpointUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewpointUsageImpl#getViewpointDefinition <em>Viewpoint Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ViewpointUsageImpl#getViewpointStakeholder <em>Viewpoint Stakeholder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewpointUsageImpl extends RequirementUsageImpl implements ViewpointUsage {

	/**
	 * The cached setting delegate for the '{@link #getViewpointDefinition() <em>Viewpoint Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VIEWPOINT_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VIEWPOINT_USAGE__VIEWPOINT_DEFINITION).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getViewpointStakeholder() <em>Viewpoint Stakeholder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpointStakeholder()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate VIEWPOINT_STAKEHOLDER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.VIEWPOINT_USAGE__VIEWPOINT_STAKEHOLDER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VIEWPOINT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ViewpointDefinition getViewpointDefinition() {
		return (ViewpointDefinition)VIEWPOINT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointDefinition basicGetViewpointDefinition() {
		return (ViewpointDefinition)VIEWPOINT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewpointDefinition(ViewpointDefinition newViewpointDefinition) {
		VIEWPOINT_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newViewpointDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewpointDefinition() {
		return basicGetViewpointDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getViewpointStakeholder() {
		return (EList<PartUsage>)VIEWPOINT_STAKEHOLDER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.VIEWPOINT_USAGE__VIEWPOINT_DEFINITION:
				if (resolve) return getViewpointDefinition();
				return basicGetViewpointDefinition();
			case SysMLPackage.VIEWPOINT_USAGE__VIEWPOINT_STAKEHOLDER:
				return getViewpointStakeholder();
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
			case SysMLPackage.VIEWPOINT_USAGE__VIEWPOINT_DEFINITION:
				setViewpointDefinition((ViewpointDefinition)newValue);
				return;
			case SysMLPackage.VIEWPOINT_USAGE__VIEWPOINT_STAKEHOLDER:
				getViewpointStakeholder().clear();
				getViewpointStakeholder().addAll((Collection<? extends PartUsage>)newValue);
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
			case SysMLPackage.VIEWPOINT_USAGE__VIEWPOINT_DEFINITION:
				setViewpointDefinition((ViewpointDefinition)null);
				return;
			case SysMLPackage.VIEWPOINT_USAGE__VIEWPOINT_STAKEHOLDER:
				getViewpointStakeholder().clear();
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
			case SysMLPackage.VIEWPOINT_USAGE__REQUIREMENT_DEFINITION:
				return isSetRequirementDefinition();
			case SysMLPackage.VIEWPOINT_USAGE__VIEWPOINT_DEFINITION:
				return isSetViewpointDefinition();
			case SysMLPackage.VIEWPOINT_USAGE__VIEWPOINT_STAKEHOLDER:
				return VIEWPOINT_STAKEHOLDER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementDefinition getRequirementDefinition() {
		return getViewpointDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementDefinition basicGetRequirementDefinition() {
		return basicGetViewpointDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementDefinition(RequirementDefinition newRequirementDefinition) {
		if (newRequirementDefinition != null && !(newRequirementDefinition instanceof ViewpointDefinition)) {
			throw new IllegalArgumentException("newRequirementDefinition must be an instance of ViewpointDefinition");
		}
		setViewpointDefinition((ViewpointDefinition) newRequirementDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequirementDefinition() {
  		return false;
	}

} //ViewpointUsageImpl
