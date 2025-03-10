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
package org.omg.sysml.xmi

import com.google.inject.Guice
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.ISetup
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.xtext.resource.IResourceServiceProvider

class SysMLxStandaloneSetup implements ISetup {
	
	@Inject
	FileExtensionProvider fileExtensionProvider
	
	@Inject
	IResourceServiceProvider resourceServiceProvider
	
	@Inject
	Resource.Factory resourceFactory
	
	override createInjectorAndDoEMFRegistration() {
		val injector = createInjector()
		injector.injectMembers(this)
		
		fileExtensionProvider.fileExtensions.forEach[ 
			IResourceServiceProvider.Registry.INSTANCE.extensionToFactoryMap.put(it, resourceServiceProvider)
			Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(it, resourceFactory)
		]
		
		injector
	}
	
	static def doSetup(){
		new SysMLxStandaloneSetup().createInjectorAndDoEMFRegistration
	}
	
	def createInjector() {
		return Guice.createInjector(new SysMLxRuntimeModule());
	}
}
