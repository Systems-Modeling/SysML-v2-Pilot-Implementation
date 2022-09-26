/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019-2022 Model Driven Solutions, Inc.
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
 *  Zoltan Ujhelyi
 * 
 *****************************************************************************/

package org.omg.sysml.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.omg.sysml.lang.sysml.SysMLPackage;

import com.google.common.base.Predicates;


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

	private final ResourceSet resourceSet;
	private final Set<Resource> inputResources = new HashSet<Resource>();
	private final List<String> extensions = new ArrayList<String>();
	private final ResourceDescriptionsData index;
	
	private boolean isVerbose = true;
	
	protected SysMLUtil() {
		this(new ResourceDescriptionsData(new ArrayList<>()));
	}
	
	protected SysMLUtil(ResourceDescriptionsData resourceDescriptionData) {
		SysMLPackage.eINSTANCE.getName();
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getLoadOptions().put(XtextResource.OPTION_ENCODING, "UTF-8");
		this.index = resourceDescriptionData;
		ResourceDescriptionsData.ResourceSetAdapter.installResourceDescriptionsData(this.resourceSet, this.index);
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
	 * Print the given line only if verbose mode is on.
	 * 
	 * @param 	line			the line to be printed
	 */
	protected void println(String line) {
		if (isVerbose) {
			System.out.println(line);
		}
	}

	/**
	 * Get the managed resource set.
	 * 
	 * @return the resource set
	 */
    public ResourceSet getResourceSet() {
        return resourceSet;
    }
    
	/**
	 * Add a resource to the Xtext index.
	 * 
	 * @param 	resource		the resource to be added
	 */
	public void addResourceToIndex(Resource resource) {
		URI uri = resource.getURI();
		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(uri);
		Manager manager = resourceServiceProvider.getResourceDescriptionManager();
		this.index.addDescription(uri, manager.getResourceDescription(resource));
	}
	
	/**
	 * Return whether verbose mode is on or off.
	 * 
	 * @return	whether verbose mode is on or off
	 */
	public boolean isVerbose() {
		return this.isVerbose;
	}
	
	/**
	 * Set verbose mode on or off.
	 * 
	 * @param	isverbose	whether verbose mode is on or off
	 */
	public void setVerbose(boolean isVerbose) {
		this.isVerbose = isVerbose;
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
	 * Return all the input resources.
	 * 
	 * @return the input resources.
	 */
	public Set<Resource> getInputResources() {
		return this.inputResources;
	}
	
	/**
	 * Return all the library resources, that is, resources that are not input resources.
	 * 
	 * @return the library resources
	 */
	public Set<Resource> getLibraryResources() {
		return this.getResourceSet().getResources().stream().
				filter(Predicates.not(this::isInputResource)).
				collect(Collectors.toSet());
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
	    URI uri = URI.createFileURI(path);
		final Resource resource = this.resourceSet.getResource(uri, true);
		if (resource == null) {
			throw new RuntimeException("Error opening resource: " + path);
		} else {
			this.addResourceToIndex(resource);
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
		println("Reading " + path + "...");
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
	 * If the given path identifies a file with an allowable extension, then read it. 
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
	
	/**
	 * Transform elements in all resources. If isAddImplicitElements is true, then also generate
	 * implicit elements in input resources.
	 * 
	 * @param	isAddImplicitElements	whether to add implicit elements to input resources
	 */
	public void transformAll(boolean isAddImplicitElements) {
		for (Resource resource: this.resourceSet.getResources()) {
			ElementUtil.transformAll(resource, 
					isAddImplicitElements && this.isInputResource(resource));
		}
	}
	
	/**
	 * Resolve proxies in all input resources.
	 */
	public void resolveAllInputResources() {
		for (Resource resource: this.inputResources) {
			EcoreUtil.resolveAll(resource);
		}
	}
	
}
