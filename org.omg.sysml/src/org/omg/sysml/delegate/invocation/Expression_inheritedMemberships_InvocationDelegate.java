/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.delegate.invocation;

import java.util.Collection;
import org.eclipse.emf.ecore.EOperation;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.TypeUtil;

public class Expression_inheritedMemberships_InvocationDelegate extends Type_inheritedMemberships_InvocationDelegate {

	public Expression_inheritedMemberships_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Collection<Feature> getFeaturesRedefinedByType(Type type) {
		Collection<Feature> features = super.getFeaturesRedefinedByType(type);
		
		// If inputs and outputs have not been computed, add effectively
		// redefined features from the Expression type, without actually
		// computing the inputs and outputs.
		Expression expr = (Expression)type;
		if (expr.getInput().isEmpty()) {
			features.addAll(ExpressionUtil.getTypeParametersOf(expr));
		}
		if (expr.getOutput().isEmpty()) {
			Type exprType = ExpressionUtil.getExpressionTypeOf(expr);
			if (exprType instanceof Function || exprType instanceof Expression) {
				Feature result = TypeUtil.getOwnedResultParameterOf(exprType);
				if (result != null) {
					features.add(result);
				}
			}
		}
		
		return features;
	}

}
