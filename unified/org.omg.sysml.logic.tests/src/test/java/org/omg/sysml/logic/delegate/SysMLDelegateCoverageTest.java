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
package org.omg.sysml.logic.delegate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.omg.sysml.model.sysml.SysMLFactory;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Verifies delegate coverage across the SysML metamodel.
 *
 * <p>This test validates that generated delegates in source folders exactly match UML declarations
 * and are actually used by EMF delegates at runtime:
 * <ul>
 * <li>for every expected derived setting delegate, the generated class exists and EMF resolves to
 * this exact class (never fallback);</li>
 * <li>for every expected invocation delegate, the generated class exists and EMF resolves to this
 * exact class (never fallback).</li>
 * </ul>
 */
public class SysMLDelegateCoverageTest {

    private static final String INVOCATION_PACKAGE = "org.omg.sysml.logic.delegate.invocation";

    private static final String SETTING_PACKAGE = "org.omg.sysml.logic.delegate.setting";

    private static final String INVOCATION_SUFFIX = "_InvocationDelegate.java";

    private static final String SETTING_SUFFIX = "_SettingDelegate.java";

    private static final Set<String> EXPECTED_SUBSETS_PLACEHOLDER_DELEGATES = Set.of();

    private static Map<String, EClass> classesByName;

    private static UMLElementDeclarations umlDeclarations;

    private static Set<String> actualInvocationDelegateFiles;

    private static Set<String> actualSettingDelegateFiles;

    @BeforeAll
    static void init() throws Exception {
        SysMLDelegateRegistrar.registerDelegates();

        classesByName = new HashMap<>();
        collectClasses(SysMLPackage.eINSTANCE, classesByName);

        Path unifiedDir = resolveUnifiedDir();
        Path umlPath = unifiedDir.resolve("org.omg.sysml.logic.tests/src/main/resources/SysML_xmi.uml");
        umlDeclarations = parseUmlDeclarations(umlPath);

        actualInvocationDelegateFiles = loadGeneratedDelegateFiles(
                unifiedDir.resolve("org.omg.sysml.logic/src/main/java/org/omg/sysml/logic/delegate/invocation"),
                INVOCATION_SUFFIX);
        actualSettingDelegateFiles = loadGeneratedDelegateFiles(
                unifiedDir.resolve("org.omg.sysml.logic/src/main/java/org/omg/sysml/logic/delegate/setting"),
                SETTING_SUFFIX);
    }

    @Test
    void allDerivedFeaturesHaveCorrectGeneratedSettingDelegatesAndUsage() {
        Set<String> expectedSettingDelegateFiles = new TreeSet<>();
        int checked = 0;
        int runtimeChecked = 0;

        List<String> classNames = new ArrayList<>(umlDeclarations.featuresByClass().keySet());
        classNames.sort(String::compareTo);

        for (String className : classNames) {
            EClass eClass = classesByName.get(className);
            assertNotNull(eClass, () -> "UML class not found in Ecore: " + className);

            EObject instance = createIfConcrete(eClass);
            List<String> featureNames = new ArrayList<>(umlDeclarations.featuresByClass().get(className));
            featureNames.sort(String::compareTo);

            for (String featureName : featureNames) {
                EStructuralFeature feature = resolveFeatureForDeclaredName(eClass, featureName);
                assertNotNull(feature, () -> "UML feature not found in Ecore: " + className + "." + featureName);

                if (!feature.isDerived()) {
                    continue;
                }

                checked++;
                String simpleClassName = settingDelegateSimpleName(className, featureName);
                expectedSettingDelegateFiles.add(simpleClassName + ".java");

                EStructuralFeature.Internal.SettingDelegate delegate =
                        ((EStructuralFeature.Internal) feature).getSettingDelegate();
                assertNotNull(delegate, () -> "Missing setting delegate for " + className + "." + featureName);
                if (delegate.getClass().getName().startsWith(SETTING_PACKAGE + ".")) {
                    runtimeChecked++;
                    String runtimeSimpleClassName =
                            settingDelegateSimpleName(feature.getEContainingClass().getName(), feature.getName());
                    assertFalse(delegate instanceof AbstractSettingDelegate.FallbackSettingDelegate,
                            () -> "Fallback setting delegate used for " + className + "." + featureName);
                    assertEquals(SETTING_PACKAGE + "." + runtimeSimpleClassName, delegate.getClass().getName(),
                            () -> "Unexpected setting delegate class for " + className + "." + featureName);
                }

                if (instance != null) {
                    assertDoesNotThrow(() -> instance.eGet(feature, false),
                            () -> "Failed to evaluate derived feature " + className + "." + featureName);
                }
            }
        }

        assertTrue(checked > 0, "No derived features were discovered from UML declarations.");
        assertTrue(runtimeChecked > 0, "No runtime SysML setting delegates were selected by EMF.");
        assertEquals(expectedSettingDelegateFiles, actualSettingDelegateFiles,
                () -> mismatchMessage("setting", expectedSettingDelegateFiles, actualSettingDelegateFiles));
    }

