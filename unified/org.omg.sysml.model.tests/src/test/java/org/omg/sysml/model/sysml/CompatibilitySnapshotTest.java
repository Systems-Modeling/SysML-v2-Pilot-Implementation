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
package org.omg.sysml.model.sysml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Comparator;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.jupiter.api.Test;

/**
 * Compatibility snapshot tests for the generated SysML metamodel.
 *
 * <p>What it validates:
 * <ul>
 * <li>metamodel package identity remains stable;</li>
 * <li>classifier inventory and IDs do not change unexpectedly;</li>
 * <li>declared feature/operation/enum literal signatures remain stable across generations.</li>
 * </ul>
 */
public class CompatibilitySnapshotTest {

    private static final String EXPECTED_SNAPSHOT_SHA256 = "dc64746eb7fea1216624f1a9772eb142af9487b69a15a04b65fcd81ace7759c2";

    @Test
    public void metamodelCompatibilitySnapshotRemainsStable() throws IOException {
        var snapshot = buildSnapshot();
        writeSnapshotForDiagnostics(snapshot);
        var actual = sha256(snapshot);
        assertEquals(
                EXPECTED_SNAPSHOT_SHA256,
                actual,
                "Metamodel compatibility snapshot changed. "
                        + "Review target/compatibility/metamodel-compatibility-snapshot.txt and update "
                        + "EXPECTED_SNAPSHOT_SHA256 only if the change is intentional.");
    }

    /**
     * Builds a deterministic textual snapshot of the SysML metamodel.
     *
     * @return serialized metamodel signature
     */
    private String buildSnapshot() {
        var pkg = SysMLPackage.eINSTANCE;
        var builder = new StringBuilder();
        builder.append("package|")
                .append(pkg.getName()).append('|')
                .append(pkg.getNsPrefix()).append('|')
                .append(pkg.getNsURI()).append('\n');

        var classifiers = pkg.getEClassifiers().stream()
                .sorted(Comparator.comparing(EClassifier::getName))
                .toList();
        for (var classifier : classifiers) {
            builder.append("classifier|")
                    .append(classifier.getName()).append('|')
                    .append(classifier.getClassifierID()).append('|')
                    .append(classifier.getClass().getSimpleName()).append('\n');

            if (classifier instanceof EClass eClass) {
                appendClassSnapshot(builder, eClass);
            } else if (classifier instanceof EEnum eEnum) {
                appendEnumSnapshot(builder, eEnum);
            }
        }
        return builder.toString();
    }

    /**
     * Appends a deterministic snapshot block for one EClass.
     *
     * @param builder target snapshot buffer
     * @param eClass source metaclass
     */
    private void appendClassSnapshot(StringBuilder builder, EClass eClass) {
        var superTypes = eClass.getESuperTypes().stream()
                .map(EClassifier::getName)
                .sorted()
                .collect(Collectors.joining(","));
        builder.append("class|")
                .append(eClass.getName()).append('|')
                .append("abstract=").append(eClass.isAbstract()).append('|')
                .append("interface=").append(eClass.isInterface()).append('|')
                .append("supers=").append(superTypes).append('\n');

        var features = eClass.getEStructuralFeatures().stream()
                .sorted(Comparator.comparing(EStructuralFeature::getName))
                .toList();
        for (var feature : features) {
            if (feature instanceof EReference reference) {
                builder.append("feature|")
                        .append(eClass.getName()).append('|')
                        .append("ref|")
                        .append(reference.getName()).append('|')
                        .append(typeName(reference.getEType())).append('|')
                        .append("lb=").append(reference.getLowerBound()).append('|')
                        .append("ub=").append(reference.getUpperBound()).append('|')
                        .append("containment=").append(reference.isContainment()).append('|')
                        .append("resolve=").append(reference.isResolveProxies()).append('|')
                        .append("derived=").append(reference.isDerived()).append('|')
                        .append("transient=").append(reference.isTransient()).append('|')
                        .append("volatile=").append(reference.isVolatile()).append('\n');
            } else if (feature instanceof EAttribute attribute) {
                builder.append("feature|")
                        .append(eClass.getName()).append('|')
                        .append("attr|")
                        .append(attribute.getName()).append('|')
                        .append(typeName(attribute.getEType())).append('|')
                        .append("lb=").append(attribute.getLowerBound()).append('|')
                        .append("ub=").append(attribute.getUpperBound()).append('|')
                        .append("derived=").append(attribute.isDerived()).append('|')
                        .append("transient=").append(attribute.isTransient()).append('|')
                        .append("volatile=").append(attribute.isVolatile()).append('\n');
            }
        }

        var operations = eClass.getEOperations().stream()
                .sorted(Comparator.comparing(op -> op.getName() + "#" + op.getEParameters().size()))
                .toList();
        for (var operation : operations) {
            var parameters = operation.getEParameters().stream()
                    .map(parameter -> parameter.getName() + ":" + typeName(parameter.getEType()))
                    .collect(Collectors.joining(","));
            builder.append("operation|")
                    .append(eClass.getName()).append('|')
                    .append(operation.getName()).append('|')
                    .append(typeName(operation.getEType())).append('|')
                    .append("params=").append(parameters).append('\n');
        }
    }

    /**
     * Appends a deterministic snapshot block for one EEnum and its literals.
     *
     * @param builder target snapshot buffer
     * @param eEnum source enum
     */
    private void appendEnumSnapshot(StringBuilder builder, EEnum eEnum) {
        var literals = eEnum.getELiterals().stream()
                .sorted(Comparator.comparingInt(literal -> literal.getValue()))
                .toList();
        for (var literal : literals) {
            builder.append("enumLiteral|")
                    .append(eEnum.getName()).append('|')
                    .append(literal.getName()).append('|')
                    .append(literal.getValue()).append('|')
                    .append(literal.getLiteral()).append('\n');
        }
    }

    /**
     * Writes the generated snapshot in the Maven target directory for diagnostics.
     *
     * @param snapshot snapshot content to persist
     * @throws IOException if writing fails
     */
    private void writeSnapshotForDiagnostics(String snapshot) throws IOException {
        var directory = Path.of("target/compatibility");
        Files.createDirectories(directory);
        var file = directory.resolve("metamodel-compatibility-snapshot.txt");
        Files.writeString(file, snapshot, StandardCharsets.UTF_8);
    }

    /**
     * Computes the SHA-256 digest of a text payload.
     *
     * @param content input text
     * @return lowercase hexadecimal SHA-256 value
     */
    private String sha256(String content) {
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 digest is not available", e);
        }
        var hash = digest.digest(content.getBytes(StandardCharsets.UTF_8));
        var hex = new StringBuilder(hash.length * 2);
        for (var b : hash) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    }

    /**
     * Returns a safe type name token for snapshot serialization.
     *
     * @param type Ecore type
     * @return type name or {@code <null>} when type is absent
     */
    private String typeName(EClassifier type) {
        return type == null ? "<null>" : type.getName();
    }
}
