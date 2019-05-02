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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/

package org.omg.sysml.lang.sysml.util

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.scoping.AlfScopeProvider
import java.util.Map

@Singleton
class SysMLLibraryProvider implements IModelLibraryProvider {
	
	@Inject
	AlfScopeProvider scopeProvider
	
	@Inject
	IQualifiedNameConverter nameConverter
	
	protected Map<String, Element> elementCache = newHashMap
	
	protected def EObject filePackage(Element element) {
		var pack = element
		while (pack.owner !== null) {
			pack = pack.owner
		}
		return pack
	}
	
	override Element getElement(Element context, EReference reference, String name) {
		var element = elementCache.get(name);
		if (element === null) {
			var description = scopeProvider.getScope(context.filePackage, reference).getSingleElement(nameConverter.toQualifiedName(name))
			if (description !== null) {
				element = description.EObjectOrProxy as Element
				elementCache.put(name, element)
			}
		}
		return element		
	}
	
}