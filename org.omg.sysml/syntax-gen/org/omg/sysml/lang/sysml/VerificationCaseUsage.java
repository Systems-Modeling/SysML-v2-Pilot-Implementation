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
 * A representation of the model object '<em><b>Verification Case Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VerificationCaseUsage is a Usage of a VerificationCaseDefinition.</p>
 * 
 * <p>A VerificationCaseUsage must subset, directly or indirectly, either the base VerificationCaseUsage <code>verificationCases</code> from the Systems model library, if it is not owned by a VerificationCaseDefinition or VerificationCaseUsage, or the VerificationCaseUsage <code>subVerificationCases</code> inherited from its owner, otherwise.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.VerificationCaseUsage#getVerificationCaseDefinition <em>Verification Case Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.VerificationCaseUsage#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVerificationCaseUsage()
 * @model
 * @generated
 */
public interface VerificationCaseUsage extends CaseUsage {
	/**
	 * Returns the value of the '<em><b>Verification Case Definition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.CaseUsage#getCaseDefinition() <em>Case Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The VerificationCase that defines this VerificationCaseUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verification Case Definition</em>' reference.
	 * @see #setVerificationCaseDefinition(VerificationCaseDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVerificationCaseUsage_VerificationCaseDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedVerificationCase'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	VerificationCaseDefinition getVerificationCaseDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.VerificationCaseUsage#getVerificationCaseDefinition <em>Verification Case Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Case Definition</em>' reference.
	 * @see #getVerificationCaseDefinition()
	 * @generated
	 */
	void setVerificationCaseDefinition(VerificationCaseDefinition value);

	/**
	 * Returns the value of the '<em><b>Verified Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RequirementUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RequirementUsages verified by this VerificationCaseUsage, derived as the <code>verifiedRequirements</code> of all RequirementVerificationMemberships of the <code>objectiveRequirement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified Requirement</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVerificationCaseUsage_VerifiedRequirement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='verifyingCase'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<RequirementUsage> getVerifiedRequirement();

} // VerificationCaseUsage
