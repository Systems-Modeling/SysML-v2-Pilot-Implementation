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

import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class PortConjugationAdapter extends ConjugationAdapter {

	public PortConjugationAdapter(PortConjugation element) {
		super(element);
	}
	
	@Override
	public PortConjugation getTarget() {
		return (PortConjugation)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		super.postProcess();
		
		PortConjugation obj = getTarget();
		
		// If the originalPortDefinition is empty, then set it to the owner of the conjugatedPortDefinition
		// (if that is a PortDefinition).
		Object originalPortDefinition = obj.eGet(SysMLPackage.Literals.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION, false);
		if (originalPortDefinition == null) {
			ConjugatedPortDefinition conjugatedPortDefinition = obj.getConjugatedPortDefinition();
			if (conjugatedPortDefinition != null) {
				Element conjugatedPortDefinitionOwner = conjugatedPortDefinition.getOwner();
				if (conjugatedPortDefinitionOwner instanceof PortDefinition) {
					obj.setOriginalPortDefinition((PortDefinition)conjugatedPortDefinitionOwner);
				}
			}
		}
	}
	
}
