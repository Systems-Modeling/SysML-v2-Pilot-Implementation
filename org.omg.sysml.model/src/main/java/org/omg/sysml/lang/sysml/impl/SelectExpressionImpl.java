/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.SelectExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SelectExpressionImpl extends OperatorExpressionImpl implements SelectExpression {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private static final String SELECT_OPERATOR = "select";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected SelectExpressionImpl() {
		super();
		operator = OPERATOR_EDEFAULT = SELECT_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SELECT_EXPRESSION;
	}

} //SelectExpressionImpl
