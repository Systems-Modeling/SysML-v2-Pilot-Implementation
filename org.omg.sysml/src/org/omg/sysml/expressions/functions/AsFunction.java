/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.TypeUtil;

public class AsFunction extends BaseFunction {

	@Override
	public String getOperatorName() {
		return "as";
	}
	
	protected static boolean isTypeOrMetatype(Element context, Element element, Type targetType) {
		return isType(context, element, targetType) ||
			   TypeUtil.conforms(ExpressionUtil.getMetaclassOf(element), targetType);
	}
	
	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target) {
		Type targetType = getTypeArgument(invocation);
		if (targetType != null) {
			EList<Element> values = EvaluationUtil.evaluateArgument(invocation, 0, target);
			if (values != null) {
				EList<Element> results = new BasicEList<>();
				values.stream().
					filter(value->isTypeOrMetatype(invocation, value, targetType)).
					forEachOrdered(results::add);
				return results;
			}
		}
		return null;
	}

}
