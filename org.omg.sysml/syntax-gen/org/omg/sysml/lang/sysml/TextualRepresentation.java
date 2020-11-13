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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A TextualRepresentation is an AnnotatingElement that whose <code>body</code> represents the <code>representedElement</code> in a given <code>language</code>. The named <code>language</code> can be a natural language, in which case the <code>body</code> is an informal representation, or an artifical language, in which case the <code>body</code> is expected to be a formal, machine-parsable representation.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TextualRepresentation#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TextualRepresentation#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TextualRepresentation#getRepresentedElement <em>Represented Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTextualRepresentation()
 * @model
 * @generated
 */
public interface TextualRepresentation extends AnnotatingElement {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTextualRepresentation_Language()
	 * @model dataType="org.omg.sysml.lang.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TextualRepresentation#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTextualRepresentation_Body()
	 * @model dataType="org.omg.sysml.lang.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TextualRepresentation#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Represented Element</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.AnnotatingElement#getAnnotatedElement() <em>Annotated Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Element represented textually by this TextualRepresentation, which is its single <code>annotatedElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represented Element</em>' reference.
	 * @see #setRepresentedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTextualRepresentation_RepresentedElement()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='textualRepresentation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Element getRepresentedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TextualRepresentation#getRepresentedElement <em>Represented Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Element</em>' reference.
	 * @see #getRepresentedElement()
	 * @generated
	 */
	void setRepresentedElement(Element value);

} // TextualRepresentation
