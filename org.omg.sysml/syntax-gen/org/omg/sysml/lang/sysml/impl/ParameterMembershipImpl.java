/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2024 Model Driven Solutions, Inc.
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Parameter Membership</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ParameterMembershipImpl#getOwnedMemberParameter <em>Owned Member Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterMembershipImpl extends FeatureMembershipImpl implements ParameterMembership {
	/**
	 * The cached setting delegate for the '{@link #getOwnedMemberParameter() <em>Owned Member Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMemberParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_MEMBER_PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PARAMETER_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberParameter() {
		return (Feature)OWNED_MEMBER_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwnedMemberParameter() {
		return (Feature)OWNED_MEMBER_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberParameter(Feature newOwnedMemberParameter) {
		OWNED_MEMBER_PARAMETER__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOwnedMemberParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberParameter() {
		return basicGetOwnedMemberParameter() != null;
	}

	/**
	 * The cached invocation delegate for the '{@link #parameterDirection() <em>Parameter Direction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #parameterDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PARAMETER_DIRECTION__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.PARAMETER_MEMBERSHIP___PARAMETER_DIRECTION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDirectionKind parameterDirection() {
		try {
			return (FeatureDirectionKind)PARAMETER_DIRECTION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature() {
		return getOwnedMemberParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetOwnedMemberFeature() {
		return basicGetOwnedMemberParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature(Feature newOwnedMemberFeature) {
		setOwnedMemberParameter(newOwnedMemberFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				if (resolve) return getOwnedMemberParameter();
				return basicGetOwnedMemberParameter();
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				setOwnedMemberParameter((Feature)newValue);
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				setOwnedMemberParameter((Feature)null);
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
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				return isSetOwnedMemberFeature();
			case SysMLPackage.PARAMETER_MEMBERSHIP__OWNED_MEMBER_PARAMETER:
				return isSetOwnedMemberParameter();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.PARAMETER_MEMBERSHIP___PARAMETER_DIRECTION:
				return parameterDirection();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ParameterMembershipImpl
