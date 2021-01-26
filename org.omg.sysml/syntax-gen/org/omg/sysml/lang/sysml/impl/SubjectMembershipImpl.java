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
import org.omg.sysml.lang.sysml.SubjectMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubjectMembershipImpl#getOwnedSubjectParameter_comp <em>Owned Subject Parameter comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SubjectMembershipImpl#getOwnedSubjectParameter <em>Owned Subject Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjectMembershipImpl extends ParameterMembershipImpl implements SubjectMembership {
	/**
	 * The cached value of the '{@link #getOwnedSubjectParameter_comp() <em>Owned Subject Parameter comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSubjectParameter_comp()
	 * @generated
	 * @ordered
	 */
	protected Usage ownedSubjectParameter_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SUBJECT_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwnedSubjectParameter_comp() {
		return ownedSubjectParameter_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSubjectParameter_comp(Usage newOwnedSubjectParameter_comp, NotificationChain msgs) {
		Usage oldOwnedSubjectParameter_comp = ownedSubjectParameter_comp;
		ownedSubjectParameter_comp = newOwnedSubjectParameter_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP, oldOwnedSubjectParameter_comp, newOwnedSubjectParameter_comp);
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
	public void setOwnedSubjectParameter_comp(Usage newOwnedSubjectParameter_comp) {
		if (newOwnedSubjectParameter_comp != ownedSubjectParameter_comp) {
			NotificationChain msgs = null;
			if (ownedSubjectParameter_comp != null)
				msgs = ((InternalEObject)ownedSubjectParameter_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP, null, msgs);
			if (newOwnedSubjectParameter_comp != null)
				msgs = ((InternalEObject)newOwnedSubjectParameter_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP, null, msgs);
			msgs = basicSetOwnedSubjectParameter_comp(newOwnedSubjectParameter_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP, newOwnedSubjectParameter_comp, newOwnedSubjectParameter_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedSubjectParameter_comp() {
		return ownedSubjectParameter_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwnedSubjectParameter() {
		Usage ownedSubjectParameter = basicGetOwnedSubjectParameter();
		return ownedSubjectParameter != null && ownedSubjectParameter.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)ownedSubjectParameter) : ownedSubjectParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetOwnedSubjectParameter() {
		return getOwnedSubjectParameter_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedSubjectParameter(Usage newOwnedSubjectParameter) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberParameter_comp() {
		return getOwnedSubjectParameter_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberParameter_comp(Feature newOwnedMemberParameter_comp, NotificationChain msgs) {
		if (newOwnedMemberParameter_comp != null && !(newOwnedMemberParameter_comp instanceof Usage)) {
			throw new IllegalArgumentException("newOwnedMemberParameter_comp must be an instance of Usage");
		}
		return basicSetOwnedSubjectParameter_comp((Usage) newOwnedMemberParameter_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberParameter_comp(Feature newOwnedMemberParameter_comp) {
		if (newOwnedMemberParameter_comp != null && !(newOwnedMemberParameter_comp instanceof Usage)) {
			throw new IllegalArgumentException("newOwnedMemberParameter_comp must be an instance of Usage");
		}
		setOwnedSubjectParameter_comp((Usage) newOwnedMemberParameter_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberParameter_comp() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP:
				return basicSetOwnedSubjectParameter_comp(null, msgs);
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
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP:
				return getOwnedSubjectParameter_comp();
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER:
				if (resolve) return getOwnedSubjectParameter();
				return basicGetOwnedSubjectParameter();
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
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP:
				setOwnedSubjectParameter_comp((Usage)newValue);
				return;
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER:
				setOwnedSubjectParameter((Usage)newValue);
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
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP:
				setOwnedSubjectParameter_comp((Usage)null);
				return;
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER:
				setOwnedSubjectParameter((Usage)null);
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
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_MEMBER_PARAMETER_COMP:
				return isSetOwnedMemberParameter_comp();
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER_COMP:
				return isSetOwnedSubjectParameter_comp();
			case SysMLPackage.SUBJECT_MEMBERSHIP__OWNED_SUBJECT_PARAMETER:
				return basicGetOwnedSubjectParameter() != null;
		}
		return super.eIsSet(featureID);
	}

} //SubjectMembershipImpl
