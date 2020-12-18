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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Association is a Relationship and a Class to enable classification of links between things (in the universe). The co-domains&nbsp;of the <code>associationEnd</code> Features are one of the <code>relatedTypes</code>, as co-domain and participants (linked things) of an Association identify each other.</p>
 * 
 * relatedTypes = associationEnd.type
 * let numend : Natural = associationEnd->size() in
 *     allSupertypes()->includes(
 *         if numend = 2 then Kernel Library::BinaryLink
 *         else Kernel Library::Link)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getTargetType <em>Target Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends org.omg.sysml.lang.sysml.Class, Relationship {
	/**
	 * Returns the value of the '<em><b>Related Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>types</code> of the <code>endFeatures</code> of the Association, which are the <code>relatedElements</code> of the Association considered as a Relationship.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_RelatedType()
	 * @model lower="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='association'"
	 *        annotation="union"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Type> getRelatedType();

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getEndFeature() <em>End Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>features</code> of the Association that that identifying the things that can be related by it. An Association must have at least two <code>associationEnds</code>. When it has exactly two, the Association is called a <em>binary</em> Association.</p>
	 * 
	 * <p>The ends of the Association determine which elements are eligible to be related by instances of the Association.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_AssociationEnd()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='associationWithEnd'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Feature> getAssociationEnd();

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Association#getRelatedType() <em>Related Type</em>}'</li>
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
	 * <p>The source <code>relatedType</code> for this Association. If this is a binary Association, then the <code>sourceType</code> is the first <code>relatedType</code>, and the first <code>associationEnd</code> of the Association must redefine the <code>source</code> Feature of the Association <em>BinaryLink</em> from the Kernel Library. If this Association is not binary, then it has no <code>sourceType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceType()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sourceAssociation'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Type getSourceType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(Type value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Type}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Association#getRelatedType() <em>Related Type</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The target <code>relatedTypes</code> for this Association. This includes all the <code>relatedTypes</code> other than the <code>sourceType</code>. If this is a binary Association, then the <code>associationEnds</code> corresponding to the <code>relatedTypes</code> must all redefine the <code>target</code> Feature of the Association <em>BinaryLink</em> from the Kernel Library.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetType()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='targetAssociation'"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Type> getTargetType();

} // Association
