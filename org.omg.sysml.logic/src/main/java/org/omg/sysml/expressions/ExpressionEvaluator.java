/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *  
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.expressions;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.ConstructorExpression;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureReferenceExpression;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralExpression;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.MetadataAccessExpression;
import org.omg.sysml.lang.sysml.NullExpression;
import org.omg.sysml.lang.sysml.Type;

public interface ExpressionEvaluator {

	public EList<Element> evaluate(Expression expression, Element target);
	
	public EList<Element> evaluateNull(NullExpression expression, Element target);
	public EList<Element> evaluateLiteral(LiteralExpression expression, Element target);
	public EList<Element> evaluateFeatureReference(FeatureReferenceExpression expression, Element target);
	public EList<Element> evaluateMetadataAccess(MetadataAccessExpression expression, Element target);
	public EList<Element> evaluateInvocation(InvocationExpression expression, Element target);
	public EList<Element> evaluateConstructor(ConstructorExpression expression, Element target);
	
	public EList<Element> evaluateExpression(Expression expression, Element target, Element... arguments);
	public EList<Element> evaluateFeature(Feature feature, Type type);	
	public EList<Element> evaluateFeatureChain(List<Feature> chainingFeatures, Type type);
	
	// Utility methods
	
	public default EList<Element> evaluateArgument(InvocationExpression invocation, int i, Element target) {
		EList<Expression> arguments = invocation.getArgument();
		return i >= arguments.size()? new BasicEList<>(): evaluate(arguments.get(i), target);
	}

	public default Element argumentValue(InvocationExpression invocation, int i, Element target) {
		EList<Element> argumentValues = evaluateArgument(invocation, i, target);
		return argumentValues == null || argumentValues.size() != 1? null: argumentValues.get(0);
	}

	public default EList<Element> expressionValue(InvocationExpression invocation, int i, Element target) {
		Element value = argumentValue(invocation, i, target);
		return value instanceof Expression? evaluate((Expression)value, target): null;
	}

	public default Boolean booleanExpressionValue(InvocationExpression invocation, int i, Element target) {
		EList<Element> values = expressionValue(invocation, i, target);
		if (values == null || values.size() != 1) {
			return null;
		} else {
			Element value = values.get(0);
			return value instanceof LiteralBoolean? ((LiteralBoolean)value).isValue(): null;
		}
	}

	public default Boolean booleanValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralBoolean? ((LiteralBoolean)argument).isValue(): null;
	}

	public default String stringValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralString? ((LiteralString)argument).getValue(): null;
	}

	public default Integer integerValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralInteger? ((LiteralInteger)argument).getValue(): null;
	}

	public default Double realValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralRational? ((LiteralRational)argument).getValue(): null;
	}

}
