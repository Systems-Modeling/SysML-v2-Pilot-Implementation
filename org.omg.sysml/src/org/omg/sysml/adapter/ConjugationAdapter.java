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
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

public class ConjugationAdapter extends RelationshipAdapter {

	public ConjugationAdapter(Conjugation element) {
		super(element);
	}
	
	@Override
	public Conjugation getTarget() {
		return (Conjugation)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		Conjugation obj = getTarget();
		
		// If the conjugatedType is not set, then set it to the owningRelatedElement, if this is a Type,
		// otherwise set it to the first ownedRelatedElement.
		Object conjugatedType = obj.eGet(SysMLPackage.Literals.CONJUGATION__CONJUGATED_TYPE, false);
		if (conjugatedType == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Type) {
				obj.setConjugatedType((Type)owner);
			} else {
				EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
				if (!ownedRelatedElements.isEmpty()) {
					obj.setConjugatedType((Type)ownedRelatedElements.get(0));
				}
			}
		}
		
		// If the originalType is not set, set it to the last ownedRelatedElement.
		Object originalType = obj.eGet(SysMLPackage.Literals.CONJUGATION__ORIGINAL_TYPE, false);
		if (originalType == null) {
			EList<Element> ownedRelatedElements = obj.getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				obj.setOriginalType((Type)ownedRelatedElements.get(ownedRelatedElements.size() - 1));
			}
		}
	}
	
}
