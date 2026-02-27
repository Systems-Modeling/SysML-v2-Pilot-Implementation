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
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * Serialization robustness tests for partial or incomplete SysML instance graphs.
 *
 * <p>What this test covers:
 * <ul>
 * <li>round-trip persistence of dangling proxy cross-references;</li>
 * <li>save/load stability with partially initialized root elements;</li>
 * <li>save/load stability with incomplete containment relationships.</li>
 * </ul>
 */
public class SerializationRobustnessTest {

    @TempDir
    Path tempDir;

    @Test
    public void danglingProxyReferenceIsPreservedAcrossRoundTrip() throws IOException {
        var source = tempDir.resolve("dangling-proxy.xmi");
        var set = createResourceSet();
        var resource = set.createResource(URI.createFileURI(source.toString()));

        var membership = SysMLFactory.eINSTANCE.createMembership();
        membership.setElementId("membership-with-proxy");
        var proxyElement = SysMLFactory.eINSTANCE.createComment();
        URI proxyUri = URI.createURI("missing-model.xmi#//@ownedElement.0");
        ((InternalEObject) proxyElement).eSetProxyURI(proxyUri);
        membership.setMemberElement(proxyElement);
        resource.getContents().add(membership);
        resource.save(saveOptions());

        var reloadedSet = createResourceSet();
        var reloadedResource = reloadedSet.getResource(URI.createFileURI(source.toString()), true);
        var reloadedMembership = (Membership) reloadedResource.getContents().getFirst();
        var reloadedMemberElement = reloadedMembership.getMemberElement();
        var reloadedProxyUri = ((InternalEObject) reloadedMemberElement).eProxyURI();

        assertNotNull(reloadedMemberElement);
        assertTrue(reloadedMemberElement.eIsProxy());
        assertEquals(proxyUri.fragment(), reloadedProxyUri.fragment());
        assertTrue(reloadedProxyUri.trimFragment().toString().endsWith("missing-model.xmi"));
    }

    @Test
    public void partiallyInitializedMembershipRootCanBeSerializedAndReloaded() throws IOException {
        var source = tempDir.resolve("partial-membership.xmi");
        var set = createResourceSet();
        var resource = set.createResource(URI.createFileURI(source.toString()));

        var membership = SysMLFactory.eINSTANCE.createMembership();
        membership.setElementId("partial-membership");
        resource.getContents().add(membership);
        resource.save(saveOptions());

        var reloadedSet = createResourceSet();
        var reloadedResource = reloadedSet.getResource(URI.createFileURI(source.toString()), true);
        assertEquals(1, reloadedResource.getContents().size());
        var reloadedMembership = (Membership) reloadedResource.getContents().getFirst();
        assertEquals("partial-membership", reloadedMembership.getElementId());
    }

    @Test
    public void incompleteOwningMembershipContainmentCanBeSerializedAndReloaded() throws IOException {
        var source = tempDir.resolve("incomplete-owning-membership.xmi");
        var set = createResourceSet();
        var resource = set.createResource(URI.createFileURI(source.toString()));

        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owningMembership.setElementId("orphan-owning-membership");
        resource.getContents().add(owningMembership);
        resource.save(saveOptions());

        var reloadedSet = createResourceSet();
        var reloadedResource = reloadedSet.getResource(URI.createFileURI(source.toString()), true);
        assertEquals(1, reloadedResource.getContents().size());
        var reloadedOwningMembership = (OwningMembership) reloadedResource.getContents().getFirst();
        assertEquals("orphan-owning-membership", reloadedOwningMembership.getElementId());
        assertTrue(reloadedOwningMembership.getOwnedRelatedElement().isEmpty());
    }

    private ResourceSet createResourceSet() {
        var resourceSet = new ResourceSetImpl();
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
