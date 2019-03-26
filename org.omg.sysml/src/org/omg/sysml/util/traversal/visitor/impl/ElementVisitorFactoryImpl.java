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
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.visitor.ElementVisitor;
import org.omg.sysml.util.traversal.visitor.ElementVisitorFactory;

/**
 * @author seidewitz
 *
 */
public class ElementVisitorFactoryImpl implements ElementVisitorFactory {
	
	private Traversal traversal;
	private final ElementProcessingFacade facade;
	
	public ElementVisitorFactoryImpl(ElementProcessingFacade facade) {
		this.facade = facade;
	}
	
	public Traversal getTraversal() { 
		return this.traversal;
	}
	
	public void setTraversal(Traversal traversal) {
		this.traversal = traversal;
	}
	
	public ElementProcessingFacade getFacade() {
		return this.facade;
	}
	
	/* (non-Javadoc)
	 * @see org.omg.sysml.util.traversal.visitor.ElementVisitorFactory#createVisitor(org.omg.sysml.lang.sysml.Element, org.omg.sysml.util.traversal.impl.AlfTraversalImpl)
	 */
	@Override
	public ElementVisitor createVisitor(Element element) {
		return element instanceof Relationship? 
				new RelationshipVisitorImpl((Relationship)element, this.getTraversal(), this.getFacade()): 
					new ElementVisitorImpl(element, this.getTraversal(), this.getFacade());
	}

}
