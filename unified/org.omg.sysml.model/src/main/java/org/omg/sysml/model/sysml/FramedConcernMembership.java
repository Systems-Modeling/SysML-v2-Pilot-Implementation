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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Framed Concern Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FramedConcernMembership</code> is a <code>RequirementConstraintMembership</code> for a framed <code>ConcernUsage</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage</code>.</p>
 * kind = RequirementConstraintKind::requirement
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.FramedConcernMembership#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.FramedConcernMembership#getReferencedConcern <em>Referenced Concern</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getFramedConcernMembership()
 * @model
 * @generated
 */
public interface FramedConcernMembership extends RequirementConstraintMembership {
	/**
	 * Returns the value of the '<em><b>Owned Concern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConcernUsage</code> that is the <code>ownedConstraint</code> of this <code>FramedConcernMembership</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Concern</em>' reference.
	 * @see #setOwnedConcern(ConcernUsage)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFramedConcernMembership_OwnedConcern()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='framedConstraintMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ConcernUsage getOwnedConcern();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.FramedConcernMembership#getOwnedConcern <em>Owned Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Concern</em>' reference.
	 * @see #getOwnedConcern()
	 * @generated
	 */
	void setOwnedConcern(ConcernUsage value);

	/**
	 * Returns the value of the '<em><b>Referenced Concern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The <code>ConcernUsage</code> that is referenced through this <code>FramedConcernMembership</code>. It is the <code>referencedConstraint</code> of the <code>FramedConcernMembership</code> considered as a <code>RequirementConstraintMembership</code>, which must be a <code>ConcernUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Concern</em>' reference.
	 * @see #setReferencedConcern(ConcernUsage)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFramedConcernMembership_ReferencedConcern()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencingConcernMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ConcernUsage getReferencedConcern();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.FramedConcernMembership#getReferencedConcern <em>Referenced Concern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Concern</em>' reference.
	 * @see #getReferencedConcern()
	 * @generated
	 */
	void setReferencedConcern(ConcernUsage value);

} // FramedConcernMembership
