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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Element is a constituent of a model that is uniquely identified relative to all other Elements. It can have Relationships with other Elements. Some of these Relationships might imply ownership of other Elements, which means that if an Element is deleted from a model, then so are all the Elements that it owns.</p>
 * 
 * name = if owningNamespace = null then null
 * else owningNamespace.nameOf(self) endif
 * ownedElement = ownedRelationship.ownedRelatedElement
 * owner = owningRelationship.owningRelatedElement
 * documentingComment = documentation.documentingComment
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getDocumentation_comp <em>Documentation comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedAnnotation_comp <em>Owned Annotation comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getDocumentationComment <em>Documentation Comment</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedTextualRepresentation <em>Owned Textual Representation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getAliasId <em>Alias Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getHumanId <em>Human Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedAnnotation <em>Owned Annotation</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Membership</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp <em>Owned Member Element comp</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship() <em>Owning Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Membership</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>owningRelationship</tt> of this Element, if that Relationship is a Membership.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Membership</em>' container reference.
	 * @see #setOwningMembership(Membership)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningMembership()
	 * @see org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp
	 * @model opposite="ownedMemberElement_comp" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Membership getOwningMembership();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Membership</em>' container reference.
	 * @see #getOwningMembership()
	 * @generated
	 */
	void setOwningMembership(Membership value);

	/**
	 * Returns the value of the '<em><b>Owned Relationship comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Relationship}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement <em>Owning Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Relationship comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Relationships for which this Element is the <tt>owningRelatedElement</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Relationship comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedRelationship_comp()
	 * @see org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement
	 * @model opposite="owningRelatedElement" containment="true"
	 * @generated
	 */
	EList<Relationship> getOwnedRelationship_comp();

	/**
	 * Returns the value of the '<em><b>Owning Relationship</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Relationship</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Relationship for which this Element is an <tt>ownedRelatedElement</tt>, if any.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Relationship</em>' container reference.
	 * @see #setOwningRelationship(Relationship)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningRelationship()
	 * @see org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp
	 * @model opposite="ownedRelatedElement_comp" transient="false" ordered="false"
	 * @generated
	 */
	Relationship getOwningRelationship();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship <em>Owning Relationship</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Relationship</em>' container reference.
	 * @see #getOwningRelationship()
	 * @generated
	 */
	void setOwningRelationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Owning Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Package#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Package that is the owning namespace for this Element, derived as the <tt>membershipOwningPackage</tt> of the <tt>owningMembership</tt> of this Element, if any.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Namespace</em>' reference.
	 * @see #setOwningNamespace(org.omg.sysml.lang.sysml.Package)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningNamespace()
	 * @see org.omg.sysml.lang.sysml.Package#getOwnedMember
	 * @model opposite="ownedMember" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Package getOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Namespace</em>' reference.
	 * @see #getOwningNamespace()
	 * @generated
	 */
	void setOwningNamespace(org.omg.sysml.lang.sysml.Package value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Elements owned by this Element, derived as the <tt>ownedRelatedElements</tt> of the <tt>ownedRelationships</tt> of this Element.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedElement()
	 * @see org.omg.sysml.lang.sysml.Element#getOwner
	 * @model opposite="owner" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Documentation comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Documentation}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Documentation#getOwningDocumentedElement <em>Owning Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedAnnotations</code> of this Element that are Documentation.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Documentation_comp()
	 * @see org.omg.sysml.lang.sysml.Documentation#getOwningDocumentedElement
	 * @model opposite="owningDocumentedElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<Documentation> getDocumentation_comp();

	/**
	 * Returns the value of the '<em><b>Owned Annotation comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Annotation}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement <em>Owning Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this Element that are Annotations.</code>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Annotation comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedAnnotation_comp()
	 * @see org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement
	 * @model opposite="owningAnnotatedElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<Annotation> getOwnedAnnotation_comp();

	/**
	 * Returns the value of the '<em><b>Documentation Comment</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Comment}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Comments that document this Element, derived as the <code>documentingComments</code> of the <code>documentation</code> of the Element.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation Comment</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_DocumentationComment()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='documentedElement'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Comment> getDocumentationComment();

	/**
	 * Returns the value of the '<em><b>Owned Textual Representation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.TextualRepresentation}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>textualRepresentations</code> that are <code>ownedElements</code> of this Element.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Textual Representation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedTextualRepresentation()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningRepresentedElement'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<TextualRepresentation> getOwnedTextualRepresentation();

	/**
	 * Returns the value of the '<em><b>Alias Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Various alternative identifiers for this Element. Generally, these will be set by tools, but one of them (the <code>humanId</code>), in particular, may be set by the modeler.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias Id</em>' attribute list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_AliasId()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getAliasId();

	/**
	 * Returns the value of the '<em><b>Human Id</b></em>' attribute.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getAliasId() <em>Alias Id</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An identifier for this Element that is set by the modeler. It is the responsibility of the modeler to maintain the uniqueness of this identifier within a model or relative to some other context. The <code>modeledId</code> essentially acts as an alias for an Element that is specifically tied to that Element, rather than being a name for it in the context of some explicit namespace.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Human Id</em>' attribute.
	 * @see #setHumanId(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_HumanId()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	String getHumanId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getHumanId <em>Human Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Id</em>' attribute.
	 * @see #getHumanId()
	 * @generated
	 */
	void setHumanId(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owner of this Element, derived as the <tt>owningRelatedElement</tt> of the <tt>owningRelationship</tt> of this Element, if any.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Owner()
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedElement
	 * @model opposite="ownedElement" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Element value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The globally unique identifier for this Element. This is intended to be set by tooling, and it must not change during the lifetime of the Element.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Identifier()
	 * @model id="true" dataType="org.omg.sysml.lang.types.String" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The primary name of this Element. If the Element is owned by a Package, then its <code>name</code> is derived as the <code>memberName</code> of the <code>owningMembership</code> of the Element.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Name()
	 * @model dataType="org.omg.sysml.lang.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Relationship</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Relationship</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedRelationship()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Relationship> getOwnedRelationship();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Documentation}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedAnnotation_comp() <em>Owned Annotation comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Documentation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Owned Annotation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Annotation}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp() <em>Owned Relationship comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Annotation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Annotation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedAnnotation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Annotation> getOwnedAnnotation();
	
} // Element
