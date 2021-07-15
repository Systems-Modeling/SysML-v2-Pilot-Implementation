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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemFlow;
import org.omg.sysml.lang.sysml.ItemFlowEnd;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.FeatureUtil;

public class ItemFlowEndAdapter extends FeatureAdapter {

	public ItemFlowEndAdapter(ItemFlowEnd element) {
		super(element);
	}
	
	@Override
	public ItemFlowEnd getTarget() {
		return (ItemFlowEnd)super.getTarget();
	}
	
	// Implicit Generalization
	
	@Override
	public Stream<Feature> getSubsettedNotRedefinedFeatures() {
		addItemFlowEndSubsetting();
		return super.getSubsettedNotRedefinedFeatures();
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		// Note: Do not add item flow end subsetting here, to avoid circularity due to name resolution.
		addComputedRedefinitions(null);
	}
	
	// Computed Redefinition

	@Override
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		return type instanceof ItemFlow? new ArrayList<>(((Feature)type).getType()) : super.getGeneralTypes(type, skip);
	}

	@Override
	public List<Feature> getRelevantFeatures() {
		return getTarget().getOwnedFeature();
	}
	
	// Transformation
	
	public void addItemFlowEndSubsetting() {
		ItemFlowEnd target = getTarget();
		if (target.getOwnedSubsetting().isEmpty()) {
			EList<Feature> features = getTarget().getOwnedFeature();
			if (!features.isEmpty()) {
				FeatureUtil.getRedefinedFeaturesOf(features.get(0)).stream().findFirst().
				filter(f->f != null).
				map(Feature::getOwningType).
				filter(Feature.class::isInstance).
				ifPresent(owner->
					addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), owner)
				);
			}
		}
	}	

	@Override
	public void doTransform() {
		addItemFlowEndSubsetting();
		super.doTransform();
	}
	
}
