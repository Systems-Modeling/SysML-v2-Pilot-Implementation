/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2025 Model Driven Solutions, Inc.
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
 * Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.sysml.util.repository;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
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
import org.omg.sysml.model.Element;
import org.omg.sysml.model.Project;

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
		this.pager = new PagerInterceptor();
		
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
	class PagerInterceptor implements Interceptor {
		
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
	public List<RemoteProject> getProjects(){
		try {
			List<Project> projects = getProjectApi().getProjects(null, null, null);
			return projects.stream().map(p -> new RemoteProject(this, p.getAtId(), p.getName())).toList();
		} catch (ApiException e) {
			return Collections.emptyList();
		}
	}
	
	/**
	 * Returns a {@link RemoteProject} with the given UUID.
	 * 
	 * @param projectId UUID of the project as String
	 * @return wrapper object for the project or null if the no project with the UUID can be found
	 */
	public RemoteProject getProjectById(String projectId) {
		UUID projectUUID = UUID.fromString(projectId);
		return getPRojectById(projectUUID);
	}
	
	/**
	 * Returns a {@link RemoteProject} with the given UUID.
	 * 
	 * @param projectUUID UUID of the project
	 * @return wrapper object for the project or null if the no project with the UUID can be found
	 */
	public RemoteProject getPRojectById(UUID projectUUID) {
		try {
			Project projectById = getProjectApi().getProjectById(projectUUID);
			return projectById == null? null: new RemoteProject(this, projectUUID, projectById.getName());
		} catch (ApiException e) {
			return null;
		}
	}
	
	/**
	 * Returns a {@link RemoteProject} with the given UUID.
	 * 
	 * @param projectName name of the project
	 * @return wrapper object for the project or null if the no project with such name can be found
	 */
	public RemoteProject getProjectByName(String projectName) {
		try {
			List<Project> projects = getProjectApi().getProjects(null, null, null);
			return projects.stream().filter(p -> Objects.equals(projectName, p.getName())).findFirst()
					.map(p -> new RemoteProject(this, p.getAtId(), projectName)).orElse(null);
		} catch (ApiException e) {
			return null;
		}
	}
	
	public RemoteProject createProject(String projectName) throws ApiException {
		Project project = new Project();
		project.setName(projectName);
		Project createdProject = getProjectApi().postProject(project);
		return new RemoteProject(this, createdProject.getAtId(), createdProject.getName());
	}
	
	Map<UUID, Element> getModelRoots(Revision revision) throws ApiException {
		pager.reset();
		Map<UUID, Element> projectRoots = new HashMap<>();
		do {
			List<Element> roots = getElementApi().getRootsByProjectCommit(revision.getRemoteProject().getRemoteId(), revision.getRemoteId(), pager.next(), null, null);
			roots.forEach(el -> projectRoots.put(UUID.fromString(el.get("@id").toString()), el));
		} while (this.pager.hasNext());
		return projectRoots;
	}
	
	Map<UUID, Element> getModelElements(Revision revision) throws ApiException {
		Map<UUID, Element> projectElements = new HashMap<>();
		pager.reset();
		do {
			List<Element> elements = getElementApi().getElementsByProjectCommit(revision.getRemoteProject().getRemoteId(), revision.getRemoteId(), pager.next(), null, null);
			elements.forEach(el -> projectElements.put(UUID.fromString(el.get("@id").toString()), el));
		} while (pager.hasNext());
		return projectElements;
	}

	public ProjectApi getProjectApi() {
		return projectApi;
	}

	public ElementApi getElementApi() {
		return elementApi;
	}

	public BranchApi getBranchApi() {
		return branchApi;
	}
	
	public CommitApi getCommitApi() {
		return commitApi;
	}
	
	public QueryApi getQueryApi() {
		return queryApi;
	}
}
