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
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Membership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Membership is a Relationship between a Namespace and an Element that indicates the Element is a <code>member</code> of (i.e., is contained in) the Namespace. The Membership may define a <code>memberName</code> for the Element as a <code>member</code> of the Namespace and specifies whether or not the Element is publicly visible as a <code>member</code> of the Namespace from outside the Namespace. The Element may be owned by the Namespace, in which case it is an <code>ownedMember</code> of the Namespace, or it may be referenced but not owned, in which case it is effectively individually imported into the Namespace.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp <em>Owned Member Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership()
 * @model
 * @generated
 */
public interface Membership extends Relationship {
	/**
	 * Returns the value of the '<em><b>Member Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Member Name</em>' attribute.
	 * @see #setMemberName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MemberName()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	String getMemberName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMemberName <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Name</em>' attribute.
	 * @see #getMemberName()
	 * @generated
	 */
	void setMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"public"</code>.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether or not the Membership of the <code>memberElement</code> in the <code>membershipOwningNamespace</code> is publicly visible outside that Namespace. Unless the <code>membershipOwningNamespace</code> is a Type, <code>visibility</code> must be either <code>public</code> or <code>private</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the
	 * '{@link org.omg.sysml.lang.sysml.Membership#getVisibility
	 * <em>Visibility</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Member Element</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Element</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Element that becomes a <code>member</code> of the <code>membershipOwningNamespace</code> due to this Membership.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Element</em>' reference.
	 * @see #setMemberElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MemberElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='membership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Element getMemberElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMemberElement <em>Member Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Element</em>' reference.
	 * @see #getMemberElement()
	 * @generated
	 */
	void setMemberElement(Element value);

	/**
	 * Returns the value of the '<em><b>Membership Owning Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership_comp <em>Owned Membership comp</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Namespace of which the <code>memberElement</code> becomes a <cpde>member</code> due to this Membership.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership Owning Namespace</em>' container reference.
	 * @see #setMembershipOwningNamespace(Namespace)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MembershipOwningNamespace()
	 * @see org.omg.sysml.lang.sysml.Namespace#getOwnedMembership_comp
	 * @model opposite="ownedMembership_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Namespace getMembershipOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Membership Owning Namespace</em>' container reference.
	 * @see #getMembershipOwningNamespace()
	 * @generated
	 */
	void setMembershipOwningNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Owned Member Element comp</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwningMembership <em>Owning Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Element comp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>memberElement</code> of this Membership if it is owned by the Membership as an <code>ownedRelatedElement</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Element comp</em>' containment reference.
	 * @see #setOwnedMemberElement_comp(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_OwnedMemberElement_comp()
	 * @see org.omg.sysml.lang.sysml.Element#getOwningMembership
	 * @model opposite="owningMembership" containment="true" ordered="false"
	 * @generated
	 */
	Element getOwnedMemberElement_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement_comp <em>Owned Member Element comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Element comp</em>' containment reference.
	 * @see #getOwnedMemberElement_comp()
	 * @generated
	 */
	void setOwnedMemberElement_comp(Element value);

	/**
	 * Returns the value of the '<em><b>Owned Member Element</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMemberElement() <em>Member Element</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member Element</em>' reference.
	 * @see #setOwnedMemberElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_OwnedMemberElement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwnedMemberElement();

	/**
	 * Sets the value of the
	 * '{@link org.omg.sysml.lang.sysml.Membership#getOwnedMemberElement <em>Owned
	 * Member Element</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Owned Member Element</em>' reference.
	 * @see #getOwnedMemberElement()
	 * @generated
	 */
	void setOwnedMemberElement(Element value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this Membership is distinguishable from a given <code>other</code> Membership. By default, this is true if the <code>memberName</code> of this Membership is either empty or is different the <code>memberName</code> of the <code>other</code> Membership, or if the metaclass of the <code>memberElement</code> of this Membership is different than the metaclass of the <cosw>memberElement</cosw> of the <cosw>other</cosw> Membership. But this may be overridden in specializations of Membership.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 * @generated
	 */
	boolean isDistinguishableFrom(Membership other);

} // Membership
