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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Package is a Namespace used to group Elements, without any instance-level semantics. It may have one or more model-level evaluable <code>filterCondition</code> Expressions used to filter its <code>importedMemberships</code>. Any imported <code>member</code> must meet all of the <code>filterConditions</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Package#getFilterCondition <em>Filter Condition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Namespace {
	/**
	 * Returns the value of the '<em><b>Filter Condition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The model-level evaluable Boolean Expressions used to filter the <code>members</code> of this Package, derived as those <code>ownedMembers</code> of the Package that are owned via ElementFilterMembership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Condition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPackage_FilterCondition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conditionedPackage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Expression> getFilterCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Determine whether the given <code>element</code> meets all the <code>filterConditions</code>.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" elementRequired="true" elementOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let metadataAnnotations: Sequence(AnnotatingElement) = \n    element.ownedAnnotation.annotatingElement-&gt;\n        select(oclIsKindOf(AnnotatingFeature)) in\n    self.filterCondition-&gt;forAll(cond | \n        metadataAnnotations-&gt;exists(elem | \n            self.checkCondition(elem, cond)))'"
	 * @generated
	 */
	boolean includeAsMember(Element element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Model-level evaluate the given <code>condition</code> Expression with the given <code>element</code> as its target. If the result is a LiteralBoolean, return its <code>value</code>. Otherwise return <em>false</em>.</p>
	 * <!-- end-model-doc -->
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false" elementRequired="true" elementOrdered="false" conditionRequired="true" conditionOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='let results: Sequence(Element) = condition.evaluate(element) in\n    result-&gt;size() = 1 and\n    results-&gt;at(1).oclIsKindOf(LiteralBoolean) and \n    results-&gt;at(1).oclAsType(LiteralBoolean).value'"
	 * @generated
	 */
	boolean checkCondition(Element element, Expression condition);

} // Package
