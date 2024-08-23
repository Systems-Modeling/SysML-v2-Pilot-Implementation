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
package org.omg.sysml.interactive.profiler.scope;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.omg.kerml.xtext.scoping.KerMLGlobalScope;
import org.omg.kerml.xtext.scoping.KerMLScopeProvider;
import org.omg.sysml.interactive.profiler.Profiler;

import com.google.common.base.Predicate;

public class ProfilingKerMLGlobalScope extends KerMLGlobalScope {

	private static final String GET_SINGLE_ELEMENT_OPERATION = "KerMLGlobalScope#getSingleElement";
	private Profiler profiler;
	
	public ProfilingKerMLGlobalScope(IScope outer, Resource resource, Predicate<IEObjectDescription> filter,
			Predicate<IEObjectDescription> rootFilter, EClass type, KerMLScopeProvider scopeProvider, Profiler timeProfiler) {
		super(outer, resource, filter, rootFilter, type, scopeProvider);
		
		this.profiler = timeProfiler;
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		
		profiler.operationStarted(this, GET_SINGLE_ELEMENT_OPERATION, "qn = " + name.toString());
		
		IEObjectDescription singleElement = super.getSingleElement(name);
		
		profiler.operationFinished(this, GET_SINGLE_ELEMENT_OPERATION, ProfilingKerMLScope.createReturnValue(singleElement));
		
		return singleElement;
	}
}
