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
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;

public class ItemFlowEndAdapter extends FeatureAdapter {

	public ItemFlowEndAdapter(ItemFlowEnd element) {
		super(element);
	}
	
	@Override
	public ItemFlowEnd getTarget() {
		return (ItemFlowEnd)super.getTarget();
	}
	
	// Transformation
	
	public void addItemFlowEndSubsetting() {
		EList<Feature> features = getTarget().getOwnedFeature();
		if (!features.isEmpty()) {
			List<Redefinition> redefinitions = ((FeatureImpl) features.get(0)).basicGetOwnedRedefinition();
			if (!redefinitions.isEmpty()) {
				Feature feature = redefinitions.get(0).getRedefinedFeature();
				if (feature != null) {
					Type owner = feature.getOwningType();
					if (owner instanceof Feature) {
						addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), owner);
					}
				}
			}
		}
	}	

	@Override
	public void doTransform() {
		addItemFlowEndSubsetting();
		super.doTransform();
	}
	
}
