/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Step</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Steps are Features for Behaviors and support the steady refinement of behavioral descriptions. Steps can be related in time and serve as sources and targets for object transfers.</p>
 * 
 * <p>Steps are Features for Behaviors and support the steady refinement of behavioral descriptions. Steps can be related in time and serve as sources and targets for object transfers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Step#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Step#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends Feature {

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Behavior}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>This is the Behavior that types the Step.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStep_Behavior()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedStep'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Behavior> getBehavior();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getStep_Parameter()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parameteredStep'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getParameter();

} // Step
