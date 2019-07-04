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

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.omg.sysml.lang.sysml.Package
import java.util.Map
import org.omg.sysml.lang.sysml.Element
import java.util.Set

class AlfRootScope extends AlfScope {
	
	new(IScope parent, Package pack, EReference reference, AlfScopeProvider scopeProvider) {
		super(parent, pack, reference, scopeProvider)
	}
	
	protected override void resolve() {
		val packqn = QualifiedName.create(pack.name)		
		if (targetqn === null) {
			super.resolve()
			elements = elements.addQualification(packqn)
			elements.addName(packqn, pack)		
		} else if (targetqn == packqn) {
			elements.addName(packqn, pack)
		} else if (targetqn.startsWith(packqn)) {
			targetqn = QualifiedName.create(targetqn.segments.subList(1, targetqn.segmentCount))
			super.resolve()
			elements = elements.addQualification(packqn)
		}
	}
	
	protected def addQualification(Map<Element, Set<QualifiedName>> elements, QualifiedName packqn) {
		val newElements = newHashMap
		elements.entrySet.forEach[entry | 
				entry.value.forEach[ qn |
					newElements.addName(packqn.append(qn),entry.key)
				]		
			]
		newElements
	}
	
}