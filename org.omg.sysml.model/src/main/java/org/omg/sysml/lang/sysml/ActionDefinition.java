/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>ActionDefinition</code> is a <code>Definition</code> that is also a <code>Behavior</code> that defines an <em><code>Action</code></em> performed by a system or part of a system.</p>
 * specializesFromLibrary('Actions::Action')
 * action = usage->selectByKind(ActionUsage)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ActionDefinition#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActionDefinition()
 * @model
 * @generated
 */
public interface ActionDefinition extends OccurrenceDefinition, Behavior {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getStep() <em>Step</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ActionUsages</code> that are <code>steps</code> in this <code>ActionDefinition</code>, which define the actions that specify the behavior of the <code>ActionDefinition</code>.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActionDefinition_Action()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringActionDefinition'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<ActionUsage> getAction();

} // ActionDefinition
