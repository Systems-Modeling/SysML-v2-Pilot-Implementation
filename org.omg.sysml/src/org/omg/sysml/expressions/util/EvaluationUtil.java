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

package org.omg.sysml.expressions.util;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralInfinity;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.FeatureUtil;

public class EvaluationUtil {

	public static Type getPrimitiveType(Element context, EClass eClass) {
		return 
			eClass == SysMLPackage.eINSTANCE.getLiteralBoolean()? 
					(Type)SysMLLibraryUtil.getLibraryElement(context, "ScalarValues::Boolean"):
			eClass == SysMLPackage.eINSTANCE.getLiteralString()? 
					(Type)SysMLLibraryUtil.getLibraryElement(context, "ScalarValues::String"):
			eClass == SysMLPackage.eINSTANCE.getLiteralInteger()? 
					(Type)SysMLLibraryUtil.getLibraryElement(context, "ScalarValues::Integer"):
			eClass == SysMLPackage.eINSTANCE.getLiteralRational()? 
					(Type)SysMLLibraryUtil.getLibraryElement(context, "ScalarValues::Rational"):
			eClass == SysMLPackage.eINSTANCE.getLiteralInfinity()? 
					(Type)SysMLLibraryUtil.getLibraryElement(context, "ScalarValues::Positive"):
			null;
	}

	public static int numberOfArgs(InvocationExpression invocation) {
		return invocation.getArgument().size();
	}

	public static EList<Element> evaluate(Expression expression, Element target) {
		return ModelLevelExpressionEvaluator.INSTANCE.evaluate(expression, target);
	}

	public static EList<Element> evaluateArgument(InvocationExpression invocation, int i, Element target) {
		EList<Expression> arguments = invocation.getArgument();
		return i >= arguments.size()? new BasicEList<>(): evaluate(arguments.get(i), target);
	}

	public static Element argumentValue(InvocationExpression invocation, int i, Element target) {
		EList<Element> argumentValues = evaluateArgument(invocation, i, target);
		return argumentValues == null || argumentValues.size() != 1? null: argumentValues.get(0);
	}

	public static EList<Element> expressionValue(InvocationExpression invocation, int i, Element target) {
		Element value = argumentValue(invocation, i, target);
		return value instanceof Expression? evaluate((Expression)value, target): null;
	}

	public static Boolean booleanExpressionValue(InvocationExpression invocation, int i, Element target) {
		EList<Element> values = expressionValue(invocation, i, target);
		if (values.size() != 1) {
			return null;
		} else {
			Element value = values.get(0);
			return value instanceof LiteralBoolean? ((LiteralBoolean)value).isValue(): null;
		}
	}

	public static Boolean booleanValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralBoolean? ((LiteralBoolean)argument).isValue(): null;
	}

	public static String stringValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralString? ((LiteralString)argument).getValue(): null;
	}

	public static Integer integerValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralInteger? ((LiteralInteger)argument).getValue(): null;
	}

	public static Double realValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralRational? ((LiteralRational)argument).getValue(): null;
	}

	public static EList<Element> nullList() {
		return new BasicEList<>();
	}

	public static EList<Element> singletonList(Element element) {
		if (element == null) {
			return null;
		} else {
			EList<Element> result = new BasicEList<>();
			result.add(element);
			return result;
		}
	}

	public static EList<Element> booleanResult(boolean value) {
		LiteralBoolean literal = SysMLFactory.eINSTANCE.createLiteralBoolean();
		literal.setValue(value);
		return singletonList(literal);
	}

	public static EList<Element> stringResult(String value) {
		LiteralString literal = SysMLFactory.eINSTANCE.createLiteralString();
		literal.setValue(value);
		return singletonList(literal);
	}

	public static EList<Element> integerResult(int value) {
		LiteralInteger literal = SysMLFactory.eINSTANCE.createLiteralInteger();
		literal.setValue(value);
		return singletonList(literal);
	}

	public static EList<Element> realResult(double value) {
		LiteralRational literal = SysMLFactory.eINSTANCE.createLiteralRational();
		literal.setValue(value);
		return singletonList(literal);
	}

	public static Object valueOf(Element element) {
		return element instanceof LiteralBoolean? Boolean.valueOf(((LiteralBoolean)element).isValue()):
			   element instanceof LiteralString? ((LiteralString)element).getValue():
			   element instanceof LiteralInteger? Integer.valueOf(((LiteralInteger)element).getValue()):
			   element instanceof LiteralRational? Double.valueOf(((LiteralRational)element).getValue()):
			   element instanceof LiteralInfinity? null:
			   element;
	}

	public static boolean equal(Element x, Element y) {
		Object x_value = valueOf(x);
		Object y_value = valueOf(y);
		return x_value == null? y_value == null:
			   x_value.equals(y_value);
	}

	public static Boolean equal(List<Element> x, List<Element> y) {
		if (x.size() != y.size()) {
			return false;
		} else {
			for (int i = 0; i < x.size(); i++) {
				if (!equal(x.get(i), y.get(i))) {
					return false;
				}
			}
			return true;
		}
	}

	public static Feature getTargetFeatureFor(Element target) {
		if (target instanceof Feature) {
			return (Feature)target;
		} else {
			Feature targetFeature = SysMLFactory.eINSTANCE.createFeature();
			if (target instanceof Type) {
				FeatureTyping featureTyping = SysMLFactory.eINSTANCE.createFeatureTyping();
				featureTyping.setType((Type)target);
				targetFeature.getOwnedRelationship().add(featureTyping);
			}
			return targetFeature;
		}
	}

	public static Expression getValueExpressionFor(Feature feature, Type type) {
		Feature typeFeature = type == null? feature: 
			type.getFeature().stream().
				filter(f->f == feature || FeatureUtil.getRedefinedFeaturesOf(f).contains(feature)).
				findFirst().orElse(feature);
		return FeatureUtil.getValueExpressionFor(typeFeature);
	}

}
