/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.kerml.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.Association#getTargetEndProperty <em>Target End Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Association#getTargetParticipantProperty <em>Target Participant Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Association#getSourceEndProperty <em>Source End Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Association#getSourceParticipantProperty <em>Source Participant Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Association#getParticipantProperty <em>Participant Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Association#getEndProperty <em>End Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Association#getTypesConnector <em>Types Connector</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relationship, StructuredClass {
	/**
	 * Returns the value of the '<em><b>Target End Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target End Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target End Property</em>' reference.
	 * @see #setTargetEndProperty(StructuredFeature)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getAssociation_TargetEndProperty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuredFeature getTargetEndProperty();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Association#getTargetEndProperty <em>Target End Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target End Property</em>' reference.
	 * @see #getTargetEndProperty()
	 * @generated
	 */
	void setTargetEndProperty(StructuredFeature value);

	/**
	 * Returns the value of the '<em><b>Target Participant Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Participant Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Participant Property</em>' containment reference.
	 * @see #setTargetParticipantProperty(StructuredFeature)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getAssociation_TargetParticipantProperty()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StructuredFeature getTargetParticipantProperty();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Association#getTargetParticipantProperty <em>Target Participant Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Participant Property</em>' containment reference.
	 * @see #getTargetParticipantProperty()
	 * @generated
	 */
	void setTargetParticipantProperty(StructuredFeature value);

	/**
	 * Returns the value of the '<em><b>Source End Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source End Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source End Property</em>' reference.
	 * @see #setSourceEndProperty(StructuredFeature)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getAssociation_SourceEndProperty()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuredFeature getSourceEndProperty();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Association#getSourceEndProperty <em>Source End Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source End Property</em>' reference.
	 * @see #getSourceEndProperty()
	 * @generated
	 */
	void setSourceEndProperty(StructuredFeature value);

	/**
	 * Returns the value of the '<em><b>Source Participant Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Participant Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Participant Property</em>' containment reference.
	 * @see #setSourceParticipantProperty(StructuredFeature)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getAssociation_SourceParticipantProperty()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StructuredFeature getSourceParticipantProperty();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Association#getSourceParticipantProperty <em>Source Participant Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Participant Property</em>' containment reference.
	 * @see #getSourceParticipantProperty()
	 * @generated
	 */
	void setSourceParticipantProperty(StructuredFeature value);

	/**
	 * Returns the value of the '<em><b>Participant Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.StructuredFeature#getParticipatesIn <em>Participates In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Property</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getAssociation_ParticipantProperty()
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getParticipatesIn
	 * @model opposite="participatesIn" lower="2" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getParticipantProperty();

	/**
	 * Returns the value of the '<em><b>End Property</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.StructuredFeature#getEndOf <em>End Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Property</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getAssociation_EndProperty()
	 * @see org.omg.sysml.kerml.structure.StructuredFeature#getEndOf
	 * @model opposite="endOf" lower="2" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getEndProperty();

	/**
	 * Returns the value of the '<em><b>Types Connector</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Connector</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getAssociation_TypesConnector()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<Connector> getTypesConnector();

} // Association
