/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.util;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;

/**
 * Links an element created outside the model, such as a feature chain or a binding connector
 * inferred for an implied relationship, to the model element for which it was created.
 * <p>
 * The specification has no detached elements: the implied Relationship is owned by the element
 * being constrained, and a feature chain it targets is owned by that Relationship. KerML §8.4.3.1:
 * "In all cases, the source and owningRelatedElement of the Relationship is the Element being
 * constrained, with the target being as given in the last column of the table." KerML §7.3.4.6:
 * "the related element specified using the feature chain notation becomes an owned related feature
 * of the relationship with the feature chain as notated." The implementation creates such elements
 * before the Relationship that will own them; this adapter records their future owner so that
 * scope lookups can reach the model from them. It is recorded when such an element is stored as
 * the target of an implied relationship: an implicit general type, an implicit featuring type or
 * an implicit binding connector, whose implied relationship is its owning membership.
 * <p>
 * The link does not change the model. Once the element is really contained, its real container
 * takes precedence: use {@link ElementUtil#getEffectiveContainer(EObject)} rather than this class.
 * <p>
 * Specification quotations are from KerML 1.1 Beta 2.
 */
public final class VirtualContainer extends AdapterImpl {

	private final Element container;

	private VirtualContainer(Element container) {
		this.container = container;
	}

	/**
	 * Records {@code container} as the virtual container of an element that is the root of a
	 * detached tree: it has no container and is not in a resource. Any other element is left
	 * unchanged, as is an element that already has a virtual container.
	 * <p>
	 * A model built without a resource has roots that are not in a resource either, and one of them
	 * can be stored as the target of an implied relationship owned by one of its own members, such
	 * as the featuring type of a nested feature. The link is not recorded when {@code element} is
	 * already an effective container of {@code container}, so that effective containers never form
	 * a cycle and {@link ElementUtil#getClosestElementInResource(EObject)} terminates.
	 *
	 * @param <T> the type of the element
	 * @param element the element stored as the target of an implied relationship
	 * @param container the model element that owns the implied relationship
	 * @return {@code element}
	 */
	public static <T extends EObject> T attach(T element, Element container) {
		if (isDetachedRoot(element) && container != null && getVirtualContainer(element) == null
				&& !isEffectiveContainerOf(element, container)) {
			element.eAdapters().add(new VirtualContainer(container));
		}
		return element;
	}

	private static boolean isDetachedRoot(EObject element) {
		return element != null && element.eContainer() == null && element.eResource() == null;
	}

	private static boolean isEffectiveContainerOf(EObject ancestor, EObject element) {
		for (EObject current = element; current != null; current = ElementUtil.getEffectiveContainer(current)) {
			if (current == ancestor) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the virtual container recorded for an element.
	 *
	 * @param element the element to inspect
	 * @return the recorded container, or {@code null} when none was recorded
	 */
	public static Element getVirtualContainer(EObject element) {
		if (element == null) {
			return null;
		}
		for (var adapter : element.eAdapters()) {
			if (adapter instanceof VirtualContainer virtual) {
				return virtual.container;
			}
		}
		return null;
	}
}
