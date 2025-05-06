/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An <code>InstantiationExpression</code> is an <code>Expression</code> that instantiates its <code>instantiatedType</code>, binding some or all of the <code>features</code> of that <code>Type</code> to the <code>results</code> of its <code>arguments</code>.</p>
 * 
 * <p><code>InstantiationExpression</code> is abstract, with concrete subclasses <code>InvocationExpression</code> and <code>ConstructorExpression</code>.</p>
 * result.owningType = self
 * instantiatedType = instantiatedType()
 * instantiatedType() <> null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.InstantiationExpression#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.InstantiationExpression#getInstantiatedType <em>Instantiated Type</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstantiationExpression()
 * @model abstract="true"
 * @generated
 */
public interface InstantiationExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Expressions</code> whose <code>results</code> are bound to <code>features</code> of the <code>instantiatedType</code>. The <code>arguments</code> are ordered consistent with the order of the <code>features</code>, though they may not be one-to-one with all the <code>features</code>.</p>
	 * 
	 * <p><strong>Note.</strong> The derivation of <code>argument</code> is given in the concrete subclasses of <code>InstantiationExpression</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstantiationExpression_Argument()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='instantiation'"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	EList<Expression> getArgument();

	/**
	 * Returns the value of the '<em><b>Instantiated Type</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>Type</code> that is being instantiated.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantiated Type</em>' reference.
	 * @see #setInstantiatedType(Type)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInstantiationExpression_InstantiatedType()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='instantiationExpression'"
	 *        annotation="subsets"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type getInstantiatedType();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.InstantiationExpression#getInstantiatedType <em>Instantiated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Type</em>' reference.
	 * @see #getInstantiatedType()
	 * @generated
	 */
	void setInstantiatedType(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return the <code>Type</code> to act as the <code>instantiatedType</code> for this <code>InstantiationExpression</code>. By default, this is the <code>memberElement</code> of the first <code>ownedMembership</code> that is not a <code>FeatureMembership</code>, which must be a <code>Type</code>.</p>
	 * 
	 * <p><b>Note.</b> This operation is overridden in the subclass <code>OperatorExpression</code>.</p>
	 * let members : Sequence(Type) = ownedMembership->
	 *     reject(oclIsKindOf(FeatureMembership)).memberElement in
	 * if members->isEmpty() or not members->first().oclIsKindOf(Type) then null
	 * else typeMembers->first().oclAsType(Type)
	 * endif
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	Type instantiatedType();

} // InstantiationExpression
