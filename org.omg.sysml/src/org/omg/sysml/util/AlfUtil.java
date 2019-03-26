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
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.lang.sysml.SysMLPackage;

public abstract class AlfUtil {
	
	protected final ResourceSet resourceSet = new ResourceSetImpl();
	protected final Set<Resource> inputResources = new HashSet<Resource>();
	
	protected AlfUtil() {
		@SuppressWarnings("unused")
		SysMLPackage sysml = SysMLPackage.eINSTANCE;
		AlfStandaloneSetup.doSetup();
	}
	
	public boolean isInputResource(Resource resource) {
		return inputResources.contains(resource);
	}
	
	public Resource createResource(final String path) {
		final Resource resource = this.resourceSet.createResource(URI.createFileURI(path));
		if (resource == null) {
			throw new RuntimeException("Error creating resource: " + path);
		} else {
			return resource;
		}
	}
	
	public Resource getResource(final String path) {
	    final Resource resource = this.resourceSet.getResource(URI.createFileURI(path), true);
		if (resource == null) {
			throw new RuntimeException("Error opening resource: " + path);
		} else {
			return resource;
		}
	}
	
	public Resource readResource(final String path) {
		System.out.println("Reading " + path + "...");
		return this.getResource(path);
	}
	
	public void readAll(final File file, boolean isInput) {
		if (!file.isDirectory()) {
			final String path = file.getPath();
			if (path.endsWith(".alf")) {
				Resource resource = this.readResource(file.getPath());
				if (isInput) {
					this.inputResources.add(resource);
				}
			}
		} else {
			Stream.of(file.listFiles()).forEach(f->this.readAll(f, isInput));
		}
		EcoreUtil.resolveAll(this.resourceSet);
	}
	
	public void readAll(final String path, boolean isInput) {
		this.readAll(new File(path), isInput);
	}
	
	public void read(final String... paths) {
		if (paths.length > 0) {
			this.readAll(paths[0], true);
			for (int i = 1; i < paths.length; i++) {
				this.readAll(paths[i], false);
			}
		}
	}
	
}
