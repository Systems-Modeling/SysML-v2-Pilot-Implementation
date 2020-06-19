/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ConnectionUsage is a Connector that is also a Usage. Nominally, if its type is a ConnectionDefinition, then a ConnectionUsage is a Usage of that ConnectionDefinition, representing a connection between parts of a system. However, other kinds of kernel Associations are also allowed, to permit use of Associations from the Kernel Library (such as the default BinaryLink).</p>
 * 
 * <p>A ConnectionUsage must subset the base ConnectionUsage <code>connections</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectionUsage()
 * @model
 * @generated
 */
public interface ConnectionUsage extends PartUsage, Connector {
} // ConnectorUsage
