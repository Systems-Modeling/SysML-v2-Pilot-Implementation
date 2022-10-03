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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Featuring;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwnedMemberFeature <em>Owned Member Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureMembershipImpl#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureMembershipImpl extends OwningMembershipImpl implements FeatureMembership {
	/**
	 * The cached setting delegate for the '{@link #getOwnedMemberFeature() <em>Owned Member Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBER_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOwningType() <em>Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNING_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNING_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_MEMBERSHIP;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return (Type)OWNING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetOwningType() {
		return (Type)OWNING_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningType(Type newOwningType) {
		OWNING_TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningType() {
		return basicGetOwningType() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature() {
		return (Feature)OWNED_MEMBER_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwnedMemberFeature() {
		return (Feature)OWNED_MEMBER_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberFeature(Feature newOwnedMemberFeature) {
		OWNED_MEMBER_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedMemberFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature() {
		return basicGetOwnedMemberFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement() {
		return getOwnedMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwnedMemberElement() {
		return basicGetOwnedMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		if (newOwnedMemberElement != null && !(newOwnedMemberElement instanceof Feature)) {
			throw new IllegalArgumentException("newOwnedMemberElement must be an instance of Feature");
		}
		setOwnedMemberFeature((Feature) newOwnedMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getMembershipOwningNamespace() {
		return getOwningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetMembershipOwningNamespace() {
		return basicGetOwningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMembershipOwningNamespace(Namespace newMembershipOwningNamespace) {
		if (newMembershipOwningNamespace != null && !(newMembershipOwningNamespace instanceof Type)) {
			throw new IllegalArgumentException("newMembershipOwningNamespace must be an instance of Type");
		}
		setOwningType((Type) newMembershipOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembershipOwningNamespace() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return getOwningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return basicGetOwningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		setOwningType(newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		return getOwnedMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return basicGetOwnedMemberFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		setOwnedMemberFeature(newFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeature() {
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
			case SysMLPackage.FEATURE_MEMBERSHIP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				if (resolve) return getOwnedMemberFeature();
				return basicGetOwnedMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				if (resolve) return getOwningType();
				return basicGetOwningType();
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
			case SysMLPackage.FEATURE_MEMBERSHIP__TYPE:
				setType((Type)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE:
				setFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				setOwnedMemberFeature((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				setOwningType((Type)newValue);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__TYPE:
				setType((Type)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE:
				setFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				setOwnedMemberFeature((Feature)null);
				return;
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				setOwningType((Type)null);
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
			case SysMLPackage.FEATURE_MEMBERSHIP__TYPE:
				return isSetType();
			case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE:
				return isSetFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				return isSetOwnedMemberElement();
			case SysMLPackage.FEATURE_MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE:
				return isSetMembershipOwningNamespace();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				return isSetOwnedMemberFeature();
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNING_TYPE:
				return isSetOwningType();
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
		if (baseClass == Featuring.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FEATURE_MEMBERSHIP__TYPE: return SysMLPackage.FEATURING__TYPE;
				case SysMLPackage.FEATURE_MEMBERSHIP__FEATURE: return SysMLPackage.FEATURING__FEATURE;
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
		if (baseClass == Featuring.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FEATURING__TYPE: return SysMLPackage.FEATURE_MEMBERSHIP__TYPE;
				case SysMLPackage.FEATURING__FEATURE: return SysMLPackage.FEATURE_MEMBERSHIP__FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FeatureMembershipImpl
