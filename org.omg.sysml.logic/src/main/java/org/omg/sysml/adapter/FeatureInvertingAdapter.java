/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
 * Copyright (c) 2024 Budapest University of Technology and Economics
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

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.FeatureInverting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class FeatureInvertingAdapter extends RelationshipAdapter {

	public FeatureInvertingAdapter(FeatureInverting element) {
		super(element);
	}
	
	@Override
	public FeatureInverting getTarget() {
		return (FeatureInverting)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		FeatureInverting obj = getTarget();
		
		// If the featureInverted is empty, then set it to the owningRelatedElement of the FeatureInverting,
		// if that is a Feature, otherwise set it to the first ownedRelatedElement (which will be a
		// Feature chain).
		Object featureInverted = obj.eGet(SysMLPackage.Literals.FEATURE_INVERTING__FEATURE_INVERTED, false);
		if (featureInverted == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				// Handle FeatureInverting owned by the featureInverted.
				obj.setFeatureInverted((Feature)owner);
			} else {
				// Handle featureInverted that is a Feature chain.
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setFeatureInverted((Feature)ownedRelatedElements.get(0));
				}
			}
		}
		
		// If the invertingFeature is empty, then set it to the last ownedRelatedElement
		// (which will be a Feature chain).
		Object invertingFeature = obj.eGet(SysMLPackage.Literals.FEATURE_INVERTING__INVERTING_FEATURE, false);
		if (invertingFeature == null) {
			// Handle invertingFeature that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setInvertingFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
}
