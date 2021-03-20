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
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class StepAdapter extends FeatureAdapter {
	
	public static final String STEP_SUBSETTING_BASE_DEFAULT = "Performances::performances";
	public static final String STEP_SUBSETTING_PERFORMANCE_DEFAULT = "Performances::Performance::subperformances";
	public static final String STEP_SUBSETTING_OBJECT_DEFAULT = "Objects::Object::enactedPerformances";
	public static final String STEP_SUBSETTING_TRANSFER_DEFAULT = "Occurrences::Occurrence::incomingTransfers";
	
	public StepAdapter(Step element) {
		super(element);
	}
	
	@Override
	public Step getTarget() {
		return (Step)super.getTarget();
	}

	@Override
	protected String getDefaultSupertype() {
		Step target = getTarget();
		return 
			FeatureUtil.isCompositePerformanceFeature(target)? 
				STEP_SUBSETTING_PERFORMANCE_DEFAULT:
			FeatureUtil.isEnactedPerformance(target)?
				STEP_SUBSETTING_OBJECT_DEFAULT:
			FeatureUtil.isIncomingTransfer(target)?
				STEP_SUBSETTING_TRANSFER_DEFAULT:
				STEP_SUBSETTING_BASE_DEFAULT;
	}
	
	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return TypeUtil.getItemFeaturesOf(getTarget());
	}	
	
}
