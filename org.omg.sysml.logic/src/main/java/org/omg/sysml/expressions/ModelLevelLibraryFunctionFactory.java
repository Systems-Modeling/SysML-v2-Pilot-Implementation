/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2025-2026 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.expressions;

import java.util.HashMap;
import java.util.Map;

import org.omg.sysml.expressions.functions.LibraryFeature;
import org.omg.sysml.expressions.functions.LibraryFunction;
import org.omg.sysml.expressions.functions.base.*;
import org.omg.sysml.expressions.functions.bool.*;
import org.omg.sysml.expressions.functions.control.*;
import org.omg.sysml.expressions.functions.data.*;
import org.omg.sysml.expressions.functions.trig.*;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;

public class ModelLevelLibraryFunctionFactory {
	
	public static final ModelLevelLibraryFunctionFactory INSTANCE = new ModelLevelLibraryFunctionFactory();

	private Map<String, LibraryFunction> functionMap = null;
	private Map<String, LibraryFeature> featureMap = null;

	protected void initialize() {
		functionMap = new HashMap<>();
		featureMap = new HashMap<>();
		
		// BaseFunctions
		put(new EqualsFunction());
		put(new NotEqualsFunction());
		put(new SameFunction());
		put(new NotSameFunction());
		put(new IsTypeFunction());
		put(new HasTypeFunction());
		put(new AtFunction());
		put(new AtAtFunction());
		put(new AsFunction());
		put(new MetaFunction());
		put(new ListConcatFunction());
		put(new IndexFunction());
		
		// DataFunctions
		put(new ListRangeFunction());		
		put(new PlusFunction());
		put(new MinusFunction());
		put(new TimesFunction());
		put(new DivideFunction());
		put(new PowerFunction());
		put(new RemainderFunction());
		put(new LessThanFunction());
		put(new LessThanOrEqualFunction());
		put(new GreaterThanFunction());
		put(new GreaterThanOrEqualFunction());
		
		// BooleanFunctions
		put(new NotFunction());
		put(new OrFunction());
		put(new XorFunction());
		put(new AndFunction());
		
		// ControlFunctions
		put(new DotFunction());
		put(new ConditionalFunction());
		put(new ConditionalAndFunction());
		put(new ConditionalOrFunction());
		put(new ConditionalImpliesFunction());
		put(new NullCoalescingFunction());		
		put(new CollectFunction());
		put(new SelectFunction());
		
		//TrigFunctions
		put(new PiFeature());
	}

	protected void put(LibraryFunction functionImpl) {
		for (String name: functionImpl.getQualifiedNames()) {
			functionMap.put(name, functionImpl);
		}
	}

	public Map<String, LibraryFunction> getFunctionMap() {
		if (functionMap == null) {
			initialize();
		}
		return functionMap;
	}

	public LibraryFunction getLibraryFunction(Function function) {
		return function == null? null: 
			getFunctionMap().get(function.getQualifiedName());
	}

	public static boolean isModelLevelEvaluable(Function function) {
		return INSTANCE.getLibraryFunction(function) != null;
	}
	
	protected void put(LibraryFeature featureImpl) {
		featureMap.put(featureImpl.getQualifiedName(), featureImpl);
	}
	
	public Map<String, LibraryFeature> getFeatureMap() {
		if (featureMap == null) {
			initialize();
		}
		return featureMap;
	}
	
	public LibraryFeature getLibraryFeature(Feature feature) {
		return feature == null? null:
			getFeatureMap().get(feature.getQualifiedName());
	}

}
