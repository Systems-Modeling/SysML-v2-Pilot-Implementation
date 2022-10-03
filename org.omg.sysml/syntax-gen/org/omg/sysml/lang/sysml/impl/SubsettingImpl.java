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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Subsetting</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsettingImpl#getSubsettingFeature <em>Subsetting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsettingImpl#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubsettingImpl#getOwningFeature <em>Owning Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubsettingImpl extends SpecializationImpl implements Subsetting {
	/**
	 * The cached value of the '{@link #getSubsettingFeature() <em>Subsetting Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubsettingFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature subsettingFeature;

	/**
	 * The cached value of the '{@link #getSubsettedFeature() <em>Subsetted Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubsettedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature subsettedFeature;

	/**
	 * The cached setting delegate for the '{@link #getOwningFeature() <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SUBSETTING__OWNING_FEATURE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SubsettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUBSETTING;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Feature getSubsettedFeature() {
		return subsettedFeature == null? basicGetSubsettedFeature(): getSubsettedFeatureGen();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSubsettedFeatureGen() {
		if (subsettedFeature != null && subsettedFeature.eIsProxy()) {
			InternalEObject oldSubsettedFeature = (InternalEObject)subsettedFeature;
			subsettedFeature = (Feature)eResolveProxy(oldSubsettedFeature);
			if (subsettedFeature != oldSubsettedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBSETTING__SUBSETTED_FEATURE, oldSubsettedFeature, subsettedFeature));
			}
		}
		return subsettedFeature;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Xtext workaround:
	 * If the subsettedFeature is empty, then set it to the last ownedRelatedElement
	 * (which will be a Feature chain).
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetSubsettedFeature() {
		if (subsettedFeature == null) {
			EList<Element> ownedRelatedElements = getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				subsettedFeature = (Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1);
			}
		}
		return subsettedFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsettedFeature(Feature newSubsettedFeature) {
		Feature oldSubsettedFeature = subsettedFeature;
		subsettedFeature = newSubsettedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBSETTING__SUBSETTED_FEATURE, oldSubsettedFeature, subsettedFeature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetSubsettedFeature() {
		return basicGetSubsettedFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Xtext workaround.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature getSubsettingFeature() {
		return subsettingFeature == null ? basicGetSubsettingFeature() : getSubsettingFeatureGen();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSubsettingFeatureGen() {
		if (subsettingFeature != null && subsettingFeature.eIsProxy()) {
			InternalEObject oldSubsettingFeature = (InternalEObject)subsettingFeature;
			subsettingFeature = (Feature)eResolveProxy(oldSubsettingFeature);
			if (subsettingFeature != oldSubsettingFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.SUBSETTING__SUBSETTING_FEATURE, oldSubsettingFeature, subsettingFeature));
			}
		}
		return subsettingFeature;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Xtext workaround:
	 * If the subsettingFeature is empty, then set it to the owningRelatedFeature, if this is a Feature.
	 * Otherwise set it to the first ownedRelatedElement (which will be a Feature chain).
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Feature basicGetSubsettingFeature() {
		if (subsettingFeature == null) {
			Element owner = getOwningRelatedElement();
			if (owner instanceof Feature) {
				subsettingFeature = (Feature) owner;
			} else {
				EList<Element> ownedRelatedElements = getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					subsettingFeature = (Feature)ownedRelatedElements.get(0);
				}
			}
		}
		return subsettingFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsettingFeature(Feature newSubsettingFeature) {
		Feature oldSubsettingFeature = subsettingFeature;
		subsettingFeature = newSubsettingFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBSETTING__SUBSETTING_FEATURE, oldSubsettingFeature, subsettingFeature));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubsettingFeature() {
		return subsettingFeature != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwningFeature() {
		return (Feature)OWNING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwningFeature() {
		return (Feature)OWNING_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningFeature(Feature newOwningFeature) {
		OWNING_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningFeature);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningFeature() {
		return basicGetOwningFeature() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getGeneral() {
		return getSubsettedFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetGeneral() {
		return basicGetSubsettedFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Type newGeneral) {
		if (newGeneral != null && !(newGeneral instanceof Feature)) {
			throw new IllegalArgumentException("newGeneral must be an instance of Feature");
		}
		setSubsettedFeature((Feature) newGeneral);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeneral() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getSpecific() {
		return getSubsettingFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetSpecific() {
		return basicGetSubsettingFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Type newSpecific) {
		if (newSpecific != null && !(newSpecific instanceof Feature)) {
			throw new IllegalArgumentException("newSpecific must be an instance of Feature");
		}
		setSubsettingFeature((Feature) newSpecific);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecific() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return getOwningFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetOwningType() {
		return basicGetOwningFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningType(Type newOwningType) {
		if (newOwningType != null && !(newOwningType instanceof Feature)) {
			throw new IllegalArgumentException("newOwningType must be an instance of Feature");
		}
		setOwningFeature((Feature) newOwningType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SUBSETTING__SUBSETTING_FEATURE:
				if (resolve) return getSubsettingFeature();
				return basicGetSubsettingFeature();
			case SysMLPackage.SUBSETTING__SUBSETTED_FEATURE:
				if (resolve) return getSubsettedFeature();
				return basicGetSubsettedFeature();
			case SysMLPackage.SUBSETTING__OWNING_FEATURE:
				if (resolve) return getOwningFeature();
				return basicGetOwningFeature();
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
			case SysMLPackage.SUBSETTING__SUBSETTING_FEATURE:
				setSubsettingFeature((Feature)newValue);
				return;
			case SysMLPackage.SUBSETTING__SUBSETTED_FEATURE:
				setSubsettedFeature((Feature)newValue);
				return;
			case SysMLPackage.SUBSETTING__OWNING_FEATURE:
				setOwningFeature((Feature)newValue);
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
			case SysMLPackage.SUBSETTING__SUBSETTING_FEATURE:
				setSubsettingFeature((Feature)null);
				return;
			case SysMLPackage.SUBSETTING__SUBSETTED_FEATURE:
				setSubsettedFeature((Feature)null);
				return;
			case SysMLPackage.SUBSETTING__OWNING_FEATURE:
				setOwningFeature((Feature)null);
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
			case SysMLPackage.SUBSETTING__SUBSETTING_FEATURE:
				return isSetSubsettingFeature();
			case SysMLPackage.SUBSETTING__GENERAL:
				return isSetGeneral();
			case SysMLPackage.SUBSETTING__SPECIFIC:
				return isSetSpecific();
			case SysMLPackage.SUBSETTING__OWNING_TYPE:
				return isSetOwningType();
			case SysMLPackage.SUBSETTING__SUBSETTED_FEATURE:
				return isSetSubsettedFeature();
			case SysMLPackage.SUBSETTING__OWNING_FEATURE:
				return isSetOwningFeature();
		}
		return super.eIsSet(featureID);
	}

} // SubsettingImpl
