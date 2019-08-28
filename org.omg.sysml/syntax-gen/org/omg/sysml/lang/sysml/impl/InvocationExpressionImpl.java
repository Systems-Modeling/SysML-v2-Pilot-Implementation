/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Invocation Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class InvocationExpressionImpl extends ExpressionImpl implements InvocationExpression {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InvocationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INVOCATION_EXPRESSION;
	}

	@Override
	protected Feature createFeatureForParameter(Feature parameter, int i) {
		Feature input = super.createFeatureForParameter(parameter, i);
		List<? extends Feature> arguments = getArguments();
		if (i < arguments.size()) {
			Feature argument = arguments.get(i);
			addOwnedBindingConnector(
					argument instanceof Expression ? ((ExpressionImpl) arguments.get(i)).getResult() : argument, input);
		}
		return input;
	}

	public List<? extends Feature> getArguments() {
		return super.getOwnedFeature();
	}

	@Override
	public List<Feature> getRelevantFeatures() {
		Function function = getFunction();
		int m = function == null ? 0 : function.getInput().size();
		List<Feature> features = super.getOwnedFeature();
		int n = features.size();
		return m >= n ? Collections.emptyList() : features.subList(m, n);
	}

} // InvocationExpressionImpl
