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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An AssertConstraintUsage is a ConstraintUsage that is also an Invariant and, so, is asserted to be true. The asserted ConstraintUsage (which may be the AssertConstraintUsage itself) is related to the AssertConstraintUsage by a Subsetting relationship.</p>
 * 
 * <p>If the AssertConstraintUsage is owned by a Part, then it also subsets the <code>assertedConstraints</code> property of that Part (as defined in the library model for Part), otherwise it subsets <code>constraintChecks</code>, as required for a regular ConstraintUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AssertConstraintUsage#getAssertedConstraint <em>Asserted Constraint</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssertConstraintUsage()
 * @model
 * @generated
 */
public interface AssertConstraintUsage extends ConstraintUsage, Invariant {
	/**
	 * Returns the value of the '<em><b>Asserted Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConstraintUsage to be performed by the AssertConstraintUsage. It is the <tt>subsettedFeature</tt> of the first owned Subsetting Relationship of the AssertConstraintUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asserted Constraint</em>' reference.
	 * @see #setAssertedConstraint(ConstraintUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssertConstraintUsage_AssertedConstraint()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constraintAssertion'"
	 * @generated
	 */
	ConstraintUsage getAssertedConstraint();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AssertConstraintUsage#getAssertedConstraint <em>Asserted Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asserted Constraint</em>' reference.
	 * @see #getAssertedConstraint()
	 * @generated
	 */
	void setAssertedConstraint(ConstraintUsage value);

} // AssertConstraintUsage
