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
 * <p>A <code>SatisfyRequirementUsage</code> is an <code>AssertConstraintUsage</code> that asserts, by default, that a satisfied <code>RequirementUsage</code> is true for a specific <code>satisfyingFeature</code>, or, if <code>isNegated = true</code>, that the <code>RequirementUsage</code> is false. The satisfied <code>RequirementUsage</code> is related to the <code>SatisfyRequirementUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>.</p>
 * satisfyingFeature =
 *     let bindings: BindingConnector = ownedMember->
 *         selectByKind(BindingConnector)->
 *         select(b | b.relatedElement->includes(subjectParameter)) in
 *     if bindings->isEmpty() or 
 *        bindings->first().relatedElement->exits(r | r <> subjectParameter) 
 *     then null
 *     else bindings->first().relatedElement->any(r | r <> subjectParameter)
 *     endif
 * ownedMember->selectByKind(BindingConnector)->
 *     select(b |
 *         b.relatedElement->includes(subjectParameter) and
 *         b.relatedElement->exists(r | r <> subjectParameter))->
 *     size() = 1
 * ownedReferenceSubsetting <> null implies
 *     ownedReferenceSubsetting.referencedFeature.oclIsKindOf(RequirementUsage)
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
	 * <p>The <code>RequirementUsage</code> that is satisfied by the <code>satisfyingSubject</code> of this <code>SatisfyRequirementUsage</code>. It is the <code>assertedConstraint</code> of the <code>SatisfyRequirementUsage</code> considered as an <code>AssertConstraintUsage</code>, which must be a <code>RequirementUsage</code>.</p>
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
	 * <p>The <code>Feature</code> that represents the actual subject that is asserted to satisfy the <code>satisfiedRequirement</code>. The <code>satisfyingFeature</code> is bound to the <code>subjectParameter</code> of the <code>SatisfyRequirementUsage</code>.</p>
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
