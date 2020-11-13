/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Invariant is a BooleanExpression that is asserted to be true. This assertion is made by the Invariant having a BindingConnector as an <code>ownedFeature</code> that binds the <code>result</code> of the Invariant to the <code>result</code> of a LiteralBoolean with value <em>true</em>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Invariant#getAssertionConnector <em>Assertion Connector</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant()
 * @model
 * @generated
 */
public interface Invariant extends BooleanExpression {

	/**
	 * Returns the value of the '<em><b>Assertion Connector</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An owned Feature of the Invariant that is a BindingConnector between the Invariant and the result of a LiteralBoolean with value "true".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assertion Connector</em>' reference.
	 * @see #setAssertionConnector(BindingConnector)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant_AssertionConnector()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invariant'"
	 *        annotation="subsets"
	 * @generated
	 */
	BindingConnector getAssertionConnector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Invariant#getAssertionConnector <em>Assertion Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assertion Connector</em>' reference.
	 * @see #getAssertionConnector()
	 * @generated
	 */
	void setAssertionConnector(BindingConnector value);
} // Invariant
