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

import org.omg.sysml.model.sysml.AssertConstraintUsage;
import org.omg.sysml.model.sysml.ConstraintUsage;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Invariant;
import org.omg.sysml.model.sysml.RequirementUsage;
import org.omg.sysml.model.sysml.SatisfyRequirementUsage;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satisfy Requirement Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SatisfyRequirementUsageImpl#isIsNegated <em>Is Negated</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SatisfyRequirementUsageImpl#getAssertedConstraint <em>Asserted Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SatisfyRequirementUsageImpl#getSatisfiedRequirement <em>Satisfied Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.SatisfyRequirementUsageImpl#getSatisfyingFeature <em>Satisfying Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatisfyRequirementUsageImpl extends RequirementUsageImpl implements SatisfyRequirementUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfyRequirementUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNegated() {
		return (Boolean)eGet(SysMLPackage.Literals.INVARIANT__IS_NEGATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNegated(boolean newIsNegated) {
		eSet(SysMLPackage.Literals.INVARIANT__IS_NEGATED, newIsNegated);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getAssertedConstraint() {
		var sourceValue = this.getSatisfiedRequirement();
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
	public void setAssertedConstraint(ConstraintUsage newAssertedConstraint) {
		eSet(SysMLPackage.Literals.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT, newAssertedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getSatisfiedRequirement() {
		return (RequirementUsage)eGet(SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSatisfiedRequirement(RequirementUsage newSatisfiedRequirement) {
		eSet(SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT, newSatisfiedRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSatisfyingFeature() {
		return (Feature)eGet(SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSatisfyingFeature(Feature newSatisfyingFeature) {
		eSet(SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE, newSatisfyingFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Invariant.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED: return SysMLPackage.INVARIANT__IS_NEGATED;
				default: return -1;
			}
		}
		if (baseClass == AssertConstraintUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT: return SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Invariant.class) {
			switch (baseFeatureID) {
				case SysMLPackage.INVARIANT__IS_NEGATED: return SysMLPackage.SATISFY_REQUIREMENT_USAGE__IS_NEGATED;
				default: return -1;
			}
		}
		if (baseClass == AssertConstraintUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT: return SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SatisfyRequirementUsageImpl
