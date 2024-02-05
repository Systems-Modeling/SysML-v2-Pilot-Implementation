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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Return
 * Parameter Membership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ReturnParameterMembership</code> is a <code>ParameterMembership</code> that indicates that the <code>ownedMemberParameter</code> is the <code>result</code> <code>parameter</code> of a <code>Function</code> or <code>Expression</code>. The <code>direction</code> of the <code>ownedMemberParameter</code> must be <code>out</code>.</p>
 * 
 * owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getReturnParameterMembership()
 * @model
 * @generated
 */
public interface ReturnParameterMembership extends ParameterMembership {
} // ReturnParameterMembership
