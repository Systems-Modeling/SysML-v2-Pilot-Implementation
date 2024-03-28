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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.util.ExpressionUtil;

public class InvocationExpression_modelLevelEvaluable_InvocationDelegate extends Expression_modelLevelEvaluable_InvocationDelegate {

	public InvocationExpression_modelLevelEvaluable_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		InvocationExpression self = (InvocationExpression) target;
		@SuppressWarnings("unchecked")
		EList<Feature> visited = (EList<Feature>) arguments.get(0);

		return functionIsModelLevelEvaluable(self) && argumentsAreModelLevelEvaluable(self, visited);
	}

	protected static boolean functionIsModelLevelEvaluable(InvocationExpression self) {
		Type type = ExpressionUtil.getExpressionTypeOf(self);
		return type instanceof Function? 
				((Function)type).isModelLevelEvaluable(): 
				!(type instanceof Expression);
	}
	
	public static boolean argumentsAreModelLevelEvaluable(InvocationExpression self, EList<Feature> visited) {
		for (Expression argument: self.getArgument()) {
			if (!argument.modelLevelEvaluable(visited)) {
				return false;
			}
		}
		return true;
	}
	
}
