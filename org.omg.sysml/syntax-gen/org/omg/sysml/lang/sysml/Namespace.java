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
 * <p>A <code>Namespace</code> is an <code>Element</code> that contains other <code>Elements</code>, known as its <code>members</code>, via <code>Membership</code> <code>Relationships</code> with those <code>Elements</code>. The <code>members</code> of a <code>Namespace</code> may be owned by the <code>Namespace</code>, aliased in the <code>Namespace</code>, or imported into the <code>Namespace</code> via <code>Import</code> <code>Relationships</code>.</p>
 * 
 * <p>A <code>Namespace</code> can provide names for its <code>members</code> via the <code>memberNames</code> and <code>memberShortNames</code> specified by the <code>Memberships</code> in the <code>Namespace</code>. If a <code>Membership</code> specifies a <code>memberName</code> and/or <code>memberShortName</code>, then those are names of the corresponding <code>memberElement</code> relative to the <code>Namespace</code>. For an <code>OwningMembership</code>, the <code>owningMemberName</code> and <code>owningMemberShortName</code> are given by the <code>Element</code> <code>name</code> and <code>shortName</code>. Note that the same <code>Element</code> may be the <code>memberElement</code> of multiple <code>Memberships</code> in a <code>Namespace</code> (though it may be owned at most once), each of which may define a separate alias for the <code>Element</code> relative to the <code>Namespace</code>.</p>
 * 
 * membership->forAll(m1 | 
 *     membership->forAll(m2 | 
 *         m1 <> m2 implies m1.isDistinguishableFrom(m2)))
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
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership <em>Owned Membership</em>}</li>
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
	 * <p>All <code>Memberships</code> in this <code>Namespace</code>, including (at least) the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p>
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
	 * <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Imports</code>, for which the <code>Namespace</code> is the <code>importOwningNamespace</code>.</p>
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
	 * <p>Return the names of the given <code>element</code> as it is known in this <code>Namespace</code>.</p>
	 * 
	 * let elementMemberships : Sequence(Membership) = 
	 *     memberships->select(memberElement = element) in
	 * memberships.memberShortName->
	 *     union(memberships.memberName)->
	 *     asSet()
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false" elementRequired="true" elementOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<String> namesOf(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Returns this visibility of <code>mem</code> relative to this <code>Namespace</code>. If <code>mem</code> is an <code>importedMembership</code>, this is the <code>visibility</code> of its Import. Otherwise it is the <code>visibility</code> of the <code>Membership</code> itself.</p>
	 * 
	 * if importedMembership->includes(mem) then
	 *     ownedImport->
	 *         select(importedMemberships(Set{})->includes(mem)).
	 *         first().visibility
	 * else if memberships->includes(mem) then
	 *     mem.visibility
	 * else
	 *     VisibilityKind::private
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" memRequired="true" memOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	VisibilityKind visibilityOf(Membership mem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>If <code>includeAll = true</code>, then return all the <code>Memberships</code> of this <code>Namespace</code>. Otherwise, return only the publicly visible <code>Memberships</code> of this <code>Namespace</code> (which includes those <code>ownedMemberships</code> that have a <code>visibility</code> of <code>public</code> and those <code>importedMemberships</code> imported with a <code>visibility</code> of <code>public</code>). If <code>isRecursive = true</code>, also recursively include all visible <code>Memberships</code> of any visible owned <code>Namespaces</code>.</p>
	 * 
	 * let visibleMemberships : Sequence(Membership) =
	 *     if includeAll then memberships
	 *     else ownedMembership->
	 *         select(visibility = VisibilityKind::public)->
	 *         union(ownedImport->
	 *             select(visibility = VisibilityKind::public).
	 *             importedMemberships(excluded->including(self)))
	 *     endif in
	 * if not isRecursive then visibleMemberships
	 * else visibleMemberships->union(visibleMemberships->
	 *         selectAsKind(Namespace).
	 *         visibleMemberships(excluded->including(self), true, includeAll))
	 * endif
	 * <!-- end-model-doc -->
	 * @model excludedMany="true" excludedOrdered="false" isRecursiveDataType="org.omg.sysml.lang.types.Boolean" isRecursiveRequired="true" isRecursiveOrdered="false" includeAllDataType="org.omg.sysml.lang.types.Boolean" includeAllRequired="true" includeAllOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Membership> visibleMemberships(EList<Namespace> excluded, boolean isRecursive, boolean includeAll);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Derive the imported <code>Memberships</code> of this <code>Namespace</code> as the <code>importedMembership</code> of all <code>ownedImports</code>, excluding those Imports whose <code>importOwningNamespace</code> is in the <code>excluded</code> set, and excluding <code>Memberships</code> that have distinguisibility collisions with each other or with any <code>ownedMembership</code>.</p>
	 * 
	 * ownedImport.importedMemberships(excluded->including(self))
	 * <!-- end-model-doc -->
	 * @model excludedMany="true" excludedOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Membership> importedMemberships(EList<Namespace> excluded);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Resolve the given qualified name to the named <code>Membership</code> (if any), starting with this <code>Namespace</code> as the local scope. The qualified name string must conform to the concrete syntax of the KerML textual notation. According to the KerML name resolution rules every qualified name will resolve to either a single <code>Membership</code>, or to none.</p>
	 * 
	 * let qualification : String = qualificationOf(qualifiedName) in
	 * let name : String = unqualifiedNameOf(qualifiedName) in
	 * if qualification = null then resolveLocal(name)
	 * else 
	 *     let namespaceMembership : Membership = resolve(qualification) in
	 *     if namespaceMembership = null or 
	 *        not namespaceMembership.memberElement.oclIsKindOf(Namespace) 
	 *     then null
	 *     else 
	 *         namespaceMembership.memberElement.oclAsType(Namespace).
	 *         resolveVisible(name) 
	 *     endif
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.omg.sysml.lang.types.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Membership resolve(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Resolve the given qualified name to the named <code>Membership</code> (if any) in the effective global <code>Namespace</code> that is the outermost naming scope. The qualified name string must conform to the concrete syntax of the KerML textual notation.</p>
	 * 
	 * No OCL
	 * <!-- end-model-doc -->
	 * @model ordered="false" qualifiedNameDataType="org.omg.sysml.lang.types.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Membership resolveGlobal(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Resolve a simple <code>name</code> starting with this <code>Namespace</code> as the local scope, and continuing with containing outer scopes as necessary. However, if this <code>Namespace</code> is a root <code>Namespace</code>, then the resolution is done directly in global scope.</p>
	 * 
	 * if owningNamespace = null then resolveGlobal(name)
	 * else
	 *     let memberships : Membership = membership->
	 *         select(memberShortName = name or memberName = name) in
	 *     if memberships->notEmpty() then memberships->first()
	 *     else owningNamspace.resolveLocal(name)
	 *     endif
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false" nameDataType="org.omg.sysml.lang.types.String" nameRequired="true" nameOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Membership resolveLocal(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Resolve a simple name from the visible <code>Memberships</code> of this <code>Namespace</code>.</p>
	 * 
	 * let memberships : Sequence(Membership) =
	 *     visibleMemberships(Set{}, false, false)->
	 *     select(memberShortName = name or memberName = name) in
	 * if memberships->isEmpty() then null
	 * else memberships->first()
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false" nameDataType="org.omg.sysml.lang.types.String" nameRequired="true" nameOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Membership resolveVisible(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return a string with valid KerML syntax representing the qualification part of a given <code>qualifiedName</code>, that is, a qualified name with all the segment names of the given name except the last. If the given <code>qualifiedName</code> has only one segment, then return null.</p>
	 * No OCL
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false" qualifiedNameDataType="org.omg.sysml.lang.types.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String qualificationOf(String qualifiedName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the simple name that is the last segment name of the given <code>qualifiedName</code>. If this segment name has the form of a KerML unrestricted name, then "unescape" it by removing the surrounding single quotes and replacing all escape sequences with the specified character.</p>
	 * No OCL
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.String" required="true" ordered="false" qualifiedNameDataType="org.omg.sysml.lang.types.String" qualifiedNameRequired="true" qualifiedNameOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String unqualifiedNameOf(String qualifiedName);

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
	 * <p>The owned <code>members</code> of this <code>Namespace</code>, which are the <cpde><code>ownedMemberElements</code> of the <code>ownedMemberships</code> of the .</cpde></p>
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
	 * <p>The <code>Memberships</code> in this <code>Namespace</code> that result from the <code>ownedImports</code> of this <code>Namespace</code>.</p>
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
	 * <p>The <code>ownedRelationships</code> of this <code>Namespace</code> that are <code>Memberships</code>, for which the <code>Namespace</code> is the <code>membershipOwningNamespace</code>.</p>
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
