/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureAccessExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureAccessExpression#getAccessedFeature <em>Accessed Feature</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureAccessExpression()
 * @model
 * @generated
 */
public interface FeatureAccessExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureAccessExpression_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureAccessExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Accessed Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed Feature</em>' reference.
	 * @see #setAccessedFeature(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureAccessExpression_AccessedFeature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getAccessedFeature();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureAccessExpression#getAccessedFeature <em>Accessed Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessed Feature</em>' reference.
	 * @see #getAccessedFeature()
	 * @generated
	 */
	void setAccessedFeature(Feature value);

} // FeatureAccessExpression
