/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FlowEnd</code> is a <code>Feature</code> that is one of the <code>connectorEnds</code> giving the <code><em>source</em></code> or <code><em>target</em></code> of a <code>Flow</code>. For <code>Flows</code> typed by <code><em>FlowTransfer</em></code> or its specializations, <code>FlowEnds</code> must have exactly one <code>ownedFeature</code>, which redefines <code><em>Transfer::source::sourceOutput</em></code> or <code><em>Transfer::target::targetInput</em></code> and redefines the corresponding feature of the <code>relatedElement</code> for its end.</p>
 * isEnd
 * ownedFeature->size() = 1
 * owningType <> null and owningType.oclIsKindOf(Flow)
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlowEnd()
 * @model
 * @generated
 */
public interface FlowEnd extends Feature {
} // FlowEnd
