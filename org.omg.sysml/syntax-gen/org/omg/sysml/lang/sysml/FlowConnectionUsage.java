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
 * <p>A FlowConnectionUsage is a ConnectionUsage that is also an ItemFlow.</p>
 * 
 * <p>A FlowConnectionUsage must subset the base FlowConnectionUsage <em><code>flowConnections</code></em> from the Systems model library.</p>
 * if itemFlowEnds->isEmpty() then
 *     specializesFromLibrary("Connections::messageConnections")
 * else
 *     specializesFromLibrary("Connections::flowConnections"
 * endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FlowConnectionUsage#getFlowConnectionDefinition <em>Flow Connection Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlowConnectionUsage()
 * @model
 * @generated
 */
public interface FlowConnectionUsage extends ConnectionUsage, ActionUsage, ItemFlow {

	/**
	 * Returns the value of the '<em><b>Flow Connection Definition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Interaction}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ActionUsage#getActionDefinition() <em>Action Definition</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ItemFlow#getInteraction() <em>Interaction</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.ConnectionUsage#getConnectionDefinition() <em>Connection Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Interactions that are the types of this FlowConnectionUsage. Nominally, these are FlowConnectionDefinitions, but other kinds of Kernel Interactions are also allowed, to permit use of Interactions from the Kernel Library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow Connection Definition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFlowConnectionUsage_FlowConnectionDefinition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedFlowConnection'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Interaction> getFlowConnectionDefinition();
} // FlowConnectionUsage
