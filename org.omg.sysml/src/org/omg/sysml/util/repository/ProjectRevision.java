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

import java.util.List;
import java.util.UUID;

import org.omg.sysml.ApiException;
import org.omg.sysml.api.CommitApi;
import org.omg.sysml.model.BranchHead;
import org.omg.sysml.model.Commit;
import org.omg.sysml.model.DataVersion;
import org.omg.sysml.util.repository.RemoteProject.RemoteBranch;

/**
 * Revision of a {@link RemoteProject}. Can be used to store changes locally or
 * to commit changes to the project repository
 */
public class ProjectRevision {
	
	private final RemoteProject project;
	private UUID remoteId;
	private ProjectRevision previousRevision;
	
	private APIModel remoteState;
	private APIModel localState;
	private RemoteBranch remoteBranch;
	
	public ProjectRevision(RemoteProject project, RemoteBranch remoteBranch) {
		this.project = project;
		this.remoteBranch = remoteBranch;
	}
	
	public ProjectRevision(RemoteProject project, RemoteBranch remoteBranch, UUID remoteId) {
		this(project, remoteBranch);
		this.remoteId = remoteId;
	}
	
	/**
	 * Creates a new empty revision and sets this revision as the parent
	 * 
	 * @return empty revision
	 */
	public ProjectRevision createNewRevision() {
		ProjectRevision newRevision = new ProjectRevision(project, remoteBranch);
		newRevision.setPreviousRevision(this);
		return newRevision;
	}
	
	/**
	 * Downloads the remote state from the project repository
	 * 
	 * @return
	 * @throws UnsupportedOperationException if the revision is local only
	 * @throws ApiException
	 */
	public APIModel fetchRemote() throws UnsupportedOperationException, ApiException {
		if (isRemote()) {
			var remoteModelRoots = project.getProjectRepository().getModelRoots(this);
			var remoteElements = project.getProjectRepository().getModelElements(this);
			remoteState = new APIModel(remoteElements, remoteModelRoots);
			return remoteState;
		} else throw new UnsupportedOperationException("Revision has no remote!");
	}
	
	public void mergeRemote() {
		localState.merge(remoteState);
	}
	
	/**
	 * Add locally stored model
	 * 
	 * @param localState model to set as local state
	 */
	public void setLocalState(APIModel localState) {
		this.localState = localState;
	}
	
	public APIModelDelta getLocalChanges() {
		return APIModelDelta.create(getLocalState(), getRemoteState());
	}

	public ProjectRevision pushLocalChanges() throws ApiException {
		APIModelDelta localChanges = getLocalChanges();
		return pushChanges(localChanges);
	}
	
	public ProjectRevision pushChanges(APIModelDelta changes) throws ApiException {
		APIModelDelta localChanges = getLocalChanges();
		return pushChanges(localChanges.toTrasferableDelta());
	}
	
	public ProjectRevision pushChanges(List<DataVersion> transferableChanges) throws ApiException {
		CommitApi commitApi = getRemoteProject().getProjectRepository().getCommitApi();
		Commit commit = new Commit();
		commit.setChange(transferableChanges);
		commit.setPreviousCommit(new BranchHead().atId(getRemoteId()));
		Commit newCommit = commitApi.postCommitByProject(getRemoteProject().getRemoteId(), commit, getBranch().getRemoteId());
		ProjectRevision projectRevision = new ProjectRevision(getRemoteProject(), getBranch(), newCommit.getAtId());
		projectRevision.setPreviousRevision(this);
		return projectRevision;
	}
	
	public boolean isRemote() {
		return getRemoteId() != null;
	}
	
	/**
	 * State of the model stored remotely in the project repository
	 * 
	 * @return model in the project repository
	 */
	public APIModel getRemoteState() {
		return remoteState;
	}
	
	/**
	 * State of the model stored locally
	 * 
	 * @return model stored locally in the same format as it was returned by the
	 *         standard API
	 */
	public APIModel getLocalState() {
		return localState;
	}
	
	/**
	 *@return Parent project
	 */
	public RemoteProject getRemoteProject() {
		return project;
	}
	
	
	public RemoteBranch getBranch() {
		return remoteBranch;
	}
	
	/**
	 * @return UUID of the revision or null if it's local only
	 */
	public UUID getRemoteId() {
		return remoteId;
	}
	
	/**
	 * @return previous revision
	 * @throws ApiException 
	 */
	public ProjectRevision getPreviousRevision() throws ApiException {
		if (previousRevision == null) {
			RemoteProject remoteProject = getRemoteProject();
			ProjectRepository projectRepository = remoteProject.getProjectRepository();
			Commit commit = projectRepository.getCommitApi().getCommitByProjectAndId(remoteProject.getRemoteId(), getRemoteId());
			BranchHead previousCommit = commit.getPreviousCommit();
			if (previousCommit != null) {
				setPreviousRevision(new ProjectRevision(getRemoteProject(), getBranch(), previousCommit.getAtId()));
			}
		}
		
		return previousRevision;
	}
	
	public RemoteBranch createBranch(String name) throws ApiException {
		return getRemoteProject().createBranch(this, name);
	}
	
	private void setPreviousRevision(ProjectRevision previousRevision) {
		this.previousRevision = previousRevision;
	}
}
