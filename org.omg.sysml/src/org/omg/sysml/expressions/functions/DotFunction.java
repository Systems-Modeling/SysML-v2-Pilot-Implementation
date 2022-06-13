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
 * You should have received a copy of the GNU Lesser General Public License
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
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.NamespaceUtil;

public class DotFunction extends ControlFunction {

	@Override
	public String[] getOperatorNames() {
		return new String[]{"'.'"};
	}

	@Override
	public EList<Element> invoke(InvocationExpression invocation, Element target) {
		EList<Expression> arguments = invocation.getArgument();
		if (!arguments.isEmpty()) {
			Expression sourceArgument = arguments.get(0);
			EList<Element> list = EvaluationUtil.evaluate(sourceArgument, target);			
			if (list != null) {
				Element targetFeature = ExpressionUtil.getTargetFeatureFor(invocation);
				FeatureReferenceExpression featureReference = SysMLFactory.eINSTANCE.createFeatureReferenceExpression();
				NamespaceUtil.addMemberTo(featureReference, targetFeature);
				if (targetFeature instanceof Feature) {
					EList<Element> result = new BasicEList<>();
					for (Element element: list) {
						EList<Element> value = EvaluationUtil.evaluate(featureReference, element);
						if (value != null) {
							result.addAll(value);
						}
					}
					return result;
				}
			}
		}
		return null;
	}

}
