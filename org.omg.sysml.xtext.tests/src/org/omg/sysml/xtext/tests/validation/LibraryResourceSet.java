/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Model Driven Solutions, Inc.
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
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 * Contributors:
 *  Vince Molnár
 *
*******************************************************************************/

package org.omg.sysml.xtext.tests.validation;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.omg.sysml.io.SysMLUtil;
import org.omg.sysml.util.SysMLLibraryUtil;
import org.omg.sysml.xtext.tests.SysMLTestSetup;
import org.omg.sysml.xtext.tests.TestModels;

/**
 * A resource set holding the standard library, loaded and indexed once per JVM, into which
 * individual test models are loaded, validated and unloaded again. This mirrors what
 * {@code SysMLInteractive} does for the interactive shell and the interactive tests.
 */
public final class LibraryResourceSet extends SysMLUtil {

	public static final String KERNEL_LIBRARIES_DIRECTORY = "Kernel Libraries";
	public static final String SYSTEMS_LIBRARY_DIRECTORY = "Systems Library";
	public static final String DOMAIN_LIBRARIES_DIRECTORY = "Domain Libraries";

	private static LibraryResourceSet instance;

	/** Returns the shared instance, loading the library on first call. */
	public static synchronized LibraryResourceSet getInstance() {
		if (instance == null) {
			SysMLTestSetup.getInjector();
			LibraryResourceSet set = new LibraryResourceSet();
			set.loadLibrary(getLibraryPath());
			instance = set;
		}
		return instance;
	}

	/** Default library location relative to the bundle directory, used when running from an IDE. */
	public static final String DEFAULT_LIBRARY_PATH = "../sysml.library";

	/**
	 * The library directory from {@link TestModels#LIBRARY_PATH_PROPERTY}, or, if that is not
	 * set, {@link #DEFAULT_LIBRARY_PATH} relative to the working directory.
	 */
	public static Path getLibraryPath() {
		String value = System.getProperty(TestModels.LIBRARY_PATH_PROPERTY);
		if (value == null || value.isBlank()) {
			value = DEFAULT_LIBRARY_PATH;
		}
		Path path = Paths.get(value).toAbsolutePath().normalize();
		if (!Files.isDirectory(path)) {
			throw new IllegalStateException("Library directory not found: " + path);
		}
		return path;
	}

	private LibraryResourceSet() {
		super();
		setVerbose(false);
		getResourceSet().getLoadOptions().put(XtextResource.OPTION_ENCODING, "UTF-8");
	}

	private void loadLibrary(Path libraryPath) {
		String path = libraryPath.toString().replace('\\', '/') + "/";
		SysMLLibraryUtil.setModelLibraryDirectory(path);
		readAll(path + KERNEL_LIBRARIES_DIRECTORY, false, TestModels.KERML_EXTENSION);
		readAll(path + SYSTEMS_LIBRARY_DIRECTORY, false, TestModels.SYSML_EXTENSION);
		readAll(path + DOMAIN_LIBRARIES_DIRECTORY, false, TestModels.SYSML_EXTENSION);
		checkLibraryLoaded(libraryPath);
	}

	/**
	 * Fails fast, with an explicit message, if the library directory yielded no or empty
	 * resources. (The Maven build is known to truncate the library sources on some machines;
	 * validating against an empty library produces misleading failures in every test.)
	 */
	private void checkLibraryLoaded(Path libraryPath) {
		List<Resource> resources = getResourceSet().getResources();
		if (resources.isEmpty()) {
			throw new IllegalStateException("No library files found under " + libraryPath);
		}
		List<String> empty = resources.stream()
				.filter(r -> r.getContents().isEmpty())
				.map(r -> r.getURI().lastSegment())
				.toList();
		if (!empty.isEmpty()) {
			throw new IllegalStateException(empty.size() + " of " + resources.size()
					+ " library files under " + libraryPath + " are empty, e.g. " + empty.get(0)
					+ ". Restore the library (git checkout -- sysml.library) before running the validation tests.");
		}
	}

	/**
	 * Loads the given model file next to the library, parses, links and validates it with
	 * {@link CheckMode#ALL}, and unloads it again. The returned issues include syntax and
	 * linking errors as well as the issues raised by the language validators.
	 */
	public synchronized List<Issue> validate(Path file) {
		URI uri = URI.createFileURI(file.toAbsolutePath().normalize().toString());
		Resource resource = getResourceSet().createResource(uri);
		if (resource == null) {
			throw new IllegalArgumentException("No resource factory registered for " + uri);
		}
		try {
			resource.load(getResourceSet().getLoadOptions());
			IResourceServiceProvider serviceProvider =
					IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(uri);
			IResourceValidator validator = serviceProvider.get(IResourceValidator.class);
			return validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		} finally {
			// Make sure the test model leaves no trace for the next one.
			ResourceDescriptionsData index =
					ResourceDescriptionsData.ResourceSetAdapter.findResourceDescriptionsData(getResourceSet());
			if (index != null && index.getResourceDescription(uri) != null) {
				index.removeDescription(uri);
			}
			resource.unload();
			getResourceSet().getResources().remove(resource);
		}
	}

}
