/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>JoinNode</code> is a <code>ControlNode</code> that waits for the completion of all the predecessor <code>Actions</code> given by incoming <code>Successions</code>.</p>
 * sourceConnector->selectByKind(Succession)->size() <= 1
 * specializesFromLibrary('Actions::Action::join')
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends ControlNode {
} // JoinNode
