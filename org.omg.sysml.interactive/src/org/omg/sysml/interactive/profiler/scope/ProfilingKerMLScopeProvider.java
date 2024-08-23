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

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.omg.kerml.xtext.scoping.KerMLScope;
import org.omg.kerml.xtext.scoping.KerMLScopeProvider;
import org.omg.sysml.interactive.profiler.Profiler;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;

import com.google.inject.Inject;

public class ProfilingKerMLScopeProvider extends KerMLScopeProvider {
	
	@Inject
	private Profiler profiler;
	
	@Override
	protected KerMLScope createKerMLScope(IScope outerscope, Namespace pack, EReference reference,
			boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
		return new ProfilingKerMLScope(outerscope, pack, reference.getEReferenceType(), this, isInsideScope, isFirstScope, isRedefinition, element, skip, profiler);
	}
}
