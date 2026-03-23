/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Expression Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ResultExpressionMembership</code> is a <code>FeatureMembership</code> that indicates that the <code>ownedResultExpression</code> provides the result values for the <code>Function</code> or <code>Expression</code> that owns it. The owning <code>Function</code> or <code>Expression</code> must contain a <code>BindingConnector</code> between the <code>result</code> <code>parameter</code> of the <code>ownedResultExpression</code> and the <code>result</code> <code>parameter</code> of the owning <code>Function</code> or <code>Expression</code>.</p>
 * 
 * owningType.oclIsKindOf(Function) or owningType.oclIsKindOf(Expression)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ResultExpressionMembership#getOwnedResultExpression <em>Owned Result Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getResultExpressionMembership()
 * @model
 * @generated
 */
public interface ResultExpressionMembership extends FeatureMembership {
	/**
	 * Returns the value of the '<em><b>Owned Result Expression</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureMembership#getOwnedMemberFeature() <em>Owned Member Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expression</code> that provides the result for the owner of the <code>ResultExpressionMembership</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Result Expression</em>' reference.
	 * @see #setOwnedResultExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getResultExpressionMembership_OwnedResultExpression()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningResultExpressionMembership'"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
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
