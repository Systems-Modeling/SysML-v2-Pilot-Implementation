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
 * A representation of the model object '<em><b>Item Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>ItemUsage</code> is a <code>ItemUsage</code> whose <code>definition</code> is a <code>Structure</code>. Nominally, if the <code>definition</code> is an <code>ItemDefinition</code>, an <code>ItemUsage</code> is a <code>ItemUsage</code> of that <code>ItemDefinition</code> within a system. However, other kinds of Kernel <code>Structures</code> are also allowed, to permit use of <code>Structures</code> from the Kernel Model Libraries.</p>
 * itemDefinition = occurrenceDefinition->selectByKind(ItemDefinition)
 * specializesFromLibrary('Items::items')
 * isComposite and owningType <> null and
 * (owningType.oclIsKindOf(ItemDefinition) or
 *  owningType.oclIsKindOf(ItemUsage)) implies
 *     specializesFromLibrary('Items::Item::subitem')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ItemUsage#getItemDefinition <em>Item Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemUsage()
 * @model
 * @generated
 */
public interface ItemUsage extends OccurrenceUsage {
	/**
	 * Returns the value of the '<em><b>Item Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Structure}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.OccurrenceUsage#getOccurrenceDefinition() <em>Occurrence Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Structures that are the <code>definitions</code> of this ItemUsage. Nominally, these are ItemDefinitions, but other kinds of Kernel Structures are also allowed, to permit use of Structures from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getItemUsage_ItemDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedItem'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Structure> getItemDefinition();

} // ItemUsage
