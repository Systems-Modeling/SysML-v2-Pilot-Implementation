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
 * <p>A <code>Multiplicity</code> is a <code>Feature</code> whose co-domain is a set of natural numbers giving the allowed cardinalities of each <code>typeWithMultiplicity</code>. The <em>cardinality</em> of a <code>Type</code> is defined as follows, depending on whether the <code>Type</code> is a <code>Classifier</code> or <code>Feature</code>.
 * <ul>
 * <li><code>Classifier</code> – The number of basic instances of the <code>Classifier</code>, that is, those instances representing things, which are not instances of any subtypes of the <code>Classifier</code> that are <code>Features</code>.
 * <li><code>Features</code> – The number of instances with the same featuring instances. In the case of a <code>Feature</code> with a <code>Classifier</code> as its <code>featuringType</code>, this is the number of values of <code>Feature</code> for each basic instance of the <code>Classifier</code>. Note that, for non-unique <code>Features</code>, all duplicate values are included in this count.</li>
 * </ul>
 * 
 * <p><code>Multiplicity</code> co-domains (in models) can be specified by <code>Expression</code> that might vary in their results. If the <code>typeWithMultiplicity</code> is a <code>Classifier</code>, the domain of the <code>Multiplicity</code> shall be <em><code>Base::Anything</code></em>.  If the <code>typeWithMultiplicity</code> is a <code>Feature</code>,  the <code>Multiplicity</code> shall have the same domain as the <code>typeWithMultiplicity</code>.</p>
 * 
 * if owningType <> null and owningType.oclIsKindOf(Feature) then
 *     featuringType = 
 *         owningType.oclAsType(Feature).featuringType
 * else
 *     featuringType->isEmpty()
 * endif
 * specializesFromLibrary('Base::naturals')
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends Feature {

} // Multiplicity
