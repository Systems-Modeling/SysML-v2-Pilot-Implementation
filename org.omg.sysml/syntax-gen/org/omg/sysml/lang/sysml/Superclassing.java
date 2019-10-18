/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Superclassing</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Superclassing is a Generalization that is specific to the classifier case:</p>
 * 
 * <p><span><span>A classifier A is a generalization of a classifier B if (as usual) any instance of A is also an instance of B.</span></span></p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier <em>Owning Classifier</em>}</li>
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
	 * If the meaning of the '<em>Superclass</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclass</em>' reference.
	 * @see #setSuperclass(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_Superclass()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subclassing'"
	 *        annotation="redefines"
	 * @generated
	 */
	Classifier getSuperclass();

	/**
	 * Sets the value of the
	 * '{@link org.omg.sysml.lang.sysml.Superclassing#getSuperclass
	 * <em>Superclass</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Superclass</em>' reference.
	 * @see #getSuperclass()
	 * @generated
	 */
	void setSuperclass(Classifier value);

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
	 * If the meaning of the '<em>Subclass</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass</em>' reference.
	 * @see #setSubclass(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_Subclass()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='superclassing'"
	 *        annotation="redefines"
	 * @generated
	 */
	Classifier getSubclass();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Superclassing#getSubclass <em>Subclass</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclass</em>' reference.
	 * @see #getSubclass()
	 * @generated
	 */
	void setSubclass(Classifier value);

	/**
	 * Returns the value of the '<em><b>Owning Classifier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Classifier#getOwnedSuperclassing <em>Owned Superclassing</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Generalization#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Classifier</em>' reference.
	 * @see #setOwningClassifier(Classifier)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuperclassing_OwningClassifier()
	 * @see org.omg.sysml.lang.sysml.Classifier#getOwnedSuperclassing
	 * @model opposite="ownedSuperclassing" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Classifier getOwningClassifier();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier <em>Owning Classifier</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Classifier</em>' reference.
	 * @see #getOwningClassifier()
	 * @generated
	 */
	void setOwningClassifier(Classifier value);

} // Superclassing
