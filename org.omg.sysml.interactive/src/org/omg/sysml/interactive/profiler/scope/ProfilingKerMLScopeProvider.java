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
import org.eclipse.xtext.scoping.IScope;
import org.omg.kerml.xtext.scoping.KerMLScope;
import org.omg.kerml.xtext.scoping.KerMLScopeProvider;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;

public class ProfilingKerMLScopeProvider extends KerMLScopeProvider {
	
	@Override
	protected KerMLScope createScope(IScope outerscope, Namespace pack, EClass referenceType,
			KerMLScopeProvider scopeProvider, boolean isInsideScope, boolean isFirstScope, boolean isRedefinition,
			Element element, Element skip, boolean membershipImport) {
		
		return new ProfilingKerMLScope(outerscope, pack, referenceType, scopeProvider, isInsideScope, isFirstScope, isRedefinition, element, skip);
	}

}
