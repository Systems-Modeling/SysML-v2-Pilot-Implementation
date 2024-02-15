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
 * <p>A <code>SendActionUsage</code> is an <code>ActionUsage</code> that specifies the sending of a payload given by the result of its <code>payloadArgument</code> <code>Expression</code> via a <em><code>MessageTransfer</code></em> whose <em><code>source</code></em> is given by the result of the <code>senderArgument</code> <code>Expression</code> and whose <code>target</code> is given by the result of the <code>receiverArgument</code> <code>Expression</code>. If no <code>senderArgument</code> is provided, the default is the <em><code>this</code></em> context for the action. If no <code>receiverArgument</code> is given, then the receiver is to be determined by, e.g., outgoing <em><code>Connections</code></em> from the sender.</p> 
 * 
 * senderArgument = argument(2)
 * payloadArgument = argument(1)
 * inputParameters()->size() >= 3
 * receiverArgument = argument(3)
 * isSubactionUsage() implies
 *     specializesFromLibrary('Actions::Action::acceptSubactions')
 * specializesFromLibrary('Actions::sendActions')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SendActionUsage#getReceiverArgument <em>Receiver Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.SendActionUsage#getPayloadArgument <em>Payload Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.SendActionUsage#getSenderArgument <em>Sender Argument</em>}</li>
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
	 * <p>An <code>Expression</code> whose result is bound to the <em><code>receiver</code></em> input parameter of this <code>SendActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Argument</em>' reference.
	 * @see #setReceiverArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSendActionUsage_ReceiverArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendActionUsage'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p>An <code>Expression</code> whose result is bound to the <code><em>payload</em></code> input parameter of this <code>SendActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Argument</em>' reference.
	 * @see #setPayloadArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSendActionUsage_PayloadArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendingActionUsage'"
	 *        annotation="http://www.omg.org/spec/SysML"
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

	/**
	 * Returns the value of the '<em><b>Sender Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An <code>Expression</code> whose result is bound to the <em><code>sender</code></em> input parameter of this <code>SendActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sender Argument</em>' reference.
	 * @see #setSenderArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSendActionUsage_SenderArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='senderActionUsage'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getSenderArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SendActionUsage#getSenderArgument <em>Sender Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender Argument</em>' reference.
	 * @see #getSenderArgument()
	 * @generated
	 */
	void setSenderArgument(Expression value);
} // SendActionUsage
