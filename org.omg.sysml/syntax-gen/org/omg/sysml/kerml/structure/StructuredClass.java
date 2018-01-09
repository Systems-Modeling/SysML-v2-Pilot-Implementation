/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getRequiredProperty <em>Required Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getProvidedProperty <em>Provided Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#isIsEncapsulated <em>Is Encapsulated</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getOwnedStructuredFeature <em>Owned Structured Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getTypesProperty <em>Types Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getBlindProperty <em>Blind Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getPortProperty <em>Port Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getProxyPort <em>Proxy Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getSelfPort <em>Self Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getFullPort <em>Full Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredClass#getInteractionParticipant <em>Interaction Participant</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass()
 * @model
 * @generated
 */
public interface StructuredClass extends org.omg.sysml.kerml.structure.Class {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_Output()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getOutput();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_Input()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getInput();

	/**
	 * Returns the value of the '<em><b>Required Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Property</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_RequiredProperty()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getRequiredProperty();

	/**
	 * Returns the value of the '<em><b>Provided Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Property</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_ProvidedProperty()
	 * @model containment="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getProvidedProperty();

	/**
	 * Returns the value of the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Encapsulated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Encapsulated</em>' attribute.
	 * @see #setIsEncapsulated(boolean)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_IsEncapsulated()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsEncapsulated();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredClass#isIsEncapsulated <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Encapsulated</em>' attribute.
	 * @see #isIsEncapsulated()
	 * @generated
	 */
	void setIsEncapsulated(boolean value);

	/**
	 * Returns the value of the '<em><b>Conjugate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conjugate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjugate</em>' reference.
	 * @see #setConjugate(StructuredClass)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_Conjugate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuredClass getConjugate();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredClass#getConjugate <em>Conjugate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugate</em>' reference.
	 * @see #getConjugate()
	 * @generated
	 */
	void setConjugate(StructuredClass value);

	/**
	 * Returns the value of the '<em><b>Owned Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Connector</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_OwnedConnector()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Connector> getOwnedConnector();

	/**
	 * Returns the value of the '<em><b>Owned Structured Feature</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Structured Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Structured Feature</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_OwnedStructuredFeature()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getOwnedStructuredFeature();

	/**
	 * Returns the value of the '<em><b>Types Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Property</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_TypesProperty()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getTypesProperty();

	/**
	 * Returns the value of the '<em><b>Blind Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of all Property's not owned or required by a StructuredClass and are an endProperty of an Association where the other endProperty has that StructuredClass as its type
	 * 
	 * FIX ME:
	 * let assoc:Association = Class.relation->select(schematype==Association) in if assoc.endProperty.type->select(type == Class).size() >= 1 then  endProperty->select(type != Class)
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blind Property</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_BlindProperty()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getBlindProperty();

	/**
	 * Returns the value of the '<em><b>Port Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Property</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_PortProperty()
	 * @model containment="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getPortProperty();

	/**
	 * Returns the value of the '<em><b>Proxy Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Port</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_ProxyPort()
	 * @model containment="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getProxyPort();

	/**
	 * Returns the value of the '<em><b>Self Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Port</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_SelfPort()
	 * @model containment="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getSelfPort();

	/**
	 * Returns the value of the '<em><b>Full Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Port</em>' containment reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_FullPort()
	 * @model containment="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getFullPort();

	/**
	 * Returns the value of the '<em><b>Interaction Participant</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Participant</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredClass_InteractionParticipant()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getInteractionParticipant();

} // StructuredClass
