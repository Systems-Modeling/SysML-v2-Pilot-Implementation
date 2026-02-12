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
 * A representation of the model object '<em><b>Metadata Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A  <code>MetadataUsage</code> is a <code>Usage</code> and a <code>MetadataFeature</code>, used to annotate other <code>Elements</code> in a system model with metadata. As a <code>MetadataFeature</code>, its type must be a <code>Metaclass</code>, which will nominally be a <code>MetadataDefinition</code>. However, any kernel <code>Metaclass</code> is also allowed, to permit use of <code>Metaclasses</code> from the Kernel Model Libraries.</p>
 * specializesFromLibrary('Metadata::metadataItems')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataUsage#getMetadataDefinition <em>Metadata Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataUsage()
 * @model
 * @generated
 */
public interface MetadataUsage extends ItemUsage, MetadataFeature {
	/**
	 * Returns the value of the '<em><b>Metadata Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ItemUsage#getItemDefinition() <em>Item Definition</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetaclass() <em>Metaclass</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>MetadataDefinition</code> that is the <code>definition</code> of this <code>MetadataUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Definition</em>' reference.
	 * @see #setMetadataDefinition(Metaclass)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataUsage_MetadataDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedMetadata'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Metaclass getMetadataDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataUsage#getMetadataDefinition <em>Metadata Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Definition</em>' reference.
	 * @see #getMetadataDefinition()
	 * @generated
	 */
	void setMetadataDefinition(Metaclass value);

} // MetadataUsage
