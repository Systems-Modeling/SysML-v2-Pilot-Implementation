/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Ujhelyi
 * 
 *****************************************************************************/
package org.omg.sysml.interactive;

import java.util.Map;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;

/**
 * A specialized Xtext index implementation for interactive parsing environment
 * that supports overriding previously indexed elements by overwriting previous
 * entries with new ones.
 * </p>
 * <b>NOTE</b> Reparsing an earlier file might change the built model, as it is
 * possible that a name at a later point refers to a different model element.
 * This is in line with the behaviour of the interactive parsing environment,
 * but is not a general-purpose solution.
 * </p>
 * <b>WARNING</b> This index implementation will not behave correctly if there
 * is a point in time where a qualified name can refer to multiple, different
 * objects in the model, as only the later one will be kept.
 */
public class StrictShadowingResourceDescriptionData extends ResourceDescriptionsData {
	StrictShadowingResourceDescriptionData(Iterable<IResourceDescription> descriptions) {
		super(descriptions);
	}

	/**
	 * Simplified implementation: if a new element is found with a name that was already indexed, simply overwrite the previous entry. 
	 */
	@Override
	protected void registerDescription(IResourceDescription description, Map<QualifiedName, Object> target) {
		for(IEObjectDescription object: description.getExportedObjects()) {
			QualifiedName lowerCase = object.getName().toLowerCase();
			target.put(lowerCase, description);
		}
	}
}