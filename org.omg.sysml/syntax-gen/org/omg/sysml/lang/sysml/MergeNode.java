/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MergeNode is a ControlNode that asserts the merging of its incoming Successions. All incoming Successions must have a source multiplicity of 0..1. A MergeNode may have at most one outgoing Succession.
 * 
 * A MergeNode must subset, directly or indirectly, the ActionUsage Action::merges, implying that it is typed by MergeAction from the Systems model library (or a subtype of it). A MergeAction is constrained to have exactly one predecessor Action, which must be chosen from among the Succession connectors incoming to a MergeNode.
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMergeNode()
 * @model
 * @generated
 */
public interface MergeNode extends ControlNode {
} // MergeNode
