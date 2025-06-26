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

import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.CalculationDefinition;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.Type;

public class CalculationUsageAdapter extends ActionUsageAdapter {

	protected BindingConnector resultConnector = null;

	public CalculationUsageAdapter(CalculationUsage element) {
		super(element);
	}
	
	public CalculationUsage getTarget() {
		return (CalculationUsage)super.getTarget();
	}
	
	/**
	 * @satisfies checkCalculationUsageSpecialization
	 * @satisfies checkCalculationUsageSubcalculationSpecialization
	 */
	@Override
	protected String getSubactionType() {
		return isSubcalculation()? "subcalculation": super.getSubactionType();	
	}		
		
	public boolean isSubcalculation() {
		/*
		 * TODO: ST6RI-843
		 * 
		 * checkCalculationUsageSubcalculationSpecialization
		 * 
		 * owningType <> null and
		 * (owningType.oclIsKindOf(CalculationDefinition) or
 		 * owningType.oclIsKindOf(CalculationUsage)) implies
    	 * specializesFromLibrary('Calculations::Calculation::subcalculations')
    	 * 
    	 * isNonEntryExitComposite check is not part of the OCL
		 */
		CalculationUsage target = getTarget();
		Type owningType = target.getOwningType();
		return isNonEntryExitComposite() &&
			   owningType instanceof CalculationDefinition || owningType instanceof CalculationUsage;
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		createResultConnector(getTarget().getResult());		
	}
	
}
