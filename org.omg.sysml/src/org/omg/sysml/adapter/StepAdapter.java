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

import java.util.List;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFeature;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

public class StepAdapter extends FeatureAdapter {
	
	public StepAdapter(Step element) {
		super(element);
	}
	
	@Override
	public Step getTarget() {
		return (Step)super.getTarget();
	}

	@Override
	protected String getDefaultSupertype() {
		return getDefaultSupertype(
			isSubperformance()? 
				"subperformance":
			isEnactedPerformance()?
				"enactedPerformance":
			isIncomingTransfer()?
				"incomingTransfer":
				"base");
	}
	
	public boolean isSubperformance() {
		return getTarget().isComposite() && super.isSubperformance();
	}
	
	public boolean isEnactedPerformance() {
		Type owningType = getTarget().getOwningType();
		return owningType instanceof Structure ||
				owningType instanceof Feature && 
					((Feature)owningType).getType().stream().anyMatch(Structure.class::isInstance);
	}

	public boolean isIncomingTransfer() {
		return getTarget().getOwnedFeature().stream().anyMatch(ItemFeature.class::isInstance);
	}

	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return TypeUtil.getItemFeaturesOf(getTarget());
	}	
	
}
