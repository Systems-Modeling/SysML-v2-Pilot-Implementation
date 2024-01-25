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
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Redefinition</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>Redefinition</code> is a kind of <code>Subsetting</code> that requires the <code>redefinedFeature</code> and the <code>redefiningFeature</code> to have the same values (on each instance of the domain of the <code>redefiningFeature</code>). This means any restrictions on the <code>redefiningFeature</code>, such as <code>type</code> or <code>multiplicity</code>, also apply to the <code>redefinedFeature</code> (on each instance of the domain of the <code>redefiningFeature</code>), and vice versa. The <code>redefinedFeature</code> might have values for instances of the domain of the <code>redefiningFeature</code>, but only as instances of the domain of the <code>redefinedFeature</code> that happen to also be instances of the domain of the <code>redefiningFeature</code>. This is supported by the constraints inherited from <code>Subsetting</code> on the domains of the <code>redefiningFeature</code> and <code>redefinedFeature</code>. However, these constraints are narrowed for <code>Redefinition</code> to require the <code>owningTypes</code> of the <code>redefiningFeature</code> and <code>redefinedFeature</code> to be different and the <code>redefinedFeature</code> to not be inherited into the <code>owningNamespace</code> of the <code>redefiningFeature</code>.This enables the <code>redefiningFeature</code> to have the same name as the <code>redefinedFeature</code>, if desired.</p>
 * 
 * let anythingType: Type =
 *     redefiningFeature.resolveGlobal('Base::Anything').modelElement.oclAsType(Type) in 
 * -- Including "Anything" accounts for implicit featuringType of Features
 * -- with no explicit featuringType.
 * let redefiningFeaturingTypes: Set(Type) =
 *     redefiningFeature.featuringTypes->asSet()->including(anythingType) in
 * let redefinedFeaturingTypes: Set(Type) =
 *     redefinedFeature.featuringTypes->asSet()->including(anythingType) in
 * redefiningFeaturingTypes <> redefinedFeaturingType
 * featuringType->forAll(t |
 *     let direction : FeatureDirectionKind = t.directionOf(redefinedFeature) in
 *     ((direction = FeatureDirectionKind::_'in' or 
 *       direction = FeatureDirectionKind::out) implies
 *          redefiningFeature.direction = direction)
 *     and 
 *     (direction = FeatureDirectionKind::inout implies
 *         redefiningFeature.direction <> null))
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
	 * <p>The <code>Feature</code> that is redefining the <code>redefinedFeature</code> of this <code>Redefinition</code>.</p>
	 * 
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
	 * <p>The <code>Feature</code> that is redefined by the <code>redefiningFeature</code> of this <code>Redefinition</code>.</p>
	 * 
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
