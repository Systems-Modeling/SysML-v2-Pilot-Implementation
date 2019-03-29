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
package org.omg.sysml.util.traversal.visitor.impl;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

/**
 * This class implements a generic visitor for any kind of SysML v2 model Element that is not a
 * Relationship.
 * 
 * @author Ed Seidewitz
 *
 */
public class ElementVisitorImpl extends VisitorImpl {

	public ElementVisitorImpl(Element element, Traversal traversal, ElementProcessingFacade facade) {
		super(element, traversal, facade);
	}

	/**
	 * Process the Element being visited using the Element-processing facade for this visitor.
	 */
	protected Object process() {
		return this.getFacade().processElement(this.getElement());
	}

}
