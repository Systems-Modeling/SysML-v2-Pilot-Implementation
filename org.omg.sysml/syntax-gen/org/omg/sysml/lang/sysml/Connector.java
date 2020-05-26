/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Connector</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Connector is a context-specific application of an Association. Associations determine what kinds of objects can be linked. The Connector further restricts those links according to specific roles played within a featuringType.</p>
 * 
 * relatedFeature = connectorEnd.feature
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getRelatedFeature <em>Related Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getOwnedAssociationType <em>Owned Association Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#isDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd <em>Connector End</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Feature, Relationship {
	/**
	 * Returns the value of the '<em><b>Related Feature</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>relatedFeatures</tt> of a Connector are the subsetted Features of the connectorEnds of the Connector.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Feature</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_RelatedFeature()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connector'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Feature> getRelatedFeature();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Association}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Association that types the connector.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_Association()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedConnector'"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Association> getAssociation();

	/**
	 * Returns the value of the '<em><b>Is Directed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Directed</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether or not the Connector should be considered to have a direction from source to target.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Directed</em>' attribute.
	 * @see #setIsDirected(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_IsDirected()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDirected();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#isDirected
	 * <em>Is Directed</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Is Directed</em>' attribute.
	 * @see #isDirected()
	 * @generated
	 */
	void setIsDirected(boolean value);

	/**
	 * Returns the value of the '<em><b>Connector End</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>These are the ends of the Connector, which show what Features it relates. The connectorEnds of a Connector are the features of the Connector that redefine the end Features of the Connector association.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector End</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_ConnectorEnd()
	 * @model lower="2" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringConnector'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Feature> getConnectorEnd();

	/**
	 * Returns the value of the '<em><b>Owned Association Type</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Association}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Association#getOwningConnector <em>Owning Connector</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Feature#getOwnedType() <em>Owned Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Association Type</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Connector may optionally own the Association that types it.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Association Type</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_OwnedAssociationType()
	 * @see org.omg.sysml.lang.sysml.Association#getOwningConnector
	 * @model opposite="owningConnector" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Association> getOwnedAssociationType();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The path operation returns the path from the Connector owner to the Feature given as the &quot;relatedFeature&quot; parameter.</p>
	 * 
	 * <p>There must be a path of Features from the owner of a Connector (which must be a Type) to each of the relatedFeatures of the Connector.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @model ordered="false" relatedFeatureRequired="true" relatedFeatureOrdered="false"
	 * @generated
	 */
	EList<Feature> path(Feature relatedFeature);

} // Connector
