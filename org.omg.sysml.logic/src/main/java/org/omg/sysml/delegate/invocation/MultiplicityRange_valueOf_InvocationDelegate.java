/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.LiteralInfinity;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.MultiplicityRange;

public class MultiplicityRange_valueOf_InvocationDelegate extends BasicInvocationDelegate {

	public MultiplicityRange_valueOf_InvocationDelegate(EOperation operation) {
		super(operation);
	}
	
	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {
		MultiplicityRange self = (MultiplicityRange) target;
		Expression bound = (Expression) arguments.get(0);
		
		if (bound != null && bound.isModelLevelEvaluable()) {
			EList<Element> boundEval = bound.evaluate(self.getOwningNamespace());
			if (boundEval.size() == 1) {
				Element valueEval = boundEval.get(0);
				if (valueEval instanceof LiteralInfinity) {
					// Return -1 to represent "*".
					return -1;
				} else if (valueEval instanceof LiteralInteger) {
					int value = ((LiteralInteger)valueEval).getValue();
					if (value >= 0) {
						return value;
					}
				}
			}
		}
		// Return -2 to represent a "null" result.
		return -2;
	}

}
