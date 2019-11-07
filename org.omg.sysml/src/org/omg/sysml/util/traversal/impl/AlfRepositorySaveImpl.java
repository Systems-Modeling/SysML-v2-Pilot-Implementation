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

import java.nio.file.Paths;
import java.util.Date;

import org.omg.sysml.ApiException;
import org.omg.sysml.util.traversal.facade.impl.ApiElementProcessingFacade;

/**
 * This is a utility for traversing a SysML model graph and saving each Element that is 
 * visited to a repository using the SysML v2 REST API.
 * 
 * @author Ed Seidewitz
 *
 */
public class AlfRepositorySaveImpl extends AlfTraversalImpl {
	
	/**
	 * A string representation of the UUID of the Model in the repository to which Elements and
	 * Relationships are being saved.
	 */
	private String modelId;
	
	/**
	 * Create a traversal to save model Elements and Relationships into a repository Model with
	 * the given name.
	 *  
	 * @param 	modelName			the name to be used for the repository model
	 * @throws 	ApiException
	 */
	public AlfRepositorySaveImpl(String modelName) throws ApiException {
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(modelName);	
		processingFacade.setTraversal(this.initialize(processingFacade));
		this.modelId = processingFacade.getProjectId();
	}
	
	/**
	 * Return the identifier for the repository Model to which Elements and Relationships are being
	 * saved.
	 * 
	 * @return	A string representation of the UUID of the Model in the repository
	 */
	public String getModelId() {
		return this.modelId;
	}
	
	/**
	 * The main program reads the Alf resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only saved to the repository if they are referenced
	 * from an input resource or are directly or indirectly related to another Element so referenced.
	 * 
	 * @param 	args	the first argument is a path for reading input resources, while other arguments
	 * 					are paths for reading library resources
	 */
	public static void main(String[] args) {
		try {
			String modelName = Paths.get(args[0]).getFileName().toString();
			int i = modelName.indexOf('.');
			if (i >= 0) {
				modelName = modelName.substring(0, i);
			}
			modelName += " " + new Date();
			
			AlfRepositorySaveImpl save = new AlfRepositorySaveImpl(modelName);
			
			save.read(args);
			
			System.out.println("Saving model " + modelName + "...");
			System.out.println("... model id is " + save.getModelId());
			
			save.process();
		} catch (ApiException e) {
			System.out.println("Error: " + e.getCode() + " " + e.getMessage());
		}
	}

}
