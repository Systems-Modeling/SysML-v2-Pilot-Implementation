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
import org.omg.sysml.lang.sysml.SysMLFactory;
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
				List<Feature> typeFeatures = (((TypeImpl)type).getPublicFeatures());
				for (Expression argument: getArgument()) {
					Feature typeFeature = getFeatureForArgument(typeFeatures, argument);
					if (typeFeature == null) {
						break;
					}
					Feature feature = createFeatureForParameter(typeFeature);
					Redefinition redefinition = SysMLFactory.eINSTANCE.createRedefinition();
					redefinition.setRedefinedFeature(typeFeature);
					redefinition.setRedefiningFeature(feature);
					feature.getOwnedRelationship_comp().add(redefinition);
				}
			}
		}
		return inputs;
	}
	
	protected static Feature getFeatureForArgument(List<Feature> typeFeatures, Feature argument) {
		Feature feature = null;
		if (!typeFeatures.isEmpty()) {
			String name = argument.getName();
			if (name == null) {
				feature = typeFeatures.get(0);
				typeFeatures.remove(0);
			} else {
				feature = typeFeatures.stream().filter(f->name.equals(f.getName())).findFirst().orElse(null);
				if (feature != null) {
					typeFeatures.remove(feature);
				}
			}
		}
		return feature;
	}

	public List<BindingConnector> getArgumentConnectors() {
		if (argumentConnectors == null) {
			argumentConnectors = new ArrayList<>();
			List<Feature> input = getOwnedInput();
			List<Expression> arguments = getArgument();
			for (int i = 0; i < input.size(); i++) {
				if (i < arguments.size()) {
					argumentConnectors.add(addOwnedBindingConnector(
							arguments.get(i).getResult(), input.get(i)));
				}		
			}
		}
		return argumentConnectors;
	}
	
	public List<BindingConnector> basicGetArgumentConnectors() {
		return argumentConnectors;
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
	protected Type getExpressionType() {
		EList<FeatureTyping> typing = getTyping();
		return typing.isEmpty()? null: typing.get(0).getType();
	}
	
	@Override
	public void transform() {
		super.transform();
		getArgumentConnectors();
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
