/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.util.repository;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.omg.sysml.ApiClient;
import org.omg.sysml.ApiException;
import org.omg.sysml.api.BranchApi;
import org.omg.sysml.api.CommitApi;
import org.omg.sysml.api.ElementApi;
import org.omg.sysml.api.ProjectApi;
import org.omg.sysml.api.QueryApi;
import org.omg.sysml.model.Branch;
import org.omg.sysml.model.Element;
import org.omg.sysml.model.Project;
import org.omg.sysml.model.ProjectDefaultBranch;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/**
 * Java representation of a model repository that implements the standard API
 */
public class ProjectRepository {
	private final String repositoryURL;
	
	private final ApiClient apiClient = new ApiClient();
	private final ProjectApi projectApi = new ProjectApi(apiClient);
	private final BranchApi branchApi = new BranchApi(apiClient);
	private final CommitApi commitApi = new CommitApi(apiClient);
	private final QueryApi queryApi = new QueryApi(apiClient);
	private final ElementApi elementApi = new ElementApi(apiClient);
	
	private final PagerInterceptor pager;
	
	/**
	 * @param repositoryURL base URL of the model repository
	 */
	public ProjectRepository(String repositoryURL) {
		this.repositoryURL = repositoryURL;
		
		pager = new PagerInterceptor();
		
		this.apiClient.setBasePath(repositoryURL);		
		this.apiClient.setHttpClient(
			new OkHttpClient.Builder().
				connectTimeout(1, TimeUnit.HOURS).
				readTimeout(1, TimeUnit.HOURS).
				writeTimeout(1, TimeUnit.HOURS).
				addInterceptor(pager).
				build());
	}
	
	public String getRepositoryURL() {
		return repositoryURL;
	}
	

	/**
	 * Interceptor to extract the next cursor for paging.<br>
	 * <b>NOTE:</b> Use synchronous calls when paging is needed. 
	 */
	private class PagerInterceptor implements Interceptor {
		
		private String nextCursor = null;
		
		@Override
		public Response intercept(Chain chain) throws IOException {
			Response response = chain.proceed(chain.request());
			
			String link = response.header("link");
			if (link == null) {
				nextCursor = null;
			} else {
				//link is in between '<' and '>'
				link = link.substring(link.indexOf('<') + 1, link.indexOf('>'));
				nextCursor = HttpUrl.get(link).queryParameter("page[after]");
			}
			
			return response;
		}
		
		/**
		 * Unsets the cursor
		 */
		public void reset() {
			nextCursor = null;
		}
		
		/**
		 * @return returns the cursor provided by the last API call or null if there were no cursor
		 */
		public String next() {
			return nextCursor;
		}
		
		/**
		 * @return true if the last API call returned with a cursor
		 */
		public boolean hasNext() {
			return nextCursor != null;
		}
	}
	
	/**
	 * List of all project saved in the model repository
	 * 
	 * @return projects from the repository
	 */
	public List<RepositoryProject> getProjects(){
		try {
			List<Project> projects = projectApi.getProjects(null, null, null);
			return projects.stream().map(p -> new RepositoryProject(p.getAtId(), p.getName())).toList();
		} catch (ApiException e) {
			return Collections.emptyList();
		}
	}
	
	/**
	 * Returns a {@link RepositoryProject} with the given UUID.
	 * The project is not loaded, but it exists in the model repository unless null is returned.
	 * 
	 * Use {@link RepositoryProject#loadRemote()} to load the project.
	 * 
	 * @param projectId UUID of the project as String
	 * @return wrapper object for the project or null if the no project with the UUID can be found
	 */
	public RepositoryProject getProjectById(String projectId) {
		UUID projectUUID = UUID.fromString(projectId);
		return getPRojectById(projectUUID);
	}
	
	/**
	 * Returns a {@link RepositoryProject} with the given UUID.
	 * The project is not loaded, but it exists in the model repository unless null is returned.
	 * 
	 * Use {@link RepositoryProject#loadRemote()} to load the project.
	 * 
	 * @param projectUUID UUID of the project
	 * @return wrapper object for the project or null if the no project with the UUID can be found
	 */
	public RepositoryProject getPRojectById(UUID projectUUID) {
		try {
			Project projectById = projectApi.getProjectById(projectUUID);
			return projectById == null? null: new RepositoryProject(projectUUID, projectById.getName());
		} catch (ApiException e) {
			return null;
		}
	}
	
