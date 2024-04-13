/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2024 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.UsageUtil;

public class ConstraintUsageAdapter extends OccurrenceUsageAdapter {

	protected BindingConnector resultConnector = null;

	public ConstraintUsageAdapter(ConstraintUsage element) {
		super(element);
	}
	
	@Override
	public ConstraintUsage getTarget() {
		return (ConstraintUsage)super.getTarget();
	}
	
	// Implicit Generalization
	
	@Override
	public void computeImplicitGeneralTypes() {
		addRequirementConstraintSubsetting();
		super.computeImplicitGeneralTypes();
		if (isCheckedConstraint()) {
			addDefaultGeneralType("checkedConstraint");
		}
		if (isStructureOwnedComposite()) {
			addDefaultGeneralType("ownedPerformance");
		} 
		if (isBehaviorOwnedComposite()) {
			addDefaultGeneralType("subperformance");
		}
		if (isBehaviorOwned()) {
			addDefaultGeneralType("enclosedPerformance");
		}
	}
	
	public void addRequirementConstraintSubsetting() {
		RequirementConstraintKind kind = UsageUtil.getRequirementConstraintKindOf(getTarget());
		if (kind != null) {
			addDefaultGeneralType(kind.toString());
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
	
	@Override
	public void addAdditionalMembers() {
		UsageUtil.addResultParameterTo(getTarget());
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		createResultConnector(getTarget().getResult());		
	}
	
}
