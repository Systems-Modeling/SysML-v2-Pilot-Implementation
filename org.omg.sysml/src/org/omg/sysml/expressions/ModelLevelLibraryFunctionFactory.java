/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022, 2025-2026 Model Driven Solutions, Inc.
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
