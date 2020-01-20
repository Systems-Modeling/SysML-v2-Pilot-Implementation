/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TransitionUsage is a Usage that is also a Step that is typed by the Activity Transition from the Systems model library, or a subclass of it. As such, it is a behavioral Step that represents a transition between ActionUsages or StateUsages.
 * 
 * A TransitionUsage must subset, directly or indirectly, the base TransitionUsage "transitions", if it is not a composite feature, or the TransitionUsage "subtransitions" inherited from its owner, if it is a composite feature.
 * 
 * A TransitionUsage may have up to three features using TransitionFeatureMembership, all of different kinds, corresponding to the trigger, guard and effect of the transition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTransitionOwningUsage <em>Transition Owning Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage()
 * @model
 * @generated
 */
public interface TransitionUsage extends Usage, Step {

	/**
	 * Returns the value of the '<em><b>Transition Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedTransition <em>Nested Transition</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage() <em>Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Owning Usage</em>' reference.
	 * @see #setTransitionOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_TransitionOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedTransition
	 * @model opposite="nestedTransition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getTransitionOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getTransitionOwningUsage <em>Transition Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Owning Usage</em>' reference.
	 * @see #getTransitionOwningUsage()
	 * @generated
	 */
	void setTransitionOwningUsage(Usage value);
} // TransitionStep
