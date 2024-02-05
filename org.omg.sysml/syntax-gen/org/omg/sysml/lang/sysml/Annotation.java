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
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>Annotation</code> is a Relationship between an <code>AnnotatingElement</code> and the <code>Element</code> that is annotated by that <code>AnnotatingElement</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement <em>Annotating Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement <em>Owning Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatingElement <em>Owning Annotating Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Annotating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotation <em>Annotation</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>AnnotatingElement</code> that annotates the <code>annotatedElement</code> of this <code>Annotation</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotating Element</em>' reference.
	 * @see #setAnnotatingElement(AnnotatingElement)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_AnnotatingElement()
	 * @see org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotation
	 * @model opposite="annotation" required="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	AnnotatingElement getAnnotatingElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement <em>Annotating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotating Element</em>' reference.
	 * @see #getAnnotatingElement()
	 * @generated
	 */
	void setAnnotatingElement(AnnotatingElement value);

	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Element</code> that is annotated by the <code>annotatingElement</code> of this Annotation.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference.
	 * @see #setAnnotatedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_AnnotatedElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='annotation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Element getAnnotatedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Element</em>' reference.
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	void setAnnotatedElement(Element value);

	/**
	 * Returns the value of the '<em><b>Owning Annotated Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwnedAnnotation <em>Owned Annotation</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatedElement() <em>Annotated Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>annotatedElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Annotated Element</em>' reference.
	 * @see #setOwningAnnotatedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_OwningAnnotatedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedAnnotation
	 * @model opposite="ownedAnnotation" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Element getOwningAnnotatedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement <em>Owning Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Annotated Element</em>' reference.
	 * @see #getOwningAnnotatedElement()
	 * @generated
	 */
	void setOwningAnnotatedElement(Element value);

	/**
	 * Returns the value of the '<em><b>Owning Annotating Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.AnnotatingElement#getOwnedAnnotatingRelationship <em>Owned Annotating Relationship</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement() <em>Annotating Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>annotatingElement</code> of this <code>Annotation</code>, when it is also its <code>owningRelatedElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Annotating Element</em>' reference.
	 * @see #setOwningAnnotatingElement(AnnotatingElement)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnnotation_OwningAnnotatingElement()
	 * @see org.omg.sysml.lang.sysml.AnnotatingElement#getOwnedAnnotatingRelationship
	 * @model opposite="ownedAnnotatingRelationship" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	AnnotatingElement getOwningAnnotatingElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatingElement <em>Owning Annotating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Annotating Element</em>' reference.
	 * @see #getOwningAnnotatingElement()
	 * @generated
	 */
	void setOwningAnnotatingElement(AnnotatingElement value);

} // Annotation
