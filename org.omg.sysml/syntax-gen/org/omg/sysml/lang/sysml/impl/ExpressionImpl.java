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
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
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
	
	@Override 
	public EList<Feature> getInput() {
		EList<Feature> inputs = super.getInput();
		if (!inputs.stream().anyMatch(feature->feature.getOwner() == this)) {
			Function function = getFunction();
			if (function != null) {
				int i = 0;
				for (Feature parameter: function.getInput()) {
					if (parameter instanceof Parameter && parameter.getOwner() == function) {
						inputs.remove(parameter);
						Feature input = createFeatureForParameter(parameter, i);
						inputs.add(input);
						i++;
					}
				}
			}
		}
		return inputs;
	}
	
	@Override
	public EList<Feature> getOutput() {
		EList<Feature> outputs = super.getOutput();
		if (!outputs.stream().anyMatch(feature->feature.getOwner() == this)) {
			Parameter parameter = SysMLFactory.eINSTANCE.createParameter();
			FeatureMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			membership.getOwnedRelatedElement().add(parameter);
			membership.setMemberName("$result");
			getOwnedRelationship().add(membership);
			outputs.add(parameter);
		}
		return outputs;
	}
			
	protected Feature createFeatureForParameter(Feature parameter, int i) {
		if (parameter == null) {
			return null;
		} else {
			Feature feature = SysMLFactory.eINSTANCE.createParameter();
			
			Redefinition redefinition = SysMLFactory.eINSTANCE.createRedefinition();
			redefinition.setRedefinedFeature(parameter);
			feature.getOwnedRelationship().add(redefinition);
			
			FeatureMembership membership = SysMLFactory.eINSTANCE.createParameterMembership();
			membership.getOwnedRelatedElement().add(feature);
			membership.setMemberName("$" + parameter.getName());
			getOwnedRelationship().add(membership);
			FeatureMembership parameterMembership = parameter.getOwningFeatureMembership();
			if (parameterMembership != null) {
				membership.setDirection(parameterMembership.getDirection());
			}
			
			return feature;
		}
	}
	
	@Override
	public Feature getResult() {
		List<Feature> outputs = getOutput().stream().
				filter(feature->feature.getOwner() == this).collect(Collectors.toList());;
		return outputs.isEmpty()? null: outputs.get(outputs.size() - 1);
	}
	
	@Override
	public List<Parameter> getOwnedParameters() {
		getResult();
		return super.getOwnedParameters();
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
