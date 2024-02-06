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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotating Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AnnotatingElement</code> is an <code>Element</code> that provides additional description of or metadata on some other <code>Element</code>. An <code>AnnotatingElement</code> is either attached to its <code>annotatedElements</code> by <code>Annotation</code> <code>Relationships</code>, or it implicitly annotates its <code>owningNamespace</code>.</p>
 * 
 * annotatedElement = 
 *  if annotation->notEmpty() then annotation.annotatedElement
 *  else Sequence{owningNamespace} endif
 * ownedAnnotatingRelationship = ownedRelationship->
 *     selectByKind(Annotation)->
 *     select(a | a.annotatingElement = self)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingElement#getOwnedAnnotatingRelationship <em>Owned Annotating Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingElement()
 * @model
 * @generated
 */
public interface AnnotatingElement extends Element {
	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Elements</code> that are annotated by this <code>AnnotatingElement</code>. If <code>annotation</code> is not empty, these are the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code> is empty, then it is the <code>owningNamespace</code> of the <code>AnnotatingElement</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingElement_AnnotatedElement()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='annotatingElement'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Element> getAnnotatedElement();

	/**
	 * Returns the value of the '<em><b>Owned Annotating Relationship</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Annotation}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatingElement <em>Owning Annotating Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotation() <em>Annotation</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this <code>AnnotatingElement</code> that are <code>Annotations</code>, for which this <code>AnnotatingElement</code> is the <code>annotatingElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Annotating Relationship</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingElement_OwnedAnnotatingRelationship()
	 * @see org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatingElement
	 * @model opposite="owningAnnotatingElement" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Annotation> getOwnedAnnotatingRelationship();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Annotation}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement <em>Annotating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Annotations</code> that relate this <code>AnnotatingElement</code> to its <code>annotatedElements</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingElement_Annotation()
	 * @see org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement
	 * @model opposite="annotatingElement"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

} // AnnotatingElement
