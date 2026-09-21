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
package org.omg.sysml.interactive.profiler;

import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.omg.sysml.interactive.SysMLInteractive;
import org.omg.sysml.util.ElementUtil;

/**
 * One fresh-JVM measurement of loading, resolution, transformation and validation of standard
 * libraries and a recursively discovered SysML corpus. Does not save resources.
 */
public final class SysMLInteractiveModelBenchmark {

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			throw new IllegalArgumentException(
					"Usage: SysMLInteractiveModelBenchmark <standard-library-folder> <models-folder>");
		}
		Path libraries = directory(args[0]);
		Path models = directory(args[1]);
		for (String folder : List.of(SysMLInteractive.KERNEL_LIBRARIES_DIRECTORY,
				SysMLInteractive.SYSTEMS_LIBRARY_DIRECTORY, SysMLInteractive.DOMAIN_LIBRARIES_DIRECTORY)) {
			directory(libraries.resolve(folder).toString());
		}
		List<Path> inputs;
		try (var paths = Files.walk(models)) {
			inputs = paths.filter(Files::isRegularFile)
					.filter(path -> path.toString().endsWith(".sysml")).sorted().toList();
		}
		if (inputs.isEmpty()) {
			throw new IllegalArgumentException("No .sysml files found under " + models);
		}
		System.out.println("Java: " + System.getProperty("java.runtime.version"));
		System.out.println("JVM arguments: " + ManagementFactory.getRuntimeMXBean().getInputArguments());
		System.out.println("Maximum heap bytes: " + Runtime.getRuntime().maxMemory());
		System.out.println("Libraries: " + libraries);
		System.out.println("Models: " + models + " (" + inputs.size() + " files)");
		System.out.println("BENCHMARK,phase,wall_seconds,gc_count,gc_milliseconds");

		// Match the index generator's standalone setup and avoid its precomputed library index.
		System.setProperty("org.eclipse.emf.common.util.ReferenceClearingQueue", "false");
		long initialization = System.nanoTime();
		SysMLInteractive instance = SysMLInteractive.getInstance();
		instance.getLibraryIndexCache().setIndexDisabled(true);
		System.out.printf(Locale.ROOT, "Initialization: %.3f s%n", secondsSince(initialization));
		measure("load_libraries", () -> instance.loadLibrary(libraries.toString()));
		measure("load_models", () -> {
			for (Path input : inputs) {
				instance.addInputResource(instance.getResource(input.toString()));
			}
		});
		ResourceSet resources = instance.getResourceSet();
		reportErrors(resources);
		measure("resolution", () -> {
			// Resolution may load further referenced resources; include them in this phase.
			for (int i = 0; i < resources.getResources().size(); i++) {
				EcoreUtil2.resolveLazyCrossReferences(resources.getResources().get(i), null);
			}
		});
		reportErrors(resources);
		measure("transformation", () -> ElementUtil.transformAll(resources, false));
		reportErrors(resources);
		List<Issue> issues = new ArrayList<>();
		measure("validation", () -> issues.addAll(validateResources(resources)));
		System.out.println("Completed resources: " + resources.getResources().size());
		System.out.println("Validated resources: " + resources.getResources().stream()
				.filter(XtextResource.class::isInstance).count());
		reportValidationIssues(issues);
	}

	/** Validates all textual resources, including dependencies loaded during validation. */
	private static List<Issue> validateResources(ResourceSet resources) {
		List<Issue> issues = new ArrayList<>();
		for (int i = 0; i < resources.getResources().size(); i++) {
			var resource = resources.getResources().get(i);
			if (resource instanceof XtextResource) {
				var provider = IResourceServiceProvider.Registry.INSTANCE
						.getResourceServiceProvider(resource.getURI());
				if (provider == null || provider.getResourceValidator() == null) {
					throw new IllegalStateException("No validator for " + resource.getURI());
				}
				issues.addAll(provider.getResourceValidator().validate(resource, CheckMode.ALL, CancelIndicator.NullImpl));
			}
		}
		return issues;
	}

	/** Prints every diagnostic before failing the benchmark when validation found errors. */
	private static void reportValidationIssues(List<Issue> issues) {
		for (Issue issue : issues) {
			System.out.printf("VALIDATION,%s,%s,%s,%s,%s%n", issue.getSeverity(), issue.getUriToProblem(),
					issue.getLineNumber(), issue.getCode(), issue.getMessage());
		}
		long errors = issues.stream().filter(issue -> issue.getSeverity() == Severity.ERROR).count();
		long warnings = issues.stream().filter(issue -> issue.getSeverity() == Severity.WARNING).count();
		long infos = issues.stream().filter(issue -> issue.getSeverity() == Severity.INFO).count();
		System.out.printf("Validation diagnostics: %d errors, %d warnings, %d infos%n", errors, warnings, infos);
		if (errors > 0) {
			throw new IllegalStateException("Validation failed with " + errors + " errors");
		}
	}

	private static Path directory(String argument) {
		Path path = Path.of(argument).toAbsolutePath().normalize();
		if (!Files.isDirectory(path)) {
			throw new IllegalArgumentException("Not a directory: " + path);
		}
		return path;
	}

	private static void reportErrors(ResourceSet resources) {
		long errors = resources.getResources().stream().mapToLong(resource -> resource.getErrors().size()).sum();
		System.out.println("Resource diagnostics: " + errors + " errors (no additional validation performed)");
	}

	private static void measure(String phase, Runnable action) {
		System.out.println("Starting " + phase);
		var collectors = ManagementFactory.getGarbageCollectorMXBeans();
		long collections = collectors.stream().mapToLong(bean -> Math.max(0, bean.getCollectionCount())).sum();
		long gcMillis = collectors.stream().mapToLong(bean -> Math.max(0, bean.getCollectionTime())).sum();
		long start = System.nanoTime();
		action.run();
		double seconds = secondsSince(start);
		collections = collectors.stream().mapToLong(bean -> Math.max(0, bean.getCollectionCount())).sum() - collections;
		gcMillis = collectors.stream().mapToLong(bean -> Math.max(0, bean.getCollectionTime())).sum() - gcMillis;
		System.out.printf(Locale.ROOT, "BENCHMARK,%s,%.6f,%d,%d%n", phase, seconds, collections, gcMillis);
	}

	private static double secondsSince(long start) {
		return (System.nanoTime() - start) / 1_000_000_000.0;
	}
}
