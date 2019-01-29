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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/

package org.omg.sysml.lang.sysml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.omg.sysml.AlfStandaloneSetup;

import com.google.common.base.Predicates;
import com.google.inject.Inject;

public class SysMLLibraryUtil {
	
	@Inject
	private IGlobalScopeProvider globalScope;
	
	@Inject
	private IQualifiedNameConverter nameConverter;
	
	private static SysMLLibraryUtil INSTANCE = new AlfStandaloneSetup().createInjector().getInstance(SysMLLibraryUtil.class);
	
	public static EObject getLibraryElement(EObject context, EReference reference, String name) {
		IEObjectDescription element = INSTANCE.globalScope.getScope(context.eResource(), reference, Predicates.alwaysTrue()).
				getSingleElement(INSTANCE.nameConverter.toQualifiedName(name));
		return element == null? null: element.getEObjectOrProxy();
	}

}
