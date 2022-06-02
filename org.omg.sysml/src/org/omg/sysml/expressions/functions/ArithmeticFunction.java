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

package org.omg.sysml.expressions.functions;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;

public abstract class ArithmeticFunction extends LibraryFunction {
	
	protected EList<Element> unaryIntegerOp(int x) {
		return null;
	}
	
	protected EList<Element> unaryRealOp(double x) {
		return null;
	}

	protected EList<Element> binaryIntegerOp(int x, int y) {
		return null;
	}
	
	protected EList<Element> binaryRealOp(double x, double y) {
		return null;
	}

	protected EList<Element> binaryStringOp(String x, String y) {
		return null;
	}
	
	@Override
	public String getPackageName() {
		return "DataFunctions";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target) {
		Integer x_int = integerValue(invocation, 0, target);
		Integer y_int = integerValue(invocation, 1, target);
		Double x_real = realValue(invocation, 0, target);
		Double y_real = realValue(invocation, 1, target);
		String x_string = stringValue(invocation, 0, target);
		String y_string = stringValue(invocation, 1, target);
		return numberOfArgs(invocation) == 1?
					x_int != null? unaryIntegerOp(x_int):
					x_real != null? unaryRealOp(x_real):
					nullList():
			   x_int != null && y_int != null? binaryIntegerOp(x_int, y_int):
			   x_real != null && y_int != null? binaryRealOp(x_real, y_int):
			   x_int != null && y_real != null? binaryRealOp(x_int, y_real):
			   x_real != null && y_real != null? binaryRealOp(x_real, y_real):
			   x_string != null && y_string != null? binaryStringOp(x_string, y_string):
			   null;
	}

}
