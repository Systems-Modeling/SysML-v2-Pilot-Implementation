/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Creation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstanceCreationExpression()
 * @model
 * @generated
 */
public interface InstanceCreationExpression extends InvocationExpression {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstanceCreationExpression_Category()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // InstanceCreationExpression
