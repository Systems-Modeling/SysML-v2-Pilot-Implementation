/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
 * Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.sysml.util.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.impl.ElementIdProcessingFacade;

/**
 * Class to track UUIDs while fetching from the repository. The tracker can be
 * pre-populated by locally existing UUID. The standard library UUIDs are tracked separately
 * and they shadow user UUIDs (non-standard library UUIDs).
 */
public class EObjectUUIDTracker {
	private Map<UUID, EObject> uuidToLibraryElement = new HashMap<>();
	private Map<UUID, EObject> uuidToLocalElements = new HashMap<>();
	
	/**
	 * Collects UUIDs from the given library resources
	 * 
	 * @param libraryResources resources containing (local) standard library models
	 */
	public void trackLibraryUUIDs(Collection<Resource> libraryResources) {
		trackUUIDSFromResources(libraryResources, uuidToLibraryElement);
	}
	
	/**
	 * Collects UUIDs from non-standard library models.
	 * 
	 * @param userResources resources containing local models
	 */
	public void trackLocalUUIDs(Collection<Resource> userResources) {
		trackUUIDSFromResources(userResources, uuidToLocalElements);
	}
	
	private void trackUUIDSFromResources(Collection<Resource> resources,  Map<UUID, EObject> uuidToElementMap) {
		//avoid concurrent modification exception in the traversal by transforming the library
		for (Resource resource: resources) {
			if (resource instanceof XtextResource) {
				ElementUtil.transformAll(resource, false);
			}
		}
		
		ElementIdProcessingFacade idProcessingFacade = new ElementIdProcessingFacade(uuidToLibraryElement);
		var traversal = new Traversal(idProcessingFacade, true);
		
		resources.forEach(res -> {
			if (!res.getContents().isEmpty()) {
				traversal.visit((Element) res.getContents().get(0));
			}
		});
	}
	
	/**
	 * Checks if the tracker contains an index for the library
	 * 
	 * @return true if the library has been tracked
	 */
	public boolean isLibraryTracked() {
		return !uuidToLibraryElement.isEmpty();
	}
	
	/**
	 * Used to track a local element by its UUID
	 *
	 * @param uuid UUID to track
	 * @param element element identified by the UUID
	 */
	public void trackLocalElement(UUID uuid, EObject element) {
		uuidToLocalElements.put(uuid, element);
	}
	
	/**
	 * Returns the element if it has been tracked by its UUID
	 * otherwise creates the element using the provided compute and tracks it.
	 * 
	 * @param uuid UUID of the element
	 * @param compute Function to compute the Element in case it's not tracked
	 */
	public EObject createIfMissingAndTrack(UUID uuid, Function<? super UUID, ? extends EObject> compute) {
		return uuidToLocalElements.computeIfAbsent(uuid, compute);
	}
	
	/**
	 * Returns the element identified by a UUID. Library UUIDs are checked first.
	 * 
	 * @return element identified by the provided UUID or null if UUID is not tracked
	 */
	public EObject get(UUID uuid) {
		if (uuidToLibraryElement.containsKey(uuid)) {
			return uuidToLibraryElement.get(uuid);
		} else {
			return uuidToLocalElements.get(uuid);
		}
	}

	/**
	 * Iterates stored local elements passing them to the provided consumer
	 * 
	 * @param consumer logic to execute on each element
	 */
	public void forEachTrackedLocalElement(BiConsumer<? super UUID, ? super EObject> consumer) {
		uuidToLocalElements.forEach(consumer);
	}
	
	/**
	 * Removes all local element from the tracker
	 */
	public void clear() {
		uuidToLocalElements.clear();
	}
}
