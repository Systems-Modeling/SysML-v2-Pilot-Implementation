/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A EventOccurrenceUsage is an OccurrenceUsage that represents another OccurrenceUsage occurring as a suboccurrence of the containing occurrence of the EventOccurrenceUsage. The referenced OccurrenceUsage performed (which may be the EventOccurrenceUsage itself) is related to the EventOccurrenceUsage by a Subsetting relationship.</p>
 * 
 * <p>If the EventOccurrenceUsage is owned by an Occurrence, then it also subsets the suboccurrence property of that Occurrence (as defined in the library model for Part).</p>
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
	 * <p>The OccurrenceUsage referenced as an event by this EventOccurrenceUsage. It is the <code>subsettedFeature</code> of the first owned Subsetting Relationship of the EventOccurrenceUsage.</p>
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
