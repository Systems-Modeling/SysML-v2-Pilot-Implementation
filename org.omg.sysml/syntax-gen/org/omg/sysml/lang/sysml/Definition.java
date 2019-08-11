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
 * A Definition is a Classifier of Usages. The actual kinds of Definitions that may appear in a model are given by the concrete subclass of Definition. The flow Properties of a Definition are the Properties it features that have a direction specified.
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
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Action}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Action#getActionOwningDefinition <em>Action Owning Definition</em>}'.
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
	 * @return the value of the '<em>Owned Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAction()
	 * @see org.omg.sysml.lang.sysml.Action#getActionOwningDefinition
	 * @model opposite="actionOwningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Action> getOwnedAction();

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
	 * @return the value of the '<em>Owned Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getOwningDefinition
	 * @model opposite="owningDefinition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getOwnedUsage();

} // Definition
