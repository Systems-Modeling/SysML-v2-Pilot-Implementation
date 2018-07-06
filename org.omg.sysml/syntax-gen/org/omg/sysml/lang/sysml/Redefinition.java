/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Redefinition#getRedefinedFeature <em>Redefined Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Redefinition#getRedefiningFeature <em>Redefining Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRedefinition()
 * @model
 * @generated
 */
public interface Redefinition extends Subset {
	/**
	 * Returns the value of the '<em><b>Redefined Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefined Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Feature</em>' reference.
	 * @see #setRedefinedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRedefinition_RedefinedFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getRedefinedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Redefinition#getRedefinedFeature <em>Redefined Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefined Feature</em>' reference.
	 * @see #getRedefinedFeature()
	 * @generated
	 */
	void setRedefinedFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Redefining Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redefining Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefining Feature</em>' reference.
	 * @see #setRedefiningFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRedefinition_RedefiningFeature()
	 * @model ordered="false"
	 * @generated
	 */
	Feature getRedefiningFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Redefinition#getRedefiningFeature <em>Redefining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefining Feature</em>' reference.
	 * @see #getRedefiningFeature()
	 * @generated
	 */
	void setRedefiningFeature(Feature value);

} // Redefinition
