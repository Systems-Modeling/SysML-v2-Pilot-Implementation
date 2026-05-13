/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.delegate.invocation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.Metaclass;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class FeatureReferenceExpression_modelLevelEvaluable_InvocationDelegate extends Expression_modelLevelEvaluable_InvocationDelegate {

	public FeatureReferenceExpression_modelLevelEvaluable_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		FeatureReferenceExpression self = (FeatureReferenceExpression) target;
		@SuppressWarnings("unchecked")
		EList<Feature> visited = (EList<Feature>) arguments.get(0);

		Feature referent = self.getReferent();
		if (referent == null || TypeUtil.specializes(referent, ExpressionUtil.getSelfReferenceFeature(referent))) {
			return true;
		} else if (visited.contains(referent)) {
			return false;
		} else {
			visited.add(referent);
			boolean result;
			if (referent instanceof Expression && ((Expression) referent).modelLevelEvaluable(visited)) {
				result = true;
			} else {
				Type owningType = referent.getOwningType();
				if (owningType instanceof Metaclass || owningType instanceof MetadataFeature) {
					result =  true;
				} else if (!referent.getFeaturingType().isEmpty()) {
					result =  false;
				} else {
					Expression valueExpression = FeatureUtil.getValueExpressionFor(referent);
					result = valueExpression == null || valueExpression.modelLevelEvaluable(visited);
				}
			}
			visited.remove(referent);
			return result;
		}
	}

}
