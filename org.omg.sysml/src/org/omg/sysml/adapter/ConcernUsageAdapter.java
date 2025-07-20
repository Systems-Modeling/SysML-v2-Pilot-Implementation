/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.util.UsageUtil;

public class ConcernUsageAdapter extends RequirementUsageAdapter {

	public ConcernUsageAdapter(ConcernUsage element) {
		super(element);
	}
	
	@Override
	public ConcernUsage getTarget() {
		return (ConcernUsage)super.getTarget();
	}
	
	/**
	 * @satisfies checkRequirementUsageSubrequirementSpecialization
	 */
	@Override
	public void addDefaultGeneralType() {
		super.addDefaultGeneralType();
		if (UsageUtil.isSubrequirement(getTarget())) {
			addDefaultGeneralType("subrequirement");
		}
	}
	
	/**
	 * @satisfies checkConcernUsageSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype("base");
	}
	
	/**
	 * @satisfies checkConcernUsageFramedConcernSpecialization
	 */
	@Override
	public void addRequirementConstraintSubsetting() {
		if (UsageUtil.isFramedConcern(getTarget())) {
			addSubsetting(getDefaultSupertype("concern"));
		} else {
			super.addRequirementConstraintSubsetting();
		}
	}
	
}
