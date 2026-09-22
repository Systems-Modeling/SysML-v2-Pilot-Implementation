/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * Copyright (c) 2021-2022, 2024-2025 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.MultiplicityRange;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.util.FeatureUtil;

public class ExpressionAdapter extends StepAdapter {

	public static final String EXPRESSION_GUARD_FEATURE = "TransitionPerformances::TransitionPerformance::guard";

	public ExpressionAdapter(Expression element) {
		super(element);
	}
	
	@Override
	public Expression getTarget() {
		return (Expression)super.getTarget();
	}
	
	// Transformation

	/**
	 * @satisfies checkExpressionTypeFeaturing
	 * @satisfies checkMultiplicityRangeExpressionTypeFeaturing
	 */
	@Override
	protected void addImplicitFeaturingTypesIfNecessary() {
		Expression expression = getTarget();
		Namespace owner = expression.getOwningNamespace();
		if (owner instanceof MultiplicityRange multiplicity &&
			multiplicity.getBound().contains(expression)) {
			owner = multiplicity.getOwningNamespace();
			if (owner instanceof Feature ownerFeature) {
				if (FeatureUtil.isOwnedCrossFeature(ownerFeature) && 
					isImplicitFeaturingTypesEmpty()) {
					Feature owningEnd = (Feature) ownerFeature.getOwningNamespace();
					addFeaturingTypes(owningEnd.getFeaturingType());
				} else {
					super.addImplicitFeaturingTypesIfNecessary();
				}
			}
		} else if (expression.getOwningMembership() instanceof FeatureValue) {
			super.addImplicitFeaturingTypesIfNecessary();
		}
	}
	
	/**
	 * @satisfies checkExpressionResultBindingConnector
	 */
	@Override
	public void doTransform() {
		Expression expression = getTarget();
		super.doTransform();
		addImplicitFeaturingTypesIfNecessary();
		createResultConnector(expression.getResult());
	}
		
}
