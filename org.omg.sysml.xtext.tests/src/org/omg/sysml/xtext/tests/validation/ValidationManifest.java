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
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

/**
 * A validation test manifest: a JSON file listing test models together with the validation
 * rule each one targets and the expected outcome. The format is a JSON array of objects:
 *
 * <pre>
 * [
 *   { "file": "validateFlowEndIsEnd_invalid1.sysml", "rule": "validateFlowEndIsEnd", "expected": "invalid" },
 *   { "file": "validateFlowEndIsEnd_valid1.sysml",   "rule": "validateFlowEndIsEnd", "expected": "valid" }
 * ]
 * </pre>
 *
 * <ul>
 * <li>{@code file}: model file, relative to the directory of the manifest;</li>
 * <li>{@code rule}: name of the validation constraint from the specification;</li>
 * <li>{@code expected}: {@code "valid"} or {@code "invalid"};</li>
 * <li>{@code code} (optional): issue code reported by the pilot implementation for the rule,
 *     when it differs from the rule name;</li>
 * <li>{@code comment} (optional): free text, ignored.</li>
 * </ul>
 *
 * The same file may appear in several entries, e.g. once per rule it is meant to violate.
 */
public final class ValidationManifest {

	/** System property naming the manifest file(s), separated by the platform path separator. */
	public static final String MANIFESTS_PROPERTY = "sysml.tests.validation.manifests";
	public static final String DEFAULT_MANIFEST = "models/validation/tests.json";

	public enum Expectation { VALID, INVALID }

	/** One test case as read from the manifest, with the model path already resolved. */
	public record Entry(Path manifest, Path file, String rule, Expectation expected, String code) {

		/** The issue code to look for: the explicit {@code code} if given, otherwise the rule name. */
		public String issueCode() {
			return code == null || code.isBlank() ? rule : code;
		}

		/** Display name used for the JUnit test case. */
		@Override
		public String toString() {
			return manifest.getParent().relativize(file).toString().replace('\\', '/')
					+ " [" + rule + " " + expected.name().toLowerCase() + "]";
		}
	}

	/** Raw JSON shape; kept separate from {@link Entry} so the JSON stays flat and simple. */
	private static final class RawEntry {
		String file;
		String rule;
		String expected;
		String code;
		@SuppressWarnings("unused")
		String comment;
	}

	private ValidationManifest() {
	}

	/** Reads all entries of all given manifest files, in manifest order. */
	public static List<Entry> read(List<Path> manifests) {
		List<Entry> entries = new ArrayList<>();
		for (Path manifest : manifests) {
			entries.addAll(read(manifest));
		}
		return entries;
	}

	public static List<Entry> read(Path manifest) {
		manifest = manifest.toAbsolutePath().normalize();
		if (!Files.isRegularFile(manifest)) {
			throw new IllegalArgumentException("Validation test manifest not found: " + manifest);
		}
		RawEntry[] raw;
		try (Reader reader = Files.newBufferedReader(manifest, StandardCharsets.UTF_8)) {
			raw = new Gson().fromJson(reader, RawEntry[].class);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
		List<Entry> entries = new ArrayList<>();
		if (raw == null) {
			return entries;
		}
		Path base = manifest.getParent();
		for (int i = 0; i < raw.length; i++) {
			RawEntry r = raw[i];
			String where = manifest.getFileName() + " entry " + (i + 1);
			if (r == null || r.file == null || r.file.isBlank()) {
				throw new IllegalArgumentException(where + ": missing \"file\"");
			}
			if (r.rule == null || r.rule.isBlank()) {
				throw new IllegalArgumentException(where + ": missing \"rule\"");
			}
			Expectation expected;
			try {
				expected = Expectation.valueOf(r.expected == null ? "" : r.expected.trim().toUpperCase());
			} catch (IllegalArgumentException e) {
				throw new IllegalArgumentException(where + ": \"expected\" must be \"valid\" or \"invalid\"");
			}
			Path file = base.resolve(r.file).normalize();
			if (!Files.isRegularFile(file)) {
				throw new IllegalArgumentException(where + ": model file not found: " + file);
			}
			entries.add(new Entry(manifest, file, r.rule.trim(), expected, r.code));
		}
		return entries;
	}

}
