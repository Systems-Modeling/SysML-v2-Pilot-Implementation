/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2020  California Institute of Technology ("Caltech")
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.kerml.xtext.ui.library;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.resource.ProjectByResourceProvider;
import org.omg.kerml.xtext.library.ILibraryIndexProvider;
import org.omg.kerml.xtext.library.LibraryIndex;
import org.omg.kerml.xtext.library.PrecalculatedLibraryIndexProvider;

/**
 * Eclipse specific implementation of {@link ILibraryIndexProvider}. The logic
 * searches for library indexes in the {@link Resource Resource's} enclosing project root.
 */
public class DynamicLibraryIndexProvider implements ILibraryIndexProvider {
	
	private static Logger log = Logger.getLogger(DynamicLibraryIndexProvider.class);
	
	//Using a singleton to prevent multiple library indexes in a multi-injector environment
	//Accessing this singleton should be still done through dependency injection and not directly
	private static DynamicLibraryIndexProvider INSTANCE;
	
	private final Map<IProject, LibraryIndex> cache = new WeakHashMap<>();
	private boolean disabled = false;
	
	private final ProjectByResourceProvider provider;
	
	public DynamicLibraryIndexProvider(ProjectByResourceProvider provider) {
		this.provider = provider;
	}
	
	/**
	 * Returns the library index for a resource. The library index file is expected
	 * to be located in the Resource's enclosing project, from where it is read on
	 * the first call and then it is cached. If the index is missing an
	 * {@link LibraryIndex#EMPTY_INDEX empty index} is returned, empty indexes are
	 * also cached. If {@link PrecalculatedLibraryIndexProvider#disabled disabled}
	 * is true an empty index is returned (does not effect the cache) otherwise the
	 * cached index is returned.
	 */
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
				try (var reader = new InputStreamReader(indexFile.getContents(), StandardCharsets.UTF_8)) {
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

	/**
	 * Calculates the enclosing project for the given Resource and removes its index from the cache
	 */
	@Override
	public void dropIndexOf(Resource resource) {
		IProject project = provider.getProjectContext(resource);
		if (project != null) {
			cache.remove(project);
		}
	}
}
