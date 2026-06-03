/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2026 Model Driven Solutions, Inc.
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

package org.omg.sysml.expressions.functions.base;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.EvaluationUtil;

public class NotEqualsFunction extends EqualsFunction {

	@Override
	public String getFunctionName() {
		return "'!='";
	}

	@Override
	protected boolean compare(EList<Element> x, EList<Element> y) {
		// Note: This allows comparison of arbitrary lists, even though the !==' function args have multiplicity 0..1.
		return !EvaluationUtil.equal(x, y);
	}
	

}
