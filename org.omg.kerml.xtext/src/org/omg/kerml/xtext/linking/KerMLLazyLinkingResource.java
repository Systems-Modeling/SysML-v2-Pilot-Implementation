/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
 * Copyright (c) 2026 Budapest University of Technology and Economics
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 * 
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 * 
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Ed Seidewitz, MDS
 *  Vince Molnár, BME
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.linking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Triple;

public class KerMLLazyLinkingResource extends LazyLinkingResource {
	
	/**
	 * For each lazy link being resolved in the current thread, innermost first, the actions that forget the
	 * failures to resolve the lazy links nested in its resolution.
	 */
	private static final ThreadLocal<Deque<List<Runnable>>> resolutions = ThreadLocal.withInitial(ArrayDeque::new);
	
	public void clearUnresolvableURIFragments() {
		getUnresolvableURIFragments().clear();
	}
	
	/**
	 * A failure to resolve a lazy link during the resolution of another one may be due to the elements excluded
	 * while that resolution is in progress, so it is cached only until that resolution ends.
	 */
	@Override
	protected EObject getEObject(String uriFragment, Triple<EObject, EReference, INode> triple) throws AssertionError {
		boolean wasUnresolvable = getUnresolvableURIFragments().contains(uriFragment);
		Deque<List<Runnable>> inProgress = resolutions.get();
		inProgress.push(new ArrayList<>());
		EObject result = null;
		try {
			result = super.getEObject(uriFragment, triple);
			return result;
		} finally {
			inProgress.pop().forEach(Runnable::run);
			if (result == null && !wasUnresolvable && !inProgress.isEmpty()) {
				inProgress.peek().add(() -> forgetUnresolvable(uriFragment));
			}
		}
	}
	
	private synchronized void forgetUnresolvable(String uriFragment) {
		getUnresolvableURIFragments().remove(uriFragment);
	}
	
}
