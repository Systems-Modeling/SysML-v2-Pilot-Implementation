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
 * A representation of the model object '<em><b>Event Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>EventOccurrenceUsage</code> is an <code>OccurrenceUsage</code> that represents another <code>OccurrenceUsage</code> occurring as a <code><em>suboccurrence</em></code> of the containing occurrence of the <code>EventOccurrenceUsage</code>. Unless it is the <code>EventOccurrenceUsage</code> itself, the referenced <code>OccurrenceUsage</code> is related to the <code>EventOccurrenceUsage</code> by a <code>ReferenceSubsetting</code> <code>Relationship</code>.</p>
 * 
 * <p>If the <code>EventOccurrenceUsage</code> is owned by an <code>OccurrenceDefinition</code> or <code>OccurrenceUsage</code>, then it also subsets the <em><code>timeEnclosedOccurrences</code></em> property of the <code>Class</code> <em><code>Occurrence</code></em> from the Kernel Semantic Library model <em><code>Occurrences</code></em>.</p>
 * eventOccurrence =
 *     if referencedFeatureTarget() = null then self
 *     else if referencedFeatureTarget().oclIsKindOf(OccurrenceUsage) then
 *         referencedFeatureTarget().oclAsType(OccurrenceUsage)
 *     else null
 *     endif endif
 * referencedFeatureTarget() <> null implies
 *     referencedFeatureTarget().oclIsKindOf(OccurrenceUsage)
 * owningType <> null and
 * (owningType.oclIsKindOf(OccurrenceDefinition) or
 *  owningType.oclIsKindOf(OccurrenceUsage)) implies
 *     specializesFromLibrary('Occurrences::Occurrence::timeEnclosedOccurrences')
 * isReference
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.EventOccurrenceUsage#getEventOccurrence <em>Event Occurrence</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEventOccurrenceUsage()
 * @model
 * @generated
 */
public interface EventOccurrenceUsage extends OccurrenceUsage {
	/**
	 * Returns the value of the '<em><b>Event Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>OccurrenceUsage</code> referenced as an event by this <code>EventOccurrenceUsage</code>. It is the <code>referenceFeature</code> of the <code>ownedReferenceSubsetting</code> for the <code>EventOccurrenceUsage</code>, if there is one, and, otherwise, the <code>EventOccurrenceUsage</code> itself.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Occurrence</em>' reference.
	 * @see #setEventOccurrence(OccurrenceUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEventOccurrenceUsage_EventOccurrence()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referencingOccurrence'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	OccurrenceUsage getEventOccurrence();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.EventOccurrenceUsage#getEventOccurrence <em>Event Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Occurrence</em>' reference.
	 * @see #getEventOccurrence()
	 * @generated
	 */
	void setEventOccurrence(OccurrenceUsage value);

} // EventOccurrenceUsage
