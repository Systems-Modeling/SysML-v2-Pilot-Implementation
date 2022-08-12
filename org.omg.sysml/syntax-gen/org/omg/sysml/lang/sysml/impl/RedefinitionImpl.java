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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Redefinition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RedefinitionImpl#getRedefiningFeature <em>Redefining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RedefinitionImpl#getRedefinedFeature <em>Redefined Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedefinitionImpl extends SubsettingImpl implements Redefinition {
	/**
	 * The cached value of the '{@link #getRedefiningFeature() <em>Redefining Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRedefiningFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature redefiningFeature;

	/**
	 * The cached value of the '{@link #getRedefinedFeature() <em>Redefined Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRedefinedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature redefinedFeature;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REDEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature getRedefiningFeature() {
		return redefiningFeature == null ? basicGetRedefiningFeature() : getRedefiningFeatureGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRedefiningFeatureGen() {
		if (redefiningFeature != null && redefiningFeature.eIsProxy()) {
			InternalEObject oldRedefiningFeature = (InternalEObject)redefiningFeature;
			redefiningFeature = (Feature)eResolveProxy(oldRedefiningFeature);
			if (redefiningFeature != oldRedefiningFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.REDEFINITION__REDEFINING_FEATURE, oldRedefiningFeature, redefiningFeature));
			}
		}
		return redefiningFeature;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Xtext workaround:
	 * If the redefiningFeature is empty, then set it to the owningRelatedElement, if that is a Feature.
	 * Otherwise, set it to the first ownedRelatedElement (which will be a Feature chain).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Feature basicGetRedefiningFeature() {
		if (redefiningFeature == null) {
			Element owner = getOwningRelatedElement();
			if (owner instanceof Feature) {
				redefiningFeature = (Feature) owner;
			} else {
				EList<Element> ownedRelatedElements = getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					redefiningFeature = (Feature)ownedRelatedElements.get(0);
				}
			}
		}
		return redefiningFeature;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedefiningFeature(Feature newRedefiningFeature) {
		Feature oldRedefiningFeature = redefiningFeature;
		redefiningFeature = newRedefiningFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REDEFINITION__REDEFINING_FEATURE, oldRedefiningFeature, redefiningFeature));
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isSetRedefiningFeature() {
		return basicGetRedefiningFeature() != null;
	}

	@Override
	public Feature getRedefinedFeature() {
		return redefinedFeature == null? basicGetRedefinedFeature(): getRedefinedFeatureGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRedefinedFeatureGen() {
		if (redefinedFeature != null && redefinedFeature.eIsProxy()) {
			InternalEObject oldRedefinedFeature = (InternalEObject)redefinedFeature;
			redefinedFeature = (Feature)eResolveProxy(oldRedefinedFeature);
			if (redefinedFeature != oldRedefinedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.REDEFINITION__REDEFINED_FEATURE, oldRedefinedFeature, redefinedFeature));
			}
		}
		return redefinedFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetRedefinedFeature() {
		if (redefinedFeature == null) {
			EList<Element> ownedRelatedElements = getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				redefinedFeature = (Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1);
			}
		}
		return redefinedFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedefinedFeature(Feature newRedefinedFeature) {
		Feature oldRedefinedFeature = redefinedFeature;
		redefinedFeature = newRedefinedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REDEFINITION__REDEFINED_FEATURE, oldRedefinedFeature, redefinedFeature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetRedefinedFeature() {
		return basicGetRedefinedFeature() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.REDEFINITION__REDEFINING_FEATURE:
				if (resolve) return getRedefiningFeature();
				return basicGetRedefiningFeature();
			case SysMLPackage.REDEFINITION__REDEFINED_FEATURE:
				if (resolve) return getRedefinedFeature();
				return basicGetRedefinedFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.REDEFINITION__REDEFINING_FEATURE:
				setRedefiningFeature((Feature)newValue);
				return;
			case SysMLPackage.REDEFINITION__REDEFINED_FEATURE:
				setRedefinedFeature((Feature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.REDEFINITION__REDEFINING_FEATURE:
				setRedefiningFeature((Feature)null);
				return;
			case SysMLPackage.REDEFINITION__REDEFINED_FEATURE:
				setRedefinedFeature((Feature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.REDEFINITION__SUBSETTING_FEATURE:
				return isSetSubsettingFeature();
			case SysMLPackage.REDEFINITION__SUBSETTED_FEATURE:
				return isSetSubsettedFeature();
			case SysMLPackage.REDEFINITION__REDEFINING_FEATURE:
				return isSetRedefiningFeature();
			case SysMLPackage.REDEFINITION__REDEFINED_FEATURE:
				return isSetRedefinedFeature();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSubsettingFeature() {
		return getRedefiningFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetSubsettingFeature() {
		return basicGetRedefiningFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsettingFeature(Feature newSubsettingFeature) {
		setRedefiningFeature(newSubsettingFeature);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubsettingFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSubsettedFeature() {
		return getRedefinedFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetSubsettedFeature() {
		return basicGetRedefinedFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsettedFeature(Feature newSubsettedFeature) {
		setRedefinedFeature(newSubsettedFeature);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubsettedFeature() {
  		return false;
	}

} // RedefinitionImpl
