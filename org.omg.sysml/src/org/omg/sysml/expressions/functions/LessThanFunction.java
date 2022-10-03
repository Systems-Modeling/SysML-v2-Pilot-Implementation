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

public class LessThanFunction extends ArithmeticFunction {

	@Override
	public String getOperatorName() {
		return "'<'";
	}
	
	@Override
	protected EList<Element> binaryIntegerOp(int x, int y) {
		return EvaluationUtil.booleanResult(x < y);
	}
	
	@Override
	protected EList<Element> binaryRealOp(double x, double y) {
		return EvaluationUtil.booleanResult(x < y);
	}

	@Override
	protected EList<Element> binaryStringOp(String x, String y) {
		return EvaluationUtil.booleanResult(x.compareTo(y) < 0);
	}

}
