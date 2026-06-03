/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.util.traversal.facade;

import org.omg.sysml.lang.sysml.Element;

/**
 * This interface defines the facade for processing SysML Elements.
 * 
 * @author Ed Seidewitz
 *
 */
public interface ElementProcessingFacade {
	
	/**
	 * Pre-process the given Element. By default, do nothing.
	 * 
	 * @param 	element			the Element to be pre-processed
	 */
	default void preProcess(Element element) { }
	
	/**
	 * Process the given Element, returning a unique identifier for that element.
	 * 
	 * @param 	element			the Element to be processed
	 * @return	a unique identifier for the processed Element
	 */
	Object process(Element element);
	
	/**
	 * Post-process the given Element. By default, do nothing.
	 * 
	 * @param 	element			the Element to be post-processed
	 */
	default void postProcess(Element element) { }
	
}
