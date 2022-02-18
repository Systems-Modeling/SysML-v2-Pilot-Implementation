/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.CollectExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collect Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CollectExpressionImpl extends OperatorExpressionImpl implements CollectExpression {

	private static final String COLLECT_FUNCTION = "collect";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.COLLECT_EXPRESSION;
	}

	@Override
	public String getOperator() {
		return COLLECT_FUNCTION;
	}

} //CollectExpressionImpl
