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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owning Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwningMembershipImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwningMembershipImpl#getOwnedMemberElementId <em>Owned Member Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwningMembershipImpl#getOwnedMemberShortName <em>Owned Member Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwningMembershipImpl#getOwnedMemberName <em>Owned Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OwningMembershipImpl#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OwningMembershipImpl extends MembershipImpl implements OwningMembership {
	/**
	 * The cached setting delegate for the '{@link #getOwnedMemberElementId() <em>Owned Member Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberElementId()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBER_ELEMENT_ID__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedMemberShortName() <em>Owned Member Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberShortName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBER_SHORT_NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedMemberName() <em>Owned Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBER_NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedMemberElement() <em>Owned Member Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBER_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwningMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OWNING_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.OWNING_MEMBERSHIP__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnedMemberElementId() {
		return (String)OWNED_MEMBER_ELEMENT_ID__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberElementId(String newOwnedMemberElementId) {
		OWNED_MEMBER_ELEMENT_ID__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedMemberElementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generation with setting delegate was not executed properly, therefore code was edited manually
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetOwnedMemberElementId() {
		return OWNED_MEMBER_ELEMENT_ID__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnedMemberShortName() {
		return (String)OWNED_MEMBER_SHORT_NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberShortName(String newOwnedMemberShortName) {
		OWNED_MEMBER_SHORT_NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedMemberShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generation with setting delegate was not executed properly, therefore code was edited manually
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetOwnedMemberShortName() {
		return OWNED_MEMBER_SHORT_NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnedMemberName() {
		return (String)OWNED_MEMBER_NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberName(String newOwnedMemberName) {
		OWNED_MEMBER_NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedMemberName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generation with setting delegate was not executed properly, therefore code was edited manually
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetOwnedMemberName() {
		return OWNED_MEMBER_NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getMemberElement() {
		return getOwnedMemberElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetMemberElement() {
		return basicGetOwnedMemberElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberElement(Element newMemberElement) {
		setOwnedMemberElement(newMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement() {
		return (Element)OWNED_MEMBER_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwnedMemberElement() {
		return (Element)OWNED_MEMBER_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		OWNED_MEMBER_ELEMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generation with setting delegate was not executed properly, therefore code was edited manually
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement() {
		return basicGetOwnedMemberElement() != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemberElementId() {
		return getOwnedMemberElementId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberElementId(String newMemberElementId) {
		setOwnedMemberElementId(newMemberElementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberElementId() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemberShortName() {
		return getOwnedMemberShortName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberShortName(String newMemberShortName) {
		setOwnedMemberShortName(newMemberShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberShortName() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemberName() {
		return getOwnedMemberName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberName(String newMemberName) {
		setOwnedMemberName(newMemberName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberName() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID:
				return getOwnedMemberElementId();
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME:
				return getOwnedMemberShortName();
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME:
				return getOwnedMemberName();
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				if (resolve) return getOwnedMemberElement();
				return basicGetOwnedMemberElement();
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
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID:
				setOwnedMemberElementId((String)newValue);
				return;
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME:
				setOwnedMemberShortName((String)newValue);
				return;
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME:
				setOwnedMemberName((String)newValue);
				return;
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				setOwnedMemberElement((Element)newValue);
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
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID:
				OWNED_MEMBER_ELEMENT_ID__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME:
				OWNED_MEMBER_SHORT_NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME:
				OWNED_MEMBER_NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				setOwnedMemberElement((Element)null);
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
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.OWNING_MEMBERSHIP__MEMBER_ELEMENT_ID:
				return isSetMemberElementId();
			case SysMLPackage.OWNING_MEMBERSHIP__MEMBER_SHORT_NAME:
				return isSetMemberShortName();
			case SysMLPackage.OWNING_MEMBERSHIP__MEMBER_NAME:
				return isSetMemberName();
			case SysMLPackage.OWNING_MEMBERSHIP__MEMBER_ELEMENT:
				return isSetMemberElement();
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID:
				return isSetOwnedMemberElementId();
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME:
				return isSetOwnedMemberShortName();
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME:
				return isSetOwnedMemberName();
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
				return isSetOwnedMemberElement();
		}
		return super.eIsSet(featureID);
	}

} //OwningMembershipImpl
