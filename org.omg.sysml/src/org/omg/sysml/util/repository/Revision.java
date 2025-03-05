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

import org.omg.sysml.model.BranchHead;
import org.omg.sysml.model.Commit;
import org.omg.sysml.model.DataVersion;
import org.omg.sysml.util.repository.RemoteProject.RemoteBranch;

/**
 * Revision of a {@link RemoteProject}. Can be used to store changes locally or
 * to commit changes to the project repository
 */
public class Revision {
	
	private final RemoteProject project;
	private UUID remoteId;
	private Revision previousRevision;
	
	private APIModel remoteState;
	private APIModel localState;
	private RemoteBranch remoteBranch;
	
	public Revision(RemoteProject project, RemoteBranch remoteBranch) {
		this.project = project;
		this.remoteBranch = remoteBranch;
	}
	
	public Revision(RemoteProject project, RemoteBranch remoteBranch, UUID remoteId) {
		this(project, remoteBranch);
		this.remoteId = remoteId;
	}
	
	/**
	 * Creates a new empty revision and sets this revision as the parent
	 * 
	 * @return empty revision
	 */
	public Revision createNewRevision() {
		Revision newRevision = new Revision(project, remoteBranch);
		newRevision.setPreviousRevision(this);
		return newRevision;
	}
	
	/**
	 * Downloads the remote state from the project repository.
	 * Use {@link Revision#isRemote()} to check if remote exists. 
	 * 
	 * @return remote state
	 * 
	 * @throws UnsupportedOperationException if the revision is local only
	 */
	public APIModel fetchRemote() {
		if (isRemote()) {
			UUID remoteProjectId = getRemoteProject().getRemoteId();
			UUID revisionId = getRemoteId();
			var remoteModelRoots = getRemoteProject().getProjectRepository().getModelRoots(remoteProjectId, revisionId);
			var remoteElements = getRemoteProject().getProjectRepository().getModelElements(remoteProjectId, revisionId);
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
	
	/**
	 * Delta between the remote state and the local state
	 * 
	 * @return delta
	 */
	public APIModelDelta getLocalChanges() {
		return APIModelDelta.create(getLocalState(), getRemoteState());
	}

	/**
	 * Calculates local changes and uploads the delta to the API server
	 * 
	 * @return new revision created on the API server
	 */
	public Revision pushLocalChanges() {
		APIModelDelta localChanges = getLocalChanges();
		return pushChanges(localChanges);
	}
	
	/**
	 * Uploads the given changes to the API server
	 * 
	 * @param changes delta to be uploaded
	 * @return new revision created on the API server
	 */
	public Revision pushChanges(APIModelDelta changes) {
		if (changes.isEmpty()) {
			return this;
		}
		APIModelDelta localChanges = getLocalChanges();
		return pushChanges(localChanges.toTrasferableDelta());
	}
	
	/**
	 * Uploads the given list of changes to the API server
	 * 
	 * @param changes list of changes to be uploaded
	 * @return new revision created on the API server
	 */
	public Revision pushChanges(List<DataVersion> transferableChanges) {
		if (transferableChanges.isEmpty()) {
			return this;
		}
		
		UUID remoteProjectId = getRemoteProject().getRemoteId();
		RemoteBranch branch = getBranch();
		UUID currentRevisionId = getRemoteId();
		
		final Commit newCommit;
		
		if (branch.isDefault()) {
			newCommit = getRemoteProject()
					.getProjectRepository()
					.commitChanges(remoteProjectId, null, currentRevisionId, transferableChanges);
		} else {
			newCommit = getRemoteProject()
					.getProjectRepository()
					.commitChanges(remoteProjectId, branch.getRemoteId(), currentRevisionId, transferableChanges);
		}
		
		Revision projectRevision = new Revision(getRemoteProject(), getBranch(), newCommit.getAtId());
		
		projectRevision.setPreviousRevision(this);
		
		return projectRevision;
	}
	
	/**
	 * Check if the revision has a remote state.
	 * 
	 * @return true if revision exists as a commit in the API server
	 */
	public boolean isRemote() {
		return getRemoteId() != null;
	}
	
	/**
	 * Remotely stored state of the model
	 * 
	 * @return model in the project repository
	 */
	public APIModel getRemoteState() {
		return remoteState;
	}
	
	/**
	 * Locally stored state of the model
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
	 * Previous revision
	 * 
	 * @return previous revision or null if there is none
	 */
	public Revision getPreviousRevision() {
		if (previousRevision == null) {
			RemoteProject remoteProject = getRemoteProject();
			ProjectRepository projectRepository = remoteProject.getProjectRepository();
			Commit commit = projectRepository.getCommit(remoteProject.getRemoteId(), getRemoteId());
			BranchHead previousCommit = commit.getPreviousCommit();
			if (previousCommit != null) {
				setPreviousRevision(new Revision(getRemoteProject(), getBranch(), previousCommit.getAtId()));
			}
		}
		
		return previousRevision;
	}
	
	private void setPreviousRevision(Revision previousRevision) {
		this.previousRevision = previousRevision;
	}
	
	/**
	 * Creates a new branch using the API Server of this branch
	 * 
	 * @param name name of the new branch
	 * @return newly created branch
	 */
	public RemoteBranch createBranch(String name) {
		return getRemoteProject().createBranch(this, name);
	}
}
