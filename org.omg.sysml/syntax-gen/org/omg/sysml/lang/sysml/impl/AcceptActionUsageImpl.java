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

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.ReferenceUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

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
	 * The cached setting delegate for the '{@link #getReceiverArgument() <em>Receiver Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECEIVER_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ACCEPT_ACTION_USAGE__RECEIVER_ARGUMENT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getPayloadParameter() <em>Payload Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAYLOAD_PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getPayloadArgument() <em>Payload Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayloadArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PAYLOAD_ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT).getSettingDelegate();

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
	public ReferenceUsage getPayloadParameter() {
		return (ReferenceUsage)PAYLOAD_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceUsage basicGetPayloadParameter() {
		return (ReferenceUsage)PAYLOAD_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayloadParameter(ReferenceUsage newPayloadParameter) {
		PAYLOAD_PARAMETER__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPayloadParameter);
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
	 * The cached invocation delegate for the '{@link #isTriggerAction() <em>Is Trigger Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTriggerAction()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TRIGGER_ACTION__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.ACCEPT_ACTION_USAGE___IS_TRIGGER_ACTION).getInvocationDelegate();

	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTriggerAction() {
		try {
			return (Boolean)IS_TRIGGER_ACTION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
				return RECEIVER_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_PARAMETER:
				return PAYLOAD_PARAMETER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.ACCEPT_ACTION_USAGE__PAYLOAD_ARGUMENT:
				return PAYLOAD_ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
			case SysMLPackage.ACCEPT_ACTION_USAGE___IS_TRIGGER_ACTION:
				return isTriggerAction();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AcceptActionUsageImpl
