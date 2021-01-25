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
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Documentation is an Annotation whose <code>annotatingElement</code> is a Comment that provides documentation of the <code>annotatedElement</code>. Documentation is always an <code>ownedRelationship</code> of its <code>annotedElement</code>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Documentation#getDocumentingComment_comp <em>Documenting Comment comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Documentation#getOwningDocumentedElement <em>Owning Documented Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Documentation#getDocumentingComment <em>Documenting Comment</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends Annotation {
	/**
	 * Returns the value of the '<em><b>Documenting Comment comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Annotation#getAnnotatingElement() <em>Annotating Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Comment, which is owned by the Documentation Relationship, that documents the <code>owningDocumentedElement</code> of this Documentation.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documenting Comment comp</em>' containment reference.
	 * @see #setDocumentingComment_comp(Comment)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDocumentation_DocumentingComment_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='documentingAnnotation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Comment getDocumentingComment_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Documentation#getDocumentingComment_comp <em>Documenting Comment comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documenting Comment comp</em>' containment reference.
	 * @see #getDocumentingComment_comp()
	 * @generated
	 */
	void setDocumentingComment_comp(Comment value);

	/**
	 * Returns the value of the '<em><b>Owning Documented Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getDocumentation_comp <em>Documentation comp</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement() <em>Owning Annotated Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>annotatedElement</code> of this Documentation, which must own the Relationship.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Documented Element</em>' container reference.
	 * @see #setOwningDocumentedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDocumentation_OwningDocumentedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getDocumentation_comp
	 * @model opposite="documentation_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Element getOwningDocumentedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Documentation#getOwningDocumentedElement <em>Owning Documented Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Documented Element</em>' container reference.
	 * @see #getOwningDocumentedElement()
	 * @generated
	 */
	void setOwningDocumentedElement(Element value);

	/**
	 * Returns the value of the '<em><b>Documenting Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documenting Comment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documenting Comment</em>' reference.
	 * @see #setDocumentingComment(Comment)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDocumentation_DocumentingComment()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Comment getDocumentingComment();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Documentation#getDocumentingComment <em>Documenting Comment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documenting Comment</em>' reference.
	 * @see #getDocumentingComment()
	 * @generated
	 */
	void setDocumentingComment(Comment value);

} // Documentation
