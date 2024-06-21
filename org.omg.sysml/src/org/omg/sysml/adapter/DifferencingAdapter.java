/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
 * Copyright (c) 2024 Budapest University of Technology and Economics
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

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Differencing;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class DifferencingAdapter extends RelationshipAdapter {

	public DifferencingAdapter(Differencing element) {
		super(element);
	}
	
	@Override
	public Differencing getTarget() {
		return (Differencing)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		Differencing obj = getTarget();
		
		// If a Differencing is parsed targeting a Feature chain, then the differencingType will be empty,
		// but the Differencing will own the differencingType. So, in this case, the differencingType should
		// be set to the (last) ownedRelatedelement.
		Object differencingType = obj.eGet(SysMLPackage.Literals.DIFFERENCING__DIFFERENCING_TYPE, false);
		if (differencingType == null) {
			// Handle a differencingType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setDifferencingType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
}
