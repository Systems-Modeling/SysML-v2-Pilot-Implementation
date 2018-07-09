/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.SequenceAccessExpression#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.SequenceAccessExpression#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSequenceAccessExpression()
 * @model
 * @generated
 */
public interface SequenceAccessExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' containment reference.
	 * @see #setPrimary(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSequenceAccessExpression_Primary()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getPrimary();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SequenceAccessExpression#getPrimary <em>Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' containment reference.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(Expression value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSequenceAccessExpression_Index()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getIndex();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.SequenceAccessExpression#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Expression value);

} // SequenceAccessExpression
