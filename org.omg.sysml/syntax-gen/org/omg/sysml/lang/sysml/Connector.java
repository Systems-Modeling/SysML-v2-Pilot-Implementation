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
	 * @model ordered="false"
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
	 * @model ordered="false"
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
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Path</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_SourcePath()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getSourcePath();

	/**
	 * Returns the value of the '<em><b>Target Path</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Path</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConnector_TargetPath()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getTargetPath();

} // Connector
