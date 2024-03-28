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
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Parameter Membership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ParameterMembership</code> is a <code>FeatureMembership</code> that identifies its <code>memberFeature</code> as a parameter, which is always owned, and must have a <code>direction</code>. A <code>ParameterMembership</code> must be owned by a <code>Behavior</code> or a <code>Step</code>.</p>
 * ownedMemberParameter.direction = parameterDirection()
 * owningType.oclIsKindOf(Behavior) or owningType.oclIsKindOf(Step)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter <em>Owned Member Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getParameterMembership()
 * @model
 * @generated
 */
public interface ParameterMembership extends FeatureMembership {

	/**
	 * Returns the value of the '<em><b>Owned Member Parameter</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature() <em>Owned Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Parameter</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is identified as a <code>parameter</code> by this <code>ParameterMembership</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Parameter</em>' reference.
	 * @see #setOwnedMemberParameter(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getParameterMembership_OwnedMemberParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningParameterMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getOwnedMemberParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ParameterMembership#getOwnedMemberParameter <em>Owned Member Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Parameter</em>' reference.
	 * @see #getOwnedMemberParameter()
	 * @generated
	 */
	void setOwnedMemberParameter(Feature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the required value of the <code>direction</code> of the <code>ownedMemberParameter</code>. By default, this is <code>in</code>.</p>
	 * FeatureDirectionKind::_'in'
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	FeatureDirectionKind parameterDirection();
} // ParameterMembership
