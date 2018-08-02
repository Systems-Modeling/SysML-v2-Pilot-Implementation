/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
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
 *  Zoltan Kiss
 *  Balazs Grill
 * 
 *****************************************************************************/
package org.omg.sysml.scoping

import org.eclipse.xtext.naming.QualifiedName
import org.omg.sysml.lang.sysml.Element

interface IScopeTraversalFragment {
	
	/**
	 * Traverses the given context in order to enumerate all accessible elements. Implementations are expected
	 * to provide results via calling the visitor. Qualified names shall be the names which the elements are
	 * accessible from the given context. Callers may then transform this qualified name (e.g. adding a prefix)
	 * if needed.
	 * 
	 * Another visitor lambda, called 'follow' is called when the implementation enumerates an element which can extend the
	 * current scope.
	 */
	def void traverseScope(Element context, (QualifiedName, Element)=>void visitor,  (QualifiedName, Element)=>void follow);
	
	
}