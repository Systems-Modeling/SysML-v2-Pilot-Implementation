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
import org.omg.sysml.lang.sysml.Intersecting;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class IntersectingAdapter extends RelationshipAdapter {

	public IntersectingAdapter(Intersecting element) {
		super(element);
	}
	
	@Override
	public Intersecting getTarget() {
		return (Intersecting)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		Intersecting obj = getTarget();
		
		// If a Intersecting is parsed targeting a Feature chain, then the intersectingType will be empty,
		// but the Intersecting will own the intersectingType. So, in this case, the intersectingType should
		// be set to the (last) ownedRelatedelement.
		Object intersectingType = obj.eGet(SysMLPackage.Literals.INTERSECTING__INTERSECTING_TYPE, false);
		if (intersectingType == null) {
			// Handle a intersectingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setIntersectingType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
}
