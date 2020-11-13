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

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PerformActionUsageImpl#getPerformedAction <em>Performed Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformActionUsageImpl extends ActionUsageImpl implements PerformActionUsage {

	public static final String PERFORM_ACTION_SUBSETTING_PART_DEFAULT = "Parts::Part::performedActions";

	private Type subsettingBaseDefault;
	private Type subsettingPartDefault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PERFORM_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getPerformedAction() {
		ActionUsage performedAction = basicGetPerformedAction();
		return performedAction != null && performedAction.eIsProxy() ? (ActionUsage)eResolveProxy((InternalEObject)performedAction) : performedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionUsage basicGetPerformedAction() {
		Type subsettingBaseDefault = getSubsettingBaseDefault();
		Type subsettingPartDefault = getSubsettingPartDefault();
		List<Subsetting> subsettings = basicGetOwnedSubsetting();		
		if (subsettings.stream().map(sub->sub.getSubsettedFeature()).
				allMatch(feature->feature == subsettingBaseDefault || 
				         feature == subsettingPartDefault)) {
			return this;
		} else {
			Feature subsettedFeature = subsettings.get(0).getSubsettedFeature(); 
			return subsettedFeature instanceof ActionUsage? (ActionUsage)subsettedFeature: this;
		}
	}

	protected Type getSubsettingBaseDefault() {
		if (subsettingBaseDefault == null) {
			subsettingBaseDefault = getDefaultType(ACTION_SUBSETTING_BASE_DEFAULT);
		}
		return subsettingBaseDefault;
	}

	protected Type getSubsettingPartDefault() {
		if (subsettingPartDefault == null) {
			subsettingPartDefault = getDefaultType(PERFORM_ACTION_SUBSETTING_PART_DEFAULT);
		}
		return subsettingPartDefault;
	}
	
	@Override
	protected Feature getNamingFeature() {
		return getPerformedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPerformedAction(ActionUsage newPerformedAction) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected String getDefaultSupertype() {
		return isEnactedPerformance()? 
				PERFORM_ACTION_SUBSETTING_PART_DEFAULT:
				super.getDefaultSupertype();
	}
	
	public boolean isEnactedPerformance() {
		return StepImpl.isEnactedPerformance(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION:
				if (resolve) return getPerformedAction();
				return basicGetPerformedAction();
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
			case SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION:
				setPerformedAction((ActionUsage)newValue);
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
			case SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION:
				setPerformedAction((ActionUsage)null);
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
			case SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION:
				return basicGetPerformedAction() != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformActionUsageImpl
