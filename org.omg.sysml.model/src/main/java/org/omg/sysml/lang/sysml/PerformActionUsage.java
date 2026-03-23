/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>PerformActionUsage</code> is an <code>ActionUsage</code> that represents the performance of an <code>ActionUsage</code>. Unless it is the <code>PerformActionUsage</code> itself, the <code>ActionUsage</code> to be performed is related to the <code>PerformActionUsage</code> by a <code>ReferenceSubsetting</code> relationship. A <code>PerformActionUsage</code> is also an <code>EventOccurrenceUsage</code>, with its <code>performedAction</code> as the <code>eventOccurrence</code>.</p>
 * referencedFeatureTarget() <> null implies
 *     referencedFeatureTarget().oclIsKindOf(ActionUsage)
 * owningType <> null and
 * (owningType.oclIsKindOf(PartDefinition) or
 *  owningType.oclIsKindOf(PartUsage)) implies
 *     specializesFromLibrary('Parts::Part::performedActions')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PerformActionUsage#getPerformedAction <em>Performed Action</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPerformActionUsage()
 * @model
 * @generated
 */
public interface PerformActionUsage extends ActionUsage, EventOccurrenceUsage {
	/**
	 * Returns the value of the '<em><b>Performed Action</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.EventOccurrenceUsage#getEventOccurrence() <em>Event Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsage</code> to be performed by this <code>PerformedActionUsage</code>. It is the <code>eventOccurrence</code> of the <code>PerformActionUsage</code> considered as an <code>EventOccurrenceUsage</code>, which must be an <code>ActionUsage</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Action</em>' reference.
	 * @see #setPerformedAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPerformActionUsage_PerformedAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='performingAction'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ActionUsage getPerformedAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PerformActionUsage#getPerformedAction <em>Performed Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Action</em>' reference.
	 * @see #getPerformedAction()
	 * @generated
	 */
	void setPerformedAction(ActionUsage value);

} // PerformActionUsage
