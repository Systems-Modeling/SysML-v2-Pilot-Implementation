/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.BlockExpression;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Block
 * Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class BlockExpressionImpl extends ExpressionImpl implements BlockExpression {

	/**
	 * The cached value of the BindingConnector from the result of the last
	 * sub-Expression to the result of this BlockExpression.
	 */
	protected BindingConnector resultConnector = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		return resultConnector = getResultConnectorFor(resultConnector, this);
	}

	public static BindingConnector getResultConnectorFor(BindingConnector resultConnector, ExpressionImpl expression) {
		EList<Feature> ownedFeatures = expression.getOwnedFeature();
		for (int i = ownedFeatures.size() - 1; i >= 0; i--) {
			Feature feature = ownedFeatures.get(i);
			if (feature instanceof Expression) {
				resultConnector = updateBindingConnector(resultConnector, (ExpressionImpl)feature, expression);
				break;
			}
		}
		return resultConnector;
	}
	
	public static BindingConnector updateBindingConnector(BindingConnector connector, ExpressionImpl source, ExpressionImpl target) {
		Feature result = source.getResult();
		if (connector == null) {
			connector = target.addOwnedBindingConnector(result, target.getResult());
		} else {
			((ConnectorImpl) connector).setRelatedFeature(0, result);
			((ConnectorImpl) connector).setRelatedFeature(1, target.getResult());
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BLOCK_EXPRESSION;
	}

} // BlockExpressionImpl
