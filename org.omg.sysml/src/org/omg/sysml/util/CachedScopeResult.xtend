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
package org.omg.sysml.util

import org.eclipse.xtext.resource.IEObjectDescription

class CachedScopeResult {
	IEObjectDescription description
	boolean parentScopesChecked
	
	new(IEObjectDescription description, boolean parentScopesChecked) {
		this.description = description
		this.parentScopesChecked = parentScopesChecked
	}
	
	def update(IEObjectDescription description, boolean hierarchyExplored){
		this.description = description
		this.parentScopesChecked = hierarchyExplored
	}
	
	def parentScopesChecked(){
		parentScopesChecked
	}
	
	def getDescription(){
		description
	}
}
