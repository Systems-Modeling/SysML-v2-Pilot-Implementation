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
package org.omg.kerml.xmi

import com.google.inject.Binder
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions
import org.omg.kerml.xtext.library.KerMLLibraryProvider
import org.omg.kerml.xtext.naming.KerMLQualifiedNameConverter
import org.omg.kerml.xtext.naming.KerMLQualifiedNameProvider
import org.omg.sysml.lang.sysml.util.IModelLibraryProvider

class KerMLxRuntimeModule extends AbstractGenericResourceRuntimeModule{
	
	override protected getFileExtensions() {
		'kermlx'
	}
	
	override protected getLanguageName() {
		'org.omg.kerml.kermlx'
	}
	
	override configure(Binder binder) {
		super.configure(binder)
		binder.bind(Resource.Factory).to(XMIResourceFactoryImpl)
		binder.bind(IResourceDescriptions).to(ResourceSetBasedResourceDescriptions)
	}
	
	override bindIQualifiedNameProvider() {
		KerMLQualifiedNameProvider
	}
	
	def Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		KerMLQualifiedNameConverter
	}
	
	def Class<? extends IModelLibraryProvider> bindIModelLLibraryProvider() {
		KerMLLibraryProvider
	}
}