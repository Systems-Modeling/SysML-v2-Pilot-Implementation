/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Invocation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A TriggerInvocationExpression is an InvocationExpression that invokes one of the trigger Functions from the Kernel <em>Triggers<em> package, as indicated by its <code>kind</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TriggerInvocationExpression#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTriggerInvocationExpression()
 * @model
 * @generated
 */
public interface TriggerInvocationExpression extends InvocationExpression {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates which of the Functions from the Kernel <em>Triggers</em> package is to be invoked by this TriggerInvocationExpression.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.TriggerKind
	 * @see #setKind(TriggerKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTriggerInvocationExpression_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TriggerKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TriggerInvocationExpression#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.TriggerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TriggerKind value);

} // TriggerInvocationExpression
