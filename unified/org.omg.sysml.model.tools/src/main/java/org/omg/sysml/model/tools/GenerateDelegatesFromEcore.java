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
package org.omg.sysml.model.tools;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * Generates Java delegate classes for all derived structural features and operations found in a
 * SysML Ecore metamodel.
 *
 * <p>The generator scans all {@link EClass} instances in the provided {@code .ecore} file and
 * creates:
 * <ul>
 * <li>setting delegates for each derived {@link EStructuralFeature} declared in UML
 * {@code ownedAttribute};</li>
 * <li>invocation delegates for each declared {@link EOperation} declared in UML
 * {@code ownedOperation}.</li>
 * </ul>
 *
 * <p>Generated classes are written to the logic module:
 * <ul>
 * <li>{@code org.omg.sysml.logic.delegate.setting}</li>
 * <li>{@code org.omg.sysml.logic.delegate.invocation}</li>
 * </ul>
 *
 * <p>Invocation and setting delegates are generated from declarations found in the SysML UML source
 * model ({@code SysML_xmi.uml}) for each concept. This allows generating subclass delegates even
 * when a corresponding member is inherited in Ecore.
 *
 * <p>For derived structural features that do not have a derive OCL rule, the generator emits a
 * fallback setting implementation from Ecore {@code subsets} and {@code redefines} annotations
 * when available. Sources are filtered through safety constraints (for example self-reference,
 * derived source recursion risk, type incompatibility) and unsupported sources are documented in
 * generated comments. If no safe source remains, a placeholder {@code get(...)} is generated with
 * an explicit comment explaining why manual implementation is still required.
 *
 * <p>Usage:
 * <pre>{@code
 * java org.omg.sysml.model.tools.GenerateDelegatesFromEcore \
 *   <path-to-SysML.ecore> <path-to-org.omg.sysml.logic-module> [path-to-SysML_xmi.uml]
 * }</pre>
 *
 * <p>Arguments:
 * <ul>
 * <li>arg0: absolute or relative path to the {@code .ecore} file;</li>
 * <li>arg1: absolute or relative path to the logic module root directory (the directory
 * containing {@code src/main/java}).</li>
 * <li>arg2 (optional): absolute or relative path to {@code SysML_xmi.uml}. If omitted, the
 * generator attempts to resolve it from the repository layout.</li>
 * </ul>
 */
public final class GenerateDelegatesFromEcore {

    private final String ECORE_EXTENSION = "ecore";
    private final DelegateFileSupport delegateFileSupport = new DelegateFileSupport();
    private final UmlDeclarationSupport umlDeclarationSupport = new UmlDeclarationSupport();

    private final String COPYRIGHT = """
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
            """;

    /**
     * Prevents instantiation of this utility class.
     */
    private GenerateDelegatesFromEcore() {
    }

    /**
     * Entry point that generates invocation and setting delegates from the given Ecore/UML inputs.
     *
     * @param args command-line arguments: {@code <ecore-file> <logic-module-dir> [uml-file]}
     * @throws Exception if parsing, model loading, or file generation fails
     */
    public static void main(String[] args) throws Exception {
        new GenerateDelegatesFromEcore().generate(args);
    }

    /**
     * Generates invocation and setting delegates from the given Ecore/UML inputs.
     *
     * @param args command-line arguments: {@code <ecore-file> <logic-module-dir> [uml-file]}
     * @throws Exception if parsing, model loading, or file generation fails
     */
    private void generate(String[] args) throws Exception {
        if (args.length < 2 || args.length > 3) {
            throw new IllegalArgumentException(
                    "Usage: GenerateDelegatesFromEcore <ecore-file> <logic-module-dir> [uml-file]");
        }

        File ecoreFile = new File(args[0]).getAbsoluteFile();
        Path logicModule = new File(args[1]).getAbsoluteFile().toPath();
        File umlFile = args.length == 3
                ? new File(args[2]).getAbsoluteFile()
                : umlDeclarationSupport.resolveDefaultUmlFile(ecoreFile).toFile();
        if (!umlFile.isFile()) {
            throw new IllegalArgumentException("Cannot locate SysML UML source file: " + umlFile.getAbsolutePath());
        }

        Path invocationDir = logicModule.resolve("src/main/java/org/omg/sysml/logic/delegate/invocation");
        Path settingDir = logicModule.resolve("src/main/java/org/omg/sysml/logic/delegate/setting");

        delegateFileSupport.cleanDelegateFiles(invocationDir, "_InvocationDelegate.java", "dynamicInvoke");
        delegateFileSupport.cleanDelegateFiles(settingDir, "_SettingDelegate.java", "get");
        Files.createDirectories(settingDir);
        Files.createDirectories(invocationDir);

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(ECORE_EXTENSION, new XMIResourceFactoryImpl());
        Resource resource = resourceSet.getResource(URI.createFileURI(ecoreFile.getPath()), true);
        UMLElementDeclarations umlDeclarations = umlDeclarationSupport.parseUmlDeclarations(umlFile.toPath());

        List<EClass> allClasses = new ArrayList<>();
        for (EObject root : resource.getContents()) {
            if (root instanceof EPackage ePackage) {
                collectClasses(ePackage, allClasses);
            }
        }

        allClasses.sort(Comparator.comparing(EClass::getName));

        for (EClass eClass : allClasses) {
            Set<String> declaredFeatureNames = umlDeclarations.featuresByClass().getOrDefault(eClass.getName(), Set.of());
            List<String> sortedFeatureNames = declaredFeatureNames.stream().sorted().toList();
            for (String featureName : sortedFeatureNames) {
                EStructuralFeature feature = resolveFeatureForDeclaredName(eClass, featureName);
                if (feature == null) {
                    throw new IllegalStateException(
                            "No EStructuralFeature found for UML declaration: " + eClass.getName() + "." + featureName);
                }
                if (!feature.isDerived()) {
                    continue;
                }
                String className = classToken(eClass) + "_" + featureToken(feature) + "_SettingDelegate";
                DeriveRule deriveRule = deriveRuleForFeature(umlDeclarations, eClass, feature);
                String featureComment = umlDeclarations.attributeCommentsByClass()
                        .getOrDefault(eClass.getName(), Map.of())
                        .get(feature.getName());
                Path output = settingDir.resolve(className + ".java");
                delegateFileSupport.write(output, settingClass(className, eClass, feature, deriveRule, featureComment), "get");
            }

            Set<String> declaredOperationNames = umlDeclarations.operationsByClass().getOrDefault(eClass.getName(), Set.of());
            if (declaredOperationNames.isEmpty()) {
                continue;
            }

            List<String> sortedOperationNames = declaredOperationNames.stream().sorted().toList();
            for (String operationName : sortedOperationNames) {
                EOperation operation = resolveOperationForDeclaredName(eClass, operationName);
                if (operation == null) {
                    throw new IllegalStateException(
                            "No EOperation found for UML declaration: " + eClass.getName() + "::" + operationName);
                }
                String className = classToken(eClass) + "_" + operationToken(operation) + "_InvocationDelegate";
                DeriveRule deriveRule = umlDeclarations
                        .deriveRulesByClass()
                        .getOrDefault(eClass.getName(), Map.of())
                        .get(operation.getName());
                Path output = invocationDir.resolve(className + ".java");
                delegateFileSupport.write(output, invocationClass(className, eClass, operation, deriveRule), "dynamicInvoke");
            }
        }
    }

