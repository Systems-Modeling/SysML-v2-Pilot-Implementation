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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>MultiplicityRange</code> is a <code>Multiplicity</code> whose value is defined to be the (inclusive) range of natural numbers given by the result of a <code>lowerBound</code> <code>Expression</code> and the result of an <code>upperBound</code> <code>Expression</code>. The result of these <code>Expressions</code> shall be of type <code><em>Natural</em></code>. If the result of the <code>upperBound</code> <code>Expression</code> is the unbounded value <code>*</code>, then the specified range includes all natural numbers greater than or equal to the <code>lowerBound</code> value. If no <code>lowerBound</code> <code>Expression</code>, then the default is that the lower bound has the same value as the upper bound, except if the <code>upperBound</code> evaluates to <code>*</code>, in which case the default for the lower bound is 0.</p>
 * 
 * bound->forAll(b | b.featuringType = self.featuringType)
 * bound->forAll(b |
 *     b.result.specializesFromLibrary('ScalarValues::Integer') and
 *     let value : UnlimitedNatural = valueOf(b) in
 *     value <> null implies value >= 0
 * )
 * lowerBound =
 *     let ownedMembers : Sequence(Element) = 
 *         ownedMembership->selectByKind(OwningMembership).ownedMember in
 *     if ownedMembers->size() < 2 or 
 *         not ownedMembers->first().oclIsKindOf(Expression) then null
 *     else ownedMembers->first().oclAsType(Expression)
 *     endif
 * upperBound =
 *     let ownedMembers : Sequence(Element) = 
 *         ownedMembership->selectByKind(OwningMembership).ownedMember in
 *     if ownedMembers->isEmpty() or 
 *        not ownedMembers->last().oclIsKindOf(Expression) 
 *     then null
 *     else ownedMembers->last().oclAsType(Expression)
 *     endif 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MultiplicityRange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.MultiplicityRange#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.MultiplicityRange#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicityRange()
 * @model
 * @generated
 */
public interface MultiplicityRange extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.MultiplicityRange#getBound() <em>Bound</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expression</code> whose result provides the lower bound of the <code>MultiplicityRange</code>. If no <code>lowerBound</code> <code>Expression</code> is given, then the lower bound shall have the same value as the upper bound, unless the upper bound is unbounded (<code>*</code>), in which case the lower bound shall be 0.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' reference.
	 * @see #setLowerBound(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicityRange_LowerBound()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='multiplicity'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getLowerBound();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MultiplicityRange#getLowerBound <em>Lower Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.MultiplicityRange#getBound() <em>Bound</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The <code>Expression</code> whose result is the upper bound of the <code>MultiplicityRange</code>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' reference.
	 * @see #setUpperBound(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicityRange_UpperBound()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='multiplicity'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getUpperBound();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MultiplicityRange#getUpperBound <em>Upper Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Expression value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The owned <code>Expressions</code> of the <code>MultiplicityRange</code> whose results provide its bounds. These must be the only <code>ownedMembers</code> of the <code>MultiplicityRange</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicityRange_Bound()
	 * @model required="true" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='multiplicity'"
	 *        annotation="union"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Expression> getBound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Check whether this <code>MultiplicityRange</code> represents the range bounded by the given values <code>lower</code> and <code>upper</code>, presuming the <code>lowerBound</code> and <code>upperBound</code> <code>Expressions</code> are model-level evaluable.</p>
	 * valueOf(upperBound) = upper and
	 * let lowerValue: UnlimitedNatural = valueOf(lowerBound) in
	 * (lowerValue = lower or
	 *  lowerValue = null and 
	 *     (lower = upper or 
	 *      lower = 0 and upper = *))
	 *  
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" lowerDataType="org.omg.sysml.lang.types.Integer" lowerRequired="true" lowerOrdered="false" upperDataType="org.omg.sysml.lang.types.UnlimitedNatural" upperRequired="true" upperOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	boolean hasBounds(int lower, int upper);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Evaluate the given <code>bound</code> <code>Expression</code> (at model level) and return the result represented as a MOF <code>UnlimitedNatural</code> value.</p>
	 * if bound = null or not bound.isModelLevelEvaluable then 
	 *     null
	 * else
	 *     let boundEval: Sequence(Element) = bound.evaluate(owningType) in
	 *     if boundEval->size() <> 1 then null else
	 *         let valueEval: Element = boundEval->at(1) in
	 *         if valueEval.oclIsKindOf(LiteralInfinity) then *
	 *         else if valueEval.oclIsKindOf(LiteralInteger) then
	 *             let value : Integer = 
	 *                 valueEval.oclAsKindOf(LiteralInteger).value in
	 *             if value >= 0 then value else null endif
	 *         else null
	 *         endif endif
	 *     endif
	 * endif 
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.UnlimitedNatural" ordered="false" boundOrdered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	int valueOf(Expression bound);

} // MultiplicityRange
