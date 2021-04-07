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
 * A representation of the model object '<em><b>Metadata Feature Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A MetadataFeatureValue is a FeatureValue that binds a MetadataFeature to a <code>metadataValue</code> given by a model-level evaluable Expression.</p>
 * metadataValue.isModelLevelEvaluable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue <em>Metadata Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getOwningMetadataFeature <em>Owning Metadata Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue()
 * @model
 * @generated
 */
public interface MetadataFeatureValue extends FeatureValue {
	/**
	 * Returns the value of the '<em><b>Owning Metadata Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue <em>Metadata Feature Value</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue() <em>Feature With Value</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace() <em>Membership Owning Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Metadata Feature</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The MetadataFeature that owns a certain <code>metadataFeatureValue</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Metadata Feature</em>' reference.
	 * @see #setOwningMetadataFeature(MetadataFeature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue_OwningMetadataFeature()
	 * @see org.omg.sysml.lang.sysml.MetadataFeature#getMetadataFeatureValue
	 * @model opposite="metadataFeatureValue" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	MetadataFeature getOwningMetadataFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getOwningMetadataFeature <em>Owning Metadata Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Metadata Feature</em>' reference.
	 * @see #getOwningMetadataFeature()
	 * @generated
	 */
	void setOwningMetadataFeature(MetadataFeature value);

	/**
	 * Returns the value of the '<em><b>Metadata Value</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureValue#getValue() <em>Value</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>value</code> of this MetadataFeatureValue, which must be given by a model-level evaluable Expression.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Value</em>' reference.
	 * @see #setMetadataValue(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataFeatureValue_MetadataValue()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='metadataValuation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Expression getMetadataValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataFeatureValue#getMetadataValue <em>Metadata Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Value</em>' reference.
	 * @see #getMetadataValue()
	 * @generated
	 */
	void setMetadataValue(Expression value);

} // MetadataFeatureValue
