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

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Handles generated delegate file cleanup and preservation of handwritten
 * {@code @generated NOT} method bodies.
 */
public class DelegateFileSupport {
    private final Pattern singleImportPattern = Pattern.compile("^import\\s+([a-zA-Z0-9_$.]+);$");

    /**
     * Writes generated Java content while preserving one existing {@code @generated NOT} method
     * when present.
     *
     * @param path destination file path
     * @param content full generated file content
     * @param methodName method name to preserve ({@code get} or {@code dynamicInvoke})
     * @throws IOException if reading or writing fails
     */
    public void write(Path path, String content, String methodName) throws IOException {
        String finalContent = content;
        if (Files.isRegularFile(path)) {
            String existing = Files.readString(path, StandardCharsets.UTF_8);
            Optional<String> preservedMethod = extractGeneratedNotMethod(existing, methodName);
            if (preservedMethod.isPresent()) {
                finalContent = replaceGeneratedMethod(content, methodName, preservedMethod.get());
                finalContent = mergeMissingImports(finalContent, existing);
                finalContent = mergeSupportMembers(finalContent, existing, methodName);
            }
        }
        finalContent = pruneUnusedImports(finalContent);
        finalContent = normalizeTrailingNewline(finalContent);
        Files.writeString(path, finalContent, StandardCharsets.UTF_8);
    }

    /**
     * Normalizes end-of-file newlines to exactly one trailing line separator.
     *
     * @param content Java source content
     * @return content ending with a single {@code \n}
     */
    private String normalizeTrailingNewline(String content) {
        String normalized = content.replaceAll("[\\t\\x0B\\f\\r\\n ]+\\z", "");
        return normalized + "\n";
    }

    /**
     * Removes unused single-type imports from a Java source content.
     *
     * <p>Wildcard imports are preserved. This keeps regenerated delegates clean when preserved
     * {@code @generated NOT} methods no longer require previously imported types.
     *
     * @param content Java source content
     * @return content without unused import lines
     */
    private String pruneUnusedImports(String content) {
        String[] lines = content.split("\n", -1);
        StringBuilder stripped = new StringBuilder();
        List<String> importLines = new ArrayList<>();
        for (String line : lines) {
            if (line.startsWith("import ")) {
                importLines.add(line);
            } else {
                stripped.append(line).append('\n');
            }
        }

        String nonImportContent = stripped.toString();
        var keptImports = new ArrayList<String>();
        for (String importLine : importLines) {
            String importedType = importedTypeName(importLine);
            if (importedType == null) {
                keptImports.add(importLine);
                continue;
            }
            if (nonImportContent.matches("(?s).*\\b" + java.util.regex.Pattern.quote(importedType) + "\\b.*")) {
                keptImports.add(importLine);
            }
        }

        var rebuilt = new StringBuilder();
        for (String line : lines) {
            if (!line.startsWith("import ")) {
                rebuilt.append(line).append('\n');
                continue;
            }
            if (keptImports.contains(line)) {
                rebuilt.append(line).append('\n');
            }
        }
        return rebuilt.toString();
    }

    /**
     * Extracts imported simple type name from one import line.
     *
     * @param importLine import declaration line
     * @return simple type name, or {@code null} for wildcard/invalid imports
     */
    private String importedTypeName(String importLine) {
        String trimmed = importLine.trim();
        Matcher matcher = singleImportPattern.matcher(trimmed);
        if (!matcher.matches()) {
            return null;
        }
        String fqn = matcher.group(1);
        if (fqn.endsWith(".*")) {
            return null;
        }
        int lastDot = fqn.lastIndexOf('.');
        if (lastDot < 0 || lastDot == fqn.length() - 1) {
            return null;
        }
        return fqn.substring(lastDot + 1);
    }

