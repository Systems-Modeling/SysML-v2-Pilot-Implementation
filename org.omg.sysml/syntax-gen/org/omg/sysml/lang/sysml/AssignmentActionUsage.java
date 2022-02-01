/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An AssignmentActionUsage is an ActionUsage that is typed, directly or indirectly, by the ActionDefinition <em><code>AssignmentAction</code> </em>from the Systems model library. It specifies that the value of the <code>referent</code> Feature, relative to the target given by the result of the <code>targetArgument</code> Expression, should be set to the result of the <code>valueExpression</code>.</p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AssignmentActionUsage#getTargetArgument <em>Target Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AssignmentActionUsage#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.AssignmentActionUsage#getReferent <em>Referent</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssignmentActionUsage()
 * @model
 * @generated
 */
public interface AssignmentActionUsage extends ActionUsage {
	/**
	 * Returns the value of the '<em><b>Target Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expression whose value is an occurrence in the domain of the <code>referent</code> Feature, for which the value of the <code>referent</code> will be set to the result of the <code>valueExpression</code> by this AssignmentActionUsage. Derived as the <code>value</code> of the FeatureValue of the redefined <em><code>target</code></em> parameter of the AssignmentActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Argument</em>' reference.
	 * @see #setTargetArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssignmentActionUsage_TargetArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='assignmentAction'"
	 * @generated
	 */
	Expression getTargetArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AssignmentActionUsage#getTargetArgument <em>Target Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Argument</em>' reference.
	 * @see #getTargetArgument()
	 * @generated
	 */
	void setTargetArgument(Expression value);

	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expression whose result is to be assigned to the <code>referent</code> Feature. Derived as the <code>value</code> of the FeatureValue of the redefined <em><code>replacementValues</code></em> parameter of the AssignmentActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Expression</em>' reference.
	 * @see #setValueExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssignmentActionUsage_ValueExpression()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='assigningAction'"
	 * @generated
	 */
	Expression getValueExpression();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AssignmentActionUsage#getValueExpression <em>Value Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Expression</em>' reference.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Referent</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature whose value is to be set, derived as an unowned <code>member</code> of the AssignmentActionUsage. It shall not be a FeatureChain. It is redefined by the <em><code>target::accessedFeature</code></em> of the AssignmentActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referent</em>' reference.
	 * @see #setReferent(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAssignmentActionUsage_Referent()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='assignment'"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getReferent();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AssignmentActionUsage#getReferent <em>Referent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referent</em>' reference.
	 * @see #getReferent()
	 * @generated
	 */
	void setReferent(Feature value);

} // AssignmentActionUsage
