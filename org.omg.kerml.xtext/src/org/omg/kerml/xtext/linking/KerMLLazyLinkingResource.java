/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.linking;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Triple;

/**
 * Lazy-linking resource that does not keep provisional linking failures.
 * <p>
 * Name resolution proceeds incrementally and excludes names that are already pending
 * resolution (KerML 8.2.3.5.1). A failure observed while another link of this resource
 * is being resolved may therefore only reflect those temporary exclusions. Xtext records
 * every failure as unresolvable until the resource changes, and semantic queries do not
 * modify the model during resolution, so such provisional failures would otherwise remain
 * until transformation. Nested failures stay recorded while the outermost resolution runs,
 * which bounds retries, and become retryable again once it completes. A successful retry
 * removes the corresponding diagnostic. Failures of an outermost resolution are kept.
 * <p>
 * Confined to the model's thread, like the rest of the linking process.
 */
public class KerMLLazyLinkingResource extends LazyLinkingResource {

	/** Number of active {@link #getEObject(String, Triple)} calls on this resource. */
	private int linkingDepth = 0;

	/** URI fragments that failed in a nested resolution of the current outermost resolution. */
	private final Set<String> provisionalUnresolvableFragments = new HashSet<>();

	 /**
     * Resolves a lazy link and forgets, once the outermost resolution of this resource completes,
     * the failures observed during nested resolutions.
     * <p>
     * Computing an effective name or implicit specializations during linking can resolve further
     * names, such as a metadata metaclass or a default typing, while an outer resolution is in
     * progress. That nested resolution excludes the imports and memberships pending resolution
     * (KerML 8.2.3.5.1), so it can fail although the name is visible (KerML 8.2.3.5.3 and
     * 8.2.3.5.4). Xtext records every failed fragment as unresolvable until the resource changes,
     * and semantic queries do not modify the model, so such a provisional failure would otherwise
     * remain.
     * <p>
     * A fragment that fails at a depth greater than one therefore stays recorded while the
     * outermost call runs, which bounds retries within that resolution, and is then removed from
     * the unresolvable set: the next access calls the linking service again and Xtext removes the
     * diagnostic when it succeeds. Failures of the outermost call are kept. Never recording nested
     * failures would retry every unresolvable import recursively, an exponential cost on circular
     * imports.
     * <p>
     * Covered by {@code org.omg.sysml.interactive.tests.NestedNameResolutionTest}.
     */
	@Override
	protected EObject getEObject(String uriFragment, Triple<EObject, EReference, INode> triple) throws AssertionError {
		linkingDepth++;
		try {
			EObject result = super.getEObject(uriFragment, triple);
			if (result == null && linkingDepth > 1) {
				provisionalUnresolvableFragments.add(uriFragment);
			}
			return result;
		} finally {
			linkingDepth--;
			if (linkingDepth == 0 && !provisionalUnresolvableFragments.isEmpty()) {
				getUnresolvableURIFragments().removeAll(provisionalUnresolvableFragments);
				provisionalUnresolvableFragments.clear();
			}
		}
	}

	public void clearUnresolvableURIFragments() {
		getUnresolvableURIFragments().clear();
	}
	
}
