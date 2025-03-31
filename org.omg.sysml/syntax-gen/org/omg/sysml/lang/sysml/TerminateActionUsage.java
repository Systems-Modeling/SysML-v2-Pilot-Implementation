/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>TerminateActionUsage</code> is an <code>ActionUsage</code> that directly or indirectly specializes the <code>ActionDefinition</code> <em><code>TerminateAction</code></em> from the Systems Model Library, which causes a given <em><code>terminatedOccurrence</code></em> to end during its performance. By default, the <code>terminatedOccurrence</code> is the featuring instance (<em><code>that</code></em>) of the performance of the <code>TerminateActionUsage</code>, generally the performance of its immediately containing <code>ActionDefinition</code> or <code>ActionUsage</code>.</p>
 * specializesFromLibrary('Actions::terminateActions')
 * terminatedOccurrenceArgument = argument(1)
 * isSubactionUsage() implies
 *     specializesFromLibrary('Actions::Action::terminateSubactions')
 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expression</code> that is the <code>featureValue</code> of the <em><code>terminateOccurrence</code></em> <code>parameter</code> of this <code>TerminateActionUsage</code>.
	 * <!-- end-model-doc -->
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
