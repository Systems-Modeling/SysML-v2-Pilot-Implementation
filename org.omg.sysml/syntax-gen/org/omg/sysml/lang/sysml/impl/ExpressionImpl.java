/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Function;
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
	
	public static final String EXPRESSION_SUBSETTING_DEFAULT = "Base::evaluation";
	
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
		return getOwnedSubsettingWithDefault(EXPRESSION_SUBSETTING_DEFAULT);
	}
	
	@Override 
	public EList<Feature> getInput() {
		EList<Feature> inputs = super.getInput();
		if (inputs.isEmpty()) {
			Function function = getFunction();
			if (function != null) {
				inputs.addAll(function.getInput().stream().filter(f->f instanceof Parameter).
						map(f->createFeatureForParameter((Parameter)f)).collect(Collectors.toList()));
				List<Feature> arguments = getArguments();
				int i = 0;
				int n = arguments.size();
				for (Feature input: inputs) {
					if (i >= n) {
						break;
					}
					Feature argument = arguments.get(i);
					addOwnedBindingConnector(
							argument instanceof Expression? 
									((ExpressionImpl)arguments.get(i)).getResult(): 
									argument, 
							input);
					i++;
				}
			}
		}
		return inputs;
	}
	
	@Override
	public EList<Feature> getOutput() {
		EList<Feature> outputs = super.getOutput();
		if (outputs.isEmpty()) {
			Function function = getFunction();
			if (function != null) {
				outputs.add(createFeatureForParameter(function.getResult()));
			}
		}
		return outputs;
	}
	
	public List<Feature> getArguments() {
		return getOwnedFeature().stream().filter(f->f instanceof Expression).
				map(f->(Expression)f).collect(Collectors.toList());
	}
	
	public Feature getResult() {
		EList<Feature> outputs = getOutput();
		return outputs.isEmpty()? null: outputs.get(outputs.size() - 1);
	}
	
	protected Feature createFeatureForParameter(Parameter parameter) {
		if (parameter == null) {
			return null;
		} else {
			Feature feature = SysMLFactory.eINSTANCE.createFeature();
			feature.setName(parameter.getName());
			
			Redefinition redefinition = SysMLFactory.eINSTANCE.createRedefinition();
			redefinition.setRedefinedFeature(parameter);
			feature.getOwnedRelationship().add(redefinition);
			
			FeatureMembership membership = addOwnedFeature(feature);
			FeatureMembership parameterMembership = parameter.getOwningFeatureMembership();
			if (parameterMembership != null) {
				membership.setDirection(parameterMembership.getDirection());
			}
			
			return feature;
		}
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

} //ExpressionImpl
