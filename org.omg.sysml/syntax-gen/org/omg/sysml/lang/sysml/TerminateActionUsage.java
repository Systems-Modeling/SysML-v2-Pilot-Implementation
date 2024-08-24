/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TerminateActionUsage#getTerminatedOccurrenceArgument <em>Terminated Occurrence Argument</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTerminateActionUsage()
 * @model
 * @generated
 */
public interface TerminateActionUsage extends ActionUsage {
	/**
	 * Returns the value of the '<em><b>Terminated Occurrence Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminated Occurrence Argument</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminated Occurrence Argument</em>' reference.
	 * @see #setTerminatedOccurrenceArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTerminateActionUsage_TerminatedOccurrenceArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='terminateActionUsage'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getTerminatedOccurrenceArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TerminateActionUsage#getTerminatedOccurrenceArgument <em>Terminated Occurrence Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminated Occurrence Argument</em>' reference.
	 * @see #getTerminatedOccurrenceArgument()
	 * @generated
	 */
	void setTerminatedOccurrenceArgument(Expression value);

} // TerminateActionUsage
