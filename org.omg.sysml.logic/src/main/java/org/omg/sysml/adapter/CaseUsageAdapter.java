/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023-2025 Model Driven Solutions, Inc.
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

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Type;

public class CaseUsageAdapter extends CalculationUsageAdapter {

	public CaseUsageAdapter(CaseUsage element) {
		super(element);
	}
	
	@Override
	public CaseUsage getTarget() {
		return (CaseUsage)super.getTarget();
	}
	
	// Utility
	
	@Override
	public boolean hasRelevantSubjectParameter() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof CaseDefinition || owningType instanceof CaseUsage;
	}
	
	// Implicit Generalization
	
	/**
	 * @satisfies checkCaseUsageSpecialization
	 * @satisfies checkCaseUsageSubcaseSpecialization
	 */
	@Override
	protected String getSubactionType() {
		return isSubcase()? "subcase": super.getSubactionType();	
	}
		
	public boolean isSubcase() {
		CaseUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() &&
			   (owningType instanceof CaseDefinition || owningType instanceof CaseUsage);
	}
	
}
