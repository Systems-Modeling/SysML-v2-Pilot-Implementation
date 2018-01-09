/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refined Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.RefinedAssociation#getDefiningConnector <em>Defining Connector</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.RefinedAssociation#getInstanceOf <em>Instance Of</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getRefinedAssociation()
 * @model
 * @generated
 */
public interface RefinedAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Defining Connector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Connector#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defining Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defining Connector</em>' reference.
	 * @see #setDefiningConnector(Connector)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getRefinedAssociation_DefiningConnector()
	 * @see org.omg.sysml.kerml.structure.Connector#getValue
	 * @model opposite="value" required="true" ordered="false"
	 * @generated
	 */
	Connector getDefiningConnector();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.RefinedAssociation#getDefiningConnector <em>Defining Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Connector</em>' reference.
	 * @see #getDefiningConnector()
	 * @generated
	 */
	void setDefiningConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Instance Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of</em>' reference.
	 * @see #setInstanceOf(Association)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getRefinedAssociation_InstanceOf()
	 * @model ordered="false"
	 * @generated
	 */
	Association getInstanceOf();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.RefinedAssociation#getInstanceOf <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of</em>' reference.
	 * @see #getInstanceOf()
	 * @generated
	 */
	void setInstanceOf(Association value);

} // RefinedAssociation
