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
 * A representation of the model object '<em><b>View Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ViewUsage is a usage of a ViewDefinition to specify the generation of a view of the <code>members</code> of a collection of <code>exposedNamespaces</code>. The ViewDefinition can satisfy more <code>viewpoints</code> than its definition, and it can specialize the <code>rendering</code> specified by its definition.<p>
 * 
 * <p>A ViewUsage must subset, directly or indirectly, the base ViewUsage <code>views</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getViewDefinition <em>View Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getSatisfiedViewpoint <em>Satisfied Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getExposedNamespace <em>Exposed Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getViewRendering <em>View Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getViewCondition <em>View Condition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getViewedElement <em>Viewed Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage()
 * @model
 * @generated
 */
public interface ViewUsage extends PartUsage {
	/**
	 * Returns the value of the '<em><b>View Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.PartUsage#getPartDefinition() <em>Part Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The definition of this ViewUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Definition</em>' reference.
	 * @see #setViewDefinition(ViewDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ViewDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedView'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ViewDefinition getViewDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewUsage#getViewDefinition <em>View Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Definition</em>' reference.
	 * @see #getViewDefinition()
	 * @generated
	 */
	void setViewDefinition(ViewDefinition value);

	/**
	 * Returns the value of the '<em><b>Satisfied Viewpoint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewpointUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>nestedUsages</code> of this ViewUsage that are ViewpointUsages for (additional) viewpoints satisfied by the ViewUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_SatisfiedViewpoint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointSatisfyingView'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ViewpointUsage> getSatisfiedViewpoint();

	/**
	 * Returns the value of the '<em><b>Exposed Namespace</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Namespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Namespaces that are exposed by this ViewUsage, derived as the Namespaces related to the ViewUsage by Expose Relationships.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposed Namespace</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ExposedNamespace()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exposingView'"
	 * @generated
	 */
	EList<Namespace> getExposedNamespace();

	/**
	 * Returns the value of the '<em><b>View Rendering</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RenderingUsage to be used to render views defined by this ViewUsage. Derived as the <code>referencedRendering</code> of the ViewRenderingMembership of the ViewUsage. A ViewUsage may have at most one.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Rendering</em>' reference.
	 * @see #setViewRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ViewRendering()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='renderingOwningView'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	RenderingUsage getViewRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewUsage#getViewRendering <em>View Rendering</em>}' reference.
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
	 * <p>The Expressions related to this ViewUsage by ElementFilterMemberships, which specify conditions on Elements to be rendered in a view.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Condition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ViewCondition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningView'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Expression> getViewCondition();

	/**
	 * Returns the value of the '<em><b>Viewed Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Elements that are rendered by this ViewUsage, derived as the <code>members</code> of all the <code>exposedNamespaces</code> that met all the owned and inherited <code>viewConditions</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewed Element</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ViewedElement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewer'"
	 * @generated
	 */
	EList<Element> getViewedElement();

} // ViewUsage