    /**
     * Resolves the derive rule for a structural feature.
     *
     * <p>Primary lookup uses exact member-name mapping. As a fallback, this method accepts derive
     * rule names that still belong to the same class but use an abbreviated class segment, as long
     * as the rule name ends with the feature name (for example
     * {@code deriveAssignmentUsageTargetArgument} for
     * {@code AssignmentActionUsage.targetArgument}).
     *
     * @param umlDeclarations parsed UML declarations
     * @param eClass owning class
     * @param feature structural feature
     * @return matching derive rule, or {@code null} when none is found
     */
    private DeriveRule deriveRuleForFeature(UMLElementDeclarations umlDeclarations, EClass eClass, EStructuralFeature feature) {
        var classRules = umlDeclarations.deriveRulesByClass().getOrDefault(eClass.getName(), Map.of());
        var directMatch = classRules.get(feature.getName());
        if (directMatch != null) {
            return directMatch;
        }

        var suffixMatch = deriveRuleWithMatchingSuffix(classRules, feature.getName());
        if (suffixMatch != null) {
            return suffixMatch;
        }

        for (var superType : eClass.getEAllSuperTypes()) {
            var superRules = umlDeclarations.deriveRulesByClass().getOrDefault(superType.getName(), Map.of());
            var superDirect = superRules.get(feature.getName());
            if (superDirect != null) {
                return superDirect;
            }
            var superSuffix = deriveRuleWithMatchingSuffix(superRules, feature.getName());
            if (superSuffix != null) {
                return superSuffix;
            }
        }
        return null;
    }

    /**
     * Finds a derive rule by matching the rule name suffix with the target feature name.
     *
     * @param classRules derive rules for one class
     * @param featureName target feature name
     * @return matching rule, or {@code null}
     */
    private DeriveRule deriveRuleWithMatchingSuffix(Map<String, DeriveRule> classRules, String featureName) {
        var expectedSuffix = upperCamel(featureName);
        for (var candidate : classRules.values()) {
            if (candidate.ruleName() != null && candidate.ruleName().endsWith(expectedSuffix)) {
                return candidate;
            }
        }
        return null;
    }

    /**
     * Converts a lower camel-case identifier to upper camel-case.
     *
     * @param text identifier to convert
     * @return converted identifier
     */
    private String upperCamel(String text) {
        if (text == null || text.isBlank()) {
            return "";
        }
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }

    /**
     * Recursively collects all {@link EClass} instances from a package hierarchy.
     *
     * @param ePackage package to scan
     * @param target mutable list receiving discovered classes
     */
    private void collectClasses(EPackage ePackage, List<EClass> target) {
        for (EClassifier classifier : ePackage.getEClassifiers()) {
            if (classifier instanceof EClass eClass) {
                target.add(eClass);
            }
        }
        for (EPackage sub : ePackage.getESubpackages()) {
            collectClasses(sub, target);
        }
    }

    /**
     * Builds the Java source code for one generated setting delegate class.
     *
     * @param className generated Java class name
     * @param eClass owning metaclass
     * @param feature target derived feature
     * @param deriveRule optional derive rule carrying OCL text
     * @return full Java source content
     */
    private String settingClass(
            String className,
            EClass eClass,
            EStructuralFeature feature,
            DeriveRule deriveRule,
            String featureComment) {
        var settingMethod = resolveSettingMethod(eClass, feature, deriveRule, featureComment);
        String imports = "import org.eclipse.emf.ecore.EStructuralFeature;\n" + settingMethod.imports();
        String deriveMethod = settingMethod.method();
        return COPYRIGHT
                + "package org.omg.sysml.logic.delegate.setting;\n\n"
                + imports
                + "import org.omg.sysml.logic.delegate.AbstractSettingDelegate;\n\n"
                + "/**\n"
                + " * Generated setting delegate for {@code " + eClass.getName() + "." + feature.getName() + "}.\n"
                + " */\n"
                + "public class " + className + " extends AbstractSettingDelegate {\n\n"
                + "    public " + className + "(EStructuralFeature feature) {\n"
                + "        super(feature);\n"
                + "    }\n\n"
                + "    @Override\n"
                + "    protected String delegateId() {\n"
                + "        return \"" + eClass.getName() + "." + feature.getName() + "\";\n"
                + "    }\n"
                + deriveMethod
                + "}\n";
    }

    /**
     * Resolves the generated {@code get(...)} method and corresponding imports for a setting
     * delegate.
     *
     * @param eClass owning metaclass
     * @param feature target derived feature
     * @param deriveRule optional OCL derive rule
     * @param featureComment optional UML ownedAttribute comment body
     * @return generated method descriptor
     */
    private SettingMethodSpec resolveSettingMethod(
            EClass eClass,
            EStructuralFeature feature,
            DeriveRule deriveRule,
            String featureComment) {
        if (deriveRule != null) {
            return new SettingMethodSpec(importsForSettingMethod(false, false, Set.of()), oclSettingMethod(deriveRule));
        }

        var subsetsMethod = subsetsMethod(eClass, feature);
        if (subsetsMethod.isPresent()) {
            return new SettingMethodSpec(
                    importsForSettingMethod(true, feature.isMany(), typeImportsForComposedSetting(feature)),
                    subsetsMethod.get());
        }
        var subsetsAnnotation = feature.getEAnnotation("subsets");
        if (subsetsAnnotation != null) {
            var narrativeMethod = narrativeCommentMethod(eClass, feature, featureComment);
            if (narrativeMethod.isPresent()) {
                return new SettingMethodSpec(
                        importsForSettingMethod(true, feature.isMany(), typeImportsForComposedSetting(feature)),
                        narrativeMethod.get());
            }
            return new SettingMethodSpec(
                    importsForSettingMethod(false, false, Set.of()),
                    unsupportedSubsetsMethod(eClass, feature, subsetsAnnotation));
        }

        var redefinesMethod = redefinesMethod(eClass, feature);
        if (redefinesMethod.isPresent()) {
            return new SettingMethodSpec(
                    importsForSettingMethod(true, feature.isMany(), typeImportsForComposedSetting(feature)),
                    redefinesMethod.get());
        }
        var redefinesAnnotation = feature.getEAnnotation("redefines");
        if (redefinesAnnotation != null) {
            var narrativeMethod = narrativeCommentMethod(eClass, feature, featureComment);
            if (narrativeMethod.isPresent()) {
                return new SettingMethodSpec(
                        importsForSettingMethod(true, feature.isMany(), typeImportsForComposedSetting(feature)),
                        narrativeMethod.get());
            }
            return new SettingMethodSpec(
                    importsForSettingMethod(false, false, Set.of()),
                    unsupportedRedefinesMethod(eClass, feature, redefinesAnnotation));
        }

        var narrativeMethod = narrativeCommentMethod(eClass, feature, featureComment);
        if (narrativeMethod.isPresent()) {
            return new SettingMethodSpec(
                    importsForSettingMethod(true, feature.isMany(), typeImportsForComposedSetting(feature)),
                    narrativeMethod.get());
        }

        return new SettingMethodSpec(importsForSettingMethod(false, false, Set.of()), unsupportedDefaultMethod(feature));
    }

