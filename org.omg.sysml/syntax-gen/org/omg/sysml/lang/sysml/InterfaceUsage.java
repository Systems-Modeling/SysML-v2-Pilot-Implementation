/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An InterfaceUsage is a Usage of an InterfaceDefinition to represent an interface connecting parts of a system through specific ports.</p>
 * 
 * <p>An InterfaceUsage must subset, directly or indirectly, the base InterfaceUsage <tt>interfaces<tt> from the Systems model libary.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.InterfaceUsage#getInterfaceDefinition <em>Interface Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInterfaceUsage()
 * @model
 * @generated
 */
public interface InterfaceUsage extends ConnectionUsage {
	/**
	 * Returns the value of the '<em><b>Interface Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Connector#getAssociation() <em>Association</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The InterfaceDefinition that is the single type of this InterfaceUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Definition</em>' reference.
	 * @see #setInterfaceDefinition(InterfaceDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInterfaceUsage_InterfaceDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interfaceUsage'"
	 *        annotation="redefines"
	 * @generated
	 */
	InterfaceDefinition getInterfaceDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.InterfaceUsage#getInterfaceDefinition <em>Interface Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Definition</em>' reference.
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	void setInterfaceDefinition(InterfaceDefinition value);

} // Connection