    /**
     * Deletes previously generated delegate files in a directory based on suffix matching.
     *
     * @param dir directory containing generated delegates
     * @param suffix generated file suffix to remove
     * @param methodName method name to protect when {@code @generated NOT} is present
     * @throws IOException if directory listing fails
     */
    public void cleanDelegateFiles(Path dir, String suffix, String methodName) throws IOException {
        if (!Files.exists(dir)) {
            return;
        }
        try (var stream = Files.list(dir)) {
            var candidates = stream.filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith(suffix))
                    .toList();
            for (Path candidate : candidates) {
                if (!isGeneratedNotProtected(candidate, methodName)) {
                    Files.delete(candidate);
                }
            }
        }
    }

    /**
     * Detects whether a delegate file contains a handwritten override protected by
     * {@code @generated NOT}.
     *
     * @param path delegate Java file
     * @param methodName overridden method name ({@code get} or {@code dynamicInvoke})
     * @return {@code true} when the file should be preserved
     */
    private boolean isGeneratedNotProtected(Path path, String methodName) {
        if (!Files.isRegularFile(path)) {
            return false;
        }
        try {
            String content = Files.readString(path, StandardCharsets.UTF_8);
            return extractGeneratedNotMethod(content, methodName).isPresent();
        } catch (IOException e) {
            throw new RuntimeException("Failed to inspect delegate file: " + path, e);
        }
    }

    /**
     * Extracts a delegate method block when it is marked with {@code @generated NOT}.
     *
     * @param content Java source content
     * @param methodName overridden method name ({@code get} or {@code dynamicInvoke})
     * @return method block to preserve, including annotations/comments
     */
    private Optional<String> extractGeneratedNotMethod(String content, String methodName) {
        int methodSignatureIndex = methodSignatureIndex(content, methodName);
        if (methodSignatureIndex < 0) {
            return Optional.empty();
        }
        int methodStart = methodBlockStart(content, methodSignatureIndex);
        int bodyStart = content.indexOf('{', methodSignatureIndex);
        if (bodyStart < 0) {
            return Optional.empty();
        }
        int bodyEnd = matchingBraceIndex(content, bodyStart);
        if (bodyEnd < 0) {
            return Optional.empty();
        }
        int end = bodyEnd + 1;
        if (end < content.length() && content.charAt(end) == '\n') {
            end++;
        }
        String methodBlock = content.substring(methodStart, end);
        if (!methodBlock.contains("@generated NOT")) {
            return Optional.empty();
        }
        return Optional.of(methodBlock);
    }

    /**
     * Replaces the generated method block in fresh content with a preserved custom method block.
     *
     * @param generatedContent newly generated Java source
     * @param methodName overridden method name ({@code get} or {@code dynamicInvoke})
     * @param preservedMethod method block to inject
     * @return merged Java source content
     */
    private String replaceGeneratedMethod(String generatedContent, String methodName, String preservedMethod) {
        int methodSignatureIndex = methodSignatureIndex(generatedContent, methodName);
        if (methodSignatureIndex < 0) {
            int classClose = generatedContent.lastIndexOf('}');
            if (classClose < 0) {
                return generatedContent;
            }
            return generatedContent.substring(0, classClose)
                    + "\n"
                    + preservedMethod
                    + generatedContent.substring(classClose);
        }
        int methodStart = methodBlockStart(generatedContent, methodSignatureIndex);
        int bodyStart = generatedContent.indexOf('{', methodSignatureIndex);
        if (bodyStart < 0) {
            return generatedContent;
        }
        int bodyEnd = matchingBraceIndex(generatedContent, bodyStart);
        if (bodyEnd < 0) {
            return generatedContent;
        }
        int methodEnd = bodyEnd + 1;
        if (methodEnd < generatedContent.length() && generatedContent.charAt(methodEnd) == '\n') {
            methodEnd++;
        }
        return generatedContent.substring(0, methodStart) + preservedMethod + generatedContent.substring(methodEnd);
    }

    /**
     * Merges import statements from existing content into newly generated content when needed.
     *
     * @param generatedContent newly generated Java source
     * @param existingContent existing Java source containing preserved logic
     * @return generated source enriched with missing imports from existing source
     */
    private String mergeMissingImports(String generatedContent, String existingContent) {
        var generatedImports = importLines(generatedContent);
        var existingImports = importLines(existingContent);

        var missingImports = new ArrayList<String>();
        for (String importLine : existingImports) {
            if (!generatedImports.contains(importLine)) {
                missingImports.add(importLine);
            }
        }
        if (missingImports.isEmpty()) {
            return generatedContent;
        }

        int lastImportStart = generatedContent.lastIndexOf("\nimport ");
        if (lastImportStart >= 0) {
            int insertAt = generatedContent.indexOf('\n', lastImportStart + 1);
            if (insertAt < 0) {
                insertAt = generatedContent.length();
            }
            return generatedContent.substring(0, insertAt + 1)
                    + String.join("\n", missingImports)
                    + "\n"
                    + generatedContent.substring(insertAt + 1);
        }

        int packageEnd = generatedContent.indexOf(';');
        if (packageEnd < 0) {
            return generatedContent;
        }
        int insertAt = packageEnd + 1;
        return generatedContent.substring(0, insertAt)
                + "\n\n"
                + String.join("\n", missingImports)
                + generatedContent.substring(insertAt);
    }

    /**
     * Extracts all import lines from a Java source content.
     *
     * @param content Java source content
     * @return import lines preserving declaration order
     */
    private List<String> importLines(String content) {
        var imports = new ArrayList<String>();
        for (String line : content.split("\n")) {
            if (line.startsWith("import ")) {
                imports.add(line);
            }
        }
        return imports;
    }

    /**
     * Merges non-method helper members around a preserved {@code @generated NOT} method.
     *
     * @param generatedContent newly generated Java source
     * @param existingContent existing Java source containing preserved logic
     * @param methodName overridden method name ({@code get} or {@code dynamicInvoke})
     * @return generated source enriched with helper members from existing source
     */
    private String mergeSupportMembers(String generatedContent, String existingContent, String methodName) {
        int existingMethodSig = methodSignatureIndex(existingContent, methodName);
        if (existingMethodSig < 0) {
            return generatedContent;
        }
        int existingMethodStart = methodBlockStart(existingContent, existingMethodSig);
        int existingBodyStart = existingContent.indexOf('{', existingMethodSig);
        int existingBodyEnd = existingBodyStart >= 0 ? matchingBraceIndex(existingContent, existingBodyStart) : -1;
        if (existingBodyEnd < 0) {
            return generatedContent;
        }
        int existingMethodEnd = existingBodyEnd + 1;
        if (existingMethodEnd < existingContent.length() && existingContent.charAt(existingMethodEnd) == '\n') {
            existingMethodEnd++;
        }

        int existingClassOpen = existingContent.indexOf('{', existingContent.indexOf("class "));
        int existingClassClose = existingContent.lastIndexOf('}');
        int generatedClassOpen = generatedContent.indexOf('{', generatedContent.indexOf("class "));
        int generatedClassClose = generatedContent.lastIndexOf('}');
        if (existingClassOpen < 0 || existingClassClose < 0 || generatedClassOpen < 0 || generatedClassClose < 0) {
            return generatedContent;
        }

        String result = generatedContent;

        String existingPrefix = existingContent.substring(existingClassOpen + 1, existingMethodStart);
        var prefixLines = new ArrayList<String>();
        for (String line : existingPrefix.split("\n")) {
            String trimmed = line.strip();
            if (trimmed.startsWith("private ") && trimmed.endsWith(";")) {
                prefixLines.add(line.stripTrailing());
            }
        }
        if (!prefixLines.isEmpty()) {
            var insert = new StringBuilder();
            for (String line : prefixLines) {
                if (!result.contains(line + "\n")) {
                    insert.append('\n').append(line).append('\n');
                }
            }
            if (!insert.isEmpty()) {
                int insertAt = result.indexOf('\n', generatedClassOpen + 1);
                if (insertAt < 0) {
                    insertAt = generatedClassOpen + 1;
                }
                result = result.substring(0, insertAt + 1) + insert + result.substring(insertAt + 1);
            }
        }

        String existingSuffix = existingContent.substring(existingMethodEnd, existingClassClose).strip();
        if (!existingSuffix.isEmpty() && !result.contains(existingSuffix)) {
            int currentClassClose = result.lastIndexOf('}');
            if (currentClassClose > 0) {
                result = result.substring(0, currentClassClose)
                        + "\n\n"
                        + existingSuffix
                        + "\n"
                        + result.substring(currentClassClose);
            }
        }
        return result;
    }

    /**
     * Finds the signature index of the generated delegate method.
     *
     * @param content Java source content
     * @param methodName overridden method name
     * @return signature index, or {@code -1} when absent
     */
    private int methodSignatureIndex(String content, String methodName) {
        if ("get".equals(methodName)) {
            return content.indexOf("protected Object get(");
        }
        if ("dynamicInvoke".equals(methodName)) {
            return content.indexOf("public Object dynamicInvoke(");
        }
        return content.indexOf(methodName + "(");
    }

    /**
     * Finds the start index of a method block, including leading annotation/comment when present.
     *
     * @param content Java source content
     * @param methodSignatureIndex index of method signature
     * @return block start index
     */
    private int methodBlockStart(String content, int methodSignatureIndex) {
        int start = methodSignatureIndex;
        int overrideLine = content.lastIndexOf("\n    @Override", methodSignatureIndex);
        if (overrideLine >= 0) {
            start = overrideLine + 1;
            int javadocLine = content.lastIndexOf("\n    /**", start);
            if (javadocLine >= 0) {
                int javadocEnd = content.indexOf("*/", javadocLine);
                if (javadocEnd >= 0 && javadocEnd < start && content.substring(javadocEnd + 2, start).isBlank()) {
                    start = javadocLine + 1;
                }
            }
        }
        return start;
    }

    /**
     * Finds the matching closing brace for a block starting at {@code openingBraceIndex}.
     *
     * @param content Java source content
     * @param openingBraceIndex index of opening brace
     * @return index of matching closing brace, or {@code -1} when not found
     */
    private int matchingBraceIndex(String content, int openingBraceIndex) {
        int depth = 0;
        for (int i = openingBraceIndex; i < content.length(); i++) {
            char ch = content.charAt(i);
            if (ch == '{') {
                depth++;
            } else if (ch == '}') {
                depth--;
                if (depth == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
