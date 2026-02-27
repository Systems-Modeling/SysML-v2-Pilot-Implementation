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
 * Additional round-trip variants for handcrafted SysML model shapes.
 */
public class SerializationRoundTripVariantsTest {

    @TempDir
    Path tempDir;

    @Test
    public void singleRootCommentRoundTripIsStable() throws IOException {
        var source = tempDir.resolve("single-root-source.xmi");
        var copy = tempDir.resolve("single-root-copy.xmi");

        var initialSet = createResourceSet();
        var initialResource = initialSet.createResource(URI.createFileURI(source.toString()));
        var comment = SysMLFactory.eINSTANCE.createComment();
        comment.setElementId("single-root");
        comment.setDeclaredName("SingleRoot");
        comment.setBody("Body");
        initialResource.getContents().add(comment);
        initialResource.save(saveOptions());

        var reloadedSet = createResourceSet();
        var reloaded = reloadedSet.getResource(URI.createFileURI(source.toString()), true);
        assertEquals(1, reloaded.getContents().size());
        assertEquals(comment.getElementId(), ((Comment) reloaded.getContents().getFirst()).getElementId());

        var secondSet = createResourceSet();
        var second = secondSet.getResource(URI.createFileURI(source.toString()), true);
        second.setURI(URI.createFileURI(copy.toString()));
        second.save(saveOptions());

        var firstContent = Files.readString(source, StandardCharsets.UTF_8).replace("\r\n", "\n");
        var secondContent = Files.readString(copy, StandardCharsets.UTF_8).replace("\r\n", "\n");
        assertEquals(firstContent, secondContent);
    }

    @Test
    public void owningMembershipContainmentRoundTripPreservesLinks() throws IOException {
        var source = tempDir.resolve("containment-source.xmi");

        var initialSet = createResourceSet();
        var initialResource = initialSet.createResource(URI.createFileURI(source.toString()));
        var owner = SysMLFactory.eINSTANCE.createPackage();
        owner.setElementId("owner");
        var relationship = SysMLFactory.eINSTANCE.createOwningMembership();
        relationship.setElementId("rel");
        var child = SysMLFactory.eINSTANCE.createComment();
        child.setElementId("child");
        owner.getOwnedRelationship().add(relationship);
        relationship.getOwnedRelatedElement().add(child);
        initialResource.getContents().add(owner);
        initialResource.save(saveOptions());

        var reloadedSet = createResourceSet();
        var reloaded = reloadedSet.getResource(URI.createFileURI(source.toString()), true);
        assertEquals(1, reloaded.getContents().size());
        var reloadedOwner = (Package) reloaded.getContents().getFirst();
        assertEquals(1, reloadedOwner.getOwnedRelationship().size());
        var reloadedRelationship = reloadedOwner.getOwnedRelationship().getFirst();
        assertNotNull(reloadedRelationship);
        assertEquals(1, reloadedRelationship.getOwnedRelatedElement().size());
        var reloadedChild = reloadedRelationship.getOwnedRelatedElement().getFirst();
        assertNotNull(reloadedChild);
        assertSame(reloadedRelationship, reloadedChild.getOwningRelationship());
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
}
