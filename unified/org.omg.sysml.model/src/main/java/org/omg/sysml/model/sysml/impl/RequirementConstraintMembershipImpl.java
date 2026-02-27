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
package org.omg.sysml.model.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.ConstraintUsage;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.RequirementConstraintKind;
import org.omg.sysml.model.sysml.RequirementConstraintMembership;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Constraint Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementConstraintMembershipImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementConstraintMembershipImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementConstraintMembershipImpl#getReferencedConstraint <em>Referenced Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementConstraintMembershipImpl extends FeatureMembershipImpl implements RequirementConstraintMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementConstraintMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementConstraintKind getKind() {
		return (RequirementConstraintKind)eGet(SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(RequirementConstraintKind newKind) {
		eSet(SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getOwnedConstraint() {
		return (ConstraintUsage)eGet(SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedConstraint(ConstraintUsage newOwnedConstraint) {
		eSet(SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_CONSTRAINT, newOwnedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getReferencedConstraint() {
		return (ConstraintUsage)eGet(SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP__REFERENCED_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedConstraint(ConstraintUsage newReferencedConstraint) {
		eSet(SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP__REFERENCED_CONSTRAINT, newReferencedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature() {
		var sourceValue = this.getOwnedConstraint();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Feature typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Feature typedValue) {
			return typedValue;
		}
		return null;
	}

} //RequirementConstraintMembershipImpl
