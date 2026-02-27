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
package org.omg.sysml.logic.delegate.invocation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;
import org.omg.sysml.logic.delegate.DelegateSemanticsSupport;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.MembershipImport;
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.NamespaceImport;
import org.omg.sysml.model.sysml.OwningMembership;
import org.omg.sysml.model.sysml.SysMLFactory;

/**
 * Invocation semantics tests for Relationship and Relationship-derived metaclasses.
 */
public class InvocationSemanticsRelationshipTest {

    private final DelegateSemanticsSupport semantics = new DelegateSemanticsSupport();

    @Test
    void membershipImportImportedMembershipsRule() throws Exception {
        MembershipImport membershipImport = SysMLFactory.eINSTANCE.createMembershipImport();
        var excluded = new BasicEList<Namespace>();
        assertTrue(((EList<?>) semantics.invokeInvocation("MembershipImport_importedMemberships_InvocationDelegate",
                "MembershipImport", "importedMemberships", 1, membershipImport, semantics.args(semantics.args()))).isEmpty());
        assertTrue(membershipImport.importedMemberships(excluded).isEmpty());
    }

    @Test
    void membershipIsDistinguishableFromRule() throws Exception {
        Membership membership = SysMLFactory.eINSTANCE.createMembership();
        Membership other = SysMLFactory.eINSTANCE.createMembership();
        assertTrue((Boolean) semantics.invokeInvocation("Membership_isDistinguishableFrom_InvocationDelegate",
                "Membership", "isDistinguishableFrom", 1, membership, semantics.args(other)));
        assertTrue(membership.isDistinguishableFrom(other));
    }

    @Test
    void membershipIsDistinguishableFromWithConflictingNamesRule() throws Exception {
        var membership = SysMLFactory.eINSTANCE.createMembership();
        var other = SysMLFactory.eINSTANCE.createMembership();
        membership.setMemberElement(SysMLFactory.eINSTANCE.createComment());
        other.setMemberElement(SysMLFactory.eINSTANCE.createComment());
        membership.setMemberShortName("x");
        other.setMemberName("x");
        assertFalse((Boolean) semantics.invokeInvocation("Membership_isDistinguishableFrom_InvocationDelegate",
                "Membership", "isDistinguishableFrom", 1, membership, semantics.args(other)));
        assertFalse(membership.isDistinguishableFrom(other));
    }

    @Test
    void relationshipLibraryNamespaceRule() throws Exception {
        Membership relationship = SysMLFactory.eINSTANCE.createMembership();
        assertNull(semantics.invokeInvocation("Relationship_libraryNamespace_InvocationDelegate",
                "Relationship", "libraryNamespace", 0, relationship, null));
        assertNull(relationship.libraryNamespace());
    }

    @Test
    void namespaceImportImportedMembershipsRule() throws Exception {
        NamespaceImport namespaceImport = SysMLFactory.eINSTANCE.createNamespaceImport();
        var excluded = new BasicEList<Namespace>();
        assertTrue(((EList<?>) semantics.invokeInvocation("NamespaceImport_importedMemberships_InvocationDelegate",
                "NamespaceImport", "importedMemberships", 1, namespaceImport, semantics.args(semantics.args()))).isEmpty());
        assertTrue(namespaceImport.importedMemberships(excluded).isEmpty());
    }

    @Test
    void relationshipPathRule() throws Exception {
        Membership relationship = SysMLFactory.eINSTANCE.createMembership();
        assertEquals("", semantics.invokeInvocation("Relationship_path_InvocationDelegate",
                "Relationship", "path", 0, relationship, null));
        assertEquals("", relationship.path());
    }

    @Test
    void relationshipPathWithOwningElementRule() throws Exception {
        var owner = SysMLFactory.eINSTANCE.createComment();
        var relationship = SysMLFactory.eINSTANCE.createMembership();
        owner.getOwnedRelationship().add(relationship);
        assertEquals("/1", semantics.invokeInvocation("Relationship_path_InvocationDelegate",
                "Relationship", "path", 0, relationship, null));
        assertEquals("/1", relationship.path());
    }

    @Test
    void owningMembershipPathRule() throws Exception {
        OwningMembership owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        assertEquals("", semantics.invokeInvocation("OwningMembership_path_InvocationDelegate",
                "OwningMembership", "path", 0, owningMembership, null));
        assertEquals("", owningMembership.path());
    }

    @Test
    void owningMembershipPathWithOwningElementRule() throws Exception {
        var owner = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();
        owner.getOwnedRelationship().add(owningMembership);
        assertEquals("/1", semantics.invokeInvocation("OwningMembership_path_InvocationDelegate",
                "OwningMembership", "path", 0, owningMembership, null));
        assertEquals("/1", owningMembership.path());
    }
}
