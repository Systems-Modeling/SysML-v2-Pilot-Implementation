/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.scoping

import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Package
import org.eclipse.emf.ecore.EReference
import java.util.Set
import org.omg.sysml.lang.sysml.Membership
import org.eclipse.xtext.naming.QualifiedName
import java.util.Map
import org.omg.sysml.lang.sysml.Element

class AlfRootScope extends AlfScope {
	
	new(IScope parent, Package pack, EReference reference, Set<Membership> visitedMemberships, AlfScopeProvider scopeProvider) {
		super(parent, pack, reference, visitedMemberships, scopeProvider)
	}
	
	override protected Map<Element, Set<QualifiedName>> resolve(QualifiedName targetqn) {
		
		
		val pack = getPackage()
		val packQn = QualifiedName.create(pack.name)
		if (targetqn !== null && !targetqn.startsWith(packQn)) {
			return emptyMap
		} else {
			val effectiveqn = 
				if (targetqn === null) null
				else QualifiedName.create(targetqn.segments.subList(1, targetqn.segmentCount))
	//		pack.resolve(packQn, elements, false, true, newHashSet, visited, targetqn)
			val elements = newHashMap
			val visited = newHashSet
			super.resolve(effectiveqn).entrySet.forEach[entry | 
				entry.value.forEach[ qn |
					elements.addName(
						if (qn.startsWith(packQn)) qn else packQn.append(qn),
						entry.key, visited, targetqn)
				]		
			]
			elements.addName(packQn, pack, visited, targetqn)
	
			return elements	
		}
	}
	
}