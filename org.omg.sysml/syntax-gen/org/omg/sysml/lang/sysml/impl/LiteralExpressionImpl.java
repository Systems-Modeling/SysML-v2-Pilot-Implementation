/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LiteralExpressionImpl extends ExpressionImpl implements LiteralExpression {
	
	public static final String LITERAL_EXPRESSION_SUBSETTING_DEFAULT = "Base::literalEvaluations";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralExpressionImpl() {
		super();
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		EList<Subsetting> subsettings = getOwnedSubsettingWithDefault(LITERAL_EXPRESSION_SUBSETTING_DEFAULT);
		getComputedRedefinitions();
		return subsettings;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.LITERAL_EXPRESSION;
	}

} //LiteralExpressionImpl
