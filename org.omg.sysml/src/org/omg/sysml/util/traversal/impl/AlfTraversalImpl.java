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

/**
 * This is a utility for traversing a SysML model graph and processing each Element that is 
 * visited. The processing to be carried out is determined by a given element-processing facade. 
 * By default, the processing consists of simply printing out a string representation of each 
 * Element that is visited.
 * 
 * @author Ed Seidewitz
 *
 */
public class AlfTraversalImpl extends AlfUtil {
	
	/**
	 * The traversal object used to manage the traversal of the model graph.
	 */
	protected Traversal traversal;
	
	/**
	 * Create an Alf traversal using the given element-processing facade.
	 * 
	 * @param 	processingFacade	the facade for processing Elements and Relationships
	 */
	public AlfTraversalImpl(ElementProcessingFacade processingFacade) {
		this.initialize(processingFacade);
	}
	
	/**
	 * Create an Alf traversal using the default element-processing facade.
	 */
	public AlfTraversalImpl() {
		this(new DefaultElementProcessingFacadeImpl());
	}
	
	/**
	 * Get the traversal object for this model traversal.
	 * 
	 * @return	the traversal object.
	 */
	public Traversal getTraversal() {
		return this.traversal;
	}
	
	/**
	 * Initialize the traversal with an element-visitor factor using the given element-processing facade.
	 * 
	 * @param 	processingFacade	the facade for processing Elements and Relationships
	 * @return	the initialized traversal object
	 */
	protected Traversal initialize(ElementProcessingFacade processingFacade) {
		final ElementVisitorFactoryImpl visitorFactory = new ElementVisitorFactoryImpl(processingFacade);
		this.traversal = new TraversalImpl(visitorFactory);
		visitorFactory.setTraversal(this.traversal);	
		return this.traversal;
	}
	
	/**
	 * Visit each of the top-level model Elements in each of the current input Resources.
	 */
	public void process() {
		for (Resource resource: this.inputResources) {
			for (EObject object : resource.getContents()) {
				if (object instanceof Element) {
					this.traversal.visit((Element) object);
				}
			} 
		}
	}
	
	/**
	 * The main program reads the Alf resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only traversed if they are referenced from an input
	 * or are directly or indirectly related to another Element so referenced.
	 * 
	 * @param 	args	the first argument is a path for reading input resources, while other arguments
	 * 					are paths for reading library resources
	 */
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
