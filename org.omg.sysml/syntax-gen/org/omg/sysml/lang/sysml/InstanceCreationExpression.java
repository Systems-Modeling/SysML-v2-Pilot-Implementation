/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Instance
 * Creation Expression</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getInstantiatedType <em>Instantiated Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstanceCreationExpression()
 * @model
 * @generated
 */
public interface InstanceCreationExpression extends InvocationExpression {

	/**
	 * Returns the value of the '<em><b>Instantiated Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instantiated Type</em>' reference.
	 * @see #setInstantiatedType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstanceCreationExpression_InstantiatedType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Type getInstantiatedType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.InstanceCreationExpression#getInstantiatedType <em>Instantiated Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Type</em>' reference.
	 * @see #getInstantiatedType()
	 * @generated
	 */
	void setInstantiatedType(Type value);

} // InstanceCreationExpression
