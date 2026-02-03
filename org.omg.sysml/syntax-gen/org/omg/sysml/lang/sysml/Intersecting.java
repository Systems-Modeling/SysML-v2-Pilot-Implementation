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
 * A representation of the model object '<em><b>Intersecting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>Intersecting</code> is a <code>Relationship</code> that makes its <code>intersectingType</code> one of the <code>intersectingTypes</code> of its <code>typeIntersected</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Intersecting#getIntersectingType <em>Intersecting Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Intersecting#getTypeIntersected <em>Type Intersected</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIntersecting()
 * @model
 * @generated
 */
public interface Intersecting extends Relationship {
	/**
	 * Returns the value of the '<em><b>Intersecting Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> that partly determines interpretations of <code>typeIntersected</code>, as described in <code>Type::intersectingType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intersecting Type</em>' reference.
	 * @see #setIntersectingType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIntersecting_IntersectingType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='intersectedIntersecting'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getIntersectingType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Intersecting#getIntersectingType <em>Intersecting Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersecting Type</em>' reference.
	 * @see #getIntersectingType()
	 * @generated
	 */
	void setIntersectingType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Intersected</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedIntersecting <em>Owned Intersecting</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> with interpretations partly determined by <code>intersectingType</code>, as described in <code>Type::intersectingType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Intersected</em>' reference.
	 * @see #setTypeIntersected(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getIntersecting_TypeIntersected()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedIntersecting
	 * @model opposite="ownedIntersecting" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getTypeIntersected();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Intersecting#getTypeIntersected <em>Type Intersected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Intersected</em>' reference.
	 * @see #getTypeIntersected()
	 * @generated
	 */
	void setTypeIntersected(Type value);

} // Intersecting
