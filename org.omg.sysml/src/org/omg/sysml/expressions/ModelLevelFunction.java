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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.LiteralInfinity;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

public abstract class ModelLevelFunction {
	
	private static Map<String, ModelLevelFunction> functionMap = null;
	
	protected static void initializeFunctionMap() {
		functionMap = new HashMap<>();
		
		put(new EqualsFunction());
		put(new NotEqualsFunction());
		
		put(new SizeFunction());
		put(new IsEmptyFunction());
		put(new NotEmptyFunction());
		put(new IncludesFunction());
		put(new ListConcatFunction());
		put(new IndexFunction());
		
		put(new IsTypeFunction());
		put(new AtFunction());
		
		put(new PlusFunction());
		put(new MinusFunction());
		put(new TimesFunction());
		put(new DivideFunction());
		put(new PowerFunction());
		put(new RemainderFunction());
		
		put(new NotFunction());
		put(new OrFunction());
		put(new XorFunction());
		put(new AndFunction());
		
		put(new LessThanFunction());
		put(new LessThanOrEqualFunction());
		put(new GreaterThanFunction());
		put(new GreaterThanOrEqualFunction());
		
		put(new ConditionalFunction());
		put(new ConditionalAndFunction());
		put(new ConditionalOrFunction());
		put(new ConditionalImpliesFunction());
		
		put(new StringLengthFunction());
		put(new StringSubstringFunction());
	}
	
	protected static void put(ModelLevelFunction functionImpl) {
		for (String name: functionImpl.getFunctionNames()) {
			functionMap.put(name, functionImpl);
		}
	}
	
	public static Map<String, ModelLevelFunction> getFunctionMap() {
		if (functionMap == null) {
			initializeFunctionMap();
		}
		return functionMap;
	}
	
	public static ModelLevelFunction getFunctionImpl(Function function) {
		return function == null? null: 
			getFunctionMap().get(function.getQualifiedName());
	}
	
	abstract public String getPackageName();

	public String getOperatorName() {
		return null;
	}
	
	public String[] getOperatorNames() {
		String op = getOperatorName();
		return op == null? new String[] {}: new String[] {op};
	}
	
	public String[] getFunctionNames() {
		String[] names = getOperatorNames();
		for (int i = 0; i < names.length; i++) {
			names[i] = getPackageName() + "::" + names[i];
		}
		return names;
	}
	
	public abstract EList<Element> invoke(InvocationExpression invocation, Element target);
	
	protected static Type getPrimitiveType(Element context, EClass eClass) {
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
	
	protected static int numberOfArgs(InvocationExpression invocation) {
		return invocation.getArgument().size();
	}
	
	protected static EList<Element> evaluateArgument(InvocationExpression invocation, int i, Element target) {
		EList<Expression> arguments = invocation.getArgument();
		return i >= arguments.size()? new BasicEList<>(): arguments.get(i).evaluate(target);
	}
	
	protected static Element argumentValue(InvocationExpression invocation, int i, Element target) {
		EList<Element> argumentValues = evaluateArgument(invocation, i, target);
		return argumentValues == null || argumentValues.size() != 1? null: argumentValues.get(0);
	}
	
	protected static Boolean booleanValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralBoolean? ((LiteralBoolean)argument).isValue(): null;
	}

	protected static String stringValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralString? ((LiteralString)argument).getValue(): null;
	}

	protected static Integer integerValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralInteger? ((LiteralInteger)argument).getValue(): null;
	}

	protected static Double realValue(InvocationExpression invocation, int i, Element target) {
		Element argument = argumentValue(invocation, i, target);
		return argument instanceof LiteralRational? ((LiteralRational)argument).getValue(): null;
	}
	
	protected static EList<Element> nullList() {
		return new BasicEList<>();
	}
	
	protected static EList<Element> singletonList(Element element) {
		if (element == null) {
			return null;
		} else {
			EList<Element> result = new BasicEList<>();
			result.add(element);
			return result;
		}
	}
	
	protected static EList<Element> booleanResult(boolean value) {
		LiteralBoolean literal = SysMLFactory.eINSTANCE.createLiteralBoolean();
		literal.setValue(value);
		return singletonList(literal);
	}

	protected static EList<Element> stringResult(String value) {
		LiteralString literal = SysMLFactory.eINSTANCE.createLiteralString();
		literal.setValue(value);
		return singletonList(literal);
	}

	protected static EList<Element> integerResult(int value) {
		LiteralInteger literal = SysMLFactory.eINSTANCE.createLiteralInteger();
		literal.setValue(value);
		return singletonList(literal);
	}

	protected static EList<Element> realResult(double value) {
		LiteralRational literal = SysMLFactory.eINSTANCE.createLiteralRational();
		literal.setValue(value);
		return singletonList(literal);
	}
	
	protected static Object valueOf(Element element) {
		return element instanceof LiteralBoolean? Boolean.valueOf(((LiteralBoolean)element).isValue()):
			   element instanceof LiteralString? ((LiteralString)element).getValue():
			   element instanceof LiteralInteger? Integer.valueOf(((LiteralInteger)element).getValue()):
			   element instanceof LiteralRational? Double.valueOf(((LiteralRational)element).getValue()):
			   element instanceof LiteralInfinity? null:
			   element;
	}
	
	protected static boolean equal(Element x, Element y) {
		Object x_value = valueOf(x);
		Object y_value = valueOf(y);
		return x_value == null? y_value == null:
			   x_value.equals(y_value);
	}
	
	protected static Boolean equal(List<Element> x, List<Element> y) {
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

}
