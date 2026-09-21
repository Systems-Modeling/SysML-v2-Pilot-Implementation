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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.omg.sysml.interactive.SysMLInteractive;

/** Tests the benchmark command's validation, measurements and exit status in fresh JVMs. */
public class SysMLInteractiveModelBenchmarkTest {

	@Rule
	public TemporaryFolder temporaryFolder = new TemporaryFolder();

	/**
	 * An empty package requires no library dependencies; the command must measure validation,
	 * report one validated resource with no issues and exit successfully.
	 */
	@Test
	public void validModelSucceeds() throws Exception {
		// package Valid {}
		String output = runBenchmark("package Valid {}", 0);

		// Check the public output, including the new phase, rather than internal helpers.
		assertTrue(output, output.contains("BENCHMARK,validation,"));
		assertTrue(output, output.contains("Validated resources: 1"));
		assertTrue(output, output.contains("Validation diagnostics: 0 errors, 0 warnings, 0 infos"));
	}

	/**
	 * An unresolved import is syntactically valid but must produce a validation error;
	 * the command must print its measured phase and diagnostics before exiting in failure.
	 */
	@Test
	public void unresolvedImportFailsValidation() throws Exception {
		// package Invalid { private import Missing::*; }
		String output = runBenchmark("package Invalid { private import Missing::*; }", 1);

		// Missing must be diagnosed, and the failure must not hide the validation timing.
		assertTrue(output, output.contains("BENCHMARK,validation,"));
		assertTrue(output, output.contains("Couldn't resolve reference to Namespace 'Missing'"));
		assertTrue(output, output.contains("Validation diagnostics: 1 errors"));
	}

	/**
	 * Duplicate package names trigger semantic distinguishability warnings; the command
	 * must report them while retaining a successful exit status.
	 */
	@Test
	public void semanticWarningsDoNotFailValidation() throws Exception {
		// package Ambiguous { package Duplicate {} package Duplicate {} }
		String output = runBenchmark("package Ambiguous { package Duplicate {} package Duplicate {} }", 0);

		// These warnings require semantic validation, beyond parsing and linking.
		assertTrue(output, output.contains("validateNamespaceDistinguishablity"));
		assertTrue(output, output.contains("Validation diagnostics: 0 errors, 2 warnings, 0 infos"));
	}

	/** Runs the public command against a minimal corpus without external library dependencies. */
	private String runBenchmark(String model, int expectedExitCode) throws Exception {
		Path libraries = temporaryFolder.newFolder("libraries").toPath();
		for (String directory : new String[] { SysMLInteractive.KERNEL_LIBRARIES_DIRECTORY,
				SysMLInteractive.SYSTEMS_LIBRARY_DIRECTORY, SysMLInteractive.DOMAIN_LIBRARIES_DIRECTORY }) {
			Files.createDirectory(libraries.resolve(directory));
		}
		Path models = temporaryFolder.newFolder("models").toPath();
		Files.writeString(models.resolve("model.sysml"), model);
		Path log = temporaryFolder.newFile("benchmark.log").toPath();
		String classpath = System.getProperty("surefire.test.class.path");
		if (classpath == null) {
			classpath = System.getProperty("java.class.path");
		}
		Process process = new ProcessBuilder(Path.of(System.getProperty("java.home"), "bin", "java").toString(),
				"-cp", classpath, "org.omg.sysml.interactive.profiler.SysMLInteractiveModelBenchmark",
				libraries.toString(), models.toString()).redirectErrorStream(true).redirectOutput(log.toFile()).start();
		int exitCode = process.waitFor();
		String output = Files.readString(log);
		assertEquals(output, expectedExitCode, exitCode);
		return output;
	}
}
