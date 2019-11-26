/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Ed Seidewitz
 * 
 *****************************************************************************/

package org.omg.sysml.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * This is a utility base class for reading SysML v2 files into an EMF resource set.
 * Files can be read either as "input resources" or "library resources", if that distinction
 * is important for subsequent processing. Files can be read individually, or all files
 * (as limited to a certain set of extensions) can be read by traversing a directory
 * hierarchy recursively from a given root directory.
 * 
 * @author Ed Seidewitz
 *
 */
public abstract class SysMLUtil {
	
	protected final ResourceSet resourceSet;
	protected final Set<Resource> inputResources = new HashSet<Resource>();
	protected final List<String> extensions = new ArrayList<String>();
	
	protected SysMLUtil(ResourceSet resourceSet) {
		@SuppressWarnings("unused")
		SysMLPackage sysml = SysMLPackage.eINSTANCE;
		this.resourceSet = resourceSet;
	}
	
	protected SysMLUtil() {
		this(new ResourceSetImpl());
	}
	
	/**
	 * Add an extension to the list of allowed file extensions. The extension string must start with a dot.
	 * 
	 * @param 	extension		the extension to be added (including the initial dot)
	 */
	protected void addExtension(String extension) {
		this.extensions.add(extension);
	}
	
	/**
	 * Check whether the given resource is considered an input resource or a library resource.
	 * 
	 * @param 	resource		the resource to check.
	 * @return	true if the resource is an input resource and false otherwise (including if
	 * 			the given resource has not been read
	 */
	public boolean isInputResource(Resource resource) {
		return inputResources.contains(resource);
	}
	
	/**
	 * If the given resource is in the resource set, then add it to the set of input resources.
	 * 
	 * @param 	resource		the resource to be considered an input resource
	 */
	public void addInputResource(Resource resource) {
		if (resource.getResourceSet() == this.resourceSet) {
			this.inputResources.add(resource);
		}
	}
	
	/**
	 * Create a resource using the given path and add it to the resource set. Throws a runtime
	 * exception if the resource cannot be created.
	 * 
	 * @param 	path			the path to be used for the new resource.
	 * @return	the newly created resource
	 */
	public Resource createResource(final String path) {
		final Resource resource = this.resourceSet.createResource(URI.createFileURI(path));
		if (resource == null) {
			throw new RuntimeException("Error creating resource: " + path);
		} else {
			return resource;
		}
	}
	
	/**
	 * Get an existing resource in the resource set with the given path or, if there is no
	 * such resource in the resource set, attempt to load it. Throws a runtime exception if
	 * the resource cannot be opened.
	 * 
	 * @param 	path			the path of the resource
	 * @return	the opened resource
	 */
	public Resource getResource(final String path) {
	    final Resource resource = this.resourceSet.getResource(URI.createFileURI(path), true);
		if (resource == null) {
			throw new RuntimeException("Error opening resource: " + path);
		} else {
			return resource;
		}
	}
	
	/**
	 * Read the existing resource at the given path while logging this to the console.
	 * 
	 * @param 	path			the path of the resource
	 * @return	the opened resource
	 */
	public Resource readResource(final String path) {
		System.out.println("Reading " + path + "...");
		return this.getResource(path);
	}
	
	/**
	 * If the given file has an allowable extension, then read it. Or, if the file is a directory, then
	 * recursively read all the allowable files in it, directly or indirectly.
	 * 
	 * @param 	file			the file from which the resources are be read
	 * @param 	isInput			whether the resources read are to be considered input resources
	 */
	public void readAll(final File file, boolean isInput) {
		if (file.isDirectory()) {
			for (File nestedFile: file.listFiles()) {
				this.readAll(nestedFile,  isInput);
			}
		} else {
			final String path = file.getPath();
			if (extensions.stream().anyMatch(path::endsWith)) {
				Resource resource = this.readResource(file.getPath());
				if (isInput) {
					this.addInputResource(resource);
				}
			}
		}
	}
	
	/**
	 * If the given path identifies an file with an allowable extension, then read it. 
	 * If the given path is for a directory, then recursively read all the allowable files in it, 
	 * directly or indirectly.
	 * 
	 * @param 	path			the path from which resources are to be read
	 * @param 	isInput			whether the resources read are to be considered input resources
	 */
	public void readAll(final String path, boolean isInput) {
		this.readAll(new File(path), isInput);
	}
	
	/**
	 * If the given path identifies an file with the given extension, then read it. 
	 * If the given path is for a directory, then recursively read all the allowable files in it, 
	 * directly or indirectly.
	 * 
	 * @param 	path			the path from which resources are to be read
	 * @param 	isInput			whether the resources read are to be considered input resources
	 * @param 	extension		the allowed file extension
	 */
	public void readAll(final String path, boolean isInput, String extension) {
		this.extensions.clear();
		this.addExtension(extension);
		this.readAll(new File(path), isInput);
	}
	
	/**
	 * Read files recursively from the directories given by each of the paths. All the resources read
	 * from the first path are considered to be input resources. All the resources read from the
	 * other paths are considered to be library resources.
	 * 
	 * @param 	paths			the paths from which resources are to be read
	 */
	public void read(final String... paths) {
		if (paths.length > 0) {
			for (int i = 1; i < paths.length; i++) {
				this.readAll(paths[i], false);
			}
			this.readAll(paths[0], true);
		}
	}
	
}