	/**
	 * Returns a {@link RepositoryProject} with the given UUID.
	 * The project is not loaded, but it exists in the model repository unless null is returned.
	 * 
	 * Use {@link RepositoryProject#loadRemote()} to load the project.
	 * 
	 * @param projectName name of the project
	 * @return wrapper object for the project or null if the no project with such name can be found
	 */
	public RepositoryProject getProjectByName(String projectName) {
		try {
			List<Project> projects = projectApi.getProjects(null, null, null);
			return projects.stream().filter(p -> Objects.equals(projectName, p.getName())).findFirst()
					.map(p -> new RepositoryProject(p.getAtId(), projectName)).orElse(null);
		} catch (ApiException e) {
			return null;
		}
	}
	
	/**
	 * Java wrapper class for projects in the repository.
	 */
	public class RepositoryProject {
		
		private final UUID projectUUID;
		private String projectName;
		private boolean isLoaded = false;
		
		private final Map<UUID, Element> projectElements = new HashMap<>();
		private List<Element> projectRoots = new LinkedList<>();
		
		/**
		 * @param projectId UUID of the project
		 */
		private RepositoryProject(UUID projectId) {
			this.projectUUID = projectId;
		}
		
		/**
		 * @param projectId UUID of the project
		 * @param projectName name of the project
		 */
		private RepositoryProject(UUID projectId, String projectName) {
			this(projectId);
			this.projectName = projectName;
		}
		
		/**
		 * Downloads project contents from the repository. The the downloaded content is the model on the projects default branche's head commit.
		 * 
		 * @return true if the project download is successful
		 */
		public boolean loadRemote() {
			try {
				Project project = projectApi.getProjectById(projectUUID);
				
				if (project == null) {
					return false;
				}
				
				this.projectName = project.getName();
				
				ProjectDefaultBranch defaultBranch = project.getDefaultBranch();
				UUID defaultBranchId = defaultBranch.getAtId();
				
				Branch mainBranch = branchApi.getBranchesByProjectAndId(projectUUID, defaultBranchId);
				UUID headCommit = mainBranch.getHead().getAtId();
				
				pager.reset();
				
				do {
					List<Element> elements = elementApi.getElementsByProjectCommit(projectUUID, headCommit, pager.next(), null, null);
					elements.forEach(el -> projectElements.put(UUID.fromString(el.get("@id").toString()), el));
				} while (pager.hasNext());
				
				pager.reset();
				
				do {
					List<Element> roots = elementApi.getRootsByProjectCommit(projectUUID, headCommit, pager.next(), null, null);
					projectRoots.addAll(roots);
				} while (pager.hasNext());
				
				isLoaded = true;
			} catch (ApiException e) {
				isLoaded = false;
			}
			
			return isLoaded;
		}
		
		/**
		 * @return name of the project or null if the project doesn't exist in the repository
		 */
		public String getProjectName() {
			if (projectName == null) {
				try {
					Project project = projectApi.getProjectById(projectUUID);
					projectName = project.getName();
				} catch (ApiException e) {
					//No op
				}
			}
			return projectName;
		}
		
		/**
		 * UUID of the project
		 */
		public UUID getProjectId() {
			return projectUUID;
		}
		
		/**
		 * Project roots loaded from the repository project. Call {@link RepositoryProject#loadRemote()} first.
		 * <br>
		 * <b>NOTE</b>: these are all the elements that are not contained by any other element.
		 * This means that unresolved proxies show-up as project roots as well as they are not containted by the root Namespaces.
		 * 
		 * @return project roots determined by the repository
		 */
		public List<Element> getProjectRoots() {
			return projectRoots;
		}
		
		/**
		 * All the elements loaded from the repository project. Call {@link RepositoryProject#loadRemote()} first.
		 * 
		 * @return Elements and their UUID from the model repository as a map keyed with UUIDs
		 */
		public Map<UUID, Element> getElements() {
			return projectElements;
		}
		
		/**
		 * Query an element with a given UUID
		 * @param uuid to search for
		 * @return element with matching UUID or null if UUID is not found 
		 */
		public Element getElement(UUID uuid) {
			return projectElements.get(uuid);
		}
	}
}
