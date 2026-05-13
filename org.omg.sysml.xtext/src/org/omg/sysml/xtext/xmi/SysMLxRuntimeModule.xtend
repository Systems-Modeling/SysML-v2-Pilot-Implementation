/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025  Model Driven Solutions, Inc.
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
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
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