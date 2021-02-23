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
 * <p>A Namespace is an Element that contains other Elements, known as its <code>members</code>, via Membership Relationships with those Elements. Some of the <code>members</code> of a Namespace may be owned by the Namespace. The rest are imported into the Namespace, either as unowned <code>memberElements</code> of owned Memberships of the Namespace or via Import Relationships with other Namespaces.</p>
 * 
 * <p>A Namespace can provide names for its <code>members</code> via the <code>memberNames</code> specified by the Memberships in the Namespace. If a Membership specifies a <code>memberName</code>, then that is the name of the corresponding <code>memberElement</code> relative to the Namespace. Note that the same Element may be the <code>memberElement</code> of multiple Memberships in a Namespace (though it may be owned at most once), each of which may define a separate alias for the Element relative to the Namespace.</p>
 * 
 * membership->forAll(m1 | membership->forAll(m2 | m1 <> m2 implies m1.isDistinguishableFrom(m2)))
 * member = membership.memberElement
 * ownedMember = ownedMembership.ownedMemberElement
 * importedMembership = importedMemberships()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership_comp <em>Owned Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedImport_comp <em>Owned Import comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership <em>Owned Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Namespace#getOwnedImport <em>Owned Import</em>}</li>
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
	 * <p>All Memberships in this Namespace, defined as the union of <code>ownedMemberships</code> and <code>importedMemberships</code>.</p>
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
	 * Returns the value of the '<em><b>Owned Import comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Import}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Import#getImportOwningNamespace <em>Import Owning Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Import comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Import Relationships for which this Namespace is the <code>importingNamespace</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Import comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_OwnedImport_comp()
	 * @see org.omg.sysml.lang.sysml.Import#getImportOwningNamespace
	 * @model opposite="importOwningNamespace" containment="true"
	 * @generated
	 */
	EList<Import> getOwnedImport_comp();

	/**
	 * Returns the value of the '<em><b>Owned Import</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Import}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp() <em>Owned Relationship comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Import</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_OwnedImport()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Import> getOwnedImport();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the names of the given <code>element</code> as it is known in this Namespace.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false" elementRequired="true" elementOrdered="false"
	 * @generated
	 */
	EList<String> namesOf(Element element);

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
	 * <p>The Memberships in this Namespace that result from Import Relationships between the Namespace and other Namespaces. This excludes any Membership from one imported Namespace that would be indistinguishable from a Membership imported from another Namespace or from an <code>ownedMembership</code> of this Namespace.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_ImportedMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='importingNamespace'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Membership> getImportedMembership();

	/**
	 * Returns the value of the '<em><b>Owned Membership comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Membership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Membership comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Memberships for which this Namespace is the <code>membershipOwningNamespace</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Membership comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_OwnedMembership_comp()
	 * @see org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace
	 * @model opposite="membershipOwningNamespace" containment="true"
	 * @generated
	 */
	EList<Membership> getOwnedMembership_comp();

	/**
	 * Returns the value of the '<em><b>Owned Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Membership}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMembership() <em>Membership</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp() <em>Owned Relationship comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getNamespace_OwnedMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Membership> getOwnedMembership();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Exclude from the given set <code>mem</code> of Memberships those that would not be distinguishable from each other if imported into this Namespace.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false" memMany="true" memOrdered="false"
	 * @generated
	 */
	EList<Membership> excludeCollisions(EList<Membership> mem);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the publicly visible Memberships of this Namespace, which includes those <code>ownedMemberships</code> that are with a <code>visibility</code> of <code>public</code> and those <code>importedMemberships</code> that where imported via Import Relationships with a <code>visibility</code> of <code>public</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Membership> publicMemberships();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Derive the imported Memberships of this Namespace as the importedMembership of all <p>ownedImports</p>, excluding Memberships that have distinguisibility collisions with each other or with any <code>ownedMembership</code>.</p>
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='excludeCollisions(ownedImport.importedMembership())-&gt;\n    select(m1 | ownedMembership-&gt;forAll(m2 | m1.isDistinguishableFrom(m2)))'"
	 * @generated
	 */
	EList<Membership> importedMemberships();

} // Namespace
