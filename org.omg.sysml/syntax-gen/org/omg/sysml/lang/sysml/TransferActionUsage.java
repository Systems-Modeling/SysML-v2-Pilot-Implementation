/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TransferActionUsage is an ActionUsage that is also an incomingTransfer in a specific context. A TransferActionUsage must not be composite.
 * 
 * A TransferActionUsage must subset, directly or indirectly, the ActionUsage "transferActions" from the Systems model library. This implies that the TransferActionUsage will be typed by the TransferAction from the model library (or a subtype). The TransferActionUsage must bind the "context" parameter of the TransferAction to the actual context for the usage.
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
	 * The context of a TransferActionUsage a Feature specifying the Occurrence of which the TransferActionUsage is an incomingTransfer. It is the target of the binding connector whose source is the redefinition of TransferAction::context by the TransferActionUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransferActionUsage_Context()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
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
