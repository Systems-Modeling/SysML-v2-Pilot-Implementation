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
package org.omg.sysml.interactive.profiler.linking;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.omg.sysml.interactive.profiler.results.LinkStep;
import org.omg.sysml.interactive.profiler.results.LinkingResult;

import com.google.common.base.Stopwatch;

public class ProfilingKerMLLinkingService extends DefaultLinkingService {
	
	public static final Stopwatch WATCH = Stopwatch.createUnstarted();
	public static LinkStep currentStep = null;
	public static int callCount = 0;
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		callCount++;
		
		if (!WATCH.isRunning()) WATCH.start();
		
		WATCH.stop();
		var localWatch = Stopwatch.createUnstarted();
		
		var lastLinkingResult = currentStep;
		var name = getCrossRefNodeAsString(node);
		var currentLocal = new LinkingResult(name, ref,  node.getStartLine(), context.eResource().getURI().lastSegment(), lastLinkingResult);
		if (currentStep == null) currentLocal.setFirst();
		currentStep = currentLocal;
		WATCH.start();
		
		
		localWatch.start();
		var linkedObjects = super.getLinkedObjects(context, ref, node);
		localWatch.stop();
		
		if (!WATCH.isRunning()) WATCH.start();
		
		currentLocal.setResult(linkedObjects);
		currentLocal.setDuration(localWatch.elapsed());
		
		//Stop time once we are back at the start of the original linking call
		if (lastLinkingResult == null) {
			LinkingResult.RESULTS.add(currentStep);
			WATCH.stop();
		}
			
		
		currentStep = lastLinkingResult;
		
		return linkedObjects;
	}
}