/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Invocation Expression</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An InocationExpression is an Expression each of whose input <code>parameters</code> are bound to the <code>result</code> of an owned <code>argument</code> Expression. Each input <code>parameter</code> may be bound to the <code>result</code> of at most one <code>argument</code>.</p> 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.InvocationExpression#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvocationExpression()
 * @model
 * @generated
 */
public interface InvocationExpression extends Expression {

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>An Expression owned by the InvocationExpression whose <code>result</code> is bound to an input <code>parameter</code> of the InvocationExpression.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getInvocationExpression_Argument()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='invocation'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Expression> getArgument();
} // InvocationExpression
