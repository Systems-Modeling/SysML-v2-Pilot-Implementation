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
import org.omg.sysml.model.BranchHead;
import org.omg.sysml.model.Commit;
import org.omg.sysml.model.DataVersion;
import org.omg.sysml.model.Element;
import org.omg.sysml.model.Identified;
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
	
	public static final String ID_FIELD = Identified.SERIALIZED_NAME_AT_ID;
	
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
	public List<RemoteProject> getProjects() {
		try {
			List<Project> projects = new LinkedList<>();
			pager.reset();
			
			do {
				projects.addAll(getProjectApi().getProjects(pager.next(), null, null));
			} while (pager.hasNext());
			
			return projects.stream().map(p -> new RemoteProject(this, p.getAtId(), p.getName())).toList();
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to query projects", e);
		}
	}
	
	/**
	 * Returns a {@link RemoteProject} with the given UUID.
	 * 
	 * @param projectId UUID of the project as String
	 * @return wrapper object for the project or null if the no project with the UUID can be found
	 */
	public RemoteProject getProjectById(String projectId) {
		if (projectId == null) {
			throw new IllegalArgumentException("projectId cannot be null");
		}
		UUID projectUUID = UUID.fromString(projectId);
		return getPRojectById(projectUUID);
	}
	
	/**
	 * Returns a {@link RemoteProject} with the given UUID.
	 * 
	 * @param projectId UUID of the project
	 * @return wrapper object for the project or null if the no project with the UUID can be found
	 */
	public RemoteProject getPRojectById(UUID projectId) {
		if (projectId == null) {
			throw new IllegalArgumentException("projectId cannot be null");
		}
		try {
			Project projectById = getProjectApi().getProjectById(projectId);
			return projectById == null? null: new RemoteProject(this, projectId, projectById.getName());
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to query the project", e);
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
			throw new RemoteException("Error occured while trying to query the project", e);
		}
	}
	
	/**
	 * Creates a project in the project repository.
	 * 
	 * @param projectName name of the project
	 * @return wrapper object for the new project
	 * @throws ApiException
	 */
	public RemoteProject createProject(String projectName) {
		try {
		Project project = new Project();
		project.setName(projectName);
		Project createdProject = getProjectApi().postProject(project);
		return new RemoteProject(this, createdProject.getAtId(), createdProject.getName());
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to create project", e);
		}
	}
	
	protected Map<UUID, Element> getModelRoots(UUID projectId, UUID commitId) {
		try {
			pager.reset();
			Map<UUID, Element> projectRoots = new HashMap<>();
			do {
				List<Element> roots = getElementApi().getRootsByProjectCommit(projectId, commitId, pager.next(), null, null);
				roots.forEach(el -> projectRoots.put(UUID.fromString(el.get(ID_FIELD).toString()), el));
			} while (this.pager.hasNext());
			return projectRoots;
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to download model roots", e);
		}
	}
	
	protected Map<UUID, Element> getModelElements(UUID projectId, UUID commitId) {
		try {
			Map<UUID, Element> projectElements = new HashMap<>();
			pager.reset();
			do {
				List<Element> elements = getElementApi().getElementsByProjectCommit(projectId, commitId, pager.next(), null, null);
				elements.forEach(el -> projectElements.put(UUID.fromString(el.get(ID_FIELD).toString()), el));
			} while (pager.hasNext());
			return projectElements;
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to download model", e);
		}
	}

	protected String getProjectName(UUID projectId) {
		if (projectId == null) {
			throw new IllegalArgumentException("projectId cannot be null");
		}
		try {
			Project project = getProjectApi().getProjectById(projectId);
			return project == null? null : project.getName();
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to access project", e);
		}
	}
	
	protected Branch getBranch(UUID projectId, UUID branchId) {
		if (projectId == null) {
			throw new IllegalArgumentException("projectId cannot be null");
		}
		if (branchId == null) {
			throw new IllegalArgumentException("branchId cannot be null");
		}
		try {
			return getBranchApi().getBranchesByProjectAndId(projectId, branchId);
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to query branch", e);
		}
	}
	
	protected Branch createBranch(UUID projectId, UUID commitId, String name) {
		if (projectId == null) {
			throw new IllegalArgumentException("projectId cannot be null");
		}
		
		try {
			BranchHead branchHead = new BranchHead().atId(commitId);
			Branch branch = new Branch().head(branchHead).referencedCommit(branchHead);
			branch.setName(name);
			return getBranchApi().postBranchByProject(projectId, branch);
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to create branch", e);
		}
	}
	
	protected ProjectDefaultBranch getDefaultBranch(UUID projectId) {
		if (projectId == null) {
			throw new IllegalArgumentException("projectId cannot be null");
		}

		try {
			Project project = getProjectApi().getProjectById(projectId);
			ProjectDefaultBranch defaultBranch = project.getDefaultBranch();
			return defaultBranch;
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to query default branch", e);
		}
	}
	
	protected Branch getBranch(UUID projectId, String branchName) {
		if (projectId == null) {
			throw new IllegalArgumentException("projectId cannot be null");
		}

		try {
			List<Branch> branches = new LinkedList<>();
			pager.reset();
			do {
				branches.addAll(getBranchApi().getBranchesByProject(projectId, pager.next(), null, null));
			} while (pager.hasNext());
			
			return branches.stream().filter(b -> Objects.equals(b.getName(), branchName)).findFirst().orElse(null);
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to query branch", e);
		}
	}
	
	protected Commit getCommit(UUID projectId, UUID commitId) {
		if (projectId == null) {
			throw new IllegalArgumentException("projectId cannot be null");
		}
		if (commitId == null) {
			throw new IllegalArgumentException("branchId cannot be null");
		}
		try {
			return getCommitApi().getCommitByProjectAndId(projectId, commitId);
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to query commit", null);
		}
	}
	
	public Commit commitChanges(UUID projectId, UUID branchId, UUID previousCommitId, List<DataVersion> changes) {
		try {
			Commit commit = new Commit();
			commit.setChange(changes);
			commit.setPreviousCommit(new BranchHead().atId(previousCommitId));
			return commitApi.postCommitByProject(projectId, commit, branchId);
		} catch (ApiException e) {
			throw new RemoteException("Error occured while trying to post commit", e);
		}
	}
	
	protected ProjectApi getProjectApi() {
		return projectApi;	}

	protected ElementApi getElementApi() {
		return elementApi;
	}

	protected BranchApi getBranchApi() {
		return branchApi;
	}
	
	protected CommitApi getCommitApi() {
		return commitApi;
	}
	
	protected QueryApi getQueryApi() {
		return queryApi;
	}
	
	/**
	 * Exception thrown by the ProjectRepository in case of server errors.
	 */
	public static class RemoteException extends RuntimeException {
		private static final long serialVersionUID = 4949283470185055639L;
		private final ApiException apiException;
		
		public RemoteException(String message, ApiException ex) {
			super(message, ex);
			apiException = ex;
		}
		
		public int getCode() {
			return apiException.getCode();
		}
		
		public String getResponseBody() {
			return apiException.getResponseBody();
		}
		
		@Override
		public String getMessage() {
			String response = getResponseBody() == null? "" : ". Response: " + getResponseBody();
			return super.getMessage() + ". Error code: " + getCode() + response;
		}
	}
}
