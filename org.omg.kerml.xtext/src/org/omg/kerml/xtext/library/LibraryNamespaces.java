/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
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
 */
package org.omg.kerml.xtext.library;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.omg.sysml.lang.sysml.Namespace;

import com.google.inject.Inject;

public class LibraryNamespaces {
	
	@Inject
	private LibraryIndexCache indexCache;
	
	public boolean canContainMember(Namespace namespace, QualifiedName prefix, QualifiedName member) {
		
		if (indexCache == null || indexCache.isDoNotUse()) {
			return true;
		};
		
		Resource resourceOfNamespace = namespace.eResource();
		
		LibraryIndex index = indexCache.getIndexFor(resourceOfNamespace);
		
		if (index == null) {
			return true;
		}
		
		var nsQn = namespace.getQualifiedName();
		
		if (nsQn == null || nsQn.isEmpty() || !index.containsNamespace(nsQn)) {
			return true;
		}
		
		member = member.startsWith(prefix) ? member.skipFirst(prefix.getSegmentCount()) : member;
		
		return namespaceContainsQn(index, nsQn, member);
	}	

	private boolean namespaceContainsQn(LibraryIndex index, String ns, QualifiedName qn)
	{
		List<String> segments = qn.getSegments();
		
		for (String segment: segments) {
			if (!index.containsMember(ns, segment)) {
				return false;
			}
			
			//TODO use Qualified name interfaces instead, this may require change in the json generator from :: to .
			ns += "::" + segment;
		}
		
		return !segments.isEmpty();
	}
	
}
