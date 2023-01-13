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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>ActionUsage</code> is a <code>Usage</code> that is also a <code>Step</code>, and, so, is typed by a <code>Behavior</code>. Nominally, if the type is an <code>ActionDefinition</code>, an <code>ActionUsage</code> is a <code>Usage</code> of that <code>ActionDefinition</code> within a system. However, other kinds of kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behavior</code> from the Kernel Model Libraries.</p>
 * 
 * specializesFromLibrary('Actions::actions')
 * isComposite and owningType <> null and
 * (owningType.oclIsKindOf(ActionDefinition) or
 *  owningType.oclIsKindOf(ActionUsage)) implies
 *     specializesFromLibrary('Actions::Action::subactions')
 * isComposite and owningType <> null and
 * (owningType.oclIsKindOf(PartDefinition) or
 *  owningType.oclIsKindOf(PartUsage)) implies
 *     specializesFromLibrary('Parts::Part::ownedActions')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ActionUsage#getActionDefinition <em>Action Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActionUsage()
 * @model
 * @generated
 */
public interface ActionUsage extends OccurrenceUsage, Step {
	/**
	 * Returns the value of the '<em><b>Action Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Behavior}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Step#getBehavior() <em>Behavior</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getOccurrenceDefinition() <em>Occurrence Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Behaviors that are the types of this ActionUsage. Nominally, these would be ActionDefinitions, but other kinds of Kernel Behaviors are also allowed, to permit use of Behaviors from the Kernel Library.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActionUsage_ActionDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedAction'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Behavior> getActionDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the owned input <code>parameters</code> of this ActionUsage.</p>
	 * input->select(f | f.owner = self)
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> inputParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the <code>i<code>-th argument Expression of an ActionUsage, defined as the <code>value</code> Expression of the FeatureValue of the <code>i<code>-th owned <code>parameter</code> of the ActionUsage. Return null if the ActionUsage has less than <code>i<code> owned <code>parameters</code> or the <code>i<code>-th owned <code>parameter</code> has no FeatureValue.</code>
	 * let ownedInputParameters : Sequence(Feature) = input->select(owner = self) in
	 * if ownedInputParameters->size() < i then null
	 * else
	 *     let featureValue : Sequence(FeatureValue) = ownedInputParameters->at(i).
	 *         ownedMembership->select(oclIsKindOf(FeatureValue)) in
	 *     if featureValue->isEmpty() then null
	 *     else featureValue->at(1).value
	 *     endif
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false" iDataType="org.omg.sysml.lang.types.Integer" iRequired="true" iOrdered="false"
	 * @generated
	 */
	Expression argument(int i);

} // Action
