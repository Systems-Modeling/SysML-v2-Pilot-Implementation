/**
 */
package org.omg.sysml.kerml.structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends org.omg.sysml.kerml.core.Relationship {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(org.omg.sysml.kerml.structure.Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getGeneralization_General()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.structure.Class getGeneral();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(org.omg.sysml.kerml.structure.Class value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Class#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' container reference.
	 * @see #setSpecific(org.omg.sysml.kerml.structure.Class)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getGeneralization_Specific()
	 * @see org.omg.sysml.kerml.structure.Class#getGeneralization
	 * @model opposite="generalization" required="true" transient="false" ordered="false"
	 * @generated
	 */
	org.omg.sysml.kerml.structure.Class getSpecific();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.Generalization#getSpecific <em>Specific</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' container reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(org.omg.sysml.kerml.structure.Class value);

} // Generalization
