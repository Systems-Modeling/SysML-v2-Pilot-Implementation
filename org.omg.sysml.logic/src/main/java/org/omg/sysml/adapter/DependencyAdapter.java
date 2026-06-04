/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.omg.sysml.lang.sysml.Dependency;
import org.omg.sysml.lang.sysml.Element;

public class DependencyAdapter extends RelationshipAdapter {

	public DependencyAdapter(Dependency element) {
		super(element);
	}
	
	public Dependency getTarget() {
		return (Dependency)super.getTarget();
	}
	
	public void postProcess() {
		Dependency target = getTarget();
		
		// Add all ownedRelatedElements to supplier.
		EObjectResolvingEList<Element> suppliers = (EObjectResolvingEList<Element>)target.getSupplier();
		EList<Element> ownedRelatedElements = target.getOwnedRelatedElement();
		ownedRelatedElements.stream().forEachOrdered(suppliers::addUnique);
	}

}
