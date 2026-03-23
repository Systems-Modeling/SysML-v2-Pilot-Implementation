/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>InterfaceUsage</code> is a Usage of an <code>InterfaceDefinition</code> to represent an interface connecting parts of a system through specific ports.</p>
 * ownedEndFeature->size() = 2 implies
 *     specializesFromLibrary('Interfaces::binaryInterfaces')
 * specializesFromLibrary('Interfaces::interfaces')
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
	 * Returns the value of the '<em><b>Interface Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.InterfaceDefinition}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ConnectionUsage#getConnectionDefinition() <em>Connection Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>InterfaceDefinitions</code> that type this <code>InterfaceUsage</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInterfaceUsage_InterfaceDefinition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedInterface'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<InterfaceDefinition> getInterfaceDefinition();

} // InterfaceUsage
