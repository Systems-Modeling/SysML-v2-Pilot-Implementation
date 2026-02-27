/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>Import</code> is an <code>Relationship</code> between its <code>importOwningNamespace</code> and either a <code>Membership</code> (for a <code>MembershipImport</code>) or another <code>Namespace</code> (for a <code>NamespaceImport</code>), which determines a set of <code>Memberships</code> that become <code>importedMemberships</code> of the <code>importOwningNamespace</code>. If <code>isImportAll = false</code> (the default), then only public <code>Memberships</code> are considered &quot;visible&quot;. If <code>isImportAll = true</code>, then all <code>Memberships</code> are considered &quot;visible&quot;, regardless of their declared <code>visibility</code>. If <code>isRecursive = true</code>, then visible <code>Memberships</code> are also recursively imported from owned sub-<code>Namespaces</code>.</p>
 * 
 * 
 * importOwningNamespace.owner = null implies 
 *     visibility = VisibilityKind::private
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.Import#isIsImportAll <em>Is Import All</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Import#isIsRecursive <em>Is Recursive</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Import#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Import#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Import#getImportOwningNamespace <em>Import Owning Namespace</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getImport()
 * @model abstract="true"
 * @generated
 */
public interface Import extends Relationship {
	/**
	 * Returns the value of the '<em><b>Is Import All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether to import memberships without regard to declared visibility.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Import All</em>' attribute.
	 * @see #setIsImportAll(boolean)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getImport_IsImportAll()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsImportAll();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Import#isIsImportAll <em>Is Import All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Import All</em>' attribute.
	 * @see #isIsImportAll()
	 * @generated
	 */
	void setIsImportAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Recursive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether to recursively import Memberships from visible, owned sub-Namespaces.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Recursive</em>' attribute.
	 * @see #setIsRecursive(boolean)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getImport_IsRecursive()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRecursive();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Import#isIsRecursive <em>Is Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Recursive</em>' attribute.
	 * @see #isIsRecursive()
	 * @generated
	 */
	void setIsRecursive(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"private"</code>.
	 * The literals are from the enumeration {@link org.omg.sysml.model.sysml.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The visibility level of the imported <code>members</code> from this Import relative to the <code>importOwningNamespace</code>. The default is <code>private</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.model.sysml.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getImport_Visibility()
	 * @model default="private" required="true" ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Import#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.omg.sysml.model.sysml.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The effectively imported <code>Element</code> for this </code>Import</code>. For a <code>MembershipImport</code>, this is the <code>memberElement</code> of the <code>importedMembership</code>. For a <code>NamespaceImport</code>, it is the <code>importedNamespace</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference.
	 * @see #setImportedElement(Element)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getImport_ImportedElement()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='membershipImport'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Element getImportedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Import#getImportedElement <em>Imported Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Element</em>' reference.
	 * @see #getImportedElement()
	 * @generated
	 */
	void setImportedElement(Element value);

	/**
	 * Returns the value of the '<em><b>Import Owning Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.model.sysml.Namespace#getOwnedImport <em>Owned Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Namespace into which Memberships are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Owning Namespace</em>' reference.
	 * @see #setImportOwningNamespace(Namespace)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getImport_ImportOwningNamespace()
	 * @see org.omg.sysml.model.sysml.Namespace#getOwnedImport
	 * @model opposite="ownedImport" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Namespace getImportOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Import#getImportOwningNamespace <em>Import Owning Namespace</em>}' reference.
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
	 * <p>Returns Memberships that are to become <code>importedMemberships</code> of the <code>importOwningNamespace</code>. (The <code>excluded</code> parameter is used to handle the possibility of circular Import Relationships.)</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model excludedMany="true" excludedOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Membership> importedMemberships(EList<Namespace> excluded);

} // Import
