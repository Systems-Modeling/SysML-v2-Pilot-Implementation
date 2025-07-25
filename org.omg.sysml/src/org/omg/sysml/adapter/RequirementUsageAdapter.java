/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023-2025 Model Driven Solutions, Inc.
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

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.UsageUtil;

public class RequirementUsageAdapter extends ConstraintUsageAdapter {
	
	public RequirementUsageAdapter(RequirementUsage element) {
		super(element);
	}
	
	@Override
	public RequirementUsage getTarget() {
		return (RequirementUsage)super.getTarget();
	}
	
	// Utility
	
	@Override
	public boolean hasRelevantSubjectParameter() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage;
	}
	
	// Implicit Generalization
	
	/**
	 * @satisfies checkRequirementUsageSubrequirementSpecialization
	 * @satisfies checkRequirementUsageSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return UsageUtil.isSubrequirement(getTarget())? 
				getDefaultSupertype("subrequirement"):
				getDefaultSupertype("base");
	}
	
	/**
	 * @satisfies checkRequirementUsageRequirementVerificationSpecialization
	 */
	@Override
	public void addRequirementConstraintSubsetting() {
		if (UsageUtil.isVerifiedRequirement(getTarget())) {
			addDefaultGeneralType("verification");
		} else {
			super.addRequirementConstraintSubsetting();
		}
	}
	
	// Computed Redefinition
	
	/**
	 * @satisfies checkRequirementUsageObjectiveRedefinition
	 */
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type, Element skip) {
		RequirementUsage target = getTarget();
		return UsageUtil.isObjective(getTarget())?
				Collections.singletonList(
						type == target.getOwningType()? 
						UsageUtil.getOwnedObjectiveRequirementOf(type):
						UsageUtil.getObjectiveRequirementOf(type)):
			    super.getRelevantFeatures(type, skip);
	}
	
}
