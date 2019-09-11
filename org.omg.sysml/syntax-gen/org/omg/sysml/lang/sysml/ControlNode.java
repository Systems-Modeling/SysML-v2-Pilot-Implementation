/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ControlNode is an ActionUsage that does not have any inherent behavior but provides constraints on incoming and outgoing Succession connectors that are used to control other Actions.
 * 
 * A ControlNode must be a composite owned feature of an Activity or ActionUsage, subsetting, directly or indirectly, the ActionUsage Action::controls. This implies that the ControlNode must be typed by ControlAction from the Systems model library, or a subtype of it.
 * 
 * All outgoing Successions from a ControlNode must have source multiplicity of 1..1. All incoming Succession must have target multiplicity of 1..1.
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getControlNode()
 * @model abstract="true"
 * @generated
 */
public interface ControlNode extends ActionUsage {
} // ControlNode
