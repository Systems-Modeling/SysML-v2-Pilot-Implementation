/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Activity is a Behavior that defines an action performed by a system or part of a system.</p>
 * 
 * <p>An Activity must subclass, directly or indirectly, the base Activity Action from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Activity#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Definition, Behavior {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getStep() <em>Step</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsages that are Steps in this Activity, which define the actions that specify the behavior of the Activity.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getActivity_Action()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringActivity'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ActionUsage> getAction();

} // Activity
