/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ForkNode</code> is a <code>ControlNode</code> that must be followed by successor <code>Actions</code> as given by all its outgoing <code>Successions</code>.</p>
 * targetConnector->selectByKind(Succession)->size() <= 1
 * specializesFromLibrary('Actions::Action::forks')
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getForkNode()
 * @model
 * @generated
 */
public interface ForkNode extends ControlNode {
} // ForkNode
