/*****************************************************************************
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.util.traversal.facade.impl;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

/**
 * This is a default element processing facade that simply prints out a string representation of an Element or Relationship 
 * being processed and returns a hex-string representation of the object hash code to be used as an identifier.
 * @author seidewitz
 *
 */
public class DefaultElementProcessingFacadeImpl implements ElementProcessingFacade {

	/* (non-Javadoc)
	 * @see org.omg.sysml.util.traversal.facade.ElementProcessingFacade#processElement(org.omg.sysml.lang.sysml.Element)
	 */
	@Override
	public String processElement(Element element) {
		System.out.println("Processing element " + element);
		return Integer.toHexString(element.hashCode());
	}

	/* (non-Javadoc)
	 * @see org.omg.sysml.util.traversal.facade.ElementProcessingFacade#processRelationship(org.omg.sysml.lang.sysml.Relationship)
	 */
	@Override
	public String processRelationship(Relationship relationship) {
		System.out.println("Processing relationship " + relationship);
		return Integer.toHexString(relationship.hashCode());
	}

}
