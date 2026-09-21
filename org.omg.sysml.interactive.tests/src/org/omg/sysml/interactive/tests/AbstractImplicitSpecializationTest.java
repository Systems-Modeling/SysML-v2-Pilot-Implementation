/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2026 Obeo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License, version 2, as published by
 * the Eclipse Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program. If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 */
package org.omg.sysml.interactive.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.junit.After;
import org.junit.BeforeClass;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Type;

/**
 * Abstract test class for impicit specialization tests.
 */
public class AbstractImplicitSpecializationTest {


	private static ResourceSet resourceSet;
	private final List<Resource> models = new ArrayList<>();

	/** Loads and resolves libraries once. */
	@BeforeClass
	public static void loadLibraries() {
		SysMLInteractive interactive = SysMLInteractive.createInstance();
		interactive.setVerbose(false);
		interactive.getLibraryIndexCache().setIndexDisabled(true);
		interactive.loadLibrary(Path.of(System.getProperty("libraryPath")).toAbsolutePath().toString());
		resourceSet = interactive.getResourceSet();
		for (int i = 0; i < resourceSet.getResources().size(); i++) {
			EcoreUtil2.resolveLazyCrossReferences(resourceSet.getResources().get(i), null);
		}
	}

	/** Removes each scenario without altering the shared library contents. */
	@After
	public void removeModels() {
		for (Resource resource : models) {
			resource.unload();
			resourceSet.getResources().remove(resource);
		}
	}

	/** Creates an empty in-memory resource in the library resource set, removed after the test. */
	protected Resource createResource(String name) {
		Resource resource = resourceSet.createResource(URI.createURI("memory:/" + name));
		models.add(resource);
		return resource;
	}

	protected Resource parse(String name, String text) throws Exception {
		Resource resource = createResource(name);
		resource.load(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)), Map.of());
		assertTrue(resource.getErrors().toString(), resource.getErrors().isEmpty());
		return resource;
	}

	protected static <T extends Type> T findByName(Resource resource, String name, Class<T> kind) {
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			var object = contents.next();
			if (kind.isInstance(object) && name.equals(kind.cast(object).getDeclaredName())) {
				return kind.cast(object);
			}
		}
		throw new AssertionError("Missing " + name);
	}

	protected static void assertContainsGeneral(List<Type> candidates, Type expected) {
		assertTrue("Expected " + expected + " in " + candidates, candidates.contains(expected));
	}

	protected static void assertOwnedSpecializationContainsGeneral(Type type, Type expected) {
		assertTrue("Expected a materialized specialization to " + expected,
				type.getOwnedSpecialization().stream().anyMatch(s -> s.getGeneral() == expected));
	}
	
	
	/** Finds the single instance of {@code kind} in the resource; fails if there is none or more than one. */
	protected <T> T findSingle(Resource resource, Class<T> kind) {
		T found = null;
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			Object object = contents.next();
			if (kind.isInstance(object)) {
				if (found != null) {
					throw new AssertionError("Expected exactly one " + kind.getSimpleName() + ", found a second");
				}
				found = kind.cast(object);
			}
		}
		if (found == null) {
			throw new AssertionError("Missing " + kind.getSimpleName());
		}
		return found;
	}

	protected static void assertContains(List<Type> candidates, String qualifiedName) {
		List<String> names = candidates.stream().map(Type::getQualifiedName).toList();
		assertTrue("Expected " + qualifiedName + " in " + names, names.contains(qualifiedName));
	}

	protected static void assertOwnedSpecializationContains(Type type, String qualifiedName) {
		List<String> names = type.getOwnedSpecialization().stream()
				.map(specialization -> specialization.getGeneral().getQualifiedName()).toList();
		assertTrue("Expected " + qualifiedName + " among materialized specializations " + names,
				names.contains(qualifiedName));
	}
	
	protected void assertNotContains(List<Type> candidates, String qualifiedName) {
		List<String> names = candidates.stream().map(Type::getQualifiedName).toList();
		assertFalse("Did not expect " + qualifiedName + " in " + names, names.contains(qualifiedName));
	}


	protected void assertOwnedSpecializationDoesNotContain(Type type, String qualifiedName) {
		List<String> names = type.getOwnedSpecialization().stream()
				.map(specialization -> specialization.getGeneral().getQualifiedName()).toList();
		assertFalse("Did not expect " + qualifiedName + " among materialized specializations " + names,
				names.contains(qualifiedName));
	}
	

	protected void assertOwnedRedefinitionContainsGeneral(Feature feature, Feature expected) {
		assertTrue("Expected a materialized redefinition to " + expected,
				feature.getOwnedRedefinition().stream().anyMatch(r -> r.getRedefinedFeature() == expected));
	}

	protected void assertOwnedRedefinitionContainsQualifiedName(Feature feature, String qualifiedName) {
		List<String> names = feature.getOwnedRedefinition().stream()
				.map(r -> r.getRedefinedFeature() == null ? null : r.getRedefinedFeature().getQualifiedName()).toList();
		assertTrue("Expected " + qualifiedName + " among materialized redefinitions " + names,
				names.contains(qualifiedName));
	}
	

	protected <T> T findSingleWhere(Resource resource, Class<T> kind, java.util.function.Predicate<T> filter) {
		T found = null;
		for (var contents = resource.getAllContents(); contents.hasNext();) {
			Object object = contents.next();
			if (kind.isInstance(object) && filter.test(kind.cast(object))) {
				if (found != null) {
					throw new AssertionError("Expected exactly one matching " + kind.getSimpleName() + ", found a second");
				}
				found = kind.cast(object);
			}
		}
		if (found == null) {
			throw new AssertionError("Missing matching " + kind.getSimpleName());
		}
		return found;
	}
	
	protected void assertOwnedRedefinitionContains(Feature feature, String qualifiedName) {
		List<String> names = feature.getOwnedRedefinition().stream()
				.map(r -> r.getRedefinedFeature() == null ? null : r.getRedefinedFeature().getQualifiedName()).toList();
		assertTrue("Expected " + qualifiedName + " among materialized redefinitions " + names,
				names.contains(qualifiedName));
	}
	
	protected void assertOwnedSpecializationNotContains(Type type, String qualifiedName) {
		List<String> names = type.getOwnedSpecialization().stream()
				.map(specialization -> specialization.getGeneral().getQualifiedName()).toList();
		assertFalse("Did not expect " + qualifiedName + " among materialized specializations " + names,
				names.contains(qualifiedName));
	}
}
