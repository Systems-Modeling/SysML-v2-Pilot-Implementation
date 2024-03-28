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
 * <p>An <code>ActionUsage</code> is a <code>Usage</code> that is also a <code>Step</code>, and, so, is typed by a <code>Behavior</code>. Nominally, if the type is an <code>ActionDefinition</code>, an <code>ActionUsage</code> is a <code>Usage</code> of that <code>ActionDefinition</code> within a system. However, other kinds of kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p>
 * 
 * isSubactionUsage() implies
 *     specializesFromLibrary('Actions::Action::subactions')
 * specializesFromLibrary('Actions::actions')
 * isComposite and owningType <> null and
 * (owningType.oclIsKindOf(PartDefinition) or
 *  owningType.oclIsKindOf(PartUsage)) implies
 *     specializesFromLibrary('Parts::Part::ownedActions')
 * owningFeatureMembership <> null and
 * owningFeatureMembership.oclIsKindOf(StateSubactionMembership) implies
 *     let kind : StateSubactionKind = 
 *         owningFeatureMembership.oclAsType(StateSubactionMembership).kind in
 *     if kind = StateSubactionKind::entry then
 *         redefinesFromLibrary('States::StateAction::entryAction')
 *     else if kind = StateSubactionKind::do then
 *         redefinesFromLibrary('States::StateAction::doAction')
 *     else
 *         redefinesFromLibrary('States::StateAction::exitAction')
 *     endif endif
 * owningType <> null and
 *     (owningType.oclIsKindOf(AnalysisCaseDefinition) and
 *         owningType.oclAsType(AnalysisCaseDefinition).analysisAction->
 *             includes(self) or
 *      owningType.oclIsKindOf(AnalysisCaseUsage) and
 *         owningType.oclAsType(AnalysisCaseUsage).analysisAction->
 *             includes(self)) implies
 *     specializesFromLibrary('AnalysisCases::AnalysisCase::analysisSteps')
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
	 * <p>The <code>Behaviors</code> that are the <code>types</code> of this <code>ActionUsage</code>. Nominally, these would be <code>ActionDefinitions</code>, but other kinds of Kernel <code>Behaviors</code> are also allowed, to permit use of <code>Behaviors</code> from the Kernel Model Libraries.</p> 
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
	 * <p>Return the owned input <code>parameters</code> of this <code>ActionUsage</code>.</p>
	 * input->select(f | f.owner = self)
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Feature> inputParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the <code>i</code>-th owned input <code>parameter</code> of the <code>ActionUsage</code>. Return null if the <code>ActionUsage</code> has less than <code>i</code> owned input <code>parameters</code>.</p>
	 * if inputParameters()->size() < i then null
	 * else inputParameters()->at(i)
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false" iDataType="org.omg.sysml.lang.types.Integer" iRequired="true" iOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature inputParameter(int i);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the <code>i</code>-th argument <code>Expression</code> of an <code>ActionUsage</code>, defined as the <code>value</code> <code>Expression</code> of the <code>FeatureValue</code> of the <code>i</code>-th owned input <code>parameter</code> of the <code>ActionUsage</code>. Return null if the <code>ActionUsage</code> has less than <code>i</code> owned input <code>parameters</code> or the <code>i</code>-th owned input <code>parameter</code> has no <code>FeatureValue</code>.</p>
	 * if inputParameter(i) = null then null
	 * else
	 *     let featureValue : Sequence(FeatureValue) = inputParameter(i).
	 *         ownedMembership->select(oclIsKindOf(FeatureValue)) in
	 *     if featureValue->isEmpty() then null
	 *     else featureValue->at(1).value
	 *     endif
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false" iDataType="org.omg.sysml.lang.types.Integer" iRequired="true" iOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression argument(int i);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check if this <code>ActionUsage</code> is composite and has an <code>owningType</code> that is an <code>ActionDefinition</code> or <code>ActionUsage</code> but is <em>not</em> the <code>entryAction</code> or <code>exitAction</em></code> of a <code>StateDefinition</code> or <code>StateUsage</code>. If so, then it represents an <code><em>Action</em></code> that is a <code><em>subaction</em></code> of another <code><em>Action</em></code>.</p>
	 * isComposite and owningType <> null and
	 * (owningType.oclIsKindOf(ActionDefinition) or
	 *  owningType.oclIsKindOf(ActionUsage)) and
	 * (owningFeatureMembership.oclIsKindOf(StateSubactionMembership) implies
	 *  owningFeatureMembership.oclAsType(StateSubactionMembership).kind = 
	 *     StateSubactionKind::do)
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isSubactionUsage();

} // Action
