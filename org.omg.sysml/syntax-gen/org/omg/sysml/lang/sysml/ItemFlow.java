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
 * <p>An ItemFlow is a Step that represents the transfer of objects or values from one Feature to another. ItemFlows can take non-zero time to complete.</p>
 * 
 * <p>An ItemFlow must be typed by the Interaction <em><code>Transfer</code></em> from the Kernel Semantic Library, or a specialization of it.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemType <em>Item Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getTargetInputFeature <em>Target Input Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getSourceOutputFeature <em>Source Output Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFlowEnd <em>Item Flow End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFeature <em>Item Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFlowFeature <em>Item Flow Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemFlow#getInteraction <em>Interaction</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow()
 * @model
 * @generated
 */
public interface ItemFlow extends Connector, Step {
	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' reference list. The list
	 * contents are of type {@link org.omg.sysml.lang.sysml.Classifier}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Item Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemType()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Classifier> getItemType();

	/**
	 * Returns the value of the '<em><b>Target Input Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Input Feature</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that receives the ItemFlow. It must be an owned <code>output</code> of the target participant of the ItemFlow. If there is no such Feature, then the ItemFlow must be abstract.</p>
	 * <p>The Feature that receives the ItemFlow.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Input Feature</em>' reference.
	 * @see #setTargetInputFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_TargetInputFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='itemFlowToInput'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getTargetInputFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ItemFlow#getTargetInputFeature <em>Target Input Feature</em>}' reference.
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
	 * <p>The Feature that originates the ItemFlow. It must be an owned <code>output</code> of the <code>source</code>  of the ItemFlow. If there is no such Feature, then the ItemFlow must be abstract.</p>
	 * 
	 * <p>The Feature that originates the ItemFlow.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Output Feature</em>' reference.
	 * @see #setSourceOutputFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_SourceOutputFeature()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='itemFlowFromOutput'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getSourceOutputFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ItemFlow#getSourceOutputFeature <em>Source Output Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Output Feature</em>' reference.
	 * @see #getSourceOutputFeature()
	 * @generated
	 */
	void setSourceOutputFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Item Flow End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemFlowEnd}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd() <em>Connector End</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Flow End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>connectorEnd</code> of this ItemFlow. (IMPL)</p>
	 * 
	 * <p>TBD. Uses a class from the Interactions IMPL package.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Flow End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemFlowEnd()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ItemFlowEnd> getItemFlowEnd();

	/**
	 * Returns the value of the '<em><b>Item Feature</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature representing the Item in transit between the source and the target during the transfer. (IMPL)</p>
	 * 
	 * <p>This Feature represents the Item in transit between the source and the target during the transfer.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Feature</em>' reference.
	 * @see #setItemFeature(ItemFeature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemFeature()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ItemFeature getItemFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ItemFlow#getItemFeature <em>Item Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Feature</em>' reference.
	 * @see #getItemFeature()
	 * @generated
	 */
	void setItemFeature(ItemFeature value);

	/**
	 * Returns the value of the '<em><b>Item Flow Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemFlowFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Flow Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>sourceOutputFeatures</code> and <code>targetInputFeatures</code> of this ItemFlow. (IMPL).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Flow Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_ItemFlowFeature()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ItemFlowFeature> getItemFlowFeature();

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
	 * <p>The Interactions that type this ItemFlow. Interactions are both Associations (which type Connectors) and Behaviors (which type Steps).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interaction</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemFlow_Interaction()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Interaction> getInteraction();

} // ItemFlow
