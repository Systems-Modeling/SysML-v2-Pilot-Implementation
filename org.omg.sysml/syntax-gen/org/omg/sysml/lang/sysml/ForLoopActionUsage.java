/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ForLoopActionUsage is a LoopActionUsage that is typed, directly or indirectly, by the ActionDefinition <em>ForLoopAction</em> from the Systems model library. It specifies that the <code>bodyClause</code> ActionUsage should be performed once for each value, in order, from the sequence of values obtained as the result of the <code>seqArgument</code> Expression. The <code>bodyAction</code> must have one input parameter, which receives a value from the sequence on each iteration.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ForLoopActionUsage#getSeqArgument <em>Seq Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ForLoopActionUsage#getLoopVariable <em>Loop Variable</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getForLoopActionUsage()
 * @model
 * @generated
 */
public interface ForLoopActionUsage extends LoopActionUsage {
	/**
	 * Returns the value of the '<em><b>Seq Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expression whose result provides the sequence of values to be passed to each <code>bodyAction</code> performance. Derived as the <code>value</code> Expression of the FeatureValue for the redefined <em><code>seq</code><em> </em></em>parameter of the ForLoopActionUsage.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seq Argument</em>' reference.
	 * @see #setSeqArgument(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getForLoopActionUsage_SeqArgument()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='forLoopAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Expression getSeqArgument();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ForLoopActionUsage#getSeqArgument <em>Seq Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Argument</em>' reference.
	 * @see #getSeqArgument()
	 * @generated
	 */
	void setSeqArgument(Expression value);

	/**
	 * Returns the value of the '<em><b>Loop Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>feature</code> of this ForLoopActionUsage that acts as the loop variable, which is assigned the successive elements of the input sequence on each iteration. Derived as the <code>feature</code> that subsets the library ReferenceUsage <em><code>ForLoopAction::var</code></em>.</p> 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Variable</em>' reference.
	 * @see #setLoopVariable(ReferenceUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getForLoopActionUsage_LoopVariable()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='forLoopAction'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ReferenceUsage getLoopVariable();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ForLoopActionUsage#getLoopVariable <em>Loop Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Variable</em>' reference.
	 * @see #getLoopVariable()
	 * @generated
	 */
	void setLoopVariable(ReferenceUsage value);

} // ForLoopActionUsage
