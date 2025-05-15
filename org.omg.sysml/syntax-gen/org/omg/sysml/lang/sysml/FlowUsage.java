/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Connection Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>FlowUsage</code> is an <code>ActionUsage</code> that is also a <code>ConnectorAsUsage</code> and a KerML <code>Flow</code>.</p>
 * specializesFromLibrary('Flows::messages')
 * ownedEndFeatures->notEmpty() implies
 *     specializesFromLibrary('Flows::flows')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FlowUsage#getFlowDefinition <em>Flow Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlowUsage()
 * @model
 * @generated
 */
public interface FlowUsage extends ConnectorAsUsage, ActionUsage, Flow {

	/**
	 * Returns the value of the '<em><b>Flow Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Interaction}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionUsage#getActionDefinition() <em>Action Definition</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Flow#getInteraction() <em>Interaction</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Interactions</code> that are the <code>types</code> of this <code>FlowUsage</code>. Nominally, these are <code>FlowDefinitions</code>, but other kinds of Kernel <code>Interactions</code> are also allowed, to permit use of Interactions from the Kernel Model Libraries.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlowUsage_FlowDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedFlow'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Interaction> getFlowDefinition();
} // FlowConnectionUsage
