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

import java.util.UUID;

import org.omg.sysml.ApiException;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.util.repository.APIModel;
import org.omg.sysml.util.repository.APIModelDelta;
import org.omg.sysml.util.repository.ProjectRepository;
import org.omg.sysml.util.repository.ProjectRepository.RemoteException;
import org.omg.sysml.util.repository.Revision;
import org.omg.sysml.util.repository.RemoteProject;
import org.omg.sysml.util.repository.RemoteProject.RemoteBranch;

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
	
	private ProjectRepository projectRepository;
	private final String projectName;
	private final String branchName;
	private RemoteProject project;

	/**
	 * Create a facade for processing the Elements to be saved to the repository with the
	 * given basePath. After all Elements are processed, they can be committed, at which point
	 * they are written to a newly created or existing project with the given projectName.
	 * 
	 * @param 	projectName			the name of the project for which Elements are being saved
	 * @param	branchName			the name of the project branch for which Elements are being saved, if null the 'main' branch is used
	 * @param	basePath			the base path to be used to access the REST end point
	 */
	public ApiElementProcessingFacade(String projectName, String branchName, String basePath) {
		this.projectRepository = new ProjectRepository(basePath);
		this.projectName = projectName;
		this.branchName = branchName;
	}
	
	/**
	 * Queries and returns project by {@link #projectName}. If project doesn't exit a new one is created.
	 * 
	 * @return	project for which Elements will be stored 
	 */
	public RemoteProject getOrCreateProject() {
		project = projectRepository.getProjectByName(projectName);
		if (project == null) {
			project = projectRepository.createProject(projectName);
		}
		return project;
	}
	
	
	/**
	 * Create a facade for processing the Elements of a model with the given name using the default base path.
	 * 
	 * @param 	projectName			the name of the project for which Elements are being saved
	 * @throws 	ApiException
	 */
	public ApiElementProcessingFacade(String projectName) throws ApiException {
		this(projectName, null, DEFAULT_BASE_PATH);
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
	 * Create or update a project in the repository, then create and post a commit to the project to save the 
	 * {@link APIModelDelta} constructed from the processed model Elements.
	 * 
	 * @param element to force use as a project root in case of sub-models or null in case of full models
	 * 
	 * @return	whether the commit succeeded without an Exception
	 */
	public boolean commit(Element useAsRoot) {
		try {
			RemoteProject project = getOrCreateProject();
			
			RemoteBranch branch = project.getDefaultBranch();
			
			if (branchName != null) {
				RemoteBranch defaultBranch = branch;
				branch = project.getBranch(branchName);
				if (branch == null) {
					Revision headRevision = defaultBranch.getHeadRevision();
					branch = project.createBranch(headRevision, branchName);
				}
			}
			
			if (branch == null) {
				System.out.println();
				System.out.println("Branch doesn't exist");
				return false;
			}
			
			Revision headRevision = branch.getHeadRevision();
			
			if (headRevision.isRemote()) {
				headRevision.fetchRemote();
			}
			
			APIModel localState = getLocalModel();
			
			if (useAsRoot != null) {
				UUID rootUUID = UUID.fromString(useAsRoot.getElementId());
				var root = localState.getElement(rootUUID);
				//reinsert element as root, this unsets its owners turning it into a root element
				localState.addModelRoot(rootUUID, root);
			}
			
			localState.addOutOfScopeReferencesAsProxies();
			headRevision.setLocalState(localState);
			APIModelDelta localChanges = headRevision.getLocalChanges();
//			System.out.println(new org.omg.sysml.JSON().serialize(localChanges));
			
			int additions = localChanges.getAdditions().size();
			int deletions = localChanges.getDeletions().size();
			int modifiedElements = localChanges.getChanges().size();
			
			System.out.println();
			System.out.println(String.format("Posting commit. Additions: %s, Deletions: %s, Modified elements: %s", additions, deletions, modifiedElements));
			Revision nextRevision = headRevision.pushChanges(localChanges);
			System.out.println(String.format("Successfully posted commit: %s on branch: (%s) %s", nextRevision.getRemoteId(), branch.getName(), branch.getRemoteId()));
			return true;
		} catch (RemoteException e) {
			System.out.println();
			System.err.println(e);
			return false;
		}
	}

	public String getProjectId() {
		return getOrCreateProject().getRemoteId().toString();
	}
}
