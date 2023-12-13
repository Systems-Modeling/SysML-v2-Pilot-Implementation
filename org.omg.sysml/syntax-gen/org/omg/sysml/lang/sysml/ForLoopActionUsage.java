/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ForLoopActionUsage</code> is a <code>LoopActionUsage</code> that specifies that its <code>bodyAction</code> <code>ActionUsage</code> should be performed once for each value, in order, from the sequence of values obtained as the result of the <code>seqArgument</code> <code>Expression</code>, with the <code>loopVariable</code> set to the value for each iteration.</p>
 * seqArgument = argument(1)
 * 
 * isSubactionUsage() implies
 *     specializesFromLibrary('Actions::Action::forLoops')
 * loopVariable <> null and
 * loopVariable.redefinesFromLibrary('Actions::ForLoopAction::var')
 * specializesFromLibrary('Actions::forLoopActions')
 * loopVariable =
 *     if ownedFeature->isEmpty() or 
 *         not ownedFeature->first().oclIsKindOf(ReferenceUsage) then 
 *         null
 *     else 
 *         ownedFeature->first().oclAsType(ReferenceUsage)
 *     endif
 * ownedFeature->notEmpty() and
 * ownedFeature->at(1).oclIsKindOf(ReferenceUsage)
 * 
 * inputParameters()->size() = 2
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
	 * <p>The <code>Expression</code> whose result provides the sequence of values to which the <code>loopVariable</code> is set for each iterative performance of the <code>bodyAction</code>. It is the <code>Expression</code> whose <code>result</code> is bound to the <em><code>seq</code></em> <code>input</code> <code>parameter</code> of this <code>ForLoopActionUsage</code>.</p>
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
	 * <p>The <code>ownedFeature</code> of this <co>ForLoopActionUsage</code> that acts as the loop variable, which is assigned the successive values of the input sequence on each iteration. It is the <code>ownedFeature</code> that redefines <em><code>ForLoopAction::var</code></em>.</p> 
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
