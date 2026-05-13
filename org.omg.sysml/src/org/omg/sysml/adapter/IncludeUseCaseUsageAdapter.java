/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022, 2025 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.UseCaseDefinition;
import org.omg.sysml.lang.sysml.UseCaseUsage;

public class IncludeUseCaseUsageAdapter extends UseCaseUsageAdapter {

	public IncludeUseCaseUsageAdapter(IncludeUseCaseUsage element) {
		super(element);
	}
	
	@Override
	public IncludeUseCaseUsage getTarget() {
		return (IncludeUseCaseUsage)super.getTarget();
	}
	
	/**
	 * TODO: Rename checkIncludeUseCaseSpecialization
	 * See SYSML21-299
	 */
	
	/**
	 * @satisfies checkIncludeUseCaseUsageSpecialization
	 */
	public boolean isSubUseCase() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof UseCaseDefinition || owningType instanceof UseCaseUsage;
	}
	
	/**
	 * @satisfies checkPerformActionUsageSpecialization
	 */
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		if (isPerformedAction()) {
			addDefaultGeneralType("performedAction");
		}
	}
		
	@Override
	public boolean hasRelevantSubjectParameter() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof CaseDefinition || owningType instanceof CaseUsage;
	}
	
}
