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

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Mutation stability tests for core containment and opposite links.
 */
public class MutationStabilityTest {

    @Test
    public void removingRelationshipFromOwnerClearsOwningRelatedElement() {
        var owner = SysMLFactory.eINSTANCE.createPackage();
        var membership = SysMLFactory.eINSTANCE.createMembership();
        owner.getOwnedRelationship().add(membership);

        owner.getOwnedRelationship().remove(membership);

        assertNull(membership.getOwningRelatedElement());
    }

    @Test
    public void removingOwnedRelatedElementClearsOwningRelationship() {
        var relationship = SysMLFactory.eINSTANCE.createOwningMembership();
        var child = SysMLFactory.eINSTANCE.createComment();
        relationship.getOwnedRelatedElement().add(child);

        relationship.getOwnedRelatedElement().remove(child);

        assertNull(child.getOwningRelationship());
    }

    @Test
    public void reattachingRelationshipAfterDetachKeepsGraphConsistent() {
        var ownerA = SysMLFactory.eINSTANCE.createPackage();
        var ownerB = SysMLFactory.eINSTANCE.createPackage();
        var membership = SysMLFactory.eINSTANCE.createMembership();
        ownerA.getOwnedRelationship().add(membership);
        ownerA.getOwnedRelationship().remove(membership);

        ownerB.getOwnedRelationship().add(membership);

        assertSame(ownerB, membership.getOwningRelatedElement());
        assertTrue(ownerB.getOwnedRelationship().contains(membership));
    }
}
