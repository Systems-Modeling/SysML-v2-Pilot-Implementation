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
import org.omg.sysml.model.sysml.RequirementDefinition;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementDefinitionImpl#getReqId <em>Req Id</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementDefinitionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementDefinitionImpl#getActorParameter <em>Actor Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementDefinitionImpl#getAssumedConstraint <em>Assumed Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementDefinitionImpl#getFramedConcern <em>Framed Concern</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementDefinitionImpl#getRequiredConstraint <em>Required Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementDefinitionImpl#getStakeholderParameter <em>Stakeholder Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RequirementDefinitionImpl#getSubjectParameter <em>Subject Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementDefinitionImpl extends ConstraintDefinitionImpl implements RequirementDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REQUIREMENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReqId() {
		return (String)eGet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__REQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReqId(String newReqId) {
		eSet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__REQ_ID, newReqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getText() {
		return (EList<String>)eGet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getActorParameter() {
		return (EList<PartUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__ACTOR_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getAssumedConstraint() {
		return (EList<ConstraintUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__ASSUMED_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernUsage> getFramedConcern() {
		return (EList<ConcernUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__FRAMED_CONCERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getRequiredConstraint() {
		return (EList<ConstraintUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__REQUIRED_CONSTRAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getStakeholderParameter() {
		return (EList<PartUsage>)eGet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__STAKEHOLDER_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getSubjectParameter() {
		return (Usage)eGet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__SUBJECT_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectParameter(Usage newSubjectParameter) {
		eSet(SysMLPackage.Literals.REQUIREMENT_DEFINITION__SUBJECT_PARAMETER, newSubjectParameter);
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

} //RequirementDefinitionImpl
