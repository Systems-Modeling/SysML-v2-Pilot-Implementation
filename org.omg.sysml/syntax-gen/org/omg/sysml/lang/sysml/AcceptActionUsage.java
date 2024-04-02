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
 * <p>An <code>AcceptActionUsage</code> is an <code>ActionUsage</code> that specifies the acceptance of an <em><code>incomingTransfer</code></em> from the <code><em>Occurrence</em></code> given by the result of its <code>receiverArgument</code> Expression. (If no <code>receiverArgument</code> is provided, the default is the <em><code>this</code></em> context of the AcceptActionUsage.) The payload of the accepted <em><code>Transfer</em></code> is output on its <code>payloadParameter</code>. Which <em><code>Transfers</em></code> may be accepted is determined by conformance to the typing and (potentially) binding of the <code>payloadParameter</code>.</p>
 * 
 * inputParameters()->size() >= 2
 * receiverArgument = argument(2)
 * payloadArgument = argument(1)
 * payloadParameter = 
 *  if parameter->isEmpty() then null
 *  else parameter->first() endif
 * not isTriggerAction() implies
 *     specializesFromLibrary('Actions::acceptActions')
 * isSubactionUsage() and not isTriggerAction() implies
 *     specializesFromLibrary('Actions::Action::acceptSubactions')
 * isTriggerAction() implies
 *     specializesFromLibrary('Actions::TransitionAction::accepter')
 * payloadArgument <> null and
 * payloadArgument.oclIsKindOf(TriggerInvocationExpression) implies
 *     let invocation : Expression =
 *         payloadArgument.oclAsType(Expression) in
 *     parameter->size() >= 2 and
 *     invocation.parameter->size() >= 2 and        
 *     ownedFeature->selectByKind(BindingConnector)->exists(b |
 *         b.relatedFeatures->includes(parameter->at(2)) and
 *         b.relatedFeatures->includes(invocation.parameter->at(2)))
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
	 * <p>An <code>Expression</code> whose <code>result</code> is bound to the <em><code>receiver</code></em> input <code>parameter</code> of this <code>AcceptActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver Argument</em>' reference.
	 * @see #setReceiverArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAcceptActionUsage_ReceiverArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='acceptActionUsage'"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getParameter() <em>Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>nestedReference</code> of this <code>AcceptActionUsage</code> that redefines the <code>payload</code> output <code>parameter</code> of the base <code>AcceptActionUsage</code> <em><code>AcceptAction</code></em> from the Systems Model Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Parameter</em>' reference.
	 * @see #setPayloadParameter(ReferenceUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAcceptActionUsage_PayloadParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningAcceptActionUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * <p>An <code>Expression</code> whose <code>result</code> is bound to the <code><em>payload</em></code> <code>parameter</code> of this <code>AcceptActionUsage</code>. If provided, the <code>AcceptActionUsage</code> will only accept a <code><em>Transfer</em></code> with exactly this <code><em>payload</em></code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Argument</em>' reference.
	 * @see #setPayloadArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAcceptActionUsage_PayloadArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='acceptingActionUsage'"
	 *        annotation="http://www.omg.org/spec/SysML"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check if this <code>AcceptActionUsage</code> is the <code>triggerAction</code> of a <code>TransitionUsage</code>.</p>
	 * owningType <> null and 
	 * owningType.oclIsKindOf(TransitionUsage) and
	 * owningType.oclAsType(TransitionUsage).triggerAction->includes(self)
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isTriggerAction();
} // AcceptActionUsage
