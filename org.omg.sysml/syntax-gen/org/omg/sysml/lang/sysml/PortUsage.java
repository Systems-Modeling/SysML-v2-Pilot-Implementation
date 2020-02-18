/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PortUsage is a usage of a PortDefinition. A PortUsage must be owned by a Block, a PortDefinition, a PartProperty or another PortUsage.  Any owned Properties of a PortUsage must not be composite (and, therefore, cannot be PartProperties).
 * 
 * A PortUsage must subset, directly or indirectly, the PortUsage Part::ports inherited by its owner.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PortUsage#getPortDefinition <em>Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningDefinition <em>Port Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage <em>Port Owning Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortUsage()
 * @model
 * @generated
 */
public interface PortUsage extends Usage {
	/**
	 * Returns the value of the '<em><b>Port Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Definition</em>' reference.
	 * @see #setPortDefinition(PortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortUsage_PortDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedPort'"
	 *        annotation="redefines"
	 * @generated
	 */
	PortDefinition getPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PortUsage#getPortDefinition <em>Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Definition</em>' reference.
	 * @see #getPortDefinition()
	 * @generated
	 */
	void setPortDefinition(PortDefinition value);

	/**
	 * Returns the value of the '<em><b>Port Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedPort <em>Nested Port</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage() <em>Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Owning Usage</em>' reference.
	 * @see #setPortOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortUsage_PortOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedPort
	 * @model opposite="nestedPort" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getPortOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage <em>Port Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Owning Usage</em>' reference.
	 * @see #getPortOwningUsage()
	 * @generated
	 */
	void setPortOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>Port Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedPort <em>Owned Port</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition() <em>Owning Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Owning Definition</em>' reference.
	 * @see #setPortOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortUsage_PortOwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedPort
	 * @model opposite="ownedPort" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Definition getPortOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningDefinition <em>Port Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Owning Definition</em>' reference.
	 * @see #getPortOwningDefinition()
	 * @generated
	 */
	void setPortOwningDefinition(Definition value);

} // PortUsage
