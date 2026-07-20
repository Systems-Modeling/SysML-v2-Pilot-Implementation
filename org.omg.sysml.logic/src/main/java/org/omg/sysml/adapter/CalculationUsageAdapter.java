/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2023-2025 Model Driven Solutions, Inc.
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
		CalculationUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() &&
			   (owningType instanceof CalculationDefinition || owningType instanceof CalculationUsage);
	}
	
	@Override
	public void doTransform() {
		super.doTransform();
		createResultConnector(getTarget().getResult());		
	}
	
}
