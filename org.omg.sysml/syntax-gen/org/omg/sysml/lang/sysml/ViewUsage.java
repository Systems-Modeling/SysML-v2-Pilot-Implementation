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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ViewUsage is a usage of a ViewDefinition to specify the generation of a view of a specific <code>exposedPackage</code>. The ViewDefinition can satisfy more <code>viewpoints</code> than its definition, and it can specialize the <code>rendering</code> specified by its definition.<p>
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
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getExposedPackage <em>Exposed Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewUsage#getRendering <em>Rendering</em>}</li>
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
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointSatisfyingView'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ViewpointUsage> getSatisfiedViewpoint();

	/**
	 * Returns the value of the '<em><b>Exposed Package</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Package that is exposed by this ViewUsage, derived as the <code>importedPackage</code> related to the ViewUsage by a Expose Relationship.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposed Package</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_ExposedPackage()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exposingView'"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Package> getExposedPackage();

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RenderingUsage to be used to render the view specified by this ViewUsage.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering</em>' reference.
	 * @see #setRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewUsage_Rendering()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='renderingOwningView'"
	 *        annotation="subsets"
	 * @generated
	 */
	RenderingUsage getRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewUsage#getRendering <em>Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering</em>' reference.
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(RenderingUsage value);

} // ViewUsage
