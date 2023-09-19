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
import org.omg.sysml.lang.sysml.FramedConcernMembership;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addressed Concern Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FramedConcernMembershipImpl#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FramedConcernMembershipImpl#getReferencedConcern <em>Referenced Concern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FramedConcernMembershipImpl extends RequirementConstraintMembershipImpl implements FramedConcernMembership {
	/**
	 * The cached setting delegate for the '{@link #getOwnedConcern() <em>Owned Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConcern()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_CONCERN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getReferencedConcern() <em>Referenced Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedConcern()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REFERENCED_CONCERN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramedConcernMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernUsage getOwnedConcern() {
		return (ConcernUsage)OWNED_CONCERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernUsage basicGetOwnedConcern() {
		return (ConcernUsage)OWNED_CONCERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedConcern(ConcernUsage newOwnedConcern) {
		OWNED_CONCERN__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedConcern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConcern() {
		return basicGetOwnedConcern() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernUsage getReferencedConcern() {
		return (ConcernUsage)REFERENCED_CONCERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernUsage basicGetReferencedConcern() {
		return (ConcernUsage)REFERENCED_CONCERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedConcern(ConcernUsage newReferencedConcern) {
		REFERENCED_CONCERN__ESETTING_DELEGATE.dynamicSet(this, null, 0, newReferencedConcern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedConcern() {
		return basicGetReferencedConcern() != null;
	}

	// Additional Overrides
	
	@Override
	public RequirementConstraintKind getKind() {
		return RequirementConstraintKind.REQUIREMENT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Consider the "kind" property to never be explicitly "set". 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		return featureID != SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND && eIsSetGen(featureID);
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
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN:
				if (resolve) return getOwnedConcern();
				return basicGetOwnedConcern();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN:
				if (resolve) return getReferencedConcern();
				return basicGetReferencedConcern();
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
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN:
				setOwnedConcern((ConcernUsage)newValue);
				return;
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN:
				setReferencedConcern((ConcernUsage)newValue);
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
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN:
				setOwnedConcern((ConcernUsage)null);
				return;
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN:
				setReferencedConcern((ConcernUsage)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(int featureID) {
		switch (featureID) {
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONSTRAINT:
				return isSetOwnedConstraint();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONSTRAINT:
				return isSetReferencedConstraint();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN:
				return isSetOwnedConcern();
			case SysMLPackage.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN:
				return isSetReferencedConcern();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getOwnedConstraint() {
		return getOwnedConcern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage basicGetOwnedConstraint() {
		return basicGetOwnedConcern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConstraint(ConstraintUsage newOwnedConstraint) {
		if (newOwnedConstraint != null && !(newOwnedConstraint instanceof ConcernUsage)) {
			throw new IllegalArgumentException("newOwnedConstraint must be an instance of ConcernUsage");
		}
		setOwnedConcern((ConcernUsage) newOwnedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConstraint() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getReferencedConstraint() {
		return getReferencedConcern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage basicGetReferencedConstraint() {
		return basicGetReferencedConcern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedConstraint(ConstraintUsage newReferencedConstraint) {
		if (newReferencedConstraint != null && !(newReferencedConstraint instanceof ConcernUsage)) {
			throw new IllegalArgumentException("newReferencedConstraint must be an instance of ConcernUsage");
		}
		setReferencedConcern((ConcernUsage) newReferencedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencedConstraint() {
  		return false;
	}

} //AddressedConcernMembershipImpl
