/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Association specifies multiple semantic relationships (pairs) that can occur between individuals of a given Category. It has at least two participant properties to connect Categories. These properties can have further properties nested under them in order to provide navigation between one Category and another.
 * relatedTypes = ownedEndFeatureMembership.type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getOwnedEndFeatureMembership <em>Owned End Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends org.omg.sysml.lang.sysml.Class, Relationship {
	/**
	 * Returns the value of the '<em><b>Related Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Category}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_RelatedType()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='association'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Category> getRelatedType();

	/**
	 * Returns the value of the '<em><b>Owned End Feature Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.EndFeatureMembership}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation <em>Owning Association</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Category#getOwnedFeatureMembership_comp() <em>Owned Feature Membership comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End Feature Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned End Feature Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_OwnedEndFeatureMembership()
	 * @see org.omg.sysml.lang.sysml.EndFeatureMembership#getOwningAssociation
	 * @model opposite="owningAssociation" lower="2"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EndFeatureMembership> getOwnedEndFeatureMembership();

	/**
	 * Returns the value of the '<em><b>Owning Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType <em>Owned Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Connector</em>' reference.
	 * @see #setOwningConnector(Connector)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssociation_OwningConnector()
	 * @see org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType
	 * @model opposite="ownedAssociationType" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Connector getOwningConnector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Connector</em>' reference.
	 * @see #getOwningConnector()
	 * @generated
	 */
	void setOwningConnector(Connector value);

} // Association
