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
