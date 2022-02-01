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
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A SendActionUsage is an ActionUsage that is typed, directly or indirectly, by the ActionDefinition SendAction from the Systems model library. It specifies the sending of a payload given by the result of its <code>itemsArgument</code> Expression via a Transfer that becomes and <em><code>incomingTransfer</code></em> of the <code><em>Occurrence</em></code> given by the result of its <code>receiverArgument</code> Expression.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SendActionUsage#getReceiverArgument <em>Receiver Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.SendActionUsage#getPayloadArgument <em>Payload Argument</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSendActionUsage()
 * @model
 * @generated
 */
public interface SendActionUsage extends ActionUsage {

	/**
	 * Returns the value of the '<em><b>Receiver Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An Expression whose result is bound to the <em><code>receiver</code></em> input parameter of this SendActionUsage.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Argument</em>' reference.
	 * @see #setReceiverArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSendActionUsage_ReceiverArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendActionUsage'"
	 * @generated
	 */
	Expression getReceiverArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SendActionUsage#getReceiverArgument <em>Receiver Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Argument</em>' reference.
	 * @see #getReceiverArgument()
	 * @generated
	 */
	void setReceiverArgument(Expression value);

	/**
	 * Returns the value of the '<em><b>Payload Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An Expression whose result is bound to the <code><em>payload</em></code> input parameter of this SendActionUsage.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Argument</em>' reference.
	 * @see #setPayloadArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSendActionUsage_PayloadArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendingActionUsage'"
	 * @generated
	 */
	Expression getPayloadArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SendActionUsage#getPayloadArgument <em>Payload Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Argument</em>' reference.
	 * @see #getPayloadArgument()
	 * @generated
	 */
	void setPayloadArgument(Expression value);
} // SendActionUsage
