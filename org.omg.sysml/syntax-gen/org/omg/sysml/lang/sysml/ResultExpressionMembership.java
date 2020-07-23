/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Expression Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ResultExpressionMembership is a FeatureMembership that indicates that the <code>ownedResultExpression</code> provides the result for the Function or Expression that owns it. The owning Function or Expression must contain a BindingConnector between the result of the <code>ownedResultExpression<code> and the <code>result</code> parameter of the Function or Expression.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ResultExpressionMembership#getOwnedResultExpression_comp <em>Owned Result Expression comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ResultExpressionMembership#getOwnedResultExpression <em>Owned Result Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getResultExpressionMembership()
 * @model
 * @generated
 */
public interface ResultExpressionMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Owned Result Expression comp</b></em>' containment reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature_comp() <em>Owned Member Feature comp</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expression that provides the result for the owner of the ResultExpressionMembership.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Result Expression comp</em>' containment reference.
	 * @see #setOwnedResultExpression_comp(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getResultExpressionMembership_OwnedResultExpression_comp()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningResultExpressionMembership'"
	 *        annotation="redefines"
	 * @generated
	 */
	Expression getOwnedResultExpression_comp();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ResultExpressionMembership#getOwnedResultExpression_comp <em>Owned Result Expression comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Result Expression comp</em>' containment reference.
	 * @see #getOwnedResultExpression_comp()
	 * @generated
	 */
	void setOwnedResultExpression_comp(Expression value);

	/**
	 * Returns the value of the '<em><b>Owned Result Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Result Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Result Expression</em>' reference.
	 * @see #setOwnedResultExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getResultExpressionMembership_OwnedResultExpression()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Expression getOwnedResultExpression();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ResultExpressionMembership#getOwnedResultExpression <em>Owned Result Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Result Expression</em>' reference.
	 * @see #getOwnedResultExpression()
	 * @generated
	 */
	void setOwnedResultExpression(Expression value);

} // ResultExpressionMembership
