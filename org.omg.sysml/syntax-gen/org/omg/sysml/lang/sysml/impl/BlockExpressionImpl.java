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
import org.omg.sysml.lang.sysml.Type;

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
		return resultConnector = getResultConnectorFor(this, resultConnector, this.getResult());
	}

	public static BindingConnector getResultConnectorFor(
			Type owningType, BindingConnector resultConnector, Feature result) {
		EList<Feature> ownedFeatures = owningType.getOwnedFeature();
		for (int i = ownedFeatures.size() - 1; i >= 0; i--) {
			Feature ownedFeature = ownedFeatures.get(i);
			if (ownedFeature instanceof Expression && !ownedFeature.isAbstract()) {
				resultConnector = updateBindingConnectorFor(
						owningType, resultConnector, ((TypeImpl)ownedFeature).getResult(), result);
				break;
			}
		}
		return resultConnector;
	}
	
	public static BindingConnector updateBindingConnectorFor(
			Type owningType, BindingConnector connector, Feature source, Feature target) {
		if (connector == null) {
			connector = ((TypeImpl)owningType).addOwnedBindingConnector(source, target);
		} else {
			((ConnectorImpl) connector).setRelatedFeature(0, source);
			((ConnectorImpl) connector).setRelatedFeature(1, target);
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
