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
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTriggerAction <em>Trigger Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getEffectAction <em>Effect Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getSuccession <em>Succession</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTransitionOwningUsage <em>Transition Owning Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage()
 * @model
 * @generated
 */
public interface TransitionUsage extends Usage, Step {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source ActionUsage of this TransitionUsage, derived as the source of the succession for the TransitionUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Step)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Source()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Step getSource();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Step value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target ActionUsage of this TransitionUsage, derived as the target of the succession for the TransitionUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Step)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Target()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Step getTarget();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Step value);

	/**
	 * Returns the value of the '<em><b>Trigger Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AcceptActionUsage that defines the trigger of this TransitionUsage, derived as the member feature with a TransitionFeatureMembership of kind "trigger" with the TransitionUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Action</em>' reference.
	 * @see #setTriggerAction(AcceptActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_TriggerAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	AcceptActionUsage getTriggerAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getTriggerAction <em>Trigger Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Action</em>' reference.
	 * @see #getTriggerAction()
	 * @generated
	 */
	void setTriggerAction(AcceptActionUsage value);

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Expression that defines the guard of this TransitionUsage, derived as the member feature with a TransitionFeatureMembership of kind "guard" with the TransitionUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard Expression</em>' reference.
	 * @see #setGuardExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_GuardExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Expression getGuardExpression();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getGuardExpression <em>Guard Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Expression</em>' reference.
	 * @see #getGuardExpression()
	 * @generated
	 */
	void setGuardExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Effect Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActionUsage that defines the effect of this TransitionUsage, derived as the member feature with a TransitionFeatureMembership of kind "effect" with the TransitionUsage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect Action</em>' reference.
	 * @see #setEffectAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_EffectAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ActionUsage getEffectAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getEffectAction <em>Effect Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Action</em>' reference.
	 * @see #getEffectAction()
	 * @generated
	 */
	void setEffectAction(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Succession</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Succession that is the ownedFeature of this TransitionUsage that redefines TransitionPerformance::transitionLink.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Succession</em>' reference.
	 * @see #setSuccession(Succession)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Succession()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Succession getSuccession();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getSuccession <em>Succession</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succession</em>' reference.
	 * @see #getSuccession()
	 * @generated
	 */
	void setSuccession(Succession value);

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
