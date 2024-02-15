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
 * A representation of the model object '<em><b>Case Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>CaseDefinition</code> is a <code>CalculationDefinition</code> for a process, often involving collecting evidence or data, relative to a subject, possibly involving the collaboration of one or more other actors, producing a result that meets an objective.</p>
 * objectiveRequirement = 
 *     let objectives: OrderedSet(RequirementUsage) = 
 *         featureMembership->
 *             selectByKind(ObjectiveMembership).
 *             ownedRequirement in
 *     if objectives->isEmpty() then null
 *     else objectives->first().ownedObjectiveRequirement
 *     endif
 * featureMembership->
 *     selectByKind(ObjectiveMembership)->
 *     size() <= 1
 * subjectParameter =
 *     let subjectMems : OrderedSet(SubjectMembership) = 
 *         featureMembership->selectByKind(SubjectMembership) in
 *     if subjectMems->isEmpty() then null
 *     else subjectMems->first().ownedSubjectParameter
 *     endif
 * actorParameter = featureMembership->
 *     selectByKind(ActorMembership).
 *     ownedActorParameter
 * featureMembership->selectByKind(SubjectMembership)->size() <= 1
 * input->notEmpty() and input->first() = subjectParameter
 * specializesFromLibrary('Cases::Case')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.CaseDefinition#getObjectiveRequirement <em>Objective Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.CaseDefinition#getSubjectParameter <em>Subject Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.CaseDefinition#getActorParameter <em>Actor Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseDefinition()
 * @model
 * @generated
 */
public interface CaseDefinition extends CalculationDefinition {
	/**
	 * Returns the value of the '<em><b>Subject Parameter</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getParameter() <em>Parameter</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>parameter</code> of this <code>CaseDefinition</code> that represents its subject.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Parameter</em>' reference.
	 * @see #setSubjectParameter(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseDefinition_SubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subjectOwningCaseDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Usage getSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CaseDefinition#getSubjectParameter <em>Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Parameter</em>' reference.
	 * @see #getSubjectParameter()
	 * @generated
	 */
	void setSubjectParameter(Usage value);

	/**
	 * Returns the value of the '<em><b>Actor Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PartUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getParameter() <em>Parameter</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>parameters</code> of this <code>CaseDefinition</code> that represent actors involved in the case.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor Parameter</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseDefinition_ActorParameter()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actorOwningCaseDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<PartUsage> getActorParameter();

	/**
	 * Returns the value of the '<em><b>Objective Requirement</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RequirementUsage</code> representing the objective of this <code>CaseDefinition</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective Requirement</em>' reference.
	 * @see #setObjectiveRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseDefinition_ObjectiveRequirement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectiveOwningCaseDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RequirementUsage getObjectiveRequirement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CaseDefinition#getObjectiveRequirement <em>Objective Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Requirement</em>' reference.
	 * @see #getObjectiveRequirement()
	 * @generated
	 */
	void setObjectiveRequirement(RequirementUsage value);

} // CaseDefinition
