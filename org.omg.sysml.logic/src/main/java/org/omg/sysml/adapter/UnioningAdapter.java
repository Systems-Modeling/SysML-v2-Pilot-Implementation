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
import org.omg.sysml.lang.sysml.Unioning;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class UnioningAdapter extends RelationshipAdapter {

	public UnioningAdapter(Unioning element) {
		super(element);
	}
	
	@Override
	public Unioning getTarget() {
		return (Unioning)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		Unioning obj = getTarget();
		
		// If a Unioning is parsed targeting a Feature chain, then the unioningType will be empty,
		// but the Unioning will own the unioningType. So, in this case, the unioningType should
		// be set to the (last) ownedRelatedelement.
		Object unioningType = obj.eGet(SysMLPackage.Literals.UNIONING__UNIONING_TYPE, false);
		if (unioningType == null) {
			// Handle a intersectingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setUnioningType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
}
