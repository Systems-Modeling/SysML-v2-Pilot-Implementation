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

package org.omg.sysml.xtext.tests;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Discovery of test model files. Test models are ordinary {@code .sysml} / {@code .kerml} files
 * kept outside the Java source tree, so this class enumerates them from the file system.
 *
 * <p>Root directories are taken from a system property holding a list of paths separated by the
 * platform path separator. Every root is scanned recursively; a root may also name a single file.
 * When the property is not set (e.g. when running from an IDE) the default root, relative to the
 * bundle directory, is used.
 */
public final class TestModels {

	public static final String KERML_EXTENSION = ".kerml";
	public static final String SYSML_EXTENSION = ".sysml";

	/** System property naming the parser test model roots. */
	public static final String PARSER_ROOTS_PROPERTY = "sysml.tests.parser.roots";
	public static final String DEFAULT_PARSER_ROOT = "models/parser";

	/** System property naming the directory of the standard library (sysml.library). */
	public static final String LIBRARY_PATH_PROPERTY = "sysml.tests.library.path";

	/** One test model: the file and the name under which it is reported. */
	public record TestModel(String name, Path path) {
		@Override
		public String toString() {
			return name;
		}
	}

	private TestModels() {
	}

	/**
	 * Returns the roots given by a system property, or the default root if the property is absent.
	 */
	public static List<Path> getRoots(String property, String defaultRoot) {
		String value = System.getProperty(property);
		List<Path> roots = new ArrayList<>();
		if (value == null || value.isBlank()) {
			roots.add(Paths.get(defaultRoot).toAbsolutePath().normalize());
		} else {
			Arrays.stream(value.split(File.pathSeparator))
				.map(String::trim)
				.filter(s -> !s.isEmpty())
				.map(s -> Paths.get(s).toAbsolutePath().normalize())
				.forEach(roots::add);
		}
		return roots;
	}

	/**
	 * Collects all KerML and SysML model files under the given roots, in a stable order.
	 * The reported name of a model is its path relative to the root it was found under,
	 * prefixed with the name of that root when there is more than one root.
	 */
	public static List<TestModel> collect(List<Path> roots) {
		List<TestModel> models = new ArrayList<>();
		for (Path root : roots) {
			if (!Files.exists(root)) {
				throw new IllegalArgumentException("Test model root does not exist: " + root);
			}
			Path base = Files.isDirectory(root) ? root : root.getParent();
			try (Stream<Path> files = Files.walk(root)) {
				files.filter(Files::isRegularFile)
					.filter(TestModels::isModelFile)
					.sorted(Comparator.comparing(Path::toString))
					.forEach(file -> {
						String name = base.relativize(file).toString().replace('\\', '/');
						if (roots.size() > 1) {
							name = base.getFileName() + "/" + name;
						}
						models.add(new TestModel(name, file));
					});
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
		return models;
	}

	public static boolean isModelFile(Path path) {
		String fileName = path.getFileName().toString();
		return fileName.endsWith(KERML_EXTENSION) || fileName.endsWith(SYSML_EXTENSION);
	}

}
