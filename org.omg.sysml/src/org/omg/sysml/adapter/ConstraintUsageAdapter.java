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

import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class ConstraintUsageAdapter extends OccurrenceUsageAdapter {

	public static final String CONSTRAINT_SUBSETTING_ASSUMPTION_FEATURE = "Requirements::RequirementCheck::assumptions";
	public static final String CONSTRAINT_SUBSETTING_REQUIREMENT_FEATURE = "Requirements::RequirementCheck::constraints";

	protected BindingConnector resultConnector = null;

	public ConstraintUsageAdapter(ConstraintUsage element) {
		super(element);
	}
	
	@Override
	public ConstraintUsage getTarget() {
		return (ConstraintUsage)super.getTarget();
	}
	
	// Utility
	
	@Override
	public Usage getSubjectParameter() {
		return basicGetSubjectParameter();
	}
	
	protected Usage basicGetSubjectParameter() {
		ConstraintUsage target = getTarget();
		return isRequirement()? TypeUtil.basicGetSubjectParameterOf(target): null;
	}	
	
	@Override
	public boolean hasRelevantSubjectParameter() {
		Type owningType = getTarget().getOwningType();
		return isRequirement() && 
			   (owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage);
	}
	
	public boolean isRequirement() {
		return getTarget().getType().stream().anyMatch(RequirementDefinition.class::isInstance);
	}
	
	// Implicit Generalization
	
	protected void addAssumptionSubsetting() {
		addSubsetting(CONSTRAINT_SUBSETTING_ASSUMPTION_FEATURE);
	}
	
	protected void addRequirementSubsetting() {
		addSubsetting(CONSTRAINT_SUBSETTING_REQUIREMENT_FEATURE);
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		ConstraintUsage target = getTarget();
		if (UsageUtil.isAssumptionConstraint(target)) {
			addAssumptionSubsetting();
		} else if (UsageUtil.isRequirementConstraint(target)){
			addRequirementSubsetting();
		}
		super.computeImplicitGeneralTypes();
		if (isCheckedConstraint()) {
			addDefaultGeneralType("checkedConstraint");
		}
		if (isOwnedPerformance()) {
			addDefaultGeneralType("ownedPerformance");
		} 
		if (isSubperformance()) {
			addDefaultGeneralType("subperformance");
		}
		if (isEnclosedPerformance()) {
			addDefaultGeneralType("enclosedPerformance");
		}
	}
	
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	protected boolean isCheckedConstraint() {
		ConstraintUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() &&
				(owningType instanceof ItemDefinition || owningType instanceof ItemUsage);
				
	}
	
	// Transformation
	
	protected void computeSubjectParameter() {
		ConstraintUsage constraint = getTarget();
		if (isRequirement()) {
			computeSubjectParameterOf(constraint);
		}
	}
	
	@Override
	public void doTransform() {
		ConstraintUsage constraint = getTarget();
		super.doTransform();
		computeSubjectParameter();
		addResultParameter();
		createResultConnector(constraint.getResult());
	}	
	
}
