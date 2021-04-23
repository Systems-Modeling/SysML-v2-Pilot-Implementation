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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ExhibitStateUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exhibit State Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExhibitStateUsageImpl#getExhibitedState <em>Exhibited State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExhibitStateUsageImpl extends StateUsageImpl implements ExhibitStateUsage {

	private Type subsettingBaseDefault;
	private Type subsettingPartDefault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExhibitStateUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.EXHIBIT_STATE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateUsage getExhibitedState() {
		StateUsage exhibitedState = basicGetExhibitedState();
		return exhibitedState != null && exhibitedState.eIsProxy() ? (StateUsage)eResolveProxy((InternalEObject)exhibitedState) : exhibitedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StateUsage basicGetExhibitedState() {
		Type subsettingBaseDefault = getSubsettingBaseDefault();
		Type subsettingPartDefault = getSubsettingPartDefault();
		return FeatureUtil.getSubsettedFeatureOf(this, StateUsage.class, 
				feature->feature == subsettingBaseDefault && feature == subsettingPartDefault);
	}

	protected Type getSubsettingBaseDefault() {
		if (subsettingBaseDefault == null) {
			subsettingBaseDefault = SysMLLibraryUtil.getLibraryType(this, 
					ImplicitGeneralizationMap.getDefaultSupertypeFor(this.getClass(), "base"));
		}
		return subsettingBaseDefault;
	}

	protected Type getSubsettingPartDefault() {
		if (subsettingPartDefault == null) {
			subsettingPartDefault = SysMLLibraryUtil.getLibraryType(this, 
					ImplicitGeneralizationMap.getDefaultSupertypeFor(this.getClass(), "enactedPerformance"));
		}
		return subsettingPartDefault;
	}

	@Override
	public Feature namingFeature() {
		return getExhibitedState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setExhibitedState(StateUsage newExhibitedState) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.EXHIBIT_STATE_USAGE__EXHIBITED_STATE:
				if (resolve) return getExhibitedState();
				return basicGetExhibitedState();
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
			case SysMLPackage.EXHIBIT_STATE_USAGE__EXHIBITED_STATE:
				setExhibitedState((StateUsage)newValue);
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
			case SysMLPackage.EXHIBIT_STATE_USAGE__EXHIBITED_STATE:
				setExhibitedState((StateUsage)null);
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
			case SysMLPackage.EXHIBIT_STATE_USAGE__EXHIBITED_STATE:
				return basicGetExhibitedState() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExhibitStateUsageImpl
