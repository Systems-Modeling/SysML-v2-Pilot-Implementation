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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 * Parses UML declarations and resolves default UML source paths for delegate generation.
 */
public class UmlDeclarationSupport {

    private final String OWNED_ATTRIBUTE = "ownedAttribute";
    private final String OWNED_OPERATION = "ownedOperation";
    private final String OWNED_RULE = "ownedRule";
    private final String SPECIFICATION = "specification";
    private final String LANGUAGE = "language";
    private final String BODY = "body";
    private final String PACKAGED_ELEMENT = "packagedElement";
    private final String UML_CLASS = "uml:Class";
    private final String XMI_TYPE = "xmi:type";

    /**
     * Parses UML class declarations and extracts declared attributes and operations per class.
     *
     * @param umlPath path to {@code SysML_xmi.uml}
     * @return container of declaration sets indexed by class name
     * @throws Exception if the UML file cannot be parsed
     */
    public UMLElementDeclarations parseUmlDeclarations(Path umlPath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(false);
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
        factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        factory.setXIncludeAware(false);
        factory.setExpandEntityReferences(false);
        Document document = factory.newDocumentBuilder().parse(umlPath.toFile());

        Map<String, Set<String>> featuresByClass = new HashMap<>();
        Map<String, Set<String>> operationsByClass = new HashMap<>();
        Map<String, Map<String, DeriveRule>> deriveRulesByClass = new HashMap<>();
        Map<String, Map<String, String>> attributeCommentsByClass = new HashMap<>();
        collectUmlDeclarations(document.getDocumentElement(), featuresByClass, operationsByClass, deriveRulesByClass,
                attributeCommentsByClass);
        return new UMLElementDeclarations(featuresByClass, operationsByClass, deriveRulesByClass, attributeCommentsByClass);
    }

    /**
     * Resolves the default UML source file location when it is not provided explicitly.
     *
     * @param ecoreFile reference Ecore file used to infer repository layout
     * @return resolved UML file path
     */
    public Path resolveDefaultUmlFile(File ecoreFile) {
        Optional<Path> unifiedRoot = findAncestorNamed(ecoreFile.toPath().getParent(), "unified");
        if (unifiedRoot.isPresent()) {
            Path candidate = unifiedRoot.get().resolve("org.omg.sysml.model.tools/src/main/resources/SysML_xmi.uml");
            if (Files.isRegularFile(candidate)) {
                return candidate;
            }
        }

        List<Path> fallbackCandidates = List.of(
                Path.of("src/main/resources/SysML_xmi.uml"),
                Path.of("org.omg.sysml.model.tools/src/main/resources/SysML_xmi.uml"),
                Path.of("unified/org.omg.sysml.model.tools/src/main/resources/SysML_xmi.uml"));
        for (Path candidate : fallbackCandidates) {
            if (Files.isRegularFile(candidate)) {
                return candidate.toAbsolutePath();
            }
        }

        throw new IllegalArgumentException("Unable to resolve default SysML_xmi.uml location.");
    }

    /**
     * Recursively collects UML {@code ownedAttribute} and {@code ownedOperation} declarations.
     *
     * @param element current DOM element
     * @param featuresByClass output map of class name to declared feature names
     * @param operationsByClass output map of class name to declared operation names
     * @param deriveRulesByClass output map of class name to derive rules indexed by member name
     * @param attributeCommentsByClass output map of class name to feature comments indexed by
     * feature name
     */
    private void collectUmlDeclarations(
            Element element,
            Map<String, Set<String>> featuresByClass,
            Map<String, Set<String>> operationsByClass,
            Map<String, Map<String, DeriveRule>> deriveRulesByClass,
            Map<String, Map<String, String>> attributeCommentsByClass) {
        if (isUmlClass(element)) {
            String className = element.getAttribute("name");
            if (!className.isBlank()) {
                Set<String> featureNames = featuresByClass.computeIfAbsent(className, ignored -> new LinkedHashSet<>());
                Set<String> operationNames = operationsByClass.computeIfAbsent(className, ignored -> new LinkedHashSet<>());
                Map<String, DeriveRule> deriveRules = deriveRulesByClass.computeIfAbsent(className, ignored -> new HashMap<>());
                Map<String, String> attributeComments = attributeCommentsByClass.computeIfAbsent(className,
                        ignored -> new HashMap<>());
                for (Element child : childElements(element)) {
                    if (OWNED_ATTRIBUTE.equals(child.getTagName())) {
                        String featureName = child.getAttribute("name");
                        if (!featureName.isBlank()) {
                            featureNames.add(featureName);
                            findOwnedCommentBody(child).ifPresent(comment -> attributeComments.put(featureName, comment));
                        }
                    }
                    if (OWNED_OPERATION.equals(child.getTagName())) {
                        String operationName = child.getAttribute("name");
                        if (!operationName.isBlank()) {
                            operationNames.add(operationName);
                            Optional<DeriveRule> operationRule = parseOperationOwnedRule(operationName, child);
                            operationRule.ifPresent(rule -> deriveRules.put(operationName, rule));
                        }
                    }
                    if (OWNED_RULE.equals(child.getTagName())) {
                        Optional<DeriveRule> deriveRule = parseDeriveRule(className, child);
                        deriveRule.ifPresent(rule -> deriveRules.put(rule.memberName(), rule));
                    }
                }
            }
        }
        for (Element child : childElements(element)) {
            collectUmlDeclarations(child, featuresByClass, operationsByClass, deriveRulesByClass, attributeCommentsByClass);
        }
    }

