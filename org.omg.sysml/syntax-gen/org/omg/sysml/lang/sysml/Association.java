/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getSourceParticipant <em>Source Participant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getTargetParticipant <em>Target Participant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getEnd <em>End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getTargetEnd <em>Target End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getSourceEnd <em>Source End</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relationship, org.omg.sysml.lang.sysml.Class {
	/**
	 * Returns the value of the '<em><b>Related Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_RelatedType()
	 * @model upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<org.omg.sysml.lang.sysml.Class> getRelatedType();

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(org.omg.sysml.lang.sysml.Class)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceType()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Class getSourceType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(org.omg.sysml.lang.sysml.Class value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see #setTargetType(org.omg.sysml.lang.sysml.Class)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetType()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Class getTargetType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(org.omg.sysml.lang.sysml.Class value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getParticipantOfAssociation <em>Participant Of Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_Participant()
	 * @see org.omg.sysml.lang.sysml.Feature#getParticipantOfAssociation
	 * @model opposite="participantOfAssociation" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getParticipant();

	/**
	 * Returns the value of the '<em><b>Source Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Participant</em>' reference.
	 * @see #setSourceParticipant(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceParticipant()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getSourceParticipant();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getSourceParticipant <em>Source Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Participant</em>' reference.
	 * @see #getSourceParticipant()
	 * @generated
	 */
	void setSourceParticipant(Feature value);

	/**
	 * Returns the value of the '<em><b>Target Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Participant</em>' reference.
	 * @see #setTargetParticipant(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetParticipant()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getTargetParticipant();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getTargetParticipant <em>Target Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Participant</em>' reference.
	 * @see #getTargetParticipant()
	 * @generated
	 */
	void setTargetParticipant(Feature value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getEndOfAssociation <em>End Of Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_End()
	 * @see org.omg.sysml.lang.sysml.Feature#getEndOfAssociation
	 * @model opposite="endOfAssociation" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getEnd();

	/**
	 * Returns the value of the '<em><b>Target End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target End</em>' reference.
	 * @see #setTargetEnd(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetEnd()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getTargetEnd();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getTargetEnd <em>Target End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target End</em>' reference.
	 * @see #getTargetEnd()
	 * @generated
	 */
	void setTargetEnd(Feature value);

	/**
	 * Returns the value of the '<em><b>Source End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source End</em>' reference.
	 * @see #setSourceEnd(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceEnd()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getSourceEnd();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getSourceEnd <em>Source End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source End</em>' reference.
	 * @see #getSourceEnd()
	 * @generated
	 */
	void setSourceEnd(Feature value);

} // Association
