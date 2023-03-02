/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
 * A representation of the model object '<em><b>Conjugated Port Typing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ConjugatedPortTyping</code> is a <code>FeatureTyping</code> whose <code>type</code> is a <code>ConjugatedPortDefinition</code>. (This relationship is intended to be an abstract-syntax marker for a special surface notation for conjugated typing of ports.)</p>
 * portDefinition = conjugatedPortDefinition.originalPortDefinition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping#getPortDefinition <em>Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortTyping()
 * @model
 * @generated
 */
public interface ConjugatedPortTyping extends FeatureTyping {
	/**
	 * Returns the value of the '<em><b>Port Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>originalPortDefinition</code> of the <code>conjugatedPortDefinition</code> of this <code>ConjugatedPortTyping</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Definition</em>' reference.
	 * @see #setPortDefinition(PortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortTyping_PortDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conjugatedPortTyping'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	PortDefinition getPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping#getPortDefinition <em>Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Definition</em>' reference.
	 * @see #getPortDefinition()
	 * @generated
	 */
	void setPortDefinition(PortDefinition value);

	/**
	 * Returns the value of the '<em><b>Conjugated Port Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureTyping#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conjugated Port Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>type</code> of this <code>ConjugatedPortTyping</code> considered as a <code>FeatureTyping</code>, which must be a <code>ConjugatedPortDefinition</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conjugated Port Definition</em>' reference.
	 * @see #setConjugatedPortDefinition(ConjugatedPortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortTyping_ConjugatedPortDefinition()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typingByConjugatedPort'"
	 *        annotation="redefines"
	 * @generated
	 */
	ConjugatedPortDefinition getConjugatedPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugated Port Definition</em>' reference.
	 * @see #getConjugatedPortDefinition()
	 * @generated
	 */
	void setConjugatedPortDefinition(ConjugatedPortDefinition value);

} // ConjugatedPortTyping
