/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.QueryPathStepExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Path Step Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QueryPathStepExpressionImpl extends OperatorExpressionImpl implements QueryPathStepExpression {
    private static final String DEFAULT_PATHSTEP_FUNCTION = "collect";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryPathStepExpressionImpl() {
		super();
	}

	@Override
	public String getOperator() {
		return DEFAULT_PATHSTEP_FUNCTION;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.QUERY_PATH_STEP_EXPRESSION;
	}

} //QueryPathStepExpressionImpl
