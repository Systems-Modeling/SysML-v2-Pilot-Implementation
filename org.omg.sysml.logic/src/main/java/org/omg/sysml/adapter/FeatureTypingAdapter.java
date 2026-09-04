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
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class FeatureTypingAdapter extends SpecializationAdapter {

	public FeatureTypingAdapter(FeatureTyping element) {
		super(element);
	}
	
	@Override
	public FeatureTyping getTarget() {
		return (FeatureTyping)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		FeatureTyping obj = getTarget();
		
		// If the type is empty, then set it to the first owned related element
		// (which will be a Feature chain).
		Object type = obj.eGet(SysMLPackage.Literals.FEATURE_TYPING__TYPE, false);
		if (type == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setType((Feature)ownedRelatedElements.get(0));
			}
		}
		
		// If the typedFeature is empty, then set it to the owningRelatedElement (if that is a Feature).
		Object typedFeature = obj.eGet(SysMLPackage.Literals.FEATURE_TYPING__TYPED_FEATURE, false);
		if (typedFeature == null) {
			Element owningRelatedElement = obj.getOwningRelatedElement();
			if (owningRelatedElement instanceof Feature) {
				obj.setTypedFeature((Feature) owningRelatedElement);
			}
		}
	}
	
}
