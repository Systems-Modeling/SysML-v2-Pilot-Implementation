/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022 Model Driven Solutions, Inc.
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

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.IncludeUseCaseUsage;
import org.omg.sysml.lang.sysml.Type;

public class IncludeUseCaseUsageAdapter extends UseCaseUsageAdapter {

	public IncludeUseCaseUsageAdapter(IncludeUseCaseUsage element) {
		super(element);
	}
	
	@Override
	public IncludeUseCaseUsage getTarget() {
		return (IncludeUseCaseUsage)super.getTarget();
	}
	
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
