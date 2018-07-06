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
	 * @model lower="2" upper="2" derived="true" ordered="false"
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
	 * @model required="true" derived="true" ordered="false"
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
	 * @model required="true" derived="true" ordered="false"
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
	 * @model opposite="participantOfAssociation" lower="2" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getParticipant();

	/**
	 * Returns the value of the '<em><b>Source Participant</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Participant</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceParticipant()
	 * @model lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<Feature> getSourceParticipant();

	/**
	 * Returns the value of the '<em><b>Target Participant</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Participant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Participant</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetParticipant()
	 * @model lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<Feature> getTargetParticipant();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureDomain}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.FeatureDomain#getEndOfAssociation <em>End Of Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_End()
	 * @see org.omg.sysml.lang.sysml.FeatureDomain#getEndOfAssociation
	 * @model opposite="endOfAssociation" required="true" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<FeatureDomain> getEnd();

	/**
	 * Returns the value of the '<em><b>Target End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetEnd()
	 * @model lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<FeatureDomain> getTargetEnd();

	/**
	 * Returns the value of the '<em><b>Source End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceEnd()
	 * @model lower="2" upper="2" ordered="false"
	 * @generated
	 */
	EList<FeatureDomain> getSourceEnd();

} // Association
