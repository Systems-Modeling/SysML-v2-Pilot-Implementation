/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>Invariant</code> is a <code>BooleanExpression</code> that is asserted to have a specific <code><em>Boolean</em></code> result value. If <code>isNegated = false</code>, then the result is asserted to be true. If <code>isNegated = true</code>, then the result is asserted to be false.</p>
 * 
 * if isNegated then
 *     specializesFromLibrary('Performances::falseEvaluations')
 * else
 *     specializesFromLibrary('Performances::trueEvaluations')
 * endif
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Invariant#isNegated <em>Is Negated</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant()
 * @model
 * @generated
 */
public interface Invariant extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Is Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this <code>Invariant</code> is asserted to be false rather than true.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Negated</em>' attribute.
	 * @see #setIsNegated(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvariant_IsNegated()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNegated();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Invariant#isNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Negated</em>' attribute.
	 * @see #isNegated()
	 * @generated
	 */
	void setIsNegated(boolean value);

} // Invariant
