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

package org.omg.sysml.util.traversal.facade.impl;

import java.util.Map;
import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

/**
 * Utility to collect UUIDs from models.
 */
public class ElementIdProcessingFacade implements ElementProcessingFacade {
	
	private final Map<UUID, EObject> uuidToEObject;
	
	public ElementIdProcessingFacade(Map<UUID, EObject> uuidToEObject) {
		this.uuidToEObject = uuidToEObject;
	}
	
	@Override
	public String process(Element element) {
		String elementId = element.getElementId();
		uuidToEObject.put(UUID.fromString(elementId), element);
		return elementId;
	}
	
	public Map<UUID, EObject> getUUIDToElementMap(){
		return uuidToEObject;
	}
}
