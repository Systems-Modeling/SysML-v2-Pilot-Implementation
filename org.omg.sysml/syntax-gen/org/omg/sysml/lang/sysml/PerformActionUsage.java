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
 * A representation of the model object '<em><b>Perform Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A PerformActionUsage is an ActionUsage that represents the performance of an ActionUsage. The ActionUsage to be performed (which may be the PerformActionUsage itself) is related to the PerformActionUsage by a Subsetting relationship.</p>
 * 
 * <p>If the PerformActionUsage is owned by a Part, then it also subsets the performedAction property of that Part (as defined in the library model for Part),
 * otherwise it subsets either <code>actions</code> or <code>subactions</code>, as required for a regular ActionUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PerformActionUsage#getPerformedAction <em>Performed Action</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPerformActionUsage()
 * @model
 * @generated
 */
public interface PerformActionUsage extends ActionUsage {

	/**
	 * Returns the value of the '<em><b>Performed Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsage to be performed by this PerformedActionUsage. It is the <code>subsettedFeature</cpde> of the first owned Subsetting Relationship of the PerformedActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Action</em>' reference.
	 * @see #setPerformedAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPerformActionUsage_PerformedAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actionPerformance'"
	 * @generated
	 */
	ActionUsage getPerformedAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PerformActionUsage#getPerformedAction <em>Performed Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Action</em>' reference.
	 * @see #getPerformedAction()
	 * @generated
	 */
	void setPerformedAction(ActionUsage value);
} // PerformActionUsage
