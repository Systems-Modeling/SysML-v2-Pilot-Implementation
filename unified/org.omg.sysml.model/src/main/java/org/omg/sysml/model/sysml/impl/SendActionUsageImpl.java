/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 */
package org.omg.sysml.model.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Expression;
import org.omg.sysml.model.sysml.SendActionUsage;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SendActionUsageImpl#getPayloadArgument <em>Payload Argument</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SendActionUsageImpl#getReceiverArgument <em>Receiver Argument</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SendActionUsageImpl#getSenderArgument <em>Sender Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendActionUsageImpl extends ActionUsageImpl implements SendActionUsage {
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
	public Expression getPayloadArgument() {
		return (Expression)eGet(SysMLPackage.Literals.SEND_ACTION_USAGE__PAYLOAD_ARGUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayloadArgument(Expression newPayloadArgument) {
		eSet(SysMLPackage.Literals.SEND_ACTION_USAGE__PAYLOAD_ARGUMENT, newPayloadArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getReceiverArgument() {
		return (Expression)eGet(SysMLPackage.Literals.SEND_ACTION_USAGE__RECEIVER_ARGUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiverArgument(Expression newReceiverArgument) {
		eSet(SysMLPackage.Literals.SEND_ACTION_USAGE__RECEIVER_ARGUMENT, newReceiverArgument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSenderArgument() {
		return (Expression)eGet(SysMLPackage.Literals.SEND_ACTION_USAGE__SENDER_ARGUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSenderArgument(Expression newSenderArgument) {
		eSet(SysMLPackage.Literals.SEND_ACTION_USAGE__SENDER_ARGUMENT, newSenderArgument);
	}

} //SendActionUsageImpl
