/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 *  
 *******************************************************************************/

package org.omg.sysml.logic;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.logic.api.IModelLibraryProvider;
import org.omg.sysml.util.SysMLLibraryUtil;

/**
 * Plain-EMF library lookup for standalone applications.
 *
 * <p>This provider resolves qualified names using the containment hierarchy and
 * membership names already loaded in a {@link ResourceSet}. It intentionally
 * does not depend on Xtext indexing or alias-based lookup.
 */
public class ResourceSetModelLibraryProvider implements IModelLibraryProvider {

	private static final String MODEL_LIBRARY_FOLDER = "sysml.library";

	/**
	 * Resolves a qualified library name against the resources already loaded in
	 * the context element's resource set.
	 */
	@Override
	public Element getElement(Element context, String name) {
		if (context == null || name == null || name.isBlank()) {
			return null;
		}

		Resource resource = context.eResource();
		ResourceSet resourceSet = resource == null ? null : resource.getResourceSet();
		if (resourceSet == null) {
			return null;
		}

		String[] segments = name.split("::");
		if (segments.length == 0) {
			return null;
		}

		List<Resource> candidates = getCandidateResources(resourceSet);
		for (Resource candidate : candidates) {
			Element element = getElement(candidate, segments);
			if (element != null) {
				return element;
			}
		}

		return null;
	}

	/**
	 * Prioritizes resources that appear to belong to the model library and falls
	 * back to all other loaded resources when no library resource is detected.
	 */
	private List<Resource> getCandidateResources(ResourceSet resourceSet) {
		List<Resource> libraryResources = new ArrayList<>();
		List<Resource> otherResources = new ArrayList<>();

		for (Resource resource : resourceSet.getResources()) {
			if (isLibraryResource(resource)) {
				libraryResources.add(resource);
			} else {
				otherResources.add(resource);
			}
		}

		return libraryResources.isEmpty() ? otherResources : libraryResources;
	}

	/**
	 * Identifies resources that should be treated as library candidates based on
	 * the configured model library path or the conventional {@code sysml.library}
	 * folder name in the URI.
	 */
	private boolean isLibraryResource(Resource resource) {
		if (resource == null || resource.getURI() == null) {
			return false;
		}

		String modelLibraryPath = SysMLLibraryUtil.getModelLibraryPath();
		String uriString = resource.getURI().toString();
		String fileString = resource.getURI().toFileString();
		if (modelLibraryPath != null && !modelLibraryPath.isBlank()) {
			if (uriString.contains(modelLibraryPath)) {
				return true;
			}
			if (fileString != null && fileString.contains(modelLibraryPath)) {
				return true;
			}
		}

		return resource.getURI().segmentsList().contains(MODEL_LIBRARY_FOLDER);
	}

	/**
	 * Attempts to resolve the qualified-name segments against each root element
	 * contained by a resource.
	 */
	private Element getElement(Resource resource, String[] segments) {
		for (EObject object : resource.getContents()) {
			if (object instanceof Element element) {
				Element match = resolveElement(element, segments, 0);
				if (match != null) {
					return match;
				}
			}
		}
		return null;
	}

	/**
	 * Resolves one qualified-name segment at a time by matching the current
	 * element and then descending through namespace memberships.
	 */
	private Element resolveElement(Element element, String[] segments, int index) {
		if (!matchesElementName(element, segments[index])) {
			return null;
		}

		if (index == segments.length - 1) {
			return element;
		}

		if (!(element instanceof Namespace namespace)) {
			return null;
		}

		String nextSegment = segments[index + 1];
		for (Membership membership : getOwnedMemberships(namespace)) {
			Element member = membership.getMemberElement();
			if (member == null || !matchesMembershipName(membership, member, nextSegment)) {
				continue;
			}

			if (index + 1 == segments.length - 1) {
				return member;
			}

			Element nested = resolveElement(member, segments, index + 1);
			if (nested != null) {
				return nested;
			}
		}

		return null;
	}

	/**
	 * Returns the memberships owned directly by a namespace using only EMF model
	 * state, avoiding any Xtext-specific scoping infrastructure.
	 */
	private List<Membership> getOwnedMemberships(Namespace namespace) {
		List<Membership> memberships = new ArrayList<>();
		for (EObject relationship : namespace.getOwnedRelationship()) {
			if (relationship instanceof Membership membership) {
				memberships.add(membership);
			}
		}
		return memberships;
	}

	/**
	 * Matches a qualified-name segment against an element's declared name or
	 * declared short name.
	 */
	private boolean matchesElementName(Element element, String segment) {
		return matches(segment, element.getDeclaredName()) || matches(segment, element.getDeclaredShortName());
	}

	/**
	 * Matches a qualified-name segment against membership naming first and then
	 * falls back to the member element's declared names.
	 */
	private boolean matchesMembershipName(Membership membership, Element member, String segment) {
		if (matches(segment, membership.getMemberName()) || matches(segment, membership.getMemberShortName())) {
			return true;
		}

		if (membership instanceof OwningMembership owningMembership) {
			Element ownedMember = owningMembership.getOwnedMemberElement();
			if (ownedMember != null) {
				return matchesElementName(ownedMember, segment);
			}
		}

		return matchesElementName(member, segment);
	}

	/**
	 * Performs an exact name comparison while tolerating missing values.
	 */
	private boolean matches(String expected, String actual) {
		return expected != null && actual != null && expected.equals(actual);
	}
}
