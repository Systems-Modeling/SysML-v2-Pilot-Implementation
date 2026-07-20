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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class ReferenceSubsettingAdapter extends SubsettingAdapter {

	public ReferenceSubsettingAdapter(ReferenceSubsetting element) {
		super(element);
	}
	
	@Override
	public ReferenceSubsetting getTarget() {
		return (ReferenceSubsetting)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		ReferenceSubsetting obj = getTarget();
		
		// If the referencedFeature is empty, then set it to the last ownedRelatedElement
		// (which will be a Feature chain).
		Object referencedFeature = obj.eGet(SysMLPackage.Literals.REFERENCE_SUBSETTING__REFERENCED_FEATURE, false);
		if (referencedFeature == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setReferencedFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
}
