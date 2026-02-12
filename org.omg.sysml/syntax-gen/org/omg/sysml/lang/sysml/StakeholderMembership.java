/*******************************************************************************
 *  SysML 2 Pilot Implementation
 *  Copyright (c) 2026 Model Driven Solutions, Inc.
 *   
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>StakeholderMembership</code> is a <code>ParameterMembership</code> that identifies a <code>PartUsage</code> as a <code>stakeholderParameter</code> of a <code>RequirementDefinition</code> or <code>RequirementUsage</code>, which specifies a role played by an entity with concerns framed by the <code>owningType</code>.</p>
 * owningType.oclIsKindOf(RequirementUsage) or
 * owningType.oclIsKindOf(RequirementDefinition)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.StakeholderMembership#getOwnedStakeholderParameter <em>Owned Stakeholder Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStakeholderMembership()
 * @model
 * @generated
 */
public interface StakeholderMembership extends ParameterMembership {
	/**
	 * Returns the value of the '<em><b>Owned Stakeholder Parameter</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter() <em>Owned Member Parameter</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>PartUsage</code> specifying the stakeholder.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Stakeholder Parameter</em>' reference.
	 * @see #setOwnedStakeholderParameter(PartUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStakeholderMembership_OwnedStakeholderParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningStakeholderMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	PartUsage getOwnedStakeholderParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.StakeholderMembership#getOwnedStakeholderParameter <em>Owned Stakeholder Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Stakeholder Parameter</em>' reference.
	 * @see #getOwnedStakeholderParameter()
	 * @generated
	 */
	void setOwnedStakeholderParameter(PartUsage value);

} // StakeholderMembership