    @Test
    void allOperationsHaveCorrectGeneratedInvocationDelegatesAndUsage() {
        Set<String> expectedInvocationDelegateFiles = new TreeSet<>();
        int checked = 0;
        int runtimeChecked = 0;

        List<String> classNames = new ArrayList<>(umlDeclarations.operationsByClass().keySet());
        classNames.sort(String::compareTo);

        for (String className : classNames) {
            EClass eClass = classesByName.get(className);
            assertNotNull(eClass, () -> "UML class not found in Ecore: " + className);

            EObject instance = createIfConcrete(eClass);
            List<String> operationNames = new ArrayList<>(umlDeclarations.operationsByClass().get(className));
            operationNames.sort(String::compareTo);

            for (String operationName : operationNames) {
                EOperation operation = resolveOperationForDeclaredName(eClass, operationName);
                assertNotNull(operation,
                        () -> "UML operation not found in Ecore: " + className + "::" + operationName);

                checked++;
                String simpleClassName = invocationDelegateSimpleName(className, operationName);
                expectedInvocationDelegateFiles.add(simpleClassName + ".java");

                EOperation.Internal.InvocationDelegate delegate = ((EOperation.Internal) operation).getInvocationDelegate();
                assertNotNull(delegate, () -> "Missing invocation delegate for " + className + "::" + operationName);
                if (delegate.getClass().getName().startsWith(INVOCATION_PACKAGE + ".")) {
                    runtimeChecked++;
                    String runtimeSimpleClassName = invocationDelegateSimpleName(
                            operation.getEContainingClass().getName(), operation.getName());
                    assertFalse(delegate instanceof AbstractInvocationDelegate.FallbackInvocationDelegate,
                            () -> "Fallback invocation delegate used for " + className + "::" + operationName);
                    assertEquals(INVOCATION_PACKAGE + "." + runtimeSimpleClassName, delegate.getClass().getName(),
                            () -> "Unexpected invocation delegate class for " + className + "::" + operationName);
                }

                if (instance instanceof InternalEObject internalObject) {
                    BasicEList<Object> args = new BasicEList<>(operation.getEParameters().size());
                    for (int i = 0; i < operation.getEParameters().size(); i++) {
                        args.add(null);
                    }
                    assertDoesNotThrow(() -> invoke(delegate, internalObject, args),
                            () -> "Failed to invoke operation " + className + "::" + operationName);
                }
            }
        }

        assertTrue(checked > 0, "No operations were discovered from UML declarations.");
        assertTrue(runtimeChecked > 0, "No runtime SysML invocation delegates were selected by EMF.");
        assertEquals(expectedInvocationDelegateFiles, actualInvocationDelegateFiles,
                () -> mismatchMessage("invocation", expectedInvocationDelegateFiles, actualInvocationDelegateFiles));
    }

