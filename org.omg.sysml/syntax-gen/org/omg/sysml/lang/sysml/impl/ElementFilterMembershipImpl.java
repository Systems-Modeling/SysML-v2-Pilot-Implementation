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

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilterMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Filter Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementFilterMembershipImpl#getCondition_comp <em>Condition comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementFilterMembershipImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementFilterMembershipImpl extends MembershipImpl implements ElementFilterMembership {
	/**
	 * The cached value of the '{@link #getCondition_comp() <em>Condition comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression condition_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementFilterMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ELEMENT_FILTER_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition_comp() {
		return condition_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition_comp(Expression newCondition_comp, NotificationChain msgs) {
		Expression oldCondition_comp = condition_comp;
		condition_comp = newCondition_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP, oldCondition_comp, newCondition_comp);
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
	public void setCondition_comp(Expression newCondition_comp) {
		if (newCondition_comp != condition_comp) {
			NotificationChain msgs = null;
			if (condition_comp != null)
				msgs = ((InternalEObject)condition_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP, null, msgs);
			if (newCondition_comp != null)
				msgs = ((InternalEObject)newCondition_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP, null, msgs);
			msgs = basicSetCondition_comp(newCondition_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP, newCondition_comp, newCondition_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCondition_comp() {
		return condition_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition() {
		Expression condition = basicGetCondition();
		return condition != null && condition.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)condition) : condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetCondition() {
		// TODO: implement this method to return the 'Condition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Expression newCondition) {
		// TODO: implement this method to set the 'Condition' reference
		// Ensure that you remove @generated or mark it @generated NOT
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
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP:
				return basicSetCondition_comp(null, msgs);
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
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP:
				return getCondition_comp();
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
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
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP:
				setCondition_comp((Expression)newValue);
				return;
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION:
				setCondition((Expression)newValue);
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
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP:
				setCondition_comp((Expression)null);
				return;
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION:
				setCondition((Expression)null);
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
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP:
				return isSetOwnedMemberElement_comp();
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION_COMP:
				return isSetCondition_comp();
			case SysMLPackage.ELEMENT_FILTER_MEMBERSHIP__CONDITION:
				return basicGetCondition() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement_comp() {
		return getCondition_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberElement_comp(Element newOwnedMemberElement_comp, NotificationChain msgs) {
		if (newOwnedMemberElement_comp != null && !(newOwnedMemberElement_comp instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberElement_comp must be an instance of Expression");
		}
		return basicSetCondition_comp((Expression) newOwnedMemberElement_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberElement_comp(Element newOwnedMemberElement_comp) {
		if (newOwnedMemberElement_comp != null && !(newOwnedMemberElement_comp instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberElement_comp must be an instance of Expression");
		}
		setCondition_comp((Expression) newOwnedMemberElement_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberElement_comp() {
  		return false;
	}

} //ElementFilterMembershipImpl
