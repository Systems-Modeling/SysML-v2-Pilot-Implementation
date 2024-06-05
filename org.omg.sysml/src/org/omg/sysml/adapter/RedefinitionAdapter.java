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
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class RedefinitionAdapter extends SubsettingAdapter {

	public RedefinitionAdapter(Redefinition element) {
		super(element);
	}
	
	@Override
	public Redefinition getTarget() {
		return (Redefinition)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		Redefinition obj = getTarget();
		
		// If the redefiningFeature is empty, then set it to the owningRelatedElement, if that is a Feature.
		// Otherwise, set it to the first ownedRelatedElement (which will be a Feature chain).
		Object redefiningFeature = obj.eGet(SysMLPackage.Literals.REDEFINITION__REDEFINING_FEATURE, false);
		if (redefiningFeature == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Feature) {
				obj.setRedefiningFeature((Feature) owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setRedefiningFeature((Feature)ownedRelatedElements.get(0));
				}
			}
		}
		
		Object redefinedFeature = obj.eGet(SysMLPackage.Literals.REDEFINITION__REDEFINED_FEATURE, false);
		if (redefinedFeature == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setRedefinedFeature((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
}
