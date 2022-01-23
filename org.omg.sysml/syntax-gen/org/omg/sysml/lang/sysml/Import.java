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
 * '<em><b>Import</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Import is a Relationship between an <code>importOwningNamespace</code> in which one or more of the visible Memberships of the <code>importedNamespace</code> become <code>importedMemberships</code> of the <code><code>importOwningNamespace</code></code>. If <code><code>isImportAll = false</code></code> (the default), then only public Memberships are considered &quot;visible&quot;. If <code>isImportAll = true</code>, then all Memberships are considered &quot;visible&quot;, regardless of their declared <code>visibility</code>.</p>
 * 
 * <p>If no <code>importedMemberName</code> is given, then all visible Memberships are imported from the <code>importedNamespace</code>. If <code>isRecursive = true</code>, then visible Memberships are also recursively imported from all visible <code>ownedMembers</code> of the Namespace that are also Namespaces.</p>
 * 
 * <p>If an <code><code> importedMemberName</code></code> is given, then the Membership whose <code><code>effectiveMemberName</code> </code>is that name is imported from the <code><code>importedNamespace</code></code>, if it is visible. If <code><code>isRecursive = true</code></code> and the imported <code><code>memberElement</code></code> is a Namespace, then visible Memberships are also recursively imported from that Namespace and its owned sub-Namespaces.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getImportedMemberName <em>Imported Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#isRecursive <em>Is Recursive</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#isImportAll <em>Is Import All</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getImportOwningNamespace <em>Import Owning Namespace</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends Relationship {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Namespace whose visible <code>members</code> are imported by this Import.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' reference.
	 * @see #setImportedNamespace(Namespace)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_ImportedNamespace()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='import'"
	 *        annotation="redefines"
	 * @generated
	 */
	Namespace getImportedNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getImportedNamespace <em>Imported Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' reference.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(Namespace value);

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
	 * <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_Visibility()
	 * @model default="public" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getVisibility
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
	 * Returns the value of the '<em><b>Imported Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>effectiveMemberName</code> of the Membership of the <code>importedNamspace</code> to be imported. If not given, all public Memberships of the <code>importedNamespace</code> are imported.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Member Name</em>' attribute.
	 * @see #setImportedMemberName(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_ImportedMemberName()
	 * @model dataType="org.omg.sysml.lang.types.String" ordered="false"
	 * @generated
	 */
	String getImportedMemberName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getImportedMemberName <em>Imported Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Member Name</em>' attribute.
	 * @see #getImportedMemberName()
	 * @generated
	 */
	void setImportedMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Is Recursive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether to recursively import Memberships from visible, owned sub-namespaces.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Recursive</em>' attribute.
	 * @see #setIsRecursive(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_IsRecursive()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRecursive();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#isRecursive <em>Is Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Recursive</em>' attribute.
	 * @see #isRecursive()
	 * @generated
	 */
	void setIsRecursive(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Import All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Import All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether to import memberships without regard to declared visibility.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Import All</em>' attribute.
	 * @see #setIsImportAll(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_IsImportAll()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isImportAll();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#isImportAll <em>Is Import All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Import All</em>' attribute.
	 * @see #isImportAll()
	 * @generated
	 */
	void setIsImportAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Import Owning Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Namespace#getOwnedImport <em>Owned Import</em>}'.
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
	 * <p>The Namespace into which <code>members</code> are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Owning Namespace</em>' reference.
	 * @see #setImportOwningNamespace(Namespace)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_ImportOwningNamespace()
	 * @see org.omg.sysml.lang.sysml.Namespace#getOwnedImport
	 * @model opposite="ownedImport" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 * @generated
	 */
	Namespace getImportOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getImportOwningNamespace <em>Import Owning Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Owning Namespace</em>' reference.
	 * @see #getImportOwningNamespace()
	 * @generated
	 */
	void setImportOwningNamespace(Namespace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Returns the Memberships of the <code>importedNamespace</code> whose <code>memberElements</code> are to become imported <code>members</code> of the <code>importOwningNamespace</code>. By default, this is the set of publicly visible Memberships of the <code>importedNamespace</code>, but this may be overridden in specializations of Import. (The <code>excluded</code> parameter is used to handle the possibility of circular Import Relationships.)</p>
	 * 
	 * let exclusions : Set(Namespace) = 
	 *     excluded->including(importOwningNamspace) in
	 * let visibleMemberships : Sequence(Membership) = 
	 *     importedNamespace.visibleMemberships(exclusions, false, isImportAll) in
	 * let memberships : Sequence(Membership) =
	 *     if importedMemberName = null then visibleMemberships
	 *     else visibleMemberships->select(effectiveMemberName = importedMemberName)
	 *     endif in
	 * if not isRecursive then memberships
	 * else memberships->union(
	 *         memberships.ownedMember->selectAsKind(Namespace).
	 *         visibleMemberships(exclusions, true, isImportAll))
	 * endif
	 * <!-- end-model-doc -->
	 * @model excludedMany="true" excludedOrdered="false"
	 * @generated
	 */
	EList<Membership> importedMembership(EList<Namespace> excluded);

} // Import
