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

package org.omg.sysml.expressions;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;

public class StringSubstringFunction extends ModelLevelFunction {

	@Override
	public String getFunctionName() {
		return "StringFunctions::Substring";
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target) {
		String x = stringValue(invocation, 0, target);
		Integer lower = integerValue(invocation, 1, target);
		Integer upper = integerValue(invocation, 2, target);
		return x == null || lower == null || upper == null ||
			   lower < 1 || upper > x.length() || lower > upper + 1 ? nullList(): 
			stringResult(x.substring(lower - 1, upper));
	}

}
