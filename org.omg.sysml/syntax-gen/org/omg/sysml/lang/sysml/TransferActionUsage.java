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
 * A representation of the model object '<em><b>Transfer Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A TransferActionUsage is an ActionUsage that is also an <code>incomingTransfer</code> in a specific <code>context</code>. A TransferActionUsage must not be composite.
 * 
 * <p>A TransferActionUsage must subset, directly or indirectly, the ActionUsage <code>transferActions</code> from the Systems model library. This implies that the TransferActionUsage will be typed by TransferAction from the model library (or a subtype). The TransferActionUsage must bind the <code>context</code> Parameter of the TransferAction to the actual context for the usage.</p>
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TransferActionUsage#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransferActionUsage()
 * @model abstract="true"
 * @generated
 */
public interface TransferActionUsage extends ActionUsage {

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A Feature specifying the Occurrence of which the TransferActionUsage is an <tt>incomingTransfer</tt>. The <tt>context</tt> Feature is the target of a binding connector whose source is the redefinition of <tt>TransferAction::context</tt> by the TransferActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransferActionUsage_Context()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transferActionUsage'"
	 * @generated
	 */
	Feature getContext();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransferActionUsage#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Feature value);
} // TransferActionUsage
