/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2020 Model Driven Solutions, Inc.
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
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/

package org.omg.sysml.lang.sysml.util

import org.omg.sysml.lang.sysml.Element

interface IModelLibraryProvider {
	
	/**
	 * Returns a model element with the given qualified name,
	 * using the given parameter element as a context for
	 * the search, e.g. to identify where to look for library model elements.
	 * 
	 * <p>
	 * <strong>Important</strong>: the implementation does only consider qualified
	 * names calculated from the containment hierarchy. Querying for alternate
	 * names like relying on generalizations or aliases is not supported here.
	 */
	def Element getElement(Element context, String name)
	
}