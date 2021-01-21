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
 * A representation of the model object '<em><b>Annotating Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An AnnotatingFeature is a Feature that is used to annotate another Element with metadata. The AnnotatingFeature is typed by a DataType and binds metadata values to all the <code>features</code> of that DataType.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingFeature#getMetadataType <em>Metadata Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingFeature#getOwnedMetadata <em>Owned Metadata</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingFeature()
 * @model
 * @generated
 */
public interface AnnotatingFeature extends Feature, AnnotatingElement {
	/**
	 * Returns the value of the '<em><b>Metadata Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>type</code> of this AnnotatingFeature, which must be a DataType.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Type</em>' reference.
	 * @see #setMetadataType(DataType)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingFeature_MetadataType()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	DataType getMetadataType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AnnotatingFeature#getMetadataType <em>Metadata Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Type</em>' reference.
	 * @see #getMetadataType()
	 * @generated
	 */
	void setMetadataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Owned Metadata</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.MetadataFeature}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Metadata</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedFeatures</code> of this AnnotatingFeature, each of which must redefine a <code>feature</code> of the <code>metadataType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Metadata</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingFeature_OwnedMetadata()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningAnnotatingFeature'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<MetadataFeature> getOwnedMetadata();

} // AnnotatingFeature
