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
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;

public class PlusFunction extends ArithmeticFunction {

	@Override
	public String getOperatorName() {
		return "'+'";
	}
	
	@Override
	protected EList<Element> unaryIntegerOp(int x) {
		return EvaluationUtil.integerResult(x);
	}
	
	@Override
	protected EList<Element> unaryRealOp(double x) {
		return EvaluationUtil.realResult(x);
	}

	@Override
	protected EList<Element> binaryIntegerOp(int x, int y) {
		return EvaluationUtil.integerResult(x + y);
	}
	
	@Override
	protected EList<Element> binaryRealOp(double x, double y) {
		return EvaluationUtil.realResult(x + y);
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target) {
		String x_string = EvaluationUtil.stringValue(invocation, 0, target);
		if (x_string != null) {
			String y_string = EvaluationUtil.stringValue(invocation, 1, target);
			return y_string == null? EvaluationUtil.nullList(): EvaluationUtil.stringResult(x_string + y_string);
		}
		return super.invoke(invocation, target);
	}

}
