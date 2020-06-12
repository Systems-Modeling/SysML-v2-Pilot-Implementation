/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A SendActionUsage is an ActionUsage that is a Transfer of items sent to a specific target. The <code>context</code> Feature of a SendUsageAction is the <code>result</code> of the <code>target</code> Expression for the SendUsageAction.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SendActionUsage#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSendActionUsage()
 * @model
 * @generated
 */
public interface SendActionUsage extends TransferActionUsage {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target Expression of a SendActionUsage specifies the target Occurrence to which the SendActionUsage transfers items. The result Parameter of the Expression is the context of the SendActionUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSendActionUsage_Target()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='sendActionUsage'"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SendActionUsage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);
} // SendActionUsage
