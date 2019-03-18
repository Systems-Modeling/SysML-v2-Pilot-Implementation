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
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.impl.ElementImpl;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.visitor.ElementVisitor;

public abstract class VisitorImpl<T extends Element> implements ElementVisitor {
	
	private final T element;
	private final Traversal traversal;
	private final ElementProcessingFacade facade;
	
	public VisitorImpl(T element, Traversal traversal, ElementProcessingFacade facade) {
		this.element = element;
		this.traversal = traversal;
		this.facade = facade;
	}

	@Override
	public T getElement() {
		return this.element;
	}
	
	public Traversal getTraversal() {
		return this.traversal;
	}
	
	public ElementProcessingFacade getFacade() {
		return this.facade;
	}

	@Override
	public Object visit() {
		Object identifier = this.process();
		Element element = this.getElement();
		Traversal traversal = this.getTraversal();
		traversal.putIdentifier(element, identifier);
		for (Relationship relationship: ((ElementImpl)element).getAllOwnedRelationships()) {
			traversal.visit(relationship);
		}
		return identifier;
	}
	
	protected abstract Object process();

}
