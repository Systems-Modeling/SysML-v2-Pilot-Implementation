/*******************************************************************************
 *  SysML 2 Pilot Implementation
 *  Copyright (c) 2026 Model Driven Solutions, Inc.
 *   
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Differencing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><code>Differencing</code> is a <code>Relationship</code> that makes its <code>differencingType</code> one of the <code>differencingTypes</code> of its <code>typeDifferenced</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Differencing#getDifferencingType <em>Differencing Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Differencing#getTypeDifferenced <em>Type Differenced</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDifferencing()
 * @model
 * @generated
 */
public interface Differencing extends Relationship {
	/**
	 * Returns the value of the '<em><b>Differencing Type</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><code>Type</code> that partly determines interpretations of <code>typeDifferenced</code>, as described in <code>Type::differencingType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Differencing Type</em>' reference.
	 * @see #setDifferencingType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDifferencing_DifferencingType()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='differencedDifferencing'"
	 *        annotation="redefines"
	 * @generated
	 */
	Type getDifferencingType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Differencing#getDifferencingType <em>Differencing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Differencing Type</em>' reference.
	 * @see #getDifferencingType()
	 * @generated
	 */
	void setDifferencingType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Differenced</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Type#getOwnedDifferencing <em>Owned Differencing</em>}'.
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
	 * <p><code>Type</code> with interpretations partly determined by <code>differencingType</code>, as described in <code>Type::differencingType</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Differenced</em>' reference.
	 * @see #setTypeDifferenced(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDifferencing_TypeDifferenced()
	 * @see org.omg.sysml.lang.sysml.Type#getOwnedDifferencing
	 * @model opposite="ownedDifferencing" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getTypeDifferenced();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Differencing#getTypeDifferenced <em>Type Differenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Differenced</em>' reference.
	 * @see #getTypeDifferenced()
	 * @generated
	 */
	void setTypeDifferenced(Type value);

} // Differencing
