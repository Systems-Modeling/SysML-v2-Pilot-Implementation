/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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

import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.lang.sysml.LibraryPackage;

public class LibraryPackageAdapter extends PackageAdapter {

	public final String KERML_LIBRARY_BASE_URI = "https://www.omg.org/spec/KerML/";
	public final String SYSML_LIBRARY_BASE_URI = "https://www.omg.org/spec/SysML/";
	
	// UUID for "NameSpace_URL", per ITU-T Rec. X.667 (10/2012), Annex D.9
	public final UUID UUID_NAMESPACE_URL = UUID.fromString("6ba7b811-9dad-11d1-80b4-00c04fd430c8");

	public LibraryPackageAdapter(LibraryPackage element) {
		super(element);
	}
	
	public LibraryPackage getTarget() {
		return (LibraryPackage)super.getTarget();
	}
	
	/**
	 * If this is a standard library Package, then create the elementId as a named-based UUID
	 * using a URL constructed from the KerML or SysML base URI and the Package's name.
	 */
	@Override
	public String createElementId() {
		LibraryPackage target = getTarget();
		
		if (target.isStandard()) {
			Resource resource = target.eResource();
			if (resource != null) {
				String uri = resource.getURI().toString().contains("Kernel")? KERML_LIBRARY_BASE_URI: SYSML_LIBRARY_BASE_URI;
				String qualifiedName = target.getQualifiedName();
				if (qualifiedName != null) {
					return ElementUtil.constructNameUUID(UUID_NAMESPACE_URL, uri + qualifiedName).toString();
				}
			}
		}
		
		return super.createElementId();
	}
	
}
