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

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Subclassification;
import org.omg.sysml.lang.sysml.SysMLPackage;

public class SubclassificationAdapter extends SpecializationAdapter {

	public SubclassificationAdapter(Subclassification element) {
		super(element);
	}
	
	@Override
	public Subclassification getTarget() {
		return (Subclassification)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		Subclassification obj = getTarget();
		
		// If the subclassifier is empty, then set it to the owningRelatedElement,
		// if this is a Classifier.
		Object subclassifier = obj.eGet(SysMLPackage.Literals.SUBCLASSIFICATION__SUBCLASSIFIER, false);
		if (subclassifier == null) {
			Element owner = obj.getOwningRelatedElement();
			if (owner instanceof Classifier) {
				obj.setSubclassifier((Classifier) owner);
			}
		}
	}
	
}
