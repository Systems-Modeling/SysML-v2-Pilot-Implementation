/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Invocation Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InvocationExpressionImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocationExpressionImpl extends ExpressionImpl implements InvocationExpression {
	
	protected List<BindingConnector> argumentConnectors;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INVOCATION_EXPRESSION;
	}
	
	@Override
	public Function getFunction() {
		Type type = getExpressionType();
		return type instanceof Function? (Function)type:
			   type instanceof Expression? ((Expression)type).getFunction():
			   (Function)getDefaultType(FunctionImpl.FUNCTION_SUPERCLASS_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getArgument() {
		return new DerivedEObjectEList<Expression>(Expression.class, this, SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT, new int[] {SysMLPackage.INVOCATION_EXPRESSION__OWNED_FEATURE});
	}
	
	@Override
	public EList<Feature> getInput() {
		EList<Feature> inputs = super.getOwnedInput();
		if (inputs.isEmpty()) {
			Type type = getExpressionType();
			if (type instanceof Function || type instanceof Expression) {
				return super.getInput();
			} else if (type != null) {
				for (Feature typeFeature: getTypeFeatures()) {
					inputs.add(createFeatureForParameter(typeFeature));
				}
			}
		}
		return inputs;
	}
	
	public List<Feature> getTypeFeatures() {
		Type type = getExpressionType();
		List<Feature> typeFeatures = new ArrayList<>();
		List<Expression> arguments = getArgument();
		int i = 0;
		for (Feature typeFeature: (((TypeImpl)type).getPublicFeatures())) {
			if (i >= arguments.size()) {
				break;
			}
			Expression argument = getArgumentForFeature(arguments, typeFeature, i);
			if (argument != null) {
				typeFeatures.add(typeFeature);
			}
			i++;
		}
		return typeFeatures;
	}
	
	public List<BindingConnector> getArgumentConnectors() {
		return argumentConnectors;
	}
	
	public List<BindingConnector> basicGetArgumentConnectors() {
		return argumentConnectors;
	}
	
	protected static Expression getArgumentForFeature(List<Expression> arguments, Feature feature, int index) {
		Expression argument = null;
		if (!arguments.isEmpty()) {
			argument = arguments.get(0);
			String argumentName = argument.getName();
			String featureName = feature.getName();
			if (argumentName == null || featureName == null) {
				if (index < arguments.size()) {
					argument = arguments.get(index);
				}
			} else {
				argument = arguments.stream().filter(a->featureName.equals(a.getName())).findFirst().orElse(null);
			}
		}
		return argument;
	}

	@Override
	public List<Feature> getRelevantFeatures() {
		Type type = getExpressionType();
		int m = type == null ? 0 : 
			(int)((TypeImpl)type).getAllParameters().stream().
				filter(p->((FeatureImpl)p).isInput()).count();
		List<Feature> features = super.getOwnedFeature();
		int n = features.size();
		return m >= n ? Collections.emptyList() : features.subList(m, n);
	}
	
	@Override
	public Type getExpressionType() {
		EList<FeatureTyping> typing = getTyping();
		return typing.isEmpty()? null: typing.get(0).getType();
	}
	
	@Override
	public void transform() {
		super.transform();
		
		// Calculate binding connectors
		if (argumentConnectors == null) {
			argumentConnectors = new ArrayList<>();
			List<Expression> arguments = getArgument();
			int i = 0;
			for (Feature input: getInput()) {
				List<Redefinition> redefinitions = input.getOwnedRedefinition();
				if (!redefinitions.isEmpty()) {
					Feature feature = redefinitions.get(0).getRedefinedFeature();
					if (feature != null) {
						Expression argument = getArgumentForFeature(arguments, feature, i);
						if (argument != null) {
							argumentConnectors.add(addOwnedBindingConnector(argument.getResult(), input));
						}
					}
				}
				i++;
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				return getArgument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Expression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				getArgument().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.INVOCATION_EXPRESSION__ARGUMENT:
				return !getArgument().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public List<? extends Feature> getArguments() {
		return super.getOwnedFeature();
	}

} // InvocationExpressionImpl
