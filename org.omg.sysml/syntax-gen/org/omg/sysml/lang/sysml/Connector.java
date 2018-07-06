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
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getTargetPath <em>Target Path</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#isIsDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getSourceLower <em>Source Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getSourceUpper <em>Source Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getTargetLower <em>Target Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Connector#getTargetUpper <em>Target Upper</em>}</li>
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
	 * @model upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getRelatedFeatures();

	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Feature</em>' reference.
	 * @see #setSourceFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_SourceFeature()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	Feature getSourceFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getSourceFeature <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' reference.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Feature</em>' reference.
	 * @see #setTargetFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_TargetFeature()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	Feature getTargetFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getTargetFeature <em>Target Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' reference.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Source Path</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureMembership}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Path</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_SourcePath()
	 * @model
	 * @generated
	 */
	EList<FeatureMembership> getSourcePath();

	/**
	 * Returns the value of the '<em><b>Target Path</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FeatureMembership}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Path</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_TargetPath()
	 * @model
	 * @generated
	 */
	EList<FeatureMembership> getTargetPath();

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
	 * @model ordered="false"
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
	 * Returns the value of the '<em><b>Source Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Lower</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Lower</em>' containment reference.
	 * @see #setSourceLower(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_SourceLower()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getSourceLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getSourceLower <em>Source Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Lower</em>' containment reference.
	 * @see #getSourceLower()
	 * @generated
	 */
	void setSourceLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Source Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Upper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Upper</em>' containment reference.
	 * @see #setSourceUpper(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_SourceUpper()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getSourceUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getSourceUpper <em>Source Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Upper</em>' containment reference.
	 * @see #getSourceUpper()
	 * @generated
	 */
	void setSourceUpper(Expression value);

	/**
	 * Returns the value of the '<em><b>Target Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Lower</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Lower</em>' containment reference.
	 * @see #setTargetLower(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_TargetLower()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTargetLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getTargetLower <em>Target Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Lower</em>' containment reference.
	 * @see #getTargetLower()
	 * @generated
	 */
	void setTargetLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Target Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Upper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Upper</em>' containment reference.
	 * @see #setTargetUpper(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_TargetUpper()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTargetUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Connector#getTargetUpper <em>Target Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Upper</em>' containment reference.
	 * @see #getTargetUpper()
	 * @generated
	 */
	void setTargetUpper(Expression value);

} // Connector
