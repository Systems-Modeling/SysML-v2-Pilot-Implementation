/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ForkNode is a ControlNode that must be followed by successor Actions as given by all its outgoing Successions. All outgoing Successions must have a source multiplicity of 1..1. A ForkNode may have at most one incoming Succession.
 * 
 * A ForkNode must subset, directly or indirectly, the ActionUsage Action::forks, implying that it is typed by ForkAction from the Systems model library (or a subtype of it).
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getForkNode()
 * @model
 * @generated
 */
public interface ForkNode extends ControlNode {
} // ForkNode
