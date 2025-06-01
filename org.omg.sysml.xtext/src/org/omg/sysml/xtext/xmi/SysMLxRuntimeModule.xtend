/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025  Model Driven Solutions, Inc.
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
package org.omg.sysml.xtext.xmi

import com.google.inject.Binder
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions
import org.omg.kerml.xtext.naming.KerMLQualifiedNameConverter
import org.omg.kerml.xtext.naming.KerMLQualifiedNameProvider
import org.omg.sysml.lang.sysml.util.IModelLibraryProvider
import org.omg.sysml.xtext.library.SysMLLibraryProvider

class SysMLxRuntimeModule extends AbstractGenericResourceRuntimeModule {
	
	public val EXTENSION = 'sysmlx'
	public static val SYSMLX_LANGUAGE_NAME = 'org.omg.sysml.sysmlx'
	
	override protected getFileExtensions() {
		EXTENSION
	}
	
	override protected getLanguageName() {
		SYSMLX_LANGUAGE_NAME
	}
	
	override configure(Binder binder) {
		super.configure(binder)
		binder.bind(Resource.Factory).to(XMIResourceFactoryImpl)
		binder.bind(IResourceDescriptions).to(ResourceSetBasedResourceDescriptions)
	}
	
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		KerMLQualifiedNameProvider
	}
	
	def Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		KerMLQualifiedNameConverter
	}
	
	def Class<? extends IModelLibraryProvider> bindIModelLLibraryProvider() {
		SysMLLibraryProvider
	}
}