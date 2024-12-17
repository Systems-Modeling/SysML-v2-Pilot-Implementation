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
 */
package org.omg.sysml.semantics.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Specialization;
import org.omg.sysml.lang.sysml.Type;

/**
 * Base class for SysML semantic tests
 */
public abstract class SysMLSemanticTest {
	/**
	 * System property for the library path. Required for Maven build.
	 */
	private final static String SYSML_LIBRARY_PATH_KEY = "libraryPath";

	/**
	 * Library path relative to this eclipse project. Direct JUnit runs.
	 */
	private static final String PROJECT_RELATIVE_LIBRARY_PARHT = "../sysml.library";

	public static String getLibraryPath() {
		var sysprop = System.getProperty(SYSML_LIBRARY_PATH_KEY);
		return sysprop == null ? getAbsoluteLibraryPath() : sysprop;
	}

	private static String getAbsoluteLibraryPath() {
		// convert relative path to absolute path
		return new File(PROJECT_RELATIVE_LIBRARY_PARHT).getAbsolutePath();
	}

	// test setup

	private static SysMLInteractive interactive;
	private Resource resource;

	@BeforeClass
	public static void setupLibrary() {
		// setup infrastructure and read library
		if (interactive == null) {
			interactive = SysMLInteractive.getInstance();
			interactive.loadLibrary(getLibraryPath());
		}
	}

	@Before
	public void createResource() {
		// create empty Resource for each test case
		resource = interactive.createResource("test.sysml");
	}

	@After
	public void removeResource() throws IOException {
		// remove Resource after test case
		try {
			resource.delete(Collections.EMPTY_MAP);
		} finally {
			resource = null;
		}
	}

	protected final Resource getResource() {
		return resource;
	}

	// utility methods

	public static boolean specializes(Type element, String general) {
		assert element != null;
		assert general != null;

		return element.getOwnedSpecialization().stream().map(Specialization::getGeneral).map(Type::getQualifiedName)
				.anyMatch(general::equals);
	}
	
	public static boolean specializes(Type element, Type general) {
		assert element != null;
		assert general != null;

		return element.getOwnedSpecialization().stream().map(Specialization::getGeneral)
				.anyMatch(general::equals);
	}
	
	public static boolean redefines(Feature element, String redefined) {
		assert element != null;
		assert redefined != null;

		return element.getOwnedRedefinition().stream().map(Redefinition::getRedefinedFeature).map(Feature::getQualifiedName)
				.anyMatch(redefined::equals);
	}
	
	public static boolean redefines(Feature element, Feature redefined) {
		assert element != null;
		assert redefined != null;

		return element.getOwnedRedefinition().stream().map(Redefinition::getRedefinedFeature)
				.anyMatch(redefined::equals);
	}

	public static String getSpecifics(Type element) {

		assert element != null;

		return element.getOwnedSpecialization().stream().map(Specialization::getGeneral).map(Type::getQualifiedName)
				.collect(Collectors.joining(", "));
	}
}
