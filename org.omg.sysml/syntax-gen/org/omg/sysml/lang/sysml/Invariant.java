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
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Invariant is a BooleanExpression that is asserted to have a specific Boolean result value. If <code>isNegated = false</code>, then the Invariant must subset, directly or indirectly, the BooleanExpression <em>trueEvaluations</em> from the Kernel library, meaning that the result is asserted to be true. If <code>isNegated = true</code>, then the Invariant must subset, directly or indirectly, the BooleanExpression <em>falseEvaluations</em> from the Kernel library, meaning that the result is asserted to be false.</p>
 * 
 * if isNegated then
 *     specializesFromLibrary("Performances::falseEvaluations")
 * else
 *     specializesFromLibrary("Performances::trueEvaluations")
 * endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Invariant#isNegated <em>Is Negated</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant()
 * @model
 * @generated
 */
public interface Invariant extends BooleanExpression {

	/**
	 * Returns the value of the '<em><b>Is Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this Invariant is asserted to be false rather than true.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Negated</em>' attribute.
	 * @see #setIsNegated(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant_IsNegated()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Invariant#isNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setIsNegated(boolean value);
} // Invariant
