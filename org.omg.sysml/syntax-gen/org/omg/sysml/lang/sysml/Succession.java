/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Succession</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Succession is a  temporal Connector that asserts an ordering of occurrences with respect to time. A Succession must directly or indirectly specialize the Association HappensBefore from the Kernel model library.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Succession#getTransitionStep <em>Transition Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Succession#getTriggerStep <em>Trigger Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Succession#getEffectStep <em>Effect Step</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Succession#getGuardExpression <em>Guard Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession()
 * @model
 * @generated
 */
public interface Succession extends Connector {

	/**
	 * Returns the value of the '<em><b>Trigger Step</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Steps that map incoming events to the timing of occurrences of the transitionStep. The values of triggerStep subset the list of acceptable events to be received by a Behavior or the object that performs it.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Step</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession_TriggerStep()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='succession'"
	 * @generated
	 */
	EList<Step> getTriggerStep();

	/**
	 * Returns the value of the '<em><b>Effect Step</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Steps that represent occurrences that are side effects of the transitionStep occurring.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect Step</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession_EffectStep()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='succession'"
	 * @generated
	 */
	EList<Step> getEffectStep();

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Expression</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An Expression that must evaluate to true before the transitionStep can occur.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard Expression</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession_GuardExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='succession'"
	 * @generated
	 */
	EList<Expression> getGuardExpression();

	/**
	 * Returns the value of the '<em><b>Transition Step</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The transitionStep represents a TransitionPerformance, which means that the Succession is interpreted as an occurrence as well as a time ordering of other occurrences.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition Step</em>' reference.
	 * @see #setTransitionStep(Step)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccession_TransitionStep()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='succession'"
	 *        annotation="subsets"
	 * @generated
	 */
	Step getTransitionStep();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Succession#getTransitionStep <em>Transition Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Step</em>' reference.
	 * @see #getTransitionStep()
	 * @generated
	 */
	void setTransitionStep(Step value);
} // Succession
