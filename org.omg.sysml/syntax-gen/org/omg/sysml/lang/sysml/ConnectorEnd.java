/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConnectorEnd#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConnectorEnd#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConnectorEnd#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConnectorEnd#getEnd <em>End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConnectorEnd#getPath <em>Path</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConnectorEnd#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectorEnd()
 * @model
 * @generated
 */
public interface ConnectorEnd extends Relationship {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectorEnd_Lower()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectorEnd'"
	 * @generated
	 */
	Expression getLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getLower <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' reference.
	 * @see #setUpper(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectorEnd_Upper()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectorEnd'"
	 * @generated
	 */
	Expression getUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Expression value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectorEnd_Feature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectorEnd'"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectorEnd_End()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectorEnd'"
	 * @generated
	 */
	Feature getEnd();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Feature value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectorEnd_Path()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectorEnd'"
	 * @generated
	 */
	EList<Feature> getPath();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Connector#getConnectorEnd <em>Connector End</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getSource() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnectorEnd_Connector()
	 * @see org.omg.sysml.lang.sysml.Connector#getConnectorEnd
	 * @model opposite="connectorEnd" required="true" ordered="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConnectorEnd#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // ConnectorEnd
