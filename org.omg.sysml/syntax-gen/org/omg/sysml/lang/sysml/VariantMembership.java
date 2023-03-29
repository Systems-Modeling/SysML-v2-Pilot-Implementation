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
 * A representation of the model object '<em><b>Variant Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>VariantMembership</code> is a <code>Membership</code> between a variation point <code>Definition</code> or <code>Usage</code> and a <code>Usage</code> that represents a variant in the context of that variation. The <code>membershipOwningNamespace</code> for the <code>VariantMembership</code> must be either a Definition or a <code>Usage</code> with <code>isVariation = true</code>.</p>
 * membershipOwningNamespace.oclIsKindOf(Definition) and
 *     membershipOwningNamespace.oclAsType(Definition).isVariation or
 * membershipOwningNamespace.oclIsKindOf(Usage) and
 *     membershipOwningNamespace.oclAsType(Usage).isVariation
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.VariantMembership#getOwnedVariantUsage <em>Owned Variant Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVariantMembership()
 * @model
 * @generated
 */
public interface VariantMembership extends OwningMembership {
	/**
	 * Returns the value of the '<em><b>Owned Variant Usage</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElement() <em>Owned Member Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variant Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usage</code> that represents a variant in the context of the <code>owningVariationDefinition</code> or <code>owningVariationUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Variant Usage</em>' reference.
	 * @see #setOwnedVariantUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getVariantMembership_OwnedVariantUsage()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariantMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Usage getOwnedVariantUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.VariantMembership#getOwnedVariantUsage <em>Owned Variant Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Variant Usage</em>' reference.
	 * @see #getOwnedVariantUsage()
	 * @generated
	 */
	void setOwnedVariantUsage(Usage value);

} // VariantMembership
