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
 * A representation of the model object '<em><b>Occurrence Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>OccurrenceDefinition</code> is a <code>Definition</code> of a <code>Class</code> of individuals that have an independent life over time and potentially an extent over space. This includes both structural things and behaviors that act on such structures. If <code>isIndividual</code> is true, then the <code>OccurrenceDefinition</code> is constrained to have (at most) a single instance that is the entire life of a single individual.</p>
 * isIndividual implies specializesFromLibrary('Occurrences::Life')
 * isIndividual implies
 *     multiplicity <> null and
 *     multiplicity.specializesFromLibrary('Base::zeroOrOne')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.OccurrenceDefinition#isIsIndividual <em>Is Individual</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getOccurrenceDefinition()
 * @model
 * @generated
 */
public interface OccurrenceDefinition extends Definition, org.omg.sysml.model.sysml.Class {
	/**
	 * Returns the value of the '<em><b>Is Individual</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>OccurrenceDefinition</code> is constrained to represent at most one thing.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Individual</em>' attribute.
	 * @see #setIsIndividual(boolean)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOccurrenceDefinition_IsIndividual()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsIndividual();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.OccurrenceDefinition#isIsIndividual <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Individual</em>' attribute.
	 * @see #isIsIndividual()
	 * @generated
	 */
	void setIsIndividual(boolean value);

} // OccurrenceDefinition
