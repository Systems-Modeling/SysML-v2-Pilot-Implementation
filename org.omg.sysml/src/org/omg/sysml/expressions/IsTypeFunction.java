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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.TypeImpl;

public class IsTypeFunction extends ModelLevelFunction {

	@Override
	public String getFunctionName() {
		return "BaseFunctions::istype";
	}
	
	protected static Type getTestedType(InvocationExpression invocation) {
		EList<Feature> ownedFeatures = invocation.getOwnedFeature();
		if (ownedFeatures.size() >= 2) {
			EList<Type> types = ownedFeatures.get(1).getType();
			if (!types.isEmpty()) {
				return types.get(0);
			}
		}
		return null;
	}
	
	protected static List<Type> getType(Element context, Element element) {
		return element instanceof LiteralExpression? Collections.singletonList(getPrimitiveType(context, element.eClass())):
			   element instanceof Feature? ((Feature)element).getType():
			   Collections.emptyList();
	}
	
	protected static boolean isType(Element context, Element element, Type type) {
		return getType(context, element).stream().
				anyMatch(elementType->((TypeImpl)elementType).conformsTo(type));
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target) {
		Type testedType = getTestedType(invocation);
		if (testedType != null) {
			EList<Element> values = evaluateArgument(invocation, 0, target);
			if (values != null) {
				return booleanResult(!values.isEmpty() && isType(invocation, values.get(0), testedType));
			}
		}
		return null;
	}

}
