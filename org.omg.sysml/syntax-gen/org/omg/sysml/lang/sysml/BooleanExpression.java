/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An BooleanExpression is a Boolean-valued Expression whose type is a Predicate. It represents a logical condition resulting from the evaluation of the Predicate.</p>
 * 
 * <p>A BooleanExpression must subset, directly or indirectly, the Expression "booleanEvaluations" from the Base model library, which is typed by the base Predicate BooleanEvaluation. As a result, a BooleanExpression must always be typed by BooleanEvaluation or a subclass of BooleanEvaluation.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.BooleanExpression#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Expression#getFunction() <em>Function</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' reference.
	 * @see #setPredicate(Predicate)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getBooleanExpression_Predicate()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typedBooleanExpression'"
	 *        annotation="redefines"
	 * @generated
	 */
	Predicate getPredicate();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.BooleanExpression#getPredicate <em>Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(Predicate value);

} // BooleanExpression
