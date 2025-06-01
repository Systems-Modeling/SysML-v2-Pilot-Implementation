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
package org.omg.sysml.xtext.ui.handlers;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Stream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.omg.sysml.util.repository.EObjectUUIDTracker;
import org.omg.sysml.util.repository.APIModel;
import org.omg.sysml.util.repository.EMFModelDelta;
import org.omg.sysml.util.repository.ProjectRepository;
import org.omg.sysml.util.repository.Revision;
import org.omg.sysml.util.repository.RemoteProject;
import org.omg.sysml.util.repository.RemoteProject.RemoteBranch;
import org.omg.sysml.util.repository.EMFModelRefresher;

import com.google.inject.Inject;

public class PullRepositoryProject extends AbstractHandler {

	private static final Set<String> FILE_EXTENSIONS = Set.of("sysml", "kerml", "sysmlx", "kermlx");
	
	public static final String REPOSITORY_CONFIGURATION_FILE = ".settings/org.omg.sysml.remote.properties";
	private static final String REPOSITORY_PROJECT_ID_PROPERTY = "remote.projectId";
	private static final String REPOSITORY_BRANCH_ID_PROPERTY = "remote.branchId";
	private static final String REPOSITORY_BASE_URL_PROPERTY = "base.url";
	
	@Inject
	private IResourceSetProvider resourceSetProvider;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		 ISelection selection = HandlerUtil.getCurrentSelection(event);
		 
		 if (selection != null && selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				structuredSelection.stream()
						.filter(IProject.class::isInstance)
						.map(IProject.class::cast).findFirst().ifPresent(this::tryPullRemoteFor);;
				
		 }
		
		return null;
	}
	
	private void tryPullRemoteFor(IProject project) {
		WorkspaceJob job = new WorkspaceJob("Pulling from remote") {
			
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				
				tryPullRemoteFor(project, monitor);
				return Status.OK_STATUS;
			}
		};
		
		job.setUser(true);
		job.setRule(project.getWorkspace().getRoot());
		job.schedule();
	}
	
	private void tryPullRemoteFor(IProject project, IProgressMonitor monitor) {
		try {
			IProject[] referencedProjects = project.getDescription().getReferencedProjects();
			Optional<IProject> libraryProject = Stream.of(referencedProjects).filter(rp -> rp.getName().contains("sysml.library")).findFirst();
			
			if (libraryProject.isPresent()) {
				Properties properties = new Properties();
				IFile repositoryPropertiesFile = project.getFile(REPOSITORY_CONFIGURATION_FILE);
				
				properties.load(repositoryPropertiesFile.getContents());
				
				String repositoryUrl = properties.getProperty(REPOSITORY_BASE_URL_PROPERTY);
				String projectId = properties.getProperty(REPOSITORY_PROJECT_ID_PROPERTY);
				String branchId = properties.getProperty(REPOSITORY_BRANCH_ID_PROPERTY);
				String targetPath = project.getFullPath().toString();
				
				Set<IFile> libraryResources = new HashSet<>();
				collectFiles(libraryProject.get(), libraryResources);
				
				ResourceSet resourceSet = resourceSetProvider.get(project);
				loadResources(resourceSet, libraryProject.get(), libraryResources);
				
				EObjectUUIDTracker tracker = new EObjectUUIDTracker();
				tracker.trackLibraryUUIDs(resourceSet.getResources());
				
				ProjectRepository projectRepository = new ProjectRepository(repositoryUrl);
				RemoteProject remoteProject = projectRepository.getProjectById(projectId);
				
				final RemoteBranch defaultBranch;
				if (branchId == null) {
					defaultBranch = remoteProject.getDefaultBranch();
				} else {
					defaultBranch = remoteProject.getBranch(UUID.fromString(branchId));
				}
				Revision headRevision = defaultBranch.getHeadRevision();
				APIModel model = headRevision.fetchRemote();
				EMFModelRefresher repositoryFetcher = new EMFModelRefresher(model, tracker);
				EMFModelDelta delta = repositoryFetcher.create();
				delta.apply(resourceSet, URI.createPlatformResourceURI(targetPath, false));
			}
		} catch (IOException | CoreException e) {
			e.printStackTrace();
		}
	}
	
	private static void loadResources(ResourceSet rs, IProject project, Collection<IFile> files) {		
		
		for (IFile file: files) {
			String projectRelativeString = file.getProjectRelativePath().toString();
			URI platformResourceUri = URI
					.createPlatformResourceURI("/" + project.getName() + "/" + projectRelativeString, true);
			rs.getResource(platformResourceUri, true);
		}
	}
	
	private static void collectFiles(IContainer container, Collection<IFile> files) throws CoreException {
		IResource[] members = container.members();
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof IContainer) {
				collectFiles((IContainer) members[i], files);
			} else if (members[i] instanceof IFile) {
				IFile file = (IFile) members[i];
				if (FILE_EXTENSIONS.contains(file.getFileExtension())) {
					files.add(file);
				}
			}
		}
	}
}
