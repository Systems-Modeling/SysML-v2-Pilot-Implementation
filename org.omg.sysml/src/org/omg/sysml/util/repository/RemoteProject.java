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

import java.util.NoSuchElementException;
import java.util.UUID;

import org.omg.sysml.ApiException;
import org.omg.sysml.model.Branch;
import org.omg.sysml.model.BranchHead;
import org.omg.sysml.model.Project;
import org.omg.sysml.model.ProjectDefaultBranch;

/**
 * Project in the repository.
 */
public class RemoteProject {
	private final ProjectRepository projectRepository;
	private final UUID projectUUID;
	private String projectName;
	
	/**
	 * @param projectRepository parent repository
	 * @param projectId UUID of the project
	 */
	private RemoteProject(ProjectRepository projectRepository, UUID projectId) {
		this.projectRepository = projectRepository;
		this.projectUUID = projectId;
	}
	
	/**
	 * @param projectRepository parent repository
	 * @param projectId UUID of the project
	 * @param projectName name of the project
	 */
	RemoteProject(ProjectRepository projectRepository, UUID projectId, String projectName) {
		this(projectRepository, projectId);
		this.projectName = projectName;
	}
	
	/**
	 * Default branch of the project
	 * 
	 * @return default branch
	 * @throws ApiException
	 * @throws NoSuchElementException if project has no default branch
	 */
	public RemoteBranch getDefaultBranch() throws ApiException, NoSuchElementException {
		Project project = this.getProjectRepository().getProjectApi().getProjectById(projectUUID);
		ProjectDefaultBranch defaultBranch = project.getDefaultBranch();
		UUID defaultBranchId = defaultBranch.getAtId();
		
		if (defaultBranchId == null) throw new NoSuchElementException("Remote project does not have a default branch!");
		
		return new RemoteBranch(defaultBranchId);
	}
	
	/**
	 * Creates branch of a revision
	 * 
	 * @param revision revision to create the branch from
	 * @param name name of the branch
	 * @return new branch
	 * @throws ApiException
	 */
	public RemoteBranch createBranch(ProjectRevision revision, String name) throws ApiException {
		ProjectRepository projectRepository = getProjectRepository();
		BranchHead branchHead = new BranchHead().atId(getRemoteId());
		Branch branch = new Branch().head(branchHead).referencedCommit(branchHead);
		branch.setName(name);
		Branch newBranch = projectRepository.getBranchApi().postBranchByProject(getRemoteId(), branch);
		return new RemoteBranch(newBranch.getAtId(), newBranch.getName());
	}
	
	/**
	 * @return name of the project or null if the project doesn't exist in the repository
	 */
	public String getProjectName() {
		if (projectName == null) {
			try {
				Project project = getProjectRepository().getProjectApi().getProjectById(projectUUID);
				projectName = project.getName();
			} catch (ApiException e) {
				//No op
			}
		}
		return projectName;
	}
	
	/**
	 *@return UUID of the project
	 */
	public UUID getRemoteId() {
		return projectUUID;
	}

	/**
	 * @return parent repository
	 */
	public ProjectRepository getProjectRepository() {
		return projectRepository;
	}
	
	/**
	 * Branches in the project repository
	 */
	public class RemoteBranch {
		private final UUID branchId;
		private String name;
		
		public RemoteBranch(UUID branchId) {
			this.branchId = branchId;
		}
		
		public RemoteBranch(UUID branchId, String name) {
			this(branchId);
			this.name = name;
		}
		
		/**
		 * @return UUID of the branch
		 */
		public UUID getRemoteId() {
			return branchId;
		}
		
		public String getName() throws ApiException {
			if (name == null) {
				Branch branch = loadBranch();
				name = branch.getName();
			}
			
			return name;
		}
		
		/**
		 * @return head commit of the branch in the project repository
		 * @throws ApiException
		 * @throws NoSuchElementException if branch has no head revision (commit)
		 */
		public ProjectRevision getHeadRevision() throws ApiException, NoSuchElementException {
			Branch branch = loadBranch();
			BranchHead branchHead = branch.getHead();
			
			if (branchHead == null) {
				return new ProjectRevision(RemoteProject.this, this);
			}

			UUID branchHeadId = branchHead.getAtId();
			
			return new ProjectRevision(RemoteProject.this, this, branchHeadId);
		}
		
		private Branch loadBranch() throws ApiException {
			return getProjectRepository().getBranchApi().getBranchesByProjectAndId(getRemoteProject().getRemoteId(), getRemoteId());
		}
		
		/**
		 * @return parent project
		 */
		public RemoteProject getRemoteProject() {
			return RemoteProject.this;
		}
	}
}