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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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

import com.google.gson.GsonBuilder;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class RepositoryProject {
	
	private final String repositoryURL;
	private final String projectName;
	
	private final ApiClient apiClient = new ApiClient();
	private final ProjectApi projectApi = new ProjectApi(apiClient);
	private final BranchApi branchApi = new BranchApi(apiClient);
	private final CommitApi commitApi = new CommitApi(apiClient);
	private final QueryApi queryApi = new QueryApi(apiClient);
	private final ElementApi elementApi = new ElementApi(apiClient);
	
	private final PagerInterceptor pager;
	
	private final Map<Object, Element> projectElements = new HashMap<>();
	private List<Element> projectRoots = new LinkedList<>();
	
	public RepositoryProject(String repositoryURL, String projectName) {
		this.repositoryURL = repositoryURL;
		this.projectName = projectName;
		
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
	
	public void loadRemote() {
		try {
			UUID projectUUID = UUID.fromString(projectName);
			Project project = projectApi.getProjectById(projectUUID);
			System.out.println("Name " + project.getName());
			
			ProjectDefaultBranch defaultBranch = project.getDefaultBranch();
			UUID defaultBranchId = defaultBranch.getAtId();
			System.out.println("Default branch: " + defaultBranchId);
			
			Branch mainBranch = branchApi.getBranchesByProjectAndId(projectUUID, defaultBranchId);
			UUID headCommit = mainBranch.getHead().getAtId();
			
			pager.reset();
			
			do {
				List<Element> elements = elementApi.getElementsByProjectCommit(projectUUID, headCommit, pager.next(), null, null);
				elements.forEach(el -> projectElements.put(el.get("@id"), el));
			} while (pager.hasNext());
			
			
			projectRoots = elementApi.getRootsByProjectCommit(projectUUID, headCommit, null, null, null);
			
			
			String jsonString = new GsonBuilder().setPrettyPrinting().create().toJson(projectElements.values());
			System.out.println(jsonString);
			
		} catch (ApiException e) {
			e.printStackTrace();
		}
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