    /**
     * Builds a generated setting body by inferring source features from the UML ownedAttribute
     * natural-language comment.
     *
     * @param eClass owning metaclass
     * @param feature derived feature being generated
     * @param featureComment UML comment body text attached to the ownedAttribute
     * @return generated method source when one or more safe source candidates were inferred
     */
    private Optional<String> narrativeCommentMethod(EClass eClass, EStructuralFeature feature, String featureComment) {
        if (featureComment == null || featureComment.isBlank()) {
            return Optional.empty();
        }
        var sources = inferredCommentSources(eClass, feature, featureComment);
        if (sources.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(composedSettingMethod(feature, sources, narrativeComment(feature, sources, featureComment)));
    }

    /**
     * Infers source features mentioned in a UML natural-language ownedAttribute comment.
     *
     * @param eClass owning metaclass
     * @param feature target derived feature
     * @param featureComment UML comment body text
     * @return inferred source features in usage order
     */
    private List<EStructuralFeature> inferredCommentSources(
            EClass eClass,
            EStructuralFeature feature,
            String featureComment) {
        var normalizedComment = normalizeCommentBody(featureComment);
        boolean typeDrivenComment = normalizedComment.contains(" type ") || normalizedComment.contains(" types ");
        var scoredCandidates = new ArrayList<CommentFeatureCandidate>();
        for (var candidate : eClass.getEAllStructuralFeatures()) {
            if (candidate == feature) {
                continue;
            }
            if (typeDrivenComment && !"type".equals(candidate.getName())) {
                continue;
            }
            if (candidate.isDerived() && isDirectRedefinesSource(feature, candidate)) {
                continue;
            }
            if (!hasPotentiallyCompatibleType(feature, candidate)) {
                continue;
            }
            if (formsDirectSourceCycle(feature, candidate)) {
                continue;
            }
            int mentionIndex = mentionIndex(normalizedComment, candidate.getName());
            if (mentionIndex < 0) {
                continue;
            }
            scoredCandidates.add(new CommentFeatureCandidate(candidate, mentionIndex));
        }

        if (scoredCandidates.isEmpty()) {
            var fallbackTypeFeature = fallbackTypeSource(eClass, feature, normalizedComment);
            fallbackTypeFeature.ifPresent(source -> scoredCandidates.add(new CommentFeatureCandidate(source, Integer.MAX_VALUE)));
        }

        scoredCandidates.sort(Comparator
                .comparingInt(CommentFeatureCandidate::mentionIndex)
                .thenComparing(candidate -> candidate.feature().isDerived())
                .thenComparing(candidate -> candidate.feature().getName()));
        var unique = new LinkedHashSet<EStructuralFeature>();
        for (var candidate : scoredCandidates) {
            unique.add(candidate.feature());
        }
        return new ArrayList<>(unique);
    }

    /**
     * Returns a {@code type} source fallback when the comment indicates type-based semantics.
     *
     * @param eClass owning metaclass
     * @param feature target derived feature
     * @param normalizedComment normalized lowercase comment body
     * @return resolved {@code type} source feature, when applicable
     */
    private Optional<EStructuralFeature> fallbackTypeSource(
            EClass eClass,
            EStructuralFeature feature,
            String normalizedComment) {
        if (!normalizedComment.contains(" type ") && !normalizedComment.contains(" types ")) {
            return Optional.empty();
        }
        for (var candidate : eClass.getEAllStructuralFeatures()) {
            if (!"type".equals(candidate.getName())) {
                continue;
            }
            if (!hasPotentiallyCompatibleType(feature, candidate)) {
                continue;
            }
            if (formsDirectSourceCycle(feature, candidate)) {
                continue;
            }
            return Optional.of(candidate);
        }
        return Optional.empty();
    }

    /**
     * Formats a method-local comment for natural-language fallback generation.
     *
     * @param feature target derived feature being generated
     * @param inferredSources inferred source features
     * @param featureComment original UML ownedAttribute comment body
     * @return formatted Java block comment
     */
    private String narrativeComment(
            EStructuralFeature feature,
            List<EStructuralFeature> inferredSources,
            String featureComment) {
        var sb = new StringBuilder();
        sb.append("        /*\n");
        sb.append("         * inferred fallback for ")
                .append(feature.getEContainingClass().getName())
                .append('.')
                .append(feature.getName())
                .append('\n');
        for (var source : inferredSources) {
            sb.append("         * inferred source ")
                    .append(source.getEContainingClass().getName())
                    .append('.')
                    .append(source.getName())
                    .append('\n');
        }
        for (String line : cleanedCommentLines(featureComment)) {
            sb.append("         * ").append(line).append('\n');
        }
        sb.append("         */\n");
        return sb.toString();
    }

    /**
     * Normalizes a UML comment body for case-insensitive feature-name matching.
     *
     * @param featureComment raw UML comment body text
     * @return normalized body text with collapsed spaces and HTML removed
     */
    private String normalizeCommentBody(String featureComment) {
        return " " + stripHtmlTags(featureComment).toLowerCase().replaceAll("\\s+", " ").trim() + " ";
    }

    /**
     * Produces cleaned display lines from a UML comment body.
     *
     * @param featureComment raw UML comment body
     * @return non-empty display lines
     */
    private List<String> cleanedCommentLines(String featureComment) {
        var lines = stripHtmlTags(featureComment).replace("\r\n", "\n").replace('\r', '\n').split("\n");
        var cleaned = new ArrayList<String>();
        for (var line : lines) {
            var value = line.strip();
            if (!value.isEmpty()) {
                cleaned.add(value);
            }
        }
        return cleaned;
    }

    /**
     * Removes HTML-like tags from UML documentation text.
     *
     * @param text raw text possibly containing escaped HTML tags
     * @return text without tags
     */
    private String stripHtmlTags(String text) {
        return text
                .replace("&lt;", "<")
                .replace("&gt;", ">")
                .replace("&amp;", "&")
                .replaceAll("<[^>]+>", " ");
    }

    /**
     * Returns the first mention index of a feature name in a normalized comment.
     *
     * @param normalizedComment normalized lowercase comment body
     * @param featureName structural feature name
     * @return first match index, or {@code -1} when absent
     */
    private int mentionIndex(String normalizedComment, String featureName) {
        var singularPattern = Pattern.compile("\\b" + Pattern.quote(featureName.toLowerCase()) + "\\b");
        var singularMatcher = singularPattern.matcher(normalizedComment);
        int singular = singularMatcher.find() ? singularMatcher.start() : -1;

        var pluralPattern = Pattern.compile("\\b" + Pattern.quote(pluralize(featureName.toLowerCase())) + "\\b");
        var pluralMatcher = pluralPattern.matcher(normalizedComment);
        int plural = pluralMatcher.find() ? pluralMatcher.start() : -1;

        if (singular < 0) {
            return plural;
        }
        if (plural < 0) {
            return singular;
        }
        return Math.min(singular, plural);
    }

    /**
     * Builds a simple plural form for feature-name token matching.
     *
     * @param token singular token
     * @return plural token
     */
    private String pluralize(String token) {
        if (token.endsWith("y") && token.length() > 1) {
            return token.substring(0, token.length() - 1) + "ies";
        }
        return token + "s";
    }

    /**
     * Returns whether a source feature directly references the target in subsets/redefines metadata.
     *
     * @param targetFeature target derived feature
     * @param sourceFeature source feature candidate
     * @return {@code true} when using this source would form a direct feedback cycle
     */
    private boolean formsDirectSourceCycle(EStructuralFeature targetFeature, EStructuralFeature sourceFeature) {
        return annotationReferencesFeature(sourceFeature.getEAnnotation("subsets"), targetFeature)
                || annotationReferencesFeature(sourceFeature.getEAnnotation("redefines"), targetFeature);
    }

    /**
     * Returns whether a candidate is explicitly listed as a direct {@code redefines} source for a
     * target feature.
     *
     * @param targetFeature target derived feature
     * @param sourceFeature source candidate
     * @return {@code true} when the target directly redefines the source
     */
    private boolean isDirectRedefinesSource(EStructuralFeature targetFeature, EStructuralFeature sourceFeature) {
        var redefines = targetFeature.getEAnnotation("redefines");
        if (redefines == null) {
            return false;
        }
        for (var reference : referencedStructuralFeatures(targetFeature.getEContainingClass(), redefines)) {
            if (reference == sourceFeature) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether an annotation references a specific structural feature.
     *
     * @param annotation source annotation
     * @param targetFeature target feature
     * @return {@code true} when the annotation references the target feature
     */
    private boolean annotationReferencesFeature(EAnnotation annotation, EStructuralFeature targetFeature) {
        if (annotation == null) {
            return false;
        }
        for (EObject reference : annotation.getReferences()) {
            if (reference == targetFeature) {
                return true;
            }
        }
        return false;
    }

    /**
     * Builds import lines required for one generated setting method.
     *
     * @param needsSysMLPackage whether the method body references {@code SysMLPackage}
     * @param needsBasicEList whether the method body references {@code BasicEList}
     * @return import block, including trailing newline when non-empty
     */
    private String importsForSettingMethod(
            boolean needsSysMLPackage,
            boolean needsBasicEList,
            Set<String> extraImports) {
        var allImports = new LinkedHashSet<String>();
        allImports.add("org.eclipse.emf.ecore.InternalEObject");
        if (needsSysMLPackage) {
            allImports.add("org.omg.sysml.model.sysml.SysMLPackage");
        }
        if (needsBasicEList) {
            allImports.add("org.eclipse.emf.common.util.BasicEList");
        }
        allImports.addAll(extraImports);
        var imports = new StringBuilder();
        for (var importName : allImports) {
            imports.append("import ").append(importName).append(";\n");
        }
        return imports.toString();
    }

    /**
     * Returns additional Java imports required for composed setting generation for one feature.
     *
     * @param feature target derived feature
     * @return set of required type imports
     */
    private Set<String> typeImportsForComposedSetting(EStructuralFeature feature) {
        var typeReference = boxedInstanceType(feature);
        if (typeReference.importFqn() == null) {
            return Set.of();
        }
        return Set.of(typeReference.importFqn());
    }

    /**
     * Builds the generated {@code get(...)} method when an OCL derive rule exists.
     *
     * @param deriveRule derive rule carrying OCL body
     * @return generated method source
     */
    private String oclSettingMethod(DeriveRule deriveRule) {
        return "\n"
                + "    @Override\n"
                + "    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {\n"
                + oclComment(deriveRule)
                + "        return super.get(owner, resolve, coreType);\n"
                + "    }\n";
    }

    /**
     * Builds a generated placeholder method when no derive/subsets/redefines source can be found.
     *
     * @param feature derived feature being generated
     * @return generated {@code get(...)} method source with explanatory comments
     */
    private String unsupportedDefaultMethod(EStructuralFeature feature) {
        StringBuilder method = new StringBuilder();
        method.append('\n')
                .append("    @Override\n")
                .append("    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {\n")
                .append("        /*\n")
                .append("         * fallback not generated from derive/subsets/redefines metadata for ")
                .append(feature.getEContainingClass().getName())
                .append('.')
                .append(feature.getName())
                .append('\n')
                .append("         * TODO manual implementation: provide explicit semantics for this derived feature.\n")
                .append("         */\n")
                .append("        return super.get(owner, resolve, coreType);\n")
                .append("    }\n");
        return method.toString();
    }

    /**
     * Builds a generated setting body from the {@code redefines} annotation when no derive rule is
     * declared in UML.
     *
     * @param eClass owning metaclass
     * @param feature derived feature being generated
     * @return generated {@code get(...)} method source, when applicable
     */
    private Optional<String> redefinesMethod(EClass eClass, EStructuralFeature feature) {
        EAnnotation redefinesAnnotation = feature.getEAnnotation("redefines");
        if (redefinesAnnotation == null) {
            return Optional.empty();
        }

        var allSources = new ArrayList<EStructuralFeature>();
        allSources.addAll(referencedStructuralFeatures(eClass, redefinesAnnotation));
        var redefineSources = new ArrayList<EStructuralFeature>();
        var unsupportedSources = new ArrayList<EStructuralFeature>();
        for (EStructuralFeature redefineSource : allSources) {
            var expandedSources = expandDerivedSourceCandidates(
                    feature, redefineSource, new LinkedHashSet<>());
            if (expandedSources.isEmpty()) {
                unsupportedSources.add(redefineSource);
                continue;
            }
            redefineSources.addAll(expandedSources);
        }
        if (redefineSources.isEmpty()) {
            return Optional.empty();
        }

        redefineSources = new ArrayList<>(new LinkedHashSet<>(redefineSources));
        return Optional.of(composedSettingMethod(
                feature,
                redefineSources,
                redefinesComment(feature, redefineSources, unsupportedSources, allSources)));
    }

    /**
     * Expands one source candidate to safe terminal sources by following redefines/subsets chains
     * when intermediate features are derived.
     *
     * @param targetFeature target derived feature being generated
     * @param sourceCandidate source feature candidate
     * @param visited recursion guard set
     * @return compatible source candidates to use in fallback generation
     */
    private List<EStructuralFeature> expandDerivedSourceCandidates(
            EStructuralFeature targetFeature,
            EStructuralFeature sourceCandidate,
            Set<EStructuralFeature> visited) {
        if (sourceCandidate == targetFeature) {
            return List.of();
        }
        if (!visited.add(sourceCandidate)) {
            return List.of();
        }
        if (!sourceCandidate.isDerived()) {
            if (hasPotentiallyCompatibleType(targetFeature, sourceCandidate)
                    && !formsDirectSourceCycle(targetFeature, sourceCandidate)) {
                return List.of(sourceCandidate);
            }
            return List.of();
        }

        if (!supportsDerivedRedefinesSource(targetFeature, sourceCandidate)) {
            return List.of();
        }

        var resolved = new LinkedHashSet<EStructuralFeature>();
        var redefines = sourceCandidate.getEAnnotation("redefines");
        if (redefines != null) {
            for (var nested : referencedStructuralFeatures(sourceCandidate.getEContainingClass(), redefines)) {
                resolved.addAll(expandDerivedSourceCandidates(targetFeature, nested, new LinkedHashSet<>(visited)));
            }
        }
        var subsets = sourceCandidate.getEAnnotation("subsets");
        if (subsets != null) {
            for (var nested : referencedStructuralFeatures(sourceCandidate.getEContainingClass(), subsets)) {
                resolved.addAll(expandDerivedSourceCandidates(targetFeature, nested, new LinkedHashSet<>(visited)));
            }
        }
        if (resolved.isEmpty()
                && hasPotentiallyCompatibleType(targetFeature, sourceCandidate)
                && !formsDirectSourceCycle(targetFeature, sourceCandidate)) {
            resolved.add(sourceCandidate);
        }
        return new ArrayList<>(resolved);
    }

    /**
     * Returns whether a derived redefines source is safe enough for automatic fallback generation.
     *
     * @param targetFeature target derived feature being generated
     * @param redefineSource derived redefines source under evaluation
     * @return {@code true} when the source can be auto-generated safely
     */
    private boolean supportsDerivedRedefinesSource(
            EStructuralFeature targetFeature,
            EStructuralFeature redefineSource) {
        if (formsDirectSourceCycle(targetFeature, redefineSource)) {
            return false;
        }
        return redefineSource != targetFeature;
    }

    /**
     * Builds a generated setting body from the {@code subsets} annotation when no derive rule is
     * declared in UML.
     *
     * @param eClass owning metaclass
     * @param feature derived feature being generated
     * @return generated {@code get(...)} method source, when applicable
     */
    private Optional<String> subsetsMethod(EClass eClass, EStructuralFeature feature) {
        EAnnotation subsetsAnnotation = feature.getEAnnotation("subsets");
        if (subsetsAnnotation == null) {
            return Optional.empty();
        }
        var subsetSources = new ArrayList<EStructuralFeature>();
        var unsupportedSources = new ArrayList<EStructuralFeature>();
        var allSources = new ArrayList<EStructuralFeature>();
        allSources.addAll(referencedStructuralFeatures(eClass, subsetsAnnotation));

        for (EStructuralFeature subsetSource : allSources) {
            if (subsetSource == feature) {
                unsupportedSources.add(subsetSource);
                continue;
            }
            if (subsetSource.isDerived() && !supportsDerivedSubsetSource(feature, subsetSource)) {
                unsupportedSources.add(subsetSource);
                continue;
            }
            if (!hasPotentiallyCompatibleType(feature, subsetSource)) {
                unsupportedSources.add(subsetSource);
                continue;
            }
            subsetSources.add(subsetSource);
        }
        if (subsetSources.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(composedSettingMethod(
                feature,
                subsetSources,
                subsetsComment(feature, subsetSources, unsupportedSources, allSources)));
    }

    /**
     * Returns whether a derived subset source is safe enough for automatic fallback generation.
     *
     * <p>Supported shape: no direct subsets back-reference to the target feature.
     *
     * @param targetFeature target derived feature being generated
     * @param subsetSource derived subset source under evaluation
     * @return {@code true} when this derived subset source can be auto-generated safely
     */
    private boolean supportsDerivedSubsetSource(
            EStructuralFeature targetFeature,
            EStructuralFeature subsetSource) {
        if (subsetSource.getEContainingClass() == targetFeature.getEContainingClass()) {
            return supportsSameClassDerivedSubsetSource(targetFeature, subsetSource);
        }
        EAnnotation sourceSubsets = subsetSource.getEAnnotation("subsets");
        if (sourceSubsets == null) {
            return true;
        }
        for (EObject sourceReference : sourceSubsets.getReferences()) {
            if (sourceReference == targetFeature) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns whether a same-class derived subset source can be validated safely.
     *
     * <p>The only supported shape is a single-valued target and source where the target has an
     * opposite reference that can confirm membership of the owner.
     *
     * @param targetFeature target derived feature being generated
     * @param subsetSource same-class derived subset source under evaluation
     * @return {@code true} when guarded generation is supported
     */
    private boolean supportsSameClassDerivedSubsetSource(
            EStructuralFeature targetFeature,
            EStructuralFeature subsetSource) {
        if (targetFeature.isMany() || subsetSource.isMany()) {
            return false;
        }
        String sourceName = subsetSource.getName();
        String targetName = targetFeature.getName();
        String sourceSuffix = Character.toUpperCase(sourceName.charAt(0)) + sourceName.substring(1);
        if (!sourceName.startsWith("owning") || !targetName.endsWith(sourceSuffix)) {
            return false;
        }
        return oppositeReference(targetFeature) != null;
    }

    /**
     * Builds a generated placeholder method for subsets annotations that are not auto-translated.
     *
     * @param feature derived feature being generated
     * @param subsetsAnnotation subsets annotation attached to the feature
     * @return generated {@code get(...)} method source with explanatory comments
     */
    private String unsupportedSubsetsMethod(EClass eClass, EStructuralFeature feature, EAnnotation subsetsAnnotation) {
        return unsupportedMethod(unsupportedSubsetsComment(eClass, feature, subsetsAnnotation));
    }

    /**
     * Builds a generated placeholder method for redefines annotations that are not auto-translated.
     *
     * @param feature derived feature being generated
     * @param redefinesAnnotation redefines annotation attached to the feature
     * @return generated {@code get(...)} method source with explanatory comments
     */
    private String unsupportedRedefinesMethod(EClass eClass, EStructuralFeature feature, EAnnotation redefinesAnnotation) {
        return unsupportedMethod(unsupportedRedefinesComment(eClass, feature, redefinesAnnotation));
    }

    /**
     * Builds a generated setting method using a source list and a precomputed comment block.
     *
     * @param feature target derived feature
     * @param sources compatible source features
     * @param commentBlock method-local explanatory comment
     * @return generated method source
     */
    private String composedSettingMethod(
            EStructuralFeature feature,
            List<EStructuralFeature> sources,
            String commentBlock) {
        var targetType = boxedInstanceType(feature);
        String targetTypeName = targetType.simpleName();
        StringBuilder method = new StringBuilder();
        method.append('\n')
                .append("    @Override\n")
                .append("    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {\n")
                .append(commentBlock);
        if (feature.isMany()) {
            method.append("        var values = new BasicEList<Object>();\n");
            for (EStructuralFeature source : sources) {
                method.append(appendManySourceContribution(source, targetTypeName));
            }
            method.append("        Object resolvedValue = values;\n")
                    .append("        if (values.isEmpty()) {\n")
                    .append("            resolvedValue = super.get(owner, resolve, coreType);\n")
                    .append("        }\n");
        } else {
            method.append("        Object resolvedValue = null;\n");
            for (int i = 0; i < sources.size(); i++) {
                method.append(appendSingleSourceContribution(
                        feature,
                        sources.get(i),
                        targetTypeName,
                        isObjectType(targetTypeName),
                        i > 0,
                        i,
                        sources.size()));
            }
            method.append("        if (resolvedValue == null) {\n")
                    .append("            resolvedValue = super.get(owner, resolve, coreType);\n")
                    .append("        }\n");
        }
        method.append("        return resolvedValue;\n")
                .append("    }\n");
        return method.toString();
    }

    /**
     * Builds a generated placeholder method that only delegates to the base fallback.
     *
     * @param commentBlock explanatory comment to place at the top of the method body
     * @return generated method source
     */
    private String unsupportedMethod(String commentBlock) {
        StringBuilder method = new StringBuilder();
        method.append('\n')
                .append("    @Override\n")
                .append("    protected Object get(InternalEObject owner, boolean resolve, boolean coreType) {\n")
                .append(commentBlock)
                .append("        var result = super.get(owner, resolve, coreType);\n")
                .append("        return result;\n")
                .append("    }\n");
        return method.toString();
    }

    /**
     * Formats a method-local comment explaining why subsets fallback was not auto-generated.
     *
     * @param feature derived feature being generated
     * @param subsetsAnnotation subsets annotation attached to the feature
     * @return formatted Java block comment
     */
    private String unsupportedSubsetsComment(EClass eClass, EStructuralFeature feature, EAnnotation subsetsAnnotation) {
        StringBuilder sb = new StringBuilder();
        var allSources = referencedStructuralFeatures(eClass, subsetsAnnotation);
        sb.append("        /*\n");
        sb.append("         * subsets fallback not generated for ")
                .append(feature.getEContainingClass().getName())
                .append('.')
                .append(feature.getName())
                .append('\n');
        for (EStructuralFeature subsetSource : allSources) {
            sb.append("         * subsets ")
                    .append(subsetSource.getEContainingClass().getName())
                    .append('.')
                    .append(subsetSource.getName());
            var reasons = unsupportedReasons(feature, subsetSource, allSources);
            if (!reasons.isEmpty()) {
                sb.append(" (").append(String.join(", ", reasons)).append(")");
            }
            sb.append('\n');
        }
        sb.append("         * TODO manual implementation: translate the semantics for this derived feature\n");
        sb.append("         * while handling recursive paths, type filtering, and/or cardinality differences.\n");
        sb.append("         */\n");
        return sb.toString();
    }

    /**
     * Returns human-readable reasons why a subset source is not part of safe auto-generation.
     *
     * @param feature target derived feature
     * @param subsetSource subset source candidate
     * @return list of rejection reasons
     */
    private List<String> unsupportedReasons(
            EStructuralFeature feature,
            EStructuralFeature subsetSource,
            List<EStructuralFeature> allSources) {
        var reasons = new ArrayList<String>();
        if (subsetSource == feature) {
            reasons.add("self-reference");
        }
        if (subsetSource.isDerived()
                && !supportsDerivedSubsetSource(feature, subsetSource)) {
            reasons.add("derived source");
        }
        if (subsetSource.isMany() != feature.isMany()) {
            reasons.add("cardinality mismatch");
        }
        return reasons;
    }

    /**
     * Formats a method-local comment for subsets fallback generation.
     *
     * @param feature derived feature being generated
     * @param subsetSources subset source features declared by annotation
     * @return formatted Java block comment
     */
    private String subsetsComment(
            EStructuralFeature feature,
            List<EStructuralFeature> subsetSources,
            List<EStructuralFeature> unsupportedSubsetSources,
            List<EStructuralFeature> allSources) {
        StringBuilder sb = new StringBuilder();
        sb.append("        /*\n");
        sb.append("         * subsets fallback for ").append(feature.getEContainingClass().getName()).append('.')
                .append(feature.getName()).append('\n');
        for (EStructuralFeature subsetSource : subsetSources) {
            sb.append("         * subsets ")
                    .append(subsetSource.getEContainingClass().getName())
                    .append('.')
                    .append(subsetSource.getName())
                    .append('\n');
        }
        for (EStructuralFeature unsupportedSource : unsupportedSubsetSources) {
            sb.append("         * subsets ")
                    .append(unsupportedSource.getEContainingClass().getName())
                    .append('.')
                    .append(unsupportedSource.getName())
                    .append(" (ignored: ")
                    .append(String.join(", ", unsupportedReasons(feature, unsupportedSource, allSources)))
                    .append(")\n");
        }
        sb.append("         */\n");
        return sb.toString();
    }

    /**
     * Formats a method-local comment for redefines fallback generation.
     *
     * @param feature derived feature being generated
     * @param redefineSources redefine source features declared by annotation
     * @return formatted Java block comment
     */
    private String redefinesComment(
            EStructuralFeature feature,
            List<EStructuralFeature> redefineSources,
            List<EStructuralFeature> unsupportedRedefineSources,
            List<EStructuralFeature> allSources) {
        StringBuilder sb = new StringBuilder();
        sb.append("        /*\n");
        sb.append("         * redefines fallback for ").append(feature.getEContainingClass().getName()).append('.')
                .append(feature.getName()).append('\n');
        for (EStructuralFeature redefineSource : redefineSources) {
            sb.append("         * redefines ")
                    .append(redefineSource.getEContainingClass().getName())
                    .append('.')
                    .append(redefineSource.getName())
                    .append('\n');
        }
        for (EStructuralFeature unsupportedSource : unsupportedRedefineSources) {
            sb.append("         * redefines ")
                    .append(unsupportedSource.getEContainingClass().getName())
                    .append('.')
                    .append(unsupportedSource.getName())
                    .append(" (ignored: ")
                    .append(String.join(", ", unsupportedRedefinesReasons(feature, unsupportedSource, allSources)))
                    .append(")\n");
        }
        sb.append("         */\n");
        return sb.toString();
    }

    /**
     * Formats a method-local comment explaining why redefines fallback was not auto-generated.
     *
     * @param feature derived feature being generated
     * @param redefinesAnnotation redefines annotation attached to the feature
     * @return formatted Java block comment
     */
    private String unsupportedRedefinesComment(EClass eClass, EStructuralFeature feature, EAnnotation redefinesAnnotation) {
        StringBuilder sb = new StringBuilder();
        var allSources = referencedStructuralFeatures(eClass, redefinesAnnotation);
        sb.append("        /*\n");
        sb.append("         * redefines fallback not generated for ")
                .append(feature.getEContainingClass().getName())
                .append('.')
                .append(feature.getName())
                .append('\n');
        for (EStructuralFeature redefineSource : allSources) {
            sb.append("         * redefines ")
                    .append(redefineSource.getEContainingClass().getName())
                    .append('.')
                    .append(redefineSource.getName());
            var reasons = unsupportedRedefinesReasons(feature, redefineSource, allSources);
            if (!reasons.isEmpty()) {
                sb.append(" (").append(String.join(", ", reasons)).append(")");
            }
            sb.append('\n');
        }
        sb.append("         * TODO manual implementation: translate the semantics for this derived feature\n");
        sb.append("         * while handling recursive paths and/or multi-step ownership traversal.\n");
        sb.append("         */\n");
        return sb.toString();
    }

    /**
     * Returns human-readable reasons why a redefines source is not part of safe auto-generation.
     *
     * @param feature target derived feature
     * @param redefineSource redefines source candidate
     * @return list of rejection reasons
     */
    private List<String> unsupportedRedefinesReasons(
            EStructuralFeature feature,
            EStructuralFeature redefineSource,
            List<EStructuralFeature> allSources) {
        var reasons = new ArrayList<String>();
        if (redefineSource == feature) {
            reasons.add("self-reference");
        }
        if (redefineSource.isDerived() && !supportsDerivedRedefinesSource(feature, redefineSource)) {
            reasons.add("derived source");
        }
        if (redefineSource.isMany() != feature.isMany()) {
            reasons.add("cardinality mismatch");
        }
        if (!hasPotentiallyCompatibleType(feature, redefineSource)) {
            reasons.add("type mismatch");
        }
        return reasons;
    }

    /**
     * Extracts {@link EStructuralFeature} references from an annotation.
     *
     * @param annotation annotation that may contain structural feature references
     * @return referenced structural features in declaration order
     */
    private List<EStructuralFeature> referencedStructuralFeatures(EClass contextClass, EAnnotation annotation) {
        var referencedFeatures = new LinkedHashSet<EStructuralFeature>();
        for (EObject reference : annotation.getReferences()) {
            if (reference instanceof EStructuralFeature structuralFeature) {
                referencedFeatures.add(structuralFeature);
            }
        }
        if (!referencedFeatures.isEmpty()) {
            return new ArrayList<>(referencedFeatures);
        }

        for (String value : annotation.getDetails().values()) {
            for (String token : value.split("\\s+")) {
                EStructuralFeature resolved = resolveStructuralFeatureToken(contextClass, token);
                if (resolved != null) {
                    referencedFeatures.add(resolved);
                }
            }
        }
        return new ArrayList<>(referencedFeatures);
    }

    /**
     * Resolves a textual feature token (for example {@code #//Class/feature}) into an Ecore
     * structural feature.
     *
     * @param contextClass class used to resolve package hierarchy
     * @param token textual token from annotation details
     * @return resolved structural feature, or {@code null} when unresolved
     */
    private EStructuralFeature resolveStructuralFeatureToken(EClass contextClass, String token) {
        if (token == null || !token.startsWith("#//")) {
            return null;
        }
        int slash = token.indexOf('/', 3);
        if (slash < 0 || slash == token.length() - 1) {
            return null;
        }
        String className = token.substring(3, slash);
        String featureName = token.substring(slash + 1);
        EClass targetClass = resolveEClass(contextClass.getEPackage(), className);
        if (targetClass == null) {
            return null;
        }
        for (EStructuralFeature candidate : targetClass.getEAllStructuralFeatures()) {
            if (featureName.equals(candidate.getName())) {
                return candidate;
            }
        }
        return null;
    }

    /**
     * Resolves one class by name inside a package tree.
     *
     * @param rootPackage package root
     * @param className target class name
     * @return resolved class, or {@code null} when absent
     */
    private EClass resolveEClass(EPackage rootPackage, String className) {
        EPackage current = rootPackage;
        while (current.getESuperPackage() != null) {
            current = current.getESuperPackage();
        }
        return resolveEClassInSubtree(current, className);
    }

    /**
     * Recursively resolves one class by name in a package subtree.
     *
     * @param ePackage current package
     * @param className target class name
     * @return resolved class, or {@code null}
     */
    private EClass resolveEClassInSubtree(EPackage ePackage, String className) {
        EClassifier classifier = ePackage.getEClassifier(className);
        if (classifier instanceof EClass eClass) {
            return eClass;
        }
        for (EPackage sub : ePackage.getESubpackages()) {
            EClass resolved = resolveEClassInSubtree(sub, className);
            if (resolved != null) {
                return resolved;
            }
        }
        return null;
    }

    /**
     * Validates whether a source feature can potentially contribute to a target feature type.
     *
     * @param targetFeature derived feature receiving values
     * @param sourceFeature source feature declared in subsets/redefines
     * @return {@code true} when runtime filtering can safely handle source values
     */
    private boolean hasPotentiallyCompatibleType(EStructuralFeature targetFeature, EStructuralFeature sourceFeature) {
        if (targetFeature.getEType() == sourceFeature.getEType()) {
            return true;
        }
        if (targetFeature.getEType() instanceof EClass targetClass && sourceFeature.getEType() instanceof EClass sourceClass) {
            return targetClass.isSuperTypeOf(sourceClass) || sourceClass.isSuperTypeOf(targetClass);
        }
        return false;
    }

    /**
     * Appends source contribution code for a multi-valued target derived feature.
     *
     * @param source subset source feature
     * @param targetTypeName boxed Java type name expected for elements
     * @return generated Java code fragment
     */
    private String appendManySourceContribution(EStructuralFeature source, String targetTypeName) {
        String sourceLiteral = ecoreFeatureLiteral(source);
        String candidateGuard = isObjectType(targetTypeName)
                ? "                    if (candidate != null) {\n"
                : "                    if (candidate instanceof " + targetTypeName + ") {\n";
        String sourceValueGuard = isObjectType(targetTypeName)
                ? "            } else if (sourceValue != null) {\n"
                : "            } else if (sourceValue instanceof " + targetTypeName + ") {\n";
        return ""
                + "        var sourceValue = owner.eGet(" + sourceLiteral + ", resolve);\n"
                + "        if (sourceValue instanceof Iterable<?> iterable) {\n"
                + "            for (var candidate : iterable) {\n"
                + candidateGuard
                + "                    values.add(candidate);\n"
                + "                }\n"
                + "            }\n"
                + sourceValueGuard
                + "            values.add(sourceValue);\n"
                + "        }\n";
    }

    /**
     * Appends source contribution code for a single-valued target derived feature.
     *
     * @param source subset source feature
     * @param targetTypeName boxed Java type name expected for the value
     * @return generated Java code fragment
     */
    private String appendSingleSourceContribution(
            EStructuralFeature targetFeature,
            EStructuralFeature source,
            String targetTypeName,
            boolean objectType,
            boolean guardedByNullCheck,
            int sourceIndex,
            int sourceCount) {
        String sourceLiteral = ecoreFeatureLiteral(source);
        String statementIndent = guardedByNullCheck ? "            " : "        ";
        String nestedIndent = guardedByNullCheck ? "                " : "            ";
        String candidateVar = sourceCount == 1 ? "candidate" : "candidate" + sourceIndex;
        StringBuilder contribution = new StringBuilder();
        if (guardedByNullCheck) {
            contribution.append("        if (resolvedValue == null) {\n");
        }
        contribution.append(statementIndent).append("var ").append(candidateVar).append(" = owner.eGet(")
                .append(sourceLiteral)
                .append(", resolve);\n");
        if (source.isMany()) {
            contribution.append(statementIndent).append("if (").append(candidateVar).append(" instanceof Iterable<?> iterable) {\n")
                    .append(statementIndent).append("    for (var item : iterable) {\n")
                    .append(statementIndent)
                    .append(objectType
                            ? "        if (item != null) {\n"
                            : "        if (item instanceof " + targetTypeName + ") {\n")
                    .append(statementIndent).append("            resolvedValue = item;\n")
                    .append(statementIndent).append("            break;\n")
                    .append(statementIndent).append("        }\n")
                    .append(statementIndent).append("    }\n")
                    .append(statementIndent).append("} else ")
                    .append(objectType
                            ? "if (" + candidateVar + " != null) {\n"
                            : "if (" + candidateVar + " instanceof " + targetTypeName + ") {\n")
                    .append(nestedIndent).append("resolvedValue = ").append(candidateVar).append(";\n")
                    .append(statementIndent).append("}\n");
        } else {
            if (requiresOppositeMembershipGuard(targetFeature, source)) {
                String oppositeLiteral = ecoreFeatureLiteral(oppositeReference(targetFeature));
                String guardedAssignmentIndent = statementIndent + "        ";
                contribution.append(statementIndent).append("if (").append(candidateVar)
                        .append(" instanceof org.eclipse.emf.ecore.EObject candidateObject) {\n")
                        .append(statementIndent).append("    var oppositeValue = candidateObject.eGet(")
                        .append(oppositeLiteral)
                        .append(", resolve);\n")
                        .append(statementIndent).append("    var ownerMatchesOpposite = false;\n")
                        .append(statementIndent).append("    if (oppositeValue instanceof Iterable<?> iterable) {\n")
                        .append(statementIndent).append("        for (var oppositeItem : iterable) {\n")
                        .append(statementIndent).append("            if (oppositeItem == owner) {\n")
                        .append(statementIndent).append("                ownerMatchesOpposite = true;\n")
                        .append(statementIndent).append("                break;\n")
                        .append(statementIndent).append("            }\n")
                        .append(statementIndent).append("        }\n")
                        .append(statementIndent).append("    } else if (oppositeValue == owner) {\n")
                        .append(statementIndent).append("        ownerMatchesOpposite = true;\n")
                        .append(statementIndent).append("    }\n")
                        .append(statementIndent).append("    if (ownerMatchesOpposite")
                        .append(objectType ? " && " + candidateVar + " != null"
                                : " && " + candidateVar + " instanceof " + targetTypeName)
                        .append(") {\n")
                        .append(guardedAssignmentIndent).append("resolvedValue = ").append(candidateVar).append(";\n")
                        .append(statementIndent).append("    }\n")
                        .append(statementIndent).append("}\n");
            } else {
                contribution.append(statementIndent)
                        .append(objectType
                                ? "if (" + candidateVar + " != null) {\n"
                                : "if (" + candidateVar + " instanceof " + targetTypeName + ") {\n")
                        .append(nestedIndent).append("resolvedValue = ").append(candidateVar).append(";\n")
                        .append(statementIndent).append("}\n");
            }
        }
        if (guardedByNullCheck) {
            contribution.append("        }\n");
        }
        return contribution.toString();
    }

    /**
     * Returns whether assignment from one source to a single-valued target requires validating the
     * target opposite membership.
     *
     * @param targetFeature target derived feature being generated
     * @param source source feature candidate
     * @return {@code true} when opposite-membership guard must be generated
     */
    private boolean requiresOppositeMembershipGuard(EStructuralFeature targetFeature, EStructuralFeature source) {
        return source.isDerived()
                && source.getEContainingClass() == targetFeature.getEContainingClass()
                && oppositeReference(targetFeature) != null
                && !targetFeature.isMany()
                && !source.isMany();
    }

    /**
     * Returns the opposite reference of the given feature when available.
     *
     * @param feature structural feature
     * @return opposite reference, or {@code null} when absent/not applicable
     */
    private EReference oppositeReference(EStructuralFeature feature) {
        if (feature instanceof EReference reference) {
            return reference.getEOpposite();
        }
        return null;
    }

    /**
     * Resolves the SysMLPackage feature-literal call expression for a structural feature.
     *
     * @param feature feature to reference
     * @return Java expression resolving the Ecore feature literal
     */
    private String ecoreFeatureLiteral(EStructuralFeature feature) {
        return "SysMLPackage.eINSTANCE.get"
                + feature.getEContainingClass().getName()
                + "_"
                + capitalize(feature.getName())
                + "()";
    }

    /**
     * Returns the boxed Java instance class name for a feature EType.
     *
     * @param feature structural feature whose EType is analyzed
     * @return boxed Java class name used in generated {@code instanceof} checks
     */
    private TypeReference boxedInstanceType(EStructuralFeature feature) {
        String instanceClassName = feature.getEType().getInstanceClassName();
        if (instanceClassName == null || instanceClassName.isBlank()) {
            if (feature.getEType() instanceof EClass eClassType) {
                return new TypeReference(
                        eClassType.getName(),
                        "org.omg.sysml.model.sysml." + eClassType.getName());
            }
            return new TypeReference("Object", null);
        }
        return switch (instanceClassName) {
            case "boolean" -> new TypeReference("Boolean", null);
            case "byte" -> new TypeReference("Byte", null);
            case "char" -> new TypeReference("Character", null);
            case "short" -> new TypeReference("Short", null);
            case "int" -> new TypeReference("Integer", null);
            case "long" -> new TypeReference("Long", null);
            case "float" -> new TypeReference("Float", null);
            case "double" -> new TypeReference("Double", null);
            default -> toTypeReference(instanceClassName);
        };
    }

    /**
     * Creates a simple-name type reference from a fully qualified class name.
     *
     * @param className fully qualified (or simple) class name
     * @return type reference with optional import
     */
    private TypeReference toTypeReference(String className) {
        int separator = className.lastIndexOf('.');
        if (separator < 0) {
            return new TypeReference(className, null);
        }
        String simpleName = className.substring(separator + 1);
        if (className.startsWith("java.lang.")) {
            return new TypeReference(simpleName, null);
        }
        return new TypeReference(simpleName, className);
    }

    /**
     * Checks if a boxed type name represents {@link Object}.
     *
     * @param typeName boxed Java type name
     * @return {@code true} when the type is {@code java.lang.Object}
     */
    private boolean isObjectType(String typeName) {
        return "Object".equals(typeName);
    }

    /**
     * Capitalizes the first character of a token.
     *
     * @param value token to capitalize
     * @return token with first character in upper case
     */
    private String capitalize(String value) {
        if (value == null || value.isEmpty()) {
            return value;
        }
        return Character.toUpperCase(value.charAt(0)) + value.substring(1);
    }

    /**
     * Builds the Java source code for one generated invocation delegate class.
     *
     * @param className generated Java class name
     * @param eClass owning metaclass
     * @param operation target operation
     * @param deriveRule optional derive rule carrying OCL text
     * @return full Java source content
     */
    private String invocationClass(
            String className,
            EClass eClass,
            EOperation operation,
            DeriveRule deriveRule) {
        String deriveMethod = "";
        String imports = "import org.eclipse.emf.ecore.EOperation;\n";
        if (deriveRule != null) {
            imports += "import java.lang.reflect.InvocationTargetException;\n"
                    + "import org.eclipse.emf.common.util.EList;\n"
                    + "import org.eclipse.emf.ecore.InternalEObject;\n";
            deriveMethod = "\n"
                    + "    @Override\n"
                    + "    public Object dynamicInvoke(InternalEObject target, EList<?> arguments) throws InvocationTargetException {\n"
                    + oclComment(deriveRule)
                    + "        return super.dynamicInvoke(target, arguments);\n"
                    + "    }\n";
        }
        return COPYRIGHT
                + "package org.omg.sysml.logic.delegate.invocation;\n\n"
                + imports
                + "import org.omg.sysml.logic.delegate.AbstractInvocationDelegate;\n\n"
                + "/**\n"
                + " * Generated invocation delegate for {@code " + eClass.getName() + "::" + operation.getName() + "}.\n"
                + " */\n"
                + "public class " + className + " extends AbstractInvocationDelegate {\n\n"
                + "    public " + className + "(EOperation operation) {\n"
                + "        super(operation);\n"
                + "    }\n\n"
                + "    @Override\n"
                + "    protected String delegateId() {\n"
                + "        return \"" + eClass.getName() + "::" + operation.getName() + "\";\n"
                + "    }\n"
                + deriveMethod
                + "}\n";
    }

    /**
     * Returns the sanitized token used as class fragment for an {@link EClass}.
     *
     * @param eClass class to tokenize
     * @return Java-identifier-safe token
     */
    private String classToken(EClass eClass) {
        return sanitize(eClass.getName());
    }

    /**
     * Returns the sanitized token used as class fragment for a structural feature.
     *
     * @param feature feature to tokenize
     * @return Java-identifier-safe token
     */
    private String featureToken(EStructuralFeature feature) {
        return sanitize(feature.getName());
    }

    /**
     * Returns the sanitized token used as class fragment for an operation.
     *
     * @param operation operation to tokenize
     * @return Java-identifier-safe token
     */
    private String operationToken(EOperation operation) {
        return sanitize(operation.getName());
    }

    /**
     * Resolves the effective Ecore feature for a UML-declared feature name on a class.
     *
     * <p>If no declared member exists directly on the class, the closest inherited match is used.
     *
     * @param eClass class being generated
     * @param featureName UML-declared feature name
     * @return matching Ecore feature, or {@code null} when no match exists
     */
    private EStructuralFeature resolveFeatureForDeclaredName(EClass eClass, String featureName) {
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

    /**
     * Resolves the effective Ecore operation for a UML-declared operation name on a class.
     *
     * <p>If no declared member exists directly on the class, the closest inherited match is used.
     *
     * @param eClass class being generated
     * @param operationName UML-declared operation name
     * @return matching Ecore operation, or {@code null} when no match exists
     */
    private EOperation resolveOperationForDeclaredName(EClass eClass, String operationName) {
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
        candidates.sort(Comparator.comparingInt(op -> inheritanceDistance(eClass, op.getEContainingClass())));
        return candidates.getFirst();
    }

    /**
     * Computes shortest inheritance distance from one class to another through supertypes.
     *
     * @param fromClass starting class
     * @param targetClass target superclass candidate
     * @return number of supertype hops, or {@link Integer#MAX_VALUE} if unreachable
     */
    private int inheritanceDistance(EClass fromClass, EClass targetClass) {
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

    /**
     * Builds a Java block comment containing derive rule name and OCL expression.
     *
     * @param deriveRule derive rule metadata
     * @return formatted method-local comment string
     */
    private String oclComment(DeriveRule deriveRule) {
        String safeBody = deriveRule.oclBody().replace("\r\n", "\n").replace("*/", "* /");
        StringBuilder sb = new StringBuilder();
        sb.append("        /*\n");
        sb.append("         * OCL2.0 ").append(deriveRule.ruleName()).append('\n');
        if (!safeBody.isBlank()) {
            for (String line : safeBody.split("\n", -1)) {
                sb.append("         * ").append(line).append('\n');
            }
        }
        sb.append("         */\n");
        return sb.toString();
    }

    /**
     * Carries generated setting method source along with its required import block.
     *
     * @param imports method-level required imports
     * @param method generated {@code get(...)} method source
     */
    private record SettingMethodSpec(
            String imports,
            String method) {
    }

    /**
     * Describes a Java type usage with simple name and optional import.
     *
     * @param simpleName simple class name used in generated code
     * @param importFqn fully qualified class name to import, or {@code null}
     */
    private record TypeReference(
            String simpleName,
            String importFqn) {
    }

    /**
     * Carries one inferred feature candidate with its source-text mention index.
     *
     * @param feature inferred source feature
     * @param mentionIndex mention index in the normalized comment text
     */
    private record CommentFeatureCandidate(
            EStructuralFeature feature,
            int mentionIndex) {
    }

    /**
     * Converts arbitrary text to a Java-identifier-safe token.
     *
     * @param value input value
     * @return sanitized token
     */
    private String sanitize(String value) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else {
                sb.append('_');
            }
        }
        if (sb.isEmpty() || !Character.isJavaIdentifierStart(sb.charAt(0))) {
            sb.insert(0, '_');
        }
        return sb.toString();
    }

}
