/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Superclassing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClass <em>Owning Class</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing()
 * @model
 * @generated
 */
public interface Superclassing extends Generalization {
	/**
	 * Returns the value of the '<em><b>Superclass</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getGeneral() <em>General</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass</em>' reference.
	 * @see #setSuperclass(org.omg.sysml.lang.sysml.Class)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_Superclass()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='superclassing'"
	 *        annotation="redefines"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Class getSuperclass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Superclassing#getSuperclass <em>Superclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superclass</em>' reference.
	 * @see #getSuperclass()
	 * @generated
	 */
	void setSuperclass(org.omg.sysml.lang.sysml.Class value);

	/**
	 * Returns the value of the '<em><b>Subclass</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getSpecific() <em>Specific</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass</em>' reference.
	 * @see #setSubclass(org.omg.sysml.lang.sysml.Class)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_Subclass()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subclassing'"
	 *        annotation="redefines"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Class getSubclass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Superclassing#getSubclass <em>Subclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclass</em>' reference.
	 * @see #getSubclass()
	 * @generated
	 */
	void setSubclass(org.omg.sysml.lang.sysml.Class value);

	/**
	 * Returns the value of the '<em><b>Owning Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Class#getOwnedSuperclassing <em>Owned Superclassing</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getOwningCategory() <em>Owning Category</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Class</em>' reference.
	 * @see #setOwningClass(org.omg.sysml.lang.sysml.Class)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_OwningClass()
	 * @see org.omg.sysml.lang.sysml.Class#getOwnedSuperclassing
	 * @model opposite="ownedSuperclassing" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	org.omg.sysml.lang.sysml.Class getOwningClass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClass <em>Owning Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Class</em>' reference.
	 * @see #getOwningClass()
	 * @generated
	 */
	void setOwningClass(org.omg.sysml.lang.sysml.Class value);

} // Superclassing
