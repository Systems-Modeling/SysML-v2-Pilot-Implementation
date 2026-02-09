/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2026 Model Driven Solutions, Inc.
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

import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FlowEnd;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.ImplicitGeneralizationMap;
import org.omg.sysml.util.TypeUtil;

public class FlowEndAdapter extends FeatureAdapter {

	public FlowEndAdapter(FlowEnd element) {
		super(element);
	}
	
	@Override
	public FlowEnd getTarget() {
		return (FlowEnd)super.getTarget();
	}
		
	// Implicit Generalization
	
	@Override
	public Stream<Feature> getSubsettedNotRedefinedFeatures() {
		addFlowEndSubsetting();
		return super.getSubsettedNotRedefinedFeatures();
	}
	
	@Override
	public void computeImplicitGeneralTypes() {
		// Note: Do not add item flow end subsetting here, to avoid circularity due to name resolution.
		addComputedRedefinitions(null);
	}
		
	// Transformation
	
	/**
	 * @satisfies validateRedefinitionDirectionConformance 
	 * (For the case of a FlowEnd feature.)
	 */
	public void addFlowFeatureDirection() {
		FlowEnd target = getTarget();
		EList<Feature> ownedFeatures = target.getOwnedFeature();
		if (!ownedFeatures.isEmpty()) {
			Feature flowFeature = ownedFeatures.get(0);
			EList<Redefinition> redefinitions = flowFeature.getOwnedRedefinition();
			if (!redefinitions.isEmpty()) {
				// Note: This cannot be done during parse post-processing because it may require proxy resolution.
				Feature redefinedFeature = redefinitions.get(0).getRedefinedFeature();
				if (redefinedFeature != null) {
					flowFeature.setDirection(target.directionOf(redefinedFeature));
				}
			}
		}		
	}
	
	public void addFlowEndSubsetting() {
		FlowEnd target = getTarget();
		if (target.getOwnedSubsetting().isEmpty()) {
			EList<Feature> ownedFeatures = getTarget().getOwnedFeature();
			if (!ownedFeatures.isEmpty()) {
				FeatureUtil.getRedefinedFeaturesOf(ownedFeatures.get(0)).stream().findFirst().
					filter(f->f != null).
					map(Feature::getOwningType).
					filter(Feature.class::isInstance).
					ifPresent(owner->
						addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), owner)
					);
			}
		}
	}
	
	/**
	 * @satisfies checkFeatureFlowFeatureRedefinition
	 */
	public void addFlowFeatureRedefinition() {
		FlowEnd target = getTarget();
		Element owner = target.getOwner();
		if (owner instanceof Feature) {
			EList<Feature> ownedFeatures = target.getOwnedFeature();
			if (!ownedFeatures.isEmpty()) {
				Feature flowFeature = ownedFeatures.get(0);
				int i = ((Feature)owner).getEndFeature().indexOf(target);
				if (i == 0 || i == 1) {
					TypeUtil.addImplicitGeneralTypeTo(flowFeature, 
							SysMLPackage.eINSTANCE.getRedefinition(),
							getLibraryType(ImplicitGeneralizationMap.getDefaultSupertypeFor(
									target.getClass(), i == 0? "sourceOutput": "targetInput")));
					TypeUtil.setIsAddImplicitGeneralTypesFor(flowFeature, false);
				}
			}
		}
	}

	@Override
	public void doTransform() {
		addFlowEndSubsetting();
		addFlowFeatureRedefinition();
		addFlowFeatureDirection();
		super.doTransform();
	}
	
}
