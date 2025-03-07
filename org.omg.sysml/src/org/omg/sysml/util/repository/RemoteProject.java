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

import org.omg.sysml.model.Branch;
import org.omg.sysml.model.BranchHead;
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
	 * @return default branch or null if project has no default branch
	 */
	public RemoteBranch getDefaultBranch() throws NoSuchElementException {
		ProjectDefaultBranch defaultBranch = getProjectRepository().getDefaultBranch(getRemoteId());
		if (defaultBranch == null || defaultBranch.getAtId() == null) return null;
		return new RemoteBranch(defaultBranch.getAtId(), true);
	}
	
	/**
	 * Branch by name
	 *  
	 * @param branchName	name of the branch
	 * @return	branch with the given name or null if no branch is found
	 */
	public RemoteBranch getBranch(String branchName) {
		Branch branch = getProjectRepository().getBranch(getRemoteId(), branchName);
		if (branch == null || branch.getAtId() == null) return null;
		return new RemoteBranch(branch.getAtId(), branch.getName());
	}
	
	/**
	 * Branch by id
	 * 
	 * @param branchId	id of the branch
	 * @return	branch with the given UUID or null of no such branch is found
	 */
	public RemoteBranch getBranch(UUID branchId) {
		Branch branch = getProjectRepository().getBranch(getRemoteId(), branchId);
		if (branch == null || branch.getAtId() == null) return null;
		return new RemoteBranch(branch.getAtId(), branch.getName());
	}
	
	/**
	 * Creates branch of a revision
	 * 
	 * @param revision revision to create the branch from
	 * @param name name of the branch
	 * @return new branch
	 */
	public RemoteBranch createBranch(Revision revision, String name) {
		UUID commitId = revision.getRemoteId();
		Branch newBranch = getProjectRepository().createBranch(getRemoteId(), commitId, name);
		return new RemoteBranch(newBranch.getAtId(), newBranch.getName());
	}
	
	/**
	 * @return name of the project or null if the project doesn't exist in the repository
	 */
	public String getProjectName() {
		if (projectName == null) {
			projectName = getProjectRepository().getProjectName(projectUUID);
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
		private final boolean isDefault;
		
		/**
		 * @param  @param branchId UUID of the branch on the API server
		 */
		public RemoteBranch(UUID branchId, boolean isDefault) {
			this.branchId = branchId;
			this.isDefault = isDefault;
		}
		
		
		/**
		 * @param branchId UUID of the branch on the API server
		 * @param name of the branch
		 */
		public RemoteBranch(UUID branchId, String name) {
			this(branchId, false);
			this.name = name;
		}
		
		/**
		 * @return UUID of the branch
		 */
		public UUID getRemoteId() {
			return branchId;
		}
		
		/**
		 * @return name of the branch
		 */
		public String getName() {
			if (name == null) {
				Branch branch = getBranch();
				name = branch.getName();
			}
			return name;
		}
		
		/**
		 * Head revision of the branch. If the branch doesn't have a head revision on the server
		 * a local one is created which can be later pushed as the first commit on the branch.
		 * 
		 * @return head commit of the branch in the project repository
		 */
		public Revision getHeadRevision() {
			Branch branch = getBranch();
			BranchHead branchHead = branch.getHead();
			
			if (branchHead == null) {
				return new Revision(RemoteProject.this, this);
			}

			UUID branchHeadId = branchHead.getAtId();
			
			return new Revision(RemoteProject.this, this, branchHeadId);
		}
		
		private Branch getBranch() {
			return getProjectRepository().getBranch(getRemoteProject().getRemoteId(), getRemoteId());
		}
		
		/**
		 * @return parent project
		 */
		public RemoteProject getRemoteProject() {
			return RemoteProject.this;
		}

		/**
		 * @return true if this branch is the default branch of its project
		 */
		public boolean isDefault() {
			return isDefault;
		}
	}
}