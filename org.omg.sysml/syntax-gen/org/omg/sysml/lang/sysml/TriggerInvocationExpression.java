/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Invocation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>TriggerInvocationExpression</code> is an <code>InvocationExpression</code> that invokes one of the trigger <code>Functions</code> from the Kernel Semantic Library <code><em>Triggers<em></code> package, as indicated by its <code>kind</code>.</p>
 * specializesFromLibrary(
 *     if kind = TriggerKind::when then
 *         'Triggers::TriggerWhen'
 *     else if kind = TriggerKind::at then
 *         'Triggers::TriggerAt'
 *     else 
 *         'Triggers::TriggerAfter'
 *     endif endif
 * )
 * kind = TriggerKind::after implies
 *     argument->notEmpty() and
 *     argument->at(1).result.specializesFromLibrary('Quantities::ScalarQuantityValue') and
 *     let mRef : Element = 
 *         resolveGlobal('Quantities::TensorQuantityValue::mRef').ownedMemberElement in
 *     argument->at(1).result.feature->
 *         select(ownedRedefinition.redefinedFeature->
 *            closure(ownedRedefinition.redefinedFeature)->
 *            includes(mRef))->
 *         exists(specializesFromLibrary('ISQBase::DurationUnit'))
 * kind = TriggerKind::at implies
 *     argument->notEmpty() and
 *     argument->at(1).result.specializesFromLibrary('Time::TimeInstantValue')
 * kind = TriggerKind::when implies
 *     argument->notEmpty() and
 *     argument->at(1).oclIsKindOf(FeatureReferenceExpression) and
 *     let referent : Feature = 
 *         argument->at(1).oclAsType(FeatureReferenceExpression).referent in
 *     referent.oclIsKindOf(Expression) and
 *     referent.oclAsType(Expression).result.specializesFromLibrary('ScalarValues::Boolean')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TriggerInvocationExpression#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTriggerInvocationExpression()
 * @model
 * @generated
 */
public interface TriggerInvocationExpression extends InvocationExpression {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.lang.sysml.TriggerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates which of the <code>Functions</code> from the <code><em>Triggers</em></code> model in the Kernel Semantic Library is to be invoked by this <code>TriggerInvocationExpression</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.TriggerKind
	 * @see #setKind(TriggerKind)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTriggerInvocationExpression_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TriggerKind getKind();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TriggerInvocationExpression#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.omg.sysml.lang.sysml.TriggerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TriggerKind value);

} // TriggerInvocationExpression
