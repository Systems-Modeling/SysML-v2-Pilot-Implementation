/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A WhileLoopActionUsage is a LoopActionUsage that is typed, directly or indirectly, by the ActionDefinition <em>WhileLoopAction</em> from the Systems model library. It specifies that the <code>bodyClause</code> ActionUsage should be performed repeatedly while the result of the <code>whileArgument</code> Expression is true or until the result of the <code>untilArgument</code> Expression (if provided) is true. The <code>whileArgument</code> Expression is evaluated before each (possible) performance of the <code>bodyClause</code>, and the <code>untilArgument</code> Expression is evaluated after each performance of the <code>bodyClause</code>.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.WhileLoopActionUsage#getWhileArgument <em>While Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.WhileLoopActionUsage#getUntilArgument <em>Until Argument</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getWhileLoopActionUsage()
 * @model
 * @generated
 */
public interface WhileLoopActionUsage extends LoopActionUsage {
	/**
	 * Returns the value of the '<em><b>While Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expression whose result, if true, determines that the <code>bodyAction</code> should continue to be performed. Derived as the owned Expression that redefines the <em><code>whileTest</code></em> parameter of the WhileLoopActionUsage.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>While Argument</em>' reference.
	 * @see #setWhileArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getWhileLoopActionUsage_WhileArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='whileLoopAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getWhileArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.WhileLoopActionUsage#getWhileArgument <em>While Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>While Argument</em>' reference.
	 * @see #getWhileArgument()
	 * @generated
	 */
	void setWhileArgument(Expression value);

	/**
	 * Returns the value of the '<em><b>Until Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expression whose result, if false, determines that the <code>bodyAction</code> should continue to be performed. Derived as the owned Expression that redefines the <em><code>untilTest</code><em> </em></em>parameter of the WhileLoopActionUsage.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Until Argument</em>' reference.
	 * @see #setUntilArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getWhileLoopActionUsage_UntilArgument()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='untilLoopAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getUntilArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.WhileLoopActionUsage#getUntilArgument <em>Until Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Argument</em>' reference.
	 * @see #getUntilArgument()
	 * @generated
	 */
	void setUntilArgument(Expression value);

} // WhileLoopActionUsage
