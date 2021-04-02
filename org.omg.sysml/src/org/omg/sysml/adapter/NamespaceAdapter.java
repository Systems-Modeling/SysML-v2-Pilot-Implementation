/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;

public class NamespaceAdapter extends ElementAdapter {

	private EList<Membership> importedMembership = null;

	public NamespaceAdapter(Namespace element) {
		super(element);
	}
	
	public Namespace getTarget() {
		return (Namespace)super.getTarget();
	}
	
	public EList<Membership> getImportedMembership() {
		return importedMembership;
	}
	
	public EList<Membership> setImportedMembership(EList<Membership> importedMembership) {
		this.importedMembership = importedMembership;
		return importedMembership;
	}
	
	public void clearCaches() {
		importedMembership = null;
	}
	
}
