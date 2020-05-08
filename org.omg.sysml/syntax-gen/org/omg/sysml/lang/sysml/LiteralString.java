/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Literal
 * String</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Expression that provides a String value as a result.</p>
 * 
 * <p>A LiteralString must be typed by a specialization of Evaluation with no input parameters and a single String value as its result.</p>
 * <p>An Expression that provides a String value as a result.</p>
 * 
 * <p>A LiteralString must be typed by a specialization of Evaluation with no input parameters and a single String value as its result.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.LiteralString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLiteralString()
 * @model
 * @generated
 */
public interface LiteralString extends LiteralExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLiteralString_Value()
	 * @model dataType="org.omg.sysml.lang.types.String" required="true"
	 *        ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.LiteralString#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // LiteralString
