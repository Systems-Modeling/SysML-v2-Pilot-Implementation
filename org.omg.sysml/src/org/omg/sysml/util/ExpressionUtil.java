/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022 Model Driven Solutions, Inc.
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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.adapter.ExpressionAdapter;
import org.omg.sysml.adapter.InvocationExpressionAdapter;
import org.omg.sysml.adapter.OperatorExpressionAdapter;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

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
				filter(el->el != null).
				findFirst().orElse(null);
	}
	
	public static Element getTargetFeatureFor(InvocationExpression expression) {
		List<Membership> memberships = expression.getOwnedMembership();
		return memberships.size() < 2? null: memberships.get(1).getMemberElement();
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
			List<Feature> metadataFeatures = new ArrayList<>(); 
			metadataFeatures.addAll(ElementUtil.getAllMetadataFeaturesOf(element));
			Feature metaclassFeature = getMetaclassFeatureFor(element);
			if (metaclassFeature != null) {
				metadataFeatures.add(metaclassFeature);
			}
			return conditions.stream().allMatch(cond->
				metadataFeatures.isEmpty()? checkConditionOn(null, cond):
				metadataFeatures.stream().anyMatch(elem->checkConditionOn(elem, cond)));
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
	
	public static Feature getMetaclassFeatureFor(Element element) {
		Type metaclass = getMetaclassOf(element);
		if (metaclass == null) {
			return null;
		} else {
			FeatureTyping typing = SysMLFactory.eINSTANCE.createFeatureTyping();
			typing.setType(metaclass);
			Feature metaclassFeature = SysMLFactory.eINSTANCE.createFeature();
			metaclassFeature.getOwnedRelationship().add(typing);
			return metaclassFeature;
		}
	}
	
	public static Type getMetaclassOf(Element element) {
		String metaclassName = element.eClass().getName();
		return SysMLLibraryUtil.getLibraryType(element, "KerML::" + metaclassName, "SysML::" + metaclassName);
	}
	
	public static InvocationExpression getInvocationExpressionFor(Expression argument) {
		Element parameter = argument.getOwningNamespace();
		if (parameter instanceof FeatureReferenceExpression) {
			parameter = parameter.getOwningNamespace();
		}
		if (parameter == null) {
			return null;
		} else {
			Element type = parameter.getOwningNamespace();
			return type instanceof InvocationExpression? (InvocationExpression)type: null;
		}
	}
	
	public static Expression getRootExpressionFor(Expression expression) {
		Expression root = expression;
		InvocationExpression invocation = getInvocationExpressionFor(expression);
		while (invocation != null) {
			root = invocation;
			invocation = getInvocationExpressionFor(root);
		}
		return root;
	}

	public static String[] getOperatorQualifiedNames(String op) {
		return Stream.of(OperatorExpressionAdapter.LIBRARY_PACKAGE_NAMES).map(pack -> pack + "::'" + op + "'").toArray(String[]::new);
	}

}
