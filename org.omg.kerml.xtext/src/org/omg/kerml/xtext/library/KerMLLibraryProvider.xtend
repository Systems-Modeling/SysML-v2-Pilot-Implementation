/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2020, 2026 Model Driven Solutions, Inc.
  *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * (at your option) any later version.
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
 *  Zoltan Ujhelyi, MDS
 * 
 *****************************************************************************/

package org.omg.kerml.xtext.library

import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.omg.sysml.lang.sysml.Element
import org.eclipse.emf.ecore.util.EcoreUtil
import org.omg.sysml.logic.api.IModelLibraryProvider
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.omg.sysml.lang.sysml.SysMLPackage

@Singleton
class KerMLLibraryProvider implements IModelLibraryProvider {
		
 	@Inject
	IQualifiedNameConverter nameConverter
	
	@Inject
	ResourceDescriptionsProvider resourceDescriptionProvider
	
	override Element getElement(Element context, String name) {
		if (context?.eResource()?.getResourceSet() === null || name === null) {
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
