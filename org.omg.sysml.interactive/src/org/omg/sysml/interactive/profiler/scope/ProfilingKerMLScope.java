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

import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.omg.kerml.xtext.scoping.KerMLScope;
import org.omg.kerml.xtext.scoping.KerMLScopeProvider;
import org.omg.sysml.interactive.profiler.Profiler;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;

public class ProfilingKerMLScope extends KerMLScope
{
	private static final String RESOLVE_OPERATION = "KerMLScope#resolve";
	private static final String GET_SINGLE_ELEMENT_OPERATION = "KerMLScope#getSingleElement";
	private Profiler profiler;

	public ProfilingKerMLScope(IScope parent, Namespace ns, EClass referenceType, KerMLScopeProvider scopeProvider,
			boolean isInsideScope, boolean isFirstScope, boolean isRedefinition, Element element, Element skip, Profiler timeProfiler) {
		super(parent, ns, referenceType, scopeProvider, isInsideScope, isFirstScope, isRedefinition, element, skip);
		this.profiler = timeProfiler;
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {
		
		String nsName = ns.getOwningNamespace() == null ? "ROOT" : ns.getQualifiedName();
		profiler.operationStarted(this, GET_SINGLE_ELEMENT_OPERATION, "ns = " + nsName, "targetQn = " + name.toString(), "refType = " + referenceType.getName());
		
		IEObjectDescription singleElement = super.getSingleElement(name);
		
		profiler.operationFinished(this, GET_SINGLE_ELEMENT_OPERATION, createReturnValue(singleElement));
		
		return singleElement;
	}
	
	public static String createReturnValue(IEObjectDescription description) {
		
		if (description == null) {
			return "NULL";
		}
		
		String qualifiedName = description.getQualifiedName().toString();
		URI uri = description.getEObjectOrProxy().eResource().getURI();
		String resource = uri.lastSegment();
		String lineNumber = "NaN";
		
		ICompositeNode node = NodeModelUtils.getNode(description.getEObjectOrProxy());
		if (node != null) {
			lineNumber = Integer.toString(node.getStartLine());
		}
		
		return qualifiedName + " from " + resource + "#" + lineNumber;
	}
	
	@Override
	protected boolean resolve(Namespace ns, QualifiedName qn, Set<Namespace> ownedVisited, Set<Namespace> visited,
			Set<Element> redefined, boolean checkIfAdded, boolean isInsideScope, boolean isInheriting,
			boolean includeImplicitGen, boolean includeAll) {
		
		String nsQn = ns.getQualifiedName();
		QualifiedName namespace = qn.append(nsQn == null ? "" : nsQn);
		
		profiler.operationStarted(this, RESOLVE_OPERATION, "ns = " + namespace.toString(), "targetQn = " + targetqn.toString());
		
		 var result = super.resolve(ns, qn, ownedVisited, visited, redefined, checkIfAdded, isInsideScope, isInheriting,
				includeImplicitGen, includeAll);
		 
		 profiler.operationFinished(this, RESOLVE_OPERATION, Boolean.toString(result));
		 
		 return result;
	}
}
