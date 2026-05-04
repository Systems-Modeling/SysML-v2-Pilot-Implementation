/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2022 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.ActionDefinition;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AssertConstraintUsage;
import org.omg.sysml.lang.sysml.Type;

public class AssertConstraintUsageAdapter extends ConstraintUsageAdapter {

	public AssertConstraintUsageAdapter(AssertConstraintUsage element) {
		super(element);
	}
	
	public AssertConstraintUsage getTarget() {
		return (AssertConstraintUsage)super.getTarget();
	}
	
	/**
	 * @satisfies checkAssertConstraintUsageSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return getTarget().isNegated()?
				getDefaultSupertype("negated"):
				getDefaultSupertype("base");						
	}
	
	@Override
	public boolean isBehaviorOwned() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof ActionDefinition || owningType instanceof ActionUsage;
	}
	
}
