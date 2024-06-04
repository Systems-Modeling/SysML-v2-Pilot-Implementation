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

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.omg.sysml.interactive.profiler.linking.ProfilingKerMLLinkingService;
import org.omg.sysml.interactive.profiler.results.LinkStep;
import org.omg.sysml.interactive.profiler.results.ScopeResult;

import com.google.common.base.Stopwatch;

public class ProfilableGlobalScopeWrapper extends ProfilableScopeWrapper {

	public static final Stopwatch GLOBAL_SCOPE_TIME = Stopwatch.createUnstarted();
	public static long GLOBAL_SCOPE_CALL_COUNT = 0;
	
	public ProfilableGlobalScopeWrapper(IScope wrappedScope) {
		super(wrappedScope);
	}
	
	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		GLOBAL_SCOPE_CALL_COUNT++;
		
		if (!GLOBAL_SCOPE_TIME.isRunning()) GLOBAL_SCOPE_TIME.start();
		
		GLOBAL_SCOPE_TIME.stop();
		var localWatch = Stopwatch.createUnstarted();
		
		LinkStep oldValue = ProfilingKerMLLinkingService.currentStep;
		ProfilingKerMLLinkingService.currentStep = new ScopeResult(true, name, oldValue);
		GLOBAL_SCOPE_TIME.start();
		
		localWatch.start();
		IEObjectDescription singleElement = wrappedScope.getSingleElement(name);
		localWatch.stop();
		
		if (!GLOBAL_SCOPE_TIME.isRunning()) GLOBAL_SCOPE_TIME.start();
		GLOBAL_SCOPE_TIME.stop();
		
		ProfilingKerMLLinkingService.currentStep.setDuration(localWatch.elapsed());
		ProfilingKerMLLinkingService.currentStep = oldValue;
		
		return singleElement;
	}
}
