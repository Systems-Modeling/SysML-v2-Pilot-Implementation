/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.CrossMultiplying;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class CrossMultiplyingAdapter extends RelationshipAdapter {

	public CrossMultiplyingAdapter(CrossMultiplying element) {
		super(element);
	}
	
	@Override
	public CrossMultiplying getTarget() {
		return (CrossMultiplying)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		CrossMultiplying obj = getTarget();
		
		// If a CrossMultiply is parsed targeting a Feature chain, then the multiplicandType will be empty,
		// but the CrossMultiply will own the multiplicandType. So, in this case, the multiplicandType should
		// be set to the (last) ownedRelatedelement.
		Object multiplicandType = obj.eGet(SysMLPackage.Literals.CROSS_MULTIPLYING__MULTIPLYING_TYPE, false);
		if (multiplicandType == null) {
			// Handle a multiplicandType that is a Feature chain.
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setMultiplyingType((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
}
