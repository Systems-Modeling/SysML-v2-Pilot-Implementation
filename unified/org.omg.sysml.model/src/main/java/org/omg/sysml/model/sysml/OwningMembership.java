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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owning Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>OwningMembership</code> is a <code>Membership</code> that owns its <code>memberElement</code> as a <code>ownedRelatedElement</code>. The <code>ownedMemberElement</code> becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code>.</p>
 * 
 * ownedMemberName = ownedMemberElement.name
 * ownedMemberShortName = ownedMemberElement.shortName
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.OwningMembership#getOwnedMemberElementId <em>Owned Member Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.OwningMembership#getOwnedMemberName <em>Owned Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.OwningMembership#getOwnedMemberShortName <em>Owned Member Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.OwningMembership#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getOwningMembership()
 * @model
 * @generated
 */
public interface OwningMembership extends Membership {
	/**
	 * Returns the value of the '<em><b>Owned Member Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>elementId</code> of the <code>ownedMemberElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Element Id</em>' attribute.
	 * @see #setOwnedMemberElementId(String)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOwningMembership_OwnedMemberElementId()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getOwnedMemberElementId();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.OwningMembership#getOwnedMemberElementId <em>Owned Member Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Element Id</em>' attribute.
	 * @see #getOwnedMemberElementId()
	 * @generated
	 */
	void setOwnedMemberElementId(String value);

	/**
	 * Returns the value of the '<em><b>Owned Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>name</code> of the <code>ownedMemberElement</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Name</em>' attribute.
	 * @see #setOwnedMemberName(String)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOwningMembership_OwnedMemberName()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getOwnedMemberName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.OwningMembership#getOwnedMemberName <em>Owned Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Name</em>' attribute.
	 * @see #getOwnedMemberName()
	 * @generated
	 */
	void setOwnedMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Member Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>shortName</code> of the <code>ownedMemberElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Short Name</em>' attribute.
	 * @see #setOwnedMemberShortName(String)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOwningMembership_OwnedMemberShortName()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	String getOwnedMemberShortName();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.OwningMembership#getOwnedMemberShortName <em>Owned Member Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Short Name</em>' attribute.
	 * @see #getOwnedMemberShortName()
	 * @generated
	 */
	void setOwnedMemberShortName(String value);

	/**
	 * Returns the value of the '<em><b>Owned Member Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.model.sysml.Element#getOwningMembership <em>Owning Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Element</code> that becomes an <code>ownedMember</code> of the <code>membershipOwningNamespace</code> due to this <code>OwningMembership</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member Element</em>' reference.
	 * @see #setOwnedMemberElement(Element)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOwningMembership_OwnedMemberElement()
	 * @see org.omg.sysml.model.sysml.Element#getOwningMembership
	 * @model opposite="owningMembership" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Element getOwnedMemberElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.OwningMembership#getOwnedMemberElement <em>Owned Member Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Member Element</em>' reference.
	 * @see #getOwnedMemberElement()
	 * @generated
	 */
	void setOwnedMemberElement(Element value);

} // OwningMembership
