/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A JoinNode is a ControlNode that waits for the completion of all the predecessor Actions given by incoming Successions. All incoming Successions must have a source multiplicity of 1..1. A JoinNode may have at most one outgoing Succession.</p>
 * 
 * <p>A JoinNode must subset, directly or indirectly, the ActionUsage <code>Action::joins</code>, implying that it is typed by JoinAction from the Systems model library (or a subtype of it).</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends ControlNode {
} // JoinNode
