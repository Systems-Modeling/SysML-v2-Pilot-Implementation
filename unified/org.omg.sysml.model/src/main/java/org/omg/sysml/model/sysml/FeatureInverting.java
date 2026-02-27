/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Inverting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FeatureInverting</code> is a <code>Relationship</code> between <code>Features</code> asserting that their interpretations (sequences) are the reverse of each other, identified as <code>featureInverted</code> and <code>invertingFeature</code>. For example, a <code>Feature</code> identifying each person&#39;s parents is the inverse of a <code>Feature</code> identifying each person&#39;s children. A person identified as a parent of another will identify that other as one of their children.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.FeatureInverting#getFeatureInverted <em>Feature Inverted</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.FeatureInverting#getInvertingFeature <em>Inverting Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.FeatureInverting#getOwningFeature <em>Owning Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getFeatureInverting()
 * @model
 * @generated
 */
public interface FeatureInverting extends Relationship {
	/**
	 * Returns the value of the '<em><b>Feature Inverted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is an inverse of the <code>invertingFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Inverted</em>' reference.
	 * @see #setFeatureInverted(Feature)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFeatureInverting_FeatureInverted()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invertingFeatureInverting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getFeatureInverted();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.FeatureInverting#getFeatureInverted <em>Feature Inverted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Inverted</em>' reference.
	 * @see #getFeatureInverted()
	 * @generated
	 */
	void setFeatureInverted(Feature value);

	/**
	 * Returns the value of the '<em><b>Inverting Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Feature</code> that is an inverse of the <code>invertedFeature</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inverting Feature</em>' reference.
	 * @see #setInvertingFeature(Feature)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFeatureInverting_InvertingFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invertedFeatureInverting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Feature getInvertingFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.FeatureInverting#getInvertingFeature <em>Inverting Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverting Feature</em>' reference.
	 * @see #getInvertingFeature()
	 * @generated
	 */
	void setInvertingFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owning Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.model.sysml.Feature#getOwnedFeatureInverting <em>Owned Feature Inverting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>featureInverted</code> that is also the <code>owningRelatedElement</code> of this <code>FeatureInverting</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Feature</em>' reference.
	 * @see #setOwningFeature(Feature)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getFeatureInverting_OwningFeature()
	 * @see org.omg.sysml.model.sysml.Feature#getOwnedFeatureInverting
	 * @model opposite="ownedFeatureInverting" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Feature getOwningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.FeatureInverting#getOwningFeature <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Feature</em>' reference.
	 * @see #getOwningFeature()
	 * @generated
	 */
	void setOwningFeature(Feature value);

} // FeatureInverting
