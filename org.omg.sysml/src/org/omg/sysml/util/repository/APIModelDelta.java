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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.omg.sysml.model.Data;
import org.omg.sysml.model.DataIdentity;
import org.omg.sysml.model.DataVersion;
import org.omg.sysml.model.Element;
import org.omg.sysml.model.Identified;

import com.google.common.base.Objects;

/**
 * Delta between two models represented as {@link APIModel}.
 */
public class APIModelDelta {
	
	private final Collection<Element> additions;
	private final Map<UUID, Data> changes;
	private final Collection<UUID> deletions;

	private APIModel thisModel;

	private APIModelDelta(APIModel thisModel, Set<Element> additions, Map<UUID, Data> changes, Set<UUID> deletions) {
		this.additions = Collections.unmodifiableCollection(additions);
		this.changes = Collections.unmodifiableMap(changes);
		this.deletions = Collections.unmodifiableCollection(deletions);
		this.thisModel = thisModel;
	}
	
	/**
	 * Elements that count as additions.
	 * 
	 * @return additions
	 */
	public Collection<Element> getAdditions() {
		return additions;
	}
	
	/**
	 * Changed elements and their changes.
	 * 
	 * @return UUID and field changes of elements
	 */
	public Map<UUID, Data> getChanges() {
		return changes;
	}
	
	/**
	 * Deleted elements
	 * 
	 * @return UUIDs of deleted elements
	 */
	public Collection<UUID> getDeletions() {
		return deletions;
	}
	
	/**
	 * Converts the {@link APIModelDelta} to a data structure
	 * that the standard API server accepts as a model delta.
	 * 
	 * @return list model changes acceptable by the API server
	 */
	public List<DataVersion> toTrasferableDelta() {
		List<DataVersion> delta = new LinkedList<>();
		
		for (Element addition: getAdditions()) {
			Data data = new Data();
			for (String field: addition.keySet()) {
				Object value = addition.get(field);
				data.put(field, value);
			}
			UUID id = UUID.fromString(addition.get(Identified.SERIALIZED_NAME_AT_ID).toString());
			delta.add(new DataVersion().payload(data).identity(new DataIdentity().atId(id)));
		}
		
		for (var change: changes.entrySet()) {
			delta.add(new DataVersion().payload(change.getValue()).identity(new DataIdentity().atId(change.getKey())));
		}
		
		for (UUID deletion: getDeletions()) {
			//set to null for deletion
			delta.add(new DataVersion().payload(null).identity(new DataIdentity().atId(deletion)));
		}
		
		return delta;
	}
	
	/**
	 * Creates an {@link APIModelDelta} between two {@link APIModel}s
	 * 
	 * @param thisModel model to compare with baseline
	 * @param baseline model to use as a baseline
	 * 
	 * @return {@link APIModelDelta} of the two models
	 */
	public static APIModelDelta create(APIModel thisModel, APIModel baseline) {
		if (thisModel == null) thisModel = APIModel.createEmpty();
		if (baseline == null) baseline = APIModel.createEmpty();
		
		Set<Element> additions = new HashSet<>();
		Set<UUID> deletions = new HashSet<>();
		Map<UUID, Data> changes = new HashMap<>();
		
		Map<UUID, Element> elementsFromThis = thisModel.getModelElements();
		
		for (UUID id: elementsFromThis.keySet()) {
			Element baselineElement = baseline.getElement(id);
			if (baselineElement == null) {
				additions.add(thisModel.getElement(id));
			} else {
				Element thisElement = thisModel.getElement(id);
				Data change = createElementDelta(thisElement, baselineElement);
				if (!change.isEmpty()) {
					change.put("@type", thisElement.get("@type"));
					changes.put(id, change);
				}
			}
		}
		
		Map<UUID, Element> elementsFromBaseline = baseline.getModelElements();
		
		for (UUID id: elementsFromBaseline.keySet()) {
			Element element = thisModel.getElement(id);
			if (element == null) {
				deletions.add(id);
			}
		}
		
		return new APIModelDelta(thisModel, additions, changes, deletions);
	}
	
	/**
	 * Creates a {@link Data} object which contains changed fields and their new values
	 * 
	 * @param thisElement element to compare with baseline
	 * @param baselineElement element to use as a baseline
	 * @return changed fields and their new values wrapped in a {@link Data} object.
	 */
	public static Data createElementDelta(Element thisElement, Element baselineElement) {
		Data change = new Data();
		Set<String> fieldsInThis = thisElement.keySet();
		for (String field: fieldsInThis) {
			Object thisValue = thisElement.get(field);
			Object baselineValue = baselineElement.get(field);
			if (!Objects.equal(thisValue, baselineValue)) {
				change.put(field, thisValue);
			}
		}
		//set removed fields to null
//		Set<String> fieldsInTo = baselineElement.keySet();
//		for (String field: fieldsInTo) {
//			if (!thisElement.containsKey(field)) {
//				change.put(field, null);
//			}
//		}
		
		return change;
	}
}
