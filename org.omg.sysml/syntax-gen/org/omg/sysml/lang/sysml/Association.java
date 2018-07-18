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
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getParticipantFeature <em>Participant Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getSourceParticipantFeature <em>Source Participant Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getTargetParticipantFeature <em>Target Participant Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getEndFeature <em>End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getTargetEndFeature <em>Target End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getSourceEndFeature <em>Source End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getOwnedEndFeatureMembership <em>Owned End Feature Membership</em>}</li>
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
	 * Returns the value of the '<em><b>Participant Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getParticipantOfAssociation <em>Participant Of Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_ParticipantFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getParticipantOfAssociation
	 * @model opposite="participantOfAssociation" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getParticipantFeature();

	/**
	 * Returns the value of the '<em><b>Source Participant Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Participant Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Participant Feature</em>' reference.
	 * @see #setSourceParticipantFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceParticipantFeature()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getSourceParticipantFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getSourceParticipantFeature <em>Source Participant Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Participant Feature</em>' reference.
	 * @see #getSourceParticipantFeature()
	 * @generated
	 */
	void setSourceParticipantFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Target Participant Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Participant Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Participant Feature</em>' reference.
	 * @see #setTargetParticipantFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetParticipantFeature()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getTargetParticipantFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getTargetParticipantFeature <em>Target Participant Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Participant Feature</em>' reference.
	 * @see #getTargetParticipantFeature()
	 * @generated
	 */
	void setTargetParticipantFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>End Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Feature#getEndOfAssociation <em>End Of Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_EndFeature()
	 * @see org.omg.sysml.lang.sysml.Feature#getEndOfAssociation
	 * @model opposite="endOfAssociation" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getEndFeature();

	/**
	 * Returns the value of the '<em><b>Target End Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target End Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target End Feature</em>' reference.
	 * @see #setTargetEndFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_TargetEndFeature()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getTargetEndFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getTargetEndFeature <em>Target End Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target End Feature</em>' reference.
	 * @see #getTargetEndFeature()
	 * @generated
	 */
	void setTargetEndFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Source End Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source End Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source End Feature</em>' reference.
	 * @see #setSourceEndFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_SourceEndFeature()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getSourceEndFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getSourceEndFeature <em>Source End Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source End Feature</em>' reference.
	 * @see #getSourceEndFeature()
	 * @generated
	 */
	void setSourceEndFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Owned End Feature Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.EndFeatureMembership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End Feature Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned End Feature Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_OwnedEndFeatureMembership()
	 * @see org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation
	 * @model opposite="owningAssociation"
	 * @generated
	 */
	EList<EndFeatureMembership> getOwnedEndFeatureMembership();

} // Association
