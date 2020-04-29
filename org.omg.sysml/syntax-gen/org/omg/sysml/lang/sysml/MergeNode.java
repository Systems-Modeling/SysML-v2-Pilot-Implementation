/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A MergeNode is a ControlNode that asserts the merging of its incoming Successions. All incoming Successions must have a source multiplicity of 0..1 and subset the Feature <tt>MergeAction::incomingHBLink</tt>. A MergeNode may have at most one outgoing Succession.</p>
 * 
 * <p>A MergeNode must subset, directly or indirectly, the ActionUsage <tt>Action::merges</tt>, implying that it is typed by MergeAction from the Systems model library (or a subtype of it).</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMergeNode()
 * @model
 * @generated
 */
public interface MergeNode extends ControlNode {
} // MergeNode
