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

package org.omg.sysml.expressions;

import java.util.HashMap;
import java.util.Map;

import org.omg.sysml.expressions.functions.*;
import org.omg.sysml.lang.sysml.Function;

public class LibraryFunctionFactory {
	
	public static final LibraryFunctionFactory INSTANCE = new LibraryFunctionFactory();

	private Map<String, LibraryFunction> functionMap = null;

	protected void initializeFunctionMap() {
		functionMap = new HashMap<>();
		
		put(new EqualsFunction());
		put(new NotEqualsFunction());
		put(new SameFunction());
		put(new NotSameFunction());
		
		put(new SizeFunction());
		put(new IsEmptyFunction());
		put(new NotEmptyFunction());
		put(new IncludesFunction());
		put(new ExcludesFunction());
		put(new ListConcatFunction());
		put(new ListRangeFunction());
		put(new IndexFunction());
		
		put(new IsTypeFunction());
		put(new HasTypeFunction());
		put(new AtFunction());
		put(new AtAtFunction());

		put(new AsFunction());
		put(new MetaFunction());

		put(new PlusFunction());
		put(new MinusFunction());
		put(new TimesFunction());
		put(new DivideFunction());
		put(new PowerFunction());
		put(new RemainderFunction());
		
		put(new SumFunction());
		put(new ProdFunction());
		
		put(new NotFunction());
		put(new OrFunction());
		put(new XorFunction());
		put(new AndFunction());
		
		put(new LessThanFunction());
		put(new LessThanOrEqualFunction());
		put(new GreaterThanFunction());
		put(new GreaterThanOrEqualFunction());
		
		put(new DotFunction());
		put(new ConditionalFunction());
		put(new ConditionalAndFunction());
		put(new ConditionalOrFunction());
		put(new ConditionalImpliesFunction());
		put(new NullCoalescingFunction());
		
		put(new StringLengthFunction());
		put(new StringSubstringFunction());
	}

	protected void put(LibraryFunction functionImpl) {
		for (String name: functionImpl.getFunctionNames()) {
			functionMap.put(name, functionImpl);
		}
	}

	public Map<String, LibraryFunction> getFunctionMap() {
		if (functionMap == null) {
			initializeFunctionMap();
		}
		return functionMap;
	}

	public LibraryFunction getLibraryFunction(Function function) {
		return function == null? null: 
			INSTANCE.getFunctionMap().get(function.getQualifiedName());
	}

	public boolean isModelLevelEvaluable(Function function) {
		LibraryFunction fn = getLibraryFunction(function);
		return fn != null && fn.isModelLevelEvaluable();
	}

}
