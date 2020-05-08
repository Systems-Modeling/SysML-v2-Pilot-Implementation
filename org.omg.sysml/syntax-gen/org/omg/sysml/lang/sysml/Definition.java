/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Definition is a Classifier of Usages. The actual kinds of Definitions that may appear in a model are given by the concrete subclasses of Definition. </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getFlowProperty <em>Flow Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage <em>Owned Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition()
 * @model abstract="true"
 * @generated
 */
public interface Definition extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PortUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningDefinition <em>Port Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Ports that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedPort()
	 * @see org.omg.sysml.lang.sysml.PortUsage#getPortOwningDefinition
	 * @model opposite="portOwningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PortUsage> getOwnedPort();

	/**
	 * Returns the value of the '<em><b>Flow Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Property}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getProperty() <em>Property</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>properties</tt> of this Definition that have a non-null <tt>direction</tt>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow Property</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_FlowProperty()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definitionWithFlow'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Property> getFlowProperty();

	/**
	 * Returns the value of the '<em><b>Owned Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Property}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Property#getPropertyOwningDefinition <em>Property Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Properties that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedProperty()
	 * @see org.omg.sysml.lang.sysml.Property#getPropertyOwningDefinition
	 * @model opposite="propertyOwningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Property> getOwnedProperty();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Property}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Properties that are <tt>features</tt> of this Definition (not necessarily owned).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_Property()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definitionWithProperty'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Owned Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ActionUsage#getActionOwningDefinition <em>Action Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsages that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAction()
	 * @see org.omg.sysml.lang.sysml.ActionUsage#getActionOwningDefinition
	 * @model opposite="actionOwningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ActionUsage> getOwnedAction();

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.StateUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.StateUsage#getStateOwningDefinition <em>State Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The StateUsages that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned State</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedState()
	 * @see org.omg.sysml.lang.sysml.StateUsage#getStateOwningDefinition
	 * @model opposite="stateOwningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<StateUsage> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintOwningDefinition <em>Constraint Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConstraintUsages that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedConstraint()
	 * @see org.omg.sysml.lang.sysml.ConstraintUsage#getConstraintOwningDefinition
	 * @model opposite="constraintOwningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConstraintUsage> getOwnedConstraint();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.TransitionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The TransitionUsages that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Transition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<TransitionUsage> getOwnedTransition();

	/**
	 * Returns the value of the '<em><b>Owned Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RequirementUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementOwningDefinition <em>Requirement Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConstraint() <em>Owned Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RequirementUsages that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Requirement</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedRequirement()
	 * @see org.omg.sysml.lang.sysml.RequirementUsage#getRequirementOwningDefinition
	 * @model opposite="requirementOwningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<RequirementUsage> getOwnedRequirement();

	/**
	 * Returns the value of the '<em><b>Owned Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usages that are <tt>ownedFeatures</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getOwningDefinition
	 * @model opposite="owningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getOwnedUsage();

} // Definition
