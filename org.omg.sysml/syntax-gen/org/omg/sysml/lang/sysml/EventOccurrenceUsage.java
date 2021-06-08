/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.EventOccurrenceUsage#getOccurringEvent <em>Occurring Event</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEventOccurrenceUsage()
 * @model
 * @generated
 */
public interface EventOccurrenceUsage extends OccurrenceUsage {
	/**
	 * Returns the value of the '<em><b>Occurring Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurring Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurring Event</em>' reference.
	 * @see #setOccurringEvent(OccurrenceUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEventOccurrenceUsage_OccurringEvent()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	OccurrenceUsage getOccurringEvent();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.EventOccurrenceUsage#getOccurringEvent <em>Occurring Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurring Event</em>' reference.
	 * @see #getOccurringEvent()
	 * @generated
	 */
	void setOccurringEvent(OccurrenceUsage value);

} // EventOccurrenceUsage
