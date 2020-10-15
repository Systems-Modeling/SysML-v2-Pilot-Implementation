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

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Redefinition</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Redefinition specializes&nbsp;Subsetting to require&nbsp;the redefinedFeature and the&nbsp;redefiningFeature to have the same values (on each instance of the domain&nbsp; of the redefiningFeature).&nbsp;&nbsp;This means any restrictions on the redefiningFeature, such as type or multiplicity, also apply to the redefinedFeature (on each instance of the owningType of the redefining Feature), and vice versa.&nbsp; The redefinedFeature might have&nbsp;values for instances of the owningType of the redefiningFeature, but only as instances of the owningType of the redefinedFeature that happen to also be instances of the owningType of the redefiningFeature.&nbsp; This is supported by the constraints on the domains of the redefining and redefinedFeature inherited from&nbsp;Subsetting.&nbsp; However, these constraints are narrowed for Redefinition to require the owningTypes of the redefining and redefinedFeatures to be different and the redefinedFeature to&nbsp;not be imported into the owningNamespace of the redefiningFeature.&nbsp;This&nbsp;enables&nbsp;the redefiningFeature to have the same name as the redefinedFeature if desired.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Redefinition#getRedefiningFeature <em>Redefining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Redefinition#getRedefinedFeature <em>Redefined Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRedefinition()
 * @model
 * @generated
 */
public interface Redefinition extends Subsetting {
	/**
	 * Returns the value of the '<em><b>Redefining Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature() <em>Subsetting Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefining Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that is redefining another Feature linked by this Redefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefining Feature</em>' reference.
	 * @see #setRedefiningFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRedefinition_RedefiningFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='redefinition'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getRedefiningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Redefinition#getRedefiningFeature <em>Redefining Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Redefining Feature</em>' reference.
	 * @see #getRedefiningFeature()
	 * @generated
	 */
	void setRedefiningFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Redefined Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature() <em>Subsetted Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature that is redefined by another Feature linked by this Redefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Feature</em>' reference.
	 * @see #setRedefinedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRedefinition_RedefinedFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='redefining'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getRedefinedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Redefinition#getRedefinedFeature <em>Redefined Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Redefined Feature</em>' reference.
	 * @see #getRedefinedFeature()
	 * @generated
	 */
	void setRedefinedFeature(Feature value);

} // Redefinition
