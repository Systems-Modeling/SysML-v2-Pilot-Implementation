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

import org.omg.sysml.model.sysml.ConcernUsage;
import org.omg.sysml.model.sysml.ConstraintUsage;
import org.omg.sysml.model.sysml.FramedConcernMembership;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framed Concern Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FramedConcernMembershipImpl#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FramedConcernMembershipImpl#getReferencedConcern <em>Referenced Concern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FramedConcernMembershipImpl extends RequirementConstraintMembershipImpl implements FramedConcernMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramedConcernMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernUsage getOwnedConcern() {
		return (ConcernUsage)eGet(SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedConcern(ConcernUsage newOwnedConcern) {
		eSet(SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP__OWNED_CONCERN, newOwnedConcern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernUsage getReferencedConcern() {
		return (ConcernUsage)eGet(SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedConcern(ConcernUsage newReferencedConcern) {
		eSet(SysMLPackage.Literals.FRAMED_CONCERN_MEMBERSHIP__REFERENCED_CONCERN, newReferencedConcern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getOwnedConstraint() {
		var sourceValue = this.getOwnedConcern();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof ConstraintUsage typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof ConstraintUsage typedValue) {
			return typedValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getReferencedConstraint() {
		var sourceValue = this.getReferencedConcern();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof ConstraintUsage typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof ConstraintUsage typedValue) {
			return typedValue;
		}
		return null;
	}

} //FramedConcernMembershipImpl
