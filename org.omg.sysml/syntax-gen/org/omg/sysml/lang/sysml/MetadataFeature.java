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
 * A representation of the model object '<em><b>Metadata Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A MetadataFeature is an <code>ownedFeature</code> of an AnnotatingFeature that redefines a Feature of the <code>metadataType</code> and binds a value to it.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue <em>Metadata Feature Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature()
 * @model
 * @generated
 */
public interface MetadataFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Metadata Feature Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getOwningMetadataFeature <em>Owning Metadata Feature</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership() <em>Owned Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Feature Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The required MetadataFeatureValue for this MetadataFeature that gives the <code>metadataValue</code> for it in the context of its owning AnnotatingFeature.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Feature Value</em>' reference.
	 * @see #setMetadataFeatureValue(MetadataFeatureValue)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeature_MetadataFeatureValue()
	 * @see org.omg.sysml.lang.sysml.MetadataFeatureValue#getOwningMetadataFeature
	 * @model opposite="owningMetadataFeature" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	MetadataFeatureValue getMetadataFeatureValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue <em>Metadata Feature Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Feature Value</em>' reference.
	 * @see #getMetadataFeatureValue()
	 * @generated
	 */
	void setMetadataFeatureValue(MetadataFeatureValue value);

} // MetadataFeature
