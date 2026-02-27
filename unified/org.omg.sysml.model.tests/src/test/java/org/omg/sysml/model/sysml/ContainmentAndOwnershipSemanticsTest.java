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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Semantics tests for core containment and ownership links in handcrafted SysML instances.
 *
 * <p>What it validates:
 * <ul>
 * <li>an owning membership consistently links owner, owned relationship, and owned element;</li>
 * <li>moving a contained element between owning memberships updates derived owner views;</li>
 * <li>removing a contained element clears ownership links and derived owned-element views.</li>
 * </ul>
 */
public class ContainmentAndOwnershipSemanticsTest {

    @Test
    public void owningMembershipCreatesConsistentOwnerAndOwnedElementLinks() {
        var owner = SysMLFactory.eINSTANCE.createPackage();
        var child = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();

        owningMembership.setOwningRelatedElement(owner);
        owningMembership.getOwnedRelatedElement().add(child);

        assertTrue(owner.getOwnedRelationship().contains(owningMembership));
        assertTrue(owningMembership.getOwnedRelatedElement().contains(child));
        assertSame(owningMembership, child.getOwningRelationship());
    }

    @Test
    public void movingOwnedElementBetweenOwningMembershipsUpdatesDerivedOwnership() {
        var ownerA = SysMLFactory.eINSTANCE.createPackage();
        var ownerB = SysMLFactory.eINSTANCE.createPackage();
        var child = SysMLFactory.eINSTANCE.createComment();
        var membershipA = SysMLFactory.eINSTANCE.createOwningMembership();
        var membershipB = SysMLFactory.eINSTANCE.createOwningMembership();

        membershipA.setOwningRelatedElement(ownerA);
        membershipA.getOwnedRelatedElement().add(child);
        membershipB.setOwningRelatedElement(ownerB);
        membershipB.getOwnedRelatedElement().add(child);

        assertFalse(membershipA.getOwnedRelatedElement().contains(child));
        assertTrue(membershipB.getOwnedRelatedElement().contains(child));
        assertSame(membershipB, child.getOwningRelationship());
    }

    @Test
    public void removingOwnedRelatedElementDetachesOwnership() {
        var owner = SysMLFactory.eINSTANCE.createPackage();
        var child = SysMLFactory.eINSTANCE.createComment();
        var owningMembership = SysMLFactory.eINSTANCE.createOwningMembership();

        owningMembership.setOwningRelatedElement(owner);
        owningMembership.getOwnedRelatedElement().add(child);
        owningMembership.getOwnedRelatedElement().remove(child);

        assertFalse(owningMembership.getOwnedRelatedElement().contains(child));
        assertNull(child.getOwningRelationship());
    }
}
