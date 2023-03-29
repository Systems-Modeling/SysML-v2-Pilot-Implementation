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
 * A representation of the model object '<em><b>Verification Case Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>VerificationCaseDefinition</code> is a <code>CaseDefinition</code> for the purpose of verification of the subject of the case against its requirements.</p>
 * verifiedRequirement =
 *     if objectiveRequirement = null then OrderedSet{}
 *     else 
 *         objectiveRequirement.featureMembership->
 *             selectByKind(RequirementVerificationMembership).
 *             verifiedRequirement->asOrderedSet()
 *     endif
 * specializesFromLibrary('VerificationCases::VerificationCase')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.VerificationCaseDefinition#getVerifiedRequirement <em>Verified Requirement</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVerificationCaseDefinition()
 * @model
 * @generated
 */
public interface VerificationCaseDefinition extends CaseDefinition {

	/**
	 * Returns the value of the '<em><b>Verified Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RequirementUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>RequirementUsages</code> verified by this <code>VerificationCaseDefinition</code>, which are the <code>verifiedRequirements</code> of all <code>RequirementVerificationMemberships</code> of the <code>objectiveRequirement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verified Requirement</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVerificationCaseDefinition_VerifiedRequirement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='verifyingCaseDefinition'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<RequirementUsage> getVerifiedRequirement();
} // VerificationCaseDefinition
