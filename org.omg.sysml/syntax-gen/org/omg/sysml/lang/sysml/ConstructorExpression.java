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
 * A representation of the model object '<em><b>Constructor Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ConstructorExpression</code> is an <code>InstantiationExpression</code> whose <code>result</code> specializes its <code>instantiatedType</code>, binding some or all of the <code>features</code> of the <code>instantiatedType</code> to the <code>results</code> of its <code>argument</code> <code>Expressions</code>.</p>
 * instantiatedType.feature->collect(f | 
 *     result.ownedFeatures->select(redefines(f)).valuation->
 *     select(v | v <> null).value
 * )
 * let features : OrderedSet(Feature) = instantiatedType.feature->
 *     select(visibility = VisibilityKind::public) in
 * result.ownedFeature->forAll(f1 | result.ownedFeature->forAll(f2 |
 *     f1 <> f2 implies
 *         f1.ownedRedefinition.redefinedFeature->
 *             intersection(f2.ownedRedefinition.redefinedFeature)->
 *             intersection(features)->isEmpty()))
 * let features : OrderedSet(Feature) = instantiatedType.feature->
 *     select(owningMembership.visibility = VisibilityKind::public) in
 * result.ownedFeature->forAll(f | 
 *     f.ownedRedefinition.redefinedFeature->
 *         intersection(features)->size() = 1)
 * TBD
 * specializes('Performances::constructorEvaluations')
 * result.specializes(instantiatedType)
 * ownedFeatures->excluding(result)->isEmpty()
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConstructorExpression()
 * @model
 * @generated
 */
public interface ConstructorExpression extends InstantiationExpression {
} // ConstructorExpression
