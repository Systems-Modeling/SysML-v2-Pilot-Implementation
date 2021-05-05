/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.PathSelectExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Select Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PathSelectExpressionImpl extends OperatorExpressionImpl implements PathSelectExpression {

	private static final String PATH_SELECT_FUNCTION = "select";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathSelectExpressionImpl() {
		super();
	}

	@Override
	public String getOperator() {
		return PATH_SELECT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PATH_SELECT_EXPRESSION;
	}

} //PathSelectExpressionImpl
