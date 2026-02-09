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
 * A representation of the model object '<em><b>While Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>WhileLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that the <code>bodyAction</code> <code>ActionUsage</code> should be performed repeatedly while the result of the <code>whileArgument</code> <code>Expression</code> is true or until the result of the <code>untilArgument</code> <code>Expression</code> (if provided) is true. The <code>whileArgument</code> <code>Expression</code> is evaluated before each (possible) performance of the <code>bodyAction</code>, and the <code>untilArgument</code> <code>Expression</code> is evaluated after each performance of the <code>bodyAction</code>.</p>
 * isSubactionUsage() implies
 *     specializesFromLibrary('Actions::Action::whileLoops')
 * untilArgument =
 *     let parameter : Feature = inputParameter(3) in
 *     if parameter <> null and parameter.oclIsKindOf(Expression) then
 *         parameter.oclAsType(Expression)
 *     else
 *         null
 *     endif
 * 
 * specializesFromLibrary('Actions::whileLoopActions')
 * whileArgument =
 *     let parameter : Feature = inputParameter(1) in
 *     if parameter <> null and parameter.oclIsKindOf(Expression) then
 *         parameter.oclAsType(Expression)
 *     else
 *         null
 *     endif
 * 
 * inputParameters()->size() >= 2
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.WhileLoopActionUsage#getWhileArgument <em>While Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.WhileLoopActionUsage#getUntilArgument <em>Until Argument</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getWhileLoopActionUsage()
 * @model
 * @generated
 */
public interface WhileLoopActionUsage extends LoopActionUsage {
	/**
	 * Returns the value of the '<em><b>While Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expression</code> whose result, if true, determines that the <code>bodyAction</code> should continue to be performed. It is the first owned <code>parameter</code> of the <code>WhileLoopActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>While Argument</em>' reference.
	 * @see #setWhileArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getWhileLoopActionUsage_WhileArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='whileLoopAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getWhileArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.WhileLoopActionUsage#getWhileArgument <em>While Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Argument</em>' reference.
	 * @see #getWhileArgument()
	 * @generated
	 */
	void setWhileArgument(Expression value);

	/**
	 * Returns the value of the '<em><b>Until Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expression</code> whose result, if false, determines that the <code>bodyAction</code> should continue to be performed. It is the (optional) third owned <code>parameter</code> of the <code>WhileLoopActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Until Argument</em>' reference.
	 * @see #setUntilArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getWhileLoopActionUsage_UntilArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='untilLoopAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getUntilArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.WhileLoopActionUsage#getUntilArgument <em>Until Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Argument</em>' reference.
	 * @see #getUntilArgument()
	 * @generated
	 */
	void setUntilArgument(Expression value);

} // WhileLoopActionUsage
