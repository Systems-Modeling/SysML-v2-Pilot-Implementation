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
 * A representation of the model object '<em><b>Library Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>LibraryPackage</code> is a <code>Package</code> that is the container for a model library. A <code>LibraryPackage</code> is itself a library <code>Element</code> as are all <code>Elements</code> that are directly or indirectly contained in it.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.LibraryPackage#isIsStandard <em>Is Standard</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getLibraryPackage()
 * @model
 * @generated
 */
public interface LibraryPackage extends org.omg.sysml.model.sysml.Package {
	/**
	 * Returns the value of the '<em><b>Is Standard</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>LibraryPackage</code> contains a standard library model. This should only be set to true for <code>LibraryPackages</code> in the standard Kernel Model Libraries or in normative model libraries for a language built on KerML.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Standard</em>' attribute.
	 * @see #setIsStandard(boolean)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getLibraryPackage_IsStandard()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsStandard();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.LibraryPackage#isIsStandard <em>Is Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Standard</em>' attribute.
	 * @see #isIsStandard()
	 * @generated
	 */
	void setIsStandard(boolean value);

} // LibraryPackage
