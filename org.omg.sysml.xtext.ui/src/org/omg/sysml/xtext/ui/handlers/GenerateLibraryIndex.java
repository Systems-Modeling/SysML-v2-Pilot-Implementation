/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2024 Model Driven Solutions, Inc.
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
 *   Zoltan Ujhelyi, MDS
 */
package org.omg.sysml.xtext.ui.handlers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.LiveScopeResourceSetInitializer;
import org.omg.kerml.xtext.library.ILibraryIndexProvider;
import org.omg.kerml.xtext.library.LibraryIndex;
import org.omg.sysml.util.ElementUtil;

import com.google.gson.GsonBuilder;
import com.google.inject.Inject;

/**
 * Utility for {@link LibraryIndex library index} generation. Library indexes
 * are stored in .json format in the project root. The default name of the index file is {@value LibraryIndex#FILE_NAME}.
 * While running this handler performs a full clean build on the selected project blocking user input in the process.
 */
public class GenerateLibraryIndex extends AbstractHandler {
	
	private static final Set<String> FILE_EXTENSIONS = Set.of("kerml", "sysml");
	
	@Inject
	private IResourceSetProvider resourceSetProvider;
	
	@Inject
	private LiveScopeResourceSetInitializer initializer;
	
	@Inject
	private ILibraryIndexProvider libraryIndexProvider;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		 ISelection selection = HandlerUtil.getCurrentSelection(event);
		 
		if (selection != null && selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			structuredSelection.stream()
					.filter(IProject.class::isInstance)
					.map(IProject.class::cast).findFirst()
					.ifPresent(this::createIndexFor);
		}
		
		
		return null;
	}

	private void createIndexFor(IProject project) {
		
		IWorkspace workspace = project.getWorkspace();
		ISchedulingRule buildRule = workspace.getRuleFactory().buildRule();
		
		WorkspaceJob generateIndexWsJob = new WorkspaceJob("Generate Index") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
				
				libraryIndexProvider.setIndexDisabled(true);
				
				ResourceSet rs = resourceSetProvider.get(project);
				initializer.initialize(rs);
				
				Set<IFile> files = new HashSet<>();
				collectFiles(project, files);
				loadResources(rs, project, files);
				
				if (!rs.getResources().isEmpty()) {
					libraryIndexProvider.dropIndexOf(rs.getResources().get(0));
				}
				
				project.build(IncrementalProjectBuilder.CLEAN_BUILD, subMonitor.split(5));
				project.build(IncrementalProjectBuilder.FULL_BUILD, subMonitor.split(45));
				
				ElementUtil.transformAll(rs, false);
				
				SubMonitor indexMonitor = SubMonitor.convert(SubMonitor.convert(subMonitor.split(40), rs.getResources().size()));
				
				LibraryIndex index = new LibraryIndex();
				index.updateIndex(rs.getResources(), res -> {
					indexMonitor.split(1).setTaskName("Generating index for " + res.getURI().toFileString());
				});
				
				String jsonString = index.toJson(new GsonBuilder()
						.disableHtmlEscaping()
						.setPrettyPrinting()
				);
				
				writeIndex(project, jsonString, subMonitor.split(10));
				
				libraryIndexProvider.setIndexDisabled(false);
				
				return Status.OK_STATUS;
			}
		};
		
		generateIndexWsJob.setUser(true);
		generateIndexWsJob.setRule(buildRule);
		generateIndexWsJob.schedule();
	}
	
	private void writeIndex(IProject project, String json, IProgressMonitor monitor) throws CoreException {
		IFile file = project.getFile(LibraryIndex.FILE_NAME);
		
		try (var inputStream = new ByteArrayInputStream(json.getBytes())){
			if (file.exists()) {
				file.setContents(inputStream, IFile.FORCE, monitor);
			} else {
				file.create(inputStream, true, monitor);
			}
		} catch (IOException e) {
			throw new CoreException(Status.error(e.getMessage()));
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
