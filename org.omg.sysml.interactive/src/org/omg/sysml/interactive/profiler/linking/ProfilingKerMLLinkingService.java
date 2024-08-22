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
import org.omg.sysml.interactive.profiler.Profiler;

import com.google.inject.Inject;

public class ProfilingKerMLLinkingService extends DefaultLinkingService {
	
	private static final String OPERATION_NAME = "LinkingService#getLinkedObjects";
	
	@Inject
	Profiler profiler;
	
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException {
		
		int startLine = node.getStartLine();
		String crossRef = getCrossRefNodeAsString(node);
		
		profiler.operationStarted(this, OPERATION_NAME, "crossRef = " + crossRef,"ref = " + ref.getName(), "line = " + startLine);
		
		var linkedObjects = super.getLinkedObjects(context, ref, node);
		
		profiler.operationFinished(this, OPERATION_NAME, "");
		
			
		return linkedObjects;
	}
}
