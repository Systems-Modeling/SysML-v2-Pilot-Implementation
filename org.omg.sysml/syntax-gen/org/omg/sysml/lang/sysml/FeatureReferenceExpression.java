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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Feature
 * Reference Expression</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FeatureReferenceExpression</code> is an <code>Expression</code> whose <code>result</code> is bound to a <code>referent</code> <code>Feature</code>.</p>
 * referent =
 *     let nonParameterMemberships : Sequence(Membership) = ownedMembership->
 *         reject(oclIsKindOf(ParameterMembership)) in
 *     if nonParameterMemberships->isEmpty() or
 *        not nonParameterMemberships->first().memberElement.oclIsKindOf(Feature)
 *     then null
 *     else nonParameterMemberships->first().memberElement.oclAsType(Feature)
 *     endif
 * ownedMember->selectByKind(BindingConnector)->exists(b |
 *     b.relatedFeatures->includes(targetFeature) and
 *     b.relatedFeatures->includes(result))
 * let membership : Membership = 
 *     ownedMembership->reject(m | m.oclIsKindOf(ParameterMembership)) in
 * membership->notEmpty() and
 * membership->at(1).memberElement.oclIsKindOf(Feature)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureReferenceExpression#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureReferenceExpression()
 * @model
 * @generated
 */
public interface FeatureReferenceExpression extends Expression {

	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referent</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureReferenceExpression_Referent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getReferent();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureReferenceExpression#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(Feature value);
} // FeatureReferenceExpression
