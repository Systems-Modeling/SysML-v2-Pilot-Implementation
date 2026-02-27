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
 * A representation of the model object '<em><b>Unioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>Unioning</code> is a <code>Relationship</code> that makes its <code>unioningType</code> one of the <code>unioningTypes</code> of its <code>typeUnioned</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.Unioning#getTypeUnioned <em>Type Unioned</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.Unioning#getUnioningType <em>Unioning Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getUnioning()
 * @model
 * @generated
 */
public interface Unioning extends Relationship {
	/**
	 * Returns the value of the '<em><b>Type Unioned</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.model.sysml.Type#getOwnedUnioning <em>Owned Unioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> with interpretations partly determined by <code>unioningType</code>, as described in <code>Type::unioningType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Unioned</em>' reference.
	 * @see #setTypeUnioned(Type)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getUnioning_TypeUnioned()
	 * @see org.omg.sysml.model.sysml.Type#getOwnedUnioning
	 * @model opposite="ownedUnioning" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getTypeUnioned();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Unioning#getTypeUnioned <em>Type Unioned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Unioned</em>' reference.
	 * @see #getTypeUnioned()
	 * @generated
	 */
	void setTypeUnioned(Type value);

	/**
	 * Returns the value of the '<em><b>Unioning Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> that partly determines interpretations of <code>typeUnioned</code>, as described in <code>Type::unioningType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unioning Type</em>' reference.
	 * @see #setUnioningType(Type)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getUnioning_UnioningType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='unionedUnioning'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getUnioningType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.Unioning#getUnioningType <em>Unioning Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unioning Type</em>' reference.
	 * @see #getUnioningType()
	 * @generated
	 */
	void setUnioningType(Type value);

} // Unioning
