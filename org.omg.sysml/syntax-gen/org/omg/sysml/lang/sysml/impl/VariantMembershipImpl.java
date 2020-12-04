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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.lang.sysml.VariantMembership;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VariantMembershipImpl#getOwnedVariantUsage_comp <em>Owned Variant Usage comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.VariantMembershipImpl#getOwnedVariantUsage <em>Owned Variant Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantMembershipImpl extends MembershipImpl implements VariantMembership {
	/**
	 * The cached value of the '{@link #getOwnedVariantUsage_comp() <em>Owned Variant Usage comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariantUsage_comp()
	 * @generated
	 * @ordered
	 */
	protected Usage ownedVariantUsage_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VARIANT_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwnedVariantUsage_comp() {
		return ownedVariantUsage_comp;
	}

	public NotificationChain basicSetOwnedVariantUsage_comp(Usage newOwnedVariantUsage_comp, NotificationChain msgs) {
		ElementImpl element = (ElementImpl)newOwnedVariantUsage_comp;
		if (element.isNameSet()) {
			memberName = element.basicGetName();
			element.unsetName();
		}
		return basicSetOwnedVariantUsage_compGen(newOwnedVariantUsage_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedVariantUsage_compGen(Usage newOwnedVariantUsage_comp, NotificationChain msgs) {
		Usage oldOwnedVariantUsage_comp = ownedVariantUsage_comp;
		ownedVariantUsage_comp = newOwnedVariantUsage_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP, oldOwnedVariantUsage_comp, newOwnedVariantUsage_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedVariantUsage_comp(Usage newOwnedVariantUsage_comp) {
		if (newOwnedVariantUsage_comp != ownedVariantUsage_comp) {
			NotificationChain msgs = null;
			if (ownedVariantUsage_comp != null)
				msgs = ((InternalEObject)ownedVariantUsage_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP, null, msgs);
			if (newOwnedVariantUsage_comp != null)
				msgs = ((InternalEObject)newOwnedVariantUsage_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP, null, msgs);
			msgs = basicSetOwnedVariantUsage_comp(newOwnedVariantUsage_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP, newOwnedVariantUsage_comp, newOwnedVariantUsage_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedVariantUsage_comp() {
		return ownedVariantUsage_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwnedVariantUsage() {
		Usage ownedVariantUsage = basicGetOwnedVariantUsage();
		return ownedVariantUsage != null && ownedVariantUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)ownedVariantUsage) : ownedVariantUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetOwnedVariantUsage() {
		return getOwnedVariantUsage_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedVariantUsage(Usage newOwnedVariantUsage) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement_comp() {
		return getOwnedVariantUsage_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberElement_comp(Element newOwnedMemberElement_comp, NotificationChain msgs) {
		if (newOwnedMemberElement_comp != null && !(newOwnedMemberElement_comp instanceof Usage)) {
			throw new IllegalArgumentException("newOwnedMemberElement_comp must be an instance of Usage");
		}
		return basicSetOwnedVariantUsage_comp((Usage) newOwnedMemberElement_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberElement_comp(Element newOwnedMemberElement_comp) {
		if (newOwnedMemberElement_comp != null && !(newOwnedMemberElement_comp instanceof Usage)) {
			throw new IllegalArgumentException("newOwnedMemberElement_comp must be an instance of Usage");
		}
		setOwnedVariantUsage_comp((Usage) newOwnedMemberElement_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement_comp() {
  		return false;
	}

	// Utility Methods

	public Definition getOwningVariationDefinition() {
		org.omg.sysml.lang.sysml.Package owningPackage = super.getMembershipOwningPackage();
		return owningPackage instanceof Definition && ((Definition)owningPackage).isVariation()? (Definition)owningPackage: null;
	}

	public Usage getOwningVariationUsage() {
		org.omg.sysml.lang.sysml.Package owningPackage = super.getMembershipOwningPackage();
		return owningPackage instanceof Usage && ((Usage)owningPackage).isVariation()? (Usage)owningPackage: null;
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				return basicSetOwnedVariantUsage_comp(null, msgs);
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
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				return getOwnedVariantUsage_comp();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE:
				if (resolve) return getOwnedVariantUsage();
				return basicGetOwnedVariantUsage();
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
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				setOwnedVariantUsage_comp((Usage)newValue);
				return;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE:
				setOwnedVariantUsage((Usage)newValue);
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
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				setOwnedVariantUsage_comp((Usage)null);
				return;
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE:
				setOwnedVariantUsage((Usage)null);
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
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				return isSetOwnedMemberElement_comp();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE_COMP:
				return isSetOwnedVariantUsage_comp();
			case SysMLPackage.VARIANT_MEMBERSHIP__OWNED_VARIANT_USAGE:
				return basicGetOwnedVariantUsage() != null;
		}
		return super.eIsSet(featureID);
	}

} //VariantMembershipImpl
