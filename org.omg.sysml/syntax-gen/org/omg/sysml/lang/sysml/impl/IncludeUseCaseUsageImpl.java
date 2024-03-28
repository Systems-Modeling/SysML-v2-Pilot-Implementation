/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2024 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.EventOccurrenceUsage;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.UseCaseUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Use Case Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.IncludeUseCaseUsageImpl#getUseCaseIncluded <em>Use Case Included</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeUseCaseUsageImpl extends UseCaseUsageImpl implements IncludeUseCaseUsage {
	/**
	 * The cached setting delegate for the '{@link #getUseCaseIncluded() <em>Use Case Included</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCaseIncluded()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USE_CASE_INCLUDED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.INCLUDE_USE_CASE_USAGE__USE_CASE_INCLUDED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeUseCaseUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INCLUDE_USE_CASE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCaseUsage getUseCaseIncluded() {
		return (UseCaseUsage)USE_CASE_INCLUDED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseUsage basicGetUseCaseIncluded() {
		return (UseCaseUsage)USE_CASE_INCLUDED__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCaseIncluded(UseCaseUsage newUseCaseIncluded) {
		USE_CASE_INCLUDED__ESETTING_DELEGATE.dynamicSet(this, null, 0, newUseCaseIncluded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseCaseIncluded() {
		return basicGetUseCaseIncluded() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getPerformedAction() {
		return getUseCaseIncluded();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUsage basicGetPerformedAction() {
		return basicGetUseCaseIncluded();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformedAction(ActionUsage newPerformedAction) {
		if (newPerformedAction != null && !(newPerformedAction instanceof UseCaseUsage)) {
			throw new IllegalArgumentException("newPerformedAction must be an instance of UseCaseUsage");
		}
		setUseCaseIncluded((UseCaseUsage) newPerformedAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerformedAction() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceUsage getEventOccurrence() {
		return getPerformedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceUsage basicGetEventOccurrence() {
		return basicGetPerformedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventOccurrence(OccurrenceUsage newEventOccurrence) {
		if (newEventOccurrence != null && !(newEventOccurrence instanceof ActionUsage)) {
			throw new IllegalArgumentException("newEventOccurrence must be an instance of ActionUsage");
		}
		setPerformedAction((ActionUsage) newEventOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventOccurrence() {
  		return false;
	}

	// Additional overrides
	
	@Override
	public boolean isComposite() {
		return false;
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
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE:
				if (resolve) return getEventOccurrence();
				return basicGetEventOccurrence();
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION:
				if (resolve) return getPerformedAction();
				return basicGetPerformedAction();
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__USE_CASE_INCLUDED:
				if (resolve) return getUseCaseIncluded();
				return basicGetUseCaseIncluded();
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
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE:
				setEventOccurrence((OccurrenceUsage)newValue);
				return;
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION:
				setPerformedAction((ActionUsage)newValue);
				return;
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__USE_CASE_INCLUDED:
				setUseCaseIncluded((UseCaseUsage)newValue);
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
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE:
				setEventOccurrence((OccurrenceUsage)null);
				return;
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION:
				setPerformedAction((ActionUsage)null);
				return;
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__USE_CASE_INCLUDED:
				setUseCaseIncluded((UseCaseUsage)null);
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
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE:
				return isSetEventOccurrence();
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION:
				return isSetPerformedAction();
			case SysMLPackage.INCLUDE_USE_CASE_USAGE__USE_CASE_INCLUDED:
				return isSetUseCaseIncluded();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EventOccurrenceUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE: return SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE;
				default: return -1;
			}
		}
		if (baseClass == PerformActionUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION: return SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EventOccurrenceUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE: return SysMLPackage.INCLUDE_USE_CASE_USAGE__EVENT_OCCURRENCE;
				default: return -1;
			}
		}
		if (baseClass == PerformActionUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION: return SysMLPackage.INCLUDE_USE_CASE_USAGE__PERFORMED_ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IncludeUseCaseUsageImpl
