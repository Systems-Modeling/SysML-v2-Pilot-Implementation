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

public class ProjectRepository {
	private final String repositoryURL;
	
	private final ApiClient apiClient = new ApiClient();
	private final ProjectApi projectApi = new ProjectApi(apiClient);
	private final BranchApi branchApi = new BranchApi(apiClient);
	private final CommitApi commitApi = new CommitApi(apiClient);
	private final QueryApi queryApi = new QueryApi(apiClient);
	private final ElementApi elementApi = new ElementApi(apiClient);
	
	private final PagerInterceptor pager;
	
	private final Map<Object, Element> projectElements = new HashMap<>();
	private List<Element> projectRoots = new LinkedList<>();
	
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
	
	//this may lead to concurrency problems, do not use asynchronous calls
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
		
		public void reset() {
			nextCursor = null;
		}
		
		public String next() {
			return nextCursor;
		}
		
		public boolean hasNext() {
			return nextCursor != null;
		}
	}
	
	public List<RepositoryProject> getProjects(){
		try {
			List<Project> projects = projectApi.getProjects(null, null, null);
			return projects.stream().map(p -> new RepositoryProject(p.getAtId(), p.getName())).toList();
		} catch (ApiException e) {
			return Collections.emptyList();
		}
	}
	
	public RepositoryProject getProjectById(String projectId) {
		return new RepositoryProject(UUID.fromString(projectId));
	}
	
	public RepositoryProject getProjectByName(String projectName) {
		try {
			List<Project> projects = projectApi.getProjects(null, null, null);
			return projects.stream().filter(p -> Objects.equals(projectName, p.getName())).findFirst()
					.map(p -> new RepositoryProject(p.getAtId(), projectName)).orElse(null);
		} catch (ApiException e) {
			return null;
		}
	}
	
	public class RepositoryProject {
		
		private final UUID projectUUID;
		private String projectName;
		private boolean isLoaded = false;
		
		private RepositoryProject(UUID projectId) {
			this.projectUUID = projectId;
		}
		
		private RepositoryProject(UUID projectId, String projectName) {
			this(projectId);
			this.projectName = projectName;
		}
		
		public boolean loadRemote() {
			try {
				Project project = projectApi.getProjectById(projectUUID);
				
				ProjectDefaultBranch defaultBranch = project.getDefaultBranch();
				UUID defaultBranchId = defaultBranch.getAtId();
				
				Branch mainBranch = branchApi.getBranchesByProjectAndId(projectUUID, defaultBranchId);
				UUID headCommit = mainBranch.getHead().getAtId();
				
				pager.reset();
				
				do {
					List<Element> elements = elementApi.getElementsByProjectCommit(projectUUID, headCommit, pager.next(), null, null);
					elements.forEach(el -> projectElements.put(el.get("@id"), el));
				} while (pager.hasNext());
				
				projectRoots = elementApi.getRootsByProjectCommit(projectUUID, headCommit, null, null, null);
				isLoaded = true;
			} catch (ApiException e) {
				isLoaded = false;
			}
			
			return isLoaded;
		}
		
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
		
		public UUID getProjectId() {
			return projectUUID;
		}
		
		public List<Element> getProjectRoots() {
			return projectRoots;
		}
		
		public Map<Object, Element> getElements() {
			return projectElements;
		}
		
		public Element getElement(Object uuid) {
			return projectElements.get(uuid);
		}
	}
}
