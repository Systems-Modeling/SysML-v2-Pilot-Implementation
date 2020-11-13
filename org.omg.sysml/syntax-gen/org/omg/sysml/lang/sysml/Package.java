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

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Package</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Package is an Element that contains other Elements, known as its <code>members</code>, via Membership Relationships with those Elements. Some of the <code>members</code> of a Package may be owned by the Package. The rest are imported into the Package, either as unowned <code>memberElements</code> of owned Memberships of the Package or via Import Relationships with other Packages.</p>
 * 
 * <p>A Package also acts as a namespace for its <code>members</code> that consists of the <code>memberNames</code> specified by all the Memberships in the Package. If a Membership specifies a <code>memberName</code>, then that is the name of the corresponding <code>memberElement</code> relative to the namespace defined by the Package. Note that the same Element may be the <code>memberElement</code> of multiple Memberships in a Package (though it may be owned at most once), each of which may define a separate alias for the Element relative to the Package namespace.</p>
 * 
 * membership->forAll(m1 | membership->forAll(m2 | m1 <> m2 implies m1.isDistinguishableFrom(m2)))
 * member = membership.memberElement
 * ownedMember = ownedMembership.ownedMemberElement
 * importedMembership = excludeCollisions(ownedImport.importedMembership())->select(m1 | ownedMembership->forAll(m2 | m1.isDistinguishableFrom(m2)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getOwnedImport_comp <em>Owned Import comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getOwnedMembership_comp <em>Owned Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getOwnedMembership <em>Owned Membership</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Element {
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
	 * <p>All Memberships in this Package, defined as the union of <tt>ownedMemberships</tt> and <tt>importedMemberships</tt>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_Membership()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='package'"
	 *        annotation="union"
	 * @generated
	 */
	EList<Membership> getMembership();

	/**
	 * Returns the value of the '<em><b>Owned Import comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Import}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Import#getImportOwningPackage <em>Import Owning Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Import comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Import Relationships for which this Package is the <tt>importingPackage</tt>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Import comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_OwnedImport_comp()
	 * @see org.omg.sysml.lang.sysml.Import#getImportOwningPackage
	 * @model opposite="importOwningPackage" containment="true"
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
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_OwnedImport()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Import> getOwnedImport();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the names of the given <code>element</code> as it is known in the namespace defined by this Package.</p>
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned <tt>members</tt> of this Package, derived as the <tt>ownedMemberElements</tt> of the <tt>ownedMemberships</tt> of the Package.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_OwnedMember()
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getMembership() <em>Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Membership</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Memberships in this Package that result from Import Relationships between the Package and other Packages. This excludes any Membership from one imported Package that would be indistinguishable from a Membership imported from another Package or from an <tt>ownedMembership</tt> of this Package.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_ImportedMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='importingPackage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Membership> getImportedMembership();

	/**
	 * Returns the value of the '<em><b>Owned Membership comp</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Membership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage <em>Membership Owning Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Membership comp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Memberships for which this Package is the <tt>membershipOwningPackage</tt>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Membership comp</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_OwnedMembership_comp()
	 * @see org.omg.sysml.lang.sysml.Membership#getMembershipOwningPackage
	 * @model opposite="membershipOwningPackage" containment="true"
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
	 *   <li>'{@link org.omg.sysml.lang.sysml.Package#getMembership() <em>Membership</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedRelationship_comp() <em>Owned Relationship comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_OwnedMembership()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Membership> getOwnedMembership();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Exclude from the given set <code>mem</code> of Memberships those that would not be distinguishable from each other if imported into this Package.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false" memMany="true" memOrdered="false"
	 * @generated
	 */
	EList<Membership> excludeCollisions(EList<Membership> mem);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the publicly visible Memberships of this Package, which includes those <code>ownedMemberships</code> that are with a <code>visibility</code> of <code>public</code> and those <code>importedMemberships</code> that where imported via Import Relationships with a <code>visibility</code> of <code>public</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Membership> publicMemberships();

} // Package
