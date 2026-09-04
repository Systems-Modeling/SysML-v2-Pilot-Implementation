/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ViewDefinition;
import org.omg.sysml.lang.sysml.ViewUsage;
import org.omg.sysml.lang.sysml.ViewpointUsage;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.UsageUtil;

public class SatisfyRequirementUsageAdapter extends RequirementUsageAdapter {
	
	public SatisfyRequirementUsageAdapter(SatisfyRequirementUsage element) {
		super(element);
	}
	
	@Override
	public SatisfyRequirementUsage getTarget() {
		return (SatisfyRequirementUsage)super.getTarget();
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		addSatisfiedViewpointSubsetting();
		super.computeImplicitGeneralTypes();
	}
	
	/**
	 * @satisfies checkSatisfyRequirementUsageSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return getTarget().isNegated()?
				getDefaultSupertype("negated"):
				getDefaultSupertype("base");						
	}
	
	protected void addSatisfiedViewpointSubsetting() {
		SatisfyRequirementUsage target = getTarget();
		Type owningType = target.getOwningType();
		if ((owningType instanceof ViewDefinition || owningType instanceof ViewUsage) &&
				UsageUtil.getSatisfyingFeatureValueOf(target) == null) {
			RequirementUsage satisfiedRequirement = target.getSatisfiedRequirement();
			if (satisfiedRequirement instanceof ViewpointUsage) {
				addSubsetting(ImplicitGeneralizationMap.getDefaultSupertypeFor(
						satisfiedRequirement.getClass(), "satisfied"));
			}
		}
	}

}
