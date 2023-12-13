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
 * A representation of the model object '<em><b>Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ConstraintUsage</code> is an <code>OccurrenceUsage</code> that is also a <code>BooleanExpression</code>, and, so, is typed by a <code>Predicate</code>. Nominally, if the type is a <code>ConstraintDefinition</code>, a <code>ConstraintUsage</code> is a <code>Usage</code> of that <code>ConstraintDefinition</code>. However, other kinds of kernel <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p>
 * owningFeatureMembership <> null and
 * owningFeatureMembership.oclIsKindOf(RequirementConstraintMembership) implies
 *     if owningFeatureMembership.oclAsType(RequirementConstraintMembership).kind = 
 *         RequirementConstraintKind::assumption then
 *         specializesFromLibrary('Requirements::RequirementCheck::assumptions')
 *     else
 *         specializesFromLibrary('Requirements::RequirementCheck::constraints')
 *     endif
 * specializesFromLibrary('Constraints::constraintChecks')
 * owningType <> null and
 * (owningType.oclIsKindOf(ItemDefinition) or
 *  owningType.oclIsKindOf(ItemUsage)) implies
 *     specializesFromLibrary('Items::Item::checkedConstraints')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintDefinition <em>Constraint Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConstraintUsage()
 * @model
 * @generated
 */
public interface ConstraintUsage extends OccurrenceUsage, BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Constraint Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.BooleanExpression#getPredicate() <em>Predicate</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The (single) <code>Predicate</code> that is the type of this <code>ConstraintUsage</code>. Nominally, this will be a <code>ConstraintDefinition</code>, but other kinds of <code>Predicates</code> are also allowed, to permit use of <code>Predicates</code> from the Kernel Model Libraries.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Definition</em>' reference.
	 * @see #setConstraintDefinition(Predicate)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConstraintUsage_ConstraintDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedConstraint'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Predicate getConstraintDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintDefinition <em>Constraint Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Definition</em>' reference.
	 * @see #getConstraintDefinition()
	 * @generated
	 */
	void setConstraintDefinition(Predicate value);

} // ConstraintUsage
