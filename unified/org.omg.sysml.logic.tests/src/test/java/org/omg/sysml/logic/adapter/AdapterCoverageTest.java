/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 *******************************************************************************/
package org.omg.sysml.logic.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.junit.jupiter.api.Test;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * Verifies generated adapter coverage and runtime shape for SysML EClasses.
 */
public class AdapterCoverageTest {

    @Test
    void allEClassesHaveExactlyOneGeneratedAdapterFile() throws IOException {
        var expectedAdapterFiles = this.expectedAdapterSimpleClassNames();
        var unifiedDir = this.resolveUnifiedDir();
        var adapterDir = unifiedDir.resolve("org.omg.sysml.logic/src/main/java/org/omg/sysml/logic/adapter");

        var actualAdapterFiles = new TreeSet<String>();
        try (var files = Files.list(adapterDir)) {
            for (Path file : files.toList()) {
                var name = file.getFileName().toString();
                if (name.endsWith("Adapter.java") && !name.equals("AbstractSysMLAdapter.java")) {
                    actualAdapterFiles.add(name.substring(0, name.length() - ".java".length()));
                }
            }
        }

        assertEquals(expectedAdapterFiles, actualAdapterFiles);
    }

    @Test
    void allGeneratedAdaptersAreInstantiableAndTyped() throws Exception {
        var expectedAdapterNames = this.expectedAdapterSimpleClassNames();
        for (String adapterSimpleName : expectedAdapterNames) {
            var className = "org.omg.sysml.logic.adapter." + adapterSimpleName;
            var adapterClass = Class.forName(className);
            assertTrue(AbstractSysMLAdapter.class.isAssignableFrom(adapterClass));

            Constructor<?> ctor = adapterClass.getDeclaredConstructor();
            Object instance = ctor.newInstance();
            assertNotNull(instance);
            assertNotNull(((AbstractSysMLAdapter<?>) instance).adaptedType());
        }
    }

    /**
     * Computes the expected generated adapter simple class names from SysML EClasses.
     *
     * @return sorted set of expected adapter simple names
     */
    private TreeSet<String> expectedAdapterSimpleClassNames() {
        var classes = new HashSet<String>();
        this.collectClasses(SysMLPackage.eINSTANCE, classes);

        var expected = new TreeSet<String>();
        for (String eClassName : classes) {
            expected.add(this.sanitize(eClassName) + "Adapter");
        }
        return expected;
    }

    /**
     * Recursively collects EClass names from the given package hierarchy.
     *
     * @param ePackage package to traverse
     * @param target mutable set receiving discovered EClass names
     */
    private void collectClasses(EPackage ePackage, Set<String> target) {
        for (EClassifier classifier : ePackage.getEClassifiers()) {
            if (classifier instanceof EClass eClass) {
                target.add(eClass.getName());
            }
        }
        for (EPackage sub : ePackage.getESubpackages()) {
            this.collectClasses(sub, target);
        }
    }

    /**
     * Resolves the unified module root directory by walking up from the working directory.
     *
     * @return path to the unified directory
     */
    private Path resolveUnifiedDir() {
        Path current = Path.of("").toAbsolutePath();
        while (current != null) {
            if (Files.isDirectory(current.resolve("org.omg.sysml.logic"))
                    && Files.isDirectory(current.resolve("org.omg.sysml.model"))) {
                return current;
            }
            current = current.getParent();
        }
        throw new IllegalStateException("Cannot resolve unified directory from current working directory.");
    }

    /**
     * Converts an identifier into a Java-safe token using underscore replacement.
     *
     * @param identifier raw identifier
     * @return sanitized Java identifier token
     */
    private String sanitize(String identifier) {
        StringBuilder result = new StringBuilder(identifier.length());
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '_') {
                result.append(c);
            } else {
                result.append('_');
            }
        }
        if (result.isEmpty()) {
            return "_";
        }
        if (!Character.isJavaIdentifierStart(result.charAt(0))) {
            result.insert(0, '_');
        }
        return result.toString();
    }
}
