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
 * A representation of the model object '<em><b>Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>LoopActionUsage</code> is an <code>ActionUsage</code> that specifies that its <code>bodyAction</code> should be performed repeatedly. Its subclasses <code>WhileLoopActionUsage</code> and <code>ForLoopActionUsage</code> provide different ways to determine how many times the <code>bodyAction</code> should be performed.</p>
 * bodyAction =
 *     let parameter : Feature = inputParameter(2) in
 *     if parameter <> null and parameter.oclIsKindOf(Action) then
 *         parameter.oclAsType(Action)
 *     else
 *         null
 *     endif
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.LoopActionUsage#getBodyAction <em>Body Action</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLoopActionUsage()
 * @model abstract="true"
 * @generated
 */
public interface LoopActionUsage extends ActionUsage {
	/**
	 * Returns the value of the '<em><b>Body Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsage</code> to be performed repeatedly by the <code>LoopActionUsage</code>. It is the second <code>parameter</code> of the <code>LoopActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Action</em>' reference.
	 * @see #setBodyAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLoopActionUsage_BodyAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getBodyAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.LoopActionUsage#getBodyAction <em>Body Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Action</em>' reference.
	 * @see #getBodyAction()
	 * @generated
	 */
	void setBodyAction(ActionUsage value);

} // LoopActionUsage
