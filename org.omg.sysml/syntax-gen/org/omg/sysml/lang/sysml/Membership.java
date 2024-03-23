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
 * <p>A <code>Membership</code> is a <code>Relationship</code> between a <code>Namespace</code> and an <code>Element</code> that indicates the <code>Element</code> is a <code>member</code> of (i.e., is contained in) the Namespace. Any <code>memberNames</code> specify how the <code>memberElement</code> is identified in the <code>Namespace</code> and the <code>visibility</code> specifies whether or not the <code>memberElement</code> is publicly visible from outside the <code>Namespace</code>.</p>
 * 
 * <p>If a <code>Membership</code> is an <code>OwningMembership</code>, then it owns its <code>memberElement</code>, which becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>. Otherwise, the <code>memberNames</code> of a <code>Membership</code> are effectively aliases within the <code>membershipOwningNamespace</code> for an <code>Element</code> with a separate <code>OwningMembership</code> in the same or a different <code>Namespace</code>.</p>
 * 
 * <p>&nbsp;</p>
 * 
 * memberElementId = memberElement.elementId
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMemberElementId <em>Member Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMemberShortName <em>Member Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Membership#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership()
 * @model
 * @generated
 */
public interface Membership extends Relationship {
	/**
	 * Returns the value of the '<em><b>Member Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>elementId</code> of the <code>memberElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Element Id</em>' attribute.
	 * @see #setMemberElementId(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MemberElementId()
	 * @model dataType="org.omg.sysml.lang.types.String" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getMemberElementId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMemberElementId <em>Member Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Element Id</em>' attribute.
	 * @see #getMemberElementId()
	 * @generated
	 */
	void setMemberElementId(String value);

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
	 * <p>Whether or not the <code>Membership</code> of the <code>memberElement</code> in the <code>membershipOwningNamespace</code> is publicly visible outside that <code>Namespace</code>.</p>
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
	 * <p>The <code>Element</code> that becomes a <code>member</code> of the <code>membershipOwningNamespace</code> due to this <code>Membership</code>.</p>
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
	 * Returns the value of the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Name</em>' attribute.
	 * @see #setMemberName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MemberName()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	String getMemberName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMemberName <em>Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Name</em>' attribute.
	 * @see #getMemberName()
	 * @generated
	 */
	void setMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Membership Owning Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership <em>Owned Membership</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getOwningRelatedElement() <em>Owning Related Element</em>}'</li>
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
	 * <p>The <code>Namespace</code> of which the <code>memberElement</code> becomes a <cpde>member due to this <code>Membership</code>.</cpde></p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership Owning Namespace</em>' reference.
	 * @see #setMembershipOwningNamespace(Namespace)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MembershipOwningNamespace()
	 * @see org.omg.sysml.lang.sysml.Namespace#getOwnedMembership
	 * @model opposite="ownedMembership" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Namespace getMembershipOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Membership Owning Namespace</em>' reference.
	 * @see #getMembershipOwningNamespace()
	 * @generated
	 */
	void setMembershipOwningNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Member Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The short name of the <code>memberElement</code> relative to the <code>membershipOwningNamespace</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member Short Name</em>' attribute.
	 * @see #setMemberShortName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMembership_MemberShortName()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	String getMemberShortName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Membership#getMemberShortName <em>Member Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Short Name</em>' attribute.
	 * @see #getMemberShortName()
	 * @generated
	 */
	void setMemberShortName(String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>Membership</code> is distinguishable from a given <code>other</code> <code>Membership</code>. By default, this is true if this <code>Membership</code> has no <code>memberShortName</code> or <code>memberName</code>; or each of the <code>memberShortName</code> and <code>memberName</code> are different than both of those of the <code>other</code> <code>Membership</code>; or neither of the metaclasses of the <code>memberElement</code> of this <code>Membership</code> and the <code>memberElement</code> of the <code>other</code> <code>Membership</code> conform to the other. But this may be overridden in specializations of <code>Membership</code>.</p>
	 * 
	 * not (memberElement.oclKindOf(other.memberElement.oclType()) or
	 *      other.memberElement.oclKindOf(memberElement.oclType())) or
	 * (shortMemberName = null or
	 *     (shortMemberName <> other.shortMemberName and
	 *      shortMemberName <> other.memberName)) and
	 * (memberName = null or
	 *     (memberName <> other.shortMemberName and
	 *      memberName <> other.memberName)))
	 * 
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean isDistinguishableFrom(Membership other);

} // Membership
