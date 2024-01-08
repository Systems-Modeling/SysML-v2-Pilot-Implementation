/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2024 Model Driven Solutions, Inc.
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
import java.util.List;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

import com.google.common.base.Predicates;

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
		Type type = getTarget().getOwnedTyping().stream().
				map(FeatureTyping::getType).filter(Predicates.notNull()).findFirst().
				orElseGet(()->getFirstImplicitGeneralType(SysMLPackage.Literals.FEATURE_TYPING));
		return type instanceof Feature? FeatureUtil.getBasicFeatureOf((Feature)type): type;
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
		List<Feature> inputs = getTarget().getInput();
		int i = 0;
		for (Feature typeFeature: TypeUtil.getPublicFeaturesOf(type)) {
			if (i >= inputs.size()) {
				break;
			}
			Feature input = getInputForFeature(inputs, typeFeature, i);
			if (input != null) {
				typeFeatures.add(typeFeature);
				i++;
			}
		}
		return typeFeatures;
	}
	
	public static Feature getInputForFeature(List<Feature> inputs, Feature feature, int index) {
		Feature input = null;
		if (!inputs.isEmpty() && feature != null) {
			input = inputs.get(0);
			String argumentName = input.getDeclaredName();
			String featureName = feature.getName();
			if (argumentName == null || featureName == null) {
				if (index < inputs.size()) {
					input = inputs.get(index);
				}
			} else {
				input = inputs.stream().filter(a->featureName.equals(a.getDeclaredName())).findFirst().orElse(null);
			}
		}
		return input;
	}
	
	// Transformation
		
	protected void addResultTyping() {
		Type expressionType = getExpressionType();
		if (expressionType != null && 
				!(expressionType instanceof Function || expressionType instanceof Expression)) {
			Feature result = TypeUtil.getResultParameterOf(getTarget());
			if (result != null) {
				if (expressionType instanceof Feature) {
					TypeUtil.addImplicitGeneralTypeTo(result, SysMLPackage.eINSTANCE.getSubsetting(), expressionType);
				} else {
					TypeUtil.addImplicitGeneralTypeTo(result, SysMLPackage.eINSTANCE.getFeatureTyping(), expressionType);
				}
			}
		}
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		addResultTyping();
	}
	
}
