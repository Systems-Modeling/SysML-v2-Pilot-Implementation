/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Case Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>AnalysisCaseDefinition</code> is a <code>CaseDefinition</code> for the case of carrying out an analysis.</p>
 * resultExpression =
 *     let results : OrderedSet(ResultExpressionMembership) =
 *         featureMembersip->
 *             selectByKind(ResultExpressionMembership) in
 *     if results->isEmpty() then null
 *     else results->first().ownedResultExpression
 *     endif
 * specializesFromLibrary('AnalysisCases::AnalysisCase')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.AnalysisCaseDefinition#getResultExpression <em>Result Expression</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseDefinition()
 * @model
 * @generated
 */
public interface AnalysisCaseDefinition extends CaseDefinition {
	/**
	 * Returns the value of the '<em><b>Result Expression</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Function#getExpression() <em>Expression</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An <code>Expression</code> used to compute the <code>result</code> of the <code>AnalysisCaseDefinition</code>, owned via a <code>ResultExpressionMembership</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Expression</em>' reference.
	 * @see #setResultExpression(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getAnalysisCaseDefinition_ResultExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='analysisCaseDefintion'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getResultExpression();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.AnalysisCaseDefinition#getResultExpression <em>Result Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Expression</em>' reference.
	 * @see #getResultExpression()
	 * @generated
	 */
	void setResultExpression(Expression value);

} // AnalysisCaseDefinition
