/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

import org.omg.sysml.kerml.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getSourcePath <em>Source Path</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getTargetPath <em>Target Path</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#isIsDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getSourceUpper <em>Source Upper</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getSourceLower <em>Source Lower</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getTargetUpper <em>Target Upper</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getTargetLower <em>Target Lower</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Connector#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Relationship, StructuredFeature {
	/**
	 * Returns the value of the '<em><b>Source Path</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Path</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_SourcePath()
	 * @model required="true"
	 * @generated
	 */
	EList<StructuredFeature> getSourcePath();

	/**
	 * Returns the value of the '<em><b>Target Path</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Path</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Path</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_TargetPath()
	 * @model required="true"
	 * @generated
	 */
	EList<StructuredFeature> getTargetPath();

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
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_IsDirected()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDirected();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Connector#isIsDirected <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Directed</em>' attribute.
	 * @see #isIsDirected()
	 * @generated
	 */
	void setIsDirected(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Upper</em>' attribute.
	 * @see #setSourceUpper(int)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_SourceUpper()
	 * @model ordered="false"
	 * @generated
	 */
	int getSourceUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Connector#getSourceUpper <em>Source Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Upper</em>' attribute.
	 * @see #getSourceUpper()
	 * @generated
	 */
	void setSourceUpper(int value);

	/**
	 * Returns the value of the '<em><b>Source Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Lower</em>' attribute.
	 * @see #setSourceLower(int)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_SourceLower()
	 * @model ordered="false"
	 * @generated
	 */
	int getSourceLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Connector#getSourceLower <em>Source Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Lower</em>' attribute.
	 * @see #getSourceLower()
	 * @generated
	 */
	void setSourceLower(int value);

	/**
	 * Returns the value of the '<em><b>Target Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Upper</em>' attribute.
	 * @see #setTargetUpper(int)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_TargetUpper()
	 * @model ordered="false"
	 * @generated
	 */
	int getTargetUpper();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Connector#getTargetUpper <em>Target Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Upper</em>' attribute.
	 * @see #getTargetUpper()
	 * @generated
	 */
	void setTargetUpper(int value);

	/**
	 * Returns the value of the '<em><b>Target Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Lower</em>' attribute.
	 * @see #setTargetLower(int)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_TargetLower()
	 * @model ordered="false"
	 * @generated
	 */
	int getTargetLower();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Connector#getTargetLower <em>Target Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Lower</em>' attribute.
	 * @see #getTargetLower()
	 * @generated
	 */
	void setTargetLower(int value);

	/**
	 * Returns the value of the '<em><b>Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Multiplicity</em>' attribute.
	 * @see #setSourceMultiplicity(String)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_SourceMultiplicity()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	String getSourceMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Connector#getSourceMultiplicity <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Multiplicity</em>' attribute.
	 * @see #getSourceMultiplicity()
	 * @generated
	 */
	void setSourceMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Multiplicity</em>' attribute.
	 * @see #setTargetMultiplicity(String)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_TargetMultiplicity()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	String getTargetMultiplicity();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Connector#getTargetMultiplicity <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Multiplicity</em>' attribute.
	 * @see #getTargetMultiplicity()
	 * @generated
	 */
	void setTargetMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.RefinedAssociation#getDefiningConnector <em>Defining Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(RefinedAssociation)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getConnector_Value()
	 * @see org.omg.sysml.kerml.structure.RefinedAssociation#getDefiningConnector
	 * @model opposite="definingConnector" required="true" ordered="false"
	 * @generated
	 */
	RefinedAssociation getValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Connector#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(RefinedAssociation value);

} // Connector
