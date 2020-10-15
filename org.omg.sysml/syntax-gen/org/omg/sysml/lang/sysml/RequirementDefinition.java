/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 * A representation of the model object '<em><b>Requirement Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A RequirementDefinition is a ConstraintDefinition that defines a requirement as a constraint that is used in the context of a specification that a valid solution must satisfy.</p>
 * 
 * <p>A RequirementDefinition must subclass, directly or indirectly, the base RequirementDefinition RequirementCheck from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getReqId <em>Req Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getAssumedConstraint <em>Assumed Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getRequiredConstraint <em>Required Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.RequirementDefinition#getSubjectParameter <em>Subject Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition()
 * @model
 * @generated
 */
public interface RequirementDefinition extends ConstraintDefinition {
	/**
	 * Returns the value of the '<em><b>Subject Parameter</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getParameter() <em>Parameter</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>parameter</code> of this RequirementDefinition that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base RequirementDefinition RequirementCheck from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Parameter</em>' reference.
	 * @see #setSubjectParameter(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_SubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parameteredRequirementDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	Usage getSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementDefinition#getSubjectParameter <em>Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Parameter</em>' reference.
	 * @see #getSubjectParameter()
	 * @generated
	 */
	void setSubjectParameter(Usage value);

	/**
	 * Returns the value of the '<em><b>Req Id</b></em>' attribute.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getHumanId() <em>Human Id</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An optional modeler-specified identifier for this RequirementDefinition (used, e.g., to link it to an original requirement text in some source document), derived as the <code>modeledId</code> for the RequirementDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Req Id</em>' attribute.
	 * @see #setReqId(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_ReqId()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	String getReqId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RequirementDefinition#getReqId <em>Req Id</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An optional textual statement of the requirement represented by this RequirementDefinition, derived as the <code>bodies<code> of the <code>documentaryComments</code> of the RequirementDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_Text()
	 * @model dataType="org.omg.sysml.lang.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<String> getText();

	/**
	 * Returns the value of the '<em><b>Assumed Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumed Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned ConstraintUsages that represent requirements of this RequirementDefinition. These are derived as the ConstraintUsages related to the RequirementDefinition by a RequirementConstraintMembership with <tt>kind</tt> = <tt>requirement</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assumed Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_AssumedConstraint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='assumingRequirementDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConstraintUsage> getAssumedConstraint();

	/**
	 * Returns the value of the '<em><b>Required Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned ConstraintUsages that represent requirements of this RequirementDefinitionb. These are derived as the ConstraintUsages related to the RequirementDefinition by a RequirementConstraintMembership with <tt>kind</tt> = <tt>requirement</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementDefinition_RequiredConstraint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requiringRequirementDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConstraintUsage> getRequiredConstraint();

} // RequirementDefinition
