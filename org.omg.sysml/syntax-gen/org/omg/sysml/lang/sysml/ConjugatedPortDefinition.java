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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjugated Port Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ConjugatedPortDefinition is a PortDefinition that is a PortConjugation of its original PortDefinition. That is, a ConjugatedPortDefinition inherits all the <code>features</code> of the original PortDefinition, but input <code>flows</code> of the original PortDefinition become outputs on the ConjugatedPortDefinition and output <code>flows</code> of the original PortDefinition become inputs on the ConjugatedPortDefinition. Every PortDefinition has exactly one corresponding ConjugatedPortDefinition, whose name is the same as that of the originalPortDefinition, with the character <code>~</code> prepended.</p>
 * originalPortDefinition = ownedPortConjugator.originalPortDefinition
 * conjugatedPortDefinition = null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOwnedPortConjugator <em>Owned Port Conjugator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortDefinition()
 * @model
 * @generated
 */
public interface ConjugatedPortDefinition extends PortDefinition {
	/**
	 * Returns the value of the '<em><b>Owned Port Conjugator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.PortConjugation#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedConjugator() <em>Owned Conjugator</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port Conjugator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The PortConjugation that is the <tt>ownedConjugator</tt> of this ConjugatedPortDefinition, linking it its <tt>originalPortDefinition</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port Conjugator</em>' reference.
	 * @see #setOwnedPortConjugator(PortConjugation)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortDefinition_OwnedPortConjugator()
	 * @see org.omg.sysml.lang.sysml.PortConjugation#getConjugatedPortDefinition
	 * @model opposite="conjugatedPortDefinition" required="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	PortConjugation getOwnedPortConjugator();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOwnedPortConjugator <em>Owned Port Conjugator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Port Conjugator</em>' reference.
	 * @see #getOwnedPortConjugator()
	 * @generated
	 */
	void setOwnedPortConjugator(PortConjugation value);

	/**
	 * Returns the value of the '<em><b>Original Port Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.PortDefinition#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace() <em>Owning Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The original PortDefinition for this ConjugatedPortDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Port Definition</em>' reference.
	 * @see #setOriginalPortDefinition(PortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortDefinition_OriginalPortDefinition()
	 * @see org.omg.sysml.lang.sysml.PortDefinition#getConjugatedPortDefinition
	 * @model opposite="conjugatedPortDefinition" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	PortDefinition getOriginalPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOriginalPortDefinition <em>Original Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Port Definition</em>' reference.
	 * @see #getOriginalPortDefinition()
	 * @generated
	 */
	void setOriginalPortDefinition(PortDefinition value);

} // ConjugatedPortDefinition
