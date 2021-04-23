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
 * A representation of the model object '<em><b>View Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ViewDefinition is a PartDefinition that specifies how a view artifact is constructed to satisfy a <code>viewpoint</code>. It specifies a <code>viewConditions</code> to define the model content to be presented and a <code>rendering</code> to define how the model content is presented.</p>
 * 
 * </p>A ViewDefinition must subclass, directly or indirectly, the base ViewDefinition View from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getView <em>View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getSatisfiedViewpoint <em>Satisfied Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getViewRendering <em>View Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getViewCondition <em>View Condition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition()
 * @model
 * @generated
 */
public interface ViewDefinition extends PartDefinition {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of this ViewDefinition that are ViewUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_View()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringView'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ViewUsage> getView();

	/**
	 * Returns the value of the '<em><b>Satisfied Viewpoint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewpointUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedUsages</code> of this ViewDefinition that are ViewpointUsages for viewpoints satisfied by the ViewDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_SatisfiedViewpoint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointSatisfyingViewDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ViewpointUsage> getSatisfiedViewpoint();

	/**
	 * Returns the value of the '<em><b>View Rendering</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RenderingUsage to be used to render views defined by this ViewDefinition. Derived as the <code>referencedRendering</code> of the ViewRenderingMembership of the ViewDefinition. A ViewDefinition may have at most one.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Rendering</em>' reference.
	 * @see #setViewRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_ViewRendering()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='renderingOwningViewDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	RenderingUsage getViewRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewDefinition#getViewRendering <em>View Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Rendering</em>' reference.
	 * @see #getViewRendering()
	 * @generated
	 */
	void setViewRendering(RenderingUsage value);

	/**
	 * Returns the value of the '<em><b>View Condition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expressions related to this ViewDefinition by ElementFilterMemberships, which specify conditions on Elements to be rendered in a view.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Condition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_ViewCondition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningViewDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Expression> getViewCondition();

} // ViewDefinition
