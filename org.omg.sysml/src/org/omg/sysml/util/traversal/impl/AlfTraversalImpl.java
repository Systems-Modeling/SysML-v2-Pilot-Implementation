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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.AlfUtil;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.facade.impl.DefaultElementProcessingFacadeImpl;
import org.omg.sysml.util.traversal.visitor.impl.ElementVisitorFactoryImpl;

public class AlfTraversalImpl extends AlfUtil {
	
	protected Traversal traversal;
	
	public AlfTraversalImpl(ElementProcessingFacade processingFacade) {
		this.initialize(processingFacade);
	}
	
	public AlfTraversalImpl() {
		this(new DefaultElementProcessingFacadeImpl());
	}
	
	public Traversal getTraversal() {
		return this.traversal;
	}
	
	protected Traversal initialize(ElementProcessingFacade processingFacade) {
		final ElementVisitorFactoryImpl visitorFactory = new ElementVisitorFactoryImpl(processingFacade);
		this.traversal = new TraversalImpl(visitorFactory);
		visitorFactory.setTraversal(this.traversal);	
		return this.traversal;
	}
	
	public void process() {
		for (Resource resource: this.inputResources) {
			for (EObject object : resource.getContents()) {
				if (object instanceof Element) {
					this.traversal.visit((Element) object);
				}
			} 
		}
	}
	
	public static void main(String[] args) {
		try {
			final AlfTraversalImpl traversal = new AlfTraversalImpl();
			traversal.read(args);
			
			System.out.println("Processing...");
			traversal.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
