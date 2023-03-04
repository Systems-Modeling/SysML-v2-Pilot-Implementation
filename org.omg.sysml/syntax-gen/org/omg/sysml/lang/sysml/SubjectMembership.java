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
 * A representation of the model object '<em><b>Subject Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>SubjectMembership</code> is a <code>ParameterMembership</code> that indicates that its <code>ownedSubjectParameter</code> is the subject of its <code>owningType</code>. The <code>owningType</code> of a <code>SubjectMembership</code> must be a <code>RequirementDefinition</code>, <code>RequirementUsage</code>, <code>CaseDefinition</code>, or <code>CaseUsage</code>.</p>
 * owningType.oclIsType(RequirementDefinition) or
 * owningType.oclIsType(RequiremenCaseRequirementDefinition) or
 * owningType.oclIsType(CaseDefinition) or
 * owningType.oclIsType(CaseUsage)
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SubjectMembership#getOwnedSubjectParameter <em>Owned Subject Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubjectMembership()
 * @model
 * @generated
 */
public interface SubjectMembership extends ParameterMembership {
	/**
	 * Returns the value of the '<em><b>Owned Subject Parameter</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter() <em>Owned Member Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Subject Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usage</code< that is the <code>ownedMemberParameter</code> of this <code>SubjectMembership</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Subject Parameter</em>' reference.
	 * @see #setOwnedSubjectParameter(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubjectMembership_OwnedSubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningSubjectMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Usage getOwnedSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SubjectMembership#getOwnedSubjectParameter <em>Owned Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Subject Parameter</em>' reference.
	 * @see #getOwnedSubjectParameter()
	 * @generated
	 */
	void setOwnedSubjectParameter(Usage value);

} // SubjectMembership
