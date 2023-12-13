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
 * A representation of the model object '<em><b>Function Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>CalculationUsage</code> is an <code>ActionUsage</code> that is also an <code>Expression</code>, and, so, is typed by a <code>Function</code>. Nominally, if the <code>type</code> is a <code>CalculationDefinition</code>, a <code>CalculationUsage</code> is a <code>Usage</code> of that <code>CalculationDefinition</code> within a system. However, other kinds of kernel <code>Functions</code> are also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p>
 * specializesFromLibrary('Calculations::calculations')
 * owningType <> null and
 * (owningType.oclIsKindOf(CalculationDefinition) or
 *  owningType.oclIsKindOf(CalculationUsage)) implies
 *     specializesFromLibrary('Calculations::Calculation::subcalculations')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.CalculationUsage#getCalculationDefinition <em>Calculation Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCalculationUsage()
 * @model
 * @generated
 */
public interface CalculationUsage extends ActionUsage, Expression {
	/**
	 * Returns the value of the '<em><b>Calculation Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Expression#getFunction() <em>Function</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionUsage#getActionDefinition() <em>Action Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <ode>Function</code> that is the <code>type</code> of this <code>CalculationUsage</code>. Nominally, this would be a <code>CalculationDefinition</code>, but a kernel <code>Function</code> is also allowed, to permit use of <code>Functions</code> from the Kernel Model Libraries.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculation Definition</em>' reference.
	 * @see #setCalculationDefinition(Function)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCalculationUsage_CalculationDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedCalculation'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Function getCalculationDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CalculationUsage#getCalculationDefinition <em>Calculation Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Definition</em>' reference.
	 * @see #getCalculationDefinition()
	 * @generated
	 */
	void setCalculationDefinition(Function value);

} // FunctionUsage
