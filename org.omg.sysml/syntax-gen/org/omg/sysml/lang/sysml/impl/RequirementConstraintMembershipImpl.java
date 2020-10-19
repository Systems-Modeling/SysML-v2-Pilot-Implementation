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

import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Constraint Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementConstraintMembershipImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementConstraintMembershipImpl#getConstraint_comp <em>Constraint comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementConstraintMembershipImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementConstraintMembershipImpl extends FeatureMembershipImpl implements RequirementConstraintMembership {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementConstraintKind KIND_EDEFAULT = RequirementConstraintKind.ASSUMPTION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected RequirementConstraintKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint_comp() <em>Constraint comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint_comp()
	 * @generated
	 * @ordered
	 */
	protected ConstraintUsage constraint_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementConstraintMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementConstraintKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(RequirementConstraintKind newKind) {
		RequirementConstraintKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getConstraint_comp() {
		return constraint_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint_comp(ConstraintUsage newConstraint_comp, NotificationChain msgs) {
		ConstraintUsage oldConstraint_comp = constraint_comp;
		constraint_comp = newConstraint_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP, oldConstraint_comp, newConstraint_comp);
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
	public void setConstraint_comp(ConstraintUsage newConstraint_comp) {
		if (newConstraint_comp != constraint_comp) {
			NotificationChain msgs = null;
			if (constraint_comp != null)
				msgs = ((InternalEObject)constraint_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP, null, msgs);
			if (newConstraint_comp != null)
				msgs = ((InternalEObject)newConstraint_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP, null, msgs);
			msgs = basicSetConstraint_comp(newConstraint_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP, newConstraint_comp, newConstraint_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraint_comp() {
		return constraint_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getConstraint() {
		ConstraintUsage constraint = basicGetConstraint();
		return constraint != null && constraint.eIsProxy() ? (ConstraintUsage)eResolveProxy((InternalEObject)constraint) : constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConstraintUsage basicGetConstraint() {
		return getConstraint_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConstraint(ConstraintUsage newConstraint) {
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
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP:
				return basicSetConstraint_comp(null, msgs);
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
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND:
				return getKind();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP:
				return getConstraint_comp();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
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
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND:
				setKind((RequirementConstraintKind)newValue);
				return;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP:
				setConstraint_comp((ConstraintUsage)newValue);
				return;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT:
				setConstraint((ConstraintUsage)newValue);
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
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP:
				setConstraint_comp((ConstraintUsage)null);
				return;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT:
				setConstraint((ConstraintUsage)null);
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
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP:
				return isSetOwnedMemberFeature_comp();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND:
				return kind != KIND_EDEFAULT;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT_COMP:
				return isSetConstraint_comp();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__CONSTRAINT:
				return basicGetConstraint() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature_comp() {
		return getConstraint_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp, NotificationChain msgs) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof ConstraintUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of ConstraintUsage");
		}
		return basicSetConstraint_comp((ConstraintUsage) newOwnedMemberFeature_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof ConstraintUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of ConstraintUsage");
		}
		setConstraint_comp((ConstraintUsage) newOwnedMemberFeature_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature_comp() {
  		return false;
	}

} //RequirementConstraintMembershipImpl
