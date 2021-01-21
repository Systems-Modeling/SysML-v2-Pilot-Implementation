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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ObjectiveMembershipImpl#getOwnedObjectiveRequirement_comp <em>Owned Objective Requirement comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ObjectiveMembershipImpl#getOwnedObjectiveRequirement <em>Owned Objective Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveMembershipImpl extends FeatureMembershipImpl implements ObjectiveMembership {
	/**
	 * The cached value of the '{@link #getOwnedObjectiveRequirement_comp() <em>Owned Objective Requirement comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedObjectiveRequirement_comp()
	 * @generated
	 * @ordered
	 */
	protected RequirementUsage ownedObjectiveRequirement_comp;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OBJECTIVE_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getOwnedObjectiveRequirement_comp() {
		return ownedObjectiveRequirement_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedObjectiveRequirement_comp(RequirementUsage newOwnedObjectiveRequirement_comp, NotificationChain msgs) {
		RequirementUsage oldOwnedObjectiveRequirement_comp = ownedObjectiveRequirement_comp;
		ownedObjectiveRequirement_comp = newOwnedObjectiveRequirement_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP, oldOwnedObjectiveRequirement_comp, newOwnedObjectiveRequirement_comp);
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
	public void setOwnedObjectiveRequirement_comp(RequirementUsage newOwnedObjectiveRequirement_comp) {
		if (newOwnedObjectiveRequirement_comp != ownedObjectiveRequirement_comp) {
			NotificationChain msgs = null;
			if (ownedObjectiveRequirement_comp != null)
				msgs = ((InternalEObject)ownedObjectiveRequirement_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP, null, msgs);
			if (newOwnedObjectiveRequirement_comp != null)
				msgs = ((InternalEObject)newOwnedObjectiveRequirement_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP, null, msgs);
			msgs = basicSetOwnedObjectiveRequirement_comp(newOwnedObjectiveRequirement_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP, newOwnedObjectiveRequirement_comp, newOwnedObjectiveRequirement_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedObjectiveRequirement_comp() {
		return ownedObjectiveRequirement_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getOwnedObjectiveRequirement() {
		RequirementUsage ownedObjectiveRequirement = basicGetOwnedObjectiveRequirement();
		return ownedObjectiveRequirement != null && ownedObjectiveRequirement.eIsProxy() ? (RequirementUsage)eResolveProxy((InternalEObject)ownedObjectiveRequirement) : ownedObjectiveRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RequirementUsage basicGetOwnedObjectiveRequirement() {
		return getOwnedObjectiveRequirement_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedObjectiveRequirement(RequirementUsage newOwnedObjectiveRequirement) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP:
				return basicSetOwnedObjectiveRequirement_comp(null, msgs);
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
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP:
				return getOwnedObjectiveRequirement_comp();
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT:
				if (resolve) return getOwnedObjectiveRequirement();
				return basicGetOwnedObjectiveRequirement();
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
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP:
				setOwnedObjectiveRequirement_comp((RequirementUsage)newValue);
				return;
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT:
				setOwnedObjectiveRequirement((RequirementUsage)newValue);
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
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP:
				setOwnedObjectiveRequirement_comp((RequirementUsage)null);
				return;
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT:
				setOwnedObjectiveRequirement((RequirementUsage)null);
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
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP:
				return isSetOwnedMemberFeature_comp();
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT_COMP:
				return isSetOwnedObjectiveRequirement_comp();
			case SysMLPackage.OBJECTIVE_MEMBERSHIP__OWNED_OBJECTIVE_REQUIREMENT:
				return basicGetOwnedObjectiveRequirement() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature_comp() {
		return getOwnedObjectiveRequirement_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp, NotificationChain msgs) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of RequirementUsage");
		}
		return basicSetOwnedObjectiveRequirement_comp((RequirementUsage) newOwnedMemberFeature_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of RequirementUsage");
		}
		setOwnedObjectiveRequirement_comp((RequirementUsage) newOwnedMemberFeature_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature_comp() {
  		return false;
	}

} //ObjectiveMembershipImpl
