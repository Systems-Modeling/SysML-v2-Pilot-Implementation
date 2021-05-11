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

package org.omg.sysml.util;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.adapter.ExpressionAdapter;
import org.omg.sysml.adapter.InvocationExpressionAdapter;
import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.Type;

public class ExpressionUtil {
	
	private ExpressionUtil() {
	}

	public static ExpressionAdapter getExpressionAdapter(Expression expression) {
		return ((ExpressionAdapter)ElementUtil.getElementAdapter(expression));
	}

	public static Type getExpressionTypeOf(Expression expression) {
		return getExpressionAdapter(expression).getExpressionType();
	}

	public static List<Feature> getTypeParametersOf(Expression expression) {
		return getExpressionAdapter(expression).getTypeParameters();
	}

	public static List<Feature> getTypeFeaturesOf(InvocationExpression expression) {
		return ((InvocationExpressionAdapter)getExpressionAdapter(expression)).getTypeFeatures();
	}

	public static Element getReferentFor(FeatureReferenceExpression expression) {
		return expression.getOwnedMembership().stream().
				filter(mem->!(mem instanceof ParameterMembership)).
				map(Membership::getMemberElement).
				findFirst().orElse(null);
	}

	public static boolean isTransitionGuard(Expression expression) {
		FeatureMembership membership = expression.getOwningFeatureMembership();
		return (membership instanceof TransitionFeatureMembership) &&
				((TransitionFeatureMembership)membership).getKind() == TransitionFeatureKind.GUARD;
	}

	public static boolean checkConditionsOn(Element element, List<Expression> conditions) {
		if (element == null) {
			return false;
		} else {
			List<AnnotatingFeature> annotatingFeatures = ElementUtil.getAllAnnotatingFeaturesOf(element);
			return conditions.stream().allMatch(cond->
				annotatingFeatures.isEmpty()? checkConditionOn(null, cond):
				annotatingFeatures.stream().anyMatch(elem->checkConditionOn(elem, cond)));
		}
	}
		
	public static boolean checkConditionOn(Element element, Expression condition) {
		if (condition == null) {
			return true;
		} else {
			EList<Element> result = condition.evaluate(element);
			return result == null || // If condition is ill-formed, ignore it.
					result.size() == 1 && result.get(0) instanceof LiteralBoolean && 
					((LiteralBoolean)result.get(0)).isValue();
		}
	}

}
