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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Expression Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ResultExpressionMembership</code> is a <code>FeatureMembership</code> that indicates that the <code>ownedResultExpression</code> provides the result values for the <code>Function</code> or <code>Expression</code> that owns it. The owning <code>Function</code> or <code>Expression</code> must contain a <code>BindingConnector</code> between the <code>result</code> <code>parameter</code> of the <code>ownedResultExpression</code> and the <code>result</code> <code>parameter</code> of the owning <code>Function</code> or <code>Expression</code>.</p>
 * 
 * owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ResultExpressionMembership#getOwnedResultExpression <em>Owned Result Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getResultExpressionMembership()
 * @model
 * @generated
 */
public interface ResultExpressionMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Owned Result Expression</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature() <em>Owned Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Result Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expression</code> that provides the result for the owner of the <code>ResultExpressionMembership</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Result Expression</em>' reference.
	 * @see #setOwnedResultExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getResultExpressionMembership_OwnedResultExpression()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningResultExpressionMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getOwnedResultExpression();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ResultExpressionMembership#getOwnedResultExpression <em>Owned Result Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Result Expression</em>' reference.
	 * @see #getOwnedResultExpression()
	 * @generated
	 */
	void setOwnedResultExpression(Expression value);

} // ResultExpressionMembership
