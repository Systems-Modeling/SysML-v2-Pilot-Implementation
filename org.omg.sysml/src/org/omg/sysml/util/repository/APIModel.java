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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.NotImplementedException;
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
	 * Adds root level model element to the model.
	 * 
	 * @param id UUID of the element
	 * @param rootElement element to add
	 */
	 public void addModelRoot(UUID id, Element rootElement) {
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
		throw new NotImplementedException();
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
}