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
package org.omg.kerml.xtext.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class LibraryIndexCache {
	
	private static final LibraryIndexCache INSTANCE = new LibraryIndexCache();
	private LibraryIndex index = null;
	
	private volatile boolean doNotUse = false;
	
	public LibraryIndex getIndexFor(Resource resource) {
		
		if (doNotUse) {
			//return empty index
			return new LibraryIndex();
		}
		
		if (index != null) {
			return index;
		}
		
		URI resourceURI = resource.getURI();
		File indexFile = findIndexFile(resourceURI);
		
		if (indexFile == null || !indexFile.exists()) return null;
		
		try (FileReader fileReader = new FileReader(indexFile)){
			
			index = LibraryIndex.fromJson(fileReader);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return index;
	}
	
	public synchronized void setDoNotUse(boolean doNotUse) {
		this.doNotUse = doNotUse;
	}
	
	public boolean isDoNotUse() {
		return doNotUse;
	}
	
	private File findIndexFile(URI uri) {
		var segments = Arrays.asList(uri.segments());
		if (segments.contains("sysml.library")) {
			String pathString = uri.path();
			String indexPath = pathString.split("sysml.library")[0] + "sysml.library/.index.json";
			return new File(indexPath);
			
		}
		return null;
	}
	
	public static synchronized LibraryIndexCache getInstance() {
		return INSTANCE;
	}
}
