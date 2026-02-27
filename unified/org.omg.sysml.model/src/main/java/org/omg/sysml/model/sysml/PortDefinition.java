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
 * A representation of the model object '<em><b>Port Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>PortDefinition</code> defines a point at which external entities can connect to and interact with a system or part of a system. Any <code>ownedUsages</code> of a <code>PortDefinition</code>, other than <code>PortUsages</code>, must not be composite.</p>
 * 
 * 
 * 
 * conjugatedPortDefinition = 
 * let conjugatedPortDefinitions : OrderedSet(ConjugatedPortDefinition) =
 *     ownedMember->selectByKind(ConjugatedPortDefinition) in
 * if conjugatedPortDefinitions->isEmpty() then null
 * else conjugatedPortDefinitions->first()
 * endif
 * ownedUsage->
 *     reject(oclIsKindOf(PortUsage))->
 *     forAll(not isComposite)
 * not oclIsKindOf(ConjugatedPortDefinition) implies
 *     ownedMember->
 *         selectByKind(ConjugatedPortDefinition)->
 *         size() = 1
 * specializesFromLibrary('Ports::Port')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.PortDefinition#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getPortDefinition()
 * @model
 * @generated
 */
public interface PortDefinition extends OccurrenceDefinition, Structure {
	/**
	 * Returns the value of the '<em><b>Conjugated Port Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.model.sysml.ConjugatedPortDefinition#getOriginalPortDefinition <em>Original Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <codeConjugatedPortDefinition</code> that is conjugate to this <code>PortDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conjugated Port Definition</em>' reference.
	 * @see #setConjugatedPortDefinition(ConjugatedPortDefinition)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getPortDefinition_ConjugatedPortDefinition()
	 * @see org.omg.sysml.model.sysml.ConjugatedPortDefinition#getOriginalPortDefinition
	 * @model opposite="originalPortDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ConjugatedPortDefinition getConjugatedPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.PortDefinition#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugated Port Definition</em>' reference.
	 * @see #getConjugatedPortDefinition()
	 * @generated
	 */
	void setConjugatedPortDefinition(ConjugatedPortDefinition value);

} // PortDefinition
