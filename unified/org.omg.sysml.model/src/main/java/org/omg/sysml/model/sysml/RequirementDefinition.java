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
package org.omg.sysml.model.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>RequirementDefinition</code> is a <code>ConstraintDefinition</code> that defines a requirement used in the context of a specification as a constraint that a valid solution must satisfy. The specification is relative to a specified subject, possibly in collaboration with one or more external actors.</p>
 * text = documentation.body
 * assumedConstraint = ownedFeatureMembership->
 *     selectByKind(RequirementConstraintMembership)->
 *     select(kind = RequirementConstraintKind::assumption).
 *     ownedConstraint
 * requiredConstraint = ownedFeatureMembership->
 *     selectByKind(RequirementConstraintMembership)->
 *     select(kind = RequirementConstraintKind::requirement).
 *     ownedConstraint
 * subjectParameter =
 *     let subjects : OrderedSet(SubjectMembership) = 
 *         featureMembership->selectByKind(SubjectMembership) in
 *     if subjects->isEmpty() then null
 *     else subjects->first().ownedSubjectParameter
 *     endif
 * framedConcern = featureMembership->
 *     selectByKind(FramedConcernMembership).
 *     ownedConcern
 * actorParameter = featureMembership->
 *     selectByKind(ActorMembership).
 *     ownedActorParameter
 * stakeholderParameter = featureMembership->
 *     selectByKind(StakholderMembership).
 *     ownedStakeholderParameter
 * featureMembership->	
 *     selectByKind(SubjectMembership)->
 *     size() <= 1
 * input->notEmpty() and input->first() = subjectParameter
 * specializesFromLibrary('Requirements::RequirementCheck')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.RequirementDefinition#getReqId <em>Req Id</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.RequirementDefinition#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.RequirementDefinition#getActorParameter <em>Actor Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.RequirementDefinition#getAssumedConstraint <em>Assumed Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.RequirementDefinition#getFramedConcern <em>Framed Concern</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.RequirementDefinition#getRequiredConstraint <em>Required Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.RequirementDefinition#getStakeholderParameter <em>Stakeholder Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.RequirementDefinition#getSubjectParameter <em>Subject Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition()
 * @model
 * @generated
 */
public interface RequirementDefinition extends ConstraintDefinition {
	/**
	 * Returns the value of the '<em><b>Req Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An optional modeler-specified identifier for this <code>RequirementDefinition</code> (used, e.g., to link it to an original requirement text in some source document), which is the <code>declaredShortName</code> for the <code>RequirementDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Req Id</em>' attribute.
	 * @see #setReqId(String)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition_ReqId()
	 * @model ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	String getReqId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.RequirementDefinition#getReqId <em>Req Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Id</em>' attribute.
	 * @see #getReqId()
	 * @generated
	 */
	void setReqId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An optional textual statement of the requirement represented by this <code>RequirementDefinition</code>, derived from the <code>bodies</code> of the <code>documentation</code> of the <code>RequirementDefinition</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition_Text()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Actor Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.PartUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>parameters</code> of this <code>RequirementDefinition</code> that represent actors involved in the requirement.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actor Parameter</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition_ActorParameter()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actorOwningRequirementDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<PartUsage> getActorParameter();

	/**
	 * Returns the value of the '<em><b>Assumed Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.ConstraintUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned <code>ConstraintUsages</code> that represent assumptions of this <code>RequirementDefinition</code>, which are the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementDefinition</code> with <code>kind = assumption</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assumed Constraint</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition_AssumedConstraint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='assumingRequirementDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConstraintUsage> getAssumedConstraint();

	/**
	 * Returns the value of the '<em><b>Framed Concern</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.ConcernUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConcernUsages</code> framed by this <code>RequirementDefinition</code>, which are the <code>ownedConcerns</code> of all <code>FramedConcernMemberships</code> of the <code>RequirementDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Framed Concern</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition_FramedConcern()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='framingRequirementDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConcernUsage> getFramedConcern();

	/**
	 * Returns the value of the '<em><b>Required Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.ConstraintUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned <code>ConstraintUsages</code> that represent requirements of this <code>RequirementDefinition</code>, derived as the <code>ownedConstraints</code> of the <code>RequirementConstraintMemberships</code> of the <code>RequirementDefinition</code> with <code>kind</code> = <code>requirement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Constraint</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition_RequiredConstraint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requiringRequirementDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ConstraintUsage> getRequiredConstraint();

	/**
	 * Returns the value of the '<em><b>Stakeholder Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.PartUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>parameters</code> of this <code>RequirementDefinition</code> that represent stakeholders for th requirement.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stakeholder Parameter</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition_StakeholderParameter()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stakholderOwiningRequirementDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<PartUsage> getStakeholderParameter();

	/**
	 * Returns the value of the '<em><b>Subject Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>parameter</code> of this <code>RequirementDefinition</code> that represents its subject.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Parameter</em>' reference.
	 * @see #setSubjectParameter(Usage)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getRequirementDefinition_SubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subjectOwningRequirementDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Usage getSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.RequirementDefinition#getSubjectParameter <em>Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Parameter</em>' reference.
	 * @see #getSubjectParameter()
	 * @generated
	 */
	void setSubjectParameter(Usage value);

} // RequirementDefinition
