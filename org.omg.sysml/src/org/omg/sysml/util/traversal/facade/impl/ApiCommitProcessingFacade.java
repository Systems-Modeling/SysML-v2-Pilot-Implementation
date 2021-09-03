/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2021 Model Driven Solutions, Inc.
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
import org.omg.sysml.model.ElementVersion;
import org.omg.sysml.util.traversal.Traversal;
import org.omg.sysml.util.traversal.facade.ElementProcessingFacade;

import okhttp3.OkHttpClient;

/**
 * This is an element-processing facade that uses the SysML v2 REST API to write Elements to a repository.
 * A change set of ElementVersions is constructed during traversal of the model. Once the traversal is
 * completed, this change set can be committed to the repository.
 * 
 * @author Ed Seidewitz
 *
 */
public class ApiCommitProcessingFacade implements ElementProcessingFacade {

	/**
	 * The default base path for accessing the REST end point.
	 */
	public static final String DEFAULT_BASE_PATH = "http://sysml2-dev.intercax.com:9000";
	
	private final ApiClient apiClient = new ApiClient();
	private final ProjectApi projectApi = new ProjectApi(apiClient);
	private final CommitApi commitApi = new CommitApi(apiClient);
	private final JsonExportProcessingFacade jsonExportElementProcessingFacade = new JsonExportProcessingFacade();

	private final org.omg.sysml.model.Project project;

	/**
	 * Create a facade for processing the Elements of a project with the given name. A project with that name
	 * is created in the repository, and subsequently processed Elements are added to that project.
	 * 
	 * @param 	projectName			the name of the project for which Elements are being saved
	 * @param	basePath			the base path to be used to access the REST end point.
	 */
	public ApiCommitProcessingFacade(String projectName, String basePath) {
		this.apiClient.setBasePath(basePath);		
		this.apiClient.setHttpClient(
			new OkHttpClient.Builder().
				connectTimeout(1, TimeUnit.HOURS).
				readTimeout(1, TimeUnit.HOURS).
				writeTimeout(1, TimeUnit.HOURS).
				build());
		
		org.omg.sysml.model.Project project = new org.omg.sysml.model.Project();
		project.setName(projectName);
		try {
			this.project = projectApi.postProject(project);
		} catch (ApiException e) {
			throw new RuntimeException(e.getCode() + " " + e.getMessage());
		}
	}
	
	/**
	 * Create a facade for processing the Elements of a model with the given name using the default base path.
	 * 
	 * @param 	projectName			the name of the project for which Elements are being saved
	 * @throws 	ApiException
	 */
	public ApiCommitProcessingFacade(String projectName) throws ApiException {
		this(projectName, DEFAULT_BASE_PATH);
	}
	
	/**
	 * Set the source SysML model traversal.
	 * 
	 * @param 	traversal			the source SysML model traversal from which Elements are being saved
	 */
	public void setTraversal(Traversal traversal) {
		jsonExportElementProcessingFacade.setTraversal(traversal);
	}
	
	/**
	 * Get the source SysML model traversal.
	 * 
	 * @return	the source SysML model traversal from which Elements are being saved
	 */
	public Traversal getTraversal() {
		return jsonExportElementProcessingFacade.getTraversal();
	}
	
	/**
	 * Set whether the facade prints a detailed trace of what is being traversed.
	 * 
	 * @param 	isVerbose		whether verbose mode is to be activated
	 */
	public void setIsVerbose(boolean isVerbose) {
		jsonExportElementProcessingFacade.setIsVerbose(isVerbose);
	}
	
	/**
	 * Return whether verbose mode is active.
	 * 
	 * @return whether verbose mode is active
	 */
	public boolean isVerbose() {
		return jsonExportElementProcessingFacade.isVerbose();
	}
	
	/**
	 * Get a string representation of the UUID of the project as it is saved in the repository.
	 * 
	 * @return	the UUID of the project saved in the repository
	 */
	public String getProjectId() {
		return this.project.getAtId().toString();
	}
	
	@Override
	public void preProcess(Element element) {
		jsonExportElementProcessingFacade.preProcess(element);
	}
	
	@Override
	public Object process(Element element) {
		return jsonExportElementProcessingFacade.process(element);
	}
	
	@Override
	public void postProcess(Element element) {
		jsonExportElementProcessingFacade.postProcess(element);
	}

	/**
	 * Create and post a commit to save to the repository the ElementVersions in the 
	 * constructed change set.
	 */
	public void commit() {
		try {
			List<ElementVersion> changes = jsonExportElementProcessingFacade.getVersions();
			Commit commit = new Commit().change(changes);
//			System.out.println(new org.omg.sysml.JSON().serialize(commit));
			int n = changes.size();
			System.out.print("\nPosting Commit (" + n + " element" + (n == 1? ")...": "s)..."));
			commit = this.commitApi.postCommitByProject(this.project.getAtId(), commit, null);
			System.out.println(commit.getAtId());
		} catch (ApiException e) {
			System.out.println("\nError: " + e.getCode() + " " + e.getMessage());
		}
	}
}
