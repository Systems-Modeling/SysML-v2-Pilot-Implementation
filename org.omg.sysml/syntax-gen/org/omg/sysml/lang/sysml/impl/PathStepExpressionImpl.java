/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.PathStepExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Step Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PathStepExpressionImpl extends OperatorExpressionImpl implements PathStepExpression {
	
	private static final String PATH_STEP_FUNCTION = "collect";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathStepExpressionImpl() {
		super();
	}

	@Override
	public String getOperator() {
		return PATH_STEP_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PATH_STEP_EXPRESSION;
	}

} //PathStepExpressionImpl
