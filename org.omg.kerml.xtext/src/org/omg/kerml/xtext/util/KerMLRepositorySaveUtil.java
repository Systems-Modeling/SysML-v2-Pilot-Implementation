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

import java.nio.file.Paths;
import java.util.Arrays;
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
public class KerMLRepositorySaveUtil extends KerMLTraversalUtil {
	
	/**
	 * A string representation of the UUID of the Project in the repository to which Elements and
	 * Relationships are being saved.
	 */
	private String projectId;
	
	public void initialize(String modelName, String basePath) throws ApiException  {
		ApiElementProcessingFacade processingFacade = new ApiElementProcessingFacade(modelName, basePath);	
		processingFacade.setTraversal(this.initialize(processingFacade));
		this.projectId = processingFacade.getProjectId();
	}
	
	/**
	 * Return the identifier for the repository Project to which Elements and Relationships are being
	 * saved.
	 * 
	 * @return	A string representation of the UUID of the Project in the repository
	 */
	public String getProjectId() {
		return this.projectId;
	}
	
	/**
	 * Run the traversal for the given main program arguments.
	 * 
	 * @param 	args		the array of main program arguments
	 */
	public void run(String[] args) {
		try {
			int n = args.length;
			if (n > 0) {
				String basePath = ApiElementProcessingFacade.DEFAULT_BASE_PATH;
				if ("-b".equals(args[0]) && n > 1) {
					basePath = args[1];
					args = Arrays.copyOfRange(args, 2, n);
				}
				String projectName = Paths.get(args[0]).getFileName().toString();
				int i = projectName.indexOf('.');
				if (i >= 0) {
					projectName = projectName.substring(0, i);
				}
				projectName += " " + new Date();
				
				this.initialize(projectName, basePath);				
				this.read(args);
				
				System.out.println("Base path is " + basePath);
				System.out.println("Saving project " + projectName + "... id is " + this.getProjectId());
				
				this.process();
			}
		} catch (ApiException e) {
			System.out.println("Error: " + e.getCode() + " " + e.getMessage());
		}
	}

	/**
	 * The main program reads the KerML resources as given by its arguments and then processes all the input
	 * resources. Elements from library resources are only saved to the repository if they are referenced
	 * from an input resource or are directly or indirectly related to another Element so referenced.
	 * 
	 * <p>Usage:
	 * 
	 * <p>AlfRepositorySaveImpl [-b base-path-url] input-path [library-path library-path...]
	 * 
	 * <p>where:
	 * 
	 * <ul>
	 * <li>base-path-url is the URL for the base path to be used for the API endpoint (if none is given, the default is used)</li>
	 * <li>input-path is a path for reading input resources</li>
	 * <li>library-paths are paths for reading library resources</li>
	 * </ul>
	 * 
	 */
	public static void main(String[] args) {
		new KerMLRepositorySaveUtil().run(args);
	}

}
