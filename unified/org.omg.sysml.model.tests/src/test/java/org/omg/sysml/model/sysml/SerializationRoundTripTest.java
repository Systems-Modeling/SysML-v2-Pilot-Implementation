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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Serialization round-trip tests for SysML model instances.
 *
 * <p>What this test covers:
 * <ul>
 * <li>deterministic save/load/save behavior on representative SysML instance graphs;</li>
 * <li>stable XMI output across round-trips;</li>
 * <li>preservation of containment and cross-reference semantics after reload.</li>
 * </ul>
 */
public class SerializationRoundTripTest {

    @TempDir
    Path tempDir;

    @Test
    public void saveLoadSaveRoundTripIsStableForReferenceAndContainmentGraph() throws IOException {
        Path first = tempDir.resolve("fixture-first.xmi");
        Path second = tempDir.resolve("fixture-second.xmi");

        ResourceSet initialSet = createResourceSet();
        Resource initialResource = initialSet.createResource(URI.createFileURI(first.toString()));
        createFixtureGraph(initialResource);
        initialResource.save(saveOptions());

        ResourceSet reloadedSet = createResourceSet();
        Resource reloadedResource = reloadedSet.getResource(URI.createFileURI(first.toString()), true);
        assertNotNull(reloadedResource);
        assertEquals(4, reloadedResource.getContents().size(), "Unexpected number of root elements after reload");
        assertSemanticLinksAfterReload(reloadedResource);

        ResourceSet secondSet = createResourceSet();
        Resource secondResource = secondSet.getResource(URI.createFileURI(first.toString()), true);
        secondResource.setURI(URI.createFileURI(second.toString()));
        secondResource.save(saveOptions());

        String firstContent = Files.readString(first, StandardCharsets.UTF_8).replace("\r\n", "\n");
        String secondContent = Files.readString(second, StandardCharsets.UTF_8).replace("\r\n", "\n");
        assertEquals(firstContent, secondContent, "Round-trip serialization must be deterministic");
    }

    private ResourceSet createResourceSet() {
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
        resourceSet.getPackageRegistry().put(SysMLPackage.eNS_URI, SysMLPackage.eINSTANCE);
        return resourceSet;
    }

    private Map<String, Object> saveOptions() {
        Map<String, Object> options = new HashMap<>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        options.put(XMLResource.OPTION_FORMATTED, Boolean.TRUE);
        options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
        return options;
    }

    private void createFixtureGraph(Resource resource) {
        SysMLFactory factory = SysMLFactory.eINSTANCE;

        Comment commentA = factory.createComment();
        commentA.setElementId("commentA");
        commentA.setBody("Body A");
        commentA.setLocale("en");
        commentA.setDeclaredName("CommentA");

        Comment commentB = factory.createComment();
        commentB.setElementId("commentB");
        commentB.setBody("Body B");
        commentB.setLocale("en");
        commentB.setDeclaredName("CommentB");

        Comment commentNested = factory.createComment();
        commentNested.setElementId("commentNested");
        commentNested.setBody("Nested Body");
        commentNested.setLocale("fr");
        commentNested.setDeclaredShortName("CN");

        Dependency dependency = factory.createDependency();
        dependency.setElementId("dependencyAB");
        dependency.getClient().add(commentA);
        dependency.getSupplier().add(commentB);
        dependency.getOwnedRelatedElement().add(commentNested);

        Annotation annotation = factory.createAnnotation();
        annotation.setElementId("annotationOnA");
        annotation.setAnnotatedElement(commentA);

        resource.getContents().add(commentA);
        resource.getContents().add(commentB);
        resource.getContents().add(dependency);
        resource.getContents().add(annotation);
    }

    private void assertSemanticLinksAfterReload(Resource resource) {
        Comment commentA = null;
        Comment commentB = null;
        Dependency dependency = null;
        Annotation annotation = null;

        for (var root : resource.getContents()) {
            if (root instanceof Comment comment && "commentA".equals(comment.getElementId())) {
                commentA = comment;
            } else if (root instanceof Comment comment && "commentB".equals(comment.getElementId())) {
                commentB = comment;
            } else if (root instanceof Dependency dep && "dependencyAB".equals(dep.getElementId())) {
                dependency = dep;
            } else if (root instanceof Annotation ann && "annotationOnA".equals(ann.getElementId())) {
                annotation = ann;
            }
        }

        assertNotNull(commentA);
        assertNotNull(commentB);
        assertNotNull(dependency);
        assertNotNull(annotation);

        assertEquals(1, dependency.getClient().size());
        assertEquals(1, dependency.getSupplier().size());
        assertSame(commentA, dependency.getClient().getFirst());
        assertSame(commentB, dependency.getSupplier().getFirst());
        assertEquals(1, dependency.getSource().size());
        assertEquals(1, dependency.getTarget().size());
        assertSame(commentA, dependency.getSource().getFirst());
        assertSame(commentB, dependency.getTarget().getFirst());

        assertEquals(1, dependency.getOwnedRelatedElement().size());
        assertTrue(dependency.getOwnedRelatedElement().getFirst() instanceof Comment);
        assertEquals("commentNested", ((Comment) dependency.getOwnedRelatedElement().getFirst()).getElementId());

        assertSame(commentA, annotation.getAnnotatedElement());
    }
}
