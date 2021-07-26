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

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.UsageUtil;

public class PartUsageAdapter extends ItemUsageAdapter {

	public PartUsageAdapter(PartUsage element) {
		super(element);
	}
	
	public PartUsage getTarget() {
		return (PartUsage)super.getTarget();
	}
	
	@Override
	protected String getDefaultSupertype() {
		return isRequirementActor()? getDefaultSupertype("requirementActor"):
			   isRequirementStakeholder()? getDefaultSupertype("requirementStakeholder"):
			   isCaseActor()? getDefaultSupertype("caseActor"):
			   super.getDefaultSupertype();
	}
	
	protected boolean isRequirementActor() {
		PartUsage target = getTarget();
		Type owningType = target.getOwningType();
		return UsageUtil.isActorParameter(target) &&
			   ( owningType instanceof RequirementDefinition ||
				 owningType instanceof RequirementUsage);
	}

	protected boolean isRequirementStakeholder() {
		PartUsage target = getTarget();
		Type owningType = target.getOwningType();
		return UsageUtil.isStakeholderParameter(target) &&
			   ( owningType instanceof RequirementDefinition ||
				 owningType instanceof RequirementUsage);
	}

	protected boolean isCaseActor() {
		PartUsage target = getTarget();
		Type owningType = target.getOwningType();
		return UsageUtil.isActorParameter(target) &&
			   ( owningType instanceof CaseDefinition ||
				 owningType instanceof CaseUsage);
	}

	@Override
	public boolean isIgnoredParameter() {
		PartUsage target = getTarget();
		return super.isIgnoredParameter() || 
				UsageUtil.isActorParameter(target) ||
				UsageUtil.isStakeholderParameter(target);
	}
	
}
