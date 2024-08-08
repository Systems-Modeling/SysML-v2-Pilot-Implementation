/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
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
 */
package org.omg.kerml.xtext.ui.library;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.resource.ProjectByResourceProvider;
import org.omg.kerml.xtext.library.ILibraryIndexProvider;
import org.omg.kerml.xtext.library.LibraryIndex;

public class DynamicLibraryIndexProvider implements ILibraryIndexProvider {
	
	private static Logger log = Logger.getLogger(DynamicLibraryIndexProvider.class);
	private static DynamicLibraryIndexProvider INSTANCE;
	private final Map<IProject, LibraryIndex> cache = new WeakHashMap<>();
	private boolean disabled = false;
	
	private final ProjectByResourceProvider provider;
	
	public DynamicLibraryIndexProvider(ProjectByResourceProvider provider) {
		this.provider = provider;
	}

	@Override
	public LibraryIndex getIndexFor(Resource resource) {
		
		if (disabled) {
			return LibraryIndex.EMPTY_INDEX;
		}

		IProject project = provider.getProjectContext(resource);

		if (project == null) {
			return null;
		}

		return cache.computeIfAbsent(project, proj -> {
			IFile indexFile = project.getFile(LibraryIndex.FILE_NAME);
			LibraryIndex indexFromJson = LibraryIndex.EMPTY_INDEX;
			
			if (indexFile.exists()) {
				try (var reader = new InputStreamReader(indexFile.getContents())){
					 indexFromJson = LibraryIndex.fromJson(reader);
				} catch (IOException e) {
					//NOOP, return empty index
				} catch (CoreException e) {
					if (log.isDebugEnabled()) {
						log.error(e.getMessage(), e);
					}
				}
			}

			return indexFromJson;
		});
	}
	
	
	//TODO try to use the built-in utility
	private IProject findProjectForResource(IWorkspace workspace, Resource resource) {
		if (resource.getURI().isPlatformResource()) {
			String projectName = URI.decode(resource.getURI().segment(1));
			IProject project = workspace.getRoot().getProject(projectName);
			if (project.exists() && project.isAccessible()) {
				return project;
			} 
		}
		return null;
	}

	@Override
	public void setIndexDisabled(boolean doNotUse) {
		this.disabled = doNotUse;
	}
	
	@Override
	public boolean isIndexDisabled() {
		return disabled;
	}
	
	public static synchronized DynamicLibraryIndexProvider getInstance(ProjectByResourceProvider provider) {
		if (INSTANCE == null) {
			INSTANCE = new DynamicLibraryIndexProvider(provider);
		}
		return INSTANCE;
	}


	@Override
	public void dropIndexOf(Resource resource) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProject project = findProjectForResource(workspace, resource);
		if (project != null) {
			cache.remove(project);
		}
	}
}
