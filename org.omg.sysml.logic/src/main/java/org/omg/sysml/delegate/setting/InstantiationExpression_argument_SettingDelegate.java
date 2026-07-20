/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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

package org.omg.sysml.delegate.setting;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.InstantiationExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;

public class InstantiationExpression_argument_SettingDelegate extends BasicDerivedListSettingDelegate {

	public InstantiationExpression_argument_SettingDelegate(EStructuralFeature eStructuralFeature) {
		super(eStructuralFeature);
	}

	@Override
	protected EList<?> basicGet(InternalEObject owner) {
		EList<Expression> arguments = new NonNotifyingEObjectEList<Expression>(Expression.class, owner, eStructuralFeature.getFeatureID(), false);
		InstantiationExpression self = (InstantiationExpression)owner;
		Type instantiatedType = self.instantiatedType();
		if (instantiatedType != null) {
			if (owner instanceof InvocationExpression) {
				addArguments(arguments, instantiatedType.getInput(), self.getOwnedFeature());
			} else if (owner instanceof ConstructorExpression) {
				Feature result = TypeUtil.getOwnedResultParameterOf(self);
				if (result != null) {
					addArguments(arguments, instantiatedType.getFeature(), result.getOwnedFeature());
				}
			}
		}
		return arguments;
	}
	
	protected void addArguments(List<Expression> arguments, List<Feature> instantiatedTypeFeatures, List<Feature> argumentFeatures) {
		instantiatedTypeFeatures.stream().
			flatMap(f->argumentFeatures.stream().filter(rf->rf.redefines(f))).
			map(FeatureUtil::getValueExpressionFor).
			filter(e->e != null).
			forEachOrdered(arguments::add);		
	}

}
