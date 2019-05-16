/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.BlockExpression;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BlockExpressionImpl extends ExpressionImpl implements BlockExpression {
	
	/**
	 * The cached value of the BindingConnector from the resultof the last sub-Expression
	 * to the result of this BindingExpression.
	 */
	protected BindingConnector resultConnector = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockExpressionImpl() {
		super();
	}
	
	// Additional redefinitions and subsets
	
	@Override
	public EList<Feature> getFeature() {
		getResultConnector();
		return super.getFeature();
	}
	
	public BindingConnector getResultConnector() {
		List<Expression> subexpressions = getSubexpressions();
		if (!subexpressions.isEmpty()) {
			Feature result = ((ExpressionImpl)subexpressions.get(subexpressions.size() - 1)).getResult();
			if (resultConnector == null) {
				resultConnector = addOwnedBindingConnector(result, getResult());
			} else {
				((ConnectorImpl)resultConnector).setRelatedFeature(0, result);
				((ConnectorImpl)resultConnector).setRelatedFeature(1, getResult());
			}
		}
		return resultConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BLOCK_EXPRESSION;
	}

} //BlockExpressionImpl
