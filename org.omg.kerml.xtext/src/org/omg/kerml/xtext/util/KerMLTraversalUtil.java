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
package org.omg.kerml.xtext.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.kerml.xtext.KerMLStandaloneSetup;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.SysMLUtil;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;
import org.omg.sysml.util.traversal.facade.impl.DefaultElementProcessingFacadeImpl;

/**
 * This is a utility for traversing a KerML model graph and processing each Element that is 
 * visited. The processing to be carried out is determined by a given element-processing facade. 
 * By default, the processing consists of simply printing out a string representation of each 
 * Element that is visited.
 * 
 * @author Ed Seidewitz
 *
 */
public class KerMLTraversalUtil extends SysMLUtil {
	
	/**
	 * The traversal object used to manage the traversal of the model graph.
	 */
	protected Traversal traversal;
	
	public KerMLTraversalUtil() {
		super();
		KerMLStandaloneSetup.doSetup();
		this.addExtension(".kerml");
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
	 * Initialize the traversal using the given element-processing facade.
	 * 
	 * @param 	processingFacade	the facade for processing Elements and Relationships
	 * @return	the initialized traversal object
	 */
	protected Traversal initialize(ElementProcessingFacade processingFacade) {
		this.traversal = new Traversal(processingFacade);
		return this.traversal;
	}
	
	/**
	 * Visit each of the top-level model Elements in each of the current input Resources.
	 * Traversal must be initialized before processing.
	 */
	public void process() {
		for (Resource resource: this.getInputResources()) {
			for (EObject object : resource.getContents()) {
				if (object instanceof Element) {
					this.traversal.visit((Element) object);
				}
			} 
		}
	}
	
	/**
	 * Run the traversal for the given main program arguments.
	 * 
	 * @param 	args		the array of main program arguments
	 */
	public void run(String[] args) {
		try {
			this.initialize(new DefaultElementProcessingFacadeImpl());
			this.read(args);
			
			println("Processing...");
			this.process();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * The main program reads the KerML resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only traversed if they are referenced from an input
	 * or are directly or indirectly related to another Element so referenced.
	 * 
	 * @param 	args	the first argument is a path for reading input resources, while other arguments
	 * 					are paths for reading library resources
	 */
	public static void main(String[] args) {
		new KerMLTraversalUtil().run(args);
	}

}
