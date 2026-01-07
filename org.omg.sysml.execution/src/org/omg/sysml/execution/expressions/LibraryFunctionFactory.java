/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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

package org.omg.sysml.execution.expressions;

import org.omg.sysml.execution.expressions.functions.data.*;
import org.omg.sysml.execution.expressions.functions.control.*;
import org.omg.sysml.execution.expressions.functions.numerical.*;
import org.omg.sysml.execution.expressions.functions.sequence.*;
import org.omg.sysml.execution.expressions.functions.string.*;

public class LibraryFunctionFactory extends org.omg.sysml.expressions.ModelLevelLibraryFunctionFactory {
	
	public static final LibraryFunctionFactory INSTANCE = new LibraryFunctionFactory();

	@Override
	protected void initializeFunctionMap() {
		super.initializeFunctionMap();
		
		// ControlFunctions
		put(new ExistsFunction());
		put(new ForAllFunction());
		put(new MinimizeFunction());
		put(new MaximizeFunction());
		put(new ReduceFunction());
		put(new RejectFunction());
		put(new SelectOneFunction());
		
		// DataFunctions
		put(new MaxFunction());
		put(new MinFunction());
		
		// NumericalFunctions
		put(new SumFunction());
		put(new ProdFunction());
		
		// SequenceFunctions
		put(new ExcludesFunction());
		put(new ExcludingAtFunction());
		put(new ExcludingFunction());
		put(new HeadFunction());
		put(new IncludesFunction());
		put(new IncludesOnlyFunction());
		put(new IncludingAtFunction());
		put(new IncludingFunction());
		put(new IntersectionFunction());
		put(new IsEmptyFunction());
		put(new LastFunction());
		put(new NotEmptyFunction());
		put(new SequenceEqualsFunction());
		put(new SequenceSameFunction());
		put(new SizeFunction());
		put(new SubsequenceFunction());
		put(new TailFunction());
		put(new UnionFunction());
		
		// StringFunctions
		put(new StringLengthFunction());
		put(new StringSubstringFunction());
	}

}
