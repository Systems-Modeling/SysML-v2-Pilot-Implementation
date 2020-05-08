/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A TransferActionUsage is an ActionUsage that is also an <tt>incomingTransfer</tt> in a specific <tt>context</tt>. A TransferActionUsage must not be composite.
 * 
 * <p>A TransferActionUsage must subset, directly or indirectly, the ActionUsage <tt>transferActions</tt> from the Systems model library. This implies that the TransferActionUsage will be typed by TransferAction from the model library (or a subtype). The TransferActionUsage must bind the <tt>context</tt> Parameter of the TransferAction to the actual context for the usage.</p>
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TransferActionUsage#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransferActionUsage()
 * @model abstract="true"
 * @generated
 */
public interface TransferActionUsage extends ActionUsage {

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A Feature specifying the Occurrence of which the TransferActionUsage is an <tt>incomingTransfer</tt>. The <tt>context</tt> Feature is the target of a binding connector whose source is the redefinition of <tt>TransferAction::context</tt> by the TransferActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransferActionUsage_Context()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transferActionUsage'"
	 * @generated
	 */
	Feature getContext();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransferActionUsage#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Feature value);
} // TransferActionUsage
