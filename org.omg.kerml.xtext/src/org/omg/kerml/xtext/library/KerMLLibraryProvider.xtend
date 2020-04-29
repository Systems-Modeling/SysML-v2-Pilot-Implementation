/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2020 Model Driven Solutions, Inc.
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
 *  Zoltan Ujhelyi, MDS
 * 
 *****************************************************************************/

package org.omg.kerml.xtext.library

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.omg.sysml.lang.sysml.Element
import org.eclipse.emf.ecore.util.EcoreUtil
import org.omg.sysml.lang.sysml.util.IModelLibraryProvider
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.omg.sysml.lang.sysml.SysMLPackage

@Singleton
class KerMLLibraryProvider implements IModelLibraryProvider {
		
 	@Inject
	IQualifiedNameConverter nameConverter
	
	@Inject
	ResourceDescriptionsProvider resourceDescriptionProvider
	
	override Element getElement(Element context, String name) {
		if (context === null) {
			return null
		} else {
			val qname = nameConverter.toQualifiedName(name)
			val description = resourceDescriptionProvider.getResourceDescriptions(context.eResource()).
					getExportedObjects(SysMLPackage.Literals.ELEMENT, qname, false).head
			return if (description === null) null else
				EcoreUtil.resolve(description.EObjectOrProxy, context) as Element
		}
	}
	
}