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
 * 
 *****************************************************************************/

package org.omg.sysml.lang.sysml.util

import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.emf.ecore.resource.Resource
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Type
import org.eclipse.emf.common.util.URI

class SysMLLibraryUtil {
	
	public static final String DEFAULT_MODEL_LIBRARY_PATH = "/resource/sysml.library";
	
	static String modelLibraryPath = DEFAULT_MODEL_LIBRARY_PATH;
	
	def static setModelLibraryDirectory(String dir) {
		val uri = URI.createFileURI(dir);
		modelLibraryPath = uri.devicePath ?: uri.path;
	}

	def static getModelLibraryPath() {
		modelLibraryPath
	}
	
	def static IModelLibraryProvider getInstance(Resource resource) {
		try {
			IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(resource?.getURI)?.get(IModelLibraryProvider)
		} catch (Exception e) {
			System.out.println("[SysMLLibraryUtil] Cannot get library provider: " + e)
			null
		}
	}
	
	def static Element getLibraryElement(Element context, String name) {		
		return getInstance(context.eResource)?.getElement(context, name)
	}
	
	def static Type getLibraryType(Element context, String... defaultNames) {
		for (String defaultName: defaultNames) {
			val element = getLibraryElement(context, defaultName);
			if (element instanceof Type) {
				return element;
			}
		}
		return null;
	}
}