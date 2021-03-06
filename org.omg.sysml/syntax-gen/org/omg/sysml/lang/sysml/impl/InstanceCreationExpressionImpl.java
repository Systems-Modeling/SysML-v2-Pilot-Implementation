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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.InstanceCreationExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Instance Creation Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InstanceCreationExpressionImpl#getInstantiatedType <em>Instantiated Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceCreationExpressionImpl extends InvocationExpressionImpl implements InstanceCreationExpression {
	/**
	 * The cached value of the '{@link #getInstantiatedType() <em>Instantiated Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInstantiatedType()
	 * @generated
	 * @ordered
	 */
	protected Type instantiatedType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceCreationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INSTANCE_CREATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getInstantiatedType() {
		if (instantiatedType != null && instantiatedType.eIsProxy()) {
			InternalEObject oldInstantiatedType = (InternalEObject)instantiatedType;
			instantiatedType = (Type)eResolveProxy(oldInstantiatedType);
			if (instantiatedType != oldInstantiatedType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE, oldInstantiatedType, instantiatedType));
			}
		}
		return instantiatedType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetInstantiatedType() {
		return instantiatedType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiatedType(Type newInstantiatedType) {
		Type oldInstantiatedType = instantiatedType;
		instantiatedType = newInstantiatedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE, oldInstantiatedType, instantiatedType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE:
				if (resolve) return getInstantiatedType();
				return basicGetInstantiatedType();
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
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE:
				setInstantiatedType((Type)newValue);
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
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE:
				setInstantiatedType((Type)null);
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
			case SysMLPackage.INSTANCE_CREATION_EXPRESSION__INSTANTIATED_TYPE:
				return instantiatedType != null;
		}
		return super.eIsSet(featureID);
	}

} // InstanceCreationExpressionImpl
