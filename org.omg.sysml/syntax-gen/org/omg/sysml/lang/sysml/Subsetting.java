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
 * '<em><b>Subsetting</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>Subsetting</code> is <code>Specialization</code> in which the <code>specific</code> and <code>general</code> <code>Types</code> are <code>Features</code>. This means all values of the <code>subsettingFeature</code> (on instances of its domain, i.e., the intersection of its <code>featuringTypes</code>) are values of the <code>subsettedFeature</code> on instances of its domain. To support this the domain of the <code>subsettingFeature</code> must be the same or specialize (at least indirectly) the domain of the <code>subsettedFeature</code> (via <code>Specialization</code>), and the co-domain (intersection of the <code>types</code>) of the <code>subsettingFeature</code> must specialize the co-domain of the <code>subsettedFeature</code>.</p>
 * 
 * let subsettingFeaturingTypes: OrderedSet(Type) =
 *     subsettingFeature.featuringTypes in
 * let subsettedFeaturingTypes: OrderedSet(Type) =
 *     subsettedFeature.featuringTypes in
 * let anythingType: Element =
 *     subsettingFeature.resolveGlobal('Base::Anything').memberElement in 
 * subsettedFeaturingTypes->forAll(t |
 *     subsettingFeaturingTypes->isEmpty() and t = anythingType or
 *     subsettingFeaturingTypes->exists(specializes(t))
 * subsettedFeature.isUnique implies subsettingFeature.isUnique
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature <em>Subsetted Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature <em>Subsetting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature <em>Owning Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubsetting()
 * @model
 * @generated
 */
public interface Subsetting extends Specialization {
	/**
	 * Returns the value of the '<em><b>Subsetted Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getGeneral() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetted Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is subsetted by the <code>subsettingFeature</code> of this <code>Subsetting</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsetted Feature</em>' reference.
	 * @see #setSubsettedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubsetting_SubsettedFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='supersetting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getSubsettedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettedFeature <em>Subsetted Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsetted Feature</em>' reference.
	 * @see #getSubsettedFeature()
	 * @generated
	 */
	void setSubsettedFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Subsetting Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getSpecific() <em>Specific</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsetting Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is a subset of the <code>subsettedFeature</code> of this <code>Subsetting</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsetting Feature</em>' reference.
	 * @see #setSubsettingFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubsetting_SubsettingFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subsetting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getSubsettingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature <em>Subsetting Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Subsetting Feature</em>' reference.
	 * @see #getSubsettingFeature()
	 * @generated
	 */
	void setSubsettingFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owning Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting <em>Owned Subsetting</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Subsetting#getSubsettingFeature() <em>Subsetting Feature</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Specialization#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Feature</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>subsettingFeature</code> that is also the <code>owningRelatedElement</code> of this <code>Subsetting</code>.</p>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Feature</em>' reference.
	 * @see #setOwningFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSubsetting_OwningFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getOwnedSubsetting
	 * @model opposite="ownedSubsetting" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getOwningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Subsetting#getOwningFeature <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature</em>' reference.
	 * @see #getOwningFeature()
	 * @generated
	 */
	void setOwningFeature(Feature value);

} // Subsetting
