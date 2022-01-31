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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.UsageUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AcceptActionUsageImpl#getReceiverArgument <em>Receiver Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AcceptActionUsageImpl#getPayloadParameter <em>Payload Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AcceptActionUsageImpl#getPayloadArgument <em>Payload Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptActionUsageImpl extends ActionUsageImpl implements AcceptActionUsage {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACCEPT_ACTION_USAGE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getReceiverArgument() {
		Expression receiverArgument = basicGetReceiverArgument();
		return receiverArgument != null && receiverArgument.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)receiverArgument) : receiverArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetReceiverArgument() {
		Feature receiverParameter = UsageUtil.getReceiverParameterOf(this);
		return receiverParameter == null? null: FeatureUtil.getValueExpressionFor(receiverParameter);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setReceiverArgument(Expression newReceiverArgument) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceUsage getPayloadParameter() {
		ReferenceUsage payloadParameter = basicGetPayloadParameter();
		return payloadParameter != null && payloadParameter.eIsProxy() ? (ReferenceUsage)eResolveProxy((InternalEObject)payloadParameter) : payloadParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ReferenceUsage basicGetPayloadParameter() {
		Feature payloadParameter = UsageUtil.getPayloadParameterOf(this);
		return payloadParameter instanceof ReferenceUsage? (ReferenceUsage)payloadParameter: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPayloadParameter(ReferenceUsage newPayloadParameter) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPayloadArgument() {
		Expression payloadArgument = basicGetPayloadArgument();
		return payloadArgument != null && payloadArgument.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)payloadArgument) : payloadArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetPayloadArgument() {
		Feature receiverParameter = UsageUtil.getPayloadParameterOf(this);
		return receiverParameter == null? null: FeatureUtil.getValueExpressionFor(receiverParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPayloadArgument(Expression newPayloadArgument) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				if (resolve) return getReceiverArgument();
				return basicGetReceiverArgument();
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER:
				if (resolve) return getPayloadParameter();
				return basicGetPayloadParameter();
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT:
				if (resolve) return getPayloadArgument();
				return basicGetPayloadArgument();
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
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				setReceiverArgument((Expression)newValue);
				return;
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER:
				setPayloadParameter((ReferenceUsage)newValue);
				return;
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT:
				setPayloadArgument((Expression)newValue);
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
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				setReceiverArgument((Expression)null);
				return;
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER:
				setPayloadParameter((ReferenceUsage)null);
				return;
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT:
				setPayloadArgument((Expression)null);
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
			case SysMLPackage.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT:
				return basicGetReceiverArgument() != null;
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER:
				return basicGetPayloadParameter() != null;
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT:
				return basicGetPayloadArgument() != null;
		}
		return super.eIsSet(featureID);
	}

} //AcceptActionUsageImpl
