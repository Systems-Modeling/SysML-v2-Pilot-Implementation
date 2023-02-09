/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SendActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SendActionUsageImpl#getReceiverArgument <em>Receiver Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SendActionUsageImpl#getPayloadArgument <em>Payload Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SendActionUsageImpl#getSenderArgument <em>Sender Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendActionUsageImpl extends ActionUsageImpl implements SendActionUsage {

	/**
	 * The cached setting delegate for the '{@link #getReceiverArgument() <em>Receiver Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECEIVER_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SEND_ACTION_USAGE__RECEIVER_ARGUMENT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getPayloadArgument() <em>Payload Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAYLOAD_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SEND_ACTION_USAGE__PAYLOAD_ARGUMENT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getSenderArgument() <em>Sender Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SENDER_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.SEND_ACTION_USAGE__SENDER_ARGUMENT).getSettingDelegate();
	/**
	 * The cached value of the BindingConnector from the result of the target Expression of this SendAction to 
	 * its ItemFeature.
	 */
	protected BindingConnector targetConnector = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SEND_ACTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getReceiverArgument() {
		return (Expression)RECEIVER_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetReceiverArgument() {
		return (Expression)RECEIVER_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiverArgument(Expression newReceiverArgument) {
		RECEIVER_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newReceiverArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPayloadArgument() {
		return (Expression)PAYLOAD_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetPayloadArgument() {
		return (Expression)PAYLOAD_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayloadArgument(Expression newPayloadArgument) {
		PAYLOAD_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPayloadArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSenderArgument() {
		return (Expression)SENDER_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetSenderArgument() {
		return (Expression)SENDER_ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSenderArgument(Expression newSenderArgument) {
		SENDER_ARGUMENT__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSenderArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SEND_ACTION_USAGE__RECEIVER_ARGUMENT:
				if (resolve) return getReceiverArgument();
				return basicGetReceiverArgument();
			case SysMLPackage.SEND_ACTION_USAGE__PAYLOAD_ARGUMENT:
				if (resolve) return getPayloadArgument();
				return basicGetPayloadArgument();
			case SysMLPackage.SEND_ACTION_USAGE__SENDER_ARGUMENT:
				if (resolve) return getSenderArgument();
				return basicGetSenderArgument();
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
			case SysMLPackage.SEND_ACTION_USAGE__RECEIVER_ARGUMENT:
				setReceiverArgument((Expression)newValue);
				return;
			case SysMLPackage.SEND_ACTION_USAGE__PAYLOAD_ARGUMENT:
				setPayloadArgument((Expression)newValue);
				return;
			case SysMLPackage.SEND_ACTION_USAGE__SENDER_ARGUMENT:
				setSenderArgument((Expression)newValue);
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
			case SysMLPackage.SEND_ACTION_USAGE__RECEIVER_ARGUMENT:
				setReceiverArgument((Expression)null);
				return;
			case SysMLPackage.SEND_ACTION_USAGE__PAYLOAD_ARGUMENT:
				setPayloadArgument((Expression)null);
				return;
			case SysMLPackage.SEND_ACTION_USAGE__SENDER_ARGUMENT:
				setSenderArgument((Expression)null);
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
			case SysMLPackage.SEND_ACTION_USAGE__RECEIVER_ARGUMENT:
				return RECEIVER_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.SEND_ACTION_USAGE__PAYLOAD_ARGUMENT:
				return PAYLOAD_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.SEND_ACTION_USAGE__SENDER_ARGUMENT:
				return SENDER_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //SendActionUsageImpl
