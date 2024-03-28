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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>Element</code> is a constituent of a model that is uniquely identified relative to all other <code>Elements</code>. It can have <code>Relationships</code> with other <code>Elements</code>. Some of these <code>Relationships</code> might imply ownership of other <code>Elements</code>, which means that if an <code>Element</code> is deleted from a model, then so are all the <code>Elements</code> that it owns.</p>
 * 
 * ownedElement = ownedRelationship.ownedRelatedElement
 * owner = owningRelationship.owningRelatedElement
 * qualifiedName =
 *     if owningNamespace = null then null
 *     else if owningNamespace.owner = null then escapedName()
 *     else if owningNamespace.qualifiedName = null or 
 *             escapedName() = null then null
 *     else owningNamespace.qualifiedName + '::' + escapedName()
 *     endif endif endif
 * documentation = ownedElement->selectByKind(Documentation)
 * ownedAnnotation = ownedRelationship->
 *     selectByKind(Annotation)->
 *     select(a | a.annotatedElement = self)
 * name = effectiveName()
 * ownedRelationship->exists(isImplied) implies isImpliedIncluded
 * isLibraryElement = libraryNamespace() <> null
 * 
 * shortName = effectiveShortName()
 * owningNamespace =
 *     if owningMembership = null then null
 *     else owningMembership.membershipOwningNamespace
 *     endif
 * textualRepresentation = ownedElement->selectByKind(TextualRepresentation)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getOwnedAnnotation <em>Owned Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getTextualRepresentation <em>Textual Representation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getAliasIds <em>Alias Ids</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getDeclaredShortName <em>Declared Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getDeclaredName <em>Declared Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#isImpliedIncluded <em>Is Implied Included</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Element#isLibraryElement <em>Is Library Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Membership</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElement <em>Owned Member Element</em>}'.
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
	 * <p>The <code>owningRelationship</code> of this <code>Element</code>, if that <code>Relationship</code> is a <code>Membership</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Membership</em>' reference.
	 * @see #setOwningMembership(OwningMembership)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningMembership()
	 * @see org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElement
	 * @model opposite="ownedMemberElement" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	OwningMembership getOwningMembership();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Membership</em>' reference.
	 * @see #getOwningMembership()
	 * @generated
	 */
	void setOwningMembership(OwningMembership value);

	/**
	 * Returns the value of the '<em><b>Owning Relationship</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement <em>Owned Related Element</em>}'.
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
	 * @see org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement
	 * @model opposite="ownedRelatedElement" transient="false" ordered="false"
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
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Namespace</code> that owns this <code>Element</code>, which is the <code>membershipOwningNamespace</code> of the <code>owningMembership</code> of this <code>Element</code>, if any.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Namespace</em>' reference.
	 * @see #setOwningNamespace(Namespace)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwningNamespace()
	 * @see org.omg.sysml.lang.sysml.Namespace#getOwnedMember
	 * @model opposite="ownedMember" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Namespace getOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Namespace</em>' reference.
	 * @see #getOwningNamespace()
	 * @generated
	 */
	void setOwningNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The globally unique identifier for this Element. This is intended to be set by tooling, and it must not change during the lifetime of the Element.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_ElementId()
	 * @model id="true" dataType="org.omg.sysml.lang.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getElementId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(String value);

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
	 * @model opposite="owner" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The full ownership-qualified name of this <code>Element</code>, represented in a form that is valid according to the KerML textual concrete syntax for qualified names (including use of unrestricted name notation and escaped characters, as necessary). The <code>qualifiedName</code> is null if this <code>Element</code> has no <code>owningNamespace</code> or if there is not a complete ownership chain of named <code>Namespaces</code> from a root <code>Namespace</code> to this <code>Element</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_QualifiedName()
	 * @model dataType="org.omg.sysml.lang.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Is Implied Included</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether all necessary implied Relationships have been included in the <code>ownedRelationships</code> of this Element. This property may be true, even if there are not actually any <code>ownedRelationships</code> with <code>isImplied = true</code>, meaning that no such Relationships are actually implied for this Element. However, if it is false, then <code>ownedRelationships</code> may <em>not</em> contain any implied Relationships. That is, either <em>all</em> required implied Relationships must be included, or none of them.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Implied Included</em>' attribute.
	 * @see #setIsImpliedIncluded(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_IsImpliedIncluded()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isImpliedIncluded();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#isImpliedIncluded <em>Is Implied Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implied Included</em>' attribute.
	 * @see #isImpliedIncluded()
	 * @generated
	 */
	void setIsImpliedIncluded(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Library Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this Element is contained in the ownership tree of a library model.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Library Element</em>' attribute.
	 * @see #setIsLibraryElement(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_IsLibraryElement()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isLibraryElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#isLibraryElement <em>Is Library Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Library Element</em>' attribute.
	 * @see #isLibraryElement()
	 * @generated
	 */
	void setIsLibraryElement(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveName()</code> operation. By default, it is the same as the <code>declaredName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>name</code> even when the <code>declaredName</code> is null.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Name()
	 * @model dataType="org.omg.sysml.lang.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owner of this Element, derived as the <code>owningRelatedElement</code> of the <code>owningRelationship</code> of this Element, if any.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Owner()
	 * @see org.omg.sysml.lang.sysml.Element#getOwnedElement
	 * @model opposite="ownedElement" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
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
	 * Returns the value of the '<em><b>Declared Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The declared name of this <code>Element</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Name</em>' attribute.
	 * @see #setDeclaredName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_DeclaredName()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	String getDeclaredName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getDeclaredName <em>Declared Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Name</em>' attribute.
	 * @see #getDeclaredName()
	 * @generated
	 */
	void setDeclaredName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The short name to be used for this <code>Element</code> during name resolution within its <code>owningNamespace</code>. This is derived using the <code>effectiveShortName()</code> operation. By default, it is the same as the <code>declaredShortName</code>, but this is overridden for certain kinds of <code>Elements</code> to compute a <code>shortName</code> even when the <code>declaredName</code> is null.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_ShortName()
	 * @model dataType="org.omg.sysml.lang.types.String" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Relationship}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement <em>Owning Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Relationships for which this Element is the <tt>owningRelatedElement</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Relationship</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedRelationship()
	 * @see org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement
	 * @model opposite="owningRelatedElement" containment="true"
	 * @generated
	 */
	EList<Relationship> getOwnedRelationship();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Documentation}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Documentation#getDocumentedElement <em>Documented Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Documentation owned by this Element.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_Documentation()
	 * @see org.omg.sysml.lang.sysml.Documentation#getDocumentedElement
	 * @model opposite="documentedElement" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Documentation> getDocumentation();

	/**
	 * Returns the value of the '<em><b>Owned Annotation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Annotation}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement <em>Owning Annotated Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this <code>Element</code> that are <code>Annotations</code>, for which this <code>Element</code> is the <code>annotatedElement</code>.</code>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Annotation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_OwnedAnnotation()
	 * @see org.omg.sysml.lang.sysml.Annotation#getOwningAnnotatedElement
	 * @model opposite="owningAnnotatedElement" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Annotation> getOwnedAnnotation();

	/**
	 * Returns the value of the '<em><b>Textual Representation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.TextualRepresentation}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.TextualRepresentation#getRepresentedElement <em>Represented Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>TextualRepresentations</code> that annotate this <code>Element</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Textual Representation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_TextualRepresentation()
	 * @see org.omg.sysml.lang.sysml.TextualRepresentation#getRepresentedElement
	 * @model opposite="representedElement" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<TextualRepresentation> getTextualRepresentation();

	/**
	 * Returns the value of the '<em><b>Alias Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Various alternative identifiers for this Element. Generally, these will be set by tools.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias Ids</em>' attribute list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_AliasIds()
	 * @model dataType="org.omg.sysml.lang.types.String"
	 * @generated
	 */
	EList<String> getAliasIds();

	/**
	 * Returns the value of the '<em><b>Declared Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An optional alternative name for the <code>Element</code> that is intended to be shorter or in some way more succinct than its primary <code>name</code>. It may act as a modeler-specified identifier for the <code>Element</code>, though it is then the responsibility of the modeler to maintain the uniqueness of this identifier within a model or relative to some other context.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declared Short Name</em>' attribute.
	 * @see #setDeclaredShortName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElement_DeclaredShortName()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	String getDeclaredShortName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Element#getDeclaredShortName <em>Declared Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Short Name</em>' attribute.
	 * @see #getDeclaredShortName()
	 * @generated
	 */
	void setDeclaredShortName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return <code>name</code>, if that is not null, otherwise the <code>shortName</code>, if that is not null, otherwise null. If the returned value is non-null, it is returned as-is if it has the form of a basic name, or, otherwise, represented as a restricted name according to the lexical structure of the KerML textual notation (i.e., surrounded by single quote characters and with special characters escaped).</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String escapedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return an effective <code>shortName</code> for this <code>Element</code>. By default this is the same as its <code>declaredShortName</code>.</p>
	 * declaredShortName
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String effectiveShortName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return an effective <code>name</code> for this <code>Element</code>. By default this is the same as its <code>declaredName</code>.</p>
	 * declaredName
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String effectiveName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>By default, return the library Namespace of the <code>owningRelationship</code> of this Element, if it has one.</p>
	 * if owningRelationship <> null then owningRelationship.libraryNamespace()
	 * else null endif
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Namespace libraryNamespace();
	
} // Element