    @Test
    void subsetsFallbackPlaceholdersRemainExplicitlyDocumented() throws IOException {
        Path settingDir = resolveUnifiedDir().resolve(
                "org.omg.sysml.logic/src/main/java/org/omg/sysml/logic/delegate/setting");

        Set<String> placeholderFiles = new TreeSet<>();
        try (var stream = Files.list(settingDir)) {
            stream.filter(Files::isRegularFile).forEach(path -> {
                try {
                    var content = Files.readString(path);
                    if (content.contains("subsets fallback not generated for ")) {
                        placeholderFiles.add(path.getFileName().toString());
                        assertTrue(content.contains("TODO manual implementation"),
                                () -> "Missing TODO manual guidance in " + path.getFileName());
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        assertEquals(EXPECTED_SUBSETS_PLACEHOLDER_DELEGATES, placeholderFiles,
                () -> mismatchMessage(
                        "subsets fallback placeholder setting delegates",
                        new TreeSet<>(EXPECTED_SUBSETS_PLACEHOLDER_DELEGATES),
                        placeholderFiles));
    }

    private static Object invoke(EOperation.Internal.InvocationDelegate delegate, InternalEObject target, BasicEList<Object> args)
            throws InvocationTargetException {
        return delegate.dynamicInvoke(target, args);
    }

    private static EObject createIfConcrete(EClass eClass) {
        if (eClass.isAbstract() || eClass.isInterface()) {
            return null;
        }
        return SysMLFactory.eINSTANCE.create(eClass);
    }

    private static void collectClasses(EPackage ePackage, Map<String, EClass> target) {
        for (EClassifier classifier : ePackage.getEClassifiers()) {
            if (classifier instanceof EClass eClass) {
                target.put(eClass.getName(), eClass);
            }
        }
        for (EPackage subPackage : ePackage.getESubpackages()) {
            collectClasses(subPackage, target);
        }
    }

    private static EOperation resolveOperationForDeclaredName(EClass eClass, String operationName) {
        List<EOperation> candidates = new ArrayList<>();
        EList<EOperation> allOperations = eClass.getEAllOperations();
        for (EOperation operation : allOperations) {
            if (operationName.equals(operation.getName())) {
                candidates.add(operation);
            }
        }
        if (candidates.isEmpty()) {
            return null;
        }
        for (EOperation candidate : candidates) {
            if (candidate.getEContainingClass() == eClass) {
                return candidate;
            }
        }
        candidates.sort(Comparator.comparingInt(operation -> inheritanceDistance(eClass, operation.getEContainingClass())));
        return candidates.getFirst();
    }

    private static EStructuralFeature resolveFeatureForDeclaredName(EClass eClass, String featureName) {
        List<EStructuralFeature> candidates = new ArrayList<>();
        EList<EStructuralFeature> allFeatures = eClass.getEAllStructuralFeatures();
        for (EStructuralFeature feature : allFeatures) {
            if (featureName.equals(feature.getName())) {
                candidates.add(feature);
            }
        }
        if (candidates.isEmpty()) {
            return null;
        }
        for (EStructuralFeature candidate : candidates) {
            if (candidate.getEContainingClass() == eClass) {
                return candidate;
            }
        }
        candidates.sort(Comparator.comparingInt(feature -> inheritanceDistance(eClass, feature.getEContainingClass())));
        return candidates.getFirst();
    }

    private static int inheritanceDistance(EClass fromClass, EClass targetClass) {
        if (fromClass == targetClass) {
            return 0;
        }

        List<EClass> frontier = new ArrayList<>();
        Set<EClass> visited = new HashSet<>();
        frontier.add(fromClass);
        visited.add(fromClass);

        int distance = 0;
        while (!frontier.isEmpty()) {
            List<EClass> next = new ArrayList<>();
            for (EClass current : frontier) {
                if (current == targetClass) {
                    return distance;
                }
                for (EClass superType : current.getESuperTypes()) {
                    if (visited.add(superType)) {
                        next.add(superType);
                    }
                }
            }
            frontier = next;
            distance++;
        }
        return Integer.MAX_VALUE;
    }

    private static String invocationDelegateSimpleName(String className, String operationName) {
        return sanitize(className) + "_" + sanitize(operationName) + "_InvocationDelegate";
    }

    private static String settingDelegateSimpleName(String className, String featureName) {
        return sanitize(className) + "_" + sanitize(featureName) + "_SettingDelegate";
    }

    private static String sanitize(String value) {
        StringBuilder builder = new StringBuilder(value.length() + 4);
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                builder.append(ch);
            } else {
                builder.append('_');
            }
        }
        if (builder.length() == 0 || !Character.isJavaIdentifierStart(builder.charAt(0))) {
            builder.insert(0, '_');
        }
        return builder.toString();
    }

    private static UMLElementDeclarations parseUmlDeclarations(Path umlPath) throws Exception {
        assertTrue(Files.isRegularFile(umlPath), () -> "UML file not found: " + umlPath);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(false);
        Document document = factory.newDocumentBuilder().parse(umlPath.toFile());

        Map<String, Set<String>> featuresByClass = new HashMap<>();
        Map<String, Set<String>> operationsByClass = new HashMap<>();
        collectUmlDeclarations(document.getDocumentElement(), featuresByClass, operationsByClass);
        return new UMLElementDeclarations(featuresByClass, operationsByClass);
    }

    private static void collectUmlDeclarations(
            Element element,
            Map<String, Set<String>> featuresByClass,
            Map<String, Set<String>> operationsByClass) {
        if (isUmlClass(element)) {
            String className = element.getAttribute("name");
            if (!className.isBlank()) {
                Set<String> featureNames = featuresByClass.computeIfAbsent(className, ignored -> new LinkedHashSet<>());
                Set<String> operationNames = operationsByClass.computeIfAbsent(className, ignored -> new LinkedHashSet<>());
                for (Element child : childElements(element)) {
                    if ("ownedAttribute".equals(child.getTagName())) {
                        String featureName = child.getAttribute("name");
                        if (!featureName.isBlank()) {
                            featureNames.add(featureName);
                        }
                    }
                    if ("ownedOperation".equals(child.getTagName())) {
                        String operationName = child.getAttribute("name");
                        if (!operationName.isBlank()) {
                            operationNames.add(operationName);
                        }
                    }
                }
            }
        }

        for (Element child : childElements(element)) {
            collectUmlDeclarations(child, featuresByClass, operationsByClass);
        }
    }

    private static boolean isUmlClass(Element element) {
        return "packagedElement".equals(element.getTagName())
                && "uml:Class".equals(element.getAttribute("xmi:type"));
    }

    private static List<Element> childElements(Element parent) {
        List<Element> children = new ArrayList<>();
        for (Node node = parent.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node instanceof Element child) {
                children.add(child);
            }
        }
        return children;
    }

    private static Set<String> loadGeneratedDelegateFiles(Path directory, String suffix) throws IOException {
        assertTrue(Files.isDirectory(directory), () -> "Delegate directory not found: " + directory);

        Set<String> fileNames = new TreeSet<>();
        try (var stream = Files.list(directory)) {
            stream.filter(Files::isRegularFile)
                    .map(path -> path.getFileName().toString())
                    .filter(name -> name.endsWith(suffix))
                    .forEach(fileNames::add);
        }
        return fileNames;
    }

    private static Path resolveUnifiedDir() {
        Path cwd = Path.of(System.getProperty("user.dir")).toAbsolutePath().normalize();

        Optional<Path> namedUnified = findAncestorNamed(cwd, "unified");
        if (namedUnified.isPresent()) {
            return namedUnified.get();
        }

        Path candidate = cwd.resolve("unified");
        if (Files.isDirectory(candidate)) {
            return candidate;
        }

        throw new IllegalStateException("Unable to locate 'unified' directory from working directory: " + cwd);
    }

    private static Optional<Path> findAncestorNamed(Path start, String name) {
        Path current = start;
        while (current != null) {
            Path fileName = current.getFileName();
            if (fileName != null && name.equals(fileName.toString())) {
                return Optional.of(current);
            }
            current = current.getParent();
        }
        return Optional.empty();
    }

    private static String mismatchMessage(String kind, Set<String> expected, Set<String> actual) {
        Set<String> missing = new TreeSet<>(expected);
        missing.removeAll(actual);

        Set<String> extra = new TreeSet<>(actual);
        extra.removeAll(expected);

        return "Unexpected " + kind + " delegates. Missing=" + missing + ", extra=" + extra;
    }

    private record UMLElementDeclarations(
            Map<String, Set<String>> featuresByClass,
            Map<String, Set<String>> operationsByClass) {
    }
}
