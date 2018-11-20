/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getRelatedFeatures <em>Related Features</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#isIsDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd <em>Connector End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType <em>Owned Association Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Relationship, Feature {
	/**
	 * Returns the value of the '<em><b>Related Features</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Features</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_RelatedFeatures()
	 * @model lower="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getRelatedFeatures();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Is Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Directed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Directed</em>' attribute.
	 * @see #setIsDirected(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_IsDirected()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDirected();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#isIsDirected <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Directed</em>' attribute.
	 * @see #isIsDirected()
	 * @generated
	 */
	void setIsDirected(boolean value);

	/**
	 * Returns the value of the '<em><b>Connector End</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConnectorEnd}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector End</em>' containment reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_ConnectorEnd()
	 * @see org.omg.sysml.lang.sysml.ConnectorEnd#getConnector
	 * @model opposite="connector" containment="true" lower="2"
	 * @generated
	 */
	EList<ConnectorEnd> getConnectorEnd();

	/**
	 * Returns the value of the '<em><b>Owned Association Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Association Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Association Type</em>' reference.
	 * @see #setOwnedAssociationType(Association)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_OwnedAssociationType()
	 * @see org.omg.sysml.lang.sysml.Association#getOwningConnector
	 * @model opposite="owningConnector" derived="true" ordered="false"
	 * @generated
	 */
	Association getOwnedAssociationType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType <em>Owned Association Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Association Type</em>' reference.
	 * @see #getOwnedAssociationType()
	 * @generated
	 */
	void setOwnedAssociationType(Association value);

} // Connector
