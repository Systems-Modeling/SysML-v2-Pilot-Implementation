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
 * A representation of the model object '<em><b>Accept Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An AcceptActionUsage is an ActionUsage that is typed, directly or indirectly, by the ActionDefinition <code><em>AcceptAction</em></code> from the Systems model library. It specifies the acceptance of an <em><code>incomingTransfer</code></em> from the <code><em>Occurrence</em></code> given by the result of its <code>receiverArgument</code> Expression. The payload of the accepted <em><code>Transfer</em></code> is output on its <code>payloadParameter</code>.</p>
 * 
 * <p>Which <em><code>Transfers</em></code> may be accepted is determined by the typing and binding of the <code>payloadParameter</code>. If the <code>triggerKind</code> has any value other than <code>accept</code>, then the <code>payloadParameter</code> must be bound to a <code>payloadArgument</code> that is an InvocationExpression whose <code>function</code> is determined by the <code>triggerKind</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AcceptActionUsage#getReceiverArgument <em>Receiver Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AcceptActionUsage#getPayloadParameter <em>Payload Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AcceptActionUsage#getPayloadArgument <em>Payload Argument</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAcceptActionUsage()
 * @model
 * @generated
 */
public interface AcceptActionUsage extends ActionUsage {

	/**
	 * Returns the value of the '<em><b>Receiver Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An Expression whose result is bound to the <em><code>receiver</code></em> input parameter of this AcceptActionUsage.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Argument</em>' reference.
	 * @see #setReceiverArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAcceptActionUsage_ReceiverArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='acceptActionUsage'"
	 * @generated
	 */
	Expression getReceiverArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AcceptActionUsage#getReceiverArgument <em>Receiver Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver Argument</em>' reference.
	 * @see #getReceiverArgument()
	 * @generated
	 */
	void setReceiverArgument(Expression value);

	/**
	 * Returns the value of the '<em><b>Payload Parameter</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedReference() <em>Nested Reference</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>nestedReference</code> of this AcceptActionUsage that redefines the <code>payload</code> output parameter of the base AcceptActionUsage <em><code>AcceptAction</code></em> from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Parameter</em>' reference.
	 * @see #setPayloadParameter(ReferenceUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAcceptActionUsage_PayloadParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningAcceptActionUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	ReferenceUsage getPayloadParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AcceptActionUsage#getPayloadParameter <em>Payload Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Parameter</em>' reference.
	 * @see #getPayloadParameter()
	 * @generated
	 */
	void setPayloadParameter(ReferenceUsage value);

	/**
	 * Returns the value of the '<em><b>Payload Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An Expression whose result is bound to the <code><em>payload</em></code> parameter of this AcceptActionUsage. If provided, the AcceptActionUsage will only accept a <code><em>Transfer</em></code> with exactly this <code><em>payload</em></code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Argument</em>' reference.
	 * @see #setPayloadArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAcceptActionUsage_PayloadArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='acceptingActionUsage'"
	 * @generated
	 */
	Expression getPayloadArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AcceptActionUsage#getPayloadArgument <em>Payload Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Argument</em>' reference.
	 * @see #getPayloadArgument()
	 * @generated
	 */
	void setPayloadArgument(Expression value);
} // AcceptActionUsage
