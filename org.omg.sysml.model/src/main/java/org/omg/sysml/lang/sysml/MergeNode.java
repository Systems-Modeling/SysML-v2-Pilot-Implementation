/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>MergeNode</code> is a <code>ControlNode</code> that asserts the merging of its incoming <code>Successions</code>. A <code>MergeNode</code> may have at most one outgoing <code>Successions</code>.</p>
 * sourceConnector->selectAsKind(Succession)->size() <= 1
 * targetConnector->selectByKind(Succession)->
 *     collect(connectorEnd->at(1))->
 *     forAll(sourceMult |
 *         multiplicityHasBounds(sourceMult, 0, 1))
 * targetConnector->selectByKind(Succession)->
 *     forAll(subsetsChain(self, 
 *         resolveGlobal('ControlPerformances::MergePerformance::incomingHBLink')))
 * specializesFromLibrary('Actions::Action::merges')
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMergeNode()
 * @model
 * @generated
 */
public interface MergeNode extends ControlNode {
} // MergeNode
