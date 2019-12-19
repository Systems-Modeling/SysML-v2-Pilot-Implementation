/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Usage is a usage of a Definition. A Usage may only be an owned Feature of a Definition or another Usage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedProperty <em>Nested Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage()
 * @model abstract="true"
 * @generated
 */
public interface Usage extends Feature {
	/**
	 * Returns the value of the '<em><b>Nested Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getOwningUsage
	 * @model opposite="owningUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getNestedUsage();

	/**
	 * Returns the value of the '<em><b>Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage <em>Nested Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Usage</em>' reference.
	 * @see #setOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_OwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedUsage
	 * @model opposite="nestedUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Usage getOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage <em>Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Usage</em>' reference.
	 * @see #getOwningUsage()
	 * @generated
	 */
	void setOwningUsage(Usage value);

	/**
	 * Returns the value of the '<em><b>Owning Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage <em>Owned Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Definition</em>' reference.
	 * @see #setOwningDefinition(Definition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_OwningDefinition()
	 * @see org.omg.sysml.lang.sysml.Definition#getOwnedUsage
	 * @model opposite="ownedUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Definition getOwningDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Definition</em>' reference.
	 * @see #getOwningDefinition()
	 * @generated
	 */
	void setOwningDefinition(Definition value);

	/**
	 * Returns the value of the '<em><b>Nested Port</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PortUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage <em>Port Owning Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Port</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedPort()
	 * @see org.omg.sysml.lang.sysml.PortUsage#getPortOwningUsage
	 * @model opposite="portOwningUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PortUsage> getNestedPort();

	/**
	 * Returns the value of the '<em><b>Nested Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Property}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Property#getPropertyOwningUsage <em>Property Owning Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Property</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedProperty()
	 * @see org.omg.sysml.lang.sysml.Property#getPropertyOwningUsage
	 * @model opposite="propertyOwningUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Property> getNestedProperty();

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
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_Property()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='usageWithProperty'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Nested Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ActionUsage#getActionOwningUsage <em>Action Owning Usage</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getNestedUsage() <em>Nested Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getUsage_NestedAction()
	 * @see org.omg.sysml.lang.sysml.ActionUsage#getActionOwningUsage
	 * @model opposite="actionOwningUsage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ActionUsage> getNestedAction();

} // Usage
