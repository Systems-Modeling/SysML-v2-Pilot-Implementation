/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>DecisionNode</code> is a <code>ControlNode</code> that makes a selection from its outgoing <code>Successions</code>.</p>
 * targetConnector->selectByKind(Succession)->size() <= 1
 * sourceConnector->selectAsKind(Succession)->
 *     collect(connectorEnd->at(2))->
 *     forAll(targetMult |
 *         multiplicityHasBounds(targetMult, 0, 1))
 * specializesFromLibrary('Actions::Action::decisions')
 * sourceConnector->selectByKind(Succession)->
 *     forAll(subsetsChain(self, 
 *         resolveGlobal('ControlPerformances::MergePerformance::outgoingHBLink')))
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {
} // DecisionNode
