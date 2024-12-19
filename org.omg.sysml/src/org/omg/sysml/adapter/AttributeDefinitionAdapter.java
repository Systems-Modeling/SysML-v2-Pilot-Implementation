/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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
 *  Zoltan Ujhelyi, MDS
 */

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.AttributeDefinition;

/**
 * This adapter does not introduce any specific behavior compared to the
 * {@link DefinitionAdapter} but it is introduced to allow unexpected behavior
 * changes when regenerating the EMF models (as sometimes the order of multiple
 * generalizations changes).
 */
public class AttributeDefinitionAdapter extends DefinitionAdapter {

	public AttributeDefinitionAdapter(AttributeDefinition element) {
		super(element);
	}
	
	@Override
	public AttributeDefinition getTarget() {
		return (AttributeDefinition)super.getTarget();
	}

}
