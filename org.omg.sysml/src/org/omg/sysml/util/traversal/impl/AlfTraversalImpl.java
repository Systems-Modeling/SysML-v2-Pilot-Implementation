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
package org.omg.sysml.util.traversal.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.AlfUtil;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.impl.DefaultElementProcessingFacadeImpl;
import org.omg.sysml.util.traversal.visitor.ElementVisitor;
import org.omg.sysml.util.traversal.visitor.ElementVisitorFactory;
import org.omg.sysml.util.traversal.visitor.impl.ElementVisitorFactoryImpl;

public class AlfTraversalImpl extends AlfUtil implements Traversal {
	
	protected ElementVisitorFactory visitorFactory = new ElementVisitorFactoryImpl(this, new DefaultElementProcessingFacadeImpl());
	protected Map<Element, String> elementMap = new HashMap<>();
	
	public String getIdentifier(Element element) {
		return this.elementMap.get(element);
	}
	
	public void putIdentifier(Element element, String identifier) {
		this.elementMap.put(element, identifier);
	}
	
	protected String visit(Element element, ElementVisitor visitor) {
		String identifier = visitor.visit();
		this.putIdentifier(element, identifier);
		return identifier;
	}
	
	public String visit(Element element) {
		String identifier = this.getIdentifier(element);
		return identifier != null? identifier:
				this.visit(element, this.visitorFactory.createVisitor(element));
	}
	
	public void process() {
		for (EObject object: this.contents) {
			if (object instanceof Element) {
				this.visit((Element)object);
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			AlfTraversalImpl traversal = new AlfTraversalImpl();
			
			System.out.println("Reading " + args[0] + "...");
			traversal.read(args[0]);
			
			System.out.println("Traversing...");
			traversal.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
