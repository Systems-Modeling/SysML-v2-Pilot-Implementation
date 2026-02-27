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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>OccurrenceUsage</code> is a <code>Usage</code> whose <code>types</code> are all <code>Classes</code>. Nominally, if a <code>type</code> is an <code>OccurrenceDefinition</code>, an <code>OccurrenceUsage</code> is a <code>Usage</code> of that <code>OccurrenceDefinition</code> within a system. However, other types of Kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p>
 * 
 * individualDefinition =
 *     let individualDefinitions : OrderedSet(OccurrenceDefinition) = 
 *         occurrenceDefinition->
 *             selectByKind(OccurrenceDefinition)->
 *             select(isIndividual) in
 *     if individualDefinitions->isEmpty() then null
 *     else individualDefinitions->first() endif
 * isIndividual implies individualDefinition <> null
 * specializesFromLibrary('Occurrences::occurrences')
 * isComposite and
 * owningType <> null and
 * (owningType.oclIsKindOf(Class) or
 *  owningType.oclIsKindOf(OccurrenceUsage) or
 *  owningType.oclIsKindOf(Feature) and
 *     owningType.oclAsType(Feature).type->
 *         exists(oclIsKind(Class))) implies
 *     specializesFromLibrary('Occurrences::Occurrence::suboccurrences')
 * occurrenceDefinition->
 *     selectByKind(OccurrenceDefinition)->
 *     select(isIndividual).size() <= 1
 * portionKind = PortionKind::snapshot implies
 *     specializesFromLibrary('Occurrences::Occurrence::snapshots')
 * portionKind = PortionKind::timeslice implies 
 *     specializesFromLibrary('Occurrences::Occurrence::timeSlices')
 * portionKind <> null implies
 *     owningType <> null and
 *     (owningType.oclIsKindOf(OccurrenceDefinition) or
 *      owningType.oclIsKindOf(OccurrenceUsage))
 * portionKind <> null implies isPortion
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.OccurrenceUsage#isIsIndividual <em>Is Individual</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.OccurrenceUsage#getPortionKind <em>Portion Kind</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.OccurrenceUsage#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.OccurrenceUsage#getOccurrenceDefinition <em>Occurrence Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.model.sysml.SysMLPackage#getOccurrenceUsage()
 * @model
 * @generated
 */
public interface OccurrenceUsage extends Usage {
	/**
	 * Returns the value of the '<em><b>Is Individual</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>OccurrenceUsage</code> represents the usage of the specific individual represented by its <code>individualDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Individual</em>' attribute.
	 * @see #setIsIndividual(boolean)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOccurrenceUsage_IsIndividual()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsIndividual();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.OccurrenceUsage#isIsIndividual <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Individual</em>' attribute.
	 * @see #isIsIndividual()
	 * @generated
	 */
	void setIsIndividual(boolean value);

	/**
	 * Returns the value of the '<em><b>Portion Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.model.sysml.PortionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The kind of temporal portion (time slice or snapshot) is represented by this <code>OccurrenceUsage</code>. If <code>portionKind</code> is not null, then the <code>owningType</code> of the <code>OccurrenceUsage</code> must be non-null, and the <code>OccurrenceUsage</code> represents portions of the featuring instance of the <code>owningType</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Portion Kind</em>' attribute.
	 * @see org.omg.sysml.model.sysml.PortionKind
	 * @see #setPortionKind(PortionKind)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOccurrenceUsage_PortionKind()
	 * @model ordered="false"
	 * @generated
	 */
	PortionKind getPortionKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.OccurrenceUsage#getPortionKind <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portion Kind</em>' attribute.
	 * @see org.omg.sysml.model.sysml.PortionKind
	 * @see #getPortionKind()
	 * @generated
	 */
	void setPortionKind(PortionKind value);

	/**
	 * Returns the value of the '<em><b>Individual Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The at most one <code>occurrenceDefinition</code> that has <code>isIndividual = true</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual Definition</em>' reference.
	 * @see #setIndividualDefinition(OccurrenceDefinition)
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOccurrenceUsage_IndividualDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='individualUsage'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	OccurrenceDefinition getIndividualDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.model.sysml.OccurrenceUsage#getIndividualDefinition <em>Individual Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Definition</em>' reference.
	 * @see #getIndividualDefinition()
	 * @generated
	 */
	void setIndividualDefinition(OccurrenceDefinition value);

	/**
	 * Returns the value of the '<em><b>Occurrence Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.model.sysml.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Classes</code> that are the types of this <code>OccurrenceUsage</code>. Nominally, these are <code>OccurrenceDefinitions</code>, but other kinds of kernel <code>Classes</code> are also allowed, to permit use of <code>Classes</code> from the Kernel Model Libraries.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence Definition</em>' reference list.
	 * @see org.omg.sysml.model.sysml.SysMLPackage#getOccurrenceUsage_OccurrenceDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedOccurrence'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<org.omg.sysml.model.sysml.Class> getOccurrenceDefinition();

} // OccurrenceUsage
