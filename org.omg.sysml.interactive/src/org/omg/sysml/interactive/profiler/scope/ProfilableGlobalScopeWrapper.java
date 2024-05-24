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

import java.time.Duration;
import java.util.LinkedList;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.omg.sysml.interactive.profiler.LinkStep;
import org.omg.sysml.interactive.profiler.SysMLInteractiveParsingProfiler;
import org.omg.sysml.interactive.profiler.LinkingResult.ScopeResult;
import org.omg.sysml.interactive.profiler.linking.ProfilingKerMLLinkingService;

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
		
		LinkStep oldValue = ProfilingKerMLLinkingService.currentStep;
		ProfilingKerMLLinkingService.currentStep = new ScopeResult(true, name, oldValue);
		
		if (!GLOBAL_SCOPE_TIME.isRunning()) GLOBAL_SCOPE_TIME.start();
		
		GLOBAL_SCOPE_TIME.stop();
		Duration startTime = GLOBAL_SCOPE_TIME.elapsed();
		GLOBAL_SCOPE_TIME.start();

		IEObjectDescription singleElement = wrappedScope.getSingleElement(name);
		
		GLOBAL_SCOPE_TIME.stop();
		//SysMLInteractiveParsingProfiler.QUALIFIED_NAME_RESOLUTION_GLOBAL.computeIfAbsent(name, k -> new LinkedList<>()).add(GLOBAL_SCOPE_TIME.elapsed().minus(startTime));
		ProfilingKerMLLinkingService.currentStep.setDuration(GLOBAL_SCOPE_TIME.elapsed().minus(startTime));
		ProfilingKerMLLinkingService.currentStep = oldValue;
		GLOBAL_SCOPE_TIME.start();
		
		return singleElement;
	}
}
