/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.sysml.util.repository;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.model.Element;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.NamespaceUtil;

public class EMFModelDelta {
	private static final String EXTENSION = "sysmlx";
	
	private final Map<EObject, Element> projectRoots;
	
	public EMFModelDelta(Map<EObject, Element> projectRoots) {
		this.projectRoots = projectRoots;
	}
	
	public Map<EObject, Element> getProjectRoots() {
		return projectRoots;
	}
	
	public Set<EObject> getProjectRootsAsNamespaces() {
		return projectRoots.keySet().stream().map(this::wrapInNamespaceIfNotNamespace).collect(Collectors.toSet());
	}
	
	private EObject wrapInNamespaceIfNotNamespace(EObject eObject) {
		if (eObject.eClass() == SysMLPackage.eINSTANCE.getNamespace()) {
			return eObject;
		} else {
			Namespace root = SysMLFactory.eINSTANCE.createNamespace();
			NamespaceUtil.addOwnedMemberTo(root, (org.omg.sysml.lang.sysml.Element) eObject);
			return root;
		}
	}
	
	public void apply(ResourceSet resourceSet, URI baseUri) throws IOException {
		for (var root : projectRoots.keySet()) {
			var dto = projectRoots.get(root);
			Object object = dto.get("@id");
			URI fileURI = baseUri.appendSegment(object.toString()).appendFileExtension(EXTENSION);
			Resource resource = resourceSet.createResource(fileURI);
			resource.getContents().add(wrapInNamespaceIfNotNamespace(root));
			ElementUtil.transformAll(resource, false);
			resource.save(Collections.EMPTY_MAP);
		}
	}
}
