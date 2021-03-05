/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
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
import org.omg.sysml.adapter.TypeAdapter;
import org.omg.sysml.expressions.ModelLevelFunction;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
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
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationExpressionImpl() {
		super();
	}

	@Override
	public boolean isModelLevelEvaluable() {
		return functionIsModelLevelEvaluable() && argumentsAreModelLevelEvaluable();
	}
	
	public boolean functionIsModelLevelEvaluable() {
		return getFunctionImpl() != null;
	}
	
	public boolean argumentsAreModelLevelEvaluable() {
		for (Expression argument: getArgument()) {
			if (!argument.isModelLevelEvaluable()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public EList<Element> evaluate(Element target) {
		ModelLevelFunction function = getFunctionImpl();
		return function == null? null: function.invoke(this, target);
	}
	
	protected ModelLevelFunction getFunctionImpl() {
		return ModelLevelFunction.getFunctionImpl(getFunction());
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
	
	// Other
	
	@Override
	public List<Feature> getTypeParameters() {
		Type type = getExpressionType();
		return type != null && !(type instanceof Function || type instanceof Expression)? 
				getTypeFeatures(): 
				super.getTypeParameters();
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
				i++;
			}
		}
		return typeFeatures;
	}
	
	public static Expression getArgumentForFeature(List<Expression> arguments, Feature feature, int index) {
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
		List<FeatureTyping> typing = basicGetOwnedTyping();
		return typing.isEmpty()? TypeAdapter.getOrCreateAdapter(this).getFirstImplicitGeneralType(SysMLPackage.Literals.FEATURE_TYPING) : typing.get(0).getType();
	}
	
	//
	
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
