/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

package org.omg.sysml.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class InvocationExpressionAdapter extends ExpressionAdapter {

	public InvocationExpressionAdapter(InvocationExpression element) {
		super(element);
	}
	
	@Override
	public InvocationExpression getTarget() {
		return (InvocationExpression)super.getTarget();
	}
	
	// Utility

	@Override
	public Type getExpressionType() {
		return getTarget().getOwnedTyping().stream().
				map(FeatureTyping::getType).findFirst().
				orElseGet(()->getFirstImplicitGeneralType(SysMLPackage.Literals.FEATURE_TYPING));
	}
	
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
		List<Expression> arguments = getTarget().getArgument();
		int i = 0;
		for (Feature typeFeature: TypeUtil.getPublicFeaturesOf(type)) {
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
			String featureName = ((FeatureImpl)feature).getEffectiveName();
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
	
	// Computed Redefinition

	@Override
	public List<Feature> getRelevantFeatures() {
		Expression target = getTarget();
		Type type = getExpressionType();
		int m = type == null ? 0 : 
			(int)TypeUtil.getAllParametersOf(target).stream().
				filter(FeatureUtil::isInputParameter).count();
		List<Feature> features = target.getOwnedFeature();
		int n = features.size();
		return m >= n ? Collections.emptyList() : features.subList(m, n);
	}
	
	// Transformation
	
	@Override
	protected void computeInput() {
		InvocationExpression expression = getTarget();
		if (expression.getInput().isEmpty()) {
			Type type = getExpressionType();
			if (type instanceof Function || type instanceof Expression) {
				super.computeInput();
			} else if (type != null) {
				for (Feature typeFeature: getTypeFeatures()) {
					createFeatureForParameter(typeFeature);
				}
			}
		}
	}
	
	public static Expression getArgumentForInput(List<Expression> arguments, Feature input, int argIndex) {
		FeatureUtil.forceComputeRedefinitionsFor(input);
		List<Feature> redefinedFeatures = FeatureUtil.getRedefinedFeaturesOf(input);
		if (!redefinedFeatures.isEmpty()) {
			Feature feature = redefinedFeatures.get(0);
			if (feature != null) {
				return getArgumentForFeature(arguments, feature, argIndex);
			}
		}
		return null;
	}
	
	public void computeArgumentConnectors() {
		InvocationExpression expression = getTarget();
		List<Expression> arguments = expression.getArgument();
		BindingConnector[] argumentConnectors = new BindingConnector[arguments.size()];
		int i = 0;
		for (Feature input: expression.getInput()) {
			if (i >= argumentConnectors.length) {
				break;
			}
			Expression argument = getArgumentForInput(arguments, input, i);
			if (argument != null) {
				argumentConnectors[i] = addResultBinding(argument, input);
				i++;
			}
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		computeArgumentConnectors();
	}
	
}
