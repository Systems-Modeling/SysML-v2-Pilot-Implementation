/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perform Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PerformActionUsage is an ActionUsage that represents the performance of another ActionUsage. The ActionUsage to be performed is related to the PerformActionUsage by a Subsetting relationship. 
 * 
 * If the PerformActionUsage is owned by a Part, then it also subsets the performedAction property of that Part (as defined in the library model for Part),
 * otherwise it subsets either "actions" or "subactions", as required for a regular ActionUsage.
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
public interface PerformActionUsage extends ActionUsage {

	/**
	 * Returns the value of the '<em><b>Performed Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The performedAction of a PerformedActionUsage specifies the Action to be performed by the PerformedActionUsage. It is the subsetted element of the first owned Subsetting relationship of the PerformedActionUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Action</em>' reference.
	 * @see #setPerformedAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPerformActionUsage_PerformedAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
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