    /**
     * Finds the first owned comment body text under an UML member declaration.
     *
     * @param element UML ownedAttribute/ownedOperation element
     * @return comment body text when present
     */
    private Optional<String> findOwnedCommentBody(Element element) {
        for (Element child : childElements(element)) {
            if (!"ownedComment".equals(child.getTagName())) {
                continue;
            }
            for (Element commentChild : childElements(child)) {
                if (!BODY.equals(commentChild.getTagName())) {
                    continue;
                }
                String body = commentChild.getTextContent();
                if (body != null && !body.isBlank()) {
                    return Optional.of(body.strip());
                }
            }
        }
        return Optional.empty();
    }

    /**
     * Parses one UML ownedRule and extracts a derive rule mapped to a class member.
     *
     * @param className owning UML class name
     * @param ruleElement UML ownedRule element
     * @return derive rule when rule name starts with {@code derive} and can be mapped
     */
    private Optional<DeriveRule> parseDeriveRule(String className, Element ruleElement) {
        String ruleName = ruleElement.getAttribute("name");
        if (ruleName.isBlank() || !ruleName.startsWith("derive")) {
            return Optional.empty();
        }
        String memberName = deriveMemberName(className, ruleName);
        if (memberName == null || memberName.isBlank()) {
            return Optional.empty();
        }
        String oclBody = findOclBody(ruleElement).orElse("");
        return Optional.of(new DeriveRule(ruleName, memberName, oclBody));
    }

    /**
     * Parses operation-local owned rules and binds their OCL body to the operation name.
     *
     * @param operationName UML operation name
     * @param operationElement UML ownedOperation element
     * @return first OCL rule mapped to the operation name, when present
     */
    private Optional<DeriveRule> parseOperationOwnedRule(String operationName, Element operationElement) {
        for (Element child : childElements(operationElement)) {
            if (!OWNED_RULE.equals(child.getTagName())) {
                continue;
            }
            String oclBody = findOclBody(child).orElse("");
            if (oclBody.isBlank()) {
                continue;
            }
            String ruleName = child.getAttribute("name");
            if (ruleName == null || ruleName.isBlank()) {
                ruleName = "operationBody";
            }
            return Optional.of(new DeriveRule(ruleName, operationName, oclBody));
        }
        return Optional.empty();
    }

    /**
     * Derives target member name from derive rule naming convention.
     *
     * @param className owning class name
     * @param ruleName derive rule name
     * @return target member name, or {@code null} if the name cannot be mapped
     */
    private String deriveMemberName(String className, String ruleName) {
        String classPrefix = "derive" + className;
        if (ruleName.startsWith(classPrefix)) {
            String memberSuffix = ruleName.substring(classPrefix.length());
            if (memberSuffix.isBlank()) {
                return null;
            }
            return Character.toLowerCase(memberSuffix.charAt(0)) + memberSuffix.substring(1);
        }

        // Keep derive rules that are scoped by class container but use a shortened class segment.
        if (!ruleName.startsWith("derive") || ruleName.length() <= "derive".length()) {
            return null;
        }
        String memberSuffix = ruleName.substring("derive".length());
        return Character.toLowerCase(memberSuffix.charAt(0)) + memberSuffix.substring(1);
    }

    /**
     * Finds OCL2.0 body text under a UML ownedRule.
     *
     * @param ruleElement UML ownedRule element
     * @return OCL body text when available
     */
    private Optional<String> findOclBody(Element ruleElement) {
        for (Element child : childElements(ruleElement)) {
            if (!SPECIFICATION.equals(child.getTagName())) {
                continue;
            }
            List<String> languages = new ArrayList<>();
            List<String> bodies = new ArrayList<>();
            for (Element specChild : childElements(child)) {
                if (LANGUAGE.equals(specChild.getTagName())) {
                    String value = specChild.getTextContent();
                    if (value != null) {
                        languages.add(value.trim());
                    }
                } else if (BODY.equals(specChild.getTagName())) {
                    String value = specChild.getTextContent();
                    if (value != null) {
                        bodies.add(value);
                    }
                }
            }
            for (int i = 0; i < bodies.size(); i++) {
                String language = i < languages.size() ? languages.get(i) : "";
                if ("OCL2.0".equalsIgnoreCase(language) || language.isBlank()) {
                    return Optional.of(bodies.get(i).strip());
                }
            }
        }
        return Optional.empty();
    }

    /**
     * Checks whether the DOM element represents a UML class packaged element.
     *
     * @param element DOM element to test
     * @return {@code true} when the element is a UML class declaration
     */
    private boolean isUmlClass(Element element) {
        return PACKAGED_ELEMENT.equals(element.getTagName())
                && UML_CLASS.equals(element.getAttribute(XMI_TYPE));
    }

    /**
     * Returns direct child elements of a DOM element, preserving document order.
     *
     * @param parent parent DOM element
     * @return list of child elements
     */
    private List<Element> childElements(Element parent) {
        List<Element> children = new ArrayList<>();
        for (Node node = parent.getFirstChild(); node != null; node = node.getNextSibling()) {
            if (node instanceof Element child) {
                children.add(child);
            }
        }
        return children;
    }

    /**
     * Finds the nearest ancestor directory with the given name.
     *
     * @param start starting path
     * @param ancestorName ancestor directory name to search for
     * @return matching ancestor path when found
     */
    private Optional<Path> findAncestorNamed(Path start, String ancestorName) {
        Path current = start;
        while (current != null) {
            Path fileName = current.getFileName();
            if (fileName != null && ancestorName.equals(fileName.toString())) {
                return Optional.of(current);
            }
            current = current.getParent();
        }
        return Optional.empty();
    }
}
