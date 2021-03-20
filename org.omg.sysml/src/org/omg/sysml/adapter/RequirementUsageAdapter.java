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

import java.util.Collections;
import java.util.List;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class RequirementUsageAdapter extends ConstraintUsageAdapter {
	
	public static final String REQUIREMENT_SUBSETTING_BASE_DEFAULT = "Requirements::requirementChecks";
	public static final String REQUIREMENT_SUBSETTING_SUBREQUIREMENT_DEFAULT = "Requirements::RequirementCheck::subrequirements";

	public static final String REQUIREMENT_SUBSETTING_VERIFICATION_FEATURE = "Verifications::VerificationCase::obj::requirementVerifications";
	
	public RequirementUsageAdapter(RequirementUsage element) {
		super(element);
	}
	
	@Override
	public RequirementUsage getTarget() {
		return (RequirementUsage)super.getTarget();
	}
	
	// Utility
	
	@Override
	public Usage getSubjectParameter() {
		return getTarget().getSubjectParameter();
	}
	
	// Implicit Generalization

	@Override
	protected String getDefaultSupertype() {
		return UsageUtil.isSubrequirement(getTarget())? 
				REQUIREMENT_SUBSETTING_SUBREQUIREMENT_DEFAULT:
				REQUIREMENT_SUBSETTING_BASE_DEFAULT;
	}
	
	@Override
	public void addRequirementSubsetting() {
		if (UsageUtil.isVerifiedRequirement(getTarget())) {
			addSubsetting(REQUIREMENT_SUBSETTING_VERIFICATION_FEATURE);
		} else {
			super.addRequirementSubsetting();
		}
	}
	
	// Computed Redefinition
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return UsageUtil.isObjective(getTarget())? 
				Collections.singletonList(TypeUtil.getObjectiveRequirementOf(type)):
			    super.getRelevantFeatures(type);
	}
	
}
