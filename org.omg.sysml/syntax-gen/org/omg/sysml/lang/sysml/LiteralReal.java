/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Literal
 * Real</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An Expression that provides a Real value as a result.</p>
 * 
 * <p>A LiteralReal must be typed by a specialization of Evaluation with no input parameters and a single Real value as its result.</p>
 * <p>An Expression that provides a Real value as a result.</p>
 * 
 * <p>A LiteralReal must be typed by a specialization of Evaluation with no input parameters and a single Real value as its result.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.LiteralReal#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLiteralReal()
 * @model
 * @generated
 */
public interface LiteralReal extends LiteralExpression {
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
	 * @see #setValue(double)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLiteralReal_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.LiteralReal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // LiteralReal
