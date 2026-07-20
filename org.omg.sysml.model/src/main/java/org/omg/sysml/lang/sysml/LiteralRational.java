/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Rational</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>LiteralRational</code> is a <code>LiteralExpression</code> that provides a <code><em>Rational</em></code> value as a result. Its <code>result</code> <code>parameter</code> must have the type <code><em>Rational</em></code>.</p>
 * 
 * specializesFromLibrary('Performances::literalRationalEvaluations')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.LiteralRational#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLiteralRational()
 * @model
 * @generated
 */
public interface LiteralRational extends LiteralExpression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The value whose rational approximation is the result of evaluating this <code>LiteralRational</code>.</p>
	 * 
	 * <p>The Real value that is the result of evaluating this Expression.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLiteralRational_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.LiteralRational#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // LiteralRational
