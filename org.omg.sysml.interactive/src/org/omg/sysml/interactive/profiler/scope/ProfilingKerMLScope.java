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
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.omg.kerml.xtext.scoping.KerMLScope;
import org.omg.kerml.xtext.scoping.KerMLScopeProvider;
import org.omg.sysml.interactive.profiler.linking.ProfilingKerMLLinkingService;
import org.omg.sysml.interactive.profiler.results.LinkStep;
import org.omg.sysml.interactive.profiler.results.ScopeResult;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;

import com.google.common.base.Stopwatch;

public class ProfilingKerMLScope extends KerMLScope
{
	public static final Stopwatch SCOPE_TIME = Stopwatch.createUnstarted();
	public static long SCOPE_CALL_COUNT = 0;

	public ProfilingKerMLScope(IScope parent, Namespace ns, EClass referenceType, KerMLScopeProvider scopeProvider,
			boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element element, Element skip) {
		super(parent, ns, referenceType, scopeProvider, isInsideScope, isFirstScope, isRedefinition, element, skip);
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		SCOPE_CALL_COUNT++;
		
		if (!SCOPE_TIME.isRunning()) SCOPE_TIME.start();
		
		SCOPE_TIME.stop();
		var localWatch = Stopwatch.createUnstarted();
		
		LinkStep oldValue = ProfilingKerMLLinkingService.currentStep;
		ProfilingKerMLLinkingService.currentStep = new ScopeResult(name, ns.getQualifiedName() != null ? ns.getQualifiedName().toString() : ns.getName(), referenceType.getName(), oldValue);
		SCOPE_TIME.start();
		
		localWatch.start();
		IEObjectDescription singleElement = super.getSingleElement(name);
		localWatch.stop();
		
		if (!SCOPE_TIME.isRunning()) SCOPE_TIME.start();
		
		if (isFirstScope)
			SCOPE_TIME.stop();
		
		ProfilingKerMLLinkingService.currentStep.setDuration(localWatch.elapsed());
		ProfilingKerMLLinkingService.currentStep = oldValue;
		
		return singleElement;
	}
	
}
