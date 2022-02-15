/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2022 Model Driven Solutions, Inc.
 * Copyright (c) 2021 Twingineer LLC
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
 *  Ivan Gomes
 * 
 *****************************************************************************/
package org.omg.sysml.util.traversal.facade.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.api.CommitApi;
import org.omg.sysml.api.ProjectApi;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.model.Commit;
import org.omg.sysml.model.DataVersion;
import okhttp3.OkHttpClient;

/**
 * This is an element-processing facade that uses the SysML v2 REST API to write Elements to a repository.
 * A change set of DataVersions is constructed during traversal of the model. Once the traversal is
 * completed, this change set can be committed to the repository.
 * 
 * @author Ed Seidewitz
 *
 */
public class ApiElementProcessingFacade extends JsonElementProcessingFacade {

	/**
	 * The default base path for accessing the REST end point.
	 */
	public static final String DEFAULT_BASE_PATH = "http://sysml2-dev.intercax.com:9000";
	
	private final ApiClient apiClient = new ApiClient();
	private final ProjectApi projectApi = new ProjectApi(apiClient);
	private final CommitApi commitApi = new CommitApi(apiClient);

	private org.omg.sysml.model.Project project = new org.omg.sysml.model.Project();

	/**
	 * Create a facade for processing the Elements to be saved to the repository with the
	 * given basePath. After all Elements are processed, they can be committed, at which point
	 * they are written to a newly created project with the given projectName.
	 * 
	 * @param 	projectName			the name of the project for which Elements are being saved
	 * @param	basePath			the base path to be used to access the REST end point.
	 */
	public ApiElementProcessingFacade(String projectName, String basePath) {
		this.apiClient.setBasePath(basePath);		
		this.apiClient.setHttpClient(
			new OkHttpClient.Builder().
				connectTimeout(1, TimeUnit.HOURS).
				readTimeout(1, TimeUnit.HOURS).
				writeTimeout(1, TimeUnit.HOURS).
				build());
		
		this.project.setName(projectName);
	}
	
	/**
	 * Create a facade for processing the Elements of a model with the given name using the default base path.
	 * 
	 * @param 	projectName			the name of the project for which Elements are being saved
	 * @throws 	ApiException
	 */
	public ApiElementProcessingFacade(String projectName) throws ApiException {
		this(projectName, DEFAULT_BASE_PATH);
	}
	
	/**
	 * Get a string representation of the UUID of the project as it is saved in the repository.
	 * 
	 * @return	the UUID of the project saved in the repository
	 */
	public String getProjectId() {
		return this.project.getAtId().toString();
	}
	
	/**
	 * Record that the given Element is being processed by returning a UUID constructed
	 * from its identifier.
	 * 
	 * @param 	element				the Element to be processed
	 * @return	a unique identifier for the processed Element
	 */
	@Override
	public Object process(Element element) {
		if (!this.isVerbose() && this.elementCount == 0) {
			System.out.print("Processing");
			this.dotCount = "Processing".length();
		}
		return super.process(element);
	}
	
	/**
	 * Create a new project in the repository, then create and post a commit to the project to save the 
	 * ElementVersions constructed from the processed model Elements.
	 * 
	 * @return	whether the commit succeeded without an ApiException
	 */
	public boolean commit() {
		try {
			this.project = projectApi.postProject(this.project);
			
			List<DataVersion> changes = this.getVersions();
			Commit commit = new Commit().change(changes);
//			System.out.println(new org.omg.sysml.JSON().serialize(commit));
			
			int n = changes.size();
			System.out.print("\nPosting Commit (" + n + " element" + (n == 1? ")...": "s)..."));
			commit = this.commitApi.postCommitByProject(this.project.getAtId(), commit, null);
			System.out.println(commit.getAtId());
			return true;
		} catch (ApiException e) {
			System.out.println("\nError: " + e.getCode() + " " + e.getMessage());
			return false;
		}
	}
}
