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
	
	public static final Stopwatch LINKING_TIME = Stopwatch.createUnstarted();
	public static LinkStep currentStep = null;
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		
		if (!LINKING_TIME.isRunning()) LINKING_TIME.start();
		
		LINKING_TIME.stop();
		var localWatch = Stopwatch.createUnstarted();
		
		var lastLinkingResult = currentStep;
		var name = getCrossRefNodeAsString(node);
		var currentLocal = new LinkingResult(name, ref,  node.getStartLine(), context.eResource().getURI().lastSegment(), lastLinkingResult);
		currentStep = currentLocal;
		LINKING_TIME.start();
		
		
		localWatch.start();
		var linkedObjects = super.getLinkedObjects(context, ref, node);
		localWatch.stop();
		
		if (!LINKING_TIME.isRunning()) LINKING_TIME.start();
		
		LINKING_TIME.stop();
		currentLocal.addResult(linkedObjects);
		currentLocal.setDuration(localWatch.elapsed());
		
		if (lastLinkingResult == null)
			LinkingResult.RESULTS.add(currentStep);
		
		currentStep = lastLinkingResult;
		
		return linkedObjects;
	}
}
