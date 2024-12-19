/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Connection Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FlowConnectionDefinition</code> is an <code>ActionDefinition</code> that is also an <code>Interaction</code> (which is both a KerML <code>Behavior</code> and <code>Association</code>), representing flows between <code>Usages</code>.</p>
 * specializesFromLibrary('FlowConnections::MessageConnection')
 * flowConnectionEnd->size() = 2 implies
 *     specializesFromLibrary('FlowConnections::MessageTransferConnection')
 * flowConnectionEnd->size() <= 2
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FlowConnectionDefinition#getFlowConnectionEnd <em>Flow Connection End</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlowConnectionDefinition()
 * @model
 * @generated
 */
public interface FlowConnectionDefinition extends ActionDefinition, Interaction {

	/**
	 * Returns the value of the '<em><b>Flow Connection End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Association#getAssociationEnd() <em>Association End</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Usages</code> that define the things related by the <code>FlowConnectionDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow Connection End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlowConnectionDefinition_FlowConnectionEnd()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowConnectionDefinitionWithEnd'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Usage> getFlowConnectionEnd();
} // FlowConnectionDefinition
