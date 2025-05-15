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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.omg.sysml.StringUtil;
import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.model.Element;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * Model representation based on the standard API.
 * The model is inherently flat. Each element has a UUID stored in the '@id' field.
 */
public class APIModel {
	private Map<UUID, Element> modelElements = new HashMap<>();
	private Map<UUID, Element> modelRoots = new HashMap<>();
	
	public APIModel(Map<UUID, Element> modelElements, Map<UUID, Element> modelRoots) {
		this.modelElements = modelElements;
		this.modelRoots = modelRoots;
	}
	
	/**
	 * All elements in the model including model {@link #getModelRoots() model roots}.
	 * 
	 * @return map of elements keyed with their UUID
	 */
	public Map<UUID, Element> getModelElements() {
		return Collections.unmodifiableMap(modelElements);
	}
	
	/**
	 * Root level elements of the model.
	 * These are elements that aren't referenced by any kind of {@link OwningMembership} as an {@link OwningMembership#getOwnedMemberElement() ownedMemberElement}.
	 * 
	 * @return map of model root elements keyed with their UUID
	 */
	public Map<UUID, Element> getModelRoots() {
		return Collections.unmodifiableMap(modelRoots);
	}
	
	
	/**
	 * Adds root level model element to the model. Adding an element this way will unset the owner
	 * and owning attributes.
	 * 
	 * @param id UUID of the element
	 * @param rootElement element to add
	 */
	 public void addModelRoot(UUID id, Element rootElement) {
		for (var key: rootElement.keySet()) {
			if (key.equals("owner") || key.startsWith("owning")) {
				rootElement.replace(key, null);
			}
		}
		modelRoots.put(id, rootElement);
		modelElements.put(id, rootElement);
	}
	
	 /**
	  * Adds a model element ot the model.
	  * 
	  * @param id UUID of the element
	  * @param modelElement element to add
	  */
	public void addModelElement(UUID id, Element modelElement) {
		modelElements.put(id, modelElement);
	}
	
	/**
	 * Adds all the element from an other model to this model.
	 * If an element is present in both models it's overridden in this model by
	 * the element from the other model.
	 * 
	 * @param other other model to merge into this model
	 */
	public void merge(APIModel other) {
		modelElements.putAll(other.getModelElements());;
		modelRoots.putAll(other.getModelRoots());
	}
	
	/**
	 * <b>NOT IMPLEMENTED</b>
	 * <br>
	 * Applies changes to the model.
	 * 
	 * @param delta changes to apply.
	 */
	public void merge(APIModelDelta delta) {
		throw new UnsupportedOperationException("Not implemented");
	}
	
	/**
	 * Creates an empty model.
	 * 
	 * @return empty model
	 */
	public static APIModel createEmpty() {
		return new APIModel(new HashMap<>(), new HashMap<>());
	}
	
	/**
	 * Returns a model element from the model.
	 * 
	 * @param UUID of the element
	 * 
	 * @return model element with the given UUID
	 */
	public Element getElement(UUID uuid) {
		return modelElements.get(uuid);
	}
	
	public Element getElement(String uuid) {
		return modelElements.get(UUID.fromString(uuid));
	}
	
	/**
	 * Adds a proxy object for every reference that cannot be resolved in the scope
	 * of this model
	 * 
	 * The API server doesn't allow unresolvable references but the current
	 * implementation doesn't support used projects yet. Since every model
	 * references at least the standard library it is unavoidable to end up with
	 * references that point outside the API model. This method serves as a
	 * workaround for this issue by inserting proxy objects for out of scope references.
	 */
	public void addOutOfScopeReferencesAsProxies() {
		Set<LocalReference> localReferences = modelElements.values().stream()
			.flatMap(el -> el.values().stream())
			.flatMap(this::flatten)
			.collect(Collectors.toSet());
		
		Set<UUID> added = new HashSet<>();
		for (LocalReference ref: localReferences) {
			UUID uuid = ref.getUUID();
			if (getElement(uuid) == null && !added.contains(uuid)) {
				Element proxy = new Element();
				proxy.put(ProjectRepository.ID_FIELD, uuid.toString());
				proxy.put("@type", ref.getType());
				proxy.put("isLibraryElement", ref.isLibraryElement());
				addModelRoot(uuid, proxy);
			}
		}
	}
	
	private Stream<LocalReference> flatten(Object object) {
		if (object instanceof LocalReference ref) {
			return Stream.of(ref);
		} else if (object instanceof Collection<?> col) {
			return col.stream().filter(LocalReference.class::isInstance)
					.map(LocalReference.class::cast);
		} else {
			return Stream.empty();
		}
	}
	
	/**
	 * Creates a JSON representation of the model.
	 * 
	 * @return JSON representation
	 */
	public String toJson(Gson gson) {
		return gson.toJson(getModelElements().values());
	}
	
	/**
	 * Creates a JSON tree representation of the model.
	 * 
	 * @return JSON tree representation
	 */
	public JsonElement toJsonTree(Gson gson) {
		return gson.toJsonTree(getModelElements().values());
	}
	
	/**
	 * API model compatible representation of model references
	 * This class is part of a workaround which requires
	 * proxy creation for unresolved references. Objects of this class also store the type of the referenced
	 * element (transient only). This is then used by {@link APIModel#addOutOfScopeReferencesAsProxies()}
	 * to insert proxies into the API model.
	 */
	@SuppressWarnings("serial")
	public static class LocalReference extends HashMap<String, UUID> {
		
		private transient String type;
		private boolean isLibraryElement;

		public LocalReference(UUID identifier, String type, boolean isLibraryElement) {
			put(ProjectRepository.ID_FIELD, identifier);
			this.type = type;
			this.isLibraryElement = isLibraryElement;
		}
		
		public String getType() {
			return type;
		}
		
		public boolean isLibraryElement() {
			return isLibraryElement;
		}

		public UUID getUUID() {
			return get(ProjectRepository.ID_FIELD);
		}
		
		@Override
		public boolean equals(Object o) {
			return o == this || (o instanceof Map m && m.containsKey(ProjectRepository.ID_FIELD) && idEquals(m));
		}
		
		@Override
		public int hashCode() {
			return this.containsKey(ProjectRepository.ID_FIELD)? this.get(ProjectRepository.ID_FIELD).hashCode(): super.hashCode();
		}
		
		private boolean idEquals(Map<?,?> other) {
			UUID id = this.get(ProjectRepository.ID_FIELD);
			Object otherid = other.get(ProjectRepository.ID_FIELD);
			if (otherid instanceof String idAsString) {
				return UUID.fromString(idAsString).equals(id);
			} else if (otherid instanceof UUID idAsUUID) {
				return idAsUUID.equals(id);
			}
			return false;
		}
	}
}