/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024, 2025 Model Driven Solutions, Inc.
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

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.NamespaceImport;
import org.omg.sysml.lang.sysml.VisibilityKind;

public abstract class ImportAdapter extends RelationshipAdapter {

	public ImportAdapter(Import element) {
		super(element);
	}
	
	public Import getTarget() {
		return (Import)super.getTarget();
	}
	
	@Override
	public void postProcess() {
		super.postProcess();
		
		// If the target Import is for a filtered import package, set its visibility to PUBLIC.
		Import target = getTarget();
		Namespace owningNamespace = target.getImportOwningNamespace();
		if (owningNamespace != null && owningNamespace.getOwningRelationship() instanceof NamespaceImport) {
			target.setVisibility(VisibilityKind.PUBLIC);
		}
	}
	
	// Additional operations
	
	public abstract void importMemberships(EList<Membership> importedMemberships, Set<Namespace> excluded);
	
}
