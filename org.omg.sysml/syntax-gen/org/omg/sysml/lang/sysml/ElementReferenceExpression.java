/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ElementReferenceExpression#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementReferenceExpression()
 * @model
 * @generated
 */
public interface ElementReferenceExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getElementReferenceExpression_Referent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getReferent();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ElementReferenceExpression#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(Element value);

} // ElementReferenceExpression
