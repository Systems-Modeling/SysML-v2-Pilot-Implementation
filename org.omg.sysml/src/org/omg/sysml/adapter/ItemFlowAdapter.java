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

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.impl.RedefinitionImpl;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;

public class ItemFlowAdapter extends ConnectorAdapter {

	public static final String ITEM_FLOW_SUBSETTING_BASE_DEFAULT = "Transfers::transfers";
	public static final String ITEM_FLOW_SUBSETTING_PERFORMANCE_DEFAULT = "Performances::Performance::subtransfers";

	public ItemFlowAdapter(ItemFlow feature) {
		super(feature);
	}
	
	@Override
	public ItemFlow getTarget() {
		return (ItemFlow)super.getTarget();
	}

	@Override
	protected String getDefaultSupertype() {
		return isSubtransfer()? 
				ITEM_FLOW_SUBSETTING_PERFORMANCE_DEFAULT:
				ITEM_FLOW_SUBSETTING_BASE_DEFAULT;
	}
	
	protected boolean isSubtransfer() {
		return FeatureUtil.isPerformanceFeature(getTarget());
	}
	
	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return TypeUtil.getItemFeaturesOf(getTarget());
	}
	
	public void transformConnectorEnd() {
		ItemFlow flow = getTarget();
		EList<Feature> ends = flow.getConnectorEnd();
		Namespace owner = flow.getOwningNamespace();
		if (owner instanceof Feature) {
			if (ends.size() >= 2) {
				EList<Feature> endFeatures = ends.get(1).getOwnedFeature();
				endFeatures.get(0).getOwnedRedefinition().stream().findFirst().
					filter(redefinition->((RedefinitionImpl)redefinition).basicGetRedefinedFeature() == null).
					ifPresent(redefinition->redefinition.setRedefinedFeature((Feature)owner));
			}
		}
	}

	@Override
	public void doTransform() {
		super.doTransform();
		transformConnectorEnd();
	}
	
}
