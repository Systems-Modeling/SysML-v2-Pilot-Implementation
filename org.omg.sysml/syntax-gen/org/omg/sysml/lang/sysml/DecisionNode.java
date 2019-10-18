/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DecisionNode is a ControlNode that makes a selection from its outgoing Successions. All outgoing Successions must be ConditionalSuccession with a target multiplicity of 0..1. A DecisionNode may have at most one incoming Succession.
 * 
 * A DecisionNode must subset, directly or indirectly, the ActionUsage Action::decisions, implying that it is typed by DecisionAction from the Systems model library (or a subtype of it). A DecisionAction is constrained to have exactly one successor, which is chosen from among the outgoing ConditionalSuccessions for which the guard is true.
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDecisionNode()
 * @model
 * @generated
 */
public interface DecisionNode extends ControlNode {
} // DecisionNode
