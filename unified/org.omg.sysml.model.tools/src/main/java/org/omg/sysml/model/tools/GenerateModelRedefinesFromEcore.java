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
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * Applies second-phase generation for {@code redefines} annotations directly in generated
 * metamodel {@code *Impl} classes.
 *
 * <p>This tool reads {@code redefines} annotations from SysML Ecore features and updates matching
 * getter methods in {@code org.omg.sysml.model.sysml.impl.*Impl} classes. If a redefined getter is
 * inherited (and therefore absent in the concrete class), it inserts an override method.
 *
 * <p>Usage:
 * <pre>{@code
 * java org.omg.sysml.model.tools.GenerateModelRedefinesFromEcore \
 *   <path-to-SysML.ecore> <path-to-org.omg.sysml.model-module>
 * }</pre>
 */
public final class GenerateModelRedefinesFromEcore {

    private final String MODEL_PACKAGE = "org.omg.sysml.model.sysml";
    private final String MODEL_CLASS_IMPORT = "import org.omg.sysml.model.sysml.Class;\n";
    private final String MODEL_PACKAGE_IMPORT = "import org.omg.sysml.model.sysml.Package;\n";
    private final String ELIST_SIMPLE_NAME = "EList";
    private final String ELIST_FQN = "org.eclipse.emf.common.util.EList";
    private final String BASIC_ELIST_SIMPLE_NAME = "BasicEList";
    private final String BASIC_ELIST_FQN = "org.eclipse.emf.common.util.BasicEList";
    private final String ECOLLECTIONS_SIMPLE_NAME = "ECollections";
    private final String ECOLLECTIONS_FQN = "org.eclipse.emf.common.util.ECollections";
    private final String TAB = "\t";

    /**
     * Utility constructor.
     */
    private GenerateModelRedefinesFromEcore() {
    }

    /**
     * Program entry point.
     *
     * @param args command-line arguments
     * @throws IOException if generation fails
     */
    public static void main(String[] args) throws IOException {
        new GenerateModelRedefinesFromEcore().generate(args);
    }

    /**
     * Applies redefines-based overrides in generated metamodel implementation classes.
     *
     * @param args command-line arguments
     * @throws IOException if loading or writing fails
     */
    private void generate(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Usage: GenerateModelRedefinesFromEcore <ecore-file> <model-module-dir>");
        }

        var ecoreFile = new File(args[0]).getAbsoluteFile();
        var modelModule = new File(args[1]).getAbsoluteFile().toPath();
        var implDir = modelModule.resolve("src/main/java/org/omg/sysml/model/sysml/impl");

