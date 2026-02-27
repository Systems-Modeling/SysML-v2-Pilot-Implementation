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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.ConcernUsage;
import org.omg.sysml.model.sysml.ConstraintUsage;
import org.omg.sysml.model.sysml.PartUsage;
import org.omg.sysml.model.sysml.Predicate;
import org.omg.sysml.model.sysml.RequirementDefinition;
import org.omg.sysml.model.sysml.RequirementUsage;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getReqId <em>Req Id</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getActorParameter <em>Actor Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getAssumedConstraint <em>Assumed Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getFramedConcern <em>Framed Concern</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getRequiredConstraint <em>Required Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getRequirementDefinition <em>Requirement Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getStakeholderParameter <em>Stakeholder Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementUsageImpl#getSubjectParameter <em>Subject Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementUsageImpl extends ConstraintUsageImpl implements RequirementUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REQUIREMENT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReqId() {
		return (String)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__REQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqId(String newReqId) {
		eSet(SysMLPackage.Literals.REQUIREMENT_USAGE__REQ_ID, newReqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getText() {
		return (EList<String>)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getActorParameter() {
		return (EList<PartUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__ACTOR_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getAssumedConstraint() {
		return (EList<ConstraintUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernUsage> getFramedConcern() {
		return (EList<ConcernUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__FRAMED_CONCERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getRequiredConstraint() {
		return (EList<ConstraintUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementDefinition getRequirementDefinition() {
		return (RequirementDefinition)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementDefinition(RequirementDefinition newRequirementDefinition) {
		eSet(SysMLPackage.Literals.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION, newRequirementDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getStakeholderParameter() {
		return (EList<PartUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__STAKEHOLDER_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getSubjectParameter() {
		return (Usage)eGet(SysMLPackage.Literals.REQUIREMENT_USAGE__SUBJECT_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectParameter(Usage newSubjectParameter) {
		eSet(SysMLPackage.Literals.REQUIREMENT_USAGE__SUBJECT_PARAMETER, newSubjectParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public java.lang.String getDeclaredShortName() {
		var sourceValue = this.getReqId();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof java.lang.String typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof java.lang.String typedValue) {
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
	public Predicate getConstraintDefinition() {
		var sourceValue = this.getRequirementDefinition();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Predicate typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Predicate typedValue) {
			return typedValue;
		}
		return null;
	}

} //RequirementUsageImpl
