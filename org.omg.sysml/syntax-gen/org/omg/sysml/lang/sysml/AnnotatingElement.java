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
 * <p>An AnnotatingElement is an Element that provides additional description of or metadata on some other Element. An AnnotatingElement is attached to its <code>annotatedElement</code> by an Annotation Relationship.</p>
 * 
 * annotatedElement = 
 *  if annotation->notEmpty() then annotation.annotatedElement
 *  else owningNamespace endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotatedElement <em>Annotated Element</em>}</li>
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
	 * <p>The Elements that are annotated by this AnnotatingElement. If <code>annotation</code<> is not empty, this is derived as the <code>annotatedElements</code> of the <code>annotations</code>. If <code>annotation</code>, then it is derived as the <code>owningNamespace</code> of the AnnotatingElement.</p>
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
	 * Returns the value of the '<em><b>Annotation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Annotation}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement <em>Annotating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Annotations that relate this AnnotatingElement to its <code>annotatedElements</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotatingElement_Annotation()
	 * @see org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement
	 * @model opposite="annotatingElement"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

} // AnnotatingElement
