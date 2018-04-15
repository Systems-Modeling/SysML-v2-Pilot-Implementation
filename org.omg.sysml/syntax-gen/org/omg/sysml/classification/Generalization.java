/**
 */
package org.omg.sysml.classification;

import org.omg.sysml.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.classification.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Generalization#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.omg.sysml.classification.Generalization#getOwningGeneralization <em>Owning Generalization</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.classification.ClassificationPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends Relationship {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(org.omg.sysml.classification.Class)
	 * @see org.omg.sysml.classification.ClassificationPackage#getGeneralization_General()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.omg.sysml.classification.Class getGeneral();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(org.omg.sysml.classification.Class value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' reference.
	 * @see #setSpecific(org.omg.sysml.classification.Class)
	 * @see org.omg.sysml.classification.ClassificationPackage#getGeneralization_Specific()
	 * @model ordered="false"
	 * @generated
	 */
	org.omg.sysml.classification.Class getSpecific();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Generalization#getSpecific <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(org.omg.sysml.classification.Class value);

	/**
	 * Returns the value of the '<em><b>Owning Generalization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.classification.Class#getOwnedGeneralization <em>Owned Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Generalization</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Generalization</em>' container reference.
	 * @see #setOwningGeneralization(org.omg.sysml.classification.Class)
	 * @see org.omg.sysml.classification.ClassificationPackage#getGeneralization_OwningGeneralization()
	 * @see org.omg.sysml.classification.Class#getOwnedGeneralization
	 * @model opposite="ownedGeneralization" transient="false" ordered="false"
	 * @generated
	 */
	org.omg.sysml.classification.Class getOwningGeneralization();

	/**
	 * Sets the value of the '{@link org.omg.sysml.classification.Generalization#getOwningGeneralization <em>Owning Generalization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Generalization</em>' container reference.
	 * @see #getOwningGeneralization()
	 * @generated
	 */
	void setOwningGeneralization(org.omg.sysml.classification.Class value);

} // Generalization
