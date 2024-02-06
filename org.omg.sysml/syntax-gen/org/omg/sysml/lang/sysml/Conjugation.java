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
 * A representation of the model object '<em><b>Conjugation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>Conjugation</code> is a <code>Relationship</code> between two types in which the <code>conjugatedType</code> inherits all the <code>Features</code> of the <code>originalType</code>, but with all <code>input</code> and <code>output</code> <code>Features</code> reversed. That is, any <code>Features</code> with a <code>direction</code> <em>in</em> relative to the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>out</em> relative to the <code>conjugatedType</code> and, similarly, <code>Features</code> with <code>direction</code> <em>out</em> in the <code>originalType</code> are considered to have an effective <code>direction</code> of <em>in</em> in the <code>conjugatedType</code>. <code>Features</code> with <code>direction</code> <em>inout</em>, or with no <code>direction</code>, in the <code>originalType</code>, are inherited without change.</p>
 * 
 * <p>A <code>Type</code> may participate as a <code>conjugatedType</code> in at most one <code>Conjugation</code> relationship, and such a <code>Type</code> may not also be the <code>specific</code> <code>Type</code> in any <code>Specialization</code> relationship.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Conjugation#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Conjugation#getConjugatedType <em>Conjugated Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Conjugation#getOwningType <em>Owning Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugation()
 * @model
 * @generated
 */
public interface Conjugation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Original Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Type</code> to be conjugated.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Type</em>' reference.
	 * @see #setOriginalType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugation_OriginalType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conjugation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getOriginalType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Conjugation#getOriginalType <em>Original Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type</em>' reference.
	 * @see #getOriginalType()
	 * @generated
	 */
	void setOriginalType(Type value);

	/**
	 * Returns the value of the '<em><b>Conjugated Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conjugated Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Type</code> that is the result of applying <code>Conjugation</code> to the <code>originalType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conjugated Type</em>' reference.
	 * @see #setConjugatedType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugation_ConjugatedType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conjugator'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getConjugatedType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Conjugation#getConjugatedType <em>Conjugated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugated Type</em>' reference.
	 * @see #getConjugatedType()
	 * @generated
	 */
	void setConjugatedType(Type value);

	/**
	 * Returns the value of the '<em><b>Owning Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedConjugator <em>Owned Conjugator</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Conjugation#getConjugatedType() <em>Conjugated Type</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>conjugatedType</code> of this <code>Conjugation</code> that is also its <code>owningRelatedElement</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Type</em>' reference.
	 * @see #setOwningType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugation_OwningType()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedConjugator
	 * @model opposite="ownedConjugator" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getOwningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Conjugation#getOwningType <em>Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Type</em>' reference.
	 * @see #getOwningType()
	 * @generated
	 */
	void setOwningType(Type value);

} // Conjugation
