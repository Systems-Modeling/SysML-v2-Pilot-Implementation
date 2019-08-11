/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Connection#getConnectionInterface <em>Connection Interface</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends Connector, InterfaceUsage {
	/**
	 * Returns the value of the '<em><b>Connection Interface</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getAssociation() <em>Association</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.InterfaceUsage#getInterfaceDefinition() <em>Interface Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Interface</em>' reference.
	 * @see #setConnectionInterface(Association)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnection_ConnectionInterface()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interfaceConnection'"
	 *        annotation="redefines"
	 * @generated
	 */
	Association getConnectionInterface();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connection#getConnectionInterface <em>Connection Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Interface</em>' reference.
	 * @see #getConnectionInterface()
	 * @generated
	 */
	void setConnectionInterface(Association value);

} // Connection
