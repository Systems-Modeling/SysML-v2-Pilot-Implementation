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

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A PortUsage is a usage of a PortDefinition. A PortUsage must be owned by a PartDefinition, a PortDefinition, a PartUsage or another PortUsage.  Any <code>ownedUsages</code> of a PortUsage must not be composite.</p>
 * 
 * <p>A PortUsage must subset, directly or indirectly, the PortUsage <code>ports</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PortUsage#getPortDefinition <em>Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage <em>Port Owning Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortUsage()
 * @model
 * @generated
 */
public interface PortUsage extends Usage {
	/**
	 * Returns the value of the '<em><b>Port Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PortDefinition}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>types</code> of this PortUsage, which must all be PortDefinitions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortUsage_PortDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedPort'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<PortDefinition> getPortDefinition();

	/**
	 * Returns the value of the '<em><b>Port Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedPort <em>Nested Port</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage() <em>Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usage in which the <code>nestedPort</code> is nested (if any).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Owning Usage</em>' reference.
	 * @see #setPortOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortUsage_PortOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedPort
	 * @model opposite="nestedPort" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getPortOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage <em>Port Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Owning Usage</em>' reference.
	 * @see #getPortOwningUsage()
	 * @generated
	 */
	void setPortOwningUsage(Usage value);

} // PortUsage
