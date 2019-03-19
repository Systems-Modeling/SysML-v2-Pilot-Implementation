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

public class AlfRepositorySaveImpl extends AlfTraversalImpl {
	
	private String modelId;
	
	public AlfRepositorySaveImpl(String modelName) throws ApiException {
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(modelName);	
		processingFacade.setTraversal(this.initialize(processingFacade));
		this.modelId = processingFacade.getModelId();
	}
	
	public String getModelId() {
		return this.modelId;
	}
		
	public static void main(String[] args) {
		try {
			String modelName = Paths.get(args[0]).getFileName().toString();
			int i = modelName.indexOf('.');
			if (i >= 0) {
				modelName = modelName.substring(0, i);
			}
			modelName += " " + new Date();
			
			AlfRepositorySaveImpl save = new AlfRepositorySaveImpl(modelName);
			
			System.out.println("Reading " + args[0] + "...");
			save.read(args[0]);
			
			System.out.println("Saving model " + modelName + "...");
			System.out.println("... model id is " + save.getModelId());
			save.process();
		} catch (ApiException e) {
			System.out.println("Error: " + e.getCode() + " " + e.getMessage());
		}
	}

}
