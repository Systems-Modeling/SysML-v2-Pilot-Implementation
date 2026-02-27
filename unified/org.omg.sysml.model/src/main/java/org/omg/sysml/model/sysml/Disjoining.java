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
 * A representation of the model object '<em><b>Disjoining</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Disjoining</code> is a <code>Relationship</code> between <code>Types</code> asserted to have interpretations that are not shared (disjoint) between them, identified as <code>typeDisjoined</code> and <code>disjoiningType</code>. For example, a <code>Classifier</code> for mammals is disjoint from a <code>Classifier</code> for minerals, and a <code>Feature</code> for people&#39;s parents is disjoint from a <code>Feature</code> for their children.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.Disjoining#getDisjoiningType <em>Disjoining Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Disjoining#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Disjoining#getTypeDisjoined <em>Type Disjoined</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getDisjoining()
 * @model
 * @generated
 */
public interface Disjoining extends Relationship {
	/**
	 * Returns the value of the '<em><b>Disjoining Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> asserted to be disjoint with the <code>typeDisjoined</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disjoining Type</em>' reference.
	 * @see #setDisjoiningType(Type)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getDisjoining_DisjoiningType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='disjoinedTypeDisjoining'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getDisjoiningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Disjoining#getDisjoiningType <em>Disjoining Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjoining Type</em>' reference.
	 * @see #getDisjoiningType()
	 * @generated
	 */
	void setDisjoiningType(Type value);

	/**
	 * Returns the value of the '<em><b>Owning Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.model.sysml.Type#getOwnedDisjoining <em>Owned Disjoining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A <code>typeDisjoined</code> that is also an <code>owningRelatedElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Type</em>' reference.
	 * @see #setOwningType(Type)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getDisjoining_OwningType()
	 * @see org.omg.sysml.model.sysml.Type#getOwnedDisjoining
	 * @model opposite="ownedDisjoining" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getOwningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Disjoining#getOwningType <em>Owning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Type</em>' reference.
	 * @see #getOwningType()
	 * @generated
	 */
	void setOwningType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Disjoined</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> asserted to be disjoint with the <code>disjoiningType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Disjoined</em>' reference.
	 * @see #setTypeDisjoined(Type)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getDisjoining_TypeDisjoined()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='disjoiningTypeDisjoining'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getTypeDisjoined();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Disjoining#getTypeDisjoined <em>Type Disjoined</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Disjoined</em>' reference.
	 * @see #getTypeDisjoined()
	 * @generated
	 */
	void setTypeDisjoined(Type value);

} // Disjoining
