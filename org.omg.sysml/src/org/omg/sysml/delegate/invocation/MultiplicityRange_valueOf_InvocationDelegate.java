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
