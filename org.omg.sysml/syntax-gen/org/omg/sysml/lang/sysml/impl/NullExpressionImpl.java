/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Null
 * Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class NullExpressionImpl extends ExpressionImpl implements NullExpression {

	public static final String NULL_EXPRESSION_SUBSETTING_DEFAULT = "Performances::nullEvaluations";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected NullExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.NULL_EXPRESSION;
	}

	@Override
	protected String getDefaultSupertype() {
		return NULL_EXPRESSION_SUBSETTING_DEFAULT;
	}

} // NullExpressionImpl
