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
 * '<em><b>Import</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Import is a Relationship between an <code>importOwningNamespace</code> and an <code>importedNamespace</code> in which the visible member Elements of the <code>importedNamespace</code> become imported <code>members</code> of the <code>importOwningNamespace</code>. An Import may be <em>public,</em> in which case the imported <code>members</code> are &quot;re-exported&quot; as publicly visible <code>members</code> of the <code>importOwningNamespace</code>, or it may be <em>private,</em> in which case the imported <code>members</code> are private to the <code>importOwningNamespace</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Import#isRecursive <em>Is Recursive</em>}</li>
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
	 * This feature subsets the following features:
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
	 *        annotation="subsets"
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
	 * <p>Whether the imported <code>members</code> from this Import become public or private <code>members</code> of the <code>importOwningNamespace</code>.</p>
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
	 * Returns the value of the '<em><b>Is Recursive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether to recursively import Memberships from all visible, owned sub-namespaces of the <code>importedNamespace</code>.</p>
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
	 * Returns the value of the '<em><b>Import Owning Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Namespace#getOwnedImport_comp <em>Owned Import comp</em>}'.
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
	 * <p>The Namespace into which <code>members</cpde> are imported by this Import, which must be the <code>owningRelatedElement</code> of the Import.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Owning Namespace</em>' container reference.
	 * @see #setImportOwningNamespace(Namespace)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getImport_ImportOwningNamespace()
	 * @see org.omg.sysml.lang.sysml.Namespace#getOwnedImport_comp
	 * @model opposite="ownedImport_comp" transient="false" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Namespace getImportOwningNamespace();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Import#getImportOwningNamespace <em>Import Owning Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Owning Namespace</em>' container reference.
	 * @see #getImportOwningNamespace()
	 * @generated
	 */
	void setImportOwningNamespace(Namespace value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Returns the Memberships of the <code>importedNamespace</code> whose <code>memberElements</code> are to become imported <code>members</code> of the <code>importOwningNamespace</code>. By default, this is the set of publicly visible Memberships of the <code>importedNamespace</code>, but this may be overridden in specializations of Import</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Membership> importedMembership();

} // Import
