/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Generalization#getOwningCategory <em>Owning Category</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends Relationship {
	/**
	 * Returns the value of the '<em><b>Owning Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Category#getOwnedGeneralization <em>Owned Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Category</em>' reference.
	 * @see #setOwningCategory(Category)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getGeneralization_OwningCategory()
	 * @see org.omg.sysml.lang.sysml.Category#getOwnedGeneralization
	 * @model opposite="ownedGeneralization" derived="true" ordered="false"
	 * @generated
	 */
	Category getOwningCategory();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Generalization#getOwningCategory <em>Owning Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Category</em>' reference.
	 * @see #getOwningCategory()
	 * @generated
	 */
	void setOwningCategory(Category value);

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Category)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getGeneralization_General()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getGeneral();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Generalization#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Category value);

	/**
	 * Returns the value of the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific</em>' reference.
	 * @see #setSpecific(Category)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getGeneralization_Specific()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getSpecific();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Generalization#getSpecific <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific</em>' reference.
	 * @see #getSpecific()
	 * @generated
	 */
	void setSpecific(Category value);

} // Generalization
