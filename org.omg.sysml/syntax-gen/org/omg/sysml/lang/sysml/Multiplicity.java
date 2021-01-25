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
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Multiplicity</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Multiplicity is a Feature whose co-domain is a set of natural numbers that includes the number&nbsp;of sequences determined below, based on the kind of&nbsp;typeWithMultiplicity:</p>
 * 
 * <ul>
 * 	<li>Classifiers: minimal sequences (the single length sequences of the Classifier).</li>
 * 	<li>Features: sequences with the same feature-pair head.&nbsp; In the case of Features with Classifiers as domain and co-domain, these sequences are pairs, with the first element in&nbsp;a single-length sequence of the domain Classifier (head of the pair), and the number of pairs with the same first element being among the Multiplicity co-domain numbers.</li>
 * </ul>
 * 
 * <p>Multiplicity co-domains (in models) can be specified by Expression that might vary in their results. If the <code>typeWithMultiplicity</code> is a Classifier, the domain of the Multiplicity shall be <em>Anything</em>.  If the <code>typeWithMultiplicity</code> is a Feature,  the Multiplicity shall have the same domain as the <code>typeWithMultiplicity</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends Feature {

} // Multiplicity
