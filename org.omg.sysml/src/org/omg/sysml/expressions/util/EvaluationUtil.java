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
import java.util.Optional;

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
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.FeatureUtil;

import com.google.common.base.Predicates;

public class EvaluationUtil {

	public static final String ANNOTATED_ELEMENT_FEATURE = "Metaobjects::Metaobject::annotatingElement";
	
	public static Feature getAnnotatedElementFeature(Element context) {
		return (Feature)SysMLLibraryUtil.getLibraryType(context, ANNOTATED_ELEMENT_FEATURE);
	}
	
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

	public static EList<Element> results(Object object) {
		EList<Element> results = new BasicEList<>();
		if (object instanceof List) {
			((List<?>)object).stream().
				map(EvaluationUtil::elementFor).
				filter(Predicates.notNull()).
				forEachOrdered(results::add);
		} else if (object != null) {
			Element element = elementFor(object);
			if (object != null) {
				results.add(element);
			}
		}
		return results;
	}
	
	public static Element elementFor(Object object) {
		return object instanceof Boolean? literalBoolean((Boolean)object):
			   object instanceof String? literalString((String)object):
			   object instanceof Integer? literalInteger((Integer)object):
			   object instanceof Double? literalRational((Double)object):
			   object instanceof Element? ElementUtil.getMetaclassFeatureFor((Element)object):
			   null;
	}
	
	public static LiteralBoolean literalBoolean(boolean value) {
		LiteralBoolean literal = SysMLFactory.eINSTANCE.createLiteralBoolean();
		literal.setValue(value);
		return literal;
	}

	public static LiteralString literalString(String value) {
		LiteralString literal = SysMLFactory.eINSTANCE.createLiteralString();
		literal.setValue(value);
		return literal;
	}

	public static LiteralInteger literalInteger(int value) {
		LiteralInteger literal = SysMLFactory.eINSTANCE.createLiteralInteger();
		literal.setValue(value);
		return literal;
	}

	public static LiteralRational literalRational(double value) {
		LiteralRational literal = SysMLFactory.eINSTANCE.createLiteralRational();
		literal.setValue(value);
		return literal;
	}
	
	public static EList<Element> booleanResult(boolean value) {
		return singletonList(literalBoolean(value));
	}

	public static EList<Element> stringResult(String value) {
		return singletonList(literalString(value));
	}

	public static EList<Element> integerResult(int value) {
		return singletonList(literalInteger(value));
	}

	public static EList<Element> realResult(double value) {
		return singletonList(literalRational(value));
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
	
	public static Optional<Feature> getTypeFeatureFor(Feature feature, Type type) {
		return type.getFeature().stream().
				filter(f->f == feature || FeatureUtil.getRedefinedFeaturesOf(f).contains(feature)).
				findFirst();
	}

	public static Expression getValueExpressionFor(Feature feature, Type type) {
		return type == null? FeatureUtil.getValueExpressionFor(feature):
			   getTypeFeatureFor(feature, type).
					map(FeatureUtil::getValueExpressionFor).
					orElse(null);
	}
	
	public static boolean isMetaclassFeature(Type type) {
		return type instanceof MetadataFeature &&
				((MetadataFeature)type).getAnnotatedElement().stream().
					map(ElementUtil::getMetaclassFeatureFor).
					anyMatch(Predicates.equalTo(type));
	}

}
