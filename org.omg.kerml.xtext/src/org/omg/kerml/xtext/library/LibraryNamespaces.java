/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2024 Model Driven Solutions, Inc.
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
package org.omg.kerml.xtext.library;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.omg.kerml.xtext.scoping.KerMLScope;
import org.omg.sysml.lang.sysml.Namespace;

import com.google.inject.Inject;

/**
 * Core logic for determining if a reference is resolvable from a {@link Namespace}.
 * Used by the {@link KerMLScope} to skip unnecessary searches in Namespaces.
 */
public class LibraryNamespaces {
	
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private ILibraryIndexProvider libraryIndexProvider;
	
	public boolean canContainMember(Namespace namespace, QualifiedName prefix, QualifiedName memberQn) {
		
		if (memberQn == null) {
			return true;
		}
		
		if (libraryIndexProvider.isIndexDisabled()) {
			return true;
		};
		
		Resource resourceOfNamespace = namespace.eResource();
		
		if (resourceOfNamespace == null) {
			return true;
		}
		
		LibraryIndex index = libraryIndexProvider.getIndexFor(resourceOfNamespace);
		
		var namespaceFQN = qualifiedNameProvider.getFullyQualifiedName(namespace);
		
		if (namespaceFQN == null || namespaceFQN.isEmpty() || !index.containsNamespace(qualifiedNameConverter.toString(namespaceFQN))) {
			return true;
		}
		
		memberQn = memberQn.startsWith(prefix) ? memberQn.skipFirst(prefix.getSegmentCount()) : memberQn;
		
		return canNamespaceContainQn(index, namespaceFQN, memberQn);
	}	
	
	private boolean canNamespaceContainQn(LibraryIndex index, QualifiedName nestingNamespace, QualifiedName member)
	{
		List<String> segments = member.getSegments();
		
		return segments.isEmpty() || index.containsMember(qualifiedNameConverter.toString(nestingNamespace), segments.get(0));
	}
}
