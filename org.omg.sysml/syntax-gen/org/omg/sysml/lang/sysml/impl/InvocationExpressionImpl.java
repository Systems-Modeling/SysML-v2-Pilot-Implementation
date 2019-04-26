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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InvocationExpressionImpl extends ExpressionImpl implements InvocationExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
					argument instanceof Expression? 
							((ExpressionImpl)arguments.get(i)).getResult(): 
							argument, 
					input);							
		}
		return input;
	}
	
	public List<? extends Feature> getArguments() {
		return super.getSubexpressions();
	}
	
	@Override
	public List<Expression> getSubexpressions() {
		Function function = getFunction();
		int m = function == null? 0: function.getInput().size();
		List<Expression> subexpressions = super.getSubexpressions();
		int n = subexpressions.size();
		return m >= n? Collections.emptyList(): subexpressions.subList(m, n);
	}
	
} //InvocationExpressionImpl
