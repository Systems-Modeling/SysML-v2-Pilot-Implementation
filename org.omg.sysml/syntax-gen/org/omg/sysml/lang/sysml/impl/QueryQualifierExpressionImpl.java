/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.QueryQualifierExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Qualifier Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QueryQualifierExpressionImpl extends OperatorExpressionImpl implements QueryQualifierExpression {
    private static final String DEFAULT_QUALIFIER_FUNCTION = "select";
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryQualifierExpressionImpl() {
		super();
	}

	@Override
	public String getOperator() {
		return DEFAULT_QUALIFIER_FUNCTION;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.QUERY_QUALIFIER_EXPRESSION;
	}

	@Override
    public String getName() {
        // TODO: Mainly for Outline
        return super.getName();
    }

} //QueryQualifierExpressionImpl
