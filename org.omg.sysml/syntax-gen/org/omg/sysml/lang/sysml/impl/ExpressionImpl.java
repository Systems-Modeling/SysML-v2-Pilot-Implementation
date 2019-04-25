/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExpressionImpl extends StepImpl implements Expression {
	
	public static final String EXPRESSION_SUBSETTING_DEFAULT = "Base::functionEvaluations";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.EXPRESSION;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		EList<Subsetting> redefinitions = getComputedRedefinitions();
		return redefinitions.isEmpty()? getOwnedSubsettingWithDefault(EXPRESSION_SUBSETTING_DEFAULT): redefinitions;
	}
	
	/**
	 * If the given Category is a Function, then return the abstract expressions of that Behavior.
	 * If the given Category is an Expression, return the subexpressions not used as arguments.
	 */
	@Override
	protected List<? extends Feature> getRelevantFeatures(Category category) {
		return (category instanceof Function)? 
					((Function)category).getExpression().stream().
						filter(expr->expr.isAbstract()).collect(Collectors.toList()):
			   (category instanceof OperatorExpression)? 
					   ((ExpressionImpl)category).getSubexpressions():
				Collections.emptyList();
	}
	
	public Feature getResult() {
		EList<Feature> outputs = getOutput();
		return outputs.isEmpty()? null: outputs.get(outputs.size() - 1);
	}
	
	public Function getFunction() {
		EList<Category> types = getType();
		if (types.isEmpty()) {
			return null;
		} else {
			Category type = types.get(0);
			return type instanceof Function? (Function)type: null;
		}
	}

	public List<Expression> getSubexpressions() {
		return getOwnedFeature().stream().filter(f->f instanceof Expression).
				map(f->(Expression)f).collect(Collectors.toList());
	}
	
} //ExpressionImpl
