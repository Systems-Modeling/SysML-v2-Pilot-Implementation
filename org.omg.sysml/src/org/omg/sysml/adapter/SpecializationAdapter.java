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
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class SpecializationAdapter extends RelationshipAdapter {

	public SpecializationAdapter(Specialization element) {
		super(element);
	}
	
	@Override
	public Specialization getTarget() {
		return (Specialization)super.getTarget();
	}
	
	public void postProcess() {
		Specialization obj = getTarget();
		
		// If general is empty, then set it to the last ownedRelatedElement (which will be a Feature chain).
		Object general = obj.eGet(SysMLPackage.Literals.SPECIALIZATION__GENERAL, false);
		if (general == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setGeneral((Feature)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
		
		// If specific is empty, then set it to the owningRelatedElement, if that is a Type.
		// Otherwise set it to the first ownedRelatedElement (which will be a FeatureChain).
		Object specific = obj.eGet(SysMLPackage.Literals.SPECIALIZATION__SPECIFIC, false);
		if (specific == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Type) {
				obj.setSpecific((Type)owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setSpecific((Feature)ownedRelatedElements.get(0));
				}
			}
		}
	}
	
}
