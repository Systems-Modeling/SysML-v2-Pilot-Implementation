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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Item
 * Flow</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>Flow</code> is a <code>Step</code> that represents the transfer of values from one <code>Feature</code> to another. <code>Flows</code> can take non-zero time to complete.</p>
 * 
 * specializesFromLibrary('Transfers::transfers')
 * payloadType =
 *     if payloadFeature = null then Sequence{}
 *     else payloadFeature.type
 *     endif
 * sourceOutputFeature =
 *     if connectorEnd->isEmpty() or 
 *         connectorEnd.ownedFeature->isEmpty()
 *     then null
 *     else connectorEnd.ownedFeature->first()
 *     endif
 * targetInputFeature =
 *     if connectorEnd->size() < 2 or 
 *         connectorEnd->at(2).ownedFeature->isEmpty()
 *     then null
 *     else connectorEnd->at(2).ownedFeature->first()
 *     endif
 * flowEnd = connectorEnd->selectByKind(FlowEnd)
 * payloadFeature =
 *     let payloadFeatures : Sequence(PayloadFeature) =
 *         ownedFeature->selectByKind(PayloadFeature) in
 *     if payloadFeatures->isEmpty() then null
 *     else payloadFeatures->first()
 *     endif
 * ownedFeature->selectByKind(PayloadFeature)->size() <= 1
 * ownedEndFeatures->notEmpty() implies
 *     specializesFromLibrary('Transfers::flowTransfers')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Flow#getPayloadType <em>Payload Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Flow#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Flow#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Flow#getFlowEnd <em>Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Flow#getPayloadFeature <em>Payload Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Flow#getInteraction <em>Interaction</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends Connector, Step {
	/**
	 * Returns the value of the '<em><b>Payload Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The type of values transferred, which is the <code>type</code> of the <code>payloadFeature</code> of the <code>Flow</code>.</p>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlow_PayloadType()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowForPayloadType'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Classifier> getPayloadType();

	/**
	 * Returns the value of the '<em><b>Target Input Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Input Feature</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that receives the values carried by the <code>Flow</code>. It must be a <code>feature</code> of the <code>target</code> of the <code>Flow</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Input Feature</em>' reference.
	 * @see #setTargetInputFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlow_TargetInputFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowToInput'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getTargetInputFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Flow#getTargetInputFeature <em>Target Input Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Input Feature</em>' reference.
	 * @see #getTargetInputFeature()
	 * @generated
	 */
	void setTargetInputFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Source Output Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Output Feature</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that provides the items carried by the <code>Flow</code>. It must be a <code>feature</code> of the <code>source</code> of the <code>Flow</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Output Feature</em>' reference.
	 * @see #setSourceOutputFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlow_SourceOutputFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowFromOutput'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getSourceOutputFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Flow#getSourceOutputFeature <em>Source Output Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Output Feature</em>' reference.
	 * @see #getSourceOutputFeature()
	 * @generated
	 */
	void setSourceOutputFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Flow End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FlowEnd}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd() <em>Connector End</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>connectorEnds</code> of this <code>Flow</code> that are <code>FlowEnds</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlow_FlowEnd()
	 * @model upper="2" transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringFlow'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<FlowEnd> getFlowEnd();

	/**
	 * Returns the value of the '<em><b>Payload Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedFeature</code> of the <code>Flow</code> that is a <code>PayloadFeature</code> (if any).</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Feature</em>' reference.
	 * @see #setPayloadFeature(PayloadFeature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlow_PayloadFeature()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowWithPayloadFeature'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	PayloadFeature getPayloadFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Flow#getPayloadFeature <em>Payload Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Feature</em>' reference.
	 * @see #getPayloadFeature()
	 * @generated
	 */
	void setPayloadFeature(PayloadFeature value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Interaction}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getAssociation() <em>Association</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getBehavior() <em>Behavior</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Interactions</code> that type this <code>Flow</code>. <code>Interactions</code> are both <code>Associations</code> and <code>Behaviors</code>, which can type <code>Connectors</code> and <code>Steps</code>, respectively.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlow_Interaction()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedFlow'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Interaction> getInteraction();

} // ItemFlow
