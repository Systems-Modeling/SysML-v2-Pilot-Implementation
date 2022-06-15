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
 * A representation of the model object '<em><b>Satisfy Requirement Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A SatisfyRequirementUsage is an AssertConstraintUsage that asserts, by default, that a satisfied RequirementUsage is true for a specific <code>satisfyingSubject</code>, or, if <code>isNegated = true</code>, that the RequirementUsage is false. The satisfied RequirementUsage is related to the SatisfyRequirementUsage by a Subsetting relationship.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage#getSatisfiedRequirement <em>Satisfied Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage#getSatisfyingFeature <em>Satisfying Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSatisfyRequirementUsage()
 * @model
 * @generated
 */
public interface SatisfyRequirementUsage extends RequirementUsage, AssertConstraintUsage {
	/**
	 * Returns the value of the '<em><b>Satisfied Requirement</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.AssertConstraintUsage#getAssertedConstraint() <em>Asserted Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RequirementUsage that is satisfied by the <tt>satisfyingSubject</tt> of this SatisfyRequirementUsage. It is the <tt>subsettedFeature</tt> of the first owned Subsetting Relationship of the SatisfyRequirementUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied Requirement</em>' reference.
	 * @see #setSatisfiedRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSatisfyRequirementUsage_SatisfiedRequirement()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementSatisfaction'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RequirementUsage getSatisfiedRequirement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage#getSatisfiedRequirement <em>Satisfied Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied Requirement</em>' reference.
	 * @see #getSatisfiedRequirement()
	 * @generated
	 */
	void setSatisfiedRequirement(RequirementUsage value);

	/**
	 * Returns the value of the '<em><b>Satisfying Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfying Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that represents the actual subject that is asserted to satisfy the <tt>satisfiedRequirement</tt>. The <tt>satisfyingFeature</tt> must be the target of a BindingConnector from the <tt>subjectParameter</tt> of the <tt>satisfiedRequirement</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfying Feature</em>' reference.
	 * @see #setSatisfyingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSatisfyRequirementUsage_SatisfyingFeature()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='satisfiedRequirement'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getSatisfyingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SatisfyRequirementUsage#getSatisfyingFeature <em>Satisfying Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfying Feature</em>' reference.
	 * @see #getSatisfyingFeature()
	 * @generated
	 */
	void setSatisfyingFeature(Feature value);

} // SatisfyRequirementUsage