        var classes = this.loadAllClasses(ecoreFile);
        classes.sort(Comparator.comparing(EClass::getName));
        for (var eClass : classes) {
            this.processClass(eClass, implDir);
        }
    }

    /**
     * Loads all EClasses from the Ecore file.
     *
     * @param ecoreFile Ecore file
     * @return discovered EClasses
     */
    private List<EClass> loadAllClasses(File ecoreFile) {
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
        Resource resource = resourceSet.getResource(URI.createFileURI(ecoreFile.getPath()), true);

        List<EClass> allClasses = new ArrayList<>();
        for (EObject root : resource.getContents()) {
            if (root instanceof EPackage ePackage) {
                this.collectClasses(ePackage, allClasses);
            }
        }
        return allClasses;
    }

    /**
     * Recursively collects EClasses from a package hierarchy.
     *
     * @param ePackage package to inspect
     * @param target output list
     */
    private void collectClasses(EPackage ePackage, List<EClass> target) {
        for (EClassifier classifier : ePackage.getEClassifiers()) {
            if (classifier instanceof EClass eClass) {
                target.add(eClass);
            }
        }
        for (EPackage sub : ePackage.getESubpackages()) {
            this.collectClasses(sub, target);
        }
    }

    /**
     * Applies redefine overrides for one EClass implementation file.
     *
     * @param eClass source EClass
     * @param implDir implementation directory
     * @throws IOException if reading or writing fails
     */
	private void processClass(EClass eClass, Path implDir) throws IOException {
		var redefines = this.redefinesByTargetFeature(eClass);
		var operationOverrides = this.operationOverrides(eClass);
        if (redefines.isEmpty() && operationOverrides.isEmpty()) {
            return;
        }

        var implPath = implDir.resolve(this.sanitize(eClass.getName()) + "Impl.java");
        if (!Files.isRegularFile(implPath)) {
            return;
        }

		String content = Files.readString(implPath, StandardCharsets.UTF_8);
		content = this.removeConflictingModelImports(content);
		var requiredImports = new LinkedHashSet<String>();
		for (var entry : redefines.entrySet()) {
			var redefinedFeature = entry.getKey();
			var redefiningFeature = entry.getValue();
			var methodName = this.accessorName(redefinedFeature);
			requiredImports.addAll(this.requiredImports(redefinedFeature, redefiningFeature));
			var method = this.redefineMethod(redefinedFeature, redefiningFeature, true);
			content = this.replaceOrInsertMethod(content, methodName, method, method);
		}
		for (var operationOverride : operationOverrides) {
			requiredImports.addAll(operationOverride.requiredImports());
			content = this.replaceOrInsertOperationMethod(content, operationOverride);
		}
		content = this.ensureImports(content, requiredImports);
		Files.writeString(implPath, content, StandardCharsets.UTF_8);
	}

    /**
     * Removes imports that collide with {@code java.lang.Class} and {@code java.lang.Package}.
     *
     * @param content Java source content
     * @return updated content without conflicting model imports
     */
    private String removeConflictingModelImports(String content) {
        var cleaned = content.replace(MODEL_CLASS_IMPORT, "");
        cleaned = cleaned.replace(MODEL_PACKAGE_IMPORT, "");
        return cleaned;
    }

    /**
     * Builds mapping between a redefined feature and its redefining source in a class.
     *
     * @param eClass source class
     * @return map of redefined feature to redefining feature
     */
    private Map<EStructuralFeature, EStructuralFeature> redefinesByTargetFeature(EClass eClass) {
        var mapping = new LinkedHashMap<EStructuralFeature, EStructuralFeature>();
        var features = new ArrayList<EStructuralFeature>(eClass.getEStructuralFeatures());
        features.sort(Comparator.comparing(EStructuralFeature::getName));
        for (var feature : features) {
            for (var redefined : this.redefinedFeatures(feature)) {
                var previous = mapping.putIfAbsent(redefined, feature);
                if (previous != null && previous != feature) {
                    throw new IllegalStateException(
                            "Conflicting redefines for "
                                    + eClass.getName()
                                    + "."
                                    + redefined.getName()
                                    + " from "
                                    + previous.getName()
                                    + " and "
                                    + feature.getName());
                }
            }
        }
        return mapping;
    }

    /**
     * Resolves redefined features referenced by one feature annotation.
     *
     * @param feature redefining feature
     * @return referenced redefined features
     */
    private List<EStructuralFeature> redefinedFeatures(EStructuralFeature feature) {
        var results = new ArrayList<EStructuralFeature>();
        for (EAnnotation annotation : feature.getEAnnotations()) {
            if (!"redefines".equals(annotation.getSource())) {
                continue;
            }
            for (EObject reference : annotation.getReferences()) {
                if (reference instanceof EStructuralFeature redefinedFeature) {
                    results.add(redefinedFeature);
                }
            }
        }
        return results;
    }

    /**
     * Replaces an existing getter method or inserts it when missing.
     *
     * @param content class content
     * @param methodName getter method name
     * @param replacementMethod replacement source if method exists
     * @param insertedMethod inserted source if method does not exist
     * @return updated class content
     */
    private String replaceOrInsertMethod(String content, String methodName, String replacementMethod, String insertedMethod) {
        var span = this.findNoArgMethodSpan(content, methodName);
        if (span != null) {
            var replacement = replacementMethod;
            if (!content.substring(0, span.start()).endsWith("\n\n")) {
                replacement = "\n" + replacement;
            }
            return content.substring(0, span.start()) + replacement + content.substring(span.end());
        }
        int classEnd = content.lastIndexOf("\n}");
        if (classEnd < 0) {
            throw new IllegalStateException("Cannot find class closing brace while inserting generated method");
        }
        return content.substring(0, classEnd) + insertedMethod + content.substring(classEnd);
    }

    /**
     * Replaces or inserts one generated operation override.
     *
     * @param content class content
     * @param operationOverride operation override specification
     * @return updated class content
     */
    private String replaceOrInsertOperationMethod(String content, OperationOverride operationOverride) {
        var span = this.findMethodSpan(content, operationOverride.methodName(), operationOverride.parameterPattern());
        if (span != null) {
            var replacement = operationOverride.methodSource();
            if (!content.substring(0, span.start()).endsWith("\n\n")) {
                replacement = "\n" + replacement;
            }
            return content.substring(0, span.start()) + replacement + content.substring(span.end());
        }
        int classEnd = content.lastIndexOf("\n}");
        if (classEnd < 0) {
            throw new IllegalStateException("Cannot find class closing brace while inserting generated operation method");
        }
        return content.substring(0, classEnd) + operationOverride.methodSource() + content.substring(classEnd);
    }

    /**
     * Finds a no-arg method span by method name.
     *
     * @param content class content
     * @param methodName getter method name
     * @return method span, or {@code null} if not found
     */
	private Span findNoArgMethodSpan(String content, String methodName) {
		var regex = "\\bpublic\\s+[^\\(\\{;]+\\b" + Pattern.quote(methodName) + "\\s*\\(\\s*\\)\\s*\\{";
		return this.findMethodSpanByRegex(content, regex);
	}

    /**
     * Finds a method span by method name and parameter pattern.
     *
     * @param content class content
     * @param methodName method name
     * @param parameterPattern regex fragment matching method parameters
     * @return method span, or {@code null} when not found
     */
	private Span findMethodSpan(String content, String methodName, String parameterPattern) {
		var regex = "\\bpublic\\s+[^\\(\\{;]+\\b" + Pattern.quote(methodName) + "\\s*\\(" + parameterPattern + "\\)\\s*\\{";
		return this.findMethodSpanByRegex(content, regex);
	}

	/**
	 * Finds a method span using a full method-header regex.
	 *
	 * @param content class content
	 * @param methodHeaderRegex regex matching method header until opening brace
	 * @return method span, or {@code null} when not found
	 */
	private Span findMethodSpanByRegex(String content, String methodHeaderRegex) {
		Matcher matcher = Pattern.compile(methodHeaderRegex).matcher(content);
		if (!matcher.find()) {
			return null;
		}
        int start = content.lastIndexOf('\n', matcher.start()) + 1;
        while (start > 0) {
            int previousLineEnd = start - 1;
            int previousLineStart = content.lastIndexOf('\n', previousLineEnd - 1) + 1;
            String previousLine = content.substring(previousLineStart, previousLineEnd).trim();
            if (previousLine.isEmpty()
                    || previousLine.startsWith("@")
                    || previousLine.startsWith("*")
                    || previousLine.startsWith("/**")
                    || previousLine.startsWith("*/")) {
                start = previousLineStart;
            } else {
                break;
            }
        }
        int braceStart = content.indexOf('{', matcher.end() - 1);
        if (braceStart < 0) {
            return null;
        }
        int depth = 0;
        for (int i = braceStart; i < content.length(); i++) {
            char c = content.charAt(i);
            if (c == '{') {
                depth++;
            } else if (c == '}') {
                depth--;
                if (depth == 0) {
                    int end = i + 1;
                    while (end < content.length() && (content.charAt(end) == '\n' || content.charAt(end) == '\r')) {
                        end++;
                    }
                    return new Span(start, end);
                }
            }
        }
        return null;
    }

    /**
     * Returns generated operation overrides for one class.
     *
     * @param eClass source class
     * @return operation overrides to apply
     */
    private List<OperationOverride> operationOverrides(EClass eClass) {
        return switch (eClass.getName()) {
            case "ConjugatedPortDefinition" -> List.of(new OperationOverride(
                    "effectiveName",
                    "\\s*",
                    Set.of(),
                    this.conjugatedPortDefinitionEffectiveNameMethod()));
            case "Relationship" -> List.of(new OperationOverride(
                    "path",
                    "\\s*",
                    Set.of(),
                    this.relationshipPathMethod()));
            case "OwningMembership" -> List.of(new OperationOverride(
                    "path",
                    "\\s*",
                    Set.of(),
                    this.owningMembershipPathMethod()));
            case "LibraryPackage" -> List.of(new OperationOverride(
                    "libraryNamespace",
                    "\\s*",
                    Set.of(MODEL_PACKAGE + ".Namespace"),
                    this.libraryPackageLibraryNamespaceMethod()));
            case "FeatureReferenceExpression" -> List.of(new OperationOverride(
                    "modelLevelEvaluable",
                    "\\s*EList<Feature>\\s+visited\\s*",
                    Set.of(
                            ELIST_FQN,
                            BASIC_ELIST_FQN,
                            MODEL_PACKAGE + ".Expression",
                            MODEL_PACKAGE + ".Feature",
                            MODEL_PACKAGE + ".FeatureValue",
                            MODEL_PACKAGE + ".Membership",
                            MODEL_PACKAGE + ".Metaclass",
                            MODEL_PACKAGE + ".MetadataFeature"),
                    this.featureReferenceExpressionModelLevelEvaluableMethod()));
            case "InvocationExpression" -> List.of(new OperationOverride(
                    "modelLevelEvaluable",
                    "\\s*EList<Feature>\\s+visited\\s*",
                    Set.of(ELIST_FQN, BASIC_ELIST_FQN, MODEL_PACKAGE + ".Feature"),
                    this.invocationExpressionModelLevelEvaluableMethod()));
            case "LiteralExpression" -> List.of(new OperationOverride(
                    "evaluate",
                    "\\s*Element\\s+target\\s*",
                    Set.of(ELIST_FQN, BASIC_ELIST_FQN, MODEL_PACKAGE + ".Element"),
                    this.literalExpressionEvaluateMethod()));
            case "CalculationUsage" -> List.of(new OperationOverride(
                    "modelLevelEvaluable",
                    "\\s*EList<Feature>\\s+visited\\s*",
                    Set.of(ELIST_FQN, MODEL_PACKAGE + ".Feature"),
                    this.falseModelLevelEvaluableMethod()));
            case "ConstraintUsage" -> List.of(new OperationOverride(
                    "modelLevelEvaluable",
                    "\\s*EList<Feature>\\s+visited\\s*",
                    Set.of(ELIST_FQN, MODEL_PACKAGE + ".Feature"),
                    this.falseModelLevelEvaluableMethod()));
            case "ReturnParameterMembership" -> List.of(new OperationOverride(
                    "parameterDirection",
                    "\\s*",
                    Set.of(MODEL_PACKAGE + ".FeatureDirectionKind"),
                    this.returnParameterMembershipParameterDirectionMethod()));
            default -> List.of();
        };
    }

    /**
     * Builds generated override for ConjugatedPortDefinition::effectiveName.
     *
     * @return method source
     */
    private String conjugatedPortDefinitionEffectiveNameMethod() {
        return this.operationMethod(
                "String",
                "effectiveName",
                "",
                """
                        var originalPortDefinition = this.getOriginalPortDefinition();
                        if (originalPortDefinition == null) {
                            return null;
                        }
                        var originalName = originalPortDefinition.getName();
                        if (originalName == null) {
                            return null;
                        }
                        return "~" + originalName;
                        """);
    }

    /**
     * Builds generated override for Relationship::path.
     *
     * @return method source
     */
    private String relationshipPathMethod() {
        return this.operationMethod(
                "String",
                "path",
                "",
                """
                        var owningRelationship = this.getOwningRelationship();
                        var owningRelatedElement = this.getOwningRelatedElement();
                        if (owningRelationship == null && owningRelatedElement != null) {
                            var index = owningRelatedElement.getOwnedRelationship().indexOf(this) + 1;
                            return owningRelatedElement.path() + "/" + Integer.toString(index);
                        }
                        var qualifiedName = this.getQualifiedName();
                        if (qualifiedName != null) {
                            return qualifiedName;
                        }
                        if (owningRelationship != null) {
                            var index = owningRelationship.getOwnedRelatedElement().indexOf(this) + 1;
                            return owningRelationship.path() + "/" + Integer.toString(index);
                        }
                        return "";
                        """);
    }

    /**
     * Builds generated override for OwningMembership::path.
     *
     * @return method source
     */
    private String owningMembershipPathMethod() {
        return this.operationMethod(
                "String",
                "path",
                "",
                """
                        var ownedElement = this.getOwnedMemberElement();
                        var qualifiedName = ownedElement == null ? null : ownedElement.getQualifiedName();
                        if (qualifiedName != null) {
                            return qualifiedName + "/owningMembership";
                        }
                        var owningRelationship = this.getOwningRelationship();
                        var owningRelatedElement = this.getOwningRelatedElement();
                        if (owningRelationship == null && owningRelatedElement != null) {
                            var index = owningRelatedElement.getOwnedRelationship().indexOf(this) + 1;
                            return owningRelatedElement.path() + "/" + Integer.toString(index);
                        }
                        var relationshipQualifiedName = this.getQualifiedName();
                        if (relationshipQualifiedName != null) {
                            return relationshipQualifiedName;
                        }
                        if (owningRelationship != null) {
                            var index = owningRelationship.getOwnedRelatedElement().indexOf(this) + 1;
                            return owningRelationship.path() + "/" + Integer.toString(index);
                        }
                        return "";
                        """);
    }

    /**
     * Builds generated override for LibraryPackage::libraryNamespace.
     *
     * @return method source
     */
    private String libraryPackageLibraryNamespaceMethod() {
        return this.operationMethod(
                "Namespace",
                "libraryNamespace",
                "",
                """
                        return this;
                        """);
    }

    /**
     * Builds generated override for FeatureReferenceExpression::modelLevelEvaluable.
     *
     * @return method source
     */
    private String featureReferenceExpressionModelLevelEvaluableMethod() {
        return this.operationMethod(
                "boolean",
                "modelLevelEvaluable",
                "EList<Feature> visited",
                """
                        var safeVisited = visited == null ? new BasicEList<Feature>() : visited;
                        var referent = this.getReferent();
                        if (referent == null) {
                            return false;
                        }
                        var anythingSelfMembership = this.resolveGlobal("Anything::self");
                        var isAnythingSelf = anythingSelfMembership != null && anythingSelfMembership.getMemberElement() == referent;
                        if (isAnythingSelf) {
                            return true;
                        }
                        if (safeVisited.contains(referent)) {
                            return false;
                        }
                        if (referent instanceof Expression expression) {
                            var nextVisited = new BasicEList<Feature>();
                            nextVisited.addAll(safeVisited);
                            nextVisited.add(referent);
                            if (expression.modelLevelEvaluable(nextVisited)) {
                                return true;
                            }
                        }
                        var owningType = referent.getOwningType();
                        if (owningType instanceof Metaclass || owningType instanceof MetadataFeature) {
                            return true;
                        }
                        if (!referent.getFeaturingType().isEmpty()) {
                            return false;
                        }
                        Expression valuation = null;
                        for (Membership membership : referent.getOwnedMembership()) {
                            if (membership instanceof FeatureValue featureValue) {
                                valuation = featureValue.getValue();
                                break;
                            }
                        }
                        if (valuation == null) {
                            return true;
                        }
                        var nextVisited = new BasicEList<Feature>();
                        nextVisited.addAll(safeVisited);
                        nextVisited.add(referent);
                        return valuation.modelLevelEvaluable(nextVisited);
                        """);
    }

    /**
     * Builds generated override for InvocationExpression::modelLevelEvaluable.
     *
     * @return method source
     */
    private String invocationExpressionModelLevelEvaluableMethod() {
        return this.operationMethod(
                "boolean",
                "modelLevelEvaluable",
                "EList<Feature> visited",
                """
                        var safeVisited = visited == null ? new BasicEList<Feature>() : visited;
                        for (var argument : this.getArgument()) {
                            if (argument == null || !argument.modelLevelEvaluable(safeVisited)) {
                                return false;
                            }
                        }
                        var function = this.getFunction();
                        return function != null && function.isIsModelLevelEvaluable();
                        """);
    }

    /**
     * Builds generated override for LiteralExpression::evaluate.
     *
     * @return method source
     */
    private String literalExpressionEvaluateMethod() {
        return this.operationMethod(
                "EList<Element>",
                "evaluate",
                "Element target",
                """
                        var result = new BasicEList<Element>();
                        result.add(this);
                        return result;
                        """);
    }

    /**
     * Builds generated override for modelLevelEvaluable operations that always evaluate to false.
     *
     * @return method source
     */
    private String falseModelLevelEvaluableMethod() {
        return this.operationMethod(
                "boolean",
                "modelLevelEvaluable",
                "EList<Feature> visited",
                """
                        return false;
                        """);
    }

    /**
     * Builds generated override for ReturnParameterMembership::parameterDirection.
     *
     * @return method source
     */
    private String returnParameterMembershipParameterDirectionMethod() {
        return this.operationMethod(
                "FeatureDirectionKind",
                "parameterDirection",
                "",
                """
                        return FeatureDirectionKind.OUT;
                        """);
    }

    /**
     * Creates one operation method source.
     *
     * @param returnType method return type
     * @param methodName method name
     * @param parameters method parameters
     * @param body method body
     * @return generated method source
     */
    private String operationMethod(String returnType, String methodName, String parameters, String body) {
        var method = new StringBuilder();
        method.append("\n")
                .append(TAB)
                .append("/**\n")
                .append(TAB)
                .append(" * <!-- begin-user-doc -->\n")
                .append(TAB)
                .append(" * <!-- end-user-doc -->\n")
                .append(TAB)
                .append(" * @generated\n")
                .append(TAB)
                .append(" */\n")
                .append(TAB)
                .append("@Override\n")
                .append(TAB)
                .append("public ")
                .append(returnType)
                .append(" ")
                .append(methodName)
                .append("(")
                .append(parameters)
                .append(") {\n");
		for (var line : body.stripIndent().stripTrailing().split("\\R")) {
			method.append(TAB).append(TAB).append(this.normalizeGeneratedBodyLine(line)).append("\n");
		}
		method.append(TAB).append("}\n");
		return method.toString();
	}

	/**
	 * Normalizes generated method-body indentation to tabs.
	 *
	 * @param line source line
	 * @return line with leading indentation converted to tabs
	 */
	private String normalizeGeneratedBodyLine(String line) {
		int index = 0;
		int indentUnits = 0;
		while (index < line.length()) {
			char current = line.charAt(index);
			if (current == '\t') {
				indentUnits++;
				index++;
				continue;
			}
			if (current != ' ') {
				break;
			}
			int spaces = 0;
			while (index < line.length() && line.charAt(index) == ' ') {
				spaces++;
				index++;
			}
			indentUnits += (spaces + 3) / 4;
			break;
		}
		return TAB.repeat(indentUnits) + line.substring(index);
	}

	/**
	 * Builds method source overriding a redefined feature getter.
	 *
	 * @param redefinedFeature target redefined feature
	 * @param redefiningFeature source redefining feature
	 * @param withJavadoc whether to include generated Javadoc and {@code @Override}
	 * @return Java method source
	 */
	private String redefineMethod(EStructuralFeature redefinedFeature, EStructuralFeature redefiningFeature,
			boolean withJavadoc) {
        String methodName = this.accessorName(redefinedFeature);
        String redefiningAccessor = this.accessorName(redefiningFeature);
        String returnType = this.javaType(redefinedFeature);
        String listItemType = this.listItemType(redefinedFeature);
        String classLiteralType = this.classLiteralType(redefinedFeature);

        var method = new StringBuilder();
        method.append("\n");
        if (withJavadoc) {
            method.append("\t/**\n")
                    .append("\t * <!-- begin-user-doc -->\n")
                    .append("\t * <!-- end-user-doc -->\n")
                    .append("\t * @generated\n")
                    .append("\t */\n");
            method.append("\t@Override\n");
        }
        method.append("\tpublic ")
                .append(returnType)
                .append(" ")
                .append(methodName)
                .append("() {\n")
                .append("\t\tvar sourceValue = this.")
                .append(redefiningAccessor)
                .append("();\n")
                .append("\t\tObject source = sourceValue;\n");

        if (redefinedFeature.isMany()) {
            method.append("\t\tvar result = new ")
                    .append(BASIC_ELIST_SIMPLE_NAME)
                    .append("<")
                    .append(listItemType)
                    .append(">();\n")
                    .append("\t\tif (source instanceof Iterable<?> values) {\n")
                    .append("\t\t\tfor (var value : values) {\n")
                    .append("\t\t\t\tif (value instanceof ")
                    .append(classLiteralType)
                    .append(" typedValue) {\n")
                    .append("\t\t\t\t\tresult.add(typedValue);\n")
                    .append("\t\t\t\t}\n")
                    .append("\t\t\t}\n")
                    .append("\t\t} else if (sourceValue instanceof ")
                    .append(classLiteralType)
                    .append(" typedValue) {\n")
                    .append("\t\t\tresult.add(typedValue);\n")
                    .append("\t\t}\n")
                    .append("\t\treturn ")
                    .append(ECOLLECTIONS_SIMPLE_NAME)
                    .append(".unmodifiableEList(result);\n");
        } else {
            String primitiveTarget = this.primitiveType(redefinedFeature);
            String primitiveSource = this.primitiveType(redefiningFeature);
            if (primitiveTarget != null && primitiveTarget.equals(primitiveSource)
                    && !redefiningFeature.isMany()) {
                method.append("\t\treturn sourceValue;\n");
            } else {
                method.append("\t\tif (source instanceof Iterable<?> values) {\n")
                        .append("\t\t\tfor (var value : values) {\n")
                        .append("\t\t\t\tif (value instanceof ")
                        .append(classLiteralType)
                        .append(" typedValue) {\n")
                        .append("\t\t\t\t\treturn typedValue;\n")
                        .append("\t\t\t\t}\n")
                        .append("\t\t\t}\n")
                        .append("\t\t\treturn ")
                        .append(this.defaultValue(redefinedFeature))
                        .append(";\n")
                        .append("\t\t}\n")
                        .append("\t\tif (sourceValue instanceof ")
                        .append(classLiteralType)
                        .append(" typedValue) {\n")
                        .append("\t\t\treturn typedValue;\n")
                        .append("\t\t}\n")
                        .append("\t\treturn ")
                        .append(this.defaultValue(redefinedFeature))
                        .append(";\n");
            }
        }

        method.append("\t}\n");
        return method.toString();
    }

    /**
     * Returns getter accessor name for a feature.
     *
     * @param feature feature
     * @return accessor name
     */
    private String accessorName(EStructuralFeature feature) {
        if (!feature.isMany() && this.isBoolean(feature)) {
            return "is" + this.capitalize(feature.getName());
        }
        return "get" + this.capitalize(feature.getName());
    }

    /**
     * Returns Java method return type for a feature.
     *
     * @param feature feature
     * @return Java type
     */
    private String javaType(EStructuralFeature feature) {
        if (feature.isMany()) {
            return ELIST_SIMPLE_NAME + "<" + this.listItemType(feature) + ">";
        }
        String primitive = this.primitiveType(feature);
        if (primitive != null) {
            return primitive;
        }
        return this.classLiteralType(feature);
    }

    /**
     * Returns Java list item type for a feature.
     *
     * @param feature feature
     * @return Java list item type
     */
    private String listItemType(EStructuralFeature feature) {
        return this.classLiteralType(feature);
    }

    /**
     * Returns class literal type usable for {@code instanceof} checks.
     *
     * @param feature feature
     * @return class literal type
     */
    private String classLiteralType(EStructuralFeature feature) {
        var eType = feature.getEType();
        var ePackage = eType.getEPackage();
        if (ePackage != null && "http://www.eclipse.org/emf/2002/Ecore".equals(ePackage.getNsURI())) {
            return switch (eType.getName()) {
                case "EBoolean" -> "java.lang.Boolean";
                case "EInt" -> "java.lang.Integer";
                case "ELong" -> "java.lang.Long";
                case "EDouble" -> "java.lang.Double";
                case "EFloat" -> "java.lang.Float";
                case "EString" -> "java.lang.String";
                default -> "java.lang.Object";
            };
        }
        var typeName = this.sanitize(eType.getName());
        if ("Class".equals(typeName) || "Package".equals(typeName)) {
            return MODEL_PACKAGE + "." + typeName;
        }
        return typeName;
    }

    /**
     * Returns primitive scalar type for supported Ecore scalar features.
     *
     * @param feature feature
     * @return primitive type or {@code null} when non-primitive/reference
     */
    private String primitiveType(EStructuralFeature feature) {
        if (feature.isMany()) {
            return null;
        }
        var eType = feature.getEType();
        var ePackage = eType.getEPackage();
        if (ePackage == null || !"http://www.eclipse.org/emf/2002/Ecore".equals(ePackage.getNsURI())) {
            return null;
        }
        return switch (eType.getName()) {
            case "EBoolean" -> "boolean";
            case "EInt" -> "int";
            case "ELong" -> "long";
            case "EDouble" -> "double";
            case "EFloat" -> "float";
            default -> null;
        };
    }

    /**
     * Returns Java default value literal for a feature return type.
     *
     * @param feature feature
     * @return default value literal
     */
    private String defaultValue(EStructuralFeature feature) {
        String primitive = this.primitiveType(feature);
        if (primitive == null) {
            return "null";
        }
        return switch (primitive) {
            case "boolean" -> "false";
            case "int" -> "0";
            case "long" -> "0L";
            case "double" -> "0.0d";
            case "float" -> "0.0f";
            default -> "null";
        };
    }

    /**
     * Returns true when the feature is a scalar EBoolean.
     *
     * @param feature feature
     * @return true when feature type is EBoolean
     */
    private boolean isBoolean(EStructuralFeature feature) {
        var eType = feature.getEType();
        if (eType == null || eType.getEPackage() == null) {
            return false;
        }
        return "http://www.eclipse.org/emf/2002/Ecore".equals(eType.getEPackage().getNsURI())
                && "EBoolean".equals(eType.getName());
    }

    /**
     * Capitalizes identifier first character.
     *
     * @param value source value
     * @return capitalized value
     */
    private String capitalize(String value) {
        if (value == null || value.isEmpty()) {
            return value;
        }
        if (value.length() == 1) {
            return value.toUpperCase();
        }
        return Character.toUpperCase(value.charAt(0)) + value.substring(1);
    }

    /**
     * Sanitizes an identifier into a Java-safe token.
     *
     * @param identifier source identifier
     * @return Java-safe identifier
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

    /**
     * Returns imports needed for one generated redefine method.
     *
     * @param redefinedFeature target redefined feature
     * @param redefiningFeature source redefining feature
     * @return required imports
     */
    private Set<String> requiredImports(EStructuralFeature redefinedFeature, EStructuralFeature redefiningFeature) {
        var imports = new LinkedHashSet<String>();
        if (redefinedFeature.isMany()) {
            imports.add(ELIST_FQN);
            imports.add(BASIC_ELIST_FQN);
            imports.add(ECOLLECTIONS_FQN);
        }
        this.addModelTypeImport(imports, redefinedFeature);
        this.addModelTypeImport(imports, redefiningFeature);
        return imports;
    }

    /**
     * Adds model type import for one feature when applicable.
     *
     * @param imports target imports
     * @param feature source feature
     */
    private void addModelTypeImport(Set<String> imports, EStructuralFeature feature) {
        var eType = feature.getEType();
        if (eType == null || eType.getEPackage() == null) {
            return;
        }
        if ("http://www.eclipse.org/emf/2002/Ecore".equals(eType.getEPackage().getNsURI())) {
            return;
        }
        var typeName = this.sanitize(eType.getName());
        if ("Class".equals(typeName) || "Package".equals(typeName)) {
            return;
        }
        imports.add(MODEL_PACKAGE + "." + typeName);
    }

    /**
     * Rebuilds the import block deterministically.
     *
     * <p>This preserves existing imports, adds required imports, removes conflicting imports and
     * rewrites ordering/grouping with stable spacing.
     *
     * @param content Java source content
     * @param requiredImports required imports
     * @return updated content
     */
    private String ensureImports(String content, Set<String> requiredImports) {
        Matcher packageMatcher = Pattern.compile("(?m)^package\\s+[^;]+;\\R").matcher(content);
        if (!packageMatcher.find()) {
            return content;
        }
        int packageEnd = packageMatcher.end();
        int classDocStart = content.indexOf("\n/**", packageEnd);
        if (classDocStart < 0) {
            return content;
        }

        String headerBody = content.substring(packageEnd, classDocStart);
        Matcher importMatcher = Pattern.compile("(?m)^import\\s+([^;]+);\\R").matcher(headerBody);

        var imports = new LinkedHashSet<String>();
        while (importMatcher.find()) {
            imports.add(importMatcher.group(1).trim());
        }
        imports.addAll(requiredImports);
        imports.remove("org.omg.sysml.model.sysml.Class");
        imports.remove("org.omg.sysml.model.sysml.Package");

        var sortedImports = new ArrayList<String>(imports);
        sortedImports.sort((left, right) -> {
            int groupOrder = Integer.compare(this.importGroup(left), this.importGroup(right));
            if (groupOrder != 0) {
                return groupOrder;
            }
            return left.compareTo(right);
        });

        var rebuilt = new StringBuilder();
        rebuilt.append("\n");
        int previousGroup = -1;
        for (var importName : sortedImports) {
            int group = this.importGroup(importName);
            if (previousGroup != -1 && previousGroup != group) {
                rebuilt.append("\n");
            }
            rebuilt.append("import ").append(importName).append(";\n");
            previousGroup = group;
        }

        return content.substring(0, packageEnd) + rebuilt + content.substring(classDocStart);
    }

    /**
     * Returns import ordering group.
     *
     * @param importName fully-qualified import name
     * @return group order
     */
    private int importGroup(String importName) {
        if (importName.startsWith("java.")) {
            return 0;
        }
        if (importName.startsWith("javax.")) {
            return 1;
        }
        if (importName.startsWith("org.eclipse.")) {
            return 2;
        }
        if (importName.startsWith("org.omg.")) {
            return 3;
        }
        return 4;
    }

    /**
     * Immutable text span.
     *
     * @param start start offset
     * @param end end offset
     */
    private record Span(int start, int end) {
    }

    /**
     * Immutable operation override descriptor.
     *
     * @param methodName method name
     * @param parameterPattern regex pattern for method parameters
     * @param requiredImports imports required by the generated method
     * @param methodSource method source code
     */
    private record OperationOverride(
            String methodName,
            String parameterPattern,
            Set<String> requiredImports,
            String methodSource) {
    }
}
