/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2024 Model Driven Solutions, Inc.
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

import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.Type;

public class ItemUsageAdapter extends OccurrenceUsageAdapter {
	
	public ItemUsageAdapter(ItemUsage element) {
		super(element);
	}
	
	public ItemUsage getTarget() {
		return (ItemUsage)super.getTarget();
	}

	// Implicit Generalization
	
	/**
	 * @satisfies checkItemUsageSubitemSpecialization
	 * @satisfies checkItemUsageSpecialization
	 * @satisfies checkPartUsageSubpartSpecialization
	 * @satisfies checkPartUsageSpecialization
	 */
	@Override
	protected String getDefaultSupertype() {
		return isSubitem()?
					getDefaultSupertype("subitem"):
					getDefaultSupertype("base");
	}
	
	@Override
	protected boolean isSuboccurrence() {
		return super.isSuboccurrence() && !isSubitem();
	}
	
	@Override
	protected boolean isSubobject() {
		return super.isSubobject() && !isSubitem();
	}
	
	public boolean isSubitem() {
		ItemUsage target = getTarget();
		Type owningType = target.getOwningType();
		return target.isComposite() && 
			   (owningType instanceof ItemDefinition || owningType instanceof ItemUsage);
	}
	
	// Transformation
	
	@Override
	protected boolean isAddMultiplicity() {
		return isAddDefaultMultiplicity();
	}
	
}
