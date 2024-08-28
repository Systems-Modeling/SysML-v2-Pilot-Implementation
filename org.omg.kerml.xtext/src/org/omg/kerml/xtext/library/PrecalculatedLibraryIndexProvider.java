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
 */
package org.omg.kerml.xtext.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Default behavior for finding library indexes. The logic assumes that only the
 * standard library exists (sysml.library) and the library resources are located
 * under a folder (or sub-folders of) sysml.library.
 */
public class PrecalculatedLibraryIndexProvider implements ILibraryIndexProvider {
	
	private static Logger log = Logger.getLogger(PrecalculatedLibraryIndexProvider.class);
	private static final String LIBRARY_FOLDER = "sysml.library";

	//Using a singleton to prevent multiple library indexes in a multi-injector environment
	//Accessing this singleton should be still done through dependency injection and not directly
	private static PrecalculatedLibraryIndexProvider INSTANCE = null;
	
	private LibraryIndex index = null;
	private boolean disabled = false;
	
	/**
	 * Returns the library index for a resource. If the resource is a library
	 * resource (located in the sysml.library or any of its sub-folders) the index
	 * is read from the root folder on the first call and then it is cached. If the index is missing an
	 * {@link LibraryIndex#EMPTY_INDEX empty index} is returned, empty indexes are also cached. If
	 * {@link PrecalculatedLibraryIndexProvider#disabled disabled} is true an
	 * empty index is returned (does not effect the cache) otherwise the cached
	 * index is returned.
	 */
	@Override
	public LibraryIndex getIndexFor(Resource resource) {
		
		if (disabled) {
			//return empty index
			return LibraryIndex.EMPTY_INDEX;
		}
		
		URI resourceURI = resource.getURI();
		
		if (resourceURI.segmentsList().contains(LIBRARY_FOLDER)) {
			
			if (index != null) {
				return index;
			}
			
			File indexFile = getIndexFile(resourceURI);
			
			if (indexFile == null || !indexFile.exists()) return LibraryIndex.EMPTY_INDEX;
			
			try (FileReader fileReader = new FileReader(indexFile)){
				
				index = LibraryIndex.fromJson(fileReader);
				
			} catch (FileNotFoundException e) {
				//NOOP, return empty index
			} catch (IOException e) {
				if (log.isDebugEnabled()) {
					log.debug(e.getMessage(), e);
				}
			}
		}
		
		return index == null ? LibraryIndex.EMPTY_INDEX : index;
	}
	
	public void setIndexDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	
	public boolean isIndexDisabled() {
		return disabled;
	}
	
	private File getIndexFile(URI uri) {
		var segments = Arrays.asList(uri.segments());
		if (segments.contains(LIBRARY_FOLDER)) {
			String pathString = uri.path();
			String indexPath = pathString.split(LIBRARY_FOLDER)[0] + LIBRARY_FOLDER + File.separator + LibraryIndex.FILE_NAME;
			return new File(indexPath);
		}
		return null;
	}
	
	public static synchronized PrecalculatedLibraryIndexProvider getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PrecalculatedLibraryIndexProvider();
		}
		return INSTANCE;
	}

	@Override
	public void dropIndexOf(Resource resource) {
		index = null;
	}
}
