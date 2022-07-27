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
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Namespace</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Namespace is an Element that contains other Elements, known as its <code>members</code>, via Membership Relationships with those Elements. The <code>members</code> of a Namespace may be owned by the Namespace, aliased in the Namespace, or imported into the Namespace via Import Relationships with other Namespaces.</p>
 * 
 * <p>A Namespace can provide names for its <code>members</code> via the <code>memberNames</code> specified by the Memberships in the Namespace. If a Membership specifies a <code>memberName</code>, then that is the name of the corresponding <code>memberElement</code> relative to the Namespace. Note that the same Element may be the <code>memberElement</code> of multiple Memberships in a Namespace (though it may be owned at most once), each of which may define a separate alias for the Element relative to the Namespace.</p>
 * 
 * membership->forAll(m1 | membership->forAll(m2 | m1 <> m2 implies m1.isDistinguishableFrom(m2)))
 * member = membership.memberElement
 * ownedMember = ownedMembership->selectByKind(OwningMembership).ownedMemberElement
 * importedMembership = importedMemberships(Set{})
 * ownedImport = ownedRelationship->selectByKind(Import)
 * ownedMembership = ownedRelationship->selectByKind(Membership)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership <em>Owned Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getImportedMembership <em>Imported Membership</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends Element {
	/**
	 * Returns the value of the '<em><b>Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Membership}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Membership</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>All Memberships in this Namespace, including (at least) the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_Membership()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='membershipNamespace'"
	 *        annotation="union"
	 * @generated
	 */
	EList<Membership> getMembership();

	/**
	 * Returns the value of the '<em><b>Owned Import</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Import}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Import#getImportOwningNamespace <em>Import Owning Namespace</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this Namespace that are Imports, for which the Namespace is the <code>importOwningNamespace</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Import</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_OwnedImport()
	 * @see org.omg.sysml.lang.sysml.Import#getImportOwningNamespace
	 * @model opposite="importOwningNamespace" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Import> getOwnedImport();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the names of the given <code>element</code> as it is known in this Namespace.</p>
	 * 
	 * let elementMemberships : Sequence(Membership) = 
	 *     memberships->select(memberElement = element) 
	 * in
	 *     memberships.memberShortName->
	 *         union(memberships.memberName)->
	 *         asSet()
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false" elementRequired="true" elementOrdered="false"
	 * @generated
	 */
	EList<String> namesOf(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Returns this visibility of <code>mem</code> relative to this Namespace. If <code>mem</code> is an <code>importedMembership</code>, this is the <code>visibility</code> of its Import. Otherwise it is the <code>visibility</code> of the Membership itself.</p>
	 * if importedMembership->includes(mem) then
	 *     ownedImport->any(importedMembership(Set{})->includes(mem)).visibility
	 * else if memberships->includes(mem) then
	 *     mem.visibility
	 * else
	 *     VisibilityKind::private
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" memRequired="true" memOrdered="false"
	 * @generated
	 */
	VisibilityKind visibilityOf(Membership mem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If <code>includeAll = true</code>, then return all the Memberships of this Namespace. Otherwise, return
	 * only the publicly visible Memberships of this Namespace (which includes those <code>ownedMemberships</code> that have a <code>visibility</code> of <code>public</code> and those <code>importedMemberships</code> imported with a <code>visibility</code> of <code>public</code>). If <code>isRecursive = true</code>, also recursively include all visible Memberships of any visible owned Namespaces.</p>
	 * 
	 * let publicMemberships : Sequence(Membership) =
	 *     ownedMembership->
	 *         select(visibility = VisibilityKind::public)->
	 *         union(ownedImport->
	 *             select(visibility = VisibilityKind::public).
	 *             importedMembership(excluded)) in
	 * if not isRecursive then publicMemberships
	 * else publicMemberships->union(publicMemberships->
	 *         selectAsKind(Namespace).
	 *         publicMembership(excluded->including(this), true))
	 * endif
	 * <!-- end-model-doc -->
	 * @model excludedMany="true" excludedOrdered="false" isRecursiveDataType="org.omg.sysml.lang.types.Boolean" isRecursiveRequired="true" isRecursiveOrdered="false" includeAllDataType="org.omg.sysml.lang.types.Boolean" includeAllRequired="true" includeAllOrdered="false"
	 * @generated
	 */
	EList<Membership> visibleMemberships(EList<Namespace> excluded, boolean isRecursive, boolean includeAll);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Derive the imported Memberships of this Namespace as the <code>importedMembership</code> of all <code>ownedImports</code>, excluding those Imports whose <code>importOwningNamespace</code> is in the <code>excluded</code> set, and excluding Memberships that have distinguisibility collisions with each other or with any <code>ownedMembership</code>.</p>
	 * ownedImport->
	 *     excluding(excluded->contains(importOwningNamespace)).
	 *     importedMembership(excluded)
	 * <!-- end-model-doc -->
	 * @model excludedMany="true" excludedOrdered="false"
	 * @generated
	 */
	EList<Membership> importedMemberships(EList<Namespace> excluded);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list. The list
	 * contents are of type {@link org.omg.sysml.lang.sysml.Element}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_Member()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
	 *        body='namespace'"
	 * @generated
	 */
	EList<Element> getMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Element}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace <em>Owning Namespace</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned <code>members</code> of this Namespace, derived as the <cpde>ownedMemberElements</code> of the <code>ownedMemberships</code> of the Namespace.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_OwnedMember()
	 * @see org.omg.sysml.lang.sysml.Element#getOwningNamespace
	 * @model opposite="owningNamespace" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Element> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Imported Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Membership}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMembership() <em>Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Membership</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Memberships in this Namespace that result from Import Relationships between the Namespace and other Namespaces.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_ImportedMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='importingNamespace'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Membership> getImportedMembership();

	/**
	 * Returns the value of the '<em><b>Owned Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Membership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMembership() <em>Membership</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship() <em>Owned Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedRelationships</code> of this Namespace that are Memberships, for which the Namespace is the <code>membershipOwningNamespace</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_OwnedMembership()
	 * @see org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace
	 * @model opposite="membershipOwningNamespace" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Membership> getOwnedMembership();

} // Namespace
